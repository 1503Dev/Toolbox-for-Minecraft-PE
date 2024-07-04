package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: oz1  reason: default package */
public abstract class oz1 implements nz1 {
    public static volatile l02 j0;
    public MotionEvent P;
    public double Y;
    public double Z;
    public double a0;
    public float b0;
    public float c0;
    public float d0;
    public float e0;
    public DisplayMetrics h0;
    public dk5 i0;
    public final LinkedList Q = new LinkedList();
    public long R = 0;
    public long S = 0;
    public long T = 0;
    public long U = 0;
    public long V = 0;
    public long W = 0;
    public long X = 0;
    public boolean f0 = false;
    public boolean g0 = false;

    public oz1(Context context) {
        try {
            l92 l92Var = x92.D2;
            w82 w82Var = w82.d;
            if (((Boolean) w82Var.c.a(l92Var)).booleanValue()) {
                wy1.b();
            } else {
                ea2.A(j0);
            }
            this.h0 = context.getResources().getDisplayMetrics();
            if (((Boolean) w82Var.c.a(x92.c2)).booleanValue()) {
                this.i0 = new dk5();
            }
        } catch (Throwable unused) {
        }
    }

    public abstract long a(StackTraceElement[] stackTraceElementArr);

    @Override // defpackage.nz1
    public final synchronized void b(MotionEvent motionEvent) {
        Long l;
        if (this.f0) {
            n();
            this.f0 = false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.Y = 0.0d;
            this.Z = motionEvent.getRawX();
            this.a0 = motionEvent.getRawY();
        } else if (action == 1 || action == 2) {
            double rawX = motionEvent.getRawX();
            double rawY = motionEvent.getRawY();
            double d = this.Z;
            Double.isNaN(rawX);
            double d2 = rawX - d;
            double d3 = this.a0;
            Double.isNaN(rawY);
            double d4 = rawY - d3;
            this.Y += Math.sqrt((d4 * d4) + (d2 * d2));
            this.Z = rawX;
            this.a0 = rawY;
        }
        int action2 = motionEvent.getAction();
        if (action2 != 0) {
            try {
                if (action2 == 1) {
                    MotionEvent obtain = MotionEvent.obtain(motionEvent);
                    this.P = obtain;
                    this.Q.add(obtain);
                    if (this.Q.size() > 6) {
                        ((MotionEvent) this.Q.remove()).recycle();
                    }
                    this.T++;
                    this.V = a(new Throwable().getStackTrace());
                } else if (action2 == 2) {
                    this.S += motionEvent.getHistorySize() + 1;
                    n02 m = m(motionEvent);
                    Long l2 = m.d;
                    if (l2 != null && m.g != null) {
                        this.W = l2.longValue() + m.g.longValue() + this.W;
                    }
                    if (this.h0 != null && (l = m.e) != null && m.h != null) {
                        this.X = l.longValue() + m.h.longValue() + this.X;
                    }
                } else if (action2 == 3) {
                    this.U++;
                }
            } catch (d02 unused) {
            }
        } else {
            this.b0 = motionEvent.getX();
            this.c0 = motionEvent.getY();
            this.d0 = motionEvent.getRawX();
            this.e0 = motionEvent.getRawY();
            this.R++;
        }
        this.g0 = true;
    }

    @Override // defpackage.nz1
    public final void d(StackTraceElement[] stackTraceElementArr) {
        dk5 dk5Var;
        if (((Boolean) w82.d.c.a(x92.c2)).booleanValue() && (dk5Var = this.i0) != null) {
            dk5Var.Q = new ArrayList(Arrays.asList(stackTraceElementArr));
        }
    }

    @Override // defpackage.nz1
    public final String e(Context context, View view, Activity activity) {
        return o(context, null, 2, view, activity);
    }

    @Override // defpackage.nz1
    public final String f(Context context) {
        boolean z;
        char[] cArr = o02.a;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return o(context, null, 1, null, null);
        }
        throw new IllegalStateException("The caller must not be called from the UI thread.");
    }

    @Override // defpackage.nz1
    public final synchronized void g(int i, int i2, int i3) {
        if (this.P != null) {
            if (((Boolean) w82.d.c.a(x92.T1)).booleanValue()) {
                n();
            } else {
                this.P.recycle();
            }
        }
        DisplayMetrics displayMetrics = this.h0;
        if (displayMetrics != null) {
            float f = displayMetrics.density;
            this.P = MotionEvent.obtain(0L, i3, 1, i * f, i2 * f, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
        } else {
            this.P = null;
        }
        this.g0 = false;
    }

    @Override // defpackage.nz1
    public final String h(Context context, String str, View view) {
        return o(context, str, 3, view, null);
    }

    @Override // defpackage.nz1
    public final String i(Context context, String str, View view, Activity activity) {
        return o(context, str, 3, view, activity);
    }

    public abstract gx1 j(Context context, View view, Activity activity);

    public abstract gx1 k(Context context);

    public abstract gx1 l(Context context, View view, Activity activity);

    public abstract n02 m(MotionEvent motionEvent);

    public final void n() {
        this.V = 0L;
        this.R = 0L;
        this.S = 0L;
        this.T = 0L;
        this.U = 0L;
        this.W = 0L;
        this.X = 0L;
        if (this.Q.size() > 0) {
            Iterator it = this.Q.iterator();
            while (it.hasNext()) {
                ((MotionEvent) it.next()).recycle();
            }
            this.Q.clear();
        } else {
            MotionEvent motionEvent = this.P;
            if (motionEvent != null) {
                motionEvent.recycle();
            }
        }
        this.P = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:76:0x00bc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String o(Context context, String str, int i, View view, Activity activity) {
        String str2;
        mz1 mz1Var;
        int i2;
        Exception exc;
        gx1 gx1Var;
        int i3;
        String a;
        int i4;
        int i5;
        int i6;
        int i7 = i;
        long currentTimeMillis = System.currentTimeMillis();
        l92 l92Var = x92.V1;
        w82 w82Var = w82.d;
        boolean booleanValue = ((Boolean) w82Var.c.a(l92Var)).booleanValue();
        gx1 gx1Var2 = null;
        if (booleanValue) {
            if (j0 != null) {
                mz1Var = j0.l;
            } else {
                mz1Var = null;
            }
            if (true != ((Boolean) w82Var.c.a(x92.D2)).booleanValue()) {
                str2 = "te";
            } else {
                str2 = "be";
            }
        } else {
            str2 = null;
            mz1Var = null;
        }
        try {
            if (i7 == 3) {
                gx1Var = j(context, view, activity);
                try {
                    this.f0 = true;
                    gx1Var2 = gx1Var;
                    i6 = 1002;
                } catch (Exception e) {
                    exc = e;
                    i2 = 3;
                    if (!booleanValue) {
                    }
                    gx1Var2 = gx1Var;
                    gx1Var = gx1Var2;
                    long currentTimeMillis2 = System.currentTimeMillis();
                    if (gx1Var != null) {
                    }
                    a = Integer.toString(5);
                    return a;
                }
            } else if (i7 == 2) {
                gx1Var2 = l(context, view, activity);
                i6 = 1008;
            } else {
                gx1Var2 = k(context);
                i6 = 1000;
            }
            if (booleanValue && mz1Var != null) {
                i2 = 3;
                try {
                    mz1Var.a(i6, -1, System.currentTimeMillis() - currentTimeMillis, str2, null);
                } catch (Exception e2) {
                    e = e2;
                    gx1Var = gx1Var2;
                    exc = e;
                    if (!booleanValue && mz1Var != null) {
                        if (i7 == i2) {
                            i3 = 1003;
                        } else if (i7 == 2) {
                            i3 = 1009;
                        } else {
                            i7 = 1;
                            i3 = 1001;
                        }
                        mz1Var.a(i3, -1, System.currentTimeMillis() - currentTimeMillis, str2, exc);
                        long currentTimeMillis22 = System.currentTimeMillis();
                        if (gx1Var != null) {
                        }
                        a = Integer.toString(5);
                        return a;
                    }
                    gx1Var2 = gx1Var;
                    gx1Var = gx1Var2;
                    long currentTimeMillis222 = System.currentTimeMillis();
                    if (gx1Var != null) {
                    }
                    a = Integer.toString(5);
                    return a;
                }
            } else {
                i2 = 3;
            }
        } catch (Exception e3) {
            e = e3;
            i2 = 3;
        }
        gx1Var = gx1Var2;
        long currentTimeMillis2222 = System.currentTimeMillis();
        if (gx1Var != null) {
            try {
            } catch (Exception e4) {
                a = Integer.toString(7);
                if (booleanValue && mz1Var != null) {
                    if (i7 == i2) {
                        i5 = 1007;
                    } else if (i7 == 2) {
                        i5 = 1011;
                    } else {
                        i5 = 1005;
                    }
                    mz1Var.a(i5, -1, System.currentTimeMillis() - currentTimeMillis2222, str2, e4);
                }
            }
            if (((ey1) gx1Var.h()).d() != 0) {
                boolean z = wy1.a;
                a = wy1.a(str, ((ey1) gx1Var.h()).D());
                if (booleanValue && mz1Var != null) {
                    if (i7 == i2) {
                        i4 = 1006;
                    } else if (i7 == 2) {
                        i4 = 1010;
                    } else {
                        i4 = 1004;
                    }
                    mz1Var.a(i4, -1, System.currentTimeMillis() - currentTimeMillis2222, str2, null);
                }
                return a;
            }
        }
        a = Integer.toString(5);
        return a;
    }
}