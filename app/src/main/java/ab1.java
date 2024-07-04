package defpackage;

import android.view.View;
import android.widget.TextView;
import java.util.HashMap;

/* renamed from: ab1  reason: default package */
public final class ab1 implements zc1 {
    public final /* synthetic */ ob1 a;

    public ab1(ob1 ob1Var) {
        this.a = ob1Var;
    }

    @Override // defpackage.zc1
    public final void a(rc1 rc1Var) {
        HashMap hashMap;
        if (this.a.b(rc1Var)) {
            ob1 ob1Var = this.a;
            ob1Var.getClass();
            int l = rc1Var.b.l("id");
            View remove = ob1Var.V.remove(Integer.valueOf(l));
            if (ob1Var.U.remove(Integer.valueOf(l)).booleanValue()) {
                hashMap = ob1Var.S;
            } else {
                hashMap = ob1Var.Q;
            }
            TextView textView = (TextView) hashMap.remove(Integer.valueOf(l));
            if (remove != null && textView != null) {
                ob1Var.removeView(textView);
                return;
            }
            pb1 k = ga1.h().k();
            k.getClass();
            pb1.d(rc1Var.a, "" + l);
        }
    }
}