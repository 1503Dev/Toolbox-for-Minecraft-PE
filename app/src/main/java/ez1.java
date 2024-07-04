package defpackage;

import java.util.HashSet;
import java.util.concurrent.TimeUnit;

/* renamed from: ez1  reason: default package */
public final class ez1 implements bz1, wg3, jy4, v64 {
    public final /* synthetic */ int P;
    public final Object Q;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ez1() {
        this(TimeUnit.MINUTES);
        this.P = 5;
    }

    @Override // defpackage.jy4
    public final dz4 a() {
        yb4 yb4Var = (yb4) this.Q;
        String str = yb4Var.a;
        l92 l92Var = x92.c6;
        w82 w82Var = w82.d;
        if (((Boolean) w82Var.c.a(l92Var)).booleanValue()) {
            str = "UNKNOWN";
        }
        dp2 l = yb4Var.f.l();
        xc3 xc3Var = new xc3();
        xc3Var.a = yb4Var.d;
        ki4 ki4Var = new ki4();
        ki4Var.c = "adUnitId";
        ki4Var.a = yb4Var.e.d;
        ki4Var.b = new zr5();
        xc3Var.b = ki4Var.a();
        l.b = new yc3(xc3Var);
        bm1 bm1Var = new bm1();
        bm1Var.a = str;
        l.c = new go1(bm1Var);
        new HashSet();
        new HashSet();
        new HashSet();
        new HashSet();
        new HashSet();
        new HashSet();
        new HashSet();
        new HashSet();
        new HashSet();
        new HashSet();
        new HashSet();
        new HashSet();
        new HashSet();
        new HashSet();
        return zw4.z(zw4.E((sy4) zw4.G(sy4.r(l.b().b()), ((Long) w82Var.c.a(x92.d6)).longValue(), TimeUnit.MILLISECONDS, yb4Var.c), new at4() { // from class: wb4
            @Override // defpackage.at4
            public final Object apply(Object obj) {
                ew1 ew1Var = (ew1) obj;
                return new sa4(1, ew1Var != null ? ew1Var.a : null);
            }
        }, yb4Var.b), Exception.class, new at4() { // from class: xb4
            @Override // defpackage.at4
            public final Object apply(Object obj) {
                sv2.e("", (Exception) obj);
                return new sa4(1, null);
            }
        }, yb4Var.b);
    }

    /*  JADX ERROR: Type inference failed with exception
        jadx.core.utils.exceptions.JadxOverflowException: Type update terminated with stack overflow, arg: (r12v11 ?? I:??[int, boolean, short, byte, char])
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:56)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:30)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:18)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:114)
        */
    @Override // defpackage.bz1
    public final void b(byte[] r124, byte[] r125) {
        /*
            Method dump skipped, instructions count: 2624
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ez1.b(byte[], byte[]):void");
    }

    @Override // defpackage.wg3
    /* renamed from: e */
    public final void mo0e(Object obj) {
        switch (this.P) {
            case 1:
                ((ff3) obj).f((hi4) this.Q);
                return;
            case 2:
            default:
                jo5 jo5Var = (jo5) obj;
                return;
            case 3:
                int i = bm5.X;
                ((b53) obj).q(((jn5) this.Q).f);
                return;
        }
    }

    public /* synthetic */ ez1(int i, Object obj) {
        this.P = i;
        this.Q = obj;
    }

    public ez1(TimeUnit timeUnit) {
        this.P = 5;
        this.Q = new ak0(timeUnit);
    }

    public /* synthetic */ ez1(fz1 fz1Var) {
        this.P = 0;
        this.Q = fz1Var;
    }

    public /* synthetic */ ez1(io5 io5Var) {
        this.P = 4;
        this.Q = io5Var;
    }
}