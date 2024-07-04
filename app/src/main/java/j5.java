package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.WeakHashMap;

/* renamed from: j5  reason: default package */
public final class j5 implements Runnable {
    public final /* synthetic */ f5 P;

    /* renamed from: j5$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class a extends vx {
        public a() {
        }

        @Override // defpackage.y41
        public final void a() {
            j5.this.P.d0.setAlpha(1.0f);
            j5.this.P.g0.d(null);
            j5.this.P.g0 = null;
        }

        @Override // defpackage.vx, defpackage.y41
        public final void c() {
            j5.this.P.d0.setVisibility(0);
        }
    }

    public j5(f5 f5Var) {
        this.P = f5Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0050  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        boolean z;
        ViewGroup viewGroup;
        f5 f5Var = this.P;
        f5Var.e0.showAtLocation(f5Var.d0, 55, 0, 0);
        w41 w41Var = this.P.g0;
        if (w41Var != null) {
            w41Var.b();
        }
        f5 f5Var2 = this.P;
        if (f5Var2.i0 && (viewGroup = f5Var2.j0) != null) {
            WeakHashMap<View, String> weakHashMap = a41.a;
            if (viewGroup.isLaidOut()) {
                z = true;
                if (!z) {
                    this.P.d0.setAlpha(0.0f);
                    f5 f5Var3 = this.P;
                    w41 a2 = a41.a(f5Var3.d0);
                    a2.a(1.0f);
                    f5Var3.g0 = a2;
                    this.P.g0.d(new a());
                    return;
                }
                this.P.d0.setAlpha(1.0f);
                this.P.d0.setVisibility(0);
                return;
            }
        }
        z = false;
        if (!z) {
        }
    }
}