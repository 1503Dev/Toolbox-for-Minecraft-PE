package defpackage;

/* renamed from: jk1  reason: default package */
public final class jk1 {
    public final String a;

    public jk1(String str) {
        this.a = str;
    }

    public static jk1 a(kh4 kh4Var) {
        String str;
        kh4Var.f(2);
        int n = kh4Var.n();
        int i = n >> 1;
        int i2 = n & 1;
        int n2 = kh4Var.n() >> 3;
        if (i == 4 || i == 5 || i == 7) {
            str = "dvhe";
        } else if (i == 8) {
            str = "hev1";
        } else if (i != 9) {
            return null;
        } else {
            str = "avc3";
        }
        int i3 = n2 | (i2 << 5);
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(".0");
        sb.append(i);
        sb.append(i3 >= 10 ? "." : ".0");
        sb.append(i3);
        return new jk1(sb.toString());
    }
}