package defpackage;

import android.graphics.RectF;
import java.util.Arrays;

/* renamed from: lk0  reason: default package */
public final class lk0 implements tg {
    public final float a;

    public lk0(float f) {
        this.a = f;
    }

    @Override // defpackage.tg
    public final float a(RectF rectF) {
        return rectF.height() * this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lk0) && this.a == ((lk0) obj).a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.a)});
    }
}