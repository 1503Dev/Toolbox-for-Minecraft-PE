package defpackage;

import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: gl4  reason: default package */
public final class gl4 {
    public final Object a;
    public final List b;
    public final /* synthetic */ kl4 c;

    public /* synthetic */ gl4(kl4 kl4Var, ml4 ml4Var, List list) {
        this.c = kl4Var;
        this.a = ml4Var;
        this.b = list;
    }

    public final jl4 a(Callable callable) {
        xy4 s = zw4.s(this.b);
        oy4 a = s.a(new Callable() { // from class: fl4
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return null;
            }
        }, zw2.f);
        kl4 kl4Var = this.c;
        return new jl4(kl4Var, this.a, a, this.b, s.a(callable, kl4Var.a));
    }
}