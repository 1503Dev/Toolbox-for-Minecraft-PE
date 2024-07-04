package defpackage;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.StateSet;
import defpackage.om;
import defpackage.xt0;
import org.xmlpull.v1.XmlPullParserException;

@SuppressLint({"RestrictedAPI"})
/* renamed from: f4  reason: default package */
public final class f4 extends xt0 implements dx0 {
    public b e0;
    public f f0;
    public int g0;
    public int h0;
    public boolean i0;

    /* renamed from: f4$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class a extends f {
        public final Animatable a;

        public a(Animatable animatable) {
            this.a = animatable;
        }

        @Override // defpackage.f4.f
        public final void c() {
            this.a.start();
        }

        @Override // defpackage.f4.f
        public final void d() {
            this.a.stop();
        }
    }

    /* renamed from: f4$b */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class b extends xt0.a {
        public d30<Long> I;
        public nt0<Integer> J;

        public b(b bVar, f4 f4Var, Resources resources) {
            super(bVar, f4Var, resources);
            nt0<Integer> nt0Var;
            if (bVar != null) {
                this.I = bVar.I;
                nt0Var = bVar.J;
            } else {
                this.I = new d30<>();
                nt0Var = new nt0<>();
            }
            this.J = nt0Var;
        }

        @Override // defpackage.xt0.a, defpackage.om.c
        public final void e() {
            this.I = this.I.clone();
            this.J = this.J.clone();
        }

        @Override // defpackage.xt0.a, android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable() {
            return new f4(this, null);
        }

