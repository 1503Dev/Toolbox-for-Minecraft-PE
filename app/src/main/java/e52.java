package defpackage;

import android.os.Parcel;
import android.os.RemoteException;
import defpackage.k9;
import java.io.IOException;

/* renamed from: e52  reason: default package */
public final class e52 implements k9.a {
    public final /* synthetic */ y42 a;
    public final /* synthetic */ bx2 b;
    public final /* synthetic */ g52 c;

    public e52(g52 g52Var, y42 y42Var, b52 b52Var) {
        this.c = g52Var;
        this.a = y42Var;
        this.b = b52Var;
    }

    @Override // defpackage.k9.a
    public final void A(int i) {
    }

    @Override // defpackage.k9.a
    public final void c0() {
        synchronized (this.c.c) {
            g52 g52Var = this.c;
            if (!g52Var.b) {
                g52Var.b = true;
                final x42 x42Var = g52Var.a;
                if (x42Var == null) {
                    return;
                }
                yw2 yw2Var = zw2.a;
                final y42 y42Var = this.a;
                final bx2 bx2Var = this.b;
                dz4 e = yw2Var.e(new Runnable() { // from class: c52
                    @Override // java.lang.Runnable
                    public final void run() {
                        v42 v42Var;
                        boolean z;
                        boolean z2;
                        long j;
                        boolean z3;
                        e52 e52Var = e52.this;
                        x42 x42Var2 = x42Var;
                        y42 y42Var2 = y42Var;
                        bx2 bx2Var2 = bx2Var;
                        try {
                            a52 a52Var = (a52) x42Var2.v();
                            if (x42Var2.B()) {
                                Parcel A = a52Var.A();
                                k22.c(A, y42Var2);
                                Parcel Z = a52Var.Z(A, 2);
                                v42Var = (v42) k22.a(Z, v42.CREATOR);
                                Z.recycle();
                            } else {
                                Parcel A2 = a52Var.A();
                                k22.c(A2, y42Var2);
                                Parcel Z2 = a52Var.Z(A2, 1);
                                v42Var = (v42) k22.a(Z2, v42.CREATOR);
                                Z2.recycle();
                            }
                            if (!v42Var.d()) {
                                bx2Var2.c(new RuntimeException("No entry contents."));
                                g52.a(e52Var.c);
                                return;
                            }
                            d52 d52Var = new d52(e52Var, v42Var.c());
                            int read = d52Var.read();
                            if (read != -1) {
                                d52Var.unread(read);
                                synchronized (v42Var) {
                                    z = v42Var.Q;
                                }
                                synchronized (v42Var) {
                                    z2 = v42Var.T;
                                }
                                synchronized (v42Var) {
                                    j = v42Var.S;
                                }
                                synchronized (v42Var) {
                                    z3 = v42Var.R;
                                }
                                bx2Var2.a(new h52(d52Var, z, z2, j, z3));
                                return;
                            }
                            throw new IOException("Unable to read from cache.");
                        } catch (RemoteException e2) {
                            e = e2;
                            sv2.e("Unable to obtain a cache service instance.", e);
                            bx2Var2.c(e);
                            g52.a(e52Var.c);
                        } catch (IOException e3) {
                            e = e3;
                            sv2.e("Unable to obtain a cache service instance.", e);
                            bx2Var2.c(e);
                            g52.a(e52Var.c);
                        }
                    }
                });
                bx2 bx2Var2 = this.b;
                bx2Var2.b(new qh1(bx2Var2, e, 2), zw2.f);
            }
        }
    }
}