package defpackage;

/* renamed from: u32  reason: default package */
public final class u32 {
    public final long a;
    public final String b;
    public final int c;

    public u32(long j, int i, String str) {
        this.a = j;
        this.b = str;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof u32)) {
            u32 u32Var = (u32) obj;
            if (u32Var.a == this.a && u32Var.c == this.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (int) this.a;
    }
}