package defpackage;

import android.content.Context;
import java.security.GeneralSecurityException;

/* renamed from: dz1  reason: default package */
public final class dz1 implements bz1, wg3, i52, h75, qt4 {
    public final /* synthetic */ int P;
    public final Object Q;

    public /* synthetic */ dz1(int i, Object obj) {
        this.P = i;
        this.Q = obj;
    }

    @Override // defpackage.qt4
    public final Object a() {
        return new oy5((Context) this.Q);
    }

    /*  JADX ERROR: Type inference failed with exception
        jadx.core.utils.exceptions.JadxOverflowException: Type update terminated with stack overflow, arg: (r4v44 ?? I:??[int, boolean, short, byte, char])
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:56)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:30)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:18)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:114)
        */
    @Override // defpackage.bz1
    public final void b(byte[] r139, byte[] r140) {
        /*
            Method dump skipped, instructions count: 2620
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dz1.b(byte[], byte[]):void");
    }

    @Override // defpackage.wg3
    /* renamed from: e */
    public final void mo0e(Object obj) {
        switch (this.P) {
            case 1:
                ((oe3) obj).u((ea3) this.Q);
                return;
            default:
                ((ug3) obj).n0((d62) this.Q);
                return;
        }
    }

    @Override // defpackage.i52
    public final void j(t62 t62Var) {
        m62 m62Var = (m62) ((u62) t62Var.Q).x().g();
        m62Var.j();
        p62.z((p62) m62Var.Q, (z72) this.Q);
        t62Var.l(m62Var);
    }

    public /* synthetic */ dz1(fz1 fz1Var) {
        this.P = 0;
        this.Q = fz1Var;
    }

    public dz1(a75 a75Var) {
        this.P = 4;
        if (!ea2.C(1)) {
            throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
        }
        this.Q = a75Var;
    }
}