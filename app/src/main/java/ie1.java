package defpackage;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;

/* renamed from: ie1  reason: default package */
public final class ie1 {
    public rc1 a;
    public AlertDialog b;
    public boolean c;

    /* renamed from: ie1$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class a implements zc1 {
        public a() {
        }

        @Override // defpackage.zc1
        public final void a(rc1 rc1Var) {
            if (ga1.i() && (ga1.P instanceof Activity)) {
                if (rc1Var.b.j("on_resume")) {
                    ie1.this.a = rc1Var;
                    return;
                } else {
                    ie1.this.a(rc1Var);
                    return;
                }
            }
            t1.b(0, 0, "Missing Activity reference, can't build AlertDialog.", true);
        }
    }

    /* renamed from: ie1$b */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class b implements DialogInterface.OnClickListener {
        public final /* synthetic */ rc1 P;

        public b(rc1 rc1Var) {
            this.P = rc1Var;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i) {
            ie1.this.b = null;
            dialogInterface.dismiss();
            ic1 ic1Var = new ic1();
            eb1.m(ic1Var, "positive", true);
            ie1.this.c = false;
            this.P.a(ic1Var).b();
        }
    }

    /* renamed from: ie1$c */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class c implements DialogInterface.OnClickListener {
        public final /* synthetic */ rc1 P;

        public c(rc1 rc1Var) {
            this.P = rc1Var;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i) {
            ie1.this.b = null;
            dialogInterface.dismiss();
            ic1 ic1Var = new ic1();
            eb1.m(ic1Var, "positive", false);
            ie1.this.c = false;
            this.P.a(ic1Var).b();
        }
    }

    /* renamed from: ie1$d */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class d implements DialogInterface.OnCancelListener {
        public final /* synthetic */ rc1 P;

        public d(rc1 rc1Var) {
            this.P = rc1Var;
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public final void onCancel(DialogInterface dialogInterface) {
            ie1 ie1Var = ie1.this;
            ie1Var.b = null;
            ie1Var.c = false;
            ic1 ic1Var = new ic1();
            eb1.m(ic1Var, "positive", false);
            this.P.a(ic1Var).b();
        }
    }

    /* renamed from: ie1$e */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class e implements Runnable {
        public final /* synthetic */ AlertDialog.Builder P;

        public e(AlertDialog.Builder builder) {
            this.P = builder;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ie1 ie1Var = ie1.this;
            ie1Var.c = true;
            ie1Var.b = this.P.show();
        }
    }

    public ie1() {
        ga1.f("Alert.show", new a());
    }

    @SuppressLint({"InlinedApi"})
    public final void a(rc1 rc1Var) {
        AlertDialog.Builder builder;
        Context context = ga1.P;
        if (context == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 21) {
            builder = new AlertDialog.Builder(context, 16974374);
        } else {
            builder = new AlertDialog.Builder(context, 16974126);
        }
        ic1 ic1Var = rc1Var.b;
        String q = ic1Var.q("message");
        String q2 = ic1Var.q("title");
        String q3 = ic1Var.q("positive");
        String q4 = ic1Var.q("negative");
        builder.setMessage(q);
        builder.setTitle(q2);
        builder.setPositiveButton(q3, new b(rc1Var));
        if (!q4.equals("")) {
            builder.setNegativeButton(q4, new c(rc1Var));
        }
        builder.setOnCancelListener(new d(rc1Var));
        eg1.n(new e(builder));
    }
}