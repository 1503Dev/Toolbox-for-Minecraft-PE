package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import defpackage.ud1;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;

/* renamed from: if1  reason: default package */
public final class if1 {
    public static if1 f;
    public SQLiteDatabase b;
    public b d;
    public final ExecutorService a = Executors.newSingleThreadExecutor();
    public boolean c = false;
    public HashSet e = new HashSet();

    /* renamed from: if1$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class a implements Runnable {
        public final /* synthetic */ String P;
        public final /* synthetic */ ContentValues Q;

        public a(String str, ContentValues contentValues) {
            this.P = str;
            this.Q = contentValues;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if1 if1Var = if1.this;
            String str = this.P;
            ContentValues contentValues = this.Q;
            synchronized (if1Var) {
                p5.b(str, contentValues, if1Var.b);
            }
        }
    }

    /* renamed from: if1$b */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public interface b {
    }

    public static if1 a() {
        if (f == null) {
            synchronized (if1.class) {
                if (f == null) {
                    f = new if1();
                }
            }
        }
        return f;
    }

    public final void b(String str, ContentValues contentValues) {
        if (this.c) {
            try {
                this.a.execute(new a(str, contentValues));
            } catch (RejectedExecutionException e) {
                StringBuilder sb = new StringBuilder();
                StringBuilder b2 = e5.b("ADCEventsRepository.saveEvent failed with: ");
                b2.append(e.toString());
                sb.append(b2.toString());
                t1.b(0, 0, sb.toString(), true);
            }
        }
    }

    public final void c(ud1.a aVar, ContentValues contentValues) {
        String str;
        long j;
        if (!this.e.contains(aVar.b)) {
            this.e.add(aVar.b);
            int i = aVar.c;
            ud1.d dVar = aVar.h;
            long j2 = -1;
            if (dVar != null) {
                j = contentValues.getAsLong(dVar.b).longValue() - dVar.a;
                str = dVar.b;
            } else {
                str = null;
                j = -1;
            }
            String str2 = aVar.b;
            SQLiteDatabase sQLiteDatabase = this.b;
            try {
                try {
                    sQLiteDatabase.beginTransaction();
                    if (str == null) {
                        str = "rowid";
                    } else {
                        j2 = j;
                    }
                    if (i >= 0) {
                        Cursor rawQuery = sQLiteDatabase.rawQuery("select " + str + " from " + str2 + " order by " + str + " desc limit 1 offset " + i, null);
                        if (rawQuery.moveToFirst()) {
                            j2 = Math.max(j2, rawQuery.getLong(0));
                        }
                        rawQuery.close();
                    }
                    if (j2 >= 0) {
                        sQLiteDatabase.execSQL("delete from " + str2 + " where " + str + " <= " + j2);
                    }
                    sQLiteDatabase.setTransactionSuccessful();
                } catch (SQLException e) {
                    ga1.h().n().d(0, 1, "Exception on deleting excessive rows:" + e.toString(), true);
                }
                sQLiteDatabase.endTransaction();
            } catch (Throwable th) {
                StringBuilder b2 = e5.b("Error on deleting excessive rows:");
                b2.append(th.toString());
                t1.b(0, 0, b2.toString(), true);
            }
        }
    }

    public final boolean d(ud1 ud1Var) {
        boolean z;
        SQLiteDatabase sQLiteDatabase = this.b;
        td1 td1Var = new td1(sQLiteDatabase, ud1Var);
        int version = sQLiteDatabase.getVersion();
        sQLiteDatabase.beginTransaction();
        boolean z2 = true;
        try {
            try {
                ArrayList arrayList = ud1Var.b;
                ArrayList<String> a2 = td1Var.a();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ud1.a aVar = (ud1.a) it.next();
                    if (a2.contains(aVar.b)) {
                        td1Var.e(aVar);
                    } else {
                        td1Var.c(aVar);
                        Iterator it2 = aVar.g.iterator();
                        while (it2.hasNext()) {
                            td1Var.b((ud1.c) it2.next(), aVar.b);
                        }
                    }
                    a2.remove(aVar.b);
                }
                Iterator<String> it3 = a2.iterator();
                while (it3.hasNext()) {
                    SQLiteDatabase sQLiteDatabase2 = td1Var.a;
                    sQLiteDatabase2.execSQL("DROP TABLE " + it3.next());
                }
                td1Var.a.setVersion(td1Var.b.a);
                td1Var.a.setTransactionSuccessful();
                try {
                    ga1.h().n().d(0, 2, "Success upgrading database from " + version + " to " + td1Var.b.a, true);
                } catch (SQLException e) {
                    e = e;
                    z = true;
                    ga1.h().n().d(0, 1, "Upgrading database from " + version + " to " + td1Var.b.a + "caused: " + e.toString(), true);
                    z2 = z;
                    td1Var.a.endTransaction();
                    return z2;
                }
            } catch (SQLException e2) {
                e = e2;
                z = false;
            }
            td1Var.a.endTransaction();
            return z2;
        } catch (Throwable th) {
            td1Var.a.endTransaction();
            throw th;
        }
    }
}