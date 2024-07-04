package defpackage;

import java.util.Arrays;

/* renamed from: jz5  reason: default package */
public final class jz5 {
    public int a;
    public int b;
    public int c = 0;
    public yy5[] d = new yy5[100];

    public final synchronized void a(int i) {
        int i2 = this.a;
        this.a = i;
        if (i < i2) {
            b();
        }
    }

    public final synchronized void b() {
        int i = this.a;
        int i2 = zn4.a;
        int max = Math.max(0, ((i + 65535) / 65536) - this.b);
        int i3 = this.c;
        if (max >= i3) {
            return;
        }
        Arrays.fill(this.d, max, i3, (Object) null);
        this.c = max;
    }
}