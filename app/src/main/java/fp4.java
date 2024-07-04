package defpackage;

/* renamed from: fp4  reason: default package */
public final class fp4 extends ep4 {
    public final String a;
    public final boolean b;
    public final boolean c;

    public /* synthetic */ fp4(String str, boolean z, boolean z2) {
        this.a = str;
        this.b = z;
        this.c = z2;
    }

    @Override // defpackage.ep4
    public final String a() {
        return this.a;
    }

    @Override // defpackage.ep4
    public final boolean b() {
        return this.c;
    }

    @Override // defpackage.ep4
    public final boolean c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ep4) {
            ep4 ep4Var = (ep4) obj;
            if (this.a.equals(ep4Var.a()) && this.b == ep4Var.c() && this.c == ep4Var.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() ^ 1000003;
        return (((hashCode * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003) ^ (true == this.c ? 1231 : 1237);
    }

    public final String toString() {
        String str = this.a;
        boolean z = this.b;
        boolean z2 = this.c;
        return "AdShield2Options{clientVersion=" + str + ", shouldGetAdvertisingId=" + z + ", isGooglePlayServicesAvailable=" + z2 + "}";
    }
}