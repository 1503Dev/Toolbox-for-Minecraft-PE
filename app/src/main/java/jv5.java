package defpackage;

import android.os.Build;

/* renamed from: jv5  reason: default package */
public final class jv5 {
    public static final jv5 A = new jv5();
    public final wj1 a;
    public final ea2 b;
    public final cu5 c;
    public final k13 d;
    public final ck1 e;
    public final f32 f;
    public final yu2 g;
    public final xk1 h;
    public final u42 i;
    public final dk j;
    public final sz3 k;
    public final da2 l;
    public final r42 m;
    public final s82 n;
    public final cx2 o;
    public final vj2 p;
    public final xx5 q;
    public final kr2 r;
    public final p5 s;
    public final ea2 t;
    public final js2 u;
    public final c14 v;
    public final qt2 w;
    public final x13 x;
    public final hz2 y;
    public final gx2 z;

    public jv5() {
        ck1 ck1Var;
        wj1 wj1Var = new wj1();
        ea2 ea2Var = new ea2();
        cu5 cu5Var = new cu5();
        k13 k13Var = new k13();
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            ck1Var = new yz5();
        } else if (i >= 28) {
            ck1Var = new az5();
        } else if (i >= 26) {
            ck1Var = new ax5();
        } else if (i >= 24) {
            ck1Var = new cw5();
        } else if (i >= 21) {
            ck1Var = new dv5();
        } else {
            ck1Var = new ck1();
        }
        f32 f32Var = new f32();
        yu2 yu2Var = new yu2();
        xk1 xk1Var = new xk1();
        u42 u42Var = new u42();
        dk dkVar = dk.a;
        sz3 sz3Var = new sz3();
        da2 da2Var = new da2();
        r42 r42Var = new r42();
        s82 s82Var = new s82(3);
        cx2 cx2Var = new cx2();
        vj2 vj2Var = new vj2();
        xx5 xx5Var = new xx5();
        kr2 kr2Var = new kr2();
        p5 p5Var = new p5();
        new zf();
        ea2 ea2Var2 = new ea2();
        js2 js2Var = new js2();
        c14 c14Var = new c14();
        new da2();
        qt2 qt2Var = new qt2();
        x13 x13Var = new x13();
        hz2 hz2Var = new hz2();
        gx2 gx2Var = new gx2();
        this.a = wj1Var;
        this.b = ea2Var;
        this.c = cu5Var;
        this.d = k13Var;
        this.e = ck1Var;
        this.f = f32Var;
        this.g = yu2Var;
        this.h = xk1Var;
        this.i = u42Var;
        this.j = dkVar;
        this.k = sz3Var;
        this.l = da2Var;
        this.m = r42Var;
        this.n = s82Var;
        this.o = cx2Var;
        this.p = vj2Var;
        this.r = kr2Var;
        this.q = xx5Var;
        this.s = p5Var;
        this.t = ea2Var2;
        this.u = js2Var;
        this.v = c14Var;
        this.w = qt2Var;
        this.x = x13Var;
        this.y = hz2Var;
        this.z = gx2Var;
    }
}