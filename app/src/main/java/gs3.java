package defpackage;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: gs3  reason: default package */
public class gs3 {
    public final HashMap a;
    public final Executor b;
    public final wv2 c;
    public final boolean d;
    public final em4 e;
    public final boolean f;
    public final boolean g;

    public gs3(yw2 yw2Var, wv2 wv2Var, em4 em4Var) {
        String str = (String) gb2.a.d();
        this.a = new HashMap();
        this.b = yw2Var;
        this.c = wv2Var;
        l92 l92Var = x92.E1;
        w82 w82Var = w82.d;
        this.d = ((Boolean) w82Var.c.a(l92Var)).booleanValue();
        this.e = em4Var;
        this.f = ((Boolean) w82Var.c.a(x92.H1)).booleanValue();
        this.g = ((Boolean) w82Var.c.a(x92.X5)).booleanValue();
    }

    public final void a(Map map, boolean z) {
        if (map.isEmpty()) {
            sv2.b("Empty paramMap.");
            return;
        }
        String a = this.e.a(map);
        vz3.k(a);
        boolean parseBoolean = Boolean.parseBoolean((String) map.get("scar"));
        if (this.d) {
            if (!z || this.f) {
                if (!parseBoolean || this.g) {
                    this.b.execute(new xi2(1, this, a));
                }
            }
        }
    }
}