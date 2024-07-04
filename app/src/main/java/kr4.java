package defpackage;

/* renamed from: kr4  reason: default package */
public final class kr4 extends sr4 {
    public final String a;
    public final String b;

    public /* synthetic */ kr4(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    @Override // defpackage.sr4
    public final String a() {
        return this.b;
    }

    @Override // defpackage.sr4
    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof sr4) {
            sr4 sr4Var = (sr4) obj;
            String str = this.a;
            if (str != null ? str.equals(sr4Var.b()) : sr4Var.b() == null) {
                String str2 = this.b;
                String a = sr4Var.a();
                if (str2 != null ? str2.equals(a) : a == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = str == null ? 0 : str.hashCode();
        String str2 = this.b;
        return ((hashCode ^ 1000003) * 1000003) ^ (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        return "OverlayDisplayDismissRequest{sessionToken=" + str + ", appId=" + str2 + "}";
    }
}