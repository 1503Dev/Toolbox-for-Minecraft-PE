package androidx.fragment.app;

import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.fragment.app.c;

public final class g implements Animation.AnimationListener {
    public final /* synthetic */ ViewGroup a;
    public final /* synthetic */ c b;
    public final /* synthetic */ f c;

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            int i;
            if (g.this.b.g() != null) {
                g.this.b.e().a = null;
                g gVar = g.this;
                f fVar = gVar.c;
                c cVar = gVar.b;
                c.a aVar = cVar.w0;
                if (aVar == null) {
                    i = 0;
                } else {
                    i = aVar.c;
                }
                fVar.V(cVar, i, 0, 0, false);
            }
        }
    }

    public g(f fVar, ViewGroup viewGroup, c cVar) {
        this.c = fVar;
        this.a = viewGroup;
        this.b = cVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        this.a.post(new a());
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }
}