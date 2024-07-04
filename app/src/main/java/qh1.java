package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.WebView;
import com.google.android.gms.common.api.Scope;
import defpackage.rv;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Set;
import java.util.concurrent.Future;

/* renamed from: qh1  reason: default package */
public final class qh1 implements Runnable {
    public final /* synthetic */ int P;
    public final /* synthetic */ Object Q;
    public final /* synthetic */ Object R;

    public /* synthetic */ qh1(int i, Object obj, Object obj2) {
        this.P = i;
        this.R = obj;
        this.Q = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b9  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        boolean z;
        DataOutputStream dataOutputStream;
        Throwable th;
        IOException e;
        rv rvVar = null;
        boolean z2 = true;
        switch (this.P) {
            case 0:
                sh1 sh1Var = (sh1) this.R;
                ni1 ni1Var = (ni1) this.Q;
                gf gfVar = ni1Var.Q;
                if (gfVar.Q == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    fj1 fj1Var = ni1Var.R;
                    uf0.f(fj1Var);
                    gfVar = fj1Var.R;
                    if (gfVar.Q != 0) {
                        z2 = false;
                    }
                    if (!z2) {
                        Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(String.valueOf(gfVar)), new Exception());
                    } else {
                        rh1 rh1Var = sh1Var.V;
                        IBinder iBinder = fj1Var.Q;
                        if (iBinder != null) {
                            int i = rv.a.P;
                            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                            if (queryLocalInterface instanceof rv) {
                                rvVar = (rv) queryLocalInterface;
                            } else {
                                rvVar = new cx5(iBinder);
                            }
                        }
                        Set<Scope> set = sh1Var.S;
                        ch1 ch1Var = (ch1) rh1Var;
                        ch1Var.getClass();
                        if (rvVar != null && set != null) {
                            ch1Var.c = rvVar;
                            ch1Var.d = set;
                            if (ch1Var.e) {
                                ch1Var.a.m(rvVar, set);
                            }
                        } else {
                            Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
                            ch1Var.b(new gf(4));
                        }
                        ((k9) sh1Var.U).p();
                        return;
                    }
                }
                ((ch1) sh1Var.V).b(gfVar);
                ((k9) sh1Var.U).p();
                return;
            case 1:
                try {
                    ((pu1) this.R).Q.put((gv1) this.Q);
                    return;
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    return;
                }
            case 2:
                Future future = (Future) this.R;
                if (((bx2) this.Q).isCancelled()) {
                    future.cancel(true);
                    return;
                }
                return;
            case 3:
                OutputStream outputStream = (OutputStream) this.Q;
                byte[] bArr = (byte[]) this.R;
                try {
                    try {
                        dataOutputStream = new DataOutputStream(outputStream);
                        try {
                            dataOutputStream.writeInt(bArr.length);
                            dataOutputStream.write(bArr);
                        } catch (IOException e2) {
                            e = e2;
                            sv2.e("Error transporting the ad response", e);
                            jv5.A.g.f("LargeParcelTeleporter.pipeData.1", e);
                            if (dataOutputStream == null) {
                                gw.j(outputStream);
                                return;
                            }
                            gw.j(dataOutputStream);
                            return;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        if (dataOutputStream != null) {
                            gw.j(outputStream);
                        } else {
                            gw.j(dataOutputStream);
                        }
                        throw th;
                    }
                } catch (IOException e3) {
                    dataOutputStream = null;
                    e = e3;
                } catch (Throwable th3) {
                    dataOutputStream = null;
                    th = th3;
                    if (dataOutputStream != null) {
                    }
                    throw th;
                }
                gw.j(dataOutputStream);
                return;
            case 4:
                ((jl3) this.Q).o((ym3) this.R);
                return;
            case 5:
                bx2 bx2Var = (bx2) this.R;
                String str = jv5.A.g.b().f().e;
                if (!TextUtils.isEmpty(str)) {
                    bx2Var.a(str);
                    return;
                } else {
                    bx2Var.c(new Exception());
                    return;
                }
            case 6:
                ((WebView) this.Q).loadUrl((String) this.R);
                return;
            case 7:
                c16 c16Var = (c16) this.Q;
                nk5 nk5Var = (nk5) this.R;
                c16Var.getClass();
                synchronized (nk5Var) {
                }
                d16 d16Var = c16Var.b;
                int i2 = zn4.a;
                xl5 xl5Var = (xl5) d16Var;
                pp5 pp5Var = xl5Var.P.p;
                io5 E = pp5Var.E((ov5) pp5Var.S.e);
                pp5Var.D(E, 1020, new vo5(E, nk5Var, 1));
                xl5Var.P.getClass();
                xl5Var.P.getClass();
                return;
            default:
                synchronized (((cp5) this.R).Q) {
                    Object obj = ((cp5) this.R).R;
                    if (obj != null) {
                        ((ri4) obj).R.n(((yv0) this.Q).i());
                    }
                }
                return;
        }
    }

    public qh1(WebView webView, String str) {
        this.P = 6;
        this.Q = webView;
        this.R = str;
    }

    public /* synthetic */ qh1(Object obj, Object obj2, int i) {
        this.P = i;
        this.Q = obj;
        this.R = obj2;
    }
}