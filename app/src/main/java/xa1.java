package defpackage;

/* renamed from: xa1  reason: default package */
public final class xa1 implements zc1 {
    public final /* synthetic */ ob1 a;

    /* renamed from: xa1$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class a implements Runnable {
        public final /* synthetic */ rc1 P;

        public a(rc1 rc1Var) {
            this.P = rc1Var;
        }

        @Override // java.lang.Runnable
        public final void run() {
            fb1 e;
            ob1 ob1Var = xa1.this.a;
            rc1 rc1Var = this.P;
            ob1Var.getClass();
            ic1 ic1Var = rc1Var.b;
            int l = ic1Var.l("id");
            boolean j = ic1Var.j("is_module");
            ad1 h = ga1.h();
            if (j) {
                e = h.v.get(Integer.valueOf(ic1Var.l("module_id")));
                if (e == null) {
                    t1.b(0, 0, "Module WebView created with invalid id", false);
                    e = null;
                    ob1Var.a(e, js.OTHER);
                }
                e.i(rc1Var, l, ob1Var);
                e.m();
            } else {
                try {
                    e = ka1.e(ob1Var.q0, rc1Var, l, ob1Var);
                } catch (RuntimeException e2) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(e2.toString() + ": during WebView initialization.");
                    sb.append(" Disabling AdColony.");
                    ga1.h().n().d(0, 0, sb.toString(), false);
                    w1.d();
                }
            }
            ob1Var.R.put(Integer.valueOf(l), e);
            ob1Var.V.put(Integer.valueOf(l), e);
            ic1 ic1Var2 = new ic1();
            eb1.l(e.getWebViewModuleId(), ic1Var2, "module_id");
            if (e instanceof ld1) {
                eb1.l(((ld1) e).getAdcModuleId(), ic1Var2, "mraid_module_id");
            }
            rc1Var.a(ic1Var2).b();
            ob1Var.a(e, js.OTHER);
        }
    }

    public xa1(ob1 ob1Var) {
        this.a = ob1Var;
    }

    @Override // defpackage.zc1
    public final void a(rc1 rc1Var) {
        if (this.a.b(rc1Var)) {
            eg1.n(new a(rc1Var));
        }
    }
}