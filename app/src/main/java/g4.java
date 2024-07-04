package defpackage;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import defpackage.g31;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: g4  reason: default package */
public final class g4 extends f31 implements Animatable {
    public b Q;
    public Context R;
    public ArgbEvaluator S;
    public final a T;

    /* renamed from: g4$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class a implements Drawable.Callback {
        public a() {
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public final void invalidateDrawable(Drawable drawable) {
            g4.this.invalidateSelf();
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
            g4.this.scheduleSelf(runnable, j);
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            g4.this.unscheduleSelf(runnable);
        }
    }

    /* renamed from: g4$b */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class b extends Drawable.ConstantState {
        public g31 a;
        public AnimatorSet b;
        public ArrayList<Animator> c;
        public e7<Animator, String> d;

        public b(a aVar) {
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable() {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources) {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }
    }

    /* renamed from: g4$c */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class c extends Drawable.ConstantState {
        public final Drawable.ConstantState a;

        public c(Drawable.ConstantState constantState) {
            this.a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final boolean canApplyTheme() {
            return sm.a(this.a);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final int getChangingConfigurations() {
            return this.a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable() {
            g4 g4Var = new g4();
            Drawable newDrawable = this.a.newDrawable();
            g4Var.P = newDrawable;
            newDrawable.setCallback(g4Var.T);
            return g4Var;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources) {
            g4 g4Var = new g4();
            Drawable newDrawable = this.a.newDrawable(resources);
            g4Var.P = newDrawable;
            newDrawable.setCallback(g4Var.T);
            return g4Var;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
            Drawable newDrawable;
            g4 g4Var = new g4();
            newDrawable = this.a.newDrawable(resources, theme);
            g4Var.P = newDrawable;
            newDrawable.setCallback(g4Var.T);
            return g4Var;
        }
    }

    public g4() {
        this(null);
    }

    public g4(Context context) {
        this.S = null;
        a aVar = new a();
        this.T = aVar;
        this.R = context;
        this.Q = new b(aVar);
    }

    public final void a(Animator animator) {
        ArrayList<Animator> childAnimations;
        if ((animator instanceof AnimatorSet) && (childAnimations = ((AnimatorSet) animator).getChildAnimations()) != null) {
            for (int i = 0; i < childAnimations.size(); i++) {
                a(childAnimations.get(i));
            }
        }
        if (animator instanceof ObjectAnimator) {
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            String propertyName = objectAnimator.getPropertyName();
            if ("fillColor".equals(propertyName) || "strokeColor".equals(propertyName)) {
                if (this.S == null) {
                    this.S = new ArgbEvaluator();
                }
                objectAnimator.setEvaluator(this.S);
            }
        }
    }

    @Override // defpackage.f31, android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.P;
        if (drawable == null || Build.VERSION.SDK_INT < 21) {
            return;
        }
        drawable.applyTheme(theme);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.P;
        if (drawable == null || Build.VERSION.SDK_INT < 21) {
            return false;
        }
        return pm.b(drawable);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.P;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        this.Q.a.draw(canvas);
        if (this.Q.b.isStarted()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.P;
        if (drawable != null) {
            return drawable.getAlpha();
        }
        return this.Q.a.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.P;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        int changingConfigurations = super.getChangingConfigurations();
        this.Q.getClass();
        return changingConfigurations | 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.P;
        if (drawable != null) {
            if (Build.VERSION.SDK_INT >= 21) {
                return fm.a(drawable);
            }
            return null;
        }
        return this.Q.a.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.P == null || Build.VERSION.SDK_INT < 24) {
            return null;
        }
        return new c(this.P.getConstantState());
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.P;
        return drawable != null ? drawable.getIntrinsicHeight() : this.Q.a.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.P;
        return drawable != null ? drawable.getIntrinsicWidth() : this.Q.a.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.P;
        return drawable != null ? drawable.getOpacity() : this.Q.a.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        inflate(resources, xmlPullParser, attributeSet, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00b3  */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        XmlResourceParser animation;
        Animator a2;
        g31 g31Var;
        int next;
        g31 g31Var2;
        Drawable drawable = this.P;
        if (drawable != null) {
            if (Build.VERSION.SDK_INT >= 21) {
                drawable.inflate(resources, xmlPullParser, attributeSet, theme);
                return;
            } else {
                drawable.inflate(resources, xmlPullParser, attributeSet);
                return;
            }
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                XmlResourceParser xmlResourceParser = null;
                if ("animated-vector".equals(name)) {
                    TypedArray f = v11.f(resources, theme, attributeSet, c4.e);
                    int resourceId = f.getResourceId(0, 0);
                    if (resourceId != 0) {
                        PorterDuff.Mode mode = g31.Y;
                        int i = Build.VERSION.SDK_INT;
                        if (i >= 24) {
                            g31Var = new g31();
                            ThreadLocal<TypedValue> threadLocal = il0.a;
                            g31Var.P = i >= 21 ? resources.getDrawable(resourceId, theme) : resources.getDrawable(resourceId);
                            new g31.h(g31Var.P.getConstantState());
                        } else {
                            try {
                                XmlResourceParser xml = resources.getXml(resourceId);
                                AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
                                while (true) {
                                    next = xml.next();
                                    if (next == 2 || next == 1) {
                                        break;
                                    }
                                }
                                if (next == 2) {
                                    g31Var = new g31();
                                    g31Var.inflate(resources, xml, asAttributeSet, theme);
                                } else {
                                    throw new XmlPullParserException("No start tag found");
                                    break;
                                }
                            } catch (IOException e) {
                                e = e;
                                Log.e("VectorDrawableCompat", "parser error", e);
                                g31Var = null;
                                g31Var.U = false;
                                g31Var.setCallback(this.T);
                                g31Var2 = this.Q.a;
                                if (g31Var2 != null) {
                                }
                                this.Q.a = g31Var;
                                f.recycle();
                                eventType = xmlPullParser.next();
                            } catch (XmlPullParserException e2) {
                                e = e2;
                                Log.e("VectorDrawableCompat", "parser error", e);
                                g31Var = null;
                                g31Var.U = false;
                                g31Var.setCallback(this.T);
                                g31Var2 = this.Q.a;
                                if (g31Var2 != null) {
                                }
                                this.Q.a = g31Var;
                                f.recycle();
                                eventType = xmlPullParser.next();
                            }
                        }
                        g31Var.U = false;
                        g31Var.setCallback(this.T);
                        g31Var2 = this.Q.a;
                        if (g31Var2 != null) {
                            g31Var2.setCallback(null);
                        }
                        this.Q.a = g31Var;
                    }
                    f.recycle();
                } else if ("target".equals(name)) {
                    TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, c4.f);
                    String string = obtainAttributes.getString(0);
                    int resourceId2 = obtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.R;
                        if (context != null) {
                            int i2 = Build.VERSION.SDK_INT;
                            if (i2 >= 24) {
                                a2 = AnimatorInflater.loadAnimator(context, resourceId2);
                            } else {
                                Resources resources2 = context.getResources();
                                Resources.Theme theme2 = context.getTheme();
                                try {
                                    try {
                                        animation = resources2.getAnimation(resourceId2);
                                    } catch (Throwable th) {
                                        th = th;
                                    }
                                } catch (IOException e3) {
                                    e = e3;
                                } catch (XmlPullParserException e4) {
                                    e = e4;
                                }
                                try {
                                    a2 = k4.a(context, resources2, theme2, animation, Xml.asAttributeSet(animation), null, 0);
                                    animation.close();
                                } catch (IOException e5) {
                                    e = e5;
                                    Resources.NotFoundException notFoundException = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(resourceId2));
                                    notFoundException.initCause(e);
                                    throw notFoundException;
                                } catch (XmlPullParserException e6) {
                                    e = e6;
                                    Resources.NotFoundException notFoundException2 = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(resourceId2));
                                    notFoundException2.initCause(e);
                                    throw notFoundException2;
                                } catch (Throwable th2) {
                                    th = th2;
                                    xmlResourceParser = animation;
                                    if (xmlResourceParser != null) {
                                        xmlResourceParser.close();
                                    }
                                    throw th;
                                }
                            }
                            a2.setTarget(this.Q.a.Q.b.o.getOrDefault(string, null));
                            if (i2 < 21) {
                                a(a2);
                            }
                            b bVar = this.Q;
                            if (bVar.c == null) {
                                bVar.c = new ArrayList<>();
                                this.Q.d = new e7<>();
                            }
                            this.Q.c.add(a2);
                            this.Q.d.put(a2, string);
                        } else {
                            obtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                    }
                    obtainAttributes.recycle();
                } else {
                    continue;
                }
            }
            eventType = xmlPullParser.next();
        }
        b bVar2 = this.Q;
        if (bVar2.b == null) {
            bVar2.b = new AnimatorSet();
        }
        bVar2.b.playTogether(bVar2.c);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.P;
        if (drawable != null) {
            return drawable.isAutoMirrored();
        }
        return this.Q.a.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        Drawable drawable = this.P;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.Q.b.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.P;
        return drawable != null ? drawable.isStateful() : this.Q.a.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.P;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.P;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.Q.a.setBounds(rect);
        }
    }

    @Override // defpackage.f31, android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        Drawable drawable = this.P;
        return drawable != null ? drawable.setLevel(i) : this.Q.a.setLevel(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        Drawable drawable = this.P;
        return drawable != null ? drawable.setState(iArr) : this.Q.a.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Drawable drawable = this.P;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else {
            this.Q.a.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z) {
        Drawable drawable = this.P;
        if (drawable != null) {
            drawable.setAutoMirrored(z);
        } else {
            this.Q.a.setAutoMirrored(z);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.P;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.Q.a.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable, defpackage.dx0
    public final void setTint(int i) {
        Drawable drawable = this.P;
        if (drawable != null) {
            km.e(drawable, i);
        } else {
            this.Q.a.setTint(i);
        }
    }

    @Override // android.graphics.drawable.Drawable, defpackage.dx0
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.P;
        if (drawable != null) {
            km.f(drawable, colorStateList);
        } else {
            this.Q.a.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable, defpackage.dx0
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.P;
        if (drawable != null) {
            km.g(drawable, mode);
        } else {
            this.Q.a.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.P;
        if (drawable != null) {
            return drawable.setVisible(z, z2);
        }
        this.Q.a.setVisible(z, z2);
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Drawable drawable = this.P;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
        } else if (this.Q.b.isStarted()) {
        } else {
            this.Q.b.start();
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        Drawable drawable = this.P;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.Q.b.end();
        }
    }
}