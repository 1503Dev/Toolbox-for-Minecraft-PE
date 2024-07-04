package defpackage;

import android.text.TextUtils;

/* renamed from: uu1  reason: default package */
public final class uu1 {
    public final String a;
    public final String b;

    public uu1(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && uu1.class == obj.getClass()) {
            uu1 uu1Var = (uu1) obj;
            if (TextUtils.equals(this.a, uu1Var.a) && TextUtils.equals(this.b, uu1Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        return "Header[name=" + str + ",value=" + str2 + "]";
    }
}