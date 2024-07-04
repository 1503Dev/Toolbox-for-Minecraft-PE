package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;
import java.util.WeakHashMap;

/* renamed from: pc  reason: default package */
public final class pc extends u01 {
    public static final String[] m0 = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};
    public static final b n0;
    public static final c o0;
    public static final d p0;
    public static final e q0;
    public static final f r0;

    /* renamed from: pc$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class a extends Property<Drawable, PointF> {
        public Rect a;

        public a(Class cls) {
            super(cls, "boundsOrigin");
            this.a = new Rect();
        }

        @Override // android.util.Property
        public final PointF get(Drawable drawable) {
            drawable.copyBounds(this.a);
            Rect rect = this.a;
            return new PointF(rect.left, rect.top);
        }

        @Override // android.util.Property
        public final void set(Drawable drawable, PointF pointF) {
            Drawable drawable2 = drawable;
            PointF pointF2 = pointF;
            drawable2.copyBounds(this.a);
            this.a.offsetTo(Math.round(pointF2.x), Math.round(pointF2.y));
            drawable2.setBounds(this.a);
        }
    }

    /* renamed from: pc$b */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class b extends Property<i, PointF> {
        public b(Class cls) {
            super(cls, "topLeft");
        }

        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ PointF get(i iVar) {
            return null;
        }

        @Override // android.util.Property
        public final void set(i iVar, PointF pointF) {
            i iVar2 = iVar;
            PointF pointF2 = pointF;
            iVar2.getClass();
            iVar2.a = Math.round(pointF2.x);
            int round = Math.round(pointF2.y);
            iVar2.b = round;
            int i = iVar2.f + 1;
            iVar2.f = i;
            if (i == iVar2.g) {
                a51.a(iVar2.e, iVar2.a, round, iVar2.c, iVar2.d);
                iVar2.f = 0;
                iVar2.g = 0;
            }
        }
    }

    /* renamed from: pc$c */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class c extends Property<i, PointF> {
        public c(Class cls) {
            super(cls, "bottomRight");
        }

        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ PointF get(i iVar) {
            return null;
        }

        @Override // android.util.Property
        public final void set(i iVar, PointF pointF) {
            i iVar2 = iVar;
            PointF pointF2 = pointF;
            iVar2.getClass();
            iVar2.c = Math.round(pointF2.x);
            int round = Math.round(pointF2.y);
            iVar2.d = round;
            int i = iVar2.g + 1;
            iVar2.g = i;
            if (iVar2.f == i) {
                a51.a(iVar2.e, iVar2.a, iVar2.b, iVar2.c, round);
                iVar2.f = 0;
                iVar2.g = 0;
            }
        }
    }

    /* renamed from: pc$d */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class d extends Property<View, PointF> {
        public d(Class cls) {
            super(cls, "bottomRight");
        }

        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        public final void set(View view, PointF pointF) {
            View view2 = view;
            PointF pointF2 = pointF;
            a51.a(view2, view2.getLeft(), view2.getTop(), Math.round(pointF2.x), Math.round(pointF2.y));
        }
    }

    /* renamed from: pc$e */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class e extends Property<View, PointF> {
        public e(Class cls) {
            super(cls, "topLeft");
        }

        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        public final void set(View view, PointF pointF) {
            View view2 = view;
            PointF pointF2 = pointF;
            a51.a(view2, Math.round(pointF2.x), Math.round(pointF2.y), view2.getRight(), view2.getBottom());
        }
    }

    /* renamed from: pc$f */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class f extends Property<View, PointF> {
        public f(Class cls) {
            super(cls, "position");
        }

        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        public final void set(View view, PointF pointF) {
            View view2 = view;
            PointF pointF2 = pointF;
            int round = Math.round(pointF2.x);
            int round2 = Math.round(pointF2.y);
            a51.a(view2, round, round2, view2.getWidth() + round, view2.getHeight() + round2);
        }
    }

    /* renamed from: pc$g */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class g extends AnimatorListenerAdapter {
        private i mViewBounds;

        public g(i iVar) {
            this.mViewBounds = iVar;
        }
    }

    /* renamed from: pc$h */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class h extends x01 {
        public boolean a = false;
        public final /* synthetic */ ViewGroup b;

        public h(ViewGroup viewGroup) {
            this.b = viewGroup;
        }

        @Override // defpackage.x01, defpackage.u01.d
        public final void b() {
            h41.a(this.b, false);
        }

        @Override // defpackage.x01, defpackage.u01.d
        public final void c() {
            h41.a(this.b, true);
        }

        @Override // defpackage.u01.d
        public final void d(u01 u01Var) {
            if (!this.a) {
                h41.a(this.b, false);
            }
            u01Var.x(this);
        }

        @Override // defpackage.x01, defpackage.u01.d
        public final void e() {
            h41.a(this.b, false);
            this.a = true;
        }
    }

    /* renamed from: pc$i */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class i {
        public int a;
        public int b;
        public int c;
        public int d;
        public View e;
        public int f;
        public int g;

        public i(View view) {
            this.e = view;
        }
    }

    static {
        new a(PointF.class);
        n0 = new b(PointF.class);
        o0 = new c(PointF.class);
        p0 = new d(PointF.class);
        q0 = new e(PointF.class);
        r0 = new f(PointF.class);
    }

    public final void K(c11 c11Var) {
        View view = c11Var.b;
        WeakHashMap<View, String> weakHashMap = a41.a;
        if (view.isLaidOut() || view.getWidth() != 0 || view.getHeight() != 0) {
            c11Var.a.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
            c11Var.a.put("android:changeBounds:parent", c11Var.b.getParent());
        }
    }

    @Override // defpackage.u01
    public final void d(c11 c11Var) {
        K(c11Var);
    }

    @Override // defpackage.u01
    public final void h(c11 c11Var) {
        K(c11Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0114  */
    @Override // defpackage.u01
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Animator l(ViewGroup viewGroup, c11 c11Var, c11 c11Var2) {
        int i2;
        pc pcVar;
        Path Q;
        Property property;
        ObjectAnimator objectAnimator;
        if (c11Var != null && c11Var2 != null) {
            HashMap hashMap = c11Var.a;
            HashMap hashMap2 = c11Var2.a;
            ViewGroup viewGroup2 = (ViewGroup) hashMap.get("android:changeBounds:parent");
            ViewGroup viewGroup3 = (ViewGroup) hashMap2.get("android:changeBounds:parent");
            if (viewGroup2 != null && viewGroup3 != null) {
                View view = c11Var2.b;
                Rect rect = (Rect) c11Var.a.get("android:changeBounds:bounds");
                Rect rect2 = (Rect) c11Var2.a.get("android:changeBounds:bounds");
                int i3 = rect.left;
                int i4 = rect2.left;
                int i5 = rect.top;
                int i6 = rect2.top;
                int i7 = rect.right;
                int i8 = rect2.right;
                int i9 = rect.bottom;
                int i10 = rect2.bottom;
                int i11 = i7 - i3;
                int i12 = i9 - i5;
                int i13 = i8 - i4;
                int i14 = i10 - i6;
                Rect rect3 = (Rect) c11Var.a.get("android:changeBounds:clip");
                Rect rect4 = (Rect) c11Var2.a.get("android:changeBounds:clip");
                if ((i11 != 0 && i12 != 0) || (i13 != 0 && i14 != 0)) {
                    if (i3 == i4 && i5 == i6) {
                        i2 = 0;
                    } else {
                        i2 = 1;
                    }
                    if (i7 != i8 || i9 != i10) {
                        i2++;
                    }
                } else {
                    i2 = 0;
                }
                if ((rect3 != null && !rect3.equals(rect4)) || (rect3 == null && rect4 != null)) {
                    i2++;
                }
                int i15 = i2;
                if (i15 > 0) {
                    a51.a(view, i3, i5, i7, i9);
                    if (i15 == 2) {
                        if (i11 == i13 && i12 == i14) {
                            pcVar = this;
                            Q = pcVar.i0.Q(i3, i5, i4, i6);
                            property = r0;
                        } else {
                            pcVar = this;
                            i iVar = new i(view);
                            ObjectAnimator a2 = sa0.a(iVar, n0, pcVar.i0.Q(i3, i5, i4, i6));
                            ObjectAnimator a3 = sa0.a(iVar, o0, pcVar.i0.Q(i7, i9, i8, i10));
                            AnimatorSet animatorSet = new AnimatorSet();
                            animatorSet.playTogether(a2, a3);
                            animatorSet.addListener(new g(iVar));
                            objectAnimator = animatorSet;
                            if (view.getParent() instanceof ViewGroup) {
                                ViewGroup viewGroup4 = (ViewGroup) view.getParent();
                                h41.a(viewGroup4, true);
                                pcVar.a(new h(viewGroup4));
                            }
                            return objectAnimator;
                        }
                    } else {
                        pcVar = this;
                        if (i3 == i4 && i5 == i6) {
                            Q = pcVar.i0.Q(i7, i9, i8, i10);
                            property = p0;
                        } else {
                            Q = pcVar.i0.Q(i3, i5, i4, i6);
                            property = q0;
                        }
                    }
                    objectAnimator = sa0.a(view, property, Q);
                    if (view.getParent() instanceof ViewGroup) {
                    }
                    return objectAnimator;
                }
                return null;
            }
            return null;
        }
        return null;
    }

    @Override // defpackage.u01
    public final String[] q() {
        return m0;
    }
}