package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.text.TextUtils;
import java.util.concurrent.Callable;

/* renamed from: az1  reason: default package */
public final class az1 implements ServiceConnection {
    public final Object a = new Object();
    public ba b;
    public final /* synthetic */ aa c;

    public /* synthetic */ az1(aa aaVar, ba baVar) {
        this.c = aaVar;
        this.b = baVar;
    }

    public final void a(da daVar) {
        synchronized (this.a) {
            try {
                ba baVar = this.b;
                if (baVar != null) {
                    ((ve0) baVar).b(daVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        pz3 nw2Var;
        da daVar;
        m82.d("BillingClient", "Billing service connected.");
        aa aaVar = this.c;
        int i = ag3.P;
        if (iBinder == null) {
            nw2Var = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.android.vending.billing.IInAppBillingService");
            if (queryLocalInterface instanceof pz3) {
                nw2Var = (pz3) queryLocalInterface;
            } else {
                nw2Var = new nw2(iBinder);
            }
        }
        aaVar.U = nw2Var;
        aa aaVar2 = this.c;
        if (aaVar2.p(new Callable() { // from class: gw1
            /* JADX WARN: Removed duplicated region for block: B:79:0x00fd  */
            /* JADX WARN: Removed duplicated region for block: B:80:0x0100  */
            @Override // java.util.concurrent.Callable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object call() {
                Bundle bundle;
                int i2;
                da daVar2;
                boolean z;
                boolean z2;
                boolean z3;
                boolean z4;
                boolean z5;
                boolean z6;
                boolean z7;
                boolean z8;
                az1 az1Var = az1.this;
                synchronized (az1Var.a) {
                }
                if (!TextUtils.isEmpty(null)) {
                    bundle = new Bundle();
                    bundle.putString("accountName", null);
                } else {
                    bundle = null;
                }
                int i3 = 3;
                try {
                    String packageName = az1Var.c.T.getPackageName();
                    int i4 = 19;
                    i2 = 3;
                    while (true) {
                        if (i4 >= 3) {
                            if (bundle == null) {
                                try {
                                    i2 = az1Var.c.U.q1(packageName, "subs", i4);
                                } catch (Exception e) {
                                    e = e;
                                    i3 = i2;
                                    m82.f("BillingClient", "Exception while checking if billing is supported; try to reconnect", e);
                                    az1Var.c.P = 0;
                                    az1Var.c.U = null;
                                    i2 = i3;
                                    if (i2 != 0) {
                                    }
                                    az1Var.a(daVar2);
                                    return null;
                                }
                            } else {
                                i2 = az1Var.c.U.a3(i4, packageName, "subs", bundle);
                            }
                            if (i2 == 0) {
                                break;
                            }
                            i4--;
                        } else {
                            i4 = 0;
                            break;
                        }
                    }
                    az1Var.c.getClass();
                    aa aaVar3 = az1Var.c;
                    boolean z9 = true;
                    if (i4 >= 3) {
                        z = true;
                    } else {
                        z = false;
                    }
                    aaVar3.W = z;
                    if (i4 < 3) {
                        m82.d("BillingClient", "In-app billing API does not support subscription on this device.");
                    }
                    int i5 = 19;
                    while (true) {
                        if (i5 < 3) {
                            break;
                        }
                        if (bundle == null) {
                            i2 = az1Var.c.U.q1(packageName, "inapp", i5);
                        } else {
                            i2 = az1Var.c.U.a3(i5, packageName, "inapp", bundle);
                        }
                        if (i2 == 0) {
                            az1Var.c.X = i5;
                            break;
                        }
                        i5--;
                    }
                    aa aaVar4 = az1Var.c;
                    int i6 = aaVar4.X;
                    if (i6 >= 19) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    aaVar4.f0 = z2;
                    if (i6 >= 17) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    aaVar4.e0 = z3;
                    if (i6 >= 16) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    aaVar4.d0 = z4;
                    if (i6 >= 15) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    aaVar4.c0 = z5;
                    if (i6 >= 14) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    aaVar4.b0 = z6;
                    if (i6 >= 10) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    aaVar4.a0 = z7;
                    if (i6 >= 9) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    aaVar4.Z = z8;
                    if (i6 < 6) {
                        z9 = false;
                    }
                    aaVar4.Y = z9;
                    if (i6 < 3) {
                        m82.e("BillingClient", "In-app billing API version 3 is not supported on this device.");
                    }
                    if (i2 == 0) {
                        az1Var.c.P = 2;
                    } else {
                        az1Var.c.P = 0;
                        az1Var.c.U = null;
                    }
                } catch (Exception e2) {
                    e = e2;
                }
                if (i2 != 0) {
                    daVar2 = qa2.h;
                } else {
                    daVar2 = qa2.a;
                }
                az1Var.a(daVar2);
                return null;
            }
        }, 30000L, new cx1(0, this), aaVar2.m()) == null) {
            aa aaVar3 = this.c;
            if (aaVar3.P != 0 && aaVar3.P != 3) {
                daVar = qa2.g;
            } else {
                daVar = qa2.i;
            }
            a(daVar);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        m82.e("BillingClient", "Billing service disconnected.");
        int i = ty4.zzb;
        this.c.U = null;
        this.c.P = 0;
        synchronized (this.a) {
            try {
                ba baVar = this.b;
                if (baVar != null) {
                    ((ve0) baVar).b.h = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}