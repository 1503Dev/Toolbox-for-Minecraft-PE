package defpackage;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;

/* renamed from: q74  reason: default package */
public final class q74 extends ContentProvider {
    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0032 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // android.content.ContentProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void attachInfo(Context context, ProviderInfo providerInfo) {
        String str;
        Bundle bundle;
        try {
            bundle = c81.a(context).a(context.getPackageName(), 128).metaData;
        } catch (PackageManager.NameNotFoundException e) {
            e = e;
            str = "Failed to load metadata: Package name not found.";
            sv2.e(str, e);
            bundle = null;
            if (qk2.b == null) {
            }
            qk2 qk2Var = qk2.b;
            if (bundle == null) {
            }
            if (bundle != null) {
            }
            super.attachInfo(context, providerInfo);
        } catch (NullPointerException e2) {
            e = e2;
            str = "Failed to load metadata: Null pointer exception.";
            sv2.e(str, e);
            bundle = null;
            if (qk2.b == null) {
            }
            qk2 qk2Var2 = qk2.b;
            if (bundle == null) {
            }
            if (bundle != null) {
            }
            super.attachInfo(context, providerInfo);
        }
        if (qk2.b == null) {
            qk2.b = new qk2();
        }
        qk2 qk2Var22 = qk2.b;
        if (bundle == null) {
            sv2.d("Metadata was null.");
        } else {
            try {
                String str2 = (String) bundle.get("com.google.android.gms.ads.APPLICATION_ID");
                try {
                    Boolean bool = (Boolean) bundle.get("com.google.android.gms.ads.DELAY_APP_MEASUREMENT_INIT");
                    try {
                        String str3 = (String) bundle.get("com.google.android.gms.ads.INTEGRATION_MANAGER");
                        if (str2 != null) {
                            if (str2.matches("^ca-app-pub-[0-9]{16}~[0-9]{10}$")) {
                                sv2.b("Publisher provided Google AdMob App ID in manifest: ".concat(str2));
                                if ((bool == null || !bool.booleanValue()) && qk2Var22.a.compareAndSet(false, true)) {
                                    new Thread(new pk2(context, str2)).start();
                                }
                            } else {
                                throw new IllegalStateException("\n\n******************************************************************************\n* Invalid application ID. Follow instructions here:                          *\n* https://googlemobileadssdk.page.link/admob-android-update-manifest         *\n* to find your app ID.                                                       *\n* Google Ad Manager publishers should follow instructions here:              *\n* https://googlemobileadssdk.page.link/ad-manager-android-update-manifest.   *\n******************************************************************************\n\n");
                            }
                        } else if (!TextUtils.isEmpty(str3)) {
                            sv2.b("The Google Mobile Ads SDK is integrated by ".concat(String.valueOf(str3)));
                        } else {
                            throw new IllegalStateException("\n\n******************************************************************************\n* The Google Mobile Ads SDK was initialized incorrectly. AdMob publishers    *\n* should follow the instructions here:                                       *\n* https://googlemobileadssdk.page.link/admob-android-update-manifest         *\n* to add a valid App ID inside the AndroidManifest.                          *\n* Google Ad Manager publishers should follow instructions here:              *\n* https://googlemobileadssdk.page.link/ad-manager-android-update-manifest.   *\n******************************************************************************\n\n");
                        }
                    } catch (ClassCastException e3) {
                        throw new IllegalStateException("The com.google.android.gms.ads.INTEGRATION_MANAGER metadata must have a String value.", e3);
                    }
                } catch (ClassCastException e4) {
                    throw new IllegalStateException("The com.google.android.gms.ads.DELAY_APP_MEASUREMENT_INIT metadata must have a boolean value.", e4);
                }
            } catch (ClassCastException e5) {
                throw new IllegalStateException("The com.google.android.gms.ads.APPLICATION_ID metadata must have a String value.", e5);
            }
        }
        if (bundle != null) {
            boolean z = bundle.getBoolean("com.google.android.gms.ads.flag.OPTIMIZE_INITIALIZATION", false);
            boolean z2 = bundle.getBoolean("com.google.android.gms.ads.flag.OPTIMIZE_AD_LOADING", false);
            if (z) {
                sv2.b("com.google.android.gms.ads.flag.OPTIMIZE_INITIALIZATION is enabled");
            }
            if (z2) {
                sv2.b("com.google.android.gms.ads.flag.OPTIMIZE_AD_LOADING is enabled");
            }
        }
        super.attachInfo(context, providerInfo);
    }

    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        return false;
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}