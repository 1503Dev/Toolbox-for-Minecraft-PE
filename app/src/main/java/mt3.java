package defpackage;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: mt3  reason: default package */
public final class mt3 extends s14 {
    public mt3(int i) {
        super(i);
    }

    @Override // defpackage.s14
    public final void a() {
        Iterable<Map.Entry> entrySet;
        if (!this.S) {
            for (int i = 0; i < b(); i++) {
                Map.Entry entry = (Map.Entry) this.Q.get(i);
                if (((do2) entry.getKey()).d()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
            if (this.R.isEmpty()) {
                entrySet = mh.T;
            } else {
                entrySet = this.R.entrySet();
            }
            for (Map.Entry entry2 : entrySet) {
                if (((do2) entry2.getKey()).d()) {
                    entry2.setValue(Collections.unmodifiableList((List) entry2.getValue()));
                }
            }
        }
        super.a();
    }
}