package defpackage;

import java.io.IOException;

/* renamed from: bw4  reason: default package */
public class bw4 extends IOException {
    public final int P;

    public bw4(int i) {
        this.P = i;
    }

    public bw4(int i, String str, Throwable th) {
        super(str, th);
        this.P = i;
    }

    public bw4(int i, Throwable th) {
        super(th);
        this.P = i;
    }

    public bw4(String str, int i) {
        super(str);
        this.P = i;
    }
}