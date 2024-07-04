package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.LocaleList;
import android.os.StatFs;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Callable;

/* renamed from: uc4  reason: default package */
public final class uc4 implements nc4 {
    public final ez4 a;
    public final Context b;

    public uc4(Context context, yw2 yw2Var) {
        this.a = yw2Var;
        this.b = context;
    }

    public static ResolveInfo d(PackageManager packageManager, String str) {
        return packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)), 65536);
    }

    @Override // defpackage.nc4
    public final int a() {
        return 38;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(20:1|(3:3|(2:6|4)|7)|8|(3:12|13|(16:15|16|17|18|(11:20|21|22|(3:25|(3:28|(2:31|32)(1:30)|26)|47)|48|33|(1:46)(1:37)|(1:39)(1:45)|(1:41)|42|43)|50|22|(3:25|(1:26)|47)|48|33|(1:35)|46|(0)(0)|(0)|42|43))|54|16|17|18|(0)|50|22|(0)|48|33|(0)|46|(0)(0)|(0)|42|43) */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a3 A[Catch: Exception -> 0x00bb, TRY_LEAVE, TryCatch #0 {Exception -> 0x00bb, blocks: (B:20:0x0095, B:22:0x00a3), top: B:52:0x0095 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00dc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x014c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final sc4 b() {
        String str;
        String str2;
        List<ResolveInfo> queryIntentActivities;
        boolean z;
        boolean z2;
        boolean z3;
        int i;
        PackageInfo b;
        ActivityInfo activityInfo;
        PackageInfo b2;
        PackageManager packageManager = this.b.getPackageManager();
        Locale locale = Locale.getDefault();
        ResolveInfo d = d(packageManager, "geo:0,0?q=donuts");
        ResolveInfo d2 = d(packageManager, "http://www.google.com");
        String country = locale.getCountry();
        cu5 cu5Var = jv5.A.c;
        mv2 mv2Var = n62.f.a;
        boolean i2 = mv2.i();
        boolean a = sk.a(this.b);
        boolean d3 = sk.d(this.b);
        String language = locale.getLanguage();
        ArrayList arrayList = new ArrayList();
        if (Build.VERSION.SDK_INT >= 24) {
            LocaleList localeList = LocaleList.getDefault();
            for (int i3 = 0; i3 < localeList.size(); i3++) {
                arrayList.add(localeList.get(i3).getLanguage());
            }
        }
        Context context = this.b;
        ResolveInfo d4 = d(packageManager, "market://details?id=com.google.android.gms.ads");
        if (d4 != null && (activityInfo = d4.activityInfo) != null) {
            try {
                b2 = c81.a(context).b(activityInfo.packageName, 0);
            } catch (PackageManager.NameNotFoundException unused) {
            }
            if (b2 != null) {
                str = b2.versionCode + "." + activityInfo.packageName;
                b = c81.a(this.b).b("com.android.vending", 128);
                if (b != null) {
                    str2 = b.versionCode + "." + b.packageName;
                    String str3 = Build.FINGERPRINT;
                    Context context2 = this.b;
                    String str4 = str2;
                    Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
                    ResolveInfo resolveActivity = packageManager.resolveActivity(intent, 0);
                    queryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
                    if (queryIntentActivities != null && resolveActivity != null) {
                        for (i = 0; i < queryIntentActivities.size(); i++) {
                            if (resolveActivity.activityInfo.name.equals(queryIntentActivities.get(i).activityInfo.name)) {
                                z = resolveActivity.activityInfo.packageName.equals(s45.g(context2));
                                break;
                            }
                        }
                    }
                    z = false;
                    cu5 cu5Var2 = jv5.A.c;
                    long availableBytes = new StatFs(Environment.getDataDirectory().getAbsolutePath()).getAvailableBytes() / 1024;
                    boolean z4 = true;
                    if (!((Boolean) w82.d.c.a(x92.P8)).booleanValue() && cu5.F(this.b)) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (d2 != null) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (d == null) {
                        z4 = false;
                    }
                    return new sc4(z4, z3, country, i2, a, d3, language, arrayList, str, str4, str3, z, Build.MODEL, availableBytes, z2);
                }
                str2 = null;
                String str32 = Build.FINGERPRINT;
                Context context22 = this.b;
                String str42 = str2;
                Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
                ResolveInfo resolveActivity2 = packageManager.resolveActivity(intent2, 0);
                queryIntentActivities = packageManager.queryIntentActivities(intent2, 65536);
                if (queryIntentActivities != null) {
                    while (i < queryIntentActivities.size()) {
                    }
                }
                z = false;
                cu5 cu5Var22 = jv5.A.c;
                long availableBytes2 = new StatFs(Environment.getDataDirectory().getAbsolutePath()).getAvailableBytes() / 1024;
                boolean z42 = true;
                if (!((Boolean) w82.d.c.a(x92.P8)).booleanValue()) {
                }
                z2 = false;
                if (d2 != null) {
                }
                if (d == null) {
                }
                return new sc4(z42, z3, country, i2, a, d3, language, arrayList, str, str42, str32, z, Build.MODEL, availableBytes2, z2);
            }
        }
        str = null;
        b = c81.a(this.b).b("com.android.vending", 128);
        if (b != null) {
        }
        str2 = null;
        String str322 = Build.FINGERPRINT;
        Context context222 = this.b;
        String str422 = str2;
        Intent intent22 = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
        ResolveInfo resolveActivity22 = packageManager.resolveActivity(intent22, 0);
        queryIntentActivities = packageManager.queryIntentActivities(intent22, 65536);
        if (queryIntentActivities != null) {
        }
        z = false;
        cu5 cu5Var222 = jv5.A.c;
        long availableBytes22 = new StatFs(Environment.getDataDirectory().getAbsolutePath()).getAvailableBytes() / 1024;
        boolean z422 = true;
        if (!((Boolean) w82.d.c.a(x92.P8)).booleanValue()) {
        }
        z2 = false;
        if (d2 != null) {
        }
        if (d == null) {
        }
        return new sc4(z422, z3, country, i2, a, d3, language, arrayList, str, str422, str322, z, Build.MODEL, availableBytes22, z2);
    }

    @Override // defpackage.nc4
    public final dz4 c() {
        return this.a.b(new Callable() { // from class: tc4
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return uc4.this.b();
            }
        });
    }
}