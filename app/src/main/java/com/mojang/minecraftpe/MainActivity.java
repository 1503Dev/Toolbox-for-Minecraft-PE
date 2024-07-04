package com.mojang.minecraftpe;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.app.NativeActivity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.net.ConnectivityManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Debug;
import android.os.Environment;
import android.os.Handler;
import android.os.Process;
import android.os.StatFs;
import android.os.Vibrator;
import android.os.storage.StorageManager;
import android.preference.PreferenceManager;
import android.provider.MediaStore;
import android.speech.tts.TextToSpeech;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.InputDevice;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import com.mojang.minecraftpe.MainActivity;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.net.InterfaceAddress;
import java.net.NetworkInterface;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import org.fmod.FMOD;

public abstract class MainActivity extends NativeActivity {
    public static int PICK_IMAGE = 1;
    private static final int REQUEST_STORAGE = 100;
    public static WeakReference<MainActivity> currentMainActivity;
    private BatteryMonitor batteryMonitor;
    private String cachedText;
    private boolean cursorLocked;
    private HardwareInformation hwInfo;
    private CustomEditText keyboardInput;
    private boolean keyboardMultiline;
    public int lastPermissionRequestReason;
    private NetworkMonitor networkMonitor;
    private boolean showingKeyboard;
    private ThermalMonitor thermalMonitor;
    public TextToSpeech tts;
    private boolean onCreateCancelled = false;
    public boolean isPowerVR = false;
    public DateFormat dateFormat = new SimpleDateFormat();
    public int keyboardHeight = 0;
    public long pickImageCallbackId = 0;
    private final Point tmpPoint = new Point();
    private Handler fullscreenHandler = new Handler();
    private Runnable fullscreenRunnable = new Runnable() { // from class: com.mojang.minecraftpe.MainActivity.3
        @Override // java.lang.Runnable
        @TargetApi(19)
        public void run() {
            MainActivity.this.getWindow().getDecorView().setSystemUiVisibility(5894);
        }
    };
    private int kbCursorPos = 0;
    private float ttsVolume = 1.0f;
    private String lastDeviceSessionId = null;

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class CustomEditText extends EditText {
        public MainActivity activity;

        public CustomEditText(MainActivity mainActivity) {
            super(mainActivity);
            this.activity = mainActivity;
        }

        @Override // android.view.View
        public void draw(Canvas canvas) {
        }

        @Override // android.widget.TextView
        public void onEditorAction(int i) {
            if ((i & 255) != 5) {
                super.onEditorAction(i);
                return;
            }
            this.activity.nativeReturnKeyPressed();
            if (this.activity.keyboardMultiline) {
                String obj = getText().toString();
                int f = p5.f(getSelectionEnd(), 0, obj.length());
                setText(obj.substring(0, f) + "\n" + obj.substring(f));
                setSelection(f + 1);
            }
        }

        @Override // android.widget.TextView, android.view.View, android.view.KeyEvent.Callback
        public boolean onKeyDown(int i, KeyEvent keyEvent) {
            if (i == 66) {
                this.activity.nativeReturnKeyPressed();
            }
            if (i == 111) {
                this.activity.nativeBackPressed();
            }
            return super.onKeyDown(i, keyEvent);
        }

        @Override // android.widget.TextView, android.view.View
        public boolean onKeyPreIme(int i, KeyEvent keyEvent) {
            if (i == 4) {
                this.activity.hideKeyboard();
                return true;
            }
            return super.onKeyPreIme(i, keyEvent);
        }

        @Override // android.widget.TextView
        public void onSelectionChanged(int i, int i2) {
            super.onSelectionChanged(i, i2);
            MainActivity mainActivity = this.activity;
            if (mainActivity != null) {
                mainActivity.kbCursorPos = i;
            }
        }
    }

