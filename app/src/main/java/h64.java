package defpackage;

import android.os.RemoteException;
import android.os.SystemClock;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: h64  reason: default package */
public final class h64 extends bn2 {
    public static final /* synthetic */ int U = 0;
    public final zm2 P;
    public final bx2 Q;
    public final JSONObject R;
    public final long S;
    public boolean T;

    public h64(String str, zm2 zm2Var, bx2 bx2Var, long j) {
        JSONObject jSONObject = new JSONObject();
        this.R = jSONObject;
        this.T = false;
        this.Q = bx2Var;
        this.P = zm2Var;
        this.S = j;
        try {
            jSONObject.put("adapter_version", zm2Var.e().toString());
            jSONObject.put("sdk_version", zm2Var.h().toString());
            jSONObject.put("name", str);
        } catch (RemoteException | NullPointerException | JSONException unused) {
        }
    }

    public final synchronized void t4(int i, String str) {
        if (this.T) {
            return;
        }
        try {
            this.R.put("signal_error", str);
            l92 l92Var = x92.l1;
            w82 w82Var = w82.d;
            if (((Boolean) w82Var.c.a(l92Var)).booleanValue()) {
                JSONObject jSONObject = this.R;
                jv5.A.j.getClass();
                jSONObject.put("latency", SystemClock.elapsedRealtime() - this.S);
            }
            if (((Boolean) w82Var.c.a(x92.k1)).booleanValue()) {
                this.R.put("signal_error_code", i);
            }
        } catch (JSONException unused) {
        }
        this.Q.a(this.R);
        this.T = true;
    }
}