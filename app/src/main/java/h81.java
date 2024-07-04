package defpackage;

/* renamed from: h81  reason: default package */
public abstract class h81 {
    public g81 a;

    public abstract g81 a();

    public final synchronized g81 b() {
        if (this.a == null) {
            this.a = a();
        }
        return this.a;
    }
}