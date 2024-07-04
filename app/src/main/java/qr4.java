package defpackage;

/* renamed from: qr4  reason: default package */
public final class qr4 extends zr4 {
    public final int a;
    public final String b;

    public /* synthetic */ qr4(int i, String str) {
        this.a = i;
        this.b = str;
    }

    @Override // defpackage.zr4
    public final int a() {
        return this.a;
    }

    @Override // defpackage.zr4
    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zr4) {
            zr4 zr4Var = (zr4) obj;
            if (this.a == zr4Var.a()) {
                String str = this.b;
                String b = zr4Var.b();
                if (str != null ? str.equals(b) : b == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.a ^ 1000003;
        String str = this.b;
        return (i * 1000003) ^ (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        int i = this.a;
        String str = this.b;
        return "OverlayDisplayState{statusCode=" + i + ", sessionToken=" + str + "}";
    }
}