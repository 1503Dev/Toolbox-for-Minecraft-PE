package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule;

/* renamed from: re3  reason: default package */
public final class re3 extends gu3 {
    public final /* synthetic */ String T = "am";
    public final /* synthetic */ String U;
    public final /* synthetic */ Context V;
    public final /* synthetic */ Bundle W;
    public final /* synthetic */ h34 X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public re3(h34 h34Var, String str, Context context, Bundle bundle) {
        super(h34Var, true);
        this.X = h34Var;
        this.U = str;
        this.V = context;
        this.W = bundle;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:2|3|(4:6|7|8|(9:10|11|(1:13)(1:42)|14|15|16|(1:18)(3:35|(1:37)(1:39)|38)|19|(2:21|22)(7:24|(1:26)(1:34)|27|28|29|30|31)))|45|11|(0)(0)|14|15|16|(0)(0)|19|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005d, code lost:
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005e, code lost:
        r3.a(r5, true, false);
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x001d A[Catch: Exception -> 0x00ba, TRY_ENTER, TryCatch #1 {Exception -> 0x00ba, blocks: (B:3:0x0004, B:6:0x000c, B:14:0x001d, B:16:0x002c, B:17:0x0038, B:27:0x0061, B:29:0x0069, B:31:0x0073, B:35:0x0088, B:36:0x0092, B:39:0x00a1, B:38:0x009d, B:20:0x0049, B:22:0x0053, B:23:0x0056, B:26:0x005e), top: B:46:0x0004, inners: #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0049 A[Catch: a -> 0x005d, Exception -> 0x00ba, TryCatch #3 {a -> 0x005d, blocks: (B:17:0x0038, B:20:0x0049, B:22:0x0053, B:23:0x0056), top: B:49:0x0038, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0069 A[Catch: Exception -> 0x00ba, TryCatch #1 {Exception -> 0x00ba, blocks: (B:3:0x0004, B:6:0x000c, B:14:0x001d, B:16:0x002c, B:17:0x0038, B:27:0x0061, B:29:0x0069, B:31:0x0073, B:35:0x0088, B:36:0x0092, B:39:0x00a1, B:38:0x009d, B:20:0x0049, B:22:0x0053, B:23:0x0056, B:26:0x005e), top: B:46:0x0004, inners: #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0073 A[Catch: Exception -> 0x00ba, TryCatch #1 {Exception -> 0x00ba, blocks: (B:3:0x0004, B:6:0x000c, B:14:0x001d, B:16:0x002c, B:17:0x0038, B:27:0x0061, B:29:0x0069, B:31:0x0073, B:35:0x0088, B:36:0x0092, B:39:0x00a1, B:38:0x009d, B:20:0x0049, B:22:0x0053, B:23:0x0056, B:26:0x005e), top: B:46:0x0004, inners: #2, #3 }] */
    @Override // defpackage.gu3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b() {
        boolean z;
        String str;
        String str2;
        String str3;
        boolean z2;
        Context context;
        String packageName;
        IBinder b;
        ky2 ww2Var;
        boolean z3;
        try {
            String str4 = this.T;
            if (this.U != null && str4 != null) {
                try {
                    Class.forName("com.google.firebase.analytics.FirebaseAnalytics");
                    z3 = true;
                } catch (ClassNotFoundException unused) {
                    z3 = false;
                }
                if (!z3) {
                    z = true;
                    ky2 ky2Var = null;
                    if (!z) {
                        str3 = this.U;
                        str2 = this.T;
                        str = this.X.a;
                    } else {
                        str = null;
                        str2 = null;
                        str3 = null;
                    }
                    uf0.f(this.V);
                    h34 h34Var = this.X;
                    Context context2 = this.V;
                    h34Var.getClass();
                    b = DynamiteModule.c(context2, DynamiteModule.c, "com.google.android.gms.measurement.dynamite").b("com.google.android.gms.measurement.internal.AppMeasurementDynamiteService");
                    int i = nx2.P;
                    if (b == null) {
                        IInterface queryLocalInterface = b.queryLocalInterface("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
                        if (queryLocalInterface instanceof ky2) {
                            ww2Var = (ky2) queryLocalInterface;
                        } else {
                            ww2Var = new ww2(b);
                        }
                        ky2Var = ww2Var;
                    }
                    h34Var.h = ky2Var;
                    if (this.X.h != null) {
                        Log.w(this.X.a, "Failed to connect to measurement client.");
                        return;
                    }
                    int a = DynamiteModule.a(this.V, "com.google.android.gms.measurement.dynamite");
                    int d = DynamiteModule.d(this.V, "com.google.android.gms.measurement.dynamite", false);
                    int max = Math.max(a, d);
                    if (d < a) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    long j = max;
                    Bundle bundle = this.W;
                    try {
                        packageName = this.V.getResources().getResourcePackageName(ti0.common_google_play_services_unknown_issue);
                    } catch (Resources.NotFoundException unused2) {
                        packageName = context.getPackageName();
                    }
                    c53 c53Var = new c53(61000L, j, z2, str, str2, str3, bundle, packageName);
                    ky2 ky2Var2 = this.X.h;
                    uf0.f(ky2Var2);
                    ky2Var2.f1(new va0(this.V), c53Var, this.P);
                    return;
                }
            }
            z = false;
            ky2 ky2Var3 = null;
            if (!z) {
            }
            uf0.f(this.V);
            h34 h34Var2 = this.X;
            Context context22 = this.V;
            h34Var2.getClass();
            b = DynamiteModule.c(context22, DynamiteModule.c, "com.google.android.gms.measurement.dynamite").b("com.google.android.gms.measurement.internal.AppMeasurementDynamiteService");
            int i2 = nx2.P;
            if (b == null) {
            }
            h34Var2.h = ky2Var3;
            if (this.X.h != null) {
            }
        } catch (Exception e) {
            this.X.a(e, true, false);
        }
    }
}