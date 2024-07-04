package defpackage;

import android.content.res.Resources;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import java.util.WeakHashMap;

/* renamed from: v7  reason: default package */
public abstract class v7 implements View.OnTouchListener {
    public static final int f0 = ViewConfiguration.getTapTimeout();
    public final a P;
    public final AccelerateInterpolator Q;
    public final View R;
    public b S;
    public float[] T;
    public float[] U;
    public int V;
    public int W;
    public float[] X;
    public float[] Y;
    public float[] Z;
    public boolean a0;
    public boolean b0;
    public boolean c0;
    public boolean d0;
    public boolean e0;

    /* renamed from: v7$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class a {
        public int a;
        public int b;
        public float c;
        public float d;
        public float h;
        public int i;
        public long e = Long.MIN_VALUE;
        public long g = -1;
        public long f = 0;

        public final float a(long j) {
            long j2 = this.e;
            if (j < j2) {
                return 0.0f;
            }
            long j3 = this.g;
            if (j3 < 0 || j < j3) {
                return v7.b(((float) (j - j2)) / this.a, 0.0f, 1.0f) * 0.5f;
            }
            float f = this.h;
            return (v7.b(((float) (j - j3)) / this.i, 0.0f, 1.0f) * f) + (1.0f - f);
        }
    }

    /* renamed from: v7$b */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            boolean z;
            v7 v7Var = v7.this;
            if (!v7Var.d0) {
                return;
            }
            if (v7Var.b0) {
                v7Var.b0 = false;
                a aVar = v7Var.P;
                aVar.getClass();
                long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                aVar.e = currentAnimationTimeMillis;
                aVar.g = -1L;
                aVar.f = currentAnimationTimeMillis;
                aVar.h = 0.5f;
            }
            a aVar2 = v7.this.P;
            if (aVar2.g > 0 && AnimationUtils.currentAnimationTimeMillis() > aVar2.g + aVar2.i) {
                z = true;
            } else {
                z = false;
            }
            if (!z && v7.this.h()) {
                v7 v7Var2 = v7.this;
                if (v7Var2.c0) {
                    v7Var2.c0 = false;
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    v7Var2.R.onTouchEvent(obtain);
                    obtain.recycle();
                }
                if (aVar2.f != 0) {
                    long currentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                    float a = aVar2.a(currentAnimationTimeMillis2);
                    aVar2.f = currentAnimationTimeMillis2;
                    ((g20) v7.this).g0.scrollListBy((int) (((float) (currentAnimationTimeMillis2 - aVar2.f)) * ((a * 4.0f) + ((-4.0f) * a * a)) * aVar2.d));
                    View view = v7.this.R;
                    WeakHashMap<View, String> weakHashMap = a41.a;
                    view.postOnAnimation(this);
                    return;
                }
                throw new RuntimeException("Cannot compute scroll delta before calling start()");
            }
            v7.this.d0 = false;
        }
    }

    public v7(View view) {
        a aVar = new a();
        this.P = aVar;
        this.Q = new AccelerateInterpolator();
        this.T = new float[]{0.0f, 0.0f};
        this.U = new float[]{Float.MAX_VALUE, Float.MAX_VALUE};
        this.X = new float[]{0.0f, 0.0f};
        this.Y = new float[]{0.0f, 0.0f};
        this.Z = new float[]{Float.MAX_VALUE, Float.MAX_VALUE};
        this.R = view;
        float f = Resources.getSystem().getDisplayMetrics().density;
        float[] fArr = this.Z;
        float f2 = ((int) ((1575.0f * f) + 0.5f)) / 1000.0f;
        fArr[0] = f2;
        fArr[1] = f2;
        float[] fArr2 = this.Y;
        float f3 = ((int) ((f * 315.0f) + 0.5f)) / 1000.0f;
        fArr2[0] = f3;
        fArr2[1] = f3;
        this.V = 1;
        float[] fArr3 = this.U;
        fArr3[0] = Float.MAX_VALUE;
        fArr3[1] = Float.MAX_VALUE;
        float[] fArr4 = this.T;
        fArr4[0] = 0.2f;
        fArr4[1] = 0.2f;
        float[] fArr5 = this.X;
        fArr5[0] = 0.001f;
        fArr5[1] = 0.001f;
        this.W = f0;
        aVar.a = 500;
        aVar.b = 500;
    }

    public static float b(float f, float f2, float f3) {
        return f > f3 ? f3 : f < f2 ? f2 : f;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final float a(float f, float f2, float f3, int i) {
        float f4;
        float interpolation;
        float b2 = b(this.T[i] * f2, 0.0f, this.U[i]);
        float c = c(f2 - f, b2) - c(f, b2);
        if (c < 0.0f) {
            interpolation = -this.Q.getInterpolation(-c);
        } else if (c > 0.0f) {
            interpolation = this.Q.getInterpolation(c);
        } else {
            f4 = 0.0f;
            if (f4 != 0.0f) {
                return 0.0f;
            }
            float f5 = this.X[i];
            float f6 = this.Y[i];
            float f7 = this.Z[i];
            float f8 = f5 * f3;
            if (f4 > 0.0f) {
                return b(f4 * f8, f6, f7);
            }
            return -b((-f4) * f8, f6, f7);
        }
        f4 = b(interpolation, -1.0f, 1.0f);
        if (f4 != 0.0f) {
        }
    }

    public final float c(float f, float f2) {
        if (f2 == 0.0f) {
            return 0.0f;
        }
        int i = this.V;
        if (i == 0 || i == 1) {
            if (f < f2) {
                if (f >= 0.0f) {
                    return 1.0f - (f / f2);
                }
                if (this.d0 && i == 1) {
                    return 1.0f;
                }
            }
        } else if (i == 2 && f < 0.0f) {
            return f / (-f2);
        }
        return 0.0f;
    }

    public final void d() {
        int i = 0;
        if (this.b0) {
            this.d0 = false;
            return;
        }
        a aVar = this.P;
        aVar.getClass();
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        int i2 = (int) (currentAnimationTimeMillis - aVar.e);
        int i3 = aVar.b;
        if (i2 > i3) {
            i = i3;
        } else if (i2 >= 0) {
            i = i2;
        }
        aVar.i = i;
        aVar.h = aVar.a(currentAnimationTimeMillis);
        aVar.g = currentAnimationTimeMillis;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean h() {
        boolean z;
        a aVar = this.P;
        float f = aVar.d;
        int abs = (int) (f / Math.abs(f));
        float f2 = aVar.c;
        int abs2 = (int) (f2 / Math.abs(f2));
        if (abs != 0) {
            ListView listView = ((g20) this).g0;
            int count = listView.getCount();
            if (count != 0) {
                int childCount = listView.getChildCount();
                int firstVisiblePosition = listView.getFirstVisiblePosition();
                int i = firstVisiblePosition + childCount;
                if (abs <= 0 ? !(abs >= 0 || (firstVisiblePosition <= 0 && listView.getChildAt(0).getTop() >= 0)) : !(i >= count && listView.getChildAt(childCount - 1).getBottom() <= listView.getHeight())) {
                    z = true;
                    if (!z) {
                        return true;
                    }
                }
            }
            z = false;
            if (!z) {
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0013, code lost:
        if (r0 != 3) goto L12;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i;
        if (!this.e0) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                }
            }
            d();
            return false;
        }
        this.c0 = true;
        this.a0 = false;
        float a2 = a(motionEvent.getX(), view.getWidth(), this.R.getWidth(), 0);
        float a3 = a(motionEvent.getY(), view.getHeight(), this.R.getHeight(), 1);
        a aVar = this.P;
        aVar.c = a2;
        aVar.d = a3;
        if (!this.d0 && h()) {
            if (this.S == null) {
                this.S = new b();
            }
            this.d0 = true;
            this.b0 = true;
            if (!this.a0 && (i = this.W) > 0) {
                View view2 = this.R;
                b bVar = this.S;
                long j = i;
                WeakHashMap<View, String> weakHashMap = a41.a;
                view2.postOnAnimationDelayed(bVar, j);
            } else {
                this.S.run();
            }
            this.a0 = true;
        }
        return false;
    }
}