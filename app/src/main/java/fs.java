package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build;
import android.util.Log;
import android.util.Pair;
import androidx.work.impl.WorkDatabase_Impl;
import defpackage.bm0;
import defpackage.dm0;
import defpackage.wu0;
import java.io.File;
import java.io.IOException;
import java.util.List;

/* renamed from: fs  reason: default package */
public final class fs implements wu0 {
    public final Context P;
    public final String Q;
    public final wu0.a R;
    public final boolean S;
    public final Object T = new Object();
    public a U;
    public boolean V;

    /* renamed from: fs$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class a extends SQLiteOpenHelper {
        public final es[] P;
        public final wu0.a Q;
        public boolean R;

        /* renamed from: fs$a$a  reason: collision with other inner class name */
        /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
        public class C0034a implements DatabaseErrorHandler {
            public final /* synthetic */ wu0.a a;
            public final /* synthetic */ es[] b;

            public C0034a(wu0.a aVar, es[] esVarArr) {
                this.a = aVar;
                this.b = esVarArr;
            }

            /* JADX WARN: Code restructure failed: missing block: B:8:0x0010, code lost:
                if (r3 == false) goto L38;
             */
            @Override // android.database.DatabaseErrorHandler
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
                boolean z;
                wu0.a aVar = this.a;
                es[] esVarArr = this.b;
                es esVar = esVarArr[0];
                if (esVar != null) {
                    if (esVar.P == sQLiteDatabase) {
                        z = true;
                    } else {
                        z = false;
                    }
                }
                esVarArr[0] = new es(sQLiteDatabase);
                es esVar2 = esVarArr[0];
                aVar.getClass();
                Log.e("SupportSQLite", "Corruption reported by sqlite on database: " + esVar2.t());
                if (esVar2.P.isOpen()) {
                    List<Pair<String, String>> list = null;
                    try {
                        try {
                            list = esVar2.P.getAttachedDbs();
                        } finally {
                            if (list != null) {
                                for (Pair<String, String> next : list) {
                                    wu0.a.a((String) next.second);
                                }
                            } else {
                                wu0.a.a(esVar2.t());
                            }
                        }
                    } catch (SQLiteException unused) {
                    }
                    try {
                        esVar2.close();
                    } catch (IOException unused2) {
                    }
                }
            }
        }

        public a(Context context, String str, es[] esVarArr, wu0.a aVar) {
            super(context, str, null, aVar.a, new C0034a(aVar, esVarArr));
            this.Q = aVar;
            this.P = esVarArr;
        }

        /* JADX WARN: Code restructure failed: missing block: B:8:0x000e, code lost:
            if (r2 == false) goto L11;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final es a(SQLiteDatabase sQLiteDatabase) {
            boolean z;
            es[] esVarArr = this.P;
            es esVar = esVarArr[0];
            if (esVar != null) {
                if (esVar.P == sQLiteDatabase) {
                    z = true;
                } else {
                    z = false;
                }
            }
            esVarArr[0] = new es(sQLiteDatabase);
            return esVarArr[0];
        }

        @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
        public final synchronized void close() {
            super.close();
            this.P[0] = null;
        }

        public final synchronized vu0 d() {
            this.R = false;
            SQLiteDatabase writableDatabase = getWritableDatabase();
            if (!this.R) {
                return a(writableDatabase);
            }
            close();
            return d();
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
            wu0.a aVar = this.Q;
            a(sQLiteDatabase);
            aVar.getClass();
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x002b  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x005a  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0070 A[ORIG_RETURN, RETURN] */
        @Override // android.database.sqlite.SQLiteOpenHelper
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void onCreate(SQLiteDatabase sQLiteDatabase) {
            boolean z;
            List<bm0.b> list;
            wu0.a aVar = this.Q;
            es a = a(sQLiteDatabase);
            dm0 dm0Var = (dm0) aVar;
            dm0Var.getClass();
            Cursor E = a.E("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
            try {
                if (E.moveToFirst()) {
                    if (E.getInt(0) == 0) {
                        z = true;
                        E.close();
                        dm0Var.c.a(a);
                        if (!z) {
                            dm0.b b = dm0Var.c.b(a);
                            if (!b.a) {
                                StringBuilder b2 = e5.b("Pre-packaged database has an invalid schema: ");
                                b2.append(b.b);
                                throw new IllegalStateException(b2.toString());
                            }
                        }
                        dm0Var.c(a);
                        WorkDatabase_Impl.a aVar2 = (WorkDatabase_Impl.a) dm0Var.c;
                        WorkDatabase_Impl workDatabase_Impl = WorkDatabase_Impl.this;
                        int i = WorkDatabase_Impl.s;
                        list = workDatabase_Impl.g;
                        if (list == null) {
                            int size = list.size();
                            for (int i2 = 0; i2 < size; i2++) {
                                WorkDatabase_Impl.this.g.get(i2).getClass();
                            }
                            return;
                        }
                        return;
                    }
                }
                z = false;
                E.close();
                dm0Var.c.a(a);
                if (!z) {
                }
                dm0Var.c(a);
                WorkDatabase_Impl.a aVar22 = (WorkDatabase_Impl.a) dm0Var.c;
                WorkDatabase_Impl workDatabase_Impl2 = WorkDatabase_Impl.this;
                int i3 = WorkDatabase_Impl.s;
                list = workDatabase_Impl2.g;
                if (list == null) {
                }
            } catch (Throwable th) {
                E.close();
                throw th;
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            this.R = true;
            ((dm0) this.Q).b(a(sQLiteDatabase), i, i2);
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x002c  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0064  */
        /* JADX WARN: Removed duplicated region for block: B:56:0x008a A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // android.database.sqlite.SQLiteOpenHelper
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void onOpen(SQLiteDatabase sQLiteDatabase) {
            boolean z;
            iy iyVar;
            String str;
            if (!this.R) {
                wu0.a aVar = this.Q;
                es a = a(sQLiteDatabase);
                dm0 dm0Var = (dm0) aVar;
                dm0Var.getClass();
                Cursor E = a.E("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'");
                try {
                    if (E.moveToFirst()) {
                        if (E.getInt(0) != 0) {
                            z = true;
                            E.close();
                            if (!z) {
                                Cursor y = a.y(new ys0("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1", (Object) null));
                                try {
                                    if (y.moveToFirst()) {
                                        str = y.getString(0);
                                    } else {
                                        str = null;
                                    }
                                    y.close();
                                    if (!"c103703e120ae8cc73c9248622f3cd1e".equals(str) && !"49f946663a8deb7054212b8adda248c6".equals(str)) {
                                        throw new IllegalStateException("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number.");
                                    }
                                } catch (Throwable th) {
                                    y.close();
                                    throw th;
                                }
                            } else {
                                dm0.b b = dm0Var.c.b(a);
                                if (b.a) {
                                    dm0Var.c.getClass();
                                    dm0Var.c(a);
                                } else {
                                    StringBuilder b2 = e5.b("Pre-packaged database has an invalid schema: ");
                                    b2.append(b.b);
                                    throw new IllegalStateException(b2.toString());
                                }
                            }
                            WorkDatabase_Impl.a aVar2 = (WorkDatabase_Impl.a) dm0Var.c;
                            WorkDatabase_Impl workDatabase_Impl = WorkDatabase_Impl.this;
                            int i = WorkDatabase_Impl.s;
                            workDatabase_Impl.a = a;
                            a.g("PRAGMA foreign_keys = ON");
                            iyVar = WorkDatabase_Impl.this.d;
                            synchronized (iyVar) {
                                if (iyVar.e) {
                                    Log.e("ROOM", "Invalidation tracker is initialized twice :/.");
                                } else {
                                    a.g("PRAGMA temp_store = MEMORY;");
                                    a.g("PRAGMA recursive_triggers='ON';");
                                    a.g("CREATE TEMP TABLE room_table_modification_log(table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
                                    iyVar.c(a);
                                    iyVar.f = new is(a.P.compileStatement("UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1 "));
                                    iyVar.e = true;
                                }
                            }
                            List<bm0.b> list = WorkDatabase_Impl.this.g;
                            if (list != null) {
                                int size = list.size();
                                for (int i2 = 0; i2 < size; i2++) {
                                    WorkDatabase_Impl.this.g.get(i2).a(a);
                                }
                            }
                            dm0Var.b = null;
                            return;
                        }
                    }
                    z = false;
                    E.close();
                    if (!z) {
                    }
                    WorkDatabase_Impl.a aVar22 = (WorkDatabase_Impl.a) dm0Var.c;
                    WorkDatabase_Impl workDatabase_Impl2 = WorkDatabase_Impl.this;
                    int i3 = WorkDatabase_Impl.s;
                    workDatabase_Impl2.a = a;
                    a.g("PRAGMA foreign_keys = ON");
                    iyVar = WorkDatabase_Impl.this.d;
                    synchronized (iyVar) {
                    }
                } catch (Throwable th2) {
                    E.close();
                    throw th2;
                }
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            this.R = true;
            this.Q.b(a(sQLiteDatabase), i, i2);
        }
    }

    public fs(Context context, String str, wu0.a aVar, boolean z) {
        this.P = context;
        this.Q = str;
        this.R = aVar;
        this.S = z;
    }

    public final a a() {
        a aVar;
        File noBackupFilesDir;
        synchronized (this.T) {
            if (this.U == null) {
                es[] esVarArr = new es[1];
                if (Build.VERSION.SDK_INT < 23 || this.Q == null || !this.S) {
                    this.U = new a(this.P, this.Q, esVarArr, this.R);
                } else {
                    noBackupFilesDir = this.P.getNoBackupFilesDir();
                    this.U = new a(this.P, new File(noBackupFilesDir, this.Q).getAbsolutePath(), esVarArr, this.R);
                }
                this.U.setWriteAheadLoggingEnabled(this.V);
            }
            aVar = this.U;
        }
        return aVar;
    }

    @Override // defpackage.wu0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        a().close();
    }

    @Override // defpackage.wu0
    public final String getDatabaseName() {
        return this.Q;
    }

    @Override // defpackage.wu0
    public final void setWriteAheadLoggingEnabled(boolean z) {
        synchronized (this.T) {
            a aVar = this.U;
            if (aVar != null) {
                aVar.setWriteAheadLoggingEnabled(z);
            }
            this.V = z;
        }
    }

    @Override // defpackage.wu0
    public final vu0 x() {
        return a().d();
    }
}