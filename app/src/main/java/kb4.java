package defpackage;

/* renamed from: kb4  reason: default package */
public final class kb4 implements nc4 {
    public final String a;
    public final String b;

    public kb4(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    @Override // defpackage.nc4
    public final int a() {
        return 31;
    }

    @Override // defpackage.nc4
    public final dz4 c() {
        return zw4.C(new ob4(this.a, this.b));
    }
}