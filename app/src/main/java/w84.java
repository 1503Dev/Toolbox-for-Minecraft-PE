package defpackage;

import defpackage.o3;

/* renamed from: w84  reason: default package */
public final /* synthetic */ class w84 implements at4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ nc4 b;

    public /* synthetic */ w84(nc4 nc4Var, int i) {
        this.a = i;
        this.b = nc4Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003d, code lost:
        if (((java.lang.Boolean) defpackage.w82.d.c.a(defpackage.x92.u2)).booleanValue() == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0053, code lost:
        if (((java.lang.Boolean) defpackage.w82.d.c.a(defpackage.x92.v2)).booleanValue() != false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0055, code lost:
        r3 = defpackage.fr4.f(r0.a);
        r10.getClass();
        r6 = r10.a;
        r6.getClass();
        r8 = r0.a.getPackageName();
        r4 = ((java.lang.Long) defpackage.w82.d.c.a(defpackage.x92.y2)).longValue();
        r7 = r0.e;
        r3.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0080, code lost:
        monitor-enter(defpackage.fr4.class);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0081, code lost:
        r2 = r3.a(r4, r6, r7, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0085, code lost:
        monitor-exit(defpackage.fr4.class);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x008a, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x008d, code lost:
        defpackage.jv5.A.g.f("AdIdInfoSignalSource.getPaidV1", r0);
        r2 = new defpackage.cr4();
     */
    @Override // defpackage.at4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object apply(Object obj) {
        switch (this.a) {
            case 0:
                ((x84) this.b).a.f("AppSetIdInfoSignal", (Exception) obj);
                return new y84(null, -1);
            default:
                zc4 zc4Var = (zc4) this.b;
                o3.a aVar = (o3.a) obj;
                zc4Var.getClass();
                cr4 cr4Var = new cr4();
                if (!zc4Var.d) {
                    break;
                }
                if (zc4Var.d) {
                    break;
                }
                return new ad4(aVar, null, cr4Var);
        }
    }
}