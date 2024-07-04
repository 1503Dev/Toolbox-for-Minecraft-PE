package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException;
import com.google.android.gms.common.GooglePlayServicesMissingManifestValueException;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: jt  reason: default package */
public class jt {
    public static final int a;
    public static final jt b;

    static {
        AtomicBoolean atomicBoolean = ot.a;
        a = 12451000;
        b = new jt();
    }

    public static int a(Context context) {
        AtomicBoolean atomicBoolean = ot.a;
        try {
            return context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
            return 0;
        }
    }

    public Intent b(int i, Context context, String str) {
        if (i != 1 && i != 2) {
            if (i != 3) {
                return null;
            }
            int i2 = fv5.a;
            Uri fromParts = Uri.fromParts("package", "com.google.android.gms", null);
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(fromParts);
            return intent;
        } else if (context != null && sk.c(context)) {
            int i3 = fv5.a;
            Intent intent2 = new Intent("com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION");
            intent2.setPackage("com.google.android.wearable.app");
            return intent2;
        } else {
            StringBuilder b2 = e5.b("gcore_");
            b2.append(a);
            b2.append("-");
            if (!TextUtils.isEmpty(str)) {
                b2.append(str);
            }
            b2.append("-");
            if (context != null) {
                b2.append(context.getPackageName());
            }
            b2.append("-");
            if (context != null) {
                try {
                    b2.append(c81.a(context).b(context.getPackageName(), 0).versionCode);
                } catch (PackageManager.NameNotFoundException unused) {
                }
            }
            String sb = b2.toString();
            int i4 = fv5.a;
            Intent intent3 = new Intent("android.intent.action.VIEW");
            Uri.Builder appendQueryParameter = Uri.parse("market://details").buildUpon().appendQueryParameter("id", "com.google.android.gms");
            if (!TextUtils.isEmpty(sb)) {
                appendQueryParameter.appendQueryParameter("pcampaignid", sb);
            }
            intent3.setData(appendQueryParameter.build());
            intent3.setPackage("com.android.vending");
            intent3.addFlags(524288);
            return intent3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01d6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01d7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int c(Context context, int i) {
        boolean z;
        boolean z2;
        String str;
        String valueOf;
        String str2;
        PackageInfo packageInfo;
        int i2;
        PackageInfo packageInfo2;
        int i3;
        boolean z3;
        AtomicBoolean atomicBoolean = ot.a;
        try {
            context.getResources().getString(ti0.common_google_play_services_unknown_issue);
        } catch (Throwable unused) {
            Log.e("GooglePlayServicesUtil", "The Google Play services resources were not found. Check your project configuration to ensure that the resources are included.");
        }
        boolean z4 = true;
        if (!"com.google.android.gms".equals(context.getPackageName()) && !ot.b.get()) {
            synchronized (gq1.a) {
                if (!gq1.b) {
                    gq1.b = true;
                    try {
                        Bundle bundle = c81.a(context).a(context.getPackageName(), 128).metaData;
                        if (bundle != null) {
                            bundle.getString("com.google.app.id");
                            gq1.c = bundle.getInt("com.google.android.gms.version");
                        }
                    } catch (PackageManager.NameNotFoundException e) {
                        Log.wtf("MetadataValueReader", "This should never happen.", e);
                    }
                }
            }
            int i4 = gq1.c;
            if (i4 != 0) {
                if (i4 != 12451000) {
                    throw new GooglePlayServicesIncorrectManifestValueException(i4);
                }
            } else {
                throw new GooglePlayServicesMissingManifestValueException();
            }
        }
        if (!sk.c(context)) {
            if (sk.d == null) {
                if (!context.getPackageManager().hasSystemFeature("android.hardware.type.iot") && !context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                sk.d = Boolean.valueOf(z3);
            }
            if (!sk.d.booleanValue()) {
                z = true;
                if (i < 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!z2) {
                    String packageName = context.getPackageName();
                    PackageManager packageManager = context.getPackageManager();
                    if (z) {
                        try {
                            packageInfo = packageManager.getPackageInfo("com.android.vending", 8256);
                        } catch (PackageManager.NameNotFoundException unused2) {
                            str = "GooglePlayServicesUtil";
                            valueOf = String.valueOf(packageName);
                            str2 = " requires the Google Play Store, but it is missing.";
                        }
                    } else {
                        packageInfo = null;
                    }
                    try {
                        packageInfo2 = packageManager.getPackageInfo("com.google.android.gms", 64);
                        synchronized (pt.class) {
                            if (pt.a == null) {
                                g25 g25Var = po5.a;
                                synchronized (po5.class) {
                                    if (po5.c == null) {
                                        po5.c = context.getApplicationContext();
                                    } else {
                                        Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
                                    }
                                }
                                pt.a = new pt(context);
                            }
                        }
                    } catch (PackageManager.NameNotFoundException unused3) {
                        Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play services, but they are missing."));
                    }
                    if (!pt.b(packageInfo2)) {
                        str = "GooglePlayServicesUtil";
                        valueOf = String.valueOf(packageName);
                        str2 = " requires Google Play services, but their signature is invalid.";
                    } else {
                        if (z) {
                            uf0.f(packageInfo);
                            if (!pt.b(packageInfo)) {
                                str = "GooglePlayServicesUtil";
                                valueOf = String.valueOf(packageName);
                                str2 = " requires Google Play Store, but its signature is invalid.";
                            }
                        }
                        if (z && packageInfo != null && !packageInfo.signatures[0].equals(packageInfo2.signatures[0])) {
                            str = "GooglePlayServicesUtil";
                            valueOf = String.valueOf(packageName);
                            str2 = " requires Google Play Store, but its signature doesn't match that of Google Play services.";
                        } else {
                            int i5 = packageInfo2.versionCode;
                            int i6 = -1;
                            if (i5 == -1) {
                                i3 = -1;
                            } else {
                                i3 = i5 / 1000;
                            }
                            if (i != -1) {
                                i6 = i / 1000;
                            }
                            if (i3 < i6) {
                                StringBuilder sb = new StringBuilder(String.valueOf(packageName).length() + 82);
                                sb.append("Google Play services out of date for ");
                                sb.append(packageName);
                                sb.append(".  Requires ");
                                sb.append(i);
                                sb.append(" but found ");
                                sb.append(i5);
                                Log.w("GooglePlayServicesUtil", sb.toString());
                                i2 = 2;
                            } else {
                                ApplicationInfo applicationInfo = packageInfo2.applicationInfo;
                                if (applicationInfo == null) {
                                    try {
                                        applicationInfo = packageManager.getApplicationInfo("com.google.android.gms", 0);
                                    } catch (PackageManager.NameNotFoundException e2) {
                                        Log.wtf("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play services, but they're missing when getting application info."), e2);
                                        i2 = 1;
                                        if (i2 != 18) {
                                        }
                                        if (z4) {
                                        }
                                    }
                                }
                                if (!applicationInfo.enabled) {
                                    i2 = 3;
                                } else {
                                    i2 = 0;
                                }
                            }
                            if (i2 != 18) {
                                if (i2 == 1) {
                                    z4 = ot.a(context);
                                } else {
                                    z4 = false;
                                }
                            }
                            if (z4) {
                                return 18;
                            }
                            return i2;
                        }
                    }
                    Log.w(str, valueOf.concat(str2));
                    i2 = 9;
                    if (i2 != 18) {
                    }
                    if (z4) {
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            }
        }
        z = false;
        if (i < 0) {
        }
        if (!z2) {
        }
    }
}