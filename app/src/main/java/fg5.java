package defpackage;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: fg5  reason: default package */
public final class fg5 extends lg5 {
    public fg5(int i) {
        super(i);
    }

    @Override // defpackage.lg5
    public final void a() {
        Iterable<Map.Entry> entrySet;
        if (!this.S) {
            for (int i = 0; i < b(); i++) {
                Map.Entry entry = (Map.Entry) this.Q.get(i);
                if (((yd5) entry.getKey()).d()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
            if (this.R.isEmpty()) {
                entrySet = mu2.U;
            } else {
                entrySet = this.R.entrySet();
            }
            for (Map.Entry entry2 : entrySet) {
                if (((yd5) entry2.getKey()).d()) {
                    entry2.setValue(Collections.unmodifiableList((List) entry2.getValue()));
                }
            }
        }
        super.a();
    }
}