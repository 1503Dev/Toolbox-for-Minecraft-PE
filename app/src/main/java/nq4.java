package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.io.File;
import java.security.GeneralSecurityException;
import java.util.HashSet;

/* renamed from: nq4  reason: default package */
public final class nq4 {
    public static final Object f = new Object();
    public final Context a;
    public final SharedPreferences b;
    public final String c;
    public final vp4 d;
    public boolean e;

    public nq4(Context context, int i, vp4 vp4Var, boolean z) {
        this.e = false;
        this.a = context;
        this.c = Integer.toString(i - 1);
        this.b = context.getSharedPreferences("pcvmspf", 0);
        this.d = vp4Var;
        this.e = z;
    }

    public static String d(f22 f22Var) {
        g22 z = h22.z();
        String G = f22Var.y().G();
        z.j();
        h22.H((h22) z.Q, G);
        String F = f22Var.y().F();
        z.j();
        h22.J((h22) z.Q, F);
        long w = f22Var.y().w();
        z.j();
        h22.L((h22) z.Q, w);
        long y = f22Var.y().y();
        z.j();
        h22.I((h22) z.Q, y);
        long x = f22Var.y().x();
        z.j();
        h22.K((h22) z.Q, x);
        return ea2.f(((h22) z.h()).D());
    }

    public final boolean a(f22 f22Var) {
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (f) {
            if (!zw4.A(new File(c(f22Var.y().G()), "pcbc"), f22Var.z().g())) {
                f(currentTimeMillis, 4020);
                return false;
            }
            String d = d(f22Var);
            SharedPreferences.Editor edit = this.b.edit();
            edit.putString(e(), d);
            boolean commit = edit.commit();
            if (commit) {
                f(currentTimeMillis, 5015);
            } else {
                f(currentTimeMillis, 4021);
            }
            return commit;
        }
    }

    public final boolean b(f22 f22Var, jz1 jz1Var) {
        boolean z;
        File[] listFiles;
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (f) {
            h22 g = g(1);
            String G = f22Var.y().G();
            if (g != null && g.G().equals(G)) {
                f(currentTimeMillis, 4014);
                return false;
            }
            long currentTimeMillis2 = System.currentTimeMillis();
            File c = c(G);
            if (c.exists()) {
                String str = "1";
                if (true != c.isDirectory()) {
                    str = "0";
                }
                String str2 = "1";
                if (true != c.isFile()) {
                    str2 = "0";
                }
                String str3 = "d:" + str + ",f:" + str2;
                vp4 vp4Var = this.d;
                if (vp4Var != null) {
                    vp4Var.c(currentTimeMillis2, 4023, str3);
                }
                f(currentTimeMillis2, 4015);
            } else if (!c.mkdirs()) {
                String str4 = "1";
                if (true != c.canWrite()) {
                    str4 = "0";
                }
                String concat = "cw:".concat(str4);
                vp4 vp4Var2 = this.d;
                if (vp4Var2 != null) {
                    vp4Var2.c(currentTimeMillis2, 4024, concat);
                }
                f(currentTimeMillis2, 4015);
                return false;
            }
            File c2 = c(G);
            File file = new File(c2, "pcam.jar");
            File file2 = new File(c2, "pcbc");
            if (!zw4.A(file, f22Var.A().g())) {
                f(currentTimeMillis, 4016);
                return false;
            } else if (!zw4.A(file2, f22Var.z().g())) {
                f(currentTimeMillis, 4017);
                return false;
            } else {
                if (jz1Var != null) {
                    try {
                        ((dt4) jz1Var.Q).getClass();
                        z = dt4.k(file);
                    } catch (GeneralSecurityException unused) {
                        z = false;
                    }
                    if (!z) {
                        f(currentTimeMillis, 4018);
                        zw4.x(c2);
                        return false;
                    }
                }
                String d = d(f22Var);
                long currentTimeMillis3 = System.currentTimeMillis();
                String string = this.b.getString(e(), null);
                SharedPreferences.Editor edit = this.b.edit();
                edit.putString(e(), d);
                if (string != null) {
                    edit.putString("FBAMTD".concat(String.valueOf(this.c)), string);
                }
                if (!edit.commit()) {
                    f(currentTimeMillis3, 4019);
                    return false;
                }
                HashSet hashSet = new HashSet();
                h22 g2 = g(1);
                if (g2 != null) {
                    hashSet.add(g2.G());
                }
                h22 g3 = g(2);
                if (g3 != null) {
                    hashSet.add(g3.G());
                }
                for (File file3 : new File(this.a.getDir("pccache", 0), this.c).listFiles()) {
                    if (!hashSet.contains(file3.getName())) {
                        zw4.x(file3);
                    }
                }
                f(currentTimeMillis, 5014);
                return true;
            }
        }
    }

    public final File c(String str) {
        return new File(new File(this.a.getDir("pccache", 0), this.c), str);
    }

    public final String e() {
        return "LATMTD".concat(String.valueOf(this.c));
    }

    public final void f(long j, int i) {
        vp4 vp4Var = this.d;
        if (vp4Var != null) {
            vp4Var.a(j, i);
        }
    }

    public final h22 g(int i) {
        SharedPreferences sharedPreferences;
        String concat;
        int i2;
        ud5 a;
        if (i == 1) {
            sharedPreferences = this.b;
            concat = e();
        } else {
            sharedPreferences = this.b;
            concat = "FBAMTD".concat(String.valueOf(this.c));
        }
        String string = sharedPreferences.getString(concat, null);
        if (string == null) {
            return null;
        }
        long currentTimeMillis = System.currentTimeMillis();
        try {
            byte[] v = ea2.v(string);
            ed5 G = gd5.G(v, 0, v.length);
            if (this.e) {
                a = ud5.c;
            } else {
                a = ud5.a();
            }
            return h22.E(G, a);
        } catch (NullPointerException unused) {
            i2 = 2029;
            f(currentTimeMillis, i2);
            return null;
        } catch (RuntimeException unused2) {
            i2 = 2032;
            f(currentTimeMillis, i2);
            return null;
        } catch (te5 unused3) {
            return null;
        }
    }
}