package defpackage;

/* renamed from: c72  reason: default package */
public final class c72 implements le5 {
    public static final c72 a = new c72();

    @Override // defpackage.le5
    public final boolean a(int i) {
        char c;
        if (i != 0) {
            c = 2;
            if (i != 1) {
                c = i != 2 ? i != 4 ? (char) 0 : (char) 5 : (char) 3;
            }
        } else {
            c = 1;
        }
        return c != 0;
    }
}