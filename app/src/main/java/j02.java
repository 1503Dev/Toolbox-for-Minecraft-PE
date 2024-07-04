package defpackage;

import android.util.Log;
import dalvik.system.DexClassLoader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

/* renamed from: j02  reason: default package */
public final class j02 implements Runnable {
    public final /* synthetic */ int P;
    public final /* synthetic */ Object Q;

    public /* synthetic */ j02(int i, Object obj) {
        this.P = i;
        this.Q = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.P) {
            case 0:
                l02 l02Var = (l02) this.Q;
                l02Var.getClass();
                try {
                    if (l02Var.f == null && l02Var.i) {
                        o3 o3Var = new o3(l02Var.a, 30000L, false);
                        o3Var.d(true);
                        l02Var.f = o3Var;
                        return;
                    }
                    return;
                } catch (IOException | mt unused) {
                    l02Var.f = null;
                    return;
                }
            case 1:
                z12 z12Var = (z12) this.Q;
                try {
                    l02 l02Var2 = z12Var.a;
                    DexClassLoader dexClassLoader = l02Var2.c;
                    byte[] bArr = l02Var2.e;
                    String str = z12Var.b;
                    l02Var2.d.getClass();
                    Class<?> loadClass = dexClassLoader.loadClass(new String(xz1.b(str, bArr), "UTF-8"));
                    if (loadClass != null) {
                        l02 l02Var3 = z12Var.a;
                        byte[] bArr2 = l02Var3.e;
                        String str2 = z12Var.c;
                        l02Var3.d.getClass();
                        z12Var.d = loadClass.getMethod(new String(xz1.b(str2, bArr2), "UTF-8"), z12Var.e);
                    }
                } catch (UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException | NullPointerException | wz1 unused2) {
                } catch (Throwable th) {
                    z12Var.f.countDown();
                    throw th;
                }
                z12Var.f.countDown();
                return;
            case 2:
                ((xv3) this.Q).a();
                return;
            case 3:
                ((i74) this.Q).T.d.b.k();
                return;
            case 4:
                ((qf4) this.Q).t4(5);
                return;
            case 5:
                uq4 uq4Var = new uq4();
                Log.d("GASS", "Clearcut logging disabled");
                ((aw0) this.Q).a.n(new qq4(uq4Var));
                return;
            default:
                pp5 pp5Var = (pp5) this.Q;
                io5 B = pp5Var.B();
                pp5Var.D(B, 1028, new nt2(5, B));
                pp5Var.U.c();
                return;
        }
    }
}