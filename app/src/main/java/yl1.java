package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;

/* renamed from: yl1  reason: default package */
public final class yl1 extends q52 {
    public final /* synthetic */ Context b;
    public final /* synthetic */ wk2 c;

    public yl1(Context context, tk2 tk2Var) {
        this.b = context;
        this.c = tk2Var;
    }

    @Override // defpackage.q52
    public final /* bridge */ /* synthetic */ Object a() {
        t42.a(this.b, "out_of_context_tester");
        return null;
    }

    @Override // defpackage.q52
    public final Object b(h03 h03Var) {
        va0 va0Var = new va0(this.b);
        x92.a(this.b);
        if (((Boolean) w82.d.c.a(x92.U7)).booleanValue()) {
            return h03Var.o2(va0Var, this.c, 231004000);
        }
        return null;
    }

    @Override // defpackage.q52
    public final Object c() {
        bo3 bo3Var;
        va0 va0Var = new va0(this.b);
        x92.a(this.b);
        if (!((Boolean) w82.d.c.a(x92.U7)).booleanValue()) {
            return null;
        }
        try {
            try {
                IBinder b = vv2.a(this.b).b("com.google.android.gms.ads.DynamiteOutOfContextTesterCreatorImpl");
                if (b == null) {
                    bo3Var = null;
                } else {
                    IInterface queryLocalInterface = b.queryLocalInterface("com.google.android.gms.ads.internal.client.IOutOfContextTesterCreator");
                    if (queryLocalInterface instanceof bo3) {
                        bo3Var = (bo3) queryLocalInterface;
                    } else {
                        bo3Var = new bo3(b);
                    }
                }
                return bo3Var.d3(va0Var, this.c);
            } catch (Exception e) {
                throw new uv2(e);
            }
        } catch (RemoteException e2) {
            e = e2;
            ip2.a(this.b).d("ClientApiBroker.getOutOfContextTester", e);
            return null;
        } catch (NullPointerException e3) {
            e = e3;
            ip2.a(this.b).d("ClientApiBroker.getOutOfContextTester", e);
            return null;
        } catch (uv2 e4) {
            e = e4;
            ip2.a(this.b).d("ClientApiBroker.getOutOfContextTester", e);
            return null;
        }
    }
}