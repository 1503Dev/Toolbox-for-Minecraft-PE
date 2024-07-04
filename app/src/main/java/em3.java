package defpackage;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* renamed from: em3  reason: default package */
public final class em3 implements GestureDetector.OnGestureListener {
    public final jl3 a;
    public final am3 b;

    public em3(jl3 jl3Var, am3 am3Var) {
        this.a = jl3Var;
        this.b = am3Var;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0069 A[Catch: all -> 0x007f, TRY_ENTER, TRY_LEAVE, TryCatch #2 {, blocks: (B:3:0x0001, B:8:0x0008, B:12:0x001c, B:23:0x0066, B:24:0x0068, B:26:0x006f, B:30:0x0074, B:15:0x002f, B:18:0x0042, B:21:0x0056, B:25:0x0069), top: B:39:0x0001 }] */
    @Override // android.view.GestureDetector.OnGestureListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        int y;
        jl3 jl3Var;
        int a;
        if (this.a == null) {
            return false;
        }
        int i = -1;
        if (Math.abs(f) > Math.abs(f2)) {
            if (f > 0.0f) {
                y = (int) (((motionEvent2.getX() - motionEvent.getX()) / f) * 1000.0f);
                i = 1;
            } else {
                if (f < 0.0f) {
                    y = (int) (((motionEvent2.getX() - motionEvent.getX()) / f) * 1000.0f);
                    i = 2;
                }
                y = 0;
            }
            jl3Var = this.a;
            synchronized (jl3Var) {
                a = jl3Var.k.a();
            }
            if (i != a) {
                return false;
            }
            this.a.d(this.b.S, y);
            return false;
        }
        if (f2 > 0.0f) {
            y = (int) (((motionEvent2.getY() - motionEvent.getY()) / f2) * 1000.0f);
            i = 8;
        } else {
            if (f2 < 0.0f) {
                y = (int) (((motionEvent2.getY() - motionEvent.getY()) / f2) * 1000.0f);
                i = 4;
            }
            y = 0;
        }
        jl3Var = this.a;
        synchronized (jl3Var) {
        }
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final synchronized boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }
}