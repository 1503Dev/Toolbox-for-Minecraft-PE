package androidx.work.impl;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;

public final class a {
    public static C0014a a = new C0014a();
    public static b b = new b();
    public static c c = new c();
    public static d d = new d();
    public static e e = new e();
    public static f f = new f();
    public static g g = new g();

    /* renamed from: androidx.work.impl.a$a  reason: collision with other inner class name */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class C0014a extends f60 {
        public C0014a() {
            super(1, 2);
        }

        @Override // defpackage.f60
        public final void a(es esVar) {
            esVar.g("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            esVar.g("INSERT INTO SystemIdInfo(work_spec_id, system_id) SELECT work_spec_id, alarm_id AS system_id FROM alarmInfo");
            esVar.g("DROP TABLE IF EXISTS alarmInfo");
            esVar.g("INSERT OR IGNORE INTO worktag(tag, work_spec_id) SELECT worker_class_name AS tag, id AS work_spec_id FROM workspec");
        }
    }

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class b extends f60 {
        public b() {
            super(3, 4);
        }

        @Override // defpackage.f60
        public final void a(es esVar) {
            if (Build.VERSION.SDK_INT >= 23) {
                esVar.g("UPDATE workspec SET schedule_requested_at=0 WHERE state NOT IN (2, 3, 5) AND schedule_requested_at=-1 AND interval_duration<>0");
            }
        }
    }

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class c extends f60 {
        public c() {
            super(4, 5);
        }

        @Override // defpackage.f60
        public final void a(es esVar) {
            esVar.g("ALTER TABLE workspec ADD COLUMN `trigger_content_update_delay` INTEGER NOT NULL DEFAULT -1");
            esVar.g("ALTER TABLE workspec ADD COLUMN `trigger_max_content_delay` INTEGER NOT NULL DEFAULT -1");
        }
    }

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class d extends f60 {
        public d() {
            super(6, 7);
        }

        @Override // defpackage.f60
        public final void a(es esVar) {
            esVar.g("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        }
    }

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class e extends f60 {
        public e() {
            super(7, 8);
        }

        @Override // defpackage.f60
        public final void a(es esVar) {
            esVar.g("CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `workspec` (`period_start_time`)");
        }
    }

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class f extends f60 {
        public f() {
            super(8, 9);
        }

        @Override // defpackage.f60
        public final void a(es esVar) {
            esVar.g("ALTER TABLE workspec ADD COLUMN `run_in_foreground` INTEGER NOT NULL DEFAULT 0");
        }
    }

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class g extends f60 {
        public g() {
            super(11, 12);
        }

        @Override // defpackage.f60
        public final void a(es esVar) {
            esVar.g("ALTER TABLE workspec ADD COLUMN `out_of_quota_policy` INTEGER NOT NULL DEFAULT 0");
        }
    }

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class h extends f60 {
        public final Context c;

        public h(Context context, int i, int i2) {
            super(i, i2);
            this.c = context;
        }

        @Override // defpackage.f60
        public final void a(es esVar) {
            if (this.b >= 10) {
                esVar.P.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", 1});
            } else {
                this.c.getSharedPreferences("androidx.work.util.preferences", 0).edit().putBoolean("reschedule_needed", true).apply();
            }
        }
    }

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class i extends f60 {
        public final Context c;

        public i(Context context) {
            super(9, 10);
            this.c = context;
        }

        @Override // defpackage.f60
        public final void a(es esVar) {
            esVar.g("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
            SharedPreferences sharedPreferences = this.c.getSharedPreferences("androidx.work.util.preferences", 0);
            if (sharedPreferences.contains("reschedule_needed") || sharedPreferences.contains("last_cancel_all_time_ms")) {
                long j = 0;
                long j2 = sharedPreferences.getLong("last_cancel_all_time_ms", 0L);
                if (sharedPreferences.getBoolean("reschedule_needed", false)) {
                    j = 1;
                }
                esVar.a();
                try {
                    esVar.P.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"last_cancel_all_time_ms", Long.valueOf(j2)});
                    esVar.P.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", Long.valueOf(j)});
                    sharedPreferences.edit().clear().apply();
                    esVar.F();
                } finally {
                }
            }
            SharedPreferences sharedPreferences2 = this.c.getSharedPreferences("androidx.work.util.id", 0);
            if (sharedPreferences2.contains("next_job_scheduler_id") || sharedPreferences2.contains("next_job_scheduler_id")) {
                int i = sharedPreferences2.getInt("next_job_scheduler_id", 0);
                int i2 = sharedPreferences2.getInt("next_alarm_manager_id", 0);
                esVar.a();
                try {
                    esVar.P.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"next_job_scheduler_id", Integer.valueOf(i)});
                    esVar.P.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"next_alarm_manager_id", Integer.valueOf(i2)});
                    sharedPreferences2.edit().clear().apply();
                    esVar.F();
                } finally {
                }
            }
        }
    }
}