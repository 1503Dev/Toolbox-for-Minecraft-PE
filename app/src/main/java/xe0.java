package defpackage;

import androidx.databinding.f;
import androidx.databinding.g;
import defpackage.bf0;
import java.util.List;
import java.util.regex.Pattern;

/* renamed from: xe0  reason: default package */
public final class xe0 extends fj {
    public static final lj i;
    public Pattern f;
    public final List<bf0.c> g;
    public final cb0 h;

    static {
        int i2 = l41.b;
        lj ljVar = new lj();
        ljVar.d = 2131492983;
        ljVar.e = 35;
        ljVar.f = 9;
        i = ljVar;
    }

    public xe0(List list, af0 af0Var) {
        this.g = list;
        f fVar = new f();
        fVar.addAll(list);
        cb0 cb0Var = new cb0(fVar, new we0(this));
        this.h = cb0Var;
        cb0Var.h();
        s10 s10Var = new s10((g) cb0Var, i);
        s10Var.b = af0Var;
        m(s10Var);
    }
}