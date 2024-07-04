package defpackage;

import androidx.work.impl.WorkDatabase;
import defpackage.bm0;

/* renamed from: t61  reason: default package */
public final class t61 extends bm0.b {
    @Override // defpackage.bm0.b
    public final void a(es esVar) {
        esVar.a();
        try {
            int i = WorkDatabase.k;
            esVar.g("DELETE FROM workspec WHERE state IN (2, 3, 5) AND (period_start_time + minimum_retention_duration) < " + (System.currentTimeMillis() - WorkDatabase.j) + " AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))");
            esVar.F();
        } finally {
            esVar.d();
        }
    }
}