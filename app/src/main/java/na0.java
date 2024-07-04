package defpackage;

/* renamed from: na0  reason: default package */
public final class na0 {
    public String a;
    public int b = 0;

    public na0(String str) {
        this.a = str;
    }

    public final String a() {
        int i = this.b;
        if (i == -1) {
            return null;
        }
        int indexOf = this.a.indexOf(46, i);
        if (indexOf == -1) {
            String substring = this.a.substring(this.b);
            this.b = -1;
            return substring;
        }
        String substring2 = this.a.substring(this.b, indexOf);
        this.b = indexOf + 1;
        return substring2;
    }
}