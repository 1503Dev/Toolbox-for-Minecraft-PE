package defpackage;

import android.app.Activity;
import android.content.Context;
import android.widget.Toast;
import androidx.recyclerview.widget.RecyclerView;
import com.microsoft.xbox.idp.interop.Interop;
import defpackage.iy0;
import defpackage.uo;
import defpackage.zv;
import io.mrarm.yurai.xbox.XboxLoginActivity;

/* renamed from: no  reason: default package */
public final /* synthetic */ class no implements Runnable {
    public final /* synthetic */ int P;
    public final /* synthetic */ Object Q;

    public /* synthetic */ no(int i, Object obj) {
        this.P = i;
        this.Q = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.P) {
            case 0:
                Toast.makeText((Context) this.Q, 2131755119, 0).show();
                return;
            case 1:
                ((RecyclerView) this.Q).invalidate();
                return;
            case 2:
                ny0 ny0Var = (ny0) this.Q;
                final Activity activity = ny0Var.a;
                final zv zvVar = ny0Var.c;
                int i = uo.V;
                ((iy0) zvVar).I0(new Runnable() { // from class: lo
                    /* JADX WARN: Type inference failed for: r4v3, types: [oo] */
                    @Override // java.lang.Runnable
                    public final void run() {
                        final int l0;
                        long Z;
                        boolean p0;
                        Runnable noVar;
                        zv zvVar2 = zvVar;
                        final Context context = activity;
                        final iy0 iy0Var = (iy0) zvVar2;
                        if (iy0Var.M() == null) {
                            noVar = new mo(0, context);
                        } else {
                            l0 = iy0.l0(iy0Var.M().a);
                            iy0.a M = iy0Var.M();
                            M.getClass();
                            Z = iy0.Z(M.a, l0);
                            final iy0.d dVar = new iy0.d(Z);
                            p0 = iy0.p0(dVar.a);
                            if (p0) {
                                noVar = new no(0, context);
                            } else {
                                final uo.a aVar = new uo.a(iy0Var, dVar);
                                final ?? r4 = new uo.b() { // from class: oo
                                    @Override // defpackage.uo.b
                                    public final void a(final String str, final int[] iArr) {
                                        final zv zvVar3 = iy0Var;
                                        final zv.b bVar = dVar;
                                        final int i2 = l0;
                                        ((iy0) zvVar3).I0(new Runnable() { // from class: to
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                zv.b bVar2 = bVar;
                                                String str2 = str;
                                                int[] iArr2 = iArr;
                                                zv zvVar4 = zvVar3;
                                                int i3 = i2;
                                                bVar2.d(str2);
                                                bVar2.b(iArr2);
                                                iy0.C0(((iy0) zvVar4).M().a, i3, ((iy0.c) bVar2).a);
                                            }
                                        });
                                    }
                                };
                                h21.a(new Runnable() { // from class: po
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        new uo(context, iy0Var, aVar, r4).show();
                                    }
                                });
                                return;
                            }
                        }
                        h21.a(noVar);
                    }
                });
                return;
            default:
                XboxLoginActivity xboxLoginActivity = (XboxLoginActivity) this.Q;
                Interop.auth_flow_callback(xboxLoginActivity.c0, 1, "");
                xboxLoginActivity.finish();
                return;
        }
    }
}