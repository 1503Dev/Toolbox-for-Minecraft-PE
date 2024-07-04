package defpackage;

import java.io.IOException;
import org.json.JSONException;

/* renamed from: le1  reason: default package */
public final class le1 implements Runnable {
    public final /* synthetic */ me1 P;

    public le1(me1 me1Var) {
        this.P = me1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        me1 me1Var = this.P;
        synchronized (me1Var) {
            try {
                if (me1Var.c.size() > 0) {
                    me1Var.a.a(me1Var.a(me1Var.e, me1Var.c));
                    me1Var.c.clear();
                }
            } catch (IOException | JSONException unused) {
                me1Var.c.clear();
            }
        }
    }
}