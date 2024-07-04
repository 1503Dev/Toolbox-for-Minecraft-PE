package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* renamed from: iq  reason: default package */
public final class iq {
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public float j;
    public float k;
    public int l;
    public int m;
    public int o;
    public int p;
    public boolean q;
    public boolean r;
    public int a = Integer.MAX_VALUE;
    public int b = Integer.MAX_VALUE;
    public int c = RecyclerView.UNDEFINED_DURATION;
    public int d = RecyclerView.UNDEFINED_DURATION;
    public ArrayList n = new ArrayList();

    public final void a(View view, int i, int i2, int i3, int i4) {
        hq hqVar = (hq) view.getLayoutParams();
        this.a = Math.min(this.a, (view.getLeft() - hqVar.y()) - i);
        this.b = Math.min(this.b, (view.getTop() - hqVar.E()) - i2);
        this.c = Math.max(this.c, hqVar.o() + view.getRight() + i3);
        this.d = Math.max(this.d, hqVar.v() + view.getBottom() + i4);
    }
}