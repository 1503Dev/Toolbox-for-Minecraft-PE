package defpackage;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* renamed from: qz1  reason: default package */
public final class qz1 extends pz1 {
    public static final /* synthetic */ int u0 = 0;

    public qz1(Context context, String str, boolean z) {
        super(context, str, z);
    }

    @Override // defpackage.pz1
    public final ArrayList r(l02 l02Var, Context context, gx1 gx1Var) {
        int i;
        if (l02Var.b != null && this.k0) {
            if (l02Var.l != null) {
                i = mz1.b();
            } else {
                i = RecyclerView.UNDEFINED_DURATION;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(super.r(l02Var, context, gx1Var));
            arrayList.add(new f12(l02Var, gx1Var, i));
            return arrayList;
        }
        return super.r(l02Var, context, gx1Var);
    }
}