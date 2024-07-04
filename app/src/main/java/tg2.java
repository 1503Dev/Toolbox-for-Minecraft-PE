package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: tg2  reason: default package */
public final class tg2 implements zy5 {
    public boolean a = false;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ vj1 c;
    public final /* synthetic */ Map d;
    public final /* synthetic */ Map e;

    public tg2(boolean z, vj1 vj1Var, HashMap hashMap, Map map) {
        this.b = z;
        this.c = vj1Var;
        this.d = hashMap;
        this.e = map;
    }

    @Override // defpackage.zy5
    public final void B(int i) {
    }

    @Override // defpackage.zy5
    public final void d(boolean z) {
        if (this.a) {
            return;
        }
        if (z && this.b) {
            ((oi3) this.c).w();
        }
        this.a = true;
        this.d.put((String) this.e.get("event_id"), Boolean.valueOf(z));
        ((pi2) this.c).a("openIntentAsync", this.d);
    }
}