package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;

/* renamed from: es  reason: default package */
public final class es implements vu0 {
    public static final String[] Q = new String[0];
    public final SQLiteDatabase P;

    /* renamed from: es$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class a implements SQLiteDatabase.CursorFactory {
        public final /* synthetic */ xu0 a;

        public a(xu0 xu0Var) {
            this.a = xu0Var;
        }

        @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
        public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
            this.a.g(new hs(sQLiteQuery));
            return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
        }
    }

    public es(SQLiteDatabase sQLiteDatabase) {
        this.P = sQLiteDatabase;
    }

    public final Cursor E(String str) {
        return y(new ys0(str, (Object) null));
    }

    public final void F() {
        this.P.setTransactionSuccessful();
    }

    public final void a() {
        this.P.beginTransaction();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.P.close();
    }

    public final void d() {
        this.P.endTransaction();
    }

    public final void g(String str) {
        this.P.execSQL(str);
    }

    public final String t() {
        return this.P.getPath();
    }

    public final Cursor y(xu0 xu0Var) {
        return this.P.rawQueryWithFactory(new a(xu0Var), xu0Var.d(), Q, null);
    }
}