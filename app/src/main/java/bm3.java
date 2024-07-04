package defpackage;

import android.os.ParcelFileDescriptor;
import android.view.View;
import android.view.ViewGroup;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: bm3  reason: default package */
public final /* synthetic */ class bm3 implements Runnable {
    public final /* synthetic */ int P;
    public final /* synthetic */ Object Q;
    public final /* synthetic */ Object R;

    public /* synthetic */ bm3(int i, Object obj, Object obj2) {
        this.P = i;
        this.Q = obj;
        this.R = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View view;
        f25 f25Var;
        String str;
        String valueOf;
        int i;
        boolean z = false;
        switch (this.P) {
            case 0:
                cm3 cm3Var = (cm3) this.Q;
                ViewGroup viewGroup = (ViewGroup) this.R;
                nl3 nl3Var = cm3Var.d;
                synchronized (nl3Var) {
                    view = nl3Var.m;
                }
                if (view != null) {
                    if (viewGroup != null) {
                        z = true;
                    }
                    if (nl3Var.e() != 2 && nl3Var.e() != 1) {
                        if (nl3Var.e() == 6) {
                            cm3Var.a.j(cm3Var.b.f, z, "2");
                            f25Var = cm3Var.a;
                            str = cm3Var.b.f;
                            valueOf = "1";
                        } else {
                            return;
                        }
                    } else {
                        f25Var = cm3Var.a;
                        str = cm3Var.b.f;
                        valueOf = String.valueOf(nl3Var.e());
                    }
                    f25Var.j(str, z, valueOf);
                    return;
                }
                return;
            case 1:
                gg4 gg4Var = (gg4) this.Q;
                kz5 kz5Var = (kz5) this.R;
                synchronized (gg4Var.c) {
                    i = gg4Var.d;
                }
                lz5.b(kz5Var.a, i);
                return;
            case 2:
                InputStream inputStream = (InputStream) this.Q;
                try {
                    ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream = new ParcelFileDescriptor.AutoCloseOutputStream((ParcelFileDescriptor) this.R);
                    try {
                        gw.k(inputStream, autoCloseOutputStream, false);
                        autoCloseOutputStream.close();
                        inputStream.close();
                        return;
                    } catch (Throwable th) {
                        try {
                            autoCloseOutputStream.close();
                        } catch (Throwable th2) {
                            try {
                                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                            } catch (Exception unused) {
                            }
                        }
                        throw th;
                    }
                } catch (IOException unused2) {
                    return;
                }
            default:
                oq5 oq5Var = ((nq5) this.Q).b;
                int i2 = zn4.a;
                pp5 pp5Var = ((xl5) oq5Var).P.p;
                io5 G = pp5Var.G();
                pp5Var.D(G, 1014, new te3(3, G, (Exception) this.R));
                return;
        }
    }
}