package defpackage;

/* renamed from: ov4  reason: default package */
public final class ov4 {
    public final Object a;
    public final Object b;
    public final Object c;

    public ov4(Object obj, Object obj2, Object obj3) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public final IllegalArgumentException a() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.a);
        String valueOf4 = String.valueOf(this.c);
        StringBuilder b = sd1.b("Multiple entries with same key: ", valueOf, "=", valueOf2, " and ");
        b.append(valueOf3);
        b.append("=");
        b.append(valueOf4);
        return new IllegalArgumentException(b.toString());
    }
}