package defpackage;

import android.os.Binder;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.concurrent.ExecutionException;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: xa3  reason: default package */
public final /* synthetic */ class xa3 implements ky4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ xa3(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.ky4
    public final dz4 e(Object obj) {
        dz4 B;
        switch (this.a) {
            case 0:
                bx3 bx3Var = (bx3) this.b;
                final rq2 rq2Var = (rq2) obj;
                bx3Var.getClass();
                jl4 b = bx3Var.c.b(zw4.E(zw4.C(null), new at4() { // from class: zw3
                    @Override // defpackage.at4
                    public final Object apply(Object obj2) {
                        rq2 rq2Var2 = rq2.this;
                        return new sp2(rq2Var2.R, rq2Var2.S, rq2Var2.U, pt4.b(rq2Var2.P.getString("ms")), -1, rq2Var2.W, rq2Var2.T, rq2Var2.Z, rq2Var2.a0);
                    }
                }, bx3Var.a), ml4.GMS_SIGNALS);
                final xw3 xw3Var = bx3Var.b;
                return zw4.E(b.d(new ky4() { // from class: ax3
                    @Override // defpackage.ky4
                    public final dz4 e(Object obj2) {
                        dz4 B2;
                        xw3 xw3Var2 = xw3.this;
                        sp2 sp2Var = (sp2) obj2;
                        xw3Var2.getClass();
                        String str = sp2Var.Q;
                        cu5 cu5Var = jv5.A.c;
                        if (cu5.G(str)) {
                            B2 = new yy4(new gw3("Ads signal service force local"));
                        } else {
                            B2 = zw4.B(zw4.D(new wq1(xw3Var2, sp2Var), xw3Var2.a), ExecutionException.class, new ky4() { // from class: uw3
                                @Override // defpackage.ky4
                                public final dz4 e(Object obj3) {
                                    Throwable th = (ExecutionException) obj3;
                                    if (th.getCause() != null) {
                                        th = th.getCause();
                                    }
                                    th.getClass();
                                    return new yy4(th);
                                }
                            }, xw3Var2.b);
                        }
                        return zw4.F(zw4.B(sy4.r(B2), gw3.class, new ky4() { // from class: vw3
                            @Override // defpackage.ky4
                            public final dz4 e(Object obj3) {
                                gw3 gw3Var = (gw3) obj3;
                                return zw4.C(null);
                            }
                        }, xw3Var2.b), new ky4() { // from class: ww3
                            @Override // defpackage.ky4
                            public final dz4 e(Object obj3) {
                                InputStream inputStream = (InputStream) obj3;
                                JSONObject jSONObject = new JSONObject();
                                if (inputStream != null) {
                                    try {
                                        cu5 cu5Var2 = jv5.A.c;
                                        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
                                        StringBuilder sb = new StringBuilder(8192);
                                        char[] cArr = new char[2048];
                                        while (true) {
                                            int read = inputStreamReader.read(cArr);
                                            if (read == -1) {
                                                break;
                                            }
                                            sb.append(cArr, 0, read);
                                        }
                                        jSONObject = new JSONObject(sb.toString());
                                    } catch (IOException e) {
                                        e = e;
                                        jv5.A.g.f("AdsServiceSignalTask.startAdsServiceSignalTask", e);
                                        return zw4.C(jSONObject);
                                    } catch (JSONException e2) {
                                        e = e2;
                                        jv5.A.g.f("AdsServiceSignalTask.startAdsServiceSignalTask", e);
                                        return zw4.C(jSONObject);
                                    }
                                }
                                return zw4.C(jSONObject);
                            }
                        }, xw3Var2.b);
                    }
                }).a(), new sn3(1, bx3Var, rq2Var), bx3Var.a);
            case 1:
                final sw3 sw3Var = (sw3) this.b;
                final wp2 wp2Var = (wp2) obj;
                sw3Var.getClass();
                String str = wp2Var.U;
                cu5 cu5Var = jv5.A.c;
                if (cu5.G(str)) {
                    B = new yy4(new gw3("Ads service proxy force local"));
                } else {
                    B = zw4.B(zw4.D(new na3(1, sw3Var, wp2Var), sw3Var.a), ExecutionException.class, new ky4() { // from class: qw3
                        @Override // defpackage.ky4
                        public final dz4 e(Object obj2) {
                            Throwable th = (ExecutionException) obj2;
                            if (th.getCause() != null) {
                                th = th.getCause();
                            }
                            th.getClass();
                            return new yy4(th);
                        }
                    }, sw3Var.b);
                }
                final int callingUid = Binder.getCallingUid();
                return zw4.B(B, gw3.class, new ky4() { // from class: rw3
                    @Override // defpackage.ky4
                    public final dz4 e(Object obj2) {
                        sw3 sw3Var2 = sw3.this;
                        gw3 gw3Var = (gw3) obj2;
                        return ((iy3) sw3Var2.d.c()).t4(wp2Var, callingUid);
                    }
                }, sw3Var.b);
            default:
                Exception exc = (Exception) ((Throwable) obj);
                return zw4.C("");
        }
    }
}