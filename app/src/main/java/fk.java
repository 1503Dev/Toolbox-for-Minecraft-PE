package defpackage;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.util.Log;
import defpackage.l4;
import java.lang.reflect.InvocationTargetException;
import org.json.JSONObject;

/* renamed from: fk  reason: default package */
public final class fk implements rk0, px, h23, i52, wy4, fc5 {
    public final /* synthetic */ int P;
    public Object Q;

    public fk(int i) {
        Handler handler;
        Handler handler2;
        this.P = i;
        if (i != 1) {
            Looper mainLooper = Looper.getMainLooper();
            if (Build.VERSION.SDK_INT >= 28) {
                handler2 = gk.a(mainLooper);
            } else {
                try {
                    handler = (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(mainLooper, null, Boolean.TRUE);
                } catch (IllegalAccessException e) {
                    e = e;
                    Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
                    handler = new Handler(mainLooper);
                    handler2 = handler;
                    this.Q = handler2;
                } catch (InstantiationException e2) {
                    e = e2;
                    Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
                    handler = new Handler(mainLooper);
                    handler2 = handler;
                    this.Q = handler2;
                } catch (NoSuchMethodException e3) {
                    e = e3;
                    Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
                    handler = new Handler(mainLooper);
                    handler2 = handler;
                    this.Q = handler2;
                } catch (InvocationTargetException e4) {
                    Throwable cause = e4.getCause();
                    if (cause instanceof RuntimeException) {
                        throw ((RuntimeException) cause);
                    }
                    if (!(cause instanceof Error)) {
                        throw new RuntimeException(cause);
                    }
                    throw ((Error) cause);
                }
                handler2 = handler;
            }
            this.Q = handler2;
        }
    }

    public final void a() {
        ay ayVar = ay.CLICK;
        vj.i((z91) this.Q);
        JSONObject jSONObject = new JSONObject();
        sa1.c(jSONObject, "interactionType", ayVar);
        gw.d(((z91) this.Q).j.f(), "publishMediaEvent", "adUserInteraction", jSONObject);
    }

    public final void b() {
        vj.i((z91) this.Q);
        ((z91) this.Q).j.d("bufferFinish");
    }

    public final void c() {
        vj.i((z91) this.Q);
        ((z91) this.Q).j.d("bufferStart");
    }

    @Override // defpackage.h23
    public final void d(boolean z) {
        ((ax2) this.Q).d();
    }

    public final void e() {
        vj.i((z91) this.Q);
        ((z91) this.Q).j.d("complete");
    }

    @Override // defpackage.wy4
    public final void f(Object obj) {
        switch (this.P) {
            case 1:
                this.Q = obj;
                return;
            default:
                ((h83) obj).a();
                return;
        }
    }

    @Override // defpackage.rk0
    public final void g(l4.e eVar, aw0 aw0Var) {
        gw0 gw0Var = (gw0) this.Q;
        l4<hw0> l4Var = wi1.i;
        ji1 ji1Var = (ji1) ((yi1) eVar).v();
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(ji1Var.Q);
        int i = hh1.a;
        if (gw0Var == null) {
            obtain.writeInt(0);
        } else {
            obtain.writeInt(1);
            gw0Var.writeToParcel(obtain, 0);
        }
        try {
            ji1Var.P.transact(1, obtain, null, 1);
            obtain.recycle();
            aw0Var.a.n(null);
        } catch (Throwable th) {
            obtain.recycle();
            throw th;
        }
    }

    @Override // defpackage.wy4
    public final void h(Throwable th) {
        tz3 a = ((u24) this.Q).a.c().a(th);
        ((u24) this.Q).d.p(a);
        lj4.b(a.P, "DelayedBannerAd.onFailure", th);
    }

    public final void i() {
        vj.i((z91) this.Q);
        ((z91) this.Q).j.d("firstQuartile");
    }

    @Override // defpackage.i52
    public final void j(t62 t62Var) {
        t62Var.k((d62) this.Q);
    }

    public final void k() {
        vj.i((z91) this.Q);
        ((z91) this.Q).j.d("midpoint");
    }

    public final void l() {
        vj.i((z91) this.Q);
        ((z91) this.Q).j.d("resume");
    }

    @Override // defpackage.fc5
    public final Object m(String str) {
        return ((hc5) this.Q).c(str, null);
    }

    public final void n() {
        vj.i((z91) this.Q);
        ((z91) this.Q).j.d("skipped");
    }

    public final void o(float f) {
        if (f > 0.0f) {
            vj.i((z91) this.Q);
            JSONObject jSONObject = new JSONObject();
            sa1.c(jSONObject, "duration", Float.valueOf(f));
            sa1.c(jSONObject, "mediaPlayerVolume", Float.valueOf(1.0f));
            sa1.c(jSONObject, "deviceVolume", Float.valueOf(jc1.a().a));
            gw.d(((z91) this.Q).j.f(), "publishMediaEvent", "start", jSONObject);
            return;
        }
        throw new IllegalArgumentException("Invalid Media duration");
    }

    public final void p() {
        vj.i((z91) this.Q);
        ((z91) this.Q).j.d("thirdQuartile");
    }

    public final void q(float f) {
        if (f >= 0.0f && f <= 1.0f) {
            vj.i((z91) this.Q);
            JSONObject jSONObject = new JSONObject();
            sa1.c(jSONObject, "mediaPlayerVolume", Float.valueOf(f));
            sa1.c(jSONObject, "deviceVolume", Float.valueOf(jc1.a().a));
            gw.d(((z91) this.Q).j.f(), "publishMediaEvent", "volumeChange", jSONObject);
            return;
        }
        throw new IllegalArgumentException("Invalid Media volume");
    }

    public /* synthetic */ fk(int i, Object obj) {
        this.P = i;
        this.Q = obj;
    }

    public fk(w51 w51Var, byte[][] bArr) {
        this.P = 9;
        if (w51Var == null) {
            throw new NullPointerException("params == null");
        }
        if (vj.q(bArr)) {
            throw new NullPointerException("publicKey byte array == null");
        }
        if (bArr.length != w51Var.d) {
            throw new IllegalArgumentException("wrong publicKey size");
        }
        for (byte[] bArr2 : bArr) {
            if (bArr2.length != w51Var.b) {
                throw new IllegalArgumentException("wrong publicKey format");
            }
        }
        this.Q = vj.k(bArr);
    }

    public fk(ai2 ai2Var) {
        this.P = 3;
        this.Q = ai2Var;
    }

    public /* synthetic */ fk(hc5 hc5Var) {
        this.P = 7;
        this.Q = hc5Var;
    }
}