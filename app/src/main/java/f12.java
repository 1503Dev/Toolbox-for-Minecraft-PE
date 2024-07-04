package defpackage;

import android.util.Base64;
import defpackage.o3;
import java.io.IOException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: f12  reason: default package */
public final class f12 extends c22 {
    public f12(l02 l02Var, gx1 gx1Var, int i) {
        super(l02Var, "Nh+w10G1n7Da4ABjUIxN+bi57DvusNUcn9VqpF1GXimOuh+Booa8zjDH+Fzh+CdP", "2aR451s+WavC28PZAI1OicYdxdf9H8e1m2qQ6Vd7HNY=", gx1Var, i, 24);
    }

    @Override // defpackage.c22
    public final void b() {
        if (!this.a.m) {
            synchronized (this.d) {
                gx1 gx1Var = this.d;
                Method method = this.e;
                Object[] objArr = {this.a.a};
                gx1Var.j();
                ey1.d0((ey1) gx1Var.Q, (String) method.invoke(null, objArr));
            }
            return;
        }
        d();
    }

    @Override // defpackage.c22
    public final void c() {
        l02 l02Var = this.a;
        if (l02Var.p) {
            super.c();
        } else if (l02Var.m) {
            d();
        }
    }

    @Override // defpackage.c22, java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        c();
        return null;
    }

    public final void d() {
        Future future;
        l02 l02Var = this.a;
        o3 o3Var = null;
        if (l02Var.g) {
            if (l02Var.f == null && (future = l02Var.h) != null) {
                try {
                    future.get(2000L, TimeUnit.MILLISECONDS);
                    l02Var.h = null;
                } catch (InterruptedException | ExecutionException unused) {
                } catch (TimeoutException unused2) {
                    l02Var.h.cancel(true);
                }
            }
            o3Var = l02Var.f;
        }
        if (o3Var == null) {
            return;
        }
        try {
            o3.a f = o3Var.f();
            String str = f.a;
            char[] cArr = o02.a;
            if (str != null && str.matches("^[a-fA-F0-9]{8}-([a-fA-F0-9]{4}-){3}[a-fA-F0-9]{12}$")) {
                UUID fromString = UUID.fromString(str);
                byte[] bArr = new byte[16];
                ByteBuffer wrap = ByteBuffer.wrap(bArr);
                wrap.putLong(fromString.getMostSignificantBits());
                wrap.putLong(fromString.getLeastSignificantBits());
                str = Base64.encodeToString(bArr, 11);
            }
            if (str != null) {
                synchronized (this.d) {
                    gx1 gx1Var = this.d;
                    gx1Var.j();
                    ey1.d0((ey1) gx1Var.Q, str);
                    gx1 gx1Var2 = this.d;
                    boolean z = f.b;
                    gx1Var2.j();
                    ey1.e0((ey1) gx1Var2.Q, z);
                    gx1 gx1Var3 = this.d;
                    gx1Var3.j();
                    ey1.q0((ey1) gx1Var3.Q);
                }
            }
        } catch (IOException unused3) {
        }
    }
}