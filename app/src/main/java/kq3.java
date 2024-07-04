package defpackage;

import java.util.Arrays;

/* renamed from: kq3  reason: default package */
public final class kq3 {
    public static final kq3 e = new kq3(-1, -1, -1);
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public kq3(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = zn4.c(i3) ? zn4.n(i3, i2) : -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof kq3) {
            kq3 kq3Var = (kq3) obj;
            return this.a == kq3Var.a && this.b == kq3Var.b && this.c == kq3Var.c;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c)});
    }

    public final String toString() {
        int i = this.a;
        int i2 = this.b;
        int i3 = this.c;
        return "AudioFormat[sampleRate=" + i + ", channelCount=" + i2 + ", encoding=" + i3 + "]";
    }
}