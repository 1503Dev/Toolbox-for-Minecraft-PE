package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.io.File;
import java.security.GeneralSecurityException;
import java.util.HashSet;

/* renamed from: gq4  reason: default package */
public final class gq4 {
    public final File a;
    public final File b;
    public final SharedPreferences c;
    public final int d;

    public gq4(Context context, int i) {
        this.c = context.getSharedPreferences("pcvmspf", 0);
        File dir = context.getDir("pccache", 0);
        zw4.p(dir, false);
        this.a = dir;
        File dir2 = context.getDir("tmppccache", 0);
        zw4.p(dir2, true);
        this.b = dir2;
        this.d = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(f22 f22Var, jz1 jz1Var) {
        boolean z;
        h22 b;
        h22 b2;
        boolean z2;
        String G = f22Var.y().G();
        byte[] g = f22Var.A().g();
        byte[] g2 = f22Var.z().g();
        if (!TextUtils.isEmpty(G) && g2 != null && g2.length != 0) {
            zw4.x(this.b);
            this.b.mkdirs();
            zw4.u(this.b, G).mkdirs();
            File q = zw4.q(G, "pcam.jar", this.b);
            if ((g == null || g.length <= 0 || zw4.A(q, g)) && zw4.A(zw4.q(G, "pcbc", this.b), g2)) {
                File q2 = zw4.q(f22Var.y().G(), "pcam.jar", this.b);
                if (q2.exists() && jz1Var != null) {
                    try {
                        ((dt4) jz1Var.Q).getClass();
                        z2 = dt4.k(q2);
                    } catch (GeneralSecurityException unused) {
                        z2 = false;
                    }
                    if (!z2) {
                        return false;
                    }
                }
                String G2 = f22Var.y().G();
                if (!TextUtils.isEmpty(G2)) {
                    File q3 = zw4.q(G2, "pcam.jar", this.b);
                    File q4 = zw4.q(G2, "pcbc", this.b);
                    File q5 = zw4.q(G2, "pcam.jar", c());
                    File q6 = zw4.q(G2, "pcbc", c());
                    if ((!q3.exists() || q3.renameTo(q5)) && q4.exists() && q4.renameTo(q6)) {
                        g22 z3 = h22.z();
                        String G3 = f22Var.y().G();
                        z3.j();
                        h22.H((h22) z3.Q, G3);
                        String F = f22Var.y().F();
                        z3.j();
                        h22.J((h22) z3.Q, F);
                        long w = f22Var.y().w();
                        z3.j();
                        h22.L((h22) z3.Q, w);
                        long y = f22Var.y().y();
                        z3.j();
                        h22.I((h22) z3.Q, y);
                        long x = f22Var.y().x();
                        z3.j();
                        h22.K((h22) z3.Q, x);
                        h22 h22Var = (h22) z3.h();
                        h22 b3 = b(1);
                        SharedPreferences.Editor edit = this.c.edit();
                        if (b3 != null && !h22Var.G().equals(b3.G())) {
                            edit.putString(k6.a("FBAMTD", this.d - 1), ea2.f(b3.D()));
                        }
                        edit.putString(k6.a("LATMTD", this.d - 1), ea2.f(h22Var.D()));
                        if (edit.commit()) {
                            z = true;
                            HashSet hashSet = new HashSet();
                            b = b(1);
                            if (b != null) {
                                hashSet.add(b.G());
                            }
                            b2 = b(2);
                            if (b2 != null) {
                                hashSet.add(b2.G());
                            }
                            for (File file : c().listFiles()) {
                                String name = file.getName();
                                if (!hashSet.contains(name)) {
                                    zw4.x(zw4.u(c(), name));
                                }
                            }
                            return z;
                        }
                    }
                }
                z = false;
                HashSet hashSet2 = new HashSet();
                b = b(1);
                if (b != null) {
                }
                b2 = b(2);
                if (b2 != null) {
                }
                while (r4 < r1) {
                }
                return z;
            }
        }
        return false;
    }

    public final h22 b(int i) {
        SharedPreferences sharedPreferences;
        String a;
        if (i == 1) {
            sharedPreferences = this.c;
            a = k6.a("LATMTD", this.d - 1);
        } else {
            sharedPreferences = this.c;
            a = k6.a("FBAMTD", this.d - 1);
        }
        String string = sharedPreferences.getString(a, null);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            byte[] v = ea2.v(string);
            h22 C = h22.C(gd5.G(v, 0, v.length));
            String G = C.G();
            File q = zw4.q(G, "pcam.jar", c());
            if (!q.exists()) {
                q = zw4.q(G, "pcam", c());
            }
            File q2 = zw4.q(G, "pcbc", c());
            if (q.exists()) {
                if (q2.exists()) {
                    return C;
                }
            }
        } catch (te5 unused) {
        }
        return null;
    }

    public final File c() {
        File file = new File(this.a, Integer.toString(this.d - 1));
        if (!file.exists()) {
            file.mkdir();
        }
        return file;
    }
}