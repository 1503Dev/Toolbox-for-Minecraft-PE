package defpackage;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: pm0  reason: default package */
public final class pm0 {
    public int a = 0;
    public int b = 0;
    public int c = RecyclerView.UNDEFINED_DURATION;
    public int d = RecyclerView.UNDEFINED_DURATION;
    public int e = 0;
    public int f = 0;
    public boolean g = false;
    public boolean h = false;

    public final void a(int i, int i2) {
        this.c = i;
        this.d = i2;
        this.h = true;
        if (this.g) {
            if (i2 != Integer.MIN_VALUE) {
                this.a = i2;
            }
            if (i != Integer.MIN_VALUE) {
                this.b = i;
                return;
            }
            return;
        }
        if (i != Integer.MIN_VALUE) {
            this.a = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.b = i2;
        }
    }
}