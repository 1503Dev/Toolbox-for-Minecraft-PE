package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import java.util.HashMap;
import java.util.concurrent.ScheduledFuture;

/* renamed from: zw5  reason: default package */
public final class zw5 implements qt4, nf3, yn5, wj3, kg4, bl4, v64 {
    public final /* synthetic */ int P;
    public final Object Q;

    public /* synthetic */ zw5(int i, Object obj) {
        this.P = i;
        this.Q = obj;
    }

    @Override // defpackage.qt4
    public final Object a() {
        return ((w92) this.Q).e.getString("flag_configuration", "{}");
    }

    @Override // defpackage.yn5
    public final void b() {
        bf3 bf3Var = ((qq3) this.Q).g;
        synchronized (bf3Var) {
            if (bf3Var.U) {
                if (bf3Var.T > 0 && bf3Var.V.isCancelled()) {
                    bf3Var.T0(bf3Var.T);
                }
                bf3Var.U = false;
            }
        }
    }

    @Override // defpackage.wj3
    public final void c(boolean z, Context context, wd3 wd3Var) {
        bx2 bx2Var = (bx2) this.Q;
        try {
            ea2 ea2Var = jv5.A.b;
            ea2.z(context, (AdOverlayInfoParcel) bx2Var.get(), true);
        } catch (Exception unused) {
        }
    }

    public final void d() {
        boolean z;
        boolean z2;
        vj.f((z91) this.Q);
        vj.p((z91) this.Q);
        Object obj = this.Q;
        z91 z91Var = (z91) obj;
        if (z91Var.k && !z91Var.l) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            try {
                ((z91) obj).H1();
            } catch (Exception unused) {
            }
        }
        Object obj2 = this.Q;
        z91 z91Var2 = (z91) obj2;
        if (z91Var2.k && !z91Var2.l) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            z91 z91Var3 = (z91) obj2;
            if (!z91Var3.n) {
                gw.d(z91Var3.j.f(), "publishImpressionEvent", new Object[0]);
                z91Var3.n = true;
                return;
            }
            throw new IllegalStateException("Impression event can only be sent once");
        }
    }

    @Override // defpackage.bl4
    public final Object e(Object obj) {
        hm4 hm4Var = (hm4) this.Q;
        if (((Boolean) fb2.c.d()).booleanValue()) {
            hm4Var.f();
        }
        return obj;
    }

    @Override // defpackage.nf3
    /* renamed from: e  reason: collision with other method in class */
    public final void mo9e(Object obj) {
        switch (this.P) {
            case 3:
                ((mh4) obj).g0((tz3) this.Q);
                return;
            case 6:
                ((yk3) obj).v1((au5) this.Q);
                return;
            default:
                int i = bm5.X;
                ((b53) obj).u((nq2) this.Q);
                return;
        }
    }

    public final void f(zr4 zr4Var) {
        String str;
        xx5 xx5Var = (xx5) this.Q;
        xx5Var.getClass();
        if (!TextUtils.isEmpty(zr4Var.b())) {
            if (!((Boolean) w82.d.c.a(x92.R8)).booleanValue()) {
                xx5Var.a = zr4Var.b();
            }
        }
        switch (zr4Var.a()) {
            case 8152:
                str = "onLMDOverlayOpened";
                break;
            case 8153:
                str = "onLMDOverlayClicked";
                break;
            case 8154:
            case 8156:
            case 8158:
            case 8159:
            default:
                return;
            case 8155:
                str = "onLMDOverlayClose";
                break;
            case 8157:
                xx5Var.a = null;
                xx5Var.b = null;
                xx5Var.e = false;
                return;
            case 8160:
            case 8161:
            case 8162:
                HashMap hashMap = new HashMap();
                hashMap.put("error", String.valueOf(zr4Var.a()));
                xx5Var.b("onLMDOverlayFailedToOpen", hashMap);
                return;
        }
        xx5Var.a(str);
    }

    @Override // defpackage.yn5
    public final void i() {
        bf3 bf3Var = ((qq3) this.Q).g;
        synchronized (bf3Var) {
            if (!bf3Var.U) {
                ScheduledFuture scheduledFuture = bf3Var.V;
                if (scheduledFuture != null && !scheduledFuture.isCancelled()) {
                    bf3Var.V.cancel(true);
                    bf3Var.T = bf3Var.S - bf3Var.R.b();
                } else {
                    bf3Var.T = -1L;
                }
                bf3Var.U = true;
            }
        }
    }
}