package defpackage;

import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/* renamed from: bx0  reason: default package */
public final class bx0 extends l11<Time> {
    public static final a b = new a();
    public final SimpleDateFormat a = new SimpleDateFormat("hh:mm:ss a");

    /* renamed from: bx0$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class a implements m11 {
        @Override // defpackage.m11
        public final <T> l11<T> a(xt xtVar, u11<T> u11Var) {
            if (u11Var.a == Time.class) {
                return new bx0();
            }
            return null;
        }
    }

    @Override // defpackage.l11
    public final Time a(c00 c00Var) {
        synchronized (this) {
            if (c00Var.U() == 9) {
                c00Var.Q();
                return null;
            }
            try {
                return new Time(this.a.parse(c00Var.S()).getTime());
            } catch (ParseException e) {
                throw new e00(e);
            }
        }
    }

    @Override // defpackage.l11
    public final void b(i00 i00Var, Time time) {
        Time time2 = time;
        synchronized (this) {
            i00Var.O(time2 == null ? null : this.a.format((Date) time2));
        }
    }
}