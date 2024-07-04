package defpackage;

import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: x41  reason: default package */
public final class x41 {
    public Interpolator c;
    public y41 d;
    public boolean e;
    public long b = -1;
    public final a f = new a();
    public final ArrayList<w41> a = new ArrayList<>();

    /* renamed from: x41$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class a extends vx {
        public boolean h = false;
        public int i = 0;

        public a() {
        }

        @Override // defpackage.y41
        public final void a() {
            int i = this.i + 1;
            this.i = i;
            if (i == x41.this.a.size()) {
                y41 y41Var = x41.this.d;
                if (y41Var != null) {
                    y41Var.a();
                }
                this.i = 0;
                this.h = false;
                x41.this.e = false;
            }
        }

        @Override // defpackage.vx, defpackage.y41
        public final void c() {
            if (this.h) {
                return;
            }
            this.h = true;
            y41 y41Var = x41.this.d;
            if (y41Var != null) {
                y41Var.c();
            }
        }
    }

    public final void a() {
        if (this.e) {
            Iterator<w41> it = this.a.iterator();
            while (it.hasNext()) {
                it.next().b();
            }
            this.e = false;
        }
    }

    public final void b() {
        View view;
        if (this.e) {
            return;
        }
        Iterator<w41> it = this.a.iterator();
        while (it.hasNext()) {
            w41 next = it.next();
            long j = this.b;
            if (j >= 0) {
                next.c(j);
            }
            Interpolator interpolator = this.c;
            if (interpolator != null && (view = next.a.get()) != null) {
                view.animate().setInterpolator(interpolator);
            }
            if (this.d != null) {
                next.d(this.f);
            }
            View view2 = next.a.get();
            if (view2 != null) {
                view2.animate().start();
            }
        }
        this.e = true;
    }
}