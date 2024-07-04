package defpackage;

import java.util.Collections;
import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: yo4  reason: default package */
public final class yo4 extends to4 {
    public yo4(no4 no4Var, HashSet hashSet, JSONObject jSONObject, long j) {
        super(no4Var, hashSet, jSONObject, j);
    }

    @Override // defpackage.uo4
    public final void a(String str) {
        b(str);
        super.onPostExecute(str);
    }

    public final void b(String str) {
        un4 un4Var = un4.c;
        if (un4Var != null) {
            for (nn4 nn4Var : Collections.unmodifiableCollection(un4Var.a)) {
                if (this.c.contains(nn4Var.g)) {
                    go4 go4Var = nn4Var.d;
                    if (this.e >= go4Var.b && go4Var.c != 3) {
                        go4Var.c = 3;
                        yn4.a(go4Var.a(), "setNativeViewHierarchy", str);
                    }
                }
            }
        }
    }

    @Override // android.os.AsyncTask
    public final /* synthetic */ Object doInBackground(Object[] objArr) {
        return this.d.toString();
    }

    @Override // defpackage.to4, defpackage.uo4, android.os.AsyncTask
    public final /* synthetic */ void onPostExecute(Object obj) {
        String str = (String) obj;
        b(str);
        super.onPostExecute(str);
    }
}