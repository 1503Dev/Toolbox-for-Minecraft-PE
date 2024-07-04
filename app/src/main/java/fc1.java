package defpackage;

import java.util.Collections;
import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: fc1  reason: default package */
public final class fc1 extends fa1 {
    public fc1(ta1 ta1Var, HashSet hashSet, JSONObject jSONObject, long j) {
        super(ta1Var, hashSet, jSONObject, j);
    }

    @Override // defpackage.ua1, android.os.AsyncTask
    /* renamed from: a */
    public final void onPostExecute(String str) {
        aa1 aa1Var = aa1.c;
        if (aa1Var != null) {
            for (z91 z91Var : Collections.unmodifiableCollection(aa1Var.a)) {
                if (this.c.contains(z91Var.m)) {
                    g3 g3Var = z91Var.j;
                    if (this.e >= g3Var.e && g3Var.d != 3) {
                        g3Var.d = 3;
                        gw.d(g3Var.f(), "setNativeViewHierarchy", str);
                    }
                }
            }
        }
        super.onPostExecute(str);
    }

    @Override // android.os.AsyncTask
    public final String doInBackground(Object[] objArr) {
        return this.d.toString();
    }
}