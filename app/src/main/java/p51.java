package defpackage;

import android.view.View;
import android.view.ViewGroup;
import defpackage.u01;
import java.util.ArrayList;

/* renamed from: p51  reason: default package */
public final class p51 extends x01 {
    public final /* synthetic */ ViewGroup a;
    public final /* synthetic */ View b;
    public final /* synthetic */ View c;
    public final /* synthetic */ q51 d;

    public p51(q51 q51Var, ViewGroup viewGroup, View view, View view2) {
        this.d = q51Var;
        this.a = viewGroup;
        this.b = view;
        this.c = view2;
    }

    @Override // defpackage.x01, defpackage.u01.d
    public final void b() {
        this.a.getOverlay().remove(this.b);
    }

    @Override // defpackage.x01, defpackage.u01.d
    public final void c() {
        if (this.b.getParent() == null) {
            this.a.getOverlay().add(this.b);
            return;
        }
        q51 q51Var = this.d;
        int size = q51Var.b0.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            q51Var.b0.get(size).cancel();
        }
        ArrayList<u01.d> arrayList = q51Var.f0;
        if (arrayList != null && arrayList.size() > 0) {
            ArrayList arrayList2 = (ArrayList) q51Var.f0.clone();
            int size2 = arrayList2.size();
            for (int i = 0; i < size2; i++) {
                ((u01.d) arrayList2.get(i)).e();
            }
        }
    }

    @Override // defpackage.u01.d
    public final void d(u01 u01Var) {
        this.c.setTag(di0.save_overlay_view, null);
        this.a.getOverlay().remove(this.b);
        u01Var.x(this);
    }
}