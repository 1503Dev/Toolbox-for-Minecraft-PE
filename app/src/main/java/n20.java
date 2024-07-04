package defpackage;

import android.os.Build;
import android.os.LocaleList;
import java.util.Locale;

/* renamed from: n20  reason: default package */
public final class n20 {
    public static final /* synthetic */ int b = 0;
    public p20 a;

    static {
        a(new Locale[0]);
    }

    public n20(p20 p20Var) {
        this.a = p20Var;
    }

    public static n20 a(Locale... localeArr) {
        if (Build.VERSION.SDK_INT >= 24) {
            return new n20(new q20(new LocaleList(localeArr)));
        }
        return new n20(new o20(localeArr));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof n20) && this.a.equals(((n20) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }
}