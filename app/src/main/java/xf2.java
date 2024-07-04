package defpackage;

import java.io.IOException;
import java.util.Map;

/* renamed from: xf2  reason: default package */
public final class xf2 implements mg2 {
    @Override // defpackage.mg2
    public final void b(Object obj, Map map) {
        y03 y03Var = (y03) obj;
        try {
            fr4 f = fr4.f(y03Var.getContext());
            f.getClass();
            synchronized (fr4.class) {
                f.d(false);
            }
            gr4.f(y03Var.getContext()).g();
        } catch (IOException e) {
            jv5.A.g.f("DefaultGmsgHandlers.ResetPaid", e);
        }
    }
}