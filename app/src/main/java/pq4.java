package defpackage;

import android.content.Context;
import android.os.Bundle;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.security.GeneralSecurityException;
import java.util.HashMap;

/* renamed from: pq4  reason: default package */
public final class pq4 {
    public static final HashMap g = new HashMap();
    public final Context a;
    public final g02 b;
    public final dp4 c;
    public final dt4 d;
    public vj2 e;
    public final Object f = new Object();

    public pq4(Context context, g02 g02Var, dp4 dp4Var, dt4 dt4Var) {
        this.a = context;
        this.b = g02Var;
        this.c = dp4Var;
        this.d = dt4Var;
    }

    public final boolean a(fq4 fq4Var) {
        int i;
        oq4 oq4Var;
        dp4 dp4Var;
        long currentTimeMillis = System.currentTimeMillis();
        try {
            try {
                vj2 vj2Var = new vj2(b(fq4Var).getDeclaredConstructor(Context.class, String.class, byte[].class, Object.class, Bundle.class, Integer.TYPE).newInstance(this.a, "msa-r", fq4Var.a(), null, new Bundle(), 2), fq4Var, this.b, this.c);
                if (vj2Var.g()) {
                    int d = vj2Var.d();
                    if (d == 0) {
                        synchronized (this.f) {
                            vj2 vj2Var2 = this.e;
                            if (vj2Var2 != null) {
                                try {
                                    vj2Var2.f();
                                } catch (oq4 e) {
                                    this.c.c(e.P, -1L, e);
                                }
                            }
                            this.e = vj2Var;
                        }
                        this.c.d(System.currentTimeMillis() - currentTimeMillis, 3000);
                        return true;
                    }
                    throw new oq4(4001, "ci: " + d);
                }
                throw new oq4(4000, "init failed");
            } catch (Exception e2) {
                throw new oq4(2004, e2);
            }
        } catch (oq4 e3) {
            dp4 dp4Var2 = this.c;
            i = e3.P;
            dp4Var = dp4Var2;
            oq4Var = e3;
            dp4Var.c(i, System.currentTimeMillis() - currentTimeMillis, oq4Var);
            return false;
        } catch (Exception e4) {
            i = 4010;
            dp4Var = this.c;
            oq4Var = e4;
            dp4Var.c(i, System.currentTimeMillis() - currentTimeMillis, oq4Var);
            return false;
        }
    }

    public final synchronized Class b(fq4 fq4Var) {
        String G = fq4Var.a.G();
        HashMap hashMap = g;
        Class cls = (Class) hashMap.get(G);
        if (cls != null) {
            return cls;
        }
        try {
            dt4 dt4Var = this.d;
            File file = fq4Var.b;
            dt4Var.getClass();
            if (dt4.k(file)) {
                try {
                    File file2 = fq4Var.c;
                    if (!file2.exists()) {
                        file2.mkdirs();
                    }
                    Class<?> loadClass = new DexClassLoader(fq4Var.b.getAbsolutePath(), file2.getAbsolutePath(), null, this.a.getClassLoader()).loadClass("com.google.ccc.abuse.droidguard.DroidGuard");
                    hashMap.put(G, loadClass);
                    return loadClass;
                } catch (ClassNotFoundException | IllegalArgumentException | SecurityException e) {
                    throw new oq4(2008, e);
                }
            }
            throw new oq4(2026, "VM did not pass signature verification");
        } catch (GeneralSecurityException e2) {
            throw new oq4(2026, e2);
        }
    }
}