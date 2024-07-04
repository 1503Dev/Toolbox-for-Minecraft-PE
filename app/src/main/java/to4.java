package defpackage;

import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: to4  reason: default package */
public abstract class to4 extends uo4 {
    public final HashSet c;
    public final JSONObject d;
    public final long e;

    public to4(no4 no4Var, HashSet hashSet, JSONObject jSONObject, long j) {
        super(no4Var);
        this.c = new HashSet(hashSet);
        this.d = jSONObject;
        this.e = j;
    }

    @Override // defpackage.uo4, android.os.AsyncTask
    public /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        onPostExecute((String) obj);
    }
}