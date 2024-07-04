package defpackage;

/* renamed from: bq1  reason: default package */
public class bq1 {
    public final int a;

    public bq1(int i) {
        this.a = i;
    }

    public static int a(int i) {
        return (i >> 24) & 255;
    }

    public static String b(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append((char) ((i >> 24) & 255));
        sb.append((char) ((i >> 16) & 255));
        sb.append((char) ((i >> 8) & 255));
        sb.append((char) (i & 255));
        return sb.toString();
    }

    public String toString() {
        return b(this.a);
    }
}