package defpackage;

import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: wr1  reason: default package */
public final class wr1 implements bz1, wg3, ti4, kg4, ot4, qt4, v64 {
    public final /* synthetic */ int P;
    public final Object Q;

    public /* synthetic */ wr1(int i, Object obj) {
        this.P = i;
        this.Q = obj;
    }

    @Override // defpackage.qt4
    public final Object a() {
        return (sm5) this.Q;
    }

    /*  JADX ERROR: Type inference failed with exception
        jadx.core.utils.exceptions.JadxOverflowException: Type update terminated with stack overflow, arg: (r10v20 ?? I:??[int, boolean])
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:56)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:30)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:18)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:114)
        */
    @Override // defpackage.bz1
    public final void b(byte[] r120, byte[] r121) {
        /*
            Method dump skipped, instructions count: 2702
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wr1.b(byte[], byte[]):void");
    }

    @Override // defpackage.ti4
    public final void c() {
        ((ej3) this.Q).j().J();
    }

    @Override // defpackage.ti4
    public final void d() {
        ((ej3) this.Q).n().a();
        qi3 o = ((ej3) this.Q).o();
        synchronized (o) {
            o.R0(pi3.P);
        }
    }

    @Override // defpackage.wg3
    /* renamed from: e */
    public final void mo0e(Object obj) {
        switch (this.P) {
            case 2:
                ((vh3) obj).P((String) this.Q);
                return;
            case 3:
            default:
                jo5 jo5Var = (jo5) obj;
                return;
            case 4:
                ((yk3) obj).v1((au5) this.Q);
                return;
        }
    }

    @Override // defpackage.ot4
    public final /* synthetic */ Iterator f(vw2 vw2Var, CharSequence charSequence) {
        return new kt4(this, vw2Var, charSequence);
    }

    @Override // defpackage.ti4
    public final void g(View view) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v5 */
    public final List h(ot1 ot1Var) {
        boolean z;
        String str;
        int i;
        List list;
        kh4 kh4Var = new kh4(ot1Var.b);
        ArrayList arrayList = (List) this.Q;
        while (kh4Var.c - kh4Var.b > 0) {
            int n = kh4Var.n();
            int n2 = kh4Var.b + kh4Var.n();
            if (n == 134) {
                arrayList = new ArrayList();
                int n3 = kh4Var.n() & 31;
                for (int i2 = 0; i2 < n3; i2++) {
                    String z2 = kh4Var.z(3, zs4.c);
                    int n4 = kh4Var.n();
                    if ((n4 & 128) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        i = n4 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i = 1;
                    }
                    byte n5 = (byte) kh4Var.n();
                    kh4Var.f(1);
                    if (z) {
                        list = Collections.singletonList((n5 & 64) != 0 ? new byte[]{1} : new byte[]{0});
                    } else {
                        list = null;
                    }
                    bs1 bs1Var = new bs1();
                    bs1Var.j = str;
                    bs1Var.c = z2;
                    bs1Var.B = i;
                    bs1Var.l = list;
                    arrayList.add(new cu1(bs1Var));
                }
            }
            kh4Var.e(n2);
            arrayList = arrayList;
        }
        return arrayList;
    }

    public /* synthetic */ wr1(fz1 fz1Var) {
        this.P = 1;
        this.Q = fz1Var;
    }

    public wr1(ej3 ej3Var) {
        this.P = 3;
        this.Q = ej3Var;
    }

    public wr1(nv4 nv4Var) {
        this.P = 0;
        this.Q = nv4Var;
    }

    public /* synthetic */ wr1(io5 io5Var) {
        this.P = 8;
        this.Q = io5Var;
    }
}