    private boolean isUsingLegacyStorageMode() {
        boolean isExternalStorageLegacy;
        if (Build.VERSION.SDK_INT >= 28) {
            isExternalStorageLegacy = Environment.isExternalStorageLegacy();
            return isExternalStorageLegacy;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$hideKeyboard$3() {
        if (this.keyboardInput == null) {
            return;
        }
        Log.d("Minecraft", "hideKeyboard");
        ((InputMethodManager) getSystemService("input_method")).hideSoftInputFromWindow(this.keyboardInput.getWindowToken(), 0);
        this.keyboardInput.setVisibility(8);
        this.showingKeyboard = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Long lambda$initializeLibHttpClient$7(long j) {
        return Long.valueOf(nativeInitializeLibHttpClient(j));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Long lambda$initializeXboxLive$6(long j, long j2) {
        return Long.valueOf(lambda$initializeXboxLiv0$5(j, j2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$runNativeCallbackOnUiThread$9(long j) {
        nativeRunNativeCallbackOnUiThread(j);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setCaretPosition$1(int i) {
        CustomEditText customEditText = this.keyboardInput;
        if (customEditText == null) {
            return;
        }
        if (i < 0 || i >= customEditText.length()) {
            i = this.keyboardInput.length();
        }
        this.keyboardInput.setSelection(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setKeepScreenOnFlag$8(boolean z) {
        if (z) {
            getWindow().addFlags(128);
        } else {
            getWindow().clearFlags(128);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setTextBoxBackend$2(String str) {
        if (this.showingKeyboard) {
            this.showingKeyboard = false;
            this.keyboardInput.setText(str);
            CustomEditText customEditText = this.keyboardInput;
            customEditText.setSelection(customEditText.getText().length());
            this.showingKeyboard = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showKeyboard$0(String str, boolean z, int i, boolean z2, boolean z3) {
        Log.d("Minecraft", "showKeyboard");
        if (this.keyboardInput == null) {
            CustomEditText customEditText = new CustomEditText(this);
            this.keyboardInput = customEditText;
            customEditText.addTextChangedListener(new TextWatcher() { // from class: com.mojang.minecraftpe.MainActivity.5
                @Override // android.text.TextWatcher
                public void afterTextChanged(Editable editable) {
                }

                @Override // android.text.TextWatcher
                public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
                }

                @Override // android.text.TextWatcher
                public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
                    if (MainActivity.this.showingKeyboard) {
                        String obj = MainActivity.this.keyboardInput.getText().toString();
                        if (obj.equals(MainActivity.this.cachedText)) {
                            return;
                        }
                        MainActivity.this.cachedText = obj;
                        MainActivity.this.nativeSetTextboxText(obj);
                    }
                }
            });
            this.keyboardInput.setFocusable(true);
            this.keyboardInput.setFocusableInTouchMode(true);
            ((ViewGroup) findViewById(16908290)).addView(this.keyboardInput, 1, 1);
        }
        this.showingKeyboard = false;
        this.keyboardInput.setText(str);
        if (z) {
            this.keyboardInput.setFilters(new InputFilter[]{new InputFilter.LengthFilter(i)});
        }
        this.keyboardMultiline = z2;
        this.keyboardInput.setInputType(z2 ? 131072 : 524288);
        if (z3) {
            CustomEditText customEditText2 = this.keyboardInput;
            customEditText2.setInputType(customEditText2.getInputType() | 2);
        }
        this.keyboardInput.setSingleLine(true);
        this.keyboardInput.setImeOptions(301989893);
        this.keyboardInput.setVisibility(0);
        CustomEditText customEditText3 = this.keyboardInput;
        customEditText3.setSelection(customEditText3.getText().length());
        this.keyboardInput.requestFocus();
        ((InputMethodManager) getSystemService("input_method")).showSoftInput(this.keyboardInput, 2);
        this.showingKeyboard = true;
        this.cachedText = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$updateTextboxText$4(String str) {
        if (this.showingKeyboard) {
            this.showingKeyboard = false;
            this.keyboardInput.setText(str);
            CustomEditText customEditText = this.keyboardInput;
            customEditText.setSelection(customEditText.getText().length());
            this.showingKeyboard = true;
        }
    }

    public static void saveScreenshot(String str, int i, int i2, int[] iArr) {
        Log.i("Minecraft/Stub", "saveScreenshot: name=" + str + " w=" + i + " h=" + i2 + " int[" + iArr.length + "]");
    }

    public void acquireMulticast() {
    }

    public void buyGame() {
        Log.w("Minecraft/Stub", "buyGame");
    }

    public long calculateAvailableDiskFreeSpace(String str) {
        Log.d("Minecraft/Stub", "calculateAvailableDiskFreeSpace: " + str);
        return new StatFs(str).getAvailableBytes();
    }

    public void cancelOnCreate() {
        this.onCreateCancelled = true;
    }

    public int checkLicense() {
        Log.d("Minecraft/Stub", "checkLicense =0");
        return 0;
    }

    public void copyFromPickedFile(String str) {
        Log.e("Yurai", "copyFromPickedFile -- unimplemented");
    }

    public void copyToPickedFile(String str) {
        Log.e("Yurai", "copyToPickedFile -- unimplemented");
    }

    public Intent createAndroidLaunchIntent() {
        return null;
    }

    public String createDeviceID() {
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
        String string = defaultSharedPreferences.getString("snooperId", "");
        if (string.isEmpty()) {
            String createUUID = createUUID();
            SharedPreferences.Editor edit = defaultSharedPreferences.edit();
            edit.putString("snooperId", createUUID);
            edit.commit();
            return createUUID;
        }
        return string;
    }

    public String createUUID() {
        return UUID.randomUUID().toString().replaceAll("-", "");
    }

    public void deviceIdCorrelationStart() {
    }

    public void disableBrazeSDK() {
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getCharacters() != null) {
            nativeTypeCharacter(keyEvent.getCharacters());
        }
        if (nativeKeyHandler(keyEvent.getKeyCode(), keyEvent.getAction())) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    public void displayDialog(int i) {
        Log.w("Minecraft/Stub", "displayDialog: " + i);
    }

    public void enableBrazeSDK() {
    }

    @Override // android.app.Activity
    public void finish() {
        super.finish();
    }

    public int getAPIVersion(String str) {
        try {
            return Build.VERSION_CODES.class.getField(str).getInt(null);
        } catch (Throwable unused) {
            return -1;
        }
    }

    public String getAccessToken() {
        String string = PreferenceManager.getDefaultSharedPreferences(this).getString("accessToken", "");
        Log.i("Minecraft", "getAccessToken: " + string);
        return string;
    }

    public long getAllocatableBytes(String str) {
        long allocatableBytes;
        if (Build.VERSION.SDK_INT >= 26) {
            try {
                StorageManager storageManager = (StorageManager) getSystemService(StorageManager.class);
                allocatableBytes = storageManager.getAllocatableBytes(i0.a(storageManager, new File(str)));
                return allocatableBytes;
            } catch (IOException unused) {
            }
        }
        return 0L;
    }

    public int getAndroidVersio0() {
        return Build.VERSION.SDK_INT;
    }

    public int getAndroidVersion() {
        return Build.VERSION.SDK_INT;
    }

    public long getAvailableMemory() {
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) getSystemService("activity")).getMemoryInfo(memoryInfo);
        return memoryInfo.availMem;
    }

    public BatteryMonitor getBatteryMonitor() {
        return this.batteryMonitor;
    }

    public String[] getBroadcastAddresses() {
        ArrayList arrayList = new ArrayList();
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                NetworkInterface nextElement = networkInterfaces.nextElement();
                if (!nextElement.isLoopback()) {
                    for (InterfaceAddress interfaceAddress : nextElement.getInterfaceAddresses()) {
                        if (interfaceAddress.getBroadcast() != null) {
                            arrayList.add(interfaceAddress.getBroadcast().toString().substring(1));
                        }
                    }
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public String getCachedDeviceId() {
        return PreferenceManager.getDefaultSharedPreferences(this).getString("deviceId", "");
    }

    public int getCaretPosition() {
        return this.kbCursorPos;
    }

    public String getClientId() {
        String string = PreferenceManager.getDefaultSharedPreferences(this).getString("clientId", "");
        Log.i("Minecraft", "getClientId: " + string);
        return string;
    }

    public int getCursorPosition() {
        return this.kbCursorPos;
    }

    public String getDateString(int i) {
        return getFormattedDateString(i);
    }

    public long getDebugMemoryInfo(String str) {
        return 0L;
    }

    public String getDeviceId() {
        return createDeviceID();
    }

    public String getDeviceModel() {
        return HardwareInformation.getDeviceModelName();
    }

    public int getDisplayHeight() {
        getWindowManager().getDefaultDisplay().getRealSize(this.tmpPoint);
        return this.tmpPoint.y;
    }

    public int getDisplayWidth() {
        getWindowManager().getDefaultDisplay().getRealSize(this.tmpPoint);
        return this.tmpPoint.x;
    }

    public String getExternalStoragePath() {
        return (isUsingLegacyStorageMode() ? Environment.getExternalStorageDirectory() : getExternalFilesDir(null)).getAbsolutePath();
    }

    public byte[] getFileDataBytes(String str) {
        byte[] bArr = new byte[16384];
        try {
            InputStream openAssetFile = openAssetFile(str);
            if (openAssetFile == null) {
                openAssetFile = new FileInputStream(str);
            }
            BufferedInputStream bufferedInputStream = new BufferedInputStream(openAssetFile, 16384);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(32768);
            while (true) {
                int read = bufferedInputStream.read(bArr);
                if (read <= 0) {
                    return byteArrayOutputStream.toByteArray();
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
        } catch (IOException unused) {
            return null;
        }
    }

    public String getFileTimestamp(int i) {
        return new SimpleDateFormat("__EEE__yyyy_MM_dd__HH_mm_ss'.txt'", Locale.getDefault()).format(new Date(i * 1000));
    }

    public String getFormattedDateString(int i) {
        return this.dateFormat.format(new Date(i * 1000));
    }

    public long getFreeMemory() {
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) getSystemService("activity")).getMemoryInfo(memoryInfo);
        return memoryInfo.availMem - memoryInfo.threshold;
    }

    public HardwareInformation getHardwareInfo() {
        return this.hwInfo;
    }

    public String[] getIPAddresses() {
        return new String[0];
    }

    public int[] getImageData(String str) {
        Bitmap bitmap;
        Log.d("Minecraft/Assets", "getImageData: " + str);
        try {
            bitmap = BitmapFactory.decodeFile(str);
        } catch (Throwable unused) {
            bitmap = null;
        }
        if (bitmap == null) {
            try {
                InputStream openAssetFile = openAssetFile(str);
                if (openAssetFile != null) {
                    bitmap = BitmapFactory.decodeStream(new BufferedInputStream(openAssetFile));
                }
            } catch (Throwable unused2) {
            }
        }
        Bitmap bitmap2 = bitmap;
        if (bitmap2 != null) {
            try {
                int[] iArr = new int[(bitmap2.getWidth() * bitmap2.getHeight()) + 2];
                iArr[0] = bitmap2.getWidth();
                int height = bitmap2.getHeight();
                iArr[1] = height;
                int i = iArr[0];
                bitmap2.getPixels(iArr, 2, i, 0, 0, i, height);
                return iArr;
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return null;
    }

    public String getInternalStoragePath() {
        return Build.VERSION.SDK_INT >= 24 ? getDataDir().getAbsolutePath() : getFilesDir().getParent();
    }

    public boolean getIsRunningInAppCenter() {
        return false;
    }

    public int getKeyFromKeyCode(int i, int i2, int i3) {
        if (i3 < 0) {
            int[] deviceIds = InputDevice.getDeviceIds();
            if (deviceIds.length == 0) {
                return 0;
            }
            i3 = deviceIds[0];
        }
        InputDevice device = InputDevice.getDevice(i3);
        if (device == null) {
            return 0;
        }
        return device.getKeyCharacterMap().get(i, i2);
    }

    public float getKeyboardHeight() {
        return this.keyboardHeight;
    }

    public String getLastDeviceSessionId() {
        if (this.lastDeviceSessionId == null) {
            this.lastDeviceSessionId = PreferenceManager.getDefaultSharedPreferences(this).getString("LastDeviceSessionId", "");
        }
        return this.lastDeviceSessionId;
    }

    public String getLegacyDeviceID() {
        return createDeviceID();
    }

    public boolean getLegacyExternalStorageDirWritable_debug() {
        return true;
    }

    public boolean getLegacyExternalStorageGameFolderReadable_debug(String str) {
        return true;
    }

    public boolean getLegacyExternalStorageGameFolderWritable_debug(String str) {
        return true;
    }

    public String getLegacyExternalStoragePath() {
        return "";
    }

    public String getLegacyExternalStoragePath(String str) {
        return "";
    }

    public boolean getLegacyExternalStorageReadable_debug() {
        return true;
    }

    public String getLegacyExternalStorage_debug() {
        return Environment.getExternalStorageDirectory().getAbsolutePath();
    }

    public String getLocale() {
        return Locale.getDefault().toString();
    }

    public long getMemoryLimit() {
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) getSystemService("activity")).getMemoryInfo(memoryInfo);
        return memoryInfo.totalMem - memoryInfo.threshold;
    }

    public float getPixelsPerMillimeter() {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        return (displayMetrics.xdpi + displayMetrics.ydpi) / 50.8f;
    }

    public int getPlatformDpi() {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        return Math.round((displayMetrics.xdpi + displayMetrics.ydpi) / 2.0f);
    }

    public String getPlatformStringVar(int i) {
        if (i == 0) {
            return Build.MODEL;
        }
        Log.w("Minecraft/Stub", "getPlatformStringVar: " + i);
        return null;
    }

    public String getProfileId() {
        String string = PreferenceManager.getDefaultSharedPreferences(this).getString("profileId", "");
        Log.i("Minecraft", "getProfileId: " + string);
        return string;
    }

    public String getProfileName() {
        String string = PreferenceManager.getDefaultSharedPreferences(this).getString("profileName", "");
        Log.i("Minecraft", "getProfileName: " + string);
        return string;
    }

    public int getScreenHeight() {
        Display defaultDisplay = getWindowManager().getDefaultDisplay();
        int min = Math.min(defaultDisplay.getWidth(), defaultDisplay.getHeight());
        Log.d("Minecraft", "getScreenHeight =" + min);
        return min;
    }

    public int getScreenWidth() {
        Display defaultDisplay = getWindowManager().getDefaultDisplay();
        int max = Math.max(defaultDisplay.getWidth(), defaultDisplay.getHeight());
        Log.d("Minecraft", "getScreenWidth =" + max);
        return max;
    }

    public String getSecureStorageKey(String str) {
        return PreferenceManager.getDefaultSharedPreferences(this).getString(str, "");
    }

    public String getTextBoxBackend() {
        return this.cachedText;
    }

    public ThermalMonitor getThermalMonitor() {
        return this.thermalMonitor;
    }

    public long getTimeFromProcessStart() {
        return 0L;
    }

    public long getTotalMemory() {
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) getSystemService("activity")).getMemoryInfo(memoryInfo);
        return memoryInfo.totalMem;
    }

    public long getUsedMemory() {
        return Debug.getNativeHeapAllocatedSize();
    }

    public int getUserInputStatus() {
        Log.w("Minecraft/Stub", "getUserInputStatus =-1");
        return -1;
    }

    public String[] getUserInputString() {
        Log.w("Minecraft/Stub", "getUserInputString =[]");
        return new String[0];
    }

    public boolean hasBuyButtonWhenInvalidLicense() {
        Log.d("Minecraft/Stub", "hasBuyButtonWhenInvalidLicense =true");
        return true;
    }

    public boolean hasHardwareChanged() {
        Log.d("Minecraft/Stub", "hasHardwareChanged =false");
        return false;
    }

    public boolean hasHardwareKeyboard() {
        return getResources().getConfiguration().keyboard == 2;
    }

    public boolean hasWriteExternalStoragePermission() {
        Object obj = cg.a;
        return checkPermission("android.permission.WRITE_EXTERNAL_STORAGE", Process.myPid(), Process.myUid()) == 0;
    }

    public void hideKeyboard() {
        runOnUiThread(new m30(0, this));
    }

    public CrashManager initializeCrashManager(String str, String str2) {
        return new CrashManager();
    }

    public void initializeCrashManager() {
    }

    public long initializeLibHttpClient(final long j) {
        FutureTask futureTask = new FutureTask(new Callable() { // from class: t30
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Long lambda$initializeLibHttpClient$7;
                lambda$initializeLibHttpClient$7 = MainActivity.this.lambda$initializeLibHttpClient$7(j);
                return lambda$initializeLibHttpClient$7;
            }
        });
        runOnUiThread(futureTask);
        try {
            return ((Long) futureTask.get()).longValue();
        } catch (Exception unused) {
            return -2147467259L;
        }
    }

    public void initializeMulticast() {
    }

    public void initializeXboxLiv0(final long j, final long j2) {
        runOnUiThread(new Runnable() { // from class: o30
            @Override // java.lang.Runnable
            public final void run() {
                MainActivity.this.lambda$initializeXboxLiv0$5(j, j2);
            }
        });
    }

    public long initializeXboxLive(final long j, final long j2) {
        FutureTask futureTask = new FutureTask(new Callable() { // from class: p30
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Long lambda$initializeXboxLive$6;
                lambda$initializeXboxLive$6 = MainActivity.this.lambda$initializeXboxLive$6(j, j2);
                return lambda$initializeXboxLive$6;
            }
        });
        runOnUiThread(futureTask);
        try {
            return ((Long) futureTask.get()).longValue();
        } catch (Exception unused) {
            return -2147467259L;
        }
    }

    public void initiateUserInput(int i) {
        Log.w("Minecraft/Stub", "initiateUserInput: " + i);
    }

    public boolean isBrazeSDKDisabled() {
        return true;
    }

    public boolean isChromebook() {
        return getPackageManager().hasSystemFeature("android.hardware.type.pc");
    }

    public int isExternalStorageLegacy_debug() {
        return -1;
    }

    public boolean isFirstSnooperStart() {
        return PreferenceManager.getDefaultSharedPreferences(this).getString("snooperId", "").isEmpty();
    }

    public boolean isMixerCreateInstalled() {
        return false;
    }

    public boolean isMulticastHeld() {
        return false;
    }

    public boolean isNetworkEnabled(boolean z) {
        return true;
    }

    public boolean isOnCreateCancelled() {
        return this.onCreateCancelled;
    }

    public boolean isOnWifi() {
        return ((ConnectivityManager) getSystemService("connectivity")).getNetworkInfo(1).isConnectedOrConnecting();
    }

    public boolean isTTSEnabled() {
        AccessibilityManager accessibilityManager = (AccessibilityManager) getSystemService("accessibility");
        return (accessibilityManager == null || !accessibilityManager.isEnabled() || accessibilityManager.getEnabledAccessibilityServiceList(1).isEmpty()) ? false : true;
    }

    public boolean isTTSInstalled() {
        AccessibilityManager accessibilityManager = (AccessibilityManager) getSystemService("accessibility");
        if (accessibilityManager == null) {
            return false;
        }
        for (AccessibilityServiceInfo accessibilityServiceInfo : accessibilityManager.getInstalledAccessibilityServiceList()) {
            if ((accessibilityServiceInfo.feedbackType & 1) != 0) {
                return true;
            }
        }
        return false;
    }

    public boolean isTablet() {
        return (getResources().getConfiguration().screenLayout & 15) == 4;
    }

    public boolean isTextToSpeechInProgress() {
        TextToSpeech textToSpeech = this.tts;
        return textToSpeech != null && textToSpeech.isSpeaking();
    }

    public boolean launchMixerCreateForBroadcast() {
        return false;
    }

    public void launchUri(String str) {
        startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
    }

    public void lockCursor() {
        setCursorLocked(true);
    }

    public native void nativeBackPressed();

    public native long nativeInitializeLibHttpClient(long j);

    /* renamed from: nativeInitializeXboxLive */
    public native long lambda$initializeXboxLiv0$5(long j, long j2);

    public native boolean nativeKeyHandler(int i, int i2);

    public native void nativeOnPickImageCanceled(long j);

    public native void nativeOnPickImageSuccess(long j, String str);

    public native void nativeRegisterThis();

    public native void nativeResize(int i, int i2);

    public native void nativeReturnKeyPressed();

    public native void nativeRunNativeCallbackOnUiThread(long j);

    public native void nativeSetTextboxText(String str);

    public native void nativeStopThis();

    public native void nativeStoragePermissionRequestResult(boolean z, int i);

    public native void nativeSuspend();

    public native void nativeTypeCharacter(String str);

    public native void nativeUnregisterThis();

    public void navigateToPlaystoreForMixerCreate() {
    }

    @Override // android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i != PICK_IMAGE) {
            super.onActivityResult(i, i2, intent);
            return;
        }
        if (intent == null || intent.getData() == null) {
            nativeOnPickImageCanceled(this.pickImageCallbackId);
        } else {
            Cursor query = getContentResolver().query(intent.getData(), new String[]{"_data"}, null, null, null);
            query.moveToFirst();
            nativeOnPickImageSuccess(this.pickImageCallbackId, query.getString(query.getColumnIndex("_data")));
        }
        this.pickImageCallbackId = 0L;
    }

    @Override // android.app.NativeActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        System.setProperty("java.net.preferIPv4Stack", "true");
        currentMainActivity = new WeakReference<>(this);
        super.onCreate(bundle);
        if (this.onCreateCancelled) {
            return;
        }
        this.hwInfo = new HardwareInformation(this);
        this.batteryMonitor = new BatteryMonitor();
        this.thermalMonitor = new ThermalMonitor();
        this.networkMonitor = new NetworkMonitor(this);
        setVolumeControlStream(3);
        try {
            nativeRegisterThis();
        } catch (UnsatisfiedLinkError unused) {
        }
        FMOD.init(this);
        getWindow().getDecorView().setSystemUiVisibility(4);
        final View rootView = findViewById(16908290).getRootView();
        rootView.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.mojang.minecraftpe.MainActivity.1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                Rect rect = new Rect();
                rootView.getWindowVisibleDisplayFrame(rect);
                MainActivity.this.keyboardHeight = rootView.getHeight() - rect.height();
                try {
                    MainActivity.this.nativeResize(rootView.getWidth(), rootView.getHeight());
                } catch (UnsatisfiedLinkError unused2) {
                }
            }
        });
        getWindow().getDecorView().setOnSystemUiVisibilityChangeListener(new View.OnSystemUiVisibilityChangeListener() { // from class: com.mojang.minecraftpe.MainActivity.2
            @Override // android.view.View.OnSystemUiVisibilityChangeListener
            public void onSystemUiVisibilityChange(int i) {
                MainActivity.this.fullscreenHandler.postDelayed(MainActivity.this.fullscreenRunnable, 500L);
            }
        });
        this.fullscreenHandler.post(this.fullscreenRunnable);
    }

    @Override // android.app.NativeActivity, android.app.Activity
    public void onDestroy() {
        currentMainActivity = null;
        if (!this.onCreateCancelled) {
            FMOD.close();
            try {
                nativeUnregisterThis();
            } catch (UnsatisfiedLinkError unused) {
            }
        }
        NetworkMonitor networkMonitor = this.networkMonitor;
        if (networkMonitor != null) {
            networkMonitor.finish();
        }
        super.onDestroy();
        if (this.onCreateCancelled) {
            return;
        }
        System.exit(0);
    }

    @Override // android.app.NativeActivity, android.app.Activity
    public void onPause() {
        if (!this.onCreateCancelled) {
            nativeSuspend();
        }
        super.onPause();
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (i == 100) {
            if (strArr.length == 1 && iArr.length == 1 && strArr[0].equals("android.permission.WRITE_EXTERNAL_STORAGE") && iArr[0] == 0) {
                nativeStoragePermissionRequestResult(true, this.lastPermissionRequestReason);
            } else {
                nativeStoragePermissionRequestResult(false, this.lastPermissionRequestReason);
            }
        }
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.NativeActivity, android.app.Activity
    public void onStop() {
        if (!this.onCreateCancelled) {
            nativeStopThis();
        }
        super.onStop();
    }

    @Override // android.app.NativeActivity, android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            this.fullscreenHandler.postDelayed(this.fullscreenRunnable, 500L);
        }
        if (this.cursorLocked) {
            lockCursor();
        }
    }

    public void openAndroidAppSettings() {
        startActivity(new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", Uri.fromParts("package", getPackageName(), null)));
    }

    public abstract InputStream openAssetFile(String str);

    public void openFile() {
        Log.e("Yurai", "openFile -- unimplemented");
    }

    public void pickImage(long j) {
        Log.i("Minecraft/Stub", "pickImage: " + j);
        this.pickImageCallbackId = j;
        startActivityForResult(new Intent("android.intent.action.PICK", MediaStore.Images.Media.EXTERNAL_CONTENT_URI), PICK_IMAGE);
    }

    public void postScreenshotToFacebook(String str, int i, int i2, int[] iArr) {
        Log.i("Minecraft/Stub", "postScreenshotTo(Evil)Facebook: name=" + str + " w=" + i + " h=" + i2 + " int[" + iArr.length + "]");
    }

    public void quit() {
        runOnUiThread(new Runnable() { // from class: com.mojang.minecraftpe.MainActivity.4
            @Override // java.lang.Runnable
            public void run() {
                MainActivity.this.finish();
            }
        });
    }

    public void releaseMulticast() {
    }

    public void requestStoragePermission(int i) {
        this.lastPermissionRequestReason = i;
        if (Build.VERSION.SDK_INT >= 23) {
            requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 100);
        }
    }

    public void runNativeCallbackOnUiThread(final long j) {
        FutureTask futureTask = new FutureTask(new Callable() { // from class: l30
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Object lambda$runNativeCallbackOnUiThread$9;
                lambda$runNativeCallbackOnUiThread$9 = MainActivity.this.lambda$runNativeCallbackOnUiThread$9(j);
                return lambda$runNativeCallbackOnUiThread$9;
            }
        });
        runOnUiThread(futureTask);
        try {
            futureTask.get();
        } catch (Exception unused) {
        }
    }

    public void saveFile(String str) {
        Log.e("Yurai", "saveFile -- unimplemented");
    }

    public void sendBrazeDialogButtonClick(int i) {
    }

    public void sendBrazeEvent(String str) {
        Log.i("Minecraft/Stub", "sendBrazeEvent: " + str);
    }

    public void sendBrazeEventWithProperty(String str, String str2, int i) {
        StringBuilder b = sd1.b("sendBrazeEvent: ", str, " ", str2, "=");
        b.append(i);
        Log.i("Minecraft/Stub", b.toString());
    }

    public void sendBrazeEventWithStringProperty(String str, String str2, String str3) {
        StringBuilder b = sd1.b("sendBrazeEvent: ", str, " ", str2, "=");
        b.append(str3);
        Log.i("Minecraft/Stub", b.toString());
    }

    public void sendBrazeToastClick() {
    }

    public void setBrazeID(String str) {
    }

    public void setCachedDeviceId(String str) {
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(this).edit();
        edit.putString("deviceId", str);
        edit.commit();
    }

    public void setCaretPosition(final int i) {
        runOnUiThread(new Runnable() { // from class: q30
            @Override // java.lang.Runnable
            public final void run() {
                MainActivity.this.lambda$setCaretPosition$1(i);
            }
        });
    }

    public void setClipboard(String str) {
        ((ClipboardManager) getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("MinecraftPE", str));
    }

    public void setCursorLocked(boolean z) {
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        this.cursorLocked = z;
        View findViewById = findViewById(16908290);
        if (z) {
            findViewById.requestPointerCapture();
        } else {
            i30.b(findViewById);
        }
    }

    public void setFileDialogCallback(long j) {
    }

    public void setIsPowerVR(boolean z) {
        this.isPowerVR = z;
    }

    public void setKeepScreenOnFlag(final boolean z) {
        runOnUiThread(new Runnable() { // from class: u30
            @Override // java.lang.Runnable
            public final void run() {
                MainActivity.this.lambda$setKeepScreenOnFlag$8(z);
            }
        });
    }

    public void setLastDeviceSessionId(String str) {
        getLastDeviceSessionId();
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(this).edit();
        edit.putString("LastDeviceSessionId", str);
        edit.commit();
    }

    public void setLastDeviceSessionInfo(String str, String str2) {
        setLastDeviceSessionId(str);
    }

    public void setLastDeviceSessionInfo(String str, String str2, String str3, String str4, String str5) {
        setLastDeviceSessionId(str);
    }

    public void setMulticastReferenceCounting(boolean z) {
    }

    public void setSecureStorageKey(String str, String str2) {
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(this).edit();
        edit.putString(str, str2);
        edit.commit();
    }

    public void setTextBoxBackend(String str) {
        runOnUiThread(new s30(0, this, str));
    }

    public void setTextToSpeechEnabled(boolean z) {
        TextToSpeech textToSpeech;
        if (!z) {
            TextToSpeech textToSpeech2 = this.tts;
            if (textToSpeech2 == null) {
                return;
            }
            textToSpeech2.stop();
            textToSpeech = null;
        } else if (this.tts != null) {
            return;
        } else {
            textToSpeech = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() { // from class: com.mojang.minecraftpe.MainActivity.6
                @Override // android.speech.tts.TextToSpeech.OnInitListener
                public void onInit(int i) {
                }
            });
        }
        this.tts = textToSpeech;
    }

