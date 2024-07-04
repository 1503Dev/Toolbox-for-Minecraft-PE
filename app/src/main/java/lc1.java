package defpackage;

import android.text.TextUtils;
import defpackage.ua1;
import java.util.Collections;
import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: lc1  reason: default package */
public final class lc1 extends fa1 {
    public lc1(ta1 ta1Var, HashSet hashSet, JSONObject jSONObject, long j) {
        super(ta1Var, hashSet, jSONObject, j);
    }

    @Override // defpackage.ua1, android.os.AsyncTask
    /* renamed from: a */
    public final void onPostExecute(String str) {
        aa1 aa1Var;
        if (!TextUtils.isEmpty(str) && (aa1Var = aa1.c) != null) {
            for (z91 z91Var : Collections.unmodifiableCollection(aa1Var.a)) {
                if (this.c.contains(z91Var.m)) {
                    g3 g3Var = z91Var.j;
                    if (this.e >= g3Var.e) {
                        g3Var.d = 2;
                        gw.d(g3Var.f(), "setNativeViewHierarchy", str);
                    }
                }
            }
        }
        super.onPostExecute(str);
    }

    @Override // android.os.AsyncTask
    public final String doInBackground(Object[] objArr) {
        if (sa1.d(this.d, ((ta1) this.b).a)) {
            return null;
        }
        ua1.b bVar = this.b;
        JSONObject jSONObject = this.d;
        ((ta1) bVar).a = jSONObject;
        return jSONObject.toString();
    }
}