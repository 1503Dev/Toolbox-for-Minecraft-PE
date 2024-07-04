package defpackage;

import java.security.Provider;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.TimeZone;
import java.util.regex.Pattern;
import javax.crypto.KeyAgreement;

/* renamed from: zf  reason: default package */
public final class zf implements ta0, wy4, hc5, iu5 {
    public static final al4 P = new al4();
    public static final /* synthetic */ zf Q = new zf();

    public /* synthetic */ zf() {
    }

    public static Calendar a(Calendar calendar) {
        Calendar b = b(calendar);
        Calendar b2 = b(null);
        b2.set(b.get(1), b.get(2), b.get(5));
        return b2;
    }

    public static Calendar b(Calendar calendar) {
        Calendar calendar2 = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        if (calendar == null) {
            calendar2.clear();
        } else {
            calendar2.setTimeInMillis(calendar.getTimeInMillis());
        }
        return calendar2;
    }

    @Override // defpackage.hc5
    public /* bridge */ /* synthetic */ Object c(String str, Provider provider) {
        return provider == null ? KeyAgreement.getInstance(str) : KeyAgreement.getInstance(str, provider);
    }

    @Override // defpackage.ta0
    public Object d() {
        return new ArrayList();
    }

    @Override // defpackage.iu5
    public int e(Object obj) {
        Pattern pattern = lu5.a;
        return ((pt5) obj).a.startsWith("OMX.google") ? 1 : 0;
    }

    @Override // defpackage.wy4
    public /* synthetic */ void f(Object obj) {
        ((y03) obj).destroy();
    }

    @Override // defpackage.wy4
    public void h(Throwable th) {
    }

    public /* synthetic */ zf(int i) {
    }
}