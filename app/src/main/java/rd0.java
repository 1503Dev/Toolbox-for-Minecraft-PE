package defpackage;

import java.lang.reflect.Array;
import javax.annotation.Nullable;

/* renamed from: rd0  reason: default package */
public final class rd0 extends sd0<Object> {
    public final /* synthetic */ sd0 a;

    public rd0(sd0 sd0Var) {
        this.a = sd0Var;
    }

    @Override // defpackage.sd0
    public final void a(wk0 wk0Var, @Nullable Object obj) {
        if (obj == null) {
            return;
        }
        int length = Array.getLength(obj);
        for (int i = 0; i < length; i++) {
            this.a.a(wk0Var, Array.get(obj, i));
        }
    }
}