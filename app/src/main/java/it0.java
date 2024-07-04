package defpackage;

import android.content.Context;
import android.util.Log;
import com.warkiz.widget.IndicatorSeekBar;
import io.mrarm.mctoolbox.bridge.b;
import java.util.Iterator;

/* renamed from: it0  reason: default package */
public final class it0 extends xc0 {
    public static final lj r;
    public final bb0 k;
    public int l;
    public int[] m;
    public float n;
    public float o;
    public int p;
    public final ab0 q;

    /* renamed from: it0$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class a implements gc0 {
        public a() {
        }

        @Override // defpackage.gc0
        public final void a(rq0 rq0Var) {
            StringBuilder b = e5.b("TEST ");
            b.append(rq0Var.b);
            Log.e("TEST", b.toString());
            it0 it0Var = it0.this;
            if (it0Var.l == 0) {
                it0Var.k.I(rq0Var.a);
                return;
            }
            it0Var.q.H(rq0Var.b);
        }

        @Override // defpackage.gc0
        public final void b() {
        }

        @Override // defpackage.gc0
        public final void c(IndicatorSeekBar indicatorSeekBar) {
        }
    }

    static {
        int i = l41.b;
        lj ljVar = new lj();
        ljVar.d = 2131492938;
        ljVar.e = 35;
        ljVar.g = new mj(new qq());
        r = ljVar;
    }

    public it0(io.mrarm.mctoolbox.bridge.a aVar) {
        super(aVar);
        bb0 bb0Var = new bb0();
        this.k = bb0Var;
        this.n = 0.0f;
        this.o = 50.0f;
        this.p = 0;
        ab0 ab0Var = new ab0();
        this.q = ab0Var;
        bb0Var.a(new xs0(new q10(this)));
        ab0Var.a(new xs0(new r10(this)));
    }

    @Override // defpackage.iw
    public final void e(oj ojVar, boolean z) {
        ojVar.o(new ct0(this, r));
    }

    @Override // defpackage.xc0
    public final void g() {
        int i = this.l;
        if (i == 0) {
            if (this.m == null) {
                return;
            }
            int p = ((b) this.a).p(this.f);
            if (this.m[this.k.Q] == p) {
                return;
            }
            int i2 = 0;
            while (true) {
                int[] iArr = this.m;
                if (i2 < iArr.length) {
                    if (iArr[i2] == p) {
                        this.k.I(i2);
                        return;
                    }
                    i2++;
                } else {
                    return;
                }
            }
        } else if (i == 1) {
            this.q.H(((b) this.a).n(this.f));
        }
    }

    @Override // defpackage.xc0
    public final void i(Context context, zz zzVar) {
        super.i(context, zzVar);
        if (zzVar.s("values")) {
            qz n = zzVar.r("values").n();
            int size = n.P.size();
            int[] iArr = new int[size];
            Iterator<wz> it = n.iterator();
            int i = 0;
            while (it.hasNext()) {
                iArr[i] = it.next().m();
                i++;
            }
            this.m = iArr;
            this.l = 0;
            this.n = 0.0f;
            this.o = size - 1;
        }
        if (zzVar.s("range_float")) {
            qz n2 = zzVar.r("range_float").n();
            this.l = 1;
            this.n = n2.r(0).h();
            this.o = n2.r(1).h();
            if (zzVar.s("decimal_scale")) {
                this.p = zzVar.r("decimal_scale").m();
            }
        }
        g();
    }
}