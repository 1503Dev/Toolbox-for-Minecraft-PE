package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.RectF;
import androidx.cardview.widget.CardView;

/* renamed from: hc  reason: default package */
public class hc implements jc {
    public hc() {
        new RectF();
    }

    public static jm0 o(ic icVar) {
        return (jm0) ((CardView.a) icVar).a;
    }

    @Override // defpackage.jc
    public final void a(CardView.a aVar) {
    }

    @Override // defpackage.jc
    public final float b(CardView.a aVar) {
        jm0 o = o(aVar);
        float f = o.h;
        float f2 = (f * 1.5f) / 2.0f;
        return (((o.h * 1.5f) + o.a) * 2.0f) + (Math.max(f, f2 + o.f + o.a) * 2.0f);
    }

    @Override // defpackage.jc
    public final float c(CardView.a aVar) {
        jm0 o = o(aVar);
        float f = o.h;
        float f2 = f / 2.0f;
        return ((o.h + o.a) * 2.0f) + (Math.max(f, f2 + o.f + o.a) * 2.0f);
    }

    @Override // defpackage.jc
    public final ColorStateList d(CardView.a aVar) {
        return o(aVar).k;
    }

    @Override // defpackage.jc
    public final void e(CardView.a aVar, float f) {
        jm0 o = o(aVar);
        if (f >= 0.0f) {
            float f2 = (int) (f + 0.5f);
            if (o.f != f2) {
                o.f = f2;
                o.l = true;
                o.invalidateSelf();
            }
            p(aVar);
            return;
        }
        o.getClass();
        throw new IllegalArgumentException("Invalid radius " + f + ". Must be >= 0");
    }

    @Override // defpackage.jc
    public final void f(CardView.a aVar, ColorStateList colorStateList) {
        jm0 o = o(aVar);
        o.c(colorStateList);
        o.invalidateSelf();
    }

    @Override // defpackage.jc
    public final void g(CardView.a aVar, float f) {
        jm0 o = o(aVar);
        o.d(o.j, f);
        p(aVar);
    }

    @Override // defpackage.jc
    public final float h(CardView.a aVar) {
        return o(aVar).f;
    }

    @Override // defpackage.jc
    public final void j(CardView.a aVar, float f) {
        jm0 o = o(aVar);
        o.d(f, o.h);
    }

    @Override // defpackage.jc
    public final float k(CardView.a aVar) {
        return o(aVar).j;
    }

    @Override // defpackage.jc
    public final void l(CardView.a aVar) {
        jm0 o = o(aVar);
        o.o = CardView.this.getPreventCornerOverlap();
        o.invalidateSelf();
        p(aVar);
    }

    @Override // defpackage.jc
    public final void m(CardView.a aVar, Context context, ColorStateList colorStateList, float f, float f2, float f3) {
        jm0 jm0Var = new jm0(context.getResources(), colorStateList, f, f2, f3);
        jm0Var.o = CardView.this.getPreventCornerOverlap();
        jm0Var.invalidateSelf();
        aVar.a = jm0Var;
        CardView.this.setBackgroundDrawable(jm0Var);
        p(aVar);
    }

    @Override // defpackage.jc
    public final float n(CardView.a aVar) {
        return o(aVar).h;
    }

    public final void p(ic icVar) {
        Rect rect = new Rect();
        o(icVar).getPadding(rect);
        CardView.a aVar = (CardView.a) icVar;
        int ceil = (int) Math.ceil(c(aVar));
        int ceil2 = (int) Math.ceil(b(aVar));
        CardView cardView = CardView.this;
        if (ceil > cardView.R) {
            super/*android.widget.FrameLayout*/.setMinimumWidth(ceil);
        }
        CardView cardView2 = CardView.this;
        if (ceil2 > cardView2.S) {
            super/*android.widget.FrameLayout*/.setMinimumHeight(ceil2);
        }
        aVar.a(rect.left, rect.top, rect.right, rect.bottom);
    }
}