    public void setVolume(float f) {
        this.ttsVolume = f;
    }

    public void share(String str) {
    }

    public void share(String str, String str2, String str3) {
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.SUBJECT", str);
        intent.putExtra("android.intent.extra.TITLE", str2);
        intent.putExtra("android.intent.extra.TEXT", str3);
        intent.setType("text/plain");
        startActivity(Intent.createChooser(intent, str2));
    }

    public void showKeyboard(String str, int i, boolean z, boolean z2) {
        showKeyboard(str, i, z, z2, false);
    }

    public void showKeyboard(final String str, final int i, final boolean z, final boolean z2, final boolean z3) {
        runOnUiThread(new Runnable() { // from class: n30
            @Override // java.lang.Runnable
            public final void run() {
                MainActivity.this.lambda$showKeyboard$0(str, z, i, z3, z2);
            }
        });
    }

    public void startPlayIntegrityCheck() {
    }

    public void startTextToSpeech(String str) {
        if (this.tts != null) {
            HashMap<String, String> hashMap = new HashMap<>();
            hashMap.put("volume", String.valueOf(this.ttsVolume));
            this.tts.speak(str, 0, hashMap);
        }
    }

    public void stopTextToSpeech() {
        TextToSpeech textToSpeech = this.tts;
        if (textToSpeech != null) {
            textToSpeech.stop();
        }
    }

    public boolean supportsSizeQuery(String str) {
        if (Build.VERSION.SDK_INT >= 26) {
            try {
                StorageManager storageManager = (StorageManager) getSystemService(StorageManager.class);
                k30.a(storageManager, i0.a(storageManager, new File(str)));
                return true;
            } catch (IOException unused) {
                return false;
            }
        }
        return false;
    }

    public void tick() {
    }

    public void trackPurchaseEvent(String str, String str2, String str3, String str4, String str5) {
    }

    public void trackPurchaseEvent(String str, String str2, String str3, String str4, String str5, String str6) {
    }

    public void trackPurchaseEvent(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
    }

    public void trackPurchaseEvent(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
    }

    public void unlockCursor() {
        setCursorLocked(false);
    }

    public boolean unpackMonoAssemblies() {
        return false;
    }

    public void updateLocalization(String str, String str2) {
        Log.d("Minecraft/Stub", "updateLocalization " + str + " " + str2);
    }

    public void updateTextboxText(String str) {
        runOnUiThread(new r30(0, this, str));
    }

    public void vibrate(int i) {
        ((Vibrator) getSystemService("vibrator")).vibrate(i);
    }
}