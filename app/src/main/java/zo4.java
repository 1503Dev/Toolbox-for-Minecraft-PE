package defpackage;

import android.text.TextUtils;
import java.util.Collections;
import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: zo4  reason: default package */
public final class zo4 extends to4 {
    public zo4(no4 no4Var, HashSet hashSet, JSONObject jSONObject, long j) {
        super(no4Var, hashSet, jSONObject, j);
    }

    @Override // defpackage.uo4
    public final void a(String str) {
        un4 un4Var;
        if (!TextUtils.isEmpty(str) && (un4Var = un4.c) != null) {
            for (nn4 nn4Var : Collections.unmodifiableCollection(un4Var.a)) {
                if (this.c.contains(nn4Var.g)) {
                    go4 go4Var = nn4Var.d;
                    if (this.e >= go4Var.b) {
                        go4Var.c = 2;
                        yn4.a(go4Var.a(), "setNativeViewHierarchy", str);
                    }
                }
            }
        }
        super.onPostExecute(str);
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        if (jo4.d(this.d, (JSONObject) this.b.P)) {
            return null;
        }
        no4 no4Var = this.b;
        JSONObject jSONObject = this.d;
        no4Var.P = jSONObject;
        return jSONObject.toString();
    }
}