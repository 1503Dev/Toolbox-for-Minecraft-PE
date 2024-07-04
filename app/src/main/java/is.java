package defpackage;

import android.database.sqlite.SQLiteStatement;

/* renamed from: is  reason: default package */
public final class is extends hs {
    public final SQLiteStatement Q;

    public is(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        this.Q = sQLiteStatement;
    }

    public final int E() {
        return this.Q.executeUpdateDelete();
    }
}