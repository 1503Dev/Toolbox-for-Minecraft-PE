package defpackage;

import android.database.sqlite.SQLiteDatabase;
import android.os.Parcel;

/* renamed from: p04  reason: default package */
public final /* synthetic */ class p04 implements bl4, kg4 {
    public final /* synthetic */ String P;
    public final /* synthetic */ Object Q;
    public final /* synthetic */ Object R;

    public /* synthetic */ p04(r04 r04Var, wv2 wv2Var, String str) {
        this.Q = r04Var;
        this.R = wv2Var;
        this.P = str;
    }

    @Override // defpackage.bl4
    public final Object e(Object obj) {
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        ((r04) this.Q).Q.execute(new o04(0, sQLiteDatabase, this.P, (wv2) this.R));
        return null;
    }

    @Override // defpackage.kg4, defpackage.v64
    /* renamed from: e  reason: collision with other method in class */
    public final void mo5e(Object obj) {
        String str = this.P;
        dr2 dr2Var = (dr2) obj;
        Parcel A = dr2Var.A();
        k22.e(A, (cr2) this.Q);
        A.writeString(str);
        A.writeString((String) this.R);
        dr2Var.c0(A, 2);
    }
}