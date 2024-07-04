package defpackage;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.view.Surface;
import android.view.TextureView;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.net.SocketException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Iterator;

/* renamed from: wy2  reason: default package */
public final class wy2 extends sx2 implements TextureView.SurfaceTextureListener, xx2 {
    public final gy2 R;
    public final hy2 S;
    public final fy2 T;
    public rx2 U;
    public Surface V;
    public l03 W;
    public String a0;
    public String[] b0;
    public boolean c0;
    public int d0;
    public ey2 e0;
    public final boolean f0;
    public boolean g0;
    public boolean h0;
    public int i0;
    public int j0;
    public float k0;

    public wy2(Context context, fy2 fy2Var, y03 y03Var, hy2 hy2Var, boolean z) {
        super(context);
        this.d0 = 1;
        this.R = y03Var;
        this.S = hy2Var;
        this.f0 = z;
        this.T = fy2Var;
        setSurfaceTextureListener(this);
        hy2Var.a(this);
    }

    public static String E(String str, Exception exc) {
        String canonicalName = exc.getClass().getCanonicalName();
        String message = exc.getMessage();
        return str + "/" + canonicalName + ":" + message;
    }

    @Override // defpackage.sx2
    public final Integer A() {
        l03 l03Var = this.W;
        if (l03Var != null) {
            return l03Var.h0;
        }
        return null;
    }

    @Override // defpackage.sx2
    public final void B(int i) {
        l03 l03Var = this.W;
        if (l03Var != null) {
            zz2 zz2Var = l03Var.S;
            synchronized (zz2Var) {
                zz2Var.d = i * 1000;
            }
        }
    }

    @Override // defpackage.sx2
    public final void C(int i) {
        l03 l03Var = this.W;
        if (l03Var != null) {
            zz2 zz2Var = l03Var.S;
            synchronized (zz2Var) {
                zz2Var.e = i * 1000;
            }
        }
    }

    @Override // defpackage.sx2
    public final void D(int i) {
        l03 l03Var = this.W;
        if (l03Var != null) {
            zz2 zz2Var = l03Var.S;
            synchronized (zz2Var) {
                zz2Var.c = i * 1000;
            }
        }
    }

    public final void F() {
        if (this.g0) {
            return;
        }
        this.g0 = true;
        cu5.i.post(new ty2(0, this));
        k();
        hy2 hy2Var = this.S;
        if (hy2Var.i && !hy2Var.j) {
            ea2.B(hy2Var.e, hy2Var.d, "vfr2");
            hy2Var.j = true;
        }
        if (this.h0) {
            u();
        }
    }

    public final void G(boolean z, Integer num) {
        String concat;
        boolean z2;
        l03 l03Var = this.W;
        if (l03Var != null && !z) {
            l03Var.h0 = num;
        } else if (this.a0 != null && this.V != null) {
            if (z) {
                if (K()) {
                    l03Var.X.x();
                    H();
                } else {
                    concat = "No valid ExoPlayerAdapter exists when switch source.";
                    sv2.g(concat);
                    return;
                }
            }
            boolean z3 = true;
            if (this.a0.startsWith("cache:")) {
                oz2 A = this.R.A(this.a0);
                if (A instanceof wz2) {
                    wz2 wz2Var = (wz2) A;
                    synchronized (wz2Var) {
                        wz2Var.V = true;
                        wz2Var.notify();
                    }
                    l03 l03Var2 = wz2Var.S;
                    l03Var2.a0 = null;
                    wz2Var.S = null;
                    this.W = l03Var2;
                    l03Var2.h0 = num;
                    if (l03Var2.X != null) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (!z2) {
                        concat = "Precached video player has been released.";
                        sv2.g(concat);
                        return;
                    }
                } else {
                    if (A instanceof tz2) {
                        tz2 tz2Var = (tz2) A;
                        jv5.A.c.r(this.R.getContext(), this.R.k().P);
                        synchronized (tz2Var.Z) {
                            ByteBuffer byteBuffer = tz2Var.X;
                            if (byteBuffer != null && !tz2Var.Y) {
                                byteBuffer.flip();
                                tz2Var.Y = true;
                            }
                            tz2Var.U = true;
                        }
                        ByteBuffer byteBuffer2 = tz2Var.X;
                        boolean z4 = tz2Var.c0;
                        String str = tz2Var.S;
                        if (str == null) {
                            concat = "Stream cache URL is null.";
                        } else {
                            l03 l03Var3 = new l03(this.R.getContext(), this.T, this.R, num);
                            sv2.f("ExoPlayerAdapter initialized.");
                            this.W = l03Var3;
                            l03Var3.q(new Uri[]{Uri.parse(str)}, byteBuffer2, z4);
                        }
                    } else {
                        concat = "Stream cache miss: ".concat(String.valueOf(this.a0));
                    }
                    sv2.g(concat);
                    return;
                }
            } else {
                l03 l03Var4 = new l03(this.R.getContext(), this.T, this.R, num);
                sv2.f("ExoPlayerAdapter initialized.");
                this.W = l03Var4;
                jv5.A.c.r(this.R.getContext(), this.R.k().P);
                Uri[] uriArr = new Uri[this.b0.length];
                int i = 0;
                while (true) {
                    String[] strArr = this.b0;
                    if (i >= strArr.length) {
                        break;
                    }
                    uriArr[i] = Uri.parse(strArr[i]);
                    i++;
                }
                l03 l03Var5 = this.W;
                l03Var5.getClass();
                l03Var5.q(uriArr, ByteBuffer.allocate(0), false);
            }
            this.W.a0 = this;
            I(this.V);
            co5 co5Var = this.W.X;
            if (co5Var == null) {
                z3 = false;
            }
            if (z3) {
                int e = co5Var.e();
                this.d0 = e;
                if (e == 3) {
                    F();
                }
            }
        }
    }

