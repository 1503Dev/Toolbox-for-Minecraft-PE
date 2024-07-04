package defpackage;

import android.os.Bundle;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: rl0  reason: default package */
public final class rl0 {
    public final mq3 a;
    public final ArrayList b = new ArrayList();
    public k3 c;

    public rl0(mq3 mq3Var) {
        k3 k3Var;
        this.a = mq3Var;
        if (mq3Var != null) {
            try {
                List<fw5> j = mq3Var.j();
                if (j != null) {
                    for (fw5 fw5Var : j) {
                        if (fw5Var != null) {
                            k3Var = new k3(fw5Var);
                        } else {
                            k3Var = null;
                        }
                        if (k3Var != null) {
                            this.b.add(k3Var);
                        }
                    }
                }
            } catch (RemoteException e) {
                sv2.e("Could not forward getAdapterResponseInfo to ResponseInfo.", e);
            }
        }
        mq3 mq3Var2 = this.a;
        if (mq3Var2 != null) {
            try {
                fw5 e2 = mq3Var2.e();
                if (e2 != null) {
                    this.c = new k3(e2);
                }
            } catch (RemoteException e3) {
                sv2.e("Could not forward getLoadedAdapterResponse to ResponseInfo.", e3);
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(22:1|(2:2|3)|(19:5|6|(1:8)(1:40)|9|10|(1:12)|14|(1:16)(1:37)|17|(2:20|18)|21|22|(1:24)|25|26|(3:28|(1:30)|31)|34|(0)|31)|42|6|(0)(0)|9|10|(0)|14|(0)(0)|17|(1:18)|21|22|(0)|25|26|(0)|34|(0)|31) */
    /* JADX WARN: Can't wrap try/catch for region: R(23:1|2|3|(19:5|6|(1:8)(1:40)|9|10|(1:12)|14|(1:16)(1:37)|17|(2:20|18)|21|22|(1:24)|25|26|(3:28|(1:30)|31)|34|(0)|31)|42|6|(0)(0)|9|10|(0)|14|(0)(0)|17|(1:18)|21|22|(0)|25|26|(0)|34|(0)|31) */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002c, code lost:
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x002d, code lost:
        defpackage.sv2.e("Could not forward getMediationAdapterClassName to ResponseInfo.", r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0077, code lost:
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0078, code lost:
        defpackage.sv2.e("Could not forward getResponseExtras to ResponseInfo.", r1);
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x001c  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0027 A[Catch: RemoteException -> 0x002c, TRY_LEAVE, TryCatch #0 {RemoteException -> 0x002c, blocks: (B:14:0x0023, B:16:0x0027), top: B:41:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004e A[LOOP:0: B:25:0x0048->B:27:0x004e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0072 A[Catch: RemoteException -> 0x0077, TRY_LEAVE, TryCatch #2 {RemoteException -> 0x0077, blocks: (B:31:0x006e, B:33:0x0072), top: B:45:0x006e }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final JSONObject a() {
        String str;
        Iterator it;
        k3 k3Var;
        Bundle bundle;
        mq3 mq3Var;
        mq3 mq3Var2;
        mq3 mq3Var3;
        JSONObject jSONObject = new JSONObject();
        String str2 = null;
        try {
            mq3Var3 = this.a;
        } catch (RemoteException e) {
            sv2.e("Could not forward getResponseId to ResponseInfo.", e);
        }
        if (mq3Var3 != null) {
            str = mq3Var3.g();
            if (str != null) {
                jSONObject.put("Response ID", "null");
            } else {
                jSONObject.put("Response ID", str);
            }
            mq3Var2 = this.a;
            if (mq3Var2 != null) {
                str2 = mq3Var2.h();
            }
            if (str2 != null) {
                jSONObject.put("Mediation Adapter Class Name", "null");
            } else {
                jSONObject.put("Mediation Adapter Class Name", str2);
            }
            JSONArray jSONArray = new JSONArray();
            it = this.b.iterator();
            while (it.hasNext()) {
                jSONArray.put(((k3) it.next()).a());
            }
            jSONObject.put("Adapter Responses", jSONArray);
            k3Var = this.c;
            if (k3Var != null) {
                jSONObject.put("Loaded Adapter Response", k3Var.a());
            }
            mq3Var = this.a;
            if (mq3Var != null) {
                bundle = mq3Var.b();
                if (bundle != null) {
                    jSONObject.put("Response Extras", n62.f.a.f(bundle));
                }
                return jSONObject;
            }
            bundle = new Bundle();
            if (bundle != null) {
            }
            return jSONObject;
        }
        str = null;
        if (str != null) {
        }
        mq3Var2 = this.a;
        if (mq3Var2 != null) {
        }
        if (str2 != null) {
        }
        JSONArray jSONArray2 = new JSONArray();
        it = this.b.iterator();
        while (it.hasNext()) {
        }
        jSONObject.put("Adapter Responses", jSONArray2);
        k3Var = this.c;
        if (k3Var != null) {
        }
        mq3Var = this.a;
        if (mq3Var != null) {
        }
        bundle = new Bundle();
        if (bundle != null) {
        }
        return jSONObject;
    }

    public final String toString() {
        try {
            return a().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }
}