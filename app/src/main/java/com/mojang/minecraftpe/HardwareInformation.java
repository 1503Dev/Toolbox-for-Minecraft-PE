package com.mojang.minecraftpe;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import java.util.Random;

public class HardwareInformation {
    private static final char[] HEX_CHARS = "0123456789abcdef".toCharArray();
    private Context ctx;
    private PackageManager pm;

    public HardwareInformation(Context context) {
        this.ctx = context;
        this.pm = context.getPackageManager();
    }

    private static String generateHexNumber(int i) {
        StringBuilder sb = new StringBuilder(i);
        Random random = new Random();
        for (int i2 = 0; i2 < i; i2++) {
            char[] cArr = HEX_CHARS;
            sb.append(cArr[random.nextInt(cArr.length)]);
        }
        return sb.toString();
    }

    public static String getAndroidVersio0() {
        StringBuilder b = e5.b("Android ");
        b.append(Build.VERSION.RELEASE);
        return b.toString();
    }

    public static String getBoard() {
        return Build.BOARD;
    }

    public static String getCPUFeatures() {
        return "";
    }

    public static String getCPUName() {
        return "";
    }

    public static String getCPUType() {
        return Build.VERSION.SDK_INT >= 21 ? TextUtils.join(" ", Build.SUPPORTED_ABIS) : Build.CPU_ABI;
    }

    public static String getDeviceModelName() {
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        if (str2.startsWith(str)) {
            return str2.toUpperCase();
        }
        return ij.c(str, " ", str2);
    }

    public static int getNumClusters() {
        return 1;
    }

    public static int getNumCores() {
        return 2;
    }

    public static int getPerformanceCoreCount() {
        return 1;
    }

    public static String getSerialNumber() {
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(MainActivity.currentMainActivity.get());
        String string = defaultSharedPreferences.getString("fake_hardware.serial_number", null);
        if (string == null) {
            String generateHexNumber = generateHexNumber(8);
            defaultSharedPreferences.edit().putString("fake_hardware.serial_number", generateHexNumber).apply();
            return generateHexNumber;
        }
        return string;
    }

    public static String getSoCName() {
        return "";
    }

    public String getAndroidVersion() {
        StringBuilder b = e5.b("Android ");
        b.append(Build.VERSION.RELEASE);
        return b.toString();
    }

    public String getInstallerPackageName() {
        try {
            return this.pm.getInstallerPackageName("com.mojang.minecraftpe");
        } catch (IllegalArgumentException unused) {
            return "";
        }
    }

    public boolean getIsRooted() {
        return false;
    }

    public String getSecureId() {
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this.ctx);
        String string = defaultSharedPreferences.getString("fake_hardware.secure_android_id", null);
        if (string == null) {
            String generateHexNumber = generateHexNumber(16);
            defaultSharedPreferences.edit().putString("fake_hardware.secure_android_id", generateHexNumber).apply();
            return generateHexNumber;
        }
        return string;
    }

    public int getSignaturesHashCode() {
        int i = 0;
        try {
            Signature[] signatureArr = this.pm.getPackageInfo("com.mojang.minecraftpe", 64).signatures;
            int length = signatureArr.length;
            int i2 = 0;
            while (i < length) {
                try {
                    i2 ^= signatureArr[i].hashCode();
                    i++;
                } catch (PackageManager.NameNotFoundException unused) {
                    i = i2;
                    return i;
                }
            }
            return i2;
        } catch (PackageManager.NameNotFoundException unused2) {
        }
    }
}