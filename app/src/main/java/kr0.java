package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;

/* renamed from: kr0  reason: default package */
public final class kr0 {
    public ga1 a;
    public ga1 b;
    public ga1 c;
    public ga1 d;
    public tg e;
    public tg f;
    public tg g;
    public tg h;
    public fo i;
    public fo j;
    public fo k;
    public fo l;

    public kr0() {
        this.a = new km0();
        this.b = new km0();
        this.c = new km0();
        this.d = new km0();
        this.e = new d0(0.0f);
        this.f = new d0(0.0f);
        this.g = new d0(0.0f);
        this.h = new d0(0.0f);
        this.i = new fo();
        this.j = new fo();
        this.k = new fo();
        this.l = new fo();
    }

    public static a a(Context context, int i, int i2, d0 d0Var) {
        if (i2 != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i);
            i = i2;
            context = contextThemeWrapper;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, ij0.ShapeAppearance);
        try {
            int i3 = obtainStyledAttributes.getInt(ij0.ShapeAppearance_cornerFamily, 0);
            int i4 = obtainStyledAttributes.getInt(ij0.ShapeAppearance_cornerFamilyTopLeft, i3);
            int i5 = obtainStyledAttributes.getInt(ij0.ShapeAppearance_cornerFamilyTopRight, i3);
            int i6 = obtainStyledAttributes.getInt(ij0.ShapeAppearance_cornerFamilyBottomRight, i3);
            int i7 = obtainStyledAttributes.getInt(ij0.ShapeAppearance_cornerFamilyBottomLeft, i3);
            tg c = c(obtainStyledAttributes, ij0.ShapeAppearance_cornerSize, d0Var);
            tg c2 = c(obtainStyledAttributes, ij0.ShapeAppearance_cornerSizeTopLeft, c);
            tg c3 = c(obtainStyledAttributes, ij0.ShapeAppearance_cornerSizeTopRight, c);
            tg c4 = c(obtainStyledAttributes, ij0.ShapeAppearance_cornerSizeBottomRight, c);
            tg c5 = c(obtainStyledAttributes, ij0.ShapeAppearance_cornerSizeBottomLeft, c);
            a aVar = new a();
            ga1 n = vj.n(i4);
            aVar.a = n;
            float b = a.b(n);
            if (b != -1.0f) {
                aVar.e = new d0(b);
            }
            aVar.e = c2;
            ga1 n2 = vj.n(i5);
            aVar.b = n2;
            float b2 = a.b(n2);
            if (b2 != -1.0f) {
                aVar.f = new d0(b2);
            }
            aVar.f = c3;
            ga1 n3 = vj.n(i6);
            aVar.c = n3;
            float b3 = a.b(n3);
            if (b3 != -1.0f) {
                aVar.g = new d0(b3);
            }
            aVar.g = c4;
            ga1 n4 = vj.n(i7);
            aVar.d = n4;
            float b4 = a.b(n4);
            if (b4 != -1.0f) {
                aVar.h = new d0(b4);
            }
            aVar.h = c5;
            return aVar;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static a b(Context context, AttributeSet attributeSet, int i, int i2) {
        d0 d0Var = new d0(0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ij0.MaterialShape, i, i2);
        int resourceId = obtainStyledAttributes.getResourceId(ij0.MaterialShape_shapeAppearance, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(ij0.MaterialShape_shapeAppearanceOverlay, 0);
        obtainStyledAttributes.recycle();
        return a(context, resourceId, resourceId2, d0Var);
    }

    public static tg c(TypedArray typedArray, int i, tg tgVar) {
        TypedValue peekValue = typedArray.peekValue(i);
        if (peekValue == null) {
            return tgVar;
        }
        int i2 = peekValue.type;
        return i2 == 5 ? new d0(TypedValue.complexToDimensionPixelSize(peekValue.data, typedArray.getResources().getDisplayMetrics())) : i2 == 6 ? new lk0(peekValue.getFraction(1.0f, 1.0f)) : tgVar;
    }

    public final boolean d(RectF rectF) {
        boolean z = this.l.getClass().equals(fo.class) && this.j.getClass().equals(fo.class) && this.i.getClass().equals(fo.class) && this.k.getClass().equals(fo.class);
        float a2 = this.e.a(rectF);
        return z && ((this.f.a(rectF) > a2 ? 1 : (this.f.a(rectF) == a2 ? 0 : -1)) == 0 && (this.h.a(rectF) > a2 ? 1 : (this.h.a(rectF) == a2 ? 0 : -1)) == 0 && (this.g.a(rectF) > a2 ? 1 : (this.g.a(rectF) == a2 ? 0 : -1)) == 0) && ((this.b instanceof km0) && (this.a instanceof km0) && (this.c instanceof km0) && (this.d instanceof km0));
    }

    public final kr0 e(float f) {
        a aVar = new a(this);
        aVar.e = new d0(f);
        aVar.f = new d0(f);
        aVar.g = new d0(f);
        aVar.h = new d0(f);
        return new kr0(aVar);
    }

    /* renamed from: kr0$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static final class a {
        public ga1 a;
        public ga1 b;
        public ga1 c;
        public ga1 d;
        public tg e;
        public tg f;
        public tg g;
        public tg h;
        public fo i;
        public fo j;
        public fo k;
        public fo l;

        public a() {
            this.a = new km0();
            this.b = new km0();
            this.c = new km0();
            this.d = new km0();
            this.e = new d0(0.0f);
            this.f = new d0(0.0f);
            this.g = new d0(0.0f);
            this.h = new d0(0.0f);
            this.i = new fo();
            this.j = new fo();
            this.k = new fo();
            this.l = new fo();
        }

        public static float b(ga1 ga1Var) {
            if (ga1Var instanceof km0) {
                return ((km0) ga1Var).g0;
            }
            if (ga1Var instanceof sh) {
                return ((sh) ga1Var).g0;
            }
            return -1.0f;
        }

        public final kr0 a() {
            return new kr0(this);
        }

        public a(kr0 kr0Var) {
            this.a = new km0();
            this.b = new km0();
            this.c = new km0();
            this.d = new km0();
            this.e = new d0(0.0f);
            this.f = new d0(0.0f);
            this.g = new d0(0.0f);
            this.h = new d0(0.0f);
            this.i = new fo();
            this.j = new fo();
            this.k = new fo();
            this.l = new fo();
            this.a = kr0Var.a;
            this.b = kr0Var.b;
            this.c = kr0Var.c;
            this.d = kr0Var.d;
            this.e = kr0Var.e;
            this.f = kr0Var.f;
            this.g = kr0Var.g;
            this.h = kr0Var.h;
            this.i = kr0Var.i;
            this.j = kr0Var.j;
            this.k = kr0Var.k;
            this.l = kr0Var.l;
        }
    }

    public kr0(a aVar) {
        this.a = aVar.a;
        this.b = aVar.b;
        this.c = aVar.c;
        this.d = aVar.d;
        this.e = aVar.e;
        this.f = aVar.f;
        this.g = aVar.g;
        this.h = aVar.h;
        this.i = aVar.i;
        this.j = aVar.j;
        this.k = aVar.k;
        this.l = aVar.l;
    }
}