package defpackage;

import android.os.Parcel;
import android.os.SystemClock;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: bn2  reason: default package */
public abstract class bn2 extends j22 implements cn2 {
    public bn2() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.ISignalsCallback");
    }

    @Override // defpackage.j22
    public final boolean s4(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return false;
                }
                tz3 tz3Var = (tz3) k22.a(parcel, tz3.CREATOR);
                k22.b(parcel);
                h64 h64Var = (h64) this;
                synchronized (h64Var) {
                    h64Var.t4(2, tz3Var.Q);
                }
            } else {
                String readString = parcel.readString();
                k22.b(parcel);
                h64 h64Var2 = (h64) this;
                synchronized (h64Var2) {
                    h64Var2.t4(2, readString);
                }
            }
        } else {
            String readString2 = parcel.readString();
            k22.b(parcel);
            h64 h64Var3 = (h64) this;
            synchronized (h64Var3) {
                if (!h64Var3.T) {
                    if (readString2 == null) {
                        synchronized (h64Var3) {
                            h64Var3.t4(2, "Adapter returned null signals");
                        }
                    } else {
                        try {
                            h64Var3.R.put("signals", readString2);
                            l92 l92Var = x92.l1;
                            w82 w82Var = w82.d;
                            if (((Boolean) w82Var.c.a(l92Var)).booleanValue()) {
                                JSONObject jSONObject = h64Var3.R;
                                jv5.A.j.getClass();
                                jSONObject.put("latency", SystemClock.elapsedRealtime() - h64Var3.S);
                            }
                            if (((Boolean) w82Var.c.a(x92.k1)).booleanValue()) {
                                h64Var3.R.put("signal_error_code", 0);
                            }
                        } catch (JSONException unused) {
                        }
                        h64Var3.Q.a(h64Var3.R);
                        h64Var3.T = true;
                    }
                }
            }
        }
        parcel2.writeNoException();
        return true;
    }
}