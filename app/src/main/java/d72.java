package defpackage;

/* renamed from: d72  reason: default package */
public final class d72 implements le5 {
    public static final d72 a = new d72();

    @Override // defpackage.le5
    public final boolean a(int i) {
        char c;
        if (i != 0) {
            c = 2;
            if (i != 1) {
                c = i != 2 ? (char) 0 : (char) 3;
            }
        } else {
            c = 1;
        }
        return c != 0;
    }
}