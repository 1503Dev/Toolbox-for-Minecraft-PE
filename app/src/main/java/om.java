package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.SystemClock;
import android.util.SparseArray;
import defpackage.xt0;

/* renamed from: om  reason: default package */
public class om extends Drawable implements Drawable.Callback {
    public static final /* synthetic */ int b0 = 0;
    public c P;
    public Rect Q;
    public Drawable R;
    public Drawable S;
    public boolean U;
    public boolean W;
    public a X;
    public long Y;
    public long Z;
    public b a0;
    public int T = 255;
    public int V = -1;

    /* renamed from: om$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class a implements Runnable {
        public final /* synthetic */ om P;

        public a(xt0 xt0Var) {
            this.P = xt0Var;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.P.a(true);
            this.P.invalidateSelf();
        }
    }

    /* renamed from: om$b */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class b implements Drawable.Callback {
        public Drawable.Callback P;

        @Override // android.graphics.drawable.Drawable.Callback
        public final void invalidateDrawable(Drawable drawable) {
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
            Drawable.Callback callback = this.P;
            if (callback != null) {
                callback.scheduleDrawable(drawable, runnable, j);
            }
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            Drawable.Callback callback = this.P;
            if (callback != null) {
                callback.unscheduleDrawable(drawable, runnable);
            }
        }
    }

    /* renamed from: om$c */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static abstract class c extends Drawable.ConstantState {
        public boolean A;
        public ColorFilter B;
        public boolean C;
        public ColorStateList D;
        public PorterDuff.Mode E;
        public boolean F;
        public boolean G;
        public final om a;
        public Resources b;
        public int c;
        public int d;
        public int e;
        public SparseArray<Drawable.ConstantState> f;
        public Drawable[] g;
        public int h;
        public boolean i;
        public boolean j;
        public Rect k;
        public boolean l;
        public boolean m;
        public int n;
        public int o;
        public int p;
        public int q;
        public boolean r;
        public int s;
        public boolean t;
        public boolean u;
        public boolean v;
        public boolean w;
        public int x;
        public int y;
        public int z;

        public c(c cVar, om omVar, Resources resources) {
            Resources resources2;
            int i;
            SparseArray<Drawable.ConstantState> sparseArray;
            this.c = 160;
            this.i = false;
            this.l = false;
            this.w = true;
            this.y = 0;
            this.z = 0;
            this.a = omVar;
            if (resources != null) {
                resources2 = resources;
            } else if (cVar != null) {
                resources2 = cVar.b;
            } else {
                resources2 = null;
            }
            this.b = resources2;
            if (cVar != null) {
                i = cVar.c;
            } else {
                i = 0;
            }
            int i2 = om.b0;
            i = resources != null ? resources.getDisplayMetrics().densityDpi : i;
            int i3 = i != 0 ? i : 160;
            this.c = i3;
            if (cVar != null) {
                this.d = cVar.d;
                this.e = cVar.e;
                this.u = true;
                this.v = true;
                this.i = cVar.i;
                this.l = cVar.l;
                this.w = cVar.w;
                this.x = cVar.x;
                this.y = cVar.y;
                this.z = cVar.z;
                this.A = cVar.A;
                this.B = cVar.B;
                this.C = cVar.C;
                this.D = cVar.D;
                this.E = cVar.E;
                this.F = cVar.F;
                this.G = cVar.G;
                if (cVar.c == i3) {
                    if (cVar.j) {
                        this.k = new Rect(cVar.k);
                        this.j = true;
                    }
                    if (cVar.m) {
                        this.n = cVar.n;
                        this.o = cVar.o;
                        this.p = cVar.p;
                        this.q = cVar.q;
                        this.m = true;
                    }
                }
                if (cVar.r) {
                    this.s = cVar.s;
                    this.r = true;
                }
                if (cVar.t) {
                    this.t = true;
                }
                Drawable[] drawableArr = cVar.g;
                this.g = new Drawable[drawableArr.length];
                this.h = cVar.h;
                SparseArray<Drawable.ConstantState> sparseArray2 = cVar.f;
                if (sparseArray2 != null) {
                    sparseArray = sparseArray2.clone();
                } else {
                    sparseArray = new SparseArray<>(this.h);
                }
                this.f = sparseArray;
                int i4 = this.h;
                for (int i5 = 0; i5 < i4; i5++) {
                    Drawable drawable = drawableArr[i5];
                    if (drawable != null) {
                        Drawable.ConstantState constantState = drawable.getConstantState();
                        if (constantState != null) {
                            this.f.put(i5, constantState);
                        } else {
                            this.g[i5] = drawableArr[i5];
                        }
                    }
                }
                return;
            }
            this.g = new Drawable[10];
            this.h = 0;
        }

        public final int a(Drawable drawable) {
            int i = this.h;
            if (i >= this.g.length) {
                int i2 = i + 10;
                xt0.a aVar = (xt0.a) this;
                Drawable[] drawableArr = new Drawable[i2];
                System.arraycopy(aVar.g, 0, drawableArr, 0, i);
                aVar.g = drawableArr;
                int[][] iArr = new int[i2];
                System.arraycopy(aVar.H, 0, iArr, 0, i);
                aVar.H = iArr;
            }
            drawable.mutate();
            drawable.setVisible(false, true);
            drawable.setCallback(this.a);
            this.g[i] = drawable;
            this.h++;
            this.e = drawable.getChangingConfigurations() | this.e;
            this.r = false;
            this.t = false;
            this.k = null;
            this.j = false;
            this.m = false;
            this.u = false;
            return i;
        }

        public final void b() {
            this.m = true;
            c();
            int i = this.h;
            Drawable[] drawableArr = this.g;
            this.o = -1;
            this.n = -1;
            this.q = 0;
            this.p = 0;
            for (int i2 = 0; i2 < i; i2++) {
                Drawable drawable = drawableArr[i2];
                int intrinsicWidth = drawable.getIntrinsicWidth();
                if (intrinsicWidth > this.n) {
                    this.n = intrinsicWidth;
                }
                int intrinsicHeight = drawable.getIntrinsicHeight();
                if (intrinsicHeight > this.o) {
                    this.o = intrinsicHeight;
                }
                int minimumWidth = drawable.getMinimumWidth();
                if (minimumWidth > this.p) {
                    this.p = minimumWidth;
                }
                int minimumHeight = drawable.getMinimumHeight();
                if (minimumHeight > this.q) {
                    this.q = minimumHeight;
                }
            }
        }

        public final void c() {
            SparseArray<Drawable.ConstantState> sparseArray = this.f;
            if (sparseArray != null) {
                int size = sparseArray.size();
                for (int i = 0; i < size; i++) {
                    int keyAt = this.f.keyAt(i);
                    Drawable[] drawableArr = this.g;
                    Drawable newDrawable = this.f.valueAt(i).newDrawable(this.b);
                    if (Build.VERSION.SDK_INT >= 23) {
                        lm.a(newDrawable, this.x);
                    }
                    Drawable mutate = newDrawable.mutate();
                    mutate.setCallback(this.a);
                    drawableArr[keyAt] = mutate;
                }
                this.f = null;
            }
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final boolean canApplyTheme() {
            int i = this.h;
            Drawable[] drawableArr = this.g;
            for (int i2 = 0; i2 < i; i2++) {
                Drawable drawable = drawableArr[i2];
                if (drawable == null) {
                    Drawable.ConstantState constantState = this.f.get(i2);
                    if (constantState != null && sm.a(constantState)) {
                        return true;
                    }
                } else if (pm.b(drawable)) {
                    return true;
                }
            }
            return false;
        }

        public final Drawable d(int i) {
            int indexOfKey;
            Drawable drawable = this.g[i];
            if (drawable != null) {
                return drawable;
            }
            SparseArray<Drawable.ConstantState> sparseArray = this.f;
            if (sparseArray == null || (indexOfKey = sparseArray.indexOfKey(i)) < 0) {
                return null;
            }
            Drawable newDrawable = this.f.valueAt(indexOfKey).newDrawable(this.b);
            if (Build.VERSION.SDK_INT >= 23) {
                lm.a(newDrawable, this.x);
            }
            Drawable mutate = newDrawable.mutate();
            mutate.setCallback(this.a);
            this.g[i] = mutate;
            this.f.removeAt(indexOfKey);
            if (this.f.size() == 0) {
                this.f = null;
            }
            return mutate;
        }

        public abstract void e();

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final int getChangingConfigurations() {
            return this.d | this.e;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0066 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(boolean z) {
        boolean z2;
        Drawable drawable;
        boolean z3 = true;
        this.U = true;
        long uptimeMillis = SystemClock.uptimeMillis();
        Drawable drawable2 = this.R;
        if (drawable2 != null) {
            long j = this.Y;
            if (j != 0) {
                if (j <= uptimeMillis) {
                    drawable2.setAlpha(this.T);
                } else {
                    drawable2.setAlpha(((255 - (((int) ((j - uptimeMillis) * 255)) / this.P.y)) * this.T) / 255);
                    z2 = true;
                    drawable = this.S;
                    if (drawable != null) {
                        long j2 = this.Z;
                        if (j2 != 0) {
                            if (j2 > uptimeMillis) {
                                drawable.setAlpha(((((int) ((j2 - uptimeMillis) * 255)) / this.P.z) * this.T) / 255);
                                if (z && z3) {
                                    scheduleSelf(this.X, uptimeMillis + 16);
                                    return;
                                }
                                return;
                            }
                            drawable.setVisible(false, false);
                            this.S = null;
                        }
                        z3 = z2;
                        if (z) {
                            return;
                        }
                        return;
                    }
                    this.Z = 0L;
                    z3 = z2;
                    if (z) {
                    }
                }
            }
            z2 = false;
            drawable = this.S;
            if (drawable != null) {
            }
            this.Z = 0L;
            z3 = z2;
            if (z) {
            }
        }
        this.Y = 0L;
        z2 = false;
        drawable = this.S;
        if (drawable != null) {
        }
        this.Z = 0L;
        z3 = z2;
        if (z) {
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        c cVar = this.P;
        if (theme != null) {
            cVar.c();
            int i = cVar.h;
            Drawable[] drawableArr = cVar.g;
            for (int i2 = 0; i2 < i; i2++) {
                Drawable drawable = drawableArr[i2];
                if (drawable != null && pm.b(drawable)) {
                    drawableArr[i2].applyTheme(theme);
                    cVar.e |= drawableArr[i2].getChangingConfigurations();
                }
            }
            Resources b2 = rm.b(theme);
            if (b2 != null) {
                cVar.b = b2;
                int i3 = b2.getDisplayMetrics().densityDpi;
                if (i3 == 0) {
                    i3 = 160;
                }
                int i4 = cVar.c;
                cVar.c = i3;
                if (i4 != i3) {
                    cVar.m = false;
                    cVar.j = false;
                    return;
                }
                return;
            }
            return;
        }
        cVar.getClass();
    }

    public c b() {
        throw null;
    }

    public final void c(Drawable drawable) {
        if (this.a0 == null) {
            this.a0 = new b();
        }
        b bVar = this.a0;
        bVar.P = drawable.getCallback();
        drawable.setCallback(bVar);
        try {
            if (this.P.y <= 0 && this.U) {
                drawable.setAlpha(this.T);
            }
            c cVar = this.P;
            if (cVar.C) {
                drawable.setColorFilter(cVar.B);
            } else {
                if (cVar.F) {
                    km.f(drawable, cVar.D);
                }
                c cVar2 = this.P;
                if (cVar2.G) {
                    km.g(drawable, cVar2.E);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.P.w);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            int i = Build.VERSION.SDK_INT;
            if (i >= 23) {
                lm.a(drawable, getLayoutDirection());
            }
            drawable.setAutoMirrored(this.P.A);
            Rect rect = this.Q;
            if (i >= 21 && rect != null) {
                drawable.setHotspotBounds(rect.left, rect.top, rect.right, rect.bottom);
            }
        } finally {
            b bVar2 = this.a0;
            Drawable.Callback callback = bVar2.P;
            bVar2.P = null;
            drawable.setCallback(callback);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        return this.P.canApplyTheme();
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean d(int i) {
        a aVar;
        if (i == this.V) {
            return false;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        if (this.P.z > 0) {
            Drawable drawable = this.S;
            if (drawable != null) {
                drawable.setVisible(false, false);
            }
            Drawable drawable2 = this.R;
            if (drawable2 != null) {
                this.S = drawable2;
                this.Z = this.P.z + uptimeMillis;
            } else {
                this.S = null;
                this.Z = 0L;
            }
        } else {
            Drawable drawable3 = this.R;
            if (drawable3 != null) {
                drawable3.setVisible(false, false);
            }
        }
        if (i >= 0) {
            c cVar = this.P;
            if (i < cVar.h) {
                Drawable d = cVar.d(i);
                this.R = d;
                this.V = i;
                if (d != null) {
                    int i2 = this.P.y;
                    if (i2 > 0) {
                        this.Y = uptimeMillis + i2;
                    }
                    c(d);
                }
                if (this.Y == 0 || this.Z != 0) {
                    aVar = this.X;
                    if (aVar != null) {
                        this.X = new a((xt0) this);
                    } else {
                        unscheduleSelf(aVar);
                    }
                    a(true);
                }
                invalidateSelf();
                return true;
            }
        }
        this.R = null;
        this.V = -1;
        if (this.Y == 0) {
        }
        aVar = this.X;
        if (aVar != null) {
        }
        a(true);
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.R;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.S;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    public void e(c cVar) {
        throw null;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.T;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        int changingConfigurations = super.getChangingConfigurations();
        c cVar = this.P;
        return changingConfigurations | cVar.e | cVar.d;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        boolean z;
        c cVar = this.P;
        synchronized (cVar) {
            z = false;
            if (cVar.u) {
                z = cVar.v;
            } else {
                cVar.c();
                cVar.u = true;
                int i = cVar.h;
                Drawable[] drawableArr = cVar.g;
                for (int i2 = 0; i2 < i; i2++) {
                    if (drawableArr[i2].getConstantState() == null) {
                        cVar.v = false;
                    }
                }
                cVar.v = true;
                z = true;
            }
            break;
        }
        if (z) {
            this.P.d = getChangingConfigurations();
            return this.P;
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable getCurrent() {
        return this.R;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getHotspotBounds(Rect rect) {
        Rect rect2 = this.Q;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        c cVar = this.P;
        if (cVar.l) {
            if (!cVar.m) {
                cVar.b();
            }
            return cVar.o;
        }
        Drawable drawable = this.R;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        c cVar = this.P;
        if (cVar.l) {
            if (!cVar.m) {
                cVar.b();
            }
            return cVar.n;
        }
        Drawable drawable = this.R;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumHeight() {
        c cVar = this.P;
        if (cVar.l) {
            if (!cVar.m) {
                cVar.b();
            }
            return cVar.q;
        }
        Drawable drawable = this.R;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumWidth() {
        c cVar = this.P;
        if (cVar.l) {
            if (!cVar.m) {
                cVar.b();
            }
            return cVar.p;
        }
        Drawable drawable = this.R;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.R;
        int i = -2;
        if (drawable == null || !drawable.isVisible()) {
            return -2;
        }
        c cVar = this.P;
        if (cVar.r) {
            return cVar.s;
        }
        cVar.c();
        int i2 = cVar.h;
        Drawable[] drawableArr = cVar.g;
        if (i2 > 0) {
            i = drawableArr[0].getOpacity();
        }
        for (int i3 = 1; i3 < i2; i3++) {
            i = Drawable.resolveOpacity(i, drawableArr[i3].getOpacity());
        }
        cVar.s = i;
        cVar.r = true;
        return i;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        Drawable drawable = this.R;
        if (drawable != null) {
            drawable.getOutline(outline);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        boolean padding;
        c cVar = this.P;
        Rect rect2 = null;
        boolean z = true;
        if (!cVar.i) {
            Rect rect3 = cVar.k;
            if (rect3 == null && !cVar.j) {
                cVar.c();
                Rect rect4 = new Rect();
                int i = cVar.h;
                Drawable[] drawableArr = cVar.g;
                for (int i2 = 0; i2 < i; i2++) {
                    if (drawableArr[i2].getPadding(rect4)) {
                        if (rect2 == null) {
                            rect2 = new Rect(0, 0, 0, 0);
                        }
                        int i3 = rect4.left;
                        if (i3 > rect2.left) {
                            rect2.left = i3;
                        }
                        int i4 = rect4.top;
                        if (i4 > rect2.top) {
                            rect2.top = i4;
                        }
                        int i5 = rect4.right;
                        if (i5 > rect2.right) {
                            rect2.right = i5;
                        }
                        int i6 = rect4.bottom;
                        if (i6 > rect2.bottom) {
                            rect2.bottom = i6;
                        }
                    }
                }
                cVar.j = true;
                cVar.k = rect2;
            } else {
                rect2 = rect3;
            }
        }
        if (rect2 != null) {
            rect.set(rect2);
            if ((rect2.left | rect2.top | rect2.bottom | rect2.right) != 0) {
                padding = true;
            } else {
                padding = false;
            }
        } else {
            Drawable drawable = this.R;
            if (drawable != null) {
                padding = drawable.getPadding(rect);
            } else {
                padding = super.getPadding(rect);
            }
        }
        if ((this.P.A && km.b(this) == 1) ? false : false) {
            int i7 = rect.left;
            rect.left = rect.right;
            rect.right = i7;
        }
        return padding;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        c cVar = this.P;
        if (cVar != null) {
            cVar.r = false;
            cVar.t = false;
        }
        if (drawable == this.R && getCallback() != null) {
            getCallback().invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        return this.P.A;
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        boolean z;
        Drawable drawable = this.S;
        boolean z2 = true;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.S = null;
            z = true;
        } else {
            z = false;
        }
        Drawable drawable2 = this.R;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.U) {
                this.R.setAlpha(this.T);
            }
        }
        if (this.Z != 0) {
            this.Z = 0L;
            z = true;
        }
        if (this.Y != 0) {
            this.Y = 0L;
        } else {
            z2 = z;
        }
        if (z2) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.W && super.mutate() == this) {
            c b2 = b();
            b2.e();
            e(b2);
            this.W = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.S;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.R;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i) {
        boolean z;
        c cVar = this.P;
        int i2 = this.V;
        int i3 = cVar.h;
        Drawable[] drawableArr = cVar.g;
        boolean z2 = false;
        for (int i4 = 0; i4 < i3; i4++) {
            Drawable drawable = drawableArr[i4];
            if (drawable != null) {
                if (Build.VERSION.SDK_INT >= 23) {
                    z = tm.a(drawable, i);
                } else {
                    z = false;
                }
                if (i4 == i2) {
                    z2 = z;
                }
            }
        }
        cVar.x = i;
        return z2;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        Drawable drawable = this.S;
        if (drawable != null) {
            return drawable.setLevel(i);
        }
        Drawable drawable2 = this.R;
        if (drawable2 != null) {
            return drawable2.setLevel(i);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.S;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        Drawable drawable2 = this.R;
        if (drawable2 != null) {
            return drawable2.setState(iArr);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        if (drawable != this.R || getCallback() == null) {
            return;
        }
        getCallback().scheduleDrawable(this, runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.U && this.T == i) {
            return;
        }
        this.U = true;
        this.T = i;
        Drawable drawable = this.R;
        if (drawable != null) {
            if (this.Y == 0) {
                drawable.setAlpha(i);
            } else {
                a(false);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z) {
        c cVar = this.P;
        if (cVar.A != z) {
            cVar.A = z;
            Drawable drawable = this.R;
            if (drawable != null) {
                drawable.setAutoMirrored(z);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        c cVar = this.P;
        cVar.C = true;
        if (cVar.B != colorFilter) {
            cVar.B = colorFilter;
            Drawable drawable = this.R;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setDither(boolean z) {
        c cVar = this.P;
        if (cVar.w != z) {
            cVar.w = z;
            Drawable drawable = this.R;
            if (drawable != null) {
                drawable.setDither(z);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspot(float f, float f2) {
        Drawable drawable = this.R;
        if (drawable != null) {
            km.c(drawable, f, f2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspotBounds(int i, int i2, int i3, int i4) {
        Rect rect = this.Q;
        if (rect == null) {
            this.Q = new Rect(i, i2, i3, i4);
        } else {
            rect.set(i, i2, i3, i4);
        }
        Drawable drawable = this.R;
        if (drawable == null || Build.VERSION.SDK_INT < 21) {
            return;
        }
        drawable.setHotspotBounds(i, i2, i3, i4);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        c cVar = this.P;
        cVar.F = true;
        if (cVar.D != colorStateList) {
            cVar.D = colorStateList;
            km.f(this.R, colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        c cVar = this.P;
        cVar.G = true;
        if (cVar.E != mode) {
            cVar.E = mode;
            km.g(this.R, mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        Drawable drawable = this.S;
        if (drawable != null) {
            drawable.setVisible(z, z2);
        }
        Drawable drawable2 = this.R;
        if (drawable2 != null) {
            drawable2.setVisible(z, z2);
        }
        return visible;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (drawable != this.R || getCallback() == null) {
            return;
        }
        getCallback().unscheduleDrawable(this, runnable);
    }
}