package defpackage;

/* renamed from: v92  reason: default package */
public final class v92 implements dc2 {
    public final /* synthetic */ w92 a;

    public v92(w92 w92Var) {
        this.a = w92Var;
    }

    @Override // defpackage.dc2
    public final Double a(String str, double d) {
        try {
            return Double.valueOf(this.a.e.getFloat(str, (float) d));
        } catch (ClassCastException unused) {
            return Double.valueOf(this.a.e.getString(str, String.valueOf(d)));
        }
    }

    @Override // defpackage.dc2
    public final String b(String str, String str2) {
        return this.a.e.getString(str, str2);
    }

    @Override // defpackage.dc2
    public final Long c(String str, long j) {
        try {
            return Long.valueOf(this.a.e.getLong(str, j));
        } catch (ClassCastException unused) {
            return Long.valueOf(this.a.e.getInt(str, (int) j));
        }
    }

    @Override // defpackage.dc2
    public final Boolean d(String str, boolean z) {
        try {
            return Boolean.valueOf(this.a.e.getBoolean(str, z));
        } catch (ClassCastException unused) {
            return Boolean.valueOf(this.a.e.getString(str, String.valueOf(z)));
        }
    }
}