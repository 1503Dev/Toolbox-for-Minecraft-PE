package defpackage;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: ek  reason: default package */
public final class ek extends l11<Date> {
    public final Class<? extends Date> a;
    public final ArrayList b;

    public ek(int i, int i2, Class cls) {
        boolean z;
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        c(cls);
        this.a = cls;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(i, i2, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(i, i2));
        }
        if (lz.a >= 9) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            arrayList.add(vx.e(i, i2));
        }
    }

    public static void c(Class cls) {
        if (cls == Date.class || cls == java.sql.Date.class || cls == Timestamp.class) {
            return;
        }
        throw new IllegalArgumentException("Date type must be one of " + Date.class + ", " + Timestamp.class + ", or " + java.sql.Date.class + " but was " + cls);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002b, code lost:
        r4 = defpackage.kw.b(r4, new java.text.ParsePosition(0));
     */
    @Override // defpackage.l11
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Date a(c00 c00Var) {
        Date b;
        Date date;
        if (c00Var.U() == 9) {
            c00Var.Q();
            return null;
        }
        String S = c00Var.S();
        synchronized (this.b) {
            Iterator it = this.b.iterator();
            while (true) {
                if (it.hasNext()) {
                    try {
                        b = ((DateFormat) it.next()).parse(S);
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
        Class<? extends Date> cls = this.a;
        if (cls != Date.class) {
            if (cls == Timestamp.class) {
                date = new Timestamp(b.getTime());
            } else if (cls == java.sql.Date.class) {
                date = new java.sql.Date(b.getTime());
            } else {
                throw new AssertionError();
            }
            return date;
        }
        return b;
    }

    @Override // defpackage.l11
    public final void b(i00 i00Var, Date date) {
        Date date2 = date;
        if (date2 == null) {
            i00Var.H();
            return;
        }
        synchronized (this.b) {
            i00Var.O(((DateFormat) this.b.get(0)).format(date2));
        }
    }

    public final String toString() {
        StringBuilder b;
        String simpleName;
        DateFormat dateFormat = (DateFormat) this.b.get(0);
        if (dateFormat instanceof SimpleDateFormat) {
            b = e5.b("DefaultDateTypeAdapter(");
            simpleName = ((SimpleDateFormat) dateFormat).toPattern();
        } else {
            b = e5.b("DefaultDateTypeAdapter(");
            simpleName = dateFormat.getClass().getSimpleName();
        }
        b.append(simpleName);
        b.append(')');
        return b.toString();
    }
}