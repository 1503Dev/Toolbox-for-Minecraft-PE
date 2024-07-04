package defpackage;

import android.text.TextUtils;

/* renamed from: wt5  reason: default package */
public final class wt5 {
    public final String a;
    public final boolean b;
    public final boolean c;

    public wt5(String str, boolean z, boolean z2) {
        this.a = str;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == wt5.class) {
            wt5 wt5Var = (wt5) obj;
            if (TextUtils.equals(this.a, wt5Var.a) && this.b == wt5Var.b && this.c == wt5Var.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() + 31;
        return (((hashCode * 31) + (true != this.b ? 1237 : 1231)) * 31) + (true == this.c ? 1231 : 1237);
    }
}