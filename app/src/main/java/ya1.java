package defpackage;

import android.view.View;

/* renamed from: ya1  reason: default package */
public final class ya1 implements zc1 {
    public final /* synthetic */ ob1 a;

    /* renamed from: ya1$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class a implements Runnable {
        public final /* synthetic */ rc1 P;

        public a(rc1 rc1Var) {
            this.P = rc1Var;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ob1 ob1Var = ya1.this.a;
            rc1 rc1Var = this.P;
            ob1Var.getClass();
            int l = rc1Var.b.l("id");
            ad1 h = ga1.h();
            View remove = ob1Var.V.remove(Integer.valueOf(l));
            ka1 remove2 = ob1Var.R.remove(Integer.valueOf(l));
            if (remove2 != null && remove != null) {
                if (remove2 instanceof jd1) {
                    tc1 o = h.o();
                    o.getClass();
                    o.c(((jd1) remove2).getAdcModuleId());
                }
                ob1Var.removeView(remove2);
                return;
            }
            pb1 k = h.k();
            k.getClass();
            pb1.d(rc1Var.a, "" + l);
        }
    }

    public ya1(ob1 ob1Var) {
        this.a = ob1Var;
    }

    @Override // defpackage.zc1
    public final void a(rc1 rc1Var) {
        if (this.a.b(rc1Var)) {
            eg1.n(new a(rc1Var));
        }
    }
}