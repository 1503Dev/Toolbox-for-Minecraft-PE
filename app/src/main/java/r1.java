package defpackage;

import defpackage.jb0;
import defpackage.wv0;

/* renamed from: r1  reason: default package */
public final /* synthetic */ class r1 implements jb0.a, ix, wv0.b {
    public static /* synthetic */ int b(int i) {
        if (i == 1) {
            return 1;
        }
        if (i == 2) {
            return 2;
        }
        throw null;
    }

    @Override // defpackage.ix
    public String a(float f) {
        StringBuilder b;
        String str;
        int i = (int) f;
        int[] iArr = ie.V;
        if (iArr[i] < 0) {
            b = new StringBuilder();
            b.append(-iArr[i]);
            str = "/sec";
        } else {
            b = e5.b("every ");
            b.append(iArr[i]);
            str = "s";
        }
        b.append(str);
        return b.toString();
    }

    @Override // defpackage.wv0.b
    public tv0 get() {
        return new gb();
    }
}