package defpackage;

/* renamed from: cr3  reason: default package */
public final class cr3 implements zh3 {
    public final fk3 a;
    public final String b;
    public final Object[] c;
    public final int d;

    public cr3(ox2 ox2Var, String str, Object[] objArr) {
        this.a = ox2Var;
        this.b = str;
        this.c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.d = charAt;
            return;
        }
        int i = charAt & 8191;
        int i2 = 13;
        int i3 = 1;
        while (true) {
            int i4 = i3 + 1;
            char charAt2 = str.charAt(i3);
            if (charAt2 < 55296) {
                this.d = i | (charAt2 << i2);
                return;
            }
            i |= (charAt2 & 8191) << i2;
            i2 += 13;
            i3 = i4;
        }
    }

    @Override // defpackage.zh3
    public final fk3 a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    @Override // defpackage.zh3
    public final boolean c() {
        return (this.d & 2) == 2;
    }

    @Override // defpackage.zh3
    public final int d() {
        return (this.d & 1) == 1 ? 1 : 2;
    }

    public final Object[] e() {
        return this.c;
    }
}