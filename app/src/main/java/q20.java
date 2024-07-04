package defpackage;

import android.os.LocaleList;
import java.util.Locale;

/* renamed from: q20  reason: default package */
public final class q20 implements p20 {
    public final LocaleList a;

    public q20(LocaleList localeList) {
        this.a = localeList;
    }

    @Override // defpackage.p20
    public final Object a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        return this.a.equals(((p20) obj).a());
    }

    @Override // defpackage.p20
    public final Locale get() {
        return this.a.get(0);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }
}