package defpackage;

import android.view.MotionEvent;

/* renamed from: bm  reason: default package */
public final class bm {
    public boolean a;
    public float b;
    public float c;
    public a d;
    public Runnable e;
    public float f;

    /* renamed from: bm$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public interface a {
        void a(float f, float f2);

        void b();

        void c();

        void d(float f, float f2);
    }

    public bm(float f) {
        this.f = f;
    }

    public final boolean a(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.b = motionEvent.getRawX();
            this.c = motionEvent.getRawY();
        } else if (motionEvent.getAction() == 2) {
            float rawX = motionEvent.getRawX() - this.b;
            float rawY = motionEvent.getRawY() - this.c;
            float f = (rawY * rawY) + (rawX * rawX);
            float f2 = this.f;
            if (f > f2 * f2 && !this.a) {
                this.a = true;
                this.d.c();
            }
            if (this.a) {
                a aVar = this.d;
                if (aVar != null) {
                    aVar.d(rawX, rawY);
                }
                return true;
            }
        } else if (motionEvent.getAction() == 1) {
            if (this.a) {
                this.d.a(motionEvent.getRawX() - this.b, motionEvent.getRawY() - this.c);
                this.a = false;
            } else {
                Runnable runnable = this.e;
                if (runnable != null) {
                    runnable.run();
                }
            }
        } else if (motionEvent.getAction() == 3 && this.a) {
            this.d.b();
            this.a = false;
        }
        return false;
    }
}