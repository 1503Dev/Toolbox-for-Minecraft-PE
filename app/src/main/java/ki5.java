package defpackage;

/* renamed from: ki5  reason: default package */
public final class ki5 implements le5 {
    public static final ki5 a = new ki5();

    @Override // defpackage.le5
    public final boolean a(int i) {
        char c;
        if (i != 0) {
            c = 2;
            if (i != 1) {
                c = i != 2 ? i != 3 ? (char) 0 : (char) 4 : (char) 3;
            }
        } else {
            c = 1;
        }
        return c != 0;
    }
}