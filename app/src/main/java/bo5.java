package defpackage;

@Deprecated
/* renamed from: bo5  reason: default package */
public final class bo5 implements bz1, dx2, wy4, nf3, jy4, e74 {
    public final /* synthetic */ int P;
    public final Object Q;

    public /* synthetic */ bo5(int i, Object obj) {
        this.P = i;
        this.Q = obj;
    }

    @Override // defpackage.jy4
    public final dz4 a() {
        return zw4.C(null);
    }

    @Override // defpackage.dx2, defpackage.e74
    /* renamed from: a  reason: collision with other method in class */
    public final void mo1a() {
        switch (this.P) {
            case 2:
                ((jj2) this.Q).S.k();
                return;
            default:
                synchronized (((wh4) this.Q)) {
                    ((wh4) this.Q).S = null;
                }
                return;
        }
    }

    /*  JADX ERROR: Type inference failed with exception
        jadx.core.utils.exceptions.JadxOverflowException: Type update terminated with stack overflow, arg: (r95v6 ?? I:??[int, boolean, short, byte, char])
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:56)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:30)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:18)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:114)
        */
    @Override // defpackage.bz1
    public final void b(byte[] r172, byte[] r173) {
        /*
            Method dump skipped, instructions count: 4338
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bo5.b(byte[], byte[]):void");
    }

    @Override // defpackage.nf3
    /* renamed from: e */
    public final void mo9e(Object obj) {
        ((if4) obj).d((au5) this.Q);
    }

    @Override // defpackage.wy4
    public final void f(Object obj) {
        switch (this.P) {
            case 3:
                Void r4 = (Void) obj;
                vs2.l.remove((dz4) this.Q);
                return;
            default:
                synchronized (((wh4) this.Q)) {
                    ((wh4) this.Q).S = (yp3) obj;
                    if (((Boolean) w82.d.c.a(x92.P2)).booleanValue()) {
                        ((yp3) obj).r.a = ((wh4) this.Q).R;
                    }
                    ((wh4) this.Q).S.a();
                }
                return;
        }
    }

    @Override // defpackage.wy4
    public final void h(Throwable th) {
        vs2.l.remove((dz4) this.Q);
    }

    public /* synthetic */ bo5(fz1 fz1Var) {
        this.P = 1;
        this.Q = fz1Var;
    }

    public bo5(dz4 dz4Var) {
        this.P = 3;
        this.Q = dz4Var;
    }
}