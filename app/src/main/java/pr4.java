package defpackage;

import android.os.IBinder;

/* renamed from: pr4  reason: default package */
public final class pr4 extends yr4 {
    public final IBinder a;
    public final String b;
    public final int c;
    public final float d;
    public final int e;
    public final String f;

    public /* synthetic */ pr4(IBinder iBinder, String str, int i, float f, int i2, String str2) {
        this.a = iBinder;
        this.b = str;
        this.c = i;
        this.d = f;
        this.e = i2;
        this.f = str2;
    }

    @Override // defpackage.yr4
    public final float a() {
        return this.d;
    }

    @Override // defpackage.yr4
    public final void b() {
    }

    @Override // defpackage.yr4
    public final int c() {
        return this.c;
    }

    @Override // defpackage.yr4
    public final int d() {
        return this.e;
    }

    @Override // defpackage.yr4
    public final IBinder e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof yr4) {
            yr4 yr4Var = (yr4) obj;
            if (this.a.equals(yr4Var.e())) {
                yr4Var.i();
                String str = this.b;
                if (str != null ? str.equals(yr4Var.g()) : yr4Var.g() == null) {
                    if (this.c == yr4Var.c() && Float.floatToIntBits(this.d) == Float.floatToIntBits(yr4Var.a())) {
                        yr4Var.b();
                        yr4Var.h();
                        if (this.e == yr4Var.d()) {
                            String str2 = this.f;
                            String f = yr4Var.f();
                            if (str2 != null ? str2.equals(f) : f == null) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.yr4
    public final String f() {
        return this.f;
    }

    @Override // defpackage.yr4
    public final String g() {
        return this.b;
    }

    @Override // defpackage.yr4
    public final void h() {
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() ^ 1000003;
        String str = this.b;
        int hashCode2 = ((((((((((hashCode * 1000003) ^ 1237) * 1000003) ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.c) * 1000003) ^ Float.floatToIntBits(this.d)) * 583896283) ^ this.e) * 1000003;
        String str2 = this.f;
        return hashCode2 ^ (str2 != null ? str2.hashCode() : 0);
    }

    @Override // defpackage.yr4
    public final void i() {
    }

    public final String toString() {
        String obj = this.a.toString();
        String str = this.b;
        int i = this.c;
        float f = this.d;
        int i2 = this.e;
        String str2 = this.f;
        StringBuilder b = sd1.b("OverlayDisplayShowRequest{windowToken=", obj, ", stableSessionToken=false, appId=", str, ", layoutGravity=");
        b.append(i);
        b.append(", layoutVerticalMargin=");
        b.append(f);
        b.append(", displayMode=0, sessionToken=null, windowWidthPx=");
        b.append(i2);
        b.append(", adFieldEnifd=");
        b.append(str2);
        b.append("}");
        return b.toString();
    }
}