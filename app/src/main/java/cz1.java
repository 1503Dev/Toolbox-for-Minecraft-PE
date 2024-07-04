package defpackage;

import android.content.Context;

/* renamed from: cz1  reason: default package */
public final class cz1 implements bz1, wg3, kg4, v64 {
    public final /* synthetic */ int P;
    public final /* synthetic */ Object Q;

    public /* synthetic */ cz1(int i, Object obj) {
        this.P = i;
        this.Q = obj;
    }

    /*  JADX ERROR: Type inference failed with exception
        jadx.core.utils.exceptions.JadxOverflowException: Type update terminated with stack overflow, arg: (r3v62 ?? I:??[int, boolean])
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:56)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:30)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:18)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:114)
        */
    @Override // defpackage.bz1
    public final void b(byte[] r128, byte[] r129) {
        /*
            Method dump skipped, instructions count: 2613
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cz1.b(byte[], byte[]):void");
    }

    @Override // defpackage.wg3
    /* renamed from: e */
    public final void mo0e(Object obj) {
        switch (this.P) {
            case 1:
                ((be3) obj).a((Context) this.Q);
                return;
            case 2:
                ((m42) obj).j0((tz3) this.Q);
                return;
            case 3:
                ((b53) obj).h((wo3) this.Q);
                return;
            default:
                jo5 jo5Var = (jo5) obj;
                return;
        }
    }

    public /* synthetic */ cz1(fz1 fz1Var) {
        this.P = 0;
        this.Q = fz1Var;
    }
}