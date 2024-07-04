package defpackage;

import android.graphics.RectF;
import java.util.Arrays;

/* renamed from: n3  reason: default package */
public final class n3 implements tg {
    public final tg a;
    public final float b;

    public n3(float f, tg tgVar) {
        while (tgVar instanceof n3) {
            tgVar = ((n3) tgVar).a;
            f += ((n3) tgVar).b;
        }
        this.a = tgVar;
        this.b = f;
    }

    @Override // defpackage.tg
    public final float a(RectF rectF) {
        return Math.max(0.0f, this.a.a(rectF) + this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof n3) {
            n3 n3Var = (n3) obj;
            return this.a.equals(n3Var.a) && this.b == n3Var.b;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Float.valueOf(this.b)});
    }
}