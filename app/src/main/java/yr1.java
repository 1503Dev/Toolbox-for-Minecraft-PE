package defpackage;

import android.content.Context;
import android.util.Log;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

/* renamed from: yr1  reason: default package */
public final /* synthetic */ class yr1 implements Runnable {
    public final /* synthetic */ int P;
    public final /* synthetic */ Object Q;
    public final /* synthetic */ Object R;

    public /* synthetic */ yr1(int i, Object obj, Object obj2) {
        this.P = i;
        this.Q = obj;
        this.R = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        String str2;
        long j;
        boolean z;
        long j2;
        boolean z2;
        boolean z3 = true;
        switch (this.P) {
            case 0:
                y02 y02Var = (y02) this.Q;
                ez4 ez4Var = (ez4) this.R;
                y02Var.getClass();
                jv5 jv5Var = jv5.A;
                if (!jv5Var.m.f(y02Var.a, y02Var.d, y02Var.e)) {
                    jv5Var.m.b(y02Var.a, y02Var.d, y02Var.e);
                    return;
                } else {
                    ez4Var.execute(new fp1(0, y02Var));
                    return;
                }
            case 1:
                ((gn4) this.Q).c.m((String) this.R);
                return;
            case 2:
                bm5 bm5Var = (bm5) this.Q;
                gm5 gm5Var = (gm5) this.R;
                int i = bm5Var.y - gm5Var.c;
                bm5Var.y = i;
                if (gm5Var.d) {
                    bm5Var.z = gm5Var.e;
                    bm5Var.A = true;
                }
                if (gm5Var.f) {
                    bm5Var.B = gm5Var.g;
                }
                if (i == 0) {
                    kd3 kd3Var = gm5Var.b.a;
                    if (!bm5Var.S.a.o() && kd3Var.o()) {
                        bm5Var.T = -1;
                        bm5Var.U = 0L;
                    }
                    if (!kd3Var.o()) {
                        List asList = Arrays.asList(((nn5) kd3Var).h);
                        if (asList.size() == bm5Var.n.size()) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        tv2.I(z2);
                        for (int i2 = 0; i2 < asList.size(); i2++) {
                            ((zl5) bm5Var.n.get(i2)).b = (kd3) asList.get(i2);
                        }
                    }
                    if (bm5Var.A) {
                        if (gm5Var.b.b.equals(bm5Var.S.b) && gm5Var.b.d == bm5Var.S.r) {
                            z3 = false;
                        }
                        if (z3) {
                            if (!kd3Var.o() && !gm5Var.b.b.a()) {
                                jn5 jn5Var = gm5Var.b;
                                ov5 ov5Var = jn5Var.b;
                                j2 = jn5Var.d;
                                kd3Var.n(ov5Var.a, bm5Var.m);
                            } else {
                                j2 = gm5Var.b.d;
                            }
                            j = j2;
                            z = z3;
                        } else {
                            z = z3;
                            j = -9223372036854775807L;
                        }
                    } else {
                        j = -9223372036854775807L;
                        z = false;
                    }
                    bm5Var.A = false;
                    bm5Var.C(gm5Var.b, 1, bm5Var.B, false, z, bm5Var.z, j, -1);
                    return;
                }
                return;
            default:
                wn5 wn5Var = (wn5) this.Q;
                aw0 aw0Var = (aw0) this.R;
                String string = wn5Var.a.getSharedPreferences("app_set_id_storage", 0).getString("app_set_id", null);
                long j3 = -1;
                long j4 = wn5Var.a.getSharedPreferences("app_set_id_storage", 0).getLong("app_set_id_last_used_time", -1L);
                if (j4 != -1) {
                    j3 = 33696000000L + j4;
                }
                try {
                    if (string != null && System.currentTimeMillis() <= j3) {
                        wn5.b(wn5Var.a);
                    } else {
                        string = UUID.randomUUID().toString();
                        Context context = wn5Var.a;
                        if (!context.getSharedPreferences("app_set_id_storage", 0).edit().putString("app_set_id", string).commit()) {
                            String valueOf = String.valueOf(context.getPackageName());
                            if (valueOf.length() != 0) {
                                str2 = "Failed to store app set ID generated for App ".concat(valueOf);
                            } else {
                                str2 = new String("Failed to store app set ID generated for App ");
                            }
                            Log.e("AppSet", str2);
                            throw new qm5("Failed to store the app set ID.");
                        }
                        wn5.b(context);
                        Context context2 = wn5Var.a;
                        if (!context2.getSharedPreferences("app_set_id_storage", 0).edit().putLong("app_set_id_creation_time", System.currentTimeMillis()).commit()) {
                            String valueOf2 = String.valueOf(context2.getPackageName());
                            if (valueOf2.length() != 0) {
                                str = "Failed to store app set ID creation time for App ".concat(valueOf2);
                            } else {
                                str = new String("Failed to store app set ID creation time for App ");
                            }
                            Log.e("AppSet", str);
                            throw new qm5("Failed to store the app set ID creation time.");
                        }
                    }
                    aw0Var.a.n(new z6(string, 1));
                    return;
                } catch (qm5 e) {
                    aw0Var.a.m(e);
                    return;
                }
        }
    }
}