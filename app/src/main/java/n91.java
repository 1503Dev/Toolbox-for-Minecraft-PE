package defpackage;

import android.net.Uri;
import java.io.File;

/* renamed from: n91  reason: default package */
public final class n91 implements zc1 {
    public final /* synthetic */ o91 a;

    public n91(o91 o91Var) {
        this.a = o91Var;
    }

    @Override // defpackage.zc1
    public final void a(rc1 rc1Var) {
        if (o91.a(this.a, rc1Var)) {
            o91 o91Var = this.a;
            o91Var.getClass();
            o91Var.a0 = rc1Var.b.q("filepath");
            o91Var.setImageURI(Uri.fromFile(new File(o91Var.a0)));
        }
    }
}