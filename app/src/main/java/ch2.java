package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Map;

/* renamed from: ch2  reason: default package */
public final class ch2 implements mg2 {
    public final cu3 P;

    public ch2(cu3 cu3Var) {
        if (cu3Var == null) {
            throw new NullPointerException("The Inspector Manager must not be null");
        }
        this.P = cu3Var;
    }

    @Override // defpackage.mg2
    public final void b(Object obj, Map map) {
        if (map != null && map.containsKey("extras")) {
            boolean containsKey = map.containsKey("expires");
            long j = RecyclerView.FOREVER_NS;
            if (containsKey) {
                try {
                    j = Long.parseLong((String) map.get("expires"));
                } catch (NumberFormatException unused) {
                }
            }
            cu3 cu3Var = this.P;
            String str = (String) map.get("extras");
            synchronized (cu3Var) {
                cu3Var.l = str;
                cu3Var.n = j;
                cu3Var.i();
            }
        }
    }
}