    public final void H() {
        if (this.W != null) {
            I(null);
            l03 l03Var = this.W;
            if (l03Var != null) {
                l03Var.a0 = null;
                co5 co5Var = l03Var.X;
                if (co5Var != null) {
                    co5Var.g(l03Var);
                    l03Var.X.s();
                    l03Var.X = null;
                    yx2.Q.decrementAndGet();
                }
                this.W = null;
            }
            this.d0 = 1;
            this.c0 = false;
            this.g0 = false;
            this.h0 = false;
        }
    }

    public final void I(Surface surface) {
        l03 l03Var = this.W;
        if (l03Var != null) {
            try {
                co5 co5Var = l03Var.X;
                if (co5Var != null) {
                    co5Var.v(surface);
                    return;
                }
                return;
            } catch (IOException e) {
                sv2.h("", e);
                return;
            }
        }
        sv2.g("Trying to set surface before player is initialized.");
    }

    public final boolean J() {
        return K() && this.d0 != 1;
    }

    public final boolean K() {
        boolean z;
        l03 l03Var = this.W;
        if (l03Var != null) {
            if (l03Var.X != null) {
                z = true;
            } else {
                z = false;
            }
            if (z && !this.c0) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.xx2
    public final void a(int i) {
        l03 l03Var;
        if (this.d0 != i) {
            this.d0 = i;
            if (i != 3) {
                if (i == 4) {
                    if (this.T.a && (l03Var = this.W) != null) {
                        l03Var.r(false);
                    }
                    this.S.m = false;
                    oy2 oy2Var = this.Q;
                    oy2Var.d = false;
                    oy2Var.a();
                    cu5.i.post(new k52(1, this));
                    return;
                }
                return;
            }
            F();
        }
    }

    @Override // defpackage.sx2
    public final void b(int i) {
        l03 l03Var = this.W;
        if (l03Var != null) {
            zz2 zz2Var = l03Var.S;
            synchronized (zz2Var) {
                zz2Var.b = i * 1000;
            }
        }
    }

    @Override // defpackage.xx2
    public final void c(int i, int i2) {
        this.i0 = i;
        this.j0 = i2;
        float f = i2 > 0 ? i / i2 : 1.0f;
        if (this.k0 != f) {
            this.k0 = f;
            requestLayout();
        }
    }

    @Override // defpackage.sx2
    public final void d(int i) {
        l03 l03Var = this.W;
        if (l03Var != null) {
            Iterator it = l03Var.k0.iterator();
            while (it.hasNext()) {
                yz2 yz2Var = (yz2) ((WeakReference) it.next()).get();
                if (yz2Var != null) {
                    yz2Var.r = i;
                    Iterator it2 = yz2Var.s.iterator();
                    while (it2.hasNext()) {
                        Socket socket = (Socket) it2.next();
                        if (!socket.isClosed()) {
                            try {
                                socket.setReceiveBufferSize(yz2Var.r);
                            } catch (SocketException e) {
                                sv2.h("Failed to update receive buffer size.", e);
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // defpackage.xx2
    public final void e(final long j, final boolean z) {
        if (this.R != null) {
            zw2.e.execute(new Runnable() { // from class: uy2
                @Override // java.lang.Runnable
                public final void run() {
                    wy2 wy2Var = wy2.this;
                    boolean z2 = z;
                    wy2Var.R.Z(j, z2);
                }
            });
        }
    }

    @Override // defpackage.xx2
    public final void f(Exception exc) {
        String E = E("onLoadException", exc);
        sv2.g("ExoPlayerAdapter exception: ".concat(E));
        jv5.A.g.e("AdExoPlayerView.onException", exc);
        cu5.i.post(new ry2(0, this, E));
    }

    @Override // defpackage.sx2
    public final void g(String str, String[] strArr, Integer num) {
        if (str == null) {
            return;
        }
        boolean z = true;
        if (strArr == null) {
            this.b0 = new String[]{str};
        } else {
            this.b0 = (String[]) Arrays.copyOf(strArr, strArr.length);
        }
        String str2 = this.a0;
        z = (!this.T.k || str2 == null || str.equals(str2) || this.d0 != 4) ? false : false;
        this.a0 = str;
        G(z, num);
    }

    @Override // defpackage.sx2
    public final int h() {
        if (J()) {
            return (int) this.W.X.l();
        }
        return 0;
    }

    @Override // defpackage.sx2
    public final int i() {
        l03 l03Var = this.W;
        if (l03Var != null) {
            return l03Var.c0;
        }
        return -1;
    }

    @Override // defpackage.xx2
    public final void j(String str, Exception exc) {
        l03 l03Var;
        String E = E(str, exc);
        sv2.g("ExoPlayerAdapter error: ".concat(E));
        this.c0 = true;
        if (this.T.a && (l03Var = this.W) != null) {
            l03Var.r(false);
        }
        cu5.i.post(new nh1(1, this, E));
        jv5.A.g.e("AdExoPlayerView.onError", exc);
    }

    @Override // defpackage.sx2, defpackage.ny2
    public final void k() {
        cu5.i.post(new sy2(0, this));
    }

    @Override // defpackage.sx2
    public final int l() {
        if (J()) {
            return (int) this.W.X.p();
        }
        return 0;
    }

    @Override // defpackage.sx2
    public final int m() {
        return this.j0;
    }

    @Override // defpackage.sx2
    public final int n() {
        return this.i0;
    }

    @Override // defpackage.sx2
    public final long o() {
        l03 l03Var = this.W;
        if (l03Var != null) {
            return l03Var.t();
        }
        return -1L;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f = this.k0;
        if (f != 0.0f && this.e0 == null) {
            float f2 = measuredWidth;
            float f3 = f2 / measuredHeight;
            if (f > f3) {
                measuredHeight = (int) (f2 / f);
            }
            if (f < f3) {
                measuredWidth = (int) (measuredHeight * f);
            }
        }
        setMeasuredDimension(measuredWidth, measuredHeight);
        ey2 ey2Var = this.e0;
        if (ey2Var != null) {
            ey2Var.b(measuredWidth, measuredHeight);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        l03 l03Var;
        int i3;
        SurfaceTexture surfaceTexture2;
        if (this.f0) {
            ey2 ey2Var = new ey2(getContext());
            this.e0 = ey2Var;
            ey2Var.b0 = i;
            ey2Var.a0 = i2;
            ey2Var.d0 = surfaceTexture;
            ey2Var.start();
            ey2 ey2Var2 = this.e0;
            if (ey2Var2.d0 == null) {
                surfaceTexture2 = null;
            } else {
                try {
                    ey2Var2.i0.await();
                } catch (InterruptedException unused) {
                }
                surfaceTexture2 = ey2Var2.c0;
            }
            if (surfaceTexture2 != null) {
                surfaceTexture = surfaceTexture2;
            } else {
                this.e0.c();
                this.e0 = null;
            }
        }
        Surface surface = new Surface(surfaceTexture);
        this.V = surface;
        if (this.W == null) {
            G(false, null);
        } else {
            I(surface);
            if (!this.T.a && (l03Var = this.W) != null) {
                l03Var.r(true);
            }
        }
        int i4 = this.i0;
        float f = 1.0f;
        if (i4 != 0 && (i3 = this.j0) != 0) {
            if (i3 > 0) {
                f = i4 / i3;
            }
            if (this.k0 != f) {
                this.k0 = f;
                requestLayout();
            }
        } else {
            if (i2 > 0) {
                f = i / i2;
            }
            if (this.k0 != f) {
                this.k0 = f;
                requestLayout();
            }
        }
        cu5.i.post(new p22(1, this));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        t();
        ey2 ey2Var = this.e0;
        if (ey2Var != null) {
            ey2Var.c();
            this.e0 = null;
        }
        l03 l03Var = this.W;
        if (l03Var != null) {
            if (l03Var != null) {
                l03Var.r(false);
            }
            Surface surface = this.V;
            if (surface != null) {
                surface.release();
            }
            this.V = null;
            I(null);
        }
        cu5.i.post(new qz3(2, this));
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, final int i, final int i2) {
        ey2 ey2Var = this.e0;
        if (ey2Var != null) {
            ey2Var.b(i, i2);
        }
        cu5.i.post(new Runnable() { // from class: py2
            @Override // java.lang.Runnable
            public final void run() {
                wy2 wy2Var = wy2.this;
                int i3 = i;
                int i4 = i2;
                rx2 rx2Var = wy2Var.U;
                if (rx2Var != null) {
                    ((vx2) rx2Var).h(i3, i4);
                }
            }
        });
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.S.c(this);
        this.P.a(surfaceTexture, this.U);
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(final int i) {
        vz3.k("AdExoPlayerView3 window visibility changed to " + i);
        cu5.i.post(new Runnable() { // from class: vy2
            @Override // java.lang.Runnable
            public final void run() {
                wy2 wy2Var = wy2.this;
                int i2 = i;
                rx2 rx2Var = wy2Var.U;
                if (rx2Var != null) {
                    ((vx2) rx2Var).onWindowVisibilityChanged(i2);
                }
            }
        });
        super.onWindowVisibilityChanged(i);
    }

    @Override // defpackage.sx2
    public final long p() {
        boolean z;
        l03 l03Var = this.W;
        if (l03Var != null) {
            if (l03Var.j0 != null && l03Var.j0.o) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                return l03Var.b0;
            }
            return 0L;
        }
        return -1L;
    }

    @Override // defpackage.sx2
    public final long q() {
        l03 l03Var = this.W;
        if (l03Var != null) {
            return l03Var.p();
        }
        return -1L;
    }

    @Override // defpackage.xx2
    public final void r() {
        cu5.i.post(new bj4(1, this));
    }

    @Override // defpackage.sx2
    public final String s() {
        return "ExoPlayer/2".concat(true != this.f0 ? "" : " spherical");
    }

    @Override // defpackage.sx2
    public final void t() {
        l03 l03Var;
        if (J()) {
            if (this.T.a && (l03Var = this.W) != null) {
                l03Var.r(false);
            }
            this.W.X.u(false);
            this.S.m = false;
            oy2 oy2Var = this.Q;
            oy2Var.d = false;
            oy2Var.a();
            cu5.i.post(new fn1(2, this));
        }
    }

    @Override // defpackage.sx2
    public final void u() {
        l03 l03Var;
        if (J()) {
            if (this.T.a && (l03Var = this.W) != null) {
                l03Var.r(true);
            }
            this.W.X.u(true);
            hy2 hy2Var = this.S;
            hy2Var.m = true;
            if (hy2Var.j && !hy2Var.k) {
                ea2.B(hy2Var.e, hy2Var.d, "vfp2");
                hy2Var.k = true;
            }
            oy2 oy2Var = this.Q;
            oy2Var.d = true;
            oy2Var.a();
            this.P.c = true;
            cu5.i.post(new qy2(0, this));
            return;
        }
        this.h0 = true;
    }

    @Override // defpackage.sx2
    public final void v(int i) {
        if (J()) {
            long j = i;
            co5 co5Var = this.W.X;
            co5Var.a(co5Var.i(), j);
        }
    }

    @Override // defpackage.sx2
    public final void w(rx2 rx2Var) {
        this.U = rx2Var;
    }

    @Override // defpackage.sx2
    public final void x(String str) {
        if (str != null) {
            g(str, null, null);
        }
    }

    @Override // defpackage.sx2
    public final void y() {
        if (K()) {
            this.W.X.x();
            H();
        }
        this.S.m = false;
        oy2 oy2Var = this.Q;
        oy2Var.d = false;
        oy2Var.a();
        this.S.b();
    }

    @Override // defpackage.sx2
    public final void z(float f, float f2) {
        ey2 ey2Var = this.e0;
        if (ey2Var != null) {
            ey2Var.d(f, f2);
        }
    }
}