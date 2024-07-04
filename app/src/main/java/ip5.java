package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import java.util.Arrays;

/* renamed from: ip5  reason: default package */
public final class ip5 {
    public static final Uri e = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();
    public final String a;
    public final String b;
    public final int c;
    public final boolean d;

    public ip5(String str, int i, String str2, boolean z) {
        if (!TextUtils.isEmpty(str)) {
            this.a = str;
            if (!TextUtils.isEmpty(str2)) {
                this.b = str2;
                this.c = i;
                this.d = z;
                return;
            }
            throw new IllegalArgumentException("Given String is empty or null");
        }
        throw new IllegalArgumentException("Given String is empty or null");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ip5) {
            ip5 ip5Var = (ip5) obj;
            return wa0.a(this.a, ip5Var.a) && wa0.a(this.b, ip5Var.b) && wa0.a(null, null) && this.c == ip5Var.c && this.d == ip5Var.d;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, null, Integer.valueOf(this.c), Boolean.valueOf(this.d)});
    }

    public final String toString() {
        String str = this.a;
        if (str != null) {
            return str;
        }
        uf0.f(null);
        throw null;
    }
}