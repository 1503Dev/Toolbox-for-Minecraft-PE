package defpackage;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/* renamed from: pt0  reason: default package */
public final class pt0 extends l11<Date> {
    public static final a b = new a();
    public final SimpleDateFormat a = new SimpleDateFormat("MMM d, yyyy");

    /* renamed from: pt0$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class a implements m11 {
        @Override // defpackage.m11
        public final <T> l11<T> a(xt xtVar, u11<T> u11Var) {
            if (u11Var.a == Date.class) {
                return new pt0();
            }
            return null;
        }
    }

    @Override // defpackage.l11
    public final Date a(c00 c00Var) {
        Date date;
        synchronized (this) {
            if (c00Var.U() == 9) {
                c00Var.Q();
                date = null;
            } else {
                try {
                    date = new Date(this.a.parse(c00Var.S()).getTime());
                } catch (ParseException e) {
                    throw new e00(e);
                }
            }
        }
        return date;
    }

    @Override // defpackage.l11
    public final void b(i00 i00Var, Date date) {
        Date date2 = date;
        synchronized (this) {
            i00Var.O(date2 == null ? null : this.a.format((java.util.Date) date2));
        }
    }
}