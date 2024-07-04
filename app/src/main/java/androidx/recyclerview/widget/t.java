package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

public abstract class t {
    public final RecyclerView.o a;
    public int b = RecyclerView.UNDEFINED_DURATION;
    public final Rect c = new Rect();

    public t(RecyclerView.o oVar) {
        this.a = oVar;
    }

    public static t a(RecyclerView.o oVar, int i) {
        if (i != 0) {
            if (i == 1) {
                return new s(oVar);
            }
            throw new IllegalArgumentException("invalid orientation");
        }
        return new r(oVar);
    }

    public abstract int b(View view);

    public abstract int c(View view);

    public abstract int d(View view);

    public abstract int e(View view);

    public abstract int f();

    public abstract int g();

    public abstract int h();

    public abstract int i();

    public abstract int j();

    public abstract int k();

    public abstract int l();

    public final int m() {
        if (Integer.MIN_VALUE == this.b) {
            return 0;
        }
        return l() - this.b;
    }

    public abstract int n(View view);

    public abstract int o(View view);

    public abstract void p(int i);
}