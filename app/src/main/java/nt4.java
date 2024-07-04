package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;
import javax.annotation.CheckForNull;

/* renamed from: nt4  reason: default package */
public abstract class nt4 implements Iterator {
    @CheckForNull
    public String P;
    public final CharSequence R;
    public int T;
    public int Q = 2;
    public int S = 0;

    public nt4(vw2 vw2Var, CharSequence charSequence) {
        Object obj = vw2Var.P;
        this.T = Integer.MAX_VALUE;
        this.R = charSequence;
    }

    @Override // java.util.Iterator
    /* renamed from: a */
    public final boolean hasNext() {
        boolean z;
        int d;
        int i = this.Q;
        if (i != 4) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            int i2 = i - 1;
            String str = null;
            if (i != 0) {
                if (i2 == 0) {
                    return true;
                }
                if (i2 != 2) {
                    this.Q = 4;
                    int i3 = this.S;
                    while (true) {
                        int i4 = this.S;
                        if (i4 != -1) {
                            int e = e(i4);
                            if (e == -1) {
                                e = this.R.length();
                                this.S = -1;
                                d = -1;
                            } else {
                                d = d(e);
                                this.S = d;
                            }
                            if (d == i3) {
                                int i5 = d + 1;
                                this.S = i5;
                                if (i5 > this.R.length()) {
                                    this.S = -1;
                                }
                            } else {
                                if (i3 < e) {
                                    this.R.charAt(i3);
                                }
                                if (i3 < e) {
                                    this.R.charAt(e - 1);
                                }
                                int i6 = this.T;
                                if (i6 == 1) {
                                    e = this.R.length();
                                    this.S = -1;
                                    if (e > i3) {
                                        this.R.charAt(e - 1);
                                    }
                                } else {
                                    this.T = i6 - 1;
                                }
                                str = this.R.subSequence(i3, e).toString();
                            }
                        } else {
                            this.Q = 3;
                            break;
                        }
                    }
                    this.P = str;
                    if (this.Q != 3) {
                        this.Q = 1;
                        return true;
                    }
                }
                return false;
            }
            throw null;
        }
        throw new IllegalStateException();
    }

    @Override // java.util.Iterator
    /* renamed from: b */
    public final Object next() {
        if (hasNext()) {
            this.Q = 2;
            String str = this.P;
            this.P = null;
            return str;
        }
        throw new NoSuchElementException();
    }

    public final void c() {
        throw new UnsupportedOperationException();
    }

    public abstract int d(int i);

    public abstract int e(int i);

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ void remove() {
        c();
        throw null;
    }
}