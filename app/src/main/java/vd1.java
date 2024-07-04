package defpackage;

import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import defpackage.ud1;
import defpackage.wd1;
import defpackage.xd1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CountDownLatch;

/* renamed from: vd1  reason: default package */
public final class vd1 implements Runnable {
    public final /* synthetic */ ud1 P;
    public final /* synthetic */ SQLiteDatabase Q;
    public final /* synthetic */ wd1 R;
    public final /* synthetic */ CountDownLatch S;

    public vd1(ud1 ud1Var, SQLiteDatabase sQLiteDatabase, wd1 wd1Var, CountDownLatch countDownLatch) {
        this.P = ud1Var;
        this.Q = sQLiteDatabase;
        this.R = wd1Var;
        this.S = countDownLatch;
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x00ac A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x001f A[SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        xd1 xd1Var;
        StringBuilder b;
        String th;
        ArrayList arrayList;
        Throwable th2;
        Iterator it = this.P.b.iterator();
        loop0: while (it.hasNext()) {
            ud1.a aVar = (ud1.a) it.next();
            for (Map.Entry entry : aVar.i.entrySet()) {
                xd1 xd1Var2 = null;
                try {
                    Cursor rawQuery = this.Q.rawQuery((String) entry.getValue(), null);
                    if (rawQuery != null) {
                        try {
                            if (rawQuery.moveToFirst()) {
                                xd1Var = new xd1();
                                for (int i = 0; i < rawQuery.getColumnCount(); i++) {
                                    try {
                                        xd1Var.a.add(new xd1.a(i, rawQuery.getColumnName(i), rawQuery.getType(i)));
                                    } catch (Throwable th3) {
                                        th2 = th3;
                                        try {
                                            rawQuery.close();
                                        } catch (Throwable th4) {
                                            try {
                                                th2.addSuppressed(th4);
                                            } catch (SQLException e) {
                                                e = e;
                                                b = e5.b("SQLException on execute query: ");
                                                th = e.toString();
                                                b.append(th);
                                                t1.b(0, 0, b.toString(), true);
                                                xd1Var2 = xd1Var;
                                                if (xd1Var2 != null) {
                                                }
                                            } catch (Throwable th5) {
                                                th = th5;
                                                b = e5.b("Error on execute query: ");
                                                th = th.toString();
                                                b.append(th);
                                                t1.b(0, 0, b.toString(), true);
                                                xd1Var2 = xd1Var;
                                                if (xd1Var2 != null) {
                                                }
                                            }
                                        }
                                        throw th2;
                                        break loop0;
                                    }
                                }
                                do {
                                    xd1.b(xd1Var, rawQuery);
                                } while (rawQuery.moveToNext());
                                xd1Var2 = xd1Var;
                            }
                        } catch (Throwable th6) {
                            th2 = th6;
                            xd1Var = null;
                        }
                    }
                    if (rawQuery != null) {
                        rawQuery.close();
                    }
                } catch (SQLException e2) {
                    e = e2;
                    xd1Var = null;
                } catch (Throwable th7) {
                    th = th7;
                    xd1Var = null;
                }
                if (xd1Var2 != null) {
                    wd1 wd1Var = this.R;
                    String str = aVar.a;
                    wd1Var.getClass();
                    wd1.a aVar2 = new wd1.a((String) entry.getKey(), xd1Var2);
                    if (wd1Var.b.containsKey(str) && (arrayList = (ArrayList) wd1Var.b.get(str)) != null) {
                        arrayList.add(aVar2);
                    } else {
                        wd1Var.b.put(str, new ArrayList(Collections.singletonList(aVar2)));
                    }
                }
            }
        }
        yd1 c = yd1.c();
        c.c = this.R;
        c.d = true;
        this.S.countDown();
    }
}