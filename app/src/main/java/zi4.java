package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import defpackage.k9;

/* renamed from: zi4  reason: default package */
public final class zi4 extends mj1 {
    public final IBinder g;
    public final /* synthetic */ k9 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zi4(k9 k9Var, int i, IBinder iBinder, Bundle bundle) {
        super(k9Var, i, bundle);
        this.h = k9Var;
        this.g = iBinder;
    }

    @Override // defpackage.mj1
    public final void c(gf gfVar) {
        k9.b bVar = this.h.p;
        if (bVar != null) {
            bVar.Z(gfVar);
        }
        this.h.getClass();
        System.currentTimeMillis();
    }

    @Override // defpackage.mj1
    public final boolean d() {
        String str;
        String interfaceDescriptor;
        try {
            IBinder iBinder = this.g;
            uf0.f(iBinder);
            interfaceDescriptor = iBinder.getInterfaceDescriptor();
        } catch (RemoteException unused) {
            str = "service probably died";
        }
        if (!this.h.w().equals(interfaceDescriptor)) {
            String w = this.h.w();
            StringBuilder sb = new StringBuilder(String.valueOf(w).length() + 34 + String.valueOf(interfaceDescriptor).length());
            sb.append("service descriptor mismatch: ");
            sb.append(w);
            sb.append(" vs. ");
            sb.append(interfaceDescriptor);
            str = sb.toString();
            Log.w("GmsClient", str);
            return false;
        }
        IInterface o = this.h.o(this.g);
        if (o == null) {
            return false;
        }
        if (!k9.z(this.h, 2, 4, o) && !k9.z(this.h, 3, 4, o)) {
            return false;
        }
        k9 k9Var = this.h;
        k9Var.t = null;
        k9.a aVar = k9Var.o;
        if (aVar != null) {
            aVar.c0();
        }
        return true;
    }
}