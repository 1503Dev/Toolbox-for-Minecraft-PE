package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import androidx.cardview.widget.CardView;

/* renamed from: gc  reason: default package */
public final class gc implements jc {
    @Override // defpackage.jc
    public final void a(CardView.a aVar) {
        g(aVar, n(aVar));
    }

    @Override // defpackage.jc
    public final float b(CardView.a aVar) {
        return h(aVar) * 2.0f;
    }

    @Override // defpackage.jc
    public final float c(CardView.a aVar) {
        return h(aVar) * 2.0f;
    }

    @Override // defpackage.jc
    public final ColorStateList d(CardView.a aVar) {
        return ((im0) aVar.a).h;
    }

    @Override // defpackage.jc
    public final void e(CardView.a aVar, float f) {
        im0 im0Var = (im0) aVar.a;
        if (f != im0Var.a) {
            im0Var.a = f;
            im0Var.c(null);
            im0Var.invalidateSelf();
        }
    }

    @Override // defpackage.jc
    public final void f(CardView.a aVar, ColorStateList colorStateList) {
        im0 im0Var = (im0) aVar.a;
        im0Var.b(colorStateList);
        im0Var.invalidateSelf();
    }

    @Override // defpackage.jc
    public final void g(CardView.a aVar, float f) {
        im0 im0Var = (im0) aVar.a;
        boolean useCompatPadding = CardView.this.getUseCompatPadding();
        boolean preventCornerOverlap = CardView.this.getPreventCornerOverlap();
        if (f != im0Var.e || im0Var.f != useCompatPadding || im0Var.g != preventCornerOverlap) {
            im0Var.e = f;
            im0Var.f = useCompatPadding;
            im0Var.g = preventCornerOverlap;
            im0Var.c(null);
            im0Var.invalidateSelf();
        }
        if (!CardView.this.getUseCompatPadding()) {
            aVar.a(0, 0, 0, 0);
            return;
        }
        float n = n(aVar);
        float h = h(aVar);
        int ceil = (int) Math.ceil(jm0.a(n, h, CardView.this.getPreventCornerOverlap()));
        int ceil2 = (int) Math.ceil(jm0.b(n, h, CardView.this.getPreventCornerOverlap()));
        aVar.a(ceil, ceil2, ceil, ceil2);
    }

    @Override // defpackage.jc
    public final float h(CardView.a aVar) {
        return ((im0) aVar.a).a;
    }

    @Override // defpackage.jc
    public final void i() {
    }

    @Override // defpackage.jc
    public final void j(CardView.a aVar, float f) {
        n0.f(CardView.this, f);
    }

    @Override // defpackage.jc
    public final float k(CardView.a aVar) {
        float elevation;
        elevation = CardView.this.getElevation();
        return elevation;
    }

    @Override // defpackage.jc
    public final void l(CardView.a aVar) {
        g(aVar, n(aVar));
    }

    @Override // defpackage.jc
    public final void m(CardView.a aVar, Context context, ColorStateList colorStateList, float f, float f2, float f3) {
        im0 im0Var = new im0(f, colorStateList);
        aVar.a = im0Var;
        CardView.this.setBackgroundDrawable(im0Var);
        CardView cardView = CardView.this;
        fc.b(cardView);
        n0.f(cardView, f2);
        g(aVar, f3);
    }

    @Override // defpackage.jc
    public final float n(CardView.a aVar) {
        return ((im0) aVar.a).e;
    }
}