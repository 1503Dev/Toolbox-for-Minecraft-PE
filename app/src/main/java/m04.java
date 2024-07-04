package defpackage;

import android.app.Activity;

/* renamed from: m04  reason: default package */
public final class m04 extends b14 {
    public final Activity a;
    public final qn5 b;
    public final co2 c;
    public final r04 d;
    public final zr3 e;
    public final wl4 f;
    public final String g;
    public final String h;

    public /* synthetic */ m04(Activity activity, qn5 qn5Var, co2 co2Var, r04 r04Var, zr3 zr3Var, wl4 wl4Var, String str, String str2) {
        this.a = activity;
        this.b = qn5Var;
        this.c = co2Var;
        this.d = r04Var;
        this.e = zr3Var;
        this.f = wl4Var;
        this.g = str;
        this.h = str2;
    }

    @Override // defpackage.b14
    public final Activity a() {
        return this.a;
    }

    @Override // defpackage.b14
    public final qn5 b() {
        return this.b;
    }

    @Override // defpackage.b14
    public final co2 c() {
        return this.c;
    }

    @Override // defpackage.b14
    public final zr3 d() {
        return this.e;
    }

    @Override // defpackage.b14
    public final r04 e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        qn5 qn5Var;
        if (obj == this) {
            return true;
        }
        if (obj instanceof b14) {
            b14 b14Var = (b14) obj;
            if (this.a.equals(b14Var.a()) && ((qn5Var = this.b) != null ? qn5Var.equals(b14Var.b()) : b14Var.b() == null) && this.c.equals(b14Var.c()) && this.d.equals(b14Var.e()) && this.e.equals(b14Var.d()) && this.f.equals(b14Var.f()) && this.g.equals(b14Var.g()) && this.h.equals(b14Var.h())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.b14
    public final wl4 f() {
        return this.f;
    }

    @Override // defpackage.b14
    public final String g() {
        return this.g;
    }

    @Override // defpackage.b14
    public final String h() {
        return this.h;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() ^ 1000003;
        qn5 qn5Var = this.b;
        return (((((((((((((hashCode * 1000003) ^ (qn5Var == null ? 0 : qn5Var.hashCode())) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode();
    }

    public final String toString() {
        String obj = this.a.toString();
        String valueOf = String.valueOf(this.b);
        String obj2 = this.c.toString();
        String obj3 = this.d.toString();
        String obj4 = this.e.toString();
        String obj5 = this.f.toString();
        String str = this.g;
        String str2 = this.h;
        StringBuilder b = sd1.b("OfflineUtilsParamsBuilder{activity=", obj, ", adOverlay=", valueOf, ", workManagerUtil=");
        b.append(obj2);
        b.append(", databaseManager=");
        b.append(obj3);
        b.append(", csiReporter=");
        b.append(obj4);
        b.append(", logger=");
        b.append(obj5);
        b.append(", gwsQueryId=");
        b.append(str);
        b.append(", uri=");
        b.append(str2);
        b.append("}");
        return b.toString();
    }
}