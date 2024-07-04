package defpackage;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: pt1  reason: default package */
public final class pt1 {
    public final String a;
    public final int b;
    public final int c;
    public int d;
    public String e;

    public pt1(int i, int i2, int i3) {
        String str;
        if (i != Integer.MIN_VALUE) {
            str = i + "/";
        } else {
            str = "";
        }
        this.a = str;
        this.b = i2;
        this.c = i3;
        this.d = RecyclerView.UNDEFINED_DURATION;
        this.e = "";
    }

    public final void a() {
        int i;
        int i2 = this.d;
        if (i2 == Integer.MIN_VALUE) {
            i = this.b;
        } else {
            i = i2 + this.c;
        }
        this.d = i;
        this.e = k6.a(this.a, i);
    }

    public final void b() {
        if (this.d == Integer.MIN_VALUE) {
            throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
        }
    }
}