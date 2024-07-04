package defpackage;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: sj  reason: default package */
public final class sj extends l11<Date> {
    public static final a b = new a();
    public final ArrayList a;

    /* renamed from: sj$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class a implements m11 {
        @Override // defpackage.m11
        public final <T> l11<T> a(xt xtVar, u11<T> u11Var) {
            if (u11Var.a == Date.class) {
                return new sj();
            }
            return null;
        }
    }

    public sj() {
        boolean z;
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(2, 2, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(2, 2));
        }
        if (lz.a >= 9) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            arrayList.add(vx.e(2, 2));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0029, code lost:
        r3 = defpackage.kw.b(r3, new java.text.ParsePosition(0));
     */
    @Override // defpackage.l11
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Date a(c00 c00Var) {
        Date b2;
        if (c00Var.U() == 9) {
            c00Var.Q();
            return null;
        }
        String S = c00Var.S();
        synchronized (this) {
            Iterator it = this.a.iterator();
            while (true) {
                if (it.hasNext()) {
                    try {
                        b2 = ((DateFormat) it.next()).parse(S);
                        break;
                    } catch (ParseException unused) {
                    }
                } else {
                    try {
                        break;
                    } catch (ParseException e) {
                        throw new e00(S, e);
                    }
                }
            }
        }
        return b2;
    }

    @Override // defpackage.l11
    public final void b(i00 i00Var, Date date) {
        Date date2 = date;
        synchronized (this) {
            if (date2 == null) {
                i00Var.H();
            } else {
                i00Var.O(((DateFormat) this.a.get(0)).format(date2));
            }
        }
    }
}