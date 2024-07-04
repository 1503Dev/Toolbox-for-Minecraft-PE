package androidx.work.impl;

import android.content.Context;
import defpackage.dm0;
import defpackage.rv0;
import defpackage.wu0;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public final class WorkDatabase_Impl extends WorkDatabase {
    public static final /* synthetic */ int s = 0;
    public volatile n71 l;
    public volatile qk m;
    public volatile q71 n;
    public volatile hv0 o;
    public volatile e71 p;
    public volatile h71 q;
    public volatile xf0 r;

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class a extends dm0.a {
        public a() {
        }

        @Override // defpackage.dm0.a
        public final void a(es esVar) {
            esVar.g("CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            esVar.g("CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
            esVar.g("CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
            esVar.g("CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `period_start_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `required_network_type` INTEGER, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB, PRIMARY KEY(`id`))");
            esVar.g("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
            esVar.g("CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `WorkSpec` (`period_start_time`)");
            esVar.g("CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            esVar.g("CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
            esVar.g("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            esVar.g("CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            esVar.g("CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
            esVar.g("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            esVar.g("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
            esVar.g("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            esVar.g("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'c103703e120ae8cc73c9248622f3cd1e')");
        }

        @Override // defpackage.dm0.a
        public final dm0.b b(es esVar) {
            HashMap hashMap = new HashMap(2);
            hashMap.put("work_spec_id", new rv0.a(1, 1, "work_spec_id", "TEXT", null, true));
            hashMap.put("prerequisite_id", new rv0.a(2, 1, "prerequisite_id", "TEXT", null, true));
            HashSet hashSet = new HashSet(2);
            hashSet.add(new rv0.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            hashSet.add(new rv0.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("prerequisite_id"), Arrays.asList("id")));
            HashSet hashSet2 = new HashSet(2);
            hashSet2.add(new rv0.d("index_Dependency_work_spec_id", Arrays.asList("work_spec_id"), false));
            hashSet2.add(new rv0.d("index_Dependency_prerequisite_id", Arrays.asList("prerequisite_id"), false));
            rv0 rv0Var = new rv0("Dependency", hashMap, hashSet, hashSet2);
            rv0 a = rv0.a(esVar, "Dependency");
            if (!rv0Var.equals(a)) {
                return new dm0.b("Dependency(androidx.work.impl.model.Dependency).\n Expected:\n" + rv0Var + "\n Found:\n" + a, false);
            }
            HashMap hashMap2 = new HashMap(25);
            hashMap2.put("id", new rv0.a(1, 1, "id", "TEXT", null, true));
            hashMap2.put("state", new rv0.a(0, 1, "state", "INTEGER", null, true));
            hashMap2.put("worker_class_name", new rv0.a(0, 1, "worker_class_name", "TEXT", null, true));
            hashMap2.put("input_merger_class_name", new rv0.a(0, 1, "input_merger_class_name", "TEXT", null, false));
            hashMap2.put("input", new rv0.a(0, 1, "input", "BLOB", null, true));
            hashMap2.put("output", new rv0.a(0, 1, "output", "BLOB", null, true));
            hashMap2.put("initial_delay", new rv0.a(0, 1, "initial_delay", "INTEGER", null, true));
            hashMap2.put("interval_duration", new rv0.a(0, 1, "interval_duration", "INTEGER", null, true));
            hashMap2.put("flex_duration", new rv0.a(0, 1, "flex_duration", "INTEGER", null, true));
            hashMap2.put("run_attempt_count", new rv0.a(0, 1, "run_attempt_count", "INTEGER", null, true));
            hashMap2.put("backoff_policy", new rv0.a(0, 1, "backoff_policy", "INTEGER", null, true));
            hashMap2.put("backoff_delay_duration", new rv0.a(0, 1, "backoff_delay_duration", "INTEGER", null, true));
            hashMap2.put("period_start_time", new rv0.a(0, 1, "period_start_time", "INTEGER", null, true));
            hashMap2.put("minimum_retention_duration", new rv0.a(0, 1, "minimum_retention_duration", "INTEGER", null, true));
            hashMap2.put("schedule_requested_at", new rv0.a(0, 1, "schedule_requested_at", "INTEGER", null, true));
            hashMap2.put("run_in_foreground", new rv0.a(0, 1, "run_in_foreground", "INTEGER", null, true));
            hashMap2.put("out_of_quota_policy", new rv0.a(0, 1, "out_of_quota_policy", "INTEGER", null, true));
            hashMap2.put("required_network_type", new rv0.a(0, 1, "required_network_type", "INTEGER", null, false));
            hashMap2.put("requires_charging", new rv0.a(0, 1, "requires_charging", "INTEGER", null, true));
            hashMap2.put("requires_device_idle", new rv0.a(0, 1, "requires_device_idle", "INTEGER", null, true));
            hashMap2.put("requires_battery_not_low", new rv0.a(0, 1, "requires_battery_not_low", "INTEGER", null, true));
            hashMap2.put("requires_storage_not_low", new rv0.a(0, 1, "requires_storage_not_low", "INTEGER", null, true));
            hashMap2.put("trigger_content_update_delay", new rv0.a(0, 1, "trigger_content_update_delay", "INTEGER", null, true));
            hashMap2.put("trigger_max_content_delay", new rv0.a(0, 1, "trigger_max_content_delay", "INTEGER", null, true));
            hashMap2.put("content_uri_triggers", new rv0.a(0, 1, "content_uri_triggers", "BLOB", null, false));
            HashSet hashSet3 = new HashSet(0);
            HashSet hashSet4 = new HashSet(2);
            hashSet4.add(new rv0.d("index_WorkSpec_schedule_requested_at", Arrays.asList("schedule_requested_at"), false));
            hashSet4.add(new rv0.d("index_WorkSpec_period_start_time", Arrays.asList("period_start_time"), false));
            rv0 rv0Var2 = new rv0("WorkSpec", hashMap2, hashSet3, hashSet4);
            rv0 a2 = rv0.a(esVar, "WorkSpec");
            if (!rv0Var2.equals(a2)) {
                return new dm0.b("WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n" + rv0Var2 + "\n Found:\n" + a2, false);
            }
            HashMap hashMap3 = new HashMap(2);
            hashMap3.put("tag", new rv0.a(1, 1, "tag", "TEXT", null, true));
            hashMap3.put("work_spec_id", new rv0.a(2, 1, "work_spec_id", "TEXT", null, true));
            HashSet hashSet5 = new HashSet(1);
            hashSet5.add(new rv0.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            HashSet hashSet6 = new HashSet(1);
            hashSet6.add(new rv0.d("index_WorkTag_work_spec_id", Arrays.asList("work_spec_id"), false));
            rv0 rv0Var3 = new rv0("WorkTag", hashMap3, hashSet5, hashSet6);
            rv0 a3 = rv0.a(esVar, "WorkTag");
            if (!rv0Var3.equals(a3)) {
                return new dm0.b("WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n" + rv0Var3 + "\n Found:\n" + a3, false);
            }
            HashMap hashMap4 = new HashMap(2);
            hashMap4.put("work_spec_id", new rv0.a(1, 1, "work_spec_id", "TEXT", null, true));
            hashMap4.put("system_id", new rv0.a(0, 1, "system_id", "INTEGER", null, true));
            HashSet hashSet7 = new HashSet(1);
            hashSet7.add(new rv0.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            rv0 rv0Var4 = new rv0("SystemIdInfo", hashMap4, hashSet7, new HashSet(0));
            rv0 a4 = rv0.a(esVar, "SystemIdInfo");
            if (!rv0Var4.equals(a4)) {
                return new dm0.b("SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n" + rv0Var4 + "\n Found:\n" + a4, false);
            }
            HashMap hashMap5 = new HashMap(2);
            hashMap5.put("name", new rv0.a(1, 1, "name", "TEXT", null, true));
            hashMap5.put("work_spec_id", new rv0.a(2, 1, "work_spec_id", "TEXT", null, true));
            HashSet hashSet8 = new HashSet(1);
            hashSet8.add(new rv0.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            HashSet hashSet9 = new HashSet(1);
            hashSet9.add(new rv0.d("index_WorkName_work_spec_id", Arrays.asList("work_spec_id"), false));
            rv0 rv0Var5 = new rv0("WorkName", hashMap5, hashSet8, hashSet9);
            rv0 a5 = rv0.a(esVar, "WorkName");
            if (!rv0Var5.equals(a5)) {
                return new dm0.b("WorkName(androidx.work.impl.model.WorkName).\n Expected:\n" + rv0Var5 + "\n Found:\n" + a5, false);
            }
            HashMap hashMap6 = new HashMap(2);
            hashMap6.put("work_spec_id", new rv0.a(1, 1, "work_spec_id", "TEXT", null, true));
            hashMap6.put("progress", new rv0.a(0, 1, "progress", "BLOB", null, true));
            HashSet hashSet10 = new HashSet(1);
            hashSet10.add(new rv0.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            rv0 rv0Var6 = new rv0("WorkProgress", hashMap6, hashSet10, new HashSet(0));
            rv0 a6 = rv0.a(esVar, "WorkProgress");
            if (!rv0Var6.equals(a6)) {
                return new dm0.b("WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n" + rv0Var6 + "\n Found:\n" + a6, false);
            }
            HashMap hashMap7 = new HashMap(2);
            hashMap7.put("key", new rv0.a(1, 1, "key", "TEXT", null, true));
            hashMap7.put("long_value", new rv0.a(0, 1, "long_value", "INTEGER", null, false));
            rv0 rv0Var7 = new rv0("Preference", hashMap7, new HashSet(0), new HashSet(0));
            rv0 a7 = rv0.a(esVar, "Preference");
            if (rv0Var7.equals(a7)) {
                return new dm0.b(null, true);
            }
            return new dm0.b("Preference(androidx.work.impl.model.Preference).\n Expected:\n" + rv0Var7 + "\n Found:\n" + a7, false);
        }
    }

    @Override // defpackage.bm0
    public final iy d() {
        return new iy(this, new HashMap(0), new HashMap(0), "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference");
    }

    @Override // defpackage.bm0
    public final wu0 e(pj pjVar) {
        dm0 dm0Var = new dm0(pjVar, new a());
        Context context = pjVar.b;
        String str = pjVar.c;
        if (context != null) {
            return pjVar.a.a(new wu0.b(context, str, dm0Var, false));
        }
        throw new IllegalArgumentException("Must set a non-null context to create the configuration.");
    }

    @Override // androidx.work.impl.WorkDatabase
    public final pk i() {
        qk qkVar;
        if (this.m != null) {
            return this.m;
        }
        synchronized (this) {
            if (this.m == null) {
                this.m = new qk(this);
            }
            qkVar = this.m;
        }
        return qkVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final wf0 j() {
        xf0 xf0Var;
        if (this.r != null) {
            return this.r;
        }
        synchronized (this) {
            if (this.r == null) {
                this.r = new xf0(this);
            }
            xf0Var = this.r;
        }
        return xf0Var;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final gv0 k() {
        hv0 hv0Var;
        if (this.o != null) {
            return this.o;
        }
        synchronized (this) {
            if (this.o == null) {
                this.o = new hv0(this);
            }
            hv0Var = this.o;
        }
        return hv0Var;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final d71 l() {
        e71 e71Var;
        if (this.p != null) {
            return this.p;
        }
        synchronized (this) {
            if (this.p == null) {
                this.p = new e71(this);
            }
            e71Var = this.p;
        }
        return e71Var;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final g71 m() {
        h71 h71Var;
        if (this.q != null) {
            return this.q;
        }
        synchronized (this) {
            if (this.q == null) {
                this.q = new h71(this);
            }
            h71Var = this.q;
        }
        return h71Var;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final m71 n() {
        n71 n71Var;
        if (this.l != null) {
            return this.l;
        }
        synchronized (this) {
            if (this.l == null) {
                this.l = new n71(this);
            }
            n71Var = this.l;
        }
        return n71Var;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final p71 o() {
        q71 q71Var;
        if (this.n != null) {
            return this.n;
        }
        synchronized (this) {
            if (this.n == null) {
                this.n = new q71(this);
            }
            q71Var = this.n;
        }
        return q71Var;
    }
}