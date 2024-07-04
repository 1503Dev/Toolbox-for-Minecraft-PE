package defpackage;

/* renamed from: rr4  reason: default package */
public final class rr4 extends as4 {
    public final String a;
    public final String b;

    public /* synthetic */ rr4(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    @Override // defpackage.as4
    public final String a() {
        return this.b;
    }

    @Override // defpackage.as4
    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof as4) {
            as4 as4Var = (as4) obj;
            String str = this.a;
            if (str != null ? str.equals(as4Var.b()) : as4Var.b() == null) {
                String str2 = this.b;
                String a = as4Var.a();
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
        return "OverlayDisplayUpdateRequest{sessionToken=" + str + ", appId=" + str2 + "}";
    }
}