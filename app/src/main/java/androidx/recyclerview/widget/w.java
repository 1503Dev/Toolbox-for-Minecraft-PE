package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.k;

public abstract class w extends RecyclerView.l {
    public boolean g = true;

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final boolean a(RecyclerView.d0 d0Var, RecyclerView.d0 d0Var2, RecyclerView.l.c cVar, RecyclerView.l.c cVar2) {
        int i;
        int i2;
        int i3 = cVar.a;
        int i4 = cVar.b;
        if (d0Var2.z()) {
            int i5 = cVar.a;
            i2 = cVar.b;
            i = i5;
        } else {
            i = cVar2.a;
            i2 = cVar2.b;
        }
        k kVar = (k) this;
        if (d0Var == d0Var2) {
            return kVar.h(d0Var, i3, i4, i, i2);
        }
        float translationX = d0Var.P.getTranslationX();
        float translationY = d0Var.P.getTranslationY();
        float alpha = d0Var.P.getAlpha();
        kVar.m(d0Var);
        d0Var.P.setTranslationX(translationX);
        d0Var.P.setTranslationY(translationY);
        d0Var.P.setAlpha(alpha);
        kVar.m(d0Var2);
        d0Var2.P.setTranslationX(-((int) ((i - i3) - translationX)));
        d0Var2.P.setTranslationY(-((int) ((i2 - i4) - translationY)));
        d0Var2.P.setAlpha(0.0f);
        kVar.k.add(new k.a(d0Var, d0Var2, i3, i4, i, i2));
        return true;
    }

    public abstract boolean h(RecyclerView.d0 d0Var, int i, int i2, int i3, int i4);
}