        @Override // defpackage.xt0.a, android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources) {
            return new f4(this, resources);
        }
    }

    /* renamed from: f4$c */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class c extends f {
        public final g4 a;

        public c(g4 g4Var) {
            this.a = g4Var;
        }

        @Override // defpackage.f4.f
        public final void c() {
            this.a.start();
        }

        @Override // defpackage.f4.f
        public final void d() {
            this.a.stop();
        }
    }

    /* renamed from: f4$d */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class d extends f {
        public final ObjectAnimator a;
        public final boolean b;

        public d(AnimationDrawable animationDrawable, boolean z, boolean z2) {
            int i;
            int i2;
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            if (z) {
                i = numberOfFrames - 1;
            } else {
                i = 0;
            }
            if (z) {
                i2 = 0;
            } else {
                i2 = numberOfFrames - 1;
            }
            e eVar = new e(animationDrawable, z);
            ObjectAnimator ofInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", i, i2);
            ofInt.setAutoCancel(true);
            ofInt.setDuration(eVar.c);
            ofInt.setInterpolator(eVar);
            this.b = z2;
            this.a = ofInt;
        }

        @Override // defpackage.f4.f
        public final boolean a() {
            return this.b;
        }

        @Override // defpackage.f4.f
        public final void b() {
            this.a.reverse();
        }

        @Override // defpackage.f4.f
        public final void c() {
            this.a.start();
        }

        @Override // defpackage.f4.f
        public final void d() {
            this.a.cancel();
        }
    }

    /* renamed from: f4$e */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class e implements TimeInterpolator {
        public int[] a;
        public int b;
        public int c;

        public e(AnimationDrawable animationDrawable, boolean z) {
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            this.b = numberOfFrames;
            int[] iArr = this.a;
            if (iArr == null || iArr.length < numberOfFrames) {
                this.a = new int[numberOfFrames];
            }
            int[] iArr2 = this.a;
            int i = 0;
            for (int i2 = 0; i2 < numberOfFrames; i2++) {
                int duration = animationDrawable.getDuration(z ? (numberOfFrames - i2) - 1 : i2);
                iArr2[i2] = duration;
                i += duration;
            }
            this.c = i;
        }

        @Override // android.animation.TimeInterpolator
        public final float getInterpolation(float f) {
            int i = (int) ((f * this.c) + 0.5f);
            int i2 = this.b;
            int[] iArr = this.a;
            int i3 = 0;
            while (i3 < i2) {
                int i4 = iArr[i3];
                if (i < i4) {
                    break;
                }
                i -= i4;
                i3++;
            }
            return (i3 / i2) + (i3 < i2 ? i / this.c : 0.0f);
        }
    }

    /* renamed from: f4$f */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static abstract class f {
        public boolean a() {
            return false;
        }

        public void b() {
        }

        public abstract void c();

        public abstract void d();
    }

    public f4() {
        this(null, null);
    }

    public f4(b bVar, Resources resources) {
        this.g0 = -1;
        this.h0 = -1;
        e(new b(bVar, this, resources));
        onStateChange(getState());
        jumpToCurrentState();
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x0288, code lost:
        throw new org.xmlpull.v1.XmlPullParserException(r26.getPositionDescription() + ": <transition> tag requires 'fromId' & 'toId' attributes");
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x02b4, code lost:
        r4.onStateChange(r4.getState());
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x02bb, code lost:
        return r4;
     */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0289 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x017d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x022d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static f4 g(Context context, Resources.Theme theme, Resources resources, AttributeSet attributeSet, XmlResourceParser xmlResourceParser) {
        int depth;
        int i;
        Context context2;
        Drawable drawable;
        long j;
        int next;
        Drawable drawable2;
        int next2;
        int i2;
        int changingConfigurations;
        Resources.Theme theme2 = theme;
        Resources resources2 = resources;
        String name = xmlResourceParser.getName();
        if (name.equals("animated-selector")) {
            f4 f4Var = new f4();
            TypedArray f2 = v11.f(resources2, theme2, attributeSet, cj0.AnimatedStateListDrawableCompat);
            int i3 = 1;
            f4Var.setVisible(f2.getBoolean(cj0.AnimatedStateListDrawableCompat_android_visible, true), true);
            b bVar = f4Var.e0;
            if (Build.VERSION.SDK_INT >= 21) {
                int i4 = bVar.d;
                changingConfigurations = f2.getChangingConfigurations();
                bVar.d = i4 | changingConfigurations;
            }
            bVar.i = f2.getBoolean(cj0.AnimatedStateListDrawableCompat_android_variablePadding, bVar.i);
            bVar.l = f2.getBoolean(cj0.AnimatedStateListDrawableCompat_android_constantSize, bVar.l);
            bVar.y = f2.getInt(cj0.AnimatedStateListDrawableCompat_android_enterFadeDuration, bVar.y);
            bVar.z = f2.getInt(cj0.AnimatedStateListDrawableCompat_android_exitFadeDuration, bVar.z);
            f4Var.setDither(f2.getBoolean(cj0.AnimatedStateListDrawableCompat_android_dither, bVar.w));
            om.c cVar = f4Var.P;
            int i5 = 0;
            if (resources2 != null) {
                cVar.b = resources2;
                int i6 = resources.getDisplayMetrics().densityDpi;
                if (i6 == 0) {
                    i6 = 160;
                }
                int i7 = cVar.c;
                cVar.c = i6;
                if (i7 != i6) {
                    cVar.m = false;
                    cVar.j = false;
                }
            } else {
                cVar.getClass();
            }
            f2.recycle();
            int depth2 = xmlResourceParser.getDepth() + 1;
            Context context3 = context;
            Resources.Theme theme3 = theme2;
            f4 f4Var2 = f4Var;
            while (true) {
                int next3 = xmlResourceParser.next();
                if (next3 == i3 || ((depth = xmlResourceParser.getDepth()) < depth2 && next3 == 3)) {
                    break;
                } else if (next3 == 2 && depth <= depth2) {
                    g4 g4Var = null;
                    if (xmlResourceParser.getName().equals("item")) {
                        TypedArray f3 = v11.f(resources2, theme3, attributeSet, cj0.AnimatedStateListDrawableItem);
                        int resourceId = f3.getResourceId(cj0.AnimatedStateListDrawableItem_android_id, i5);
                        int resourceId2 = f3.getResourceId(cj0.AnimatedStateListDrawableItem_android_drawable, -1);
                        if (resourceId2 > 0) {
                            g4Var = gl0.d().f(context3, resourceId2);
                        }
                        f3.recycle();
                        int attributeCount = attributeSet.getAttributeCount();
                        int[] iArr = new int[attributeCount];
                        int i8 = 0;
                        int i9 = 0;
                        while (i8 < attributeCount) {
                            int attributeNameResource = attributeSet.getAttributeNameResource(i8);
                            if (attributeNameResource != 0 && attributeNameResource != 16842960 && attributeNameResource != 16843161) {
                                int i10 = i9 + 1;
                                i2 = depth2;
                                if (!attributeSet.getAttributeBooleanValue(i8, false)) {
                                    attributeNameResource = -attributeNameResource;
                                }
                                iArr[i9] = attributeNameResource;
                                i9 = i10;
                            } else {
                                i2 = depth2;
                            }
                            i8++;
                            depth2 = i2;
                        }
                        i = depth2;
                        int[] trimStateSet = StateSet.trimStateSet(iArr, i9);
                        if (g4Var == null) {
                            do {
                                next2 = xmlResourceParser.next();
                            } while (next2 == 4);
                            if (next2 == 2) {
                                if (xmlResourceParser.getName().equals("vector")) {
                                    drawable2 = new g31();
                                    drawable2.inflate(resources2, xmlResourceParser, attributeSet, theme3);
                                    if (drawable2 == null) {
                                        b bVar2 = f4Var2.e0;
                                        int a2 = bVar2.a(drawable2);
                                        bVar2.H[a2] = trimStateSet;
                                        bVar2.J.e(a2, Integer.valueOf(resourceId));
                                    } else {
                                        throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
                                    }
                                } else if (Build.VERSION.SDK_INT >= 21) {
                                    g4Var = Drawable.createFromXmlInner(resources2, xmlResourceParser, attributeSet, theme3);
                                } else {
                                    g4Var = Drawable.createFromXmlInner(resources2, xmlResourceParser, attributeSet);
                                }
                            } else {
                                throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
                            }
                        }
                        drawable2 = g4Var;
                        if (drawable2 == null) {
                        }
                    } else {
                        i = depth2;
                        if (xmlResourceParser.getName().equals("transition")) {
                            TypedArray f4 = v11.f(resources2, theme3, attributeSet, cj0.AnimatedStateListDrawableTransition);
                            int resourceId3 = f4.getResourceId(cj0.AnimatedStateListDrawableTransition_android_fromId, -1);
                            int resourceId4 = f4.getResourceId(cj0.AnimatedStateListDrawableTransition_android_toId, -1);
                            int resourceId5 = f4.getResourceId(cj0.AnimatedStateListDrawableTransition_android_drawable, -1);
                            if (resourceId5 > 0) {
                                g4Var = gl0.d().f(context3, resourceId5);
                            }
                            boolean z = f4.getBoolean(cj0.AnimatedStateListDrawableTransition_android_reversible, false);
                            f4.recycle();
                            if (g4Var == null) {
                                do {
                                    next = xmlResourceParser.next();
                                } while (next == 4);
                                if (next == 2) {
                                    if (xmlResourceParser.getName().equals("animated-vector")) {
                                        context2 = context;
                                        g4 g4Var2 = new g4(context2);
                                        g4Var2.inflate(resources2, xmlResourceParser, attributeSet, theme2);
                                        g4Var = g4Var2;
                                    } else {
                                        context2 = context;
                                        if (Build.VERSION.SDK_INT >= 21) {
                                            drawable = Drawable.createFromXmlInner(resources2, xmlResourceParser, attributeSet, theme3);
                                        } else {
                                            drawable = Drawable.createFromXmlInner(resources2, xmlResourceParser, attributeSet);
                                        }
                                        if (drawable == null) {
                                            if (resourceId3 == -1 || resourceId4 == -1) {
                                                break;
                                            }
                                            b bVar3 = f4Var2.e0;
                                            int a3 = bVar3.a(drawable);
                                            long j2 = resourceId3;
                                            long j3 = resourceId4;
                                            long j4 = j3 | (j2 << 32);
                                            if (z) {
                                                j = 8589934592L;
                                            } else {
                                                j = 0;
                                            }
                                            long j5 = a3;
                                            bVar3.I.a(j4, Long.valueOf(j5 | j));
                                            if (z) {
                                                bVar3.I.a((j3 << 32) | j2, Long.valueOf(j5 | 4294967296L | j));
                                            }
                                        } else {
                                            throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
                                        }
                                    }
                                } else {
                                    throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
                                }
                            } else {
                                context2 = context;
                            }
                            drawable = g4Var;
                            if (drawable == null) {
                            }
                        } else {
                            context2 = context;
                        }
                        theme3 = theme;
                        f4Var2 = f4Var;
                        context3 = context2;
                    }
                    theme2 = theme;
                    resources2 = resources;
                    depth2 = i;
                    i3 = 1;
                    i5 = 0;
                }
            }
        } else {
            throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": invalid animated-selector tag " + name);
        }
    }

    @Override // defpackage.xt0, defpackage.om
    public final om.c b() {
        return new b(this.e0, this, null);
    }

    @Override // defpackage.xt0, defpackage.om
    public final void e(om.c cVar) {
        super.e(cVar);
        if (cVar instanceof b) {
            this.e0 = (b) cVar;
        }
    }

    @Override // defpackage.xt0
    public final xt0.a f() {
        return new b(this.e0, this, null);
    }

    @Override // defpackage.om, android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        super.jumpToCurrentState();
        f fVar = this.f0;
        if (fVar != null) {
            fVar.d();
            this.f0 = null;
            d(this.g0);
            this.g0 = -1;
            this.h0 = -1;
        }
    }

    @Override // defpackage.xt0, defpackage.om, android.graphics.drawable.Drawable
    public final Drawable mutate() {
        if (!this.i0) {
            super.mutate();
            this.e0.e();
            this.i0 = true;
        }
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x010b, code lost:
        if (d(r3) == false) goto L56;
     */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.xt0, defpackage.om, android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onStateChange(int[] iArr) {
        Drawable drawable;
        int intValue;
        int intValue2;
        boolean z;
        boolean z2;
        f aVar;
        boolean z3;
        b bVar = this.e0;
        int f2 = bVar.f(iArr);
        if (f2 < 0) {
            f2 = bVar.f(StateSet.WILD_CARD);
        }
        int i = this.V;
        boolean z4 = true;
        if (f2 != i) {
            f fVar = this.f0;
            if (fVar != null) {
                if (f2 != this.g0) {
                    if (f2 == this.h0 && fVar.a()) {
                        fVar.b();
                        this.g0 = this.h0;
                        this.h0 = f2;
                    } else {
                        i = this.g0;
                        fVar.d();
                    }
                }
                z = true;
                if (!z) {
                }
                drawable = this.R;
                if (drawable == null) {
                    return z4 | drawable.setState(iArr);
                }
                return z4;
            }
            this.f0 = null;
            this.h0 = -1;
            this.g0 = -1;
            b bVar2 = this.e0;
            if (i < 0) {
                bVar2.getClass();
                intValue = 0;
            } else {
                intValue = ((Integer) bVar2.J.d(i, 0)).intValue();
            }
            if (f2 < 0) {
                intValue2 = 0;
            } else {
                intValue2 = ((Integer) bVar2.J.d(f2, 0)).intValue();
            }
            if (intValue2 != 0 && intValue != 0) {
                long j = intValue2 | (intValue << 32);
                int longValue = (int) ((Long) bVar2.I.e(j, -1L)).longValue();
                if (longValue >= 0) {
                    if ((((Long) bVar2.I.e(j, -1L)).longValue() & 8589934592L) != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    d(longValue);
                    Drawable drawable2 = this.R;
                    if (drawable2 instanceof AnimationDrawable) {
                        if ((((Long) bVar2.I.e(j, -1L)).longValue() & 4294967296L) != 0) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        aVar = new d((AnimationDrawable) drawable2, z3, z2);
                    } else if (drawable2 instanceof g4) {
                        aVar = new c((g4) drawable2);
                    } else if (drawable2 instanceof Animatable) {
                        aVar = new a((Animatable) drawable2);
                    }
                    aVar.c();
                    this.f0 = aVar;
                    this.h0 = i;
                    this.g0 = f2;
                    z = true;
                    if (!z) {
                    }
                    drawable = this.R;
                    if (drawable == null) {
                    }
                }
            }
            z = false;
            if (!z) {
            }
            drawable = this.R;
            if (drawable == null) {
            }
        }
        z4 = false;
        drawable = this.R;
        if (drawable == null) {
        }
    }

    @Override // defpackage.om, android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        f fVar = this.f0;
        if (fVar != null && (visible || z2)) {
            if (z) {
                fVar.c();
            } else {
                jumpToCurrentState();
            }
        }
        return visible;
    }
}