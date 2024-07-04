package com.microsoft.xbox.idp.interop;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import defpackage.d91;
import io.mrarm.yurai.YuraiActivity;
import io.mrarm.yurai.msa.AccountManager;
import io.mrarm.yurai.msa.CompactToken;
import io.mrarm.yurai.msa.MSASingleton;
import io.mrarm.yurai.msa.SecurityScope;
import io.mrarm.yurai.msa.TokenResponse;
import io.mrarm.yurai.xbox.CLLInstance;
import io.mrarm.yurai.xbox.XboxLoginActivity;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.util.Locale;

public class Interop {
    public static final int AUTH_FLOW_CANCEL = 1;
    public static final int AUTH_FLOW_ERROR = 2;
    public static final int AUTH_FLOW_SUCCESS = 0;

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class Callback {
    }

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public interface ErrorCallback {
        void onError(int i, int i2, String str);
    }

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public interface EventInitializationCallback extends ErrorCallback {
        void onSuccess();
    }

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public interface XBLoginCallback extends ErrorCallback {
        void onLogin(long j, boolean z);
    }

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class XBLogoutCallback {
    }

    public static void ClearIntent() {
        Log.d("xbox/idp", "ClearIntent");
    }

    public static String GetLiveXTokenCallback(boolean z) {
        Log.d("xbox/idp", "GetLiveXTokenCallback");
        return get_uploader_x_token_callback(z);
    }

    public static String GetLocalStoragePath(Context context) {
        Log.d("xbox/idp", "GetLocalStoragePath");
        return context.getFilesDir().getPath();
    }

    public static String GetXTokenCallback(String str) {
        return get_supporting_x_token_callback(str);
    }

    public static void InitCLL(Context context, String str) {
        Log.d("xbox/idp", "InitCLL");
        if (d91.c == null) {
            File file = new File(context.getFilesDir(), "cll_events");
            File file2 = new File(context.getCacheDir(), "cll");
            file.mkdirs();
            file2.mkdirs();
            d91.c = new CLLInstance(str, file.getAbsolutePath(), file2.getAbsolutePath(), ((jd0) d91.a.get().o()).a);
        }
    }

    public static void InvokeAuthFlow(long j, Activity activity, boolean z) {
        InvokeAuthFlow(j, activity, z, null);
    }

    public static void InvokeAuthFlow(final long j, final Activity activity, boolean z, String str) {
        Log.d("xbox/idp", "InvokeAuthFlow");
        activity.runOnUiThread(new Runnable() { // from class: com.microsoft.xbox.idp.interop.Interop.1
            @Override // java.lang.Runnable
            public void run() {
                Activity activity2 = activity;
                long j2 = j;
                WeakReference<YuraiActivity> weakReference = d91.a;
                XboxLoginActivity.g0 = j2;
                Intent intent = new Intent(activity2, XboxLoginActivity.class);
                intent.putExtra("native_ptr", j2);
                activity2.startActivity(intent);
            }
        });
    }

    public static void InvokeBrokeredMSA(Context context, boolean z) {
        Log.d("xbox/idp", "InvokeBrokeredMSA");
    }

    public static void InvokeEventInitialization(long j, String str, EventInitializationCallback eventInitializationCallback) {
        Log.d("xbox/idp", "InvokeEventInitialization");
        invoke_event_initialization(j, str, eventInitializationCallback);
    }

    public static void InvokeLatestIntent(Activity activity, Object obj) {
        Log.d("xbox/idp", "InvokeLatestIntent");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00f5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void InvokeMSA(Context context, int i, boolean z, String str) {
        d91.a a;
        String str2;
        TokenResponse[] requestTokens;
        Log.d("xbox/idp", "InvokeMSA " + i);
        if (i == 1) {
            WeakReference<YuraiActivity> weakReference = d91.a;
            if (str != null && !str.isEmpty()) {
                MSASingleton mSASingleton = MSASingleton.getInstance(context);
                try {
                    try {
                        requestTokens = mSASingleton.getAccountManager().findAccount(str).requestTokens(mSASingleton.getLoginManager(), new SecurityScope[]{d91.b}, "android-app://com.mojang.minecraftpe.H62DKCBHJP6WXXIV7RBFOGOL4NAK4E6Y");
                    } catch (Exception e) {
                        Log.e("XboxLiveHelper", "Failed to get the token for silent sign-in");
                        e.printStackTrace();
                        d91.a("Internal error (" + e.getClass().getSimpleName() + ")", false);
                        a = d91.a.a(3, "Failed to get the token");
                    }
                } catch (AccountManager.NoSuchAccountException unused) {
                    Log.i("XboxLiveHelper", "Saved account does not exist: " + str);
                    d91.a("No such account", false);
                }
                if (requestTokens.length == 1) {
                    if (requestTokens[0].getToken() != null && (requestTokens[0].getToken() instanceof CompactToken)) {
                        d91.c.b(str);
                        d91.a("Success", true);
                        a = new d91.a("Got ticket", ((CompactToken) requestTokens[0].getToken()).getBinaryToken(), 0);
                        str2 = a.c;
                        if (str2 == null) {
                            str2 = "";
                        }
                        ticket_callback(str2, i, a.a, a.b);
                    }
                    d91.a("Failed to get token (null or not compact)", false);
                    a = d91.a.a(1, "Must show UI to acquire an account.");
                    str2 = a.c;
                    if (str2 == null) {
                    }
                    ticket_callback(str2, i, a.a, a.b);
                }
                d91.a("Failed to get token (length != 1)", false);
                throw new Exception("Failed to get token: length is " + requestTokens.length);
            }
            a = d91.a.a(1, "Must show UI to acquire an account.");
            str2 = a.c;
            if (str2 == null) {
            }
            ticket_callback(str2, i, a.a, a.b);
        } else if (i == 6) {
            CLLInstance cLLInstance = d91.c;
            if (cLLInstance != null) {
                cLLInstance.b(null);
            }
            sign_out_callback();
        }
    }

    public static void InvokeXBLogin(long j, String str, XBLoginCallback xBLoginCallback) {
        Log.d("xbox/idp", "InvokeXBLogin");
        invoke_xb_login(j, str, xBLoginCallback);
    }

    public static void InvokeXBLogout(long j, XBLogoutCallback xBLogoutCallback) {
        Log.d("xbox/idp", "InvokeXBLogout");
    }

    public static void InvokeXTokenCallback(long j, Callback callback) {
        Log.d("xbox/idp", "InvokeXTokenCallback");
    }

    public static void LogCLL(String str, String str2, String str3) {
        StringBuilder b = sd1.b("LogCLL: ", str, ", ", str2, " = ");
        b.append(str3);
        Log.d("xbox/idp", b.toString());
        CLLInstance cLLInstance = d91.c;
        if (cLLInstance != null) {
            cLLInstance.a(str, str2, str3);
        }
    }

    public static void LogTelemetrySignIn(String str, String str2) {
        Log.d("xbox/idp", "LogTelemetrySignIn: " + str + str2);
    }

    public static void NotificationRegisterCallback(String str, boolean z) {
        Log.d("xbox/idp", "NotificationRegisterCallback");
    }

    public static String ReadConfigFile(Context context) {
        YuraiActivity yuraiActivity;
        Log.d("xbox/idp", "ReadConfigFile");
        WeakReference<YuraiActivity> weakReference = d91.a;
        if (weakReference == null) {
            yuraiActivity = null;
        } else {
            yuraiActivity = weakReference.get();
        }
        if (yuraiActivity != null) {
            try {
                try {
                    InputStream inputStream = (InputStream) l7.a.invoke(yuraiActivity.getGameAssetManager(), "res/raw/xboxservices.config");
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    byte[] bArr = new byte[4096];
                    while (true) {
                        int read = inputStream.read(bArr);
                        if (read >= 0) {
                            byteArrayOutputStream.write(bArr, 0, read);
                        } else {
                            return byteArrayOutputStream.toString();
                        }
                    }
                } catch (IllegalAccessException e) {
                    e = e;
                    throw new RuntimeException(e);
                } catch (IllegalArgumentException e2) {
                    e = e2;
                    throw new RuntimeException(e);
                } catch (InvocationTargetException e3) {
                    e = e3;
                    throw new RuntimeException(e);
                }
            } catch (IOException e4) {
                throw new RuntimeException(e4);
            }
        } else {
            throw new RuntimeException("readConfigFile must be called after the game is started");
        }
    }

    public static void RegisterWithGNS(Context context) {
        Log.d("xbox/idp", "RegisterWithGNS");
    }

    public static native void auth_flow_callback(long j, int i, String str);

    public static native boolean deinitializeInterop();

    private static native void gamertag_updated_callback(String str);

    public static Context getApplicationContext() {
        YuraiActivity yuraiActivity;
        Log.d("xbox/idp", "getApplicationContext");
        WeakReference<YuraiActivity> weakReference = d91.a;
        if (weakReference == null) {
            yuraiActivity = null;
        } else {
            yuraiActivity = weakReference.get();
        }
        if (yuraiActivity == null) {
            return null;
        }
        return yuraiActivity.getApplicationContext();
    }

    public static String getLocale() {
        Log.d("xbox/idp", "getLocale");
        return Locale.getDefault().toString();
    }

    public static String getSystemProxy() {
        Log.d("xbox/idp", "getSystemProxy");
        String property = System.getProperty("http.proxyPort");
        if (property == null) {
            return "";
        }
        StringBuilder b = e5.b("http://");
        b.append(System.getProperty("http.proxyHost"));
        b.append(":");
        b.append(property);
        String sb = b.toString();
        Log.d("xbox/idp", "getSystemProxy returning " + sb);
        return sb;
    }

    public static native String get_supporting_x_token_callback(String str);

    private static native String get_title_telemetry_device_id();

    private static native String get_title_telemetry_session_id();

    public static native String get_uploader_x_token_callback(boolean z);

    public static native boolean initializeInterop(Context context);

    private static native void invoke_event_initialization(long j, String str, EventInitializationCallback eventInitializationCallback);

    private static native void invoke_x_token_acquisition(long j, Callback callback);

    private static native void invoke_xb_login(long j, String str, XBLoginCallback xBLoginCallback);

    private static native void invoke_xb_logout(long j, XBLogoutCallback xBLogoutCallback);

    private static native void notificiation_registration_callback(String str, boolean z);

    private static native void sign_out_callback();

    private static native void ticket_callback(String str, int i, int i2, String str2);
}