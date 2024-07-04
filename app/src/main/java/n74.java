package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/* renamed from: n74  reason: default package */
public final class n74 implements nc4 {
    public final ez4 a;
    public final ez4 b;
    public final Context c;
    public final li4 d;
    public final ViewGroup e;

    public n74(ez4 ez4Var, yw2 yw2Var, Context context, li4 li4Var, ViewGroup viewGroup) {
        this.a = ez4Var;
        this.b = yw2Var;
        this.c = context;
        this.d = li4Var;
        this.e = viewGroup;
    }

    @Override // defpackage.nc4
    public final int a() {
        return 3;
    }

    public final ArrayList b() {
        ArrayList arrayList = new ArrayList();
        View view = this.e;
        while (view != null) {
            ViewParent parent = view.getParent();
            if (parent == null) {
                break;
            }
            int indexOfChild = parent instanceof ViewGroup ? ((ViewGroup) parent).indexOfChild(view) : -1;
            Bundle bundle = new Bundle();
            bundle.putString("type", parent.getClass().getName());
            bundle.putInt("index_of_child", indexOfChild);
            arrayList.add(bundle);
            if (!(parent instanceof View)) {
                break;
            }
            view = (View) parent;
        }
        return arrayList;
    }

    @Override // defpackage.nc4
    public final dz4 c() {
        ez4 ez4Var;
        Callable m74Var;
        x92.a(this.c);
        if (((Boolean) w82.d.c.a(x92.E8)).booleanValue()) {
            ez4Var = this.b;
            m74Var = new n04(1, this);
        } else {
            ez4Var = this.a;
            m74Var = new m74(0, this);
        }
        return ez4Var.b(m74Var);
    }
}