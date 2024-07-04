package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.ArrayList;

/* renamed from: vc2  reason: default package */
public final class vc2 {
    public final Object a;
    public final Object b;
    public Object c;

    /* JADX WARN: Code restructure failed: missing block: B:20:0x004c, code lost:
        ((java.util.List) r4.b).add(new defpackage.bd2(r3));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public vc2(uc2 uc2Var) {
        IBinder iBinder;
        this.b = new ArrayList();
        this.a = uc2Var;
        try {
            this.c = uc2Var.h();
        } catch (RemoteException e) {
            sv2.e("", e);
            this.c = "";
        }
        try {
            for (Object obj : uc2Var.f()) {
                ad2 ad2Var = null;
                if ((obj instanceof IBinder) && (iBinder = (IBinder) obj) != null) {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
                    ad2Var = queryLocalInterface instanceof ad2 ? (ad2) queryLocalInterface : new zc2(iBinder);
                }
            }
        } catch (RemoteException e2) {
            sv2.e("", e2);
        }
    }

    public /* synthetic */ vc2(zr3 zr3Var, hi4 hi4Var, wl4 wl4Var) {
        this.a = wl4Var;
        this.b = zr3Var;
        this.c = hi4Var;
    }

    public /* synthetic */ vc2(kr3[] kr3VarArr) {
        wr5 wr5Var = new wr5();
        kt3 kt3Var = new kt3();
        kr3[] kr3VarArr2 = new kr3[2];
        this.a = kr3VarArr2;
        kr3[] kr3VarArr3 = kr3VarArr2;
        System.arraycopy(kr3VarArr, 0, kr3VarArr3, 0, 0);
        this.b = wr5Var;
        this.c = kt3Var;
        kr3VarArr3[0] = wr5Var;
        kr3VarArr3[1] = kt3Var;
    }

    public static String a(int i) {
        int i2 = i - 1;
        return i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? "u" : "ac" : "cb" : "cc" : "bb" : "h";
    }
}