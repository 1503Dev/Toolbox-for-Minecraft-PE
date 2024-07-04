package defpackage;

import androidx.databinding.b;
import java.io.Serializable;

/* renamed from: za0  reason: default package */
public final class za0<T> extends b implements Serializable {
    public T Q;

    public za0() {
    }

    public za0(T t) {
        this.Q = t;
    }

    public final void H(T t) {
        if (t != this.Q) {
            this.Q = t;
            F();
        }
    }
}