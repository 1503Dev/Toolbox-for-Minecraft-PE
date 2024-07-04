package defpackage;

/* renamed from: hu  reason: default package */
public final class hu {
    public static final fb d = fb.h(":");
    public static final fb e = fb.h(":status");
    public static final fb f = fb.h(":method");
    public static final fb g = fb.h(":path");
    public static final fb h = fb.h(":scheme");
    public static final fb i = fb.h(":authority");
    public final fb a;
    public final fb b;
    public final int c;

    public hu(fb fbVar, fb fbVar2) {
        this.a = fbVar;
        this.b = fbVar2;
        this.c = fbVar2.n() + fbVar.n() + 32;
    }

    public hu(fb fbVar, String str) {
        this(fbVar, fb.h(str));
    }

    public hu(String str, String str2) {
        this(fb.h(str), fb.h(str2));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof hu) {
            hu huVar = (hu) obj;
            return this.a.equals(huVar.a) && this.b.equals(huVar.b);
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + ((this.a.hashCode() + 527) * 31);
    }

    public final String toString() {
        return c31.j("%s: %s", this.a.q(), this.b.q());
    }
}