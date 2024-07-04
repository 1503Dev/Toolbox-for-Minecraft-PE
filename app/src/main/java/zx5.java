package defpackage;

import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Pair;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: zx5  reason: default package */
public final class zx5 implements wy4 {
    public final /* synthetic */ dz4 P;
    public final /* synthetic */ ku2 Q;
    public final /* synthetic */ du2 R;
    public final /* synthetic */ hm4 S;
    public final /* synthetic */ long T;
    public final /* synthetic */ dk1 U;

    public zx5(dk1 dk1Var, dz4 dz4Var, ku2 ku2Var, du2 du2Var, hm4 hm4Var, long j) {
        this.U = dk1Var;
        this.P = dz4Var;
        this.Q = ku2Var;
        this.R = du2Var;
        this.S = hm4Var;
        this.T = j;
    }

    @Override // defpackage.wy4
    public final void f(Object obj) {
        hm4 hm4Var;
        ew1 ew1Var = (ew1) obj;
        qm4 B4 = dk1.B4(this.P, this.Q);
        l92 l92Var = x92.w6;
        w82 w82Var = w82.d;
        if (!((Boolean) w82Var.c.a(l92Var)).booleanValue()) {
            try {
                this.R.z("QueryInfo generation has been disabled.");
            } catch (RemoteException e) {
                sv2.d("QueryInfo generation has been disabled.".concat(e.toString()));
            }
            if (((Boolean) fb2.e.d()).booleanValue() && B4 != null) {
                hm4Var = this.S;
                hm4Var.H("QueryInfo generation has been disabled.");
                hm4Var.k0(false);
            } else {
                return;
            }
        } else {
            jv5 jv5Var = jv5.A;
            jv5Var.j.getClass();
            long currentTimeMillis = System.currentTimeMillis() - this.T;
            try {
                try {
                    if (ew1Var == null) {
                        this.R.i1(null, null, null);
                        dk1 dk1Var = this.U;
                        xi4.c(dk1Var.c0, dk1Var.U, "sgs", new Pair("rid", "-1"));
                        this.S.k0(true);
                        if (!((Boolean) fb2.e.d()).booleanValue() || B4 == null) {
                            return;
                        }
                    } else {
                        try {
                            JSONObject jSONObject = new JSONObject(ew1Var.b);
                            String optString = jSONObject.optString("request_id", "");
                            if (TextUtils.isEmpty(optString)) {
                                sv2.g("The request ID is empty in request JSON.");
                                this.R.z("Internal error: request ID is empty in request JSON.");
                                dk1 dk1Var2 = this.U;
                                xi4.c(dk1Var2.c0, dk1Var2.U, "sgf", new Pair("sgf_reason", "rid_missing"));
                                hm4 hm4Var2 = this.S;
                                hm4Var2.H("Request ID empty");
                                hm4Var2.k0(false);
                                if (!((Boolean) fb2.e.d()).booleanValue() || B4 == null) {
                                    return;
                                }
                            } else {
                                dk1 dk1Var3 = this.U;
                                dk1.t4(dk1Var3, optString, ew1Var.b, dk1Var3.U);
                                Bundle bundle = ew1Var.c;
                                dk1 dk1Var4 = this.U;
                                if (dk1Var4.h0 && bundle != null && bundle.getInt(dk1Var4.j0, -1) == -1) {
                                    dk1 dk1Var5 = this.U;
                                    bundle.putInt(dk1Var5.j0, dk1Var5.k0.get());
                                }
                                dk1 dk1Var6 = this.U;
                                if (dk1Var6.g0 && bundle != null && TextUtils.isEmpty(bundle.getString(dk1Var6.i0))) {
                                    if (TextUtils.isEmpty(this.U.m0)) {
                                        dk1 dk1Var7 = this.U;
                                        dk1Var7.m0 = jv5Var.c.r(dk1Var7.R, dk1Var7.l0.P);
                                    }
                                    dk1 dk1Var8 = this.U;
                                    bundle.putString(dk1Var8.i0, dk1Var8.m0);
                                }
                                this.R.i1(bundle, ew1Var.a, ew1Var.b);
                                dk1 dk1Var9 = this.U;
                                fs3 fs3Var = dk1Var9.c0;
                                xr3 xr3Var = dk1Var9.U;
                                Pair[] pairArr = new Pair[2];
                                pairArr[0] = new Pair("tqgt", String.valueOf(currentTimeMillis));
                                String str = "na";
                                if (((Boolean) w82Var.c.a(x92.c8)).booleanValue()) {
                                    try {
                                        str = jSONObject.getJSONObject("extras").getBoolean("accept_3p_cookie") ? "1" : "0";
                                    } catch (JSONException e2) {
                                        sv2.e("Error retrieving JSONObject from the requestJson, ", e2);
                                    }
                                }
                                pairArr[1] = new Pair("tpc", str);
                                xi4.c(fs3Var, xr3Var, "sgs", pairArr);
                                this.S.k0(true);
                                if (!((Boolean) fb2.e.d()).booleanValue() || B4 == null) {
                                    return;
                                }
                            }
                        } catch (JSONException e3) {
                            sv2.g("Failed to create JSON object from the request string.");
                            du2 du2Var = this.R;
                            String obj2 = e3.toString();
                            du2Var.z("Internal error for request JSON: " + obj2);
                            dk1 dk1Var10 = this.U;
                            xi4.c(dk1Var10.c0, dk1Var10.U, "sgf", new Pair("sgf_reason", "request_invalid"));
                            hm4 hm4Var3 = this.S;
                            hm4Var3.b(e3);
                            hm4Var3.k0(false);
                            jv5.A.g.f("SignalGeneratorImpl.generateSignals.onSuccess", e3);
                            if (!((Boolean) fb2.e.d()).booleanValue() || B4 == null) {
                                return;
                            }
                        }
                    }
                } catch (RemoteException e4) {
                    hm4 hm4Var4 = this.S;
                    hm4Var4.b(e4);
                    hm4Var4.k0(false);
                    sv2.e("", e4);
                    jv5.A.g.f("SignalGeneratorImpl.generateSignals.onSuccess", e4);
                    if (!((Boolean) fb2.e.d()).booleanValue() || B4 == null) {
                        return;
                    }
                }
                hm4Var = this.S;
            } catch (Throwable th) {
                if (((Boolean) fb2.e.d()).booleanValue() && B4 != null) {
                    B4.b(this.S);
                    B4.h();
                }
                throw th;
            }
        }
        B4.b(hm4Var);
        B4.h();
    }

    @Override // defpackage.wy4
    public final void h(Throwable th) {
        jv5 jv5Var = jv5.A;
        jv5Var.j.getClass();
        long currentTimeMillis = System.currentTimeMillis() - this.T;
        String message = th.getMessage();
        jv5Var.g.f("SignalGeneratorImpl.generateSignals", th);
        dk1 dk1Var = this.U;
        xi4.c(dk1Var.c0, dk1Var.U, "sgf", new Pair("sgf_reason", message), new Pair("tqgt", String.valueOf(currentTimeMillis)));
        qm4 B4 = dk1.B4(this.P, this.Q);
        if (((Boolean) fb2.e.d()).booleanValue() && B4 != null) {
            hm4 hm4Var = this.S;
            hm4Var.b(th);
            hm4Var.k0(false);
            B4.b(hm4Var);
            B4.h();
        }
        try {
            du2 du2Var = this.R;
            du2Var.z("Internal error. " + message);
        } catch (RemoteException e) {
            sv2.e("", e);
        }
    }
}