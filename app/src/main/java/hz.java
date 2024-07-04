package defpackage;

import android.app.Activity;
import android.view.LayoutInflater;
import defpackage.dz;
import defpackage.zv;

/* renamed from: hz  reason: default package */
public final class hz extends t90 implements dz.c {
    public static final /* synthetic */ int d = 0;
    public final az0 c;

    public hz(Activity activity, zv zvVar, zv.b[] bVarArr, dz.b bVar, az0 az0Var) {
        super(0);
        this.c = az0Var;
        jl jlVar = (jl) jj.c(LayoutInflater.from(activity), 2131492924, null, null);
        setContentView(jlVar.T);
        jlVar.X(new sd(1, this));
        new dz(activity, jlVar, zvVar, bVarArr, bVar, this);
    }

    @Override // android.widget.PopupWindow
    public final void dismiss() {
        super.dismiss();
        this.c.getContentView().setVisibility(0);
    }
}