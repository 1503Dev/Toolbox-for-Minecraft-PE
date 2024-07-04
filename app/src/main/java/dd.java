package defpackage;

import android.animation.TypeEvaluator;
import android.graphics.drawable.Drawable;
import android.util.Property;

/* renamed from: dd  reason: default package */
public interface dd {

    /* renamed from: dd$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class a implements TypeEvaluator<d> {
        public static final a b = new a();
        public final d a = new d();

        @Override // android.animation.TypeEvaluator
        public final d evaluate(float f, d dVar, d dVar2) {
            d dVar3 = dVar;
            d dVar4 = dVar2;
            d dVar5 = this.a;
            float f2 = dVar3.a;
            float f3 = 1.0f - f;
            float f4 = (dVar4.a * f) + (f2 * f3);
            float f5 = dVar3.b;
            float f6 = dVar4.b * f;
            float f7 = dVar3.c;
            float f8 = f * dVar4.c;
            dVar5.a = f4;
            dVar5.b = f6 + (f5 * f3);
            dVar5.c = f8 + (f3 * f7);
            return dVar5;
        }
    }

    /* renamed from: dd$b */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class b extends Property<dd, d> {
        public static final b a = new b();

        public b() {
            super(d.class, "circularReveal");
        }

        @Override // android.util.Property
        public final d get(dd ddVar) {
            return ddVar.getRevealInfo();
        }

        @Override // android.util.Property
        public final void set(dd ddVar, d dVar) {
            ddVar.setRevealInfo(dVar);
        }
    }

    /* renamed from: dd$c */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class c extends Property<dd, Integer> {
        public static final c a = new c();

        public c() {
            super(Integer.class, "circularRevealScrimColor");
        }

        @Override // android.util.Property
        public final Integer get(dd ddVar) {
            return Integer.valueOf(ddVar.getCircularRevealScrimColor());
        }

        @Override // android.util.Property
        public final void set(dd ddVar, Integer num) {
            ddVar.setCircularRevealScrimColor(num.intValue());
        }
    }

    /* renamed from: dd$d */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class d {
        public float a;
        public float b;
        public float c;

        public d() {
        }

        public d(float f, float f2, float f3) {
            this.a = f;
            this.b = f2;
            this.c = f3;
        }
    }

    void a();

    void b();

    int getCircularRevealScrimColor();

    d getRevealInfo();

    void setCircularRevealOverlayDrawable(Drawable drawable);

    void setCircularRevealScrimColor(int i);

    void setRevealInfo(d dVar);
}