package defpackage;

import com.google.android.gms.ads.mediation.customevent.CustomEventAdapter;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ob2  reason: default package */
public final class ob2 implements ih {
    public final Object a;
    public final Object b;
    public final Object c;

    public /* synthetic */ ob2() {
        this.a = new ArrayList();
        this.b = new ArrayList();
        this.c = new ArrayList();
    }

    public /* synthetic */ ob2(CustomEventAdapter customEventAdapter, CustomEventAdapter customEventAdapter2, p50 p50Var) {
        this.c = customEventAdapter;
        this.a = customEventAdapter2;
        this.b = p50Var;
    }

    public final void a(String str, double d, double d2) {
        int i = 0;
        while (i < ((List) this.a).size()) {
            double doubleValue = ((Double) ((List) this.c).get(i)).doubleValue();
            double doubleValue2 = ((Double) ((List) this.b).get(i)).doubleValue();
            if (d < doubleValue || (doubleValue == d && d2 < doubleValue2)) {
                break;
            }
            i++;
        }
        ((List) this.a).add(i, str);
        ((List) this.c).add(i, Double.valueOf(d));
        ((List) this.b).add(i, Double.valueOf(d2));
    }
}