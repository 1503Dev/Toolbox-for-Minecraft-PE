package defpackage;

import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import android.util.Log;
import defpackage.ad1;
import defpackage.o3;

/* renamed from: de1  reason: default package */
public final class de1 implements Runnable {
    public final /* synthetic */ Context P;
    public final /* synthetic */ zf1 Q;
    public final /* synthetic */ he1 R;

    public de1(he1 he1Var, Context context, ad1.e.a aVar) {
        this.R = he1Var;
        this.P = context;
        this.Q = aVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x007f, code lost:
        if (android.provider.Settings.Secure.getInt(r3.getContentResolver(), "limit_ad_tracking") != 0) goto L4;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0075 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        String str;
        String str2;
        StringBuilder sb;
        String str3;
        boolean z;
        Context context;
        Context context2;
        o3.a a;
        if (ga1.T) {
            str = "00000000-0000-0000-0000-000000000000";
        } else {
            str = null;
            try {
                a = o3.a(this.P);
                str2 = a.a;
            } catch (Exception e) {
                e = e;
                str2 = null;
            } catch (NoClassDefFoundError unused) {
                str2 = null;
            } catch (NoSuchMethodError unused2) {
                str2 = null;
            }
            try {
                z = a.b;
            } catch (Exception e2) {
                e = e2;
                StringBuilder b = e5.b("Query Advertising ID failed with: ");
                b.append(Log.getStackTraceString(e));
                t1.b(0, 1, b.toString(), true);
                z = false;
                if (str2 == null) {
                    this.R.getClass();
                    context = ga1.P;
                    if (context != null) {
                    }
                    this.R.getClass();
                    context2 = ga1.P;
                    if (context2 != null) {
                    }
                    z = false;
                    str2 = str;
                }
                if (str2 == null) {
                }
                this.R.a.b(true);
            } catch (NoClassDefFoundError unused3) {
                sb = new StringBuilder();
                str3 = "Google Play Services Ads dependencies are missing.";
                sb.append(str3);
                t1.b(0, 1, sb.toString(), false);
                z = false;
                if (str2 == null) {
                }
                if (str2 == null) {
                }
                this.R.a.b(true);
            } catch (NoSuchMethodError unused4) {
                sb = new StringBuilder();
                str3 = "Google Play Services is out of date, please update to GPS 4.0+.";
                sb.append(str3);
                t1.b(0, 1, sb.toString(), false);
                z = false;
                if (str2 == null) {
                }
                if (str2 == null) {
                }
                this.R.a.b(true);
            }
            if (str2 == null && Build.MANUFACTURER.equals("Amazon")) {
                this.R.getClass();
                context = ga1.P;
                if (context != null) {
                    str = Settings.Secure.getString(context.getContentResolver(), "advertising_id");
                }
                this.R.getClass();
                context2 = ga1.P;
                if (context2 != null) {
                }
                z = false;
                str2 = str;
            }
            if (str2 == null) {
                t1.b(0, 1, "Advertising ID is not available. Collecting Android ID instead of Advertising ID.", false);
                zf1 zf1Var = this.Q;
                if (zf1Var != null) {
                    ((ad1.e.a) zf1Var).b(new Throwable("Advertising ID is not available."));
                }
            } else {
                this.R.c = str2;
                me1 me1Var = ga1.h().n().e;
                if (me1Var != null) {
                    me1Var.d.put("advertisingId", this.R.c);
                }
                he1 he1Var = this.R;
                he1Var.d = z;
                zf1 zf1Var2 = this.Q;
                if (zf1Var2 != null) {
                    ((ad1.e.a) zf1Var2).a(he1Var.c);
                }
            }
            this.R.a.b(true);
        }
        z = true;
        str2 = str;
        if (str2 == null) {
        }
        this.R.a.b(true);
    }
}