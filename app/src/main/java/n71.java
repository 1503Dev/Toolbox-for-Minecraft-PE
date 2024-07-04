package defpackage;

import android.database.Cursor;
import android.os.Build;
import defpackage.bg;
import defpackage.l71;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: n71  reason: default package */
public final class n71 implements m71 {
    public final bm0 a;
    public final a b;
    public final b c;
    public final c d;
    public final d e;
    public final e f;
    public final f g;
    public final g h;
    public final h i;

    /* renamed from: n71$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class a extends yo<l71> {
        public a(bm0 bm0Var) {
            super(bm0Var);
        }

        @Override // defpackage.qr0
        public final String b() {
            return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`period_start_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }

        /* JADX WARN: Can't wrap try/catch for region: R(7:45|(2:46|(2:47|48))|(4:50|51|(2:52|(1:54)(1:55))|56)|57|59|60|61) */
        /* JADX WARN: Code restructure failed: missing block: B:82:0x01c1, code lost:
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:83:0x01c2, code lost:
            r0.printStackTrace();
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:87:0x01cd  */
        /* JADX WARN: Type inference failed for: r3v12 */
        /* JADX WARN: Type inference failed for: r3v13 */
        /* JADX WARN: Type inference failed for: r3v26 */
        /* JADX WARN: Type inference failed for: r3v27 */
        /* JADX WARN: Type inference failed for: r3v28 */
        /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.Throwable] */
        /* JADX WARN: Type inference failed for: r3v8, types: [java.io.ObjectOutputStream] */
        /* JADX WARN: Type inference failed for: r3v9 */
        @Override // defpackage.yo
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void d(is isVar, l71 l71Var) {
            int i;
            int i2;
            Throwable th;
            ObjectOutputStream objectOutputStream;
            boolean hasNext;
            l71 l71Var2 = l71Var;
            String str = l71Var2.a;
            int i3 = 1;
            if (str == null) {
                isVar.t(1);
            } else {
                isVar.y(1, str);
            }
            isVar.g(s71.f(l71Var2.b), 2);
            String str2 = l71Var2.c;
            if (str2 == null) {
                isVar.t(3);
            } else {
                isVar.y(3, str2);
            }
            String str3 = l71Var2.d;
            if (str3 == null) {
                isVar.t(4);
            } else {
                isVar.y(4, str3);
            }
            byte[] b = androidx.work.b.b(l71Var2.e);
            if (b == null) {
                isVar.t(5);
            } else {
                isVar.a(b, 5);
            }
            byte[] b2 = androidx.work.b.b(l71Var2.f);
            if (b2 == null) {
                isVar.t(6);
            } else {
                isVar.a(b2, 6);
            }
            isVar.g(l71Var2.g, 7);
            isVar.g(l71Var2.h, 8);
            isVar.g(l71Var2.i, 9);
            isVar.g(l71Var2.k, 10);
            int i4 = l71Var2.l;
            int b3 = cm0.b(i4);
            if (b3 != 0) {
                if (b3 == 1) {
                    i = 1;
                } else {
                    StringBuilder b4 = e5.b("Could not convert ");
                    b4.append(e1.f(i4));
                    b4.append(" to int");
                    throw new IllegalArgumentException(b4.toString());
                }
            } else {
                i = 0;
            }
            isVar.g(i, 11);
            isVar.g(l71Var2.m, 12);
            isVar.g(l71Var2.n, 13);
            isVar.g(l71Var2.o, 14);
            isVar.g(l71Var2.p, 15);
            isVar.g(l71Var2.q ? 1L : 0L, 16);
            int i5 = l71Var2.r;
            int b5 = cm0.b(i5);
            if (b5 != 0) {
                if (b5 == 1) {
                    i2 = 1;
                } else {
                    StringBuilder b6 = e5.b("Could not convert ");
                    b6.append(k6.c(i5));
                    b6.append(" to int");
                    throw new IllegalArgumentException(b6.toString());
                }
            } else {
                i2 = 0;
            }
            isVar.g(i2, 17);
            sf sfVar = l71Var2.j;
            if (sfVar != null) {
                o90 o90Var = sfVar.a;
                int ordinal = o90Var.ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        if (ordinal != 2) {
                            if (ordinal != 3) {
                                if (ordinal != 4) {
                                    if (Build.VERSION.SDK_INT >= 30 && o90Var == o90.TEMPORARILY_UNMETERED) {
                                        i3 = 5;
                                    } else {
                                        throw new IllegalArgumentException("Could not convert " + o90Var + " to int");
                                    }
                                } else {
                                    i3 = 4;
                                }
                            } else {
                                i3 = 3;
                            }
                        } else {
                            i3 = 2;
                        }
                    }
                } else {
                    i3 = 0;
                }
                isVar.g(i3, 18);
                isVar.g(sfVar.b ? 1L : 0L, 19);
                isVar.g(sfVar.c ? 1L : 0L, 20);
                isVar.g(sfVar.d ? 1L : 0L, 21);
                isVar.g(sfVar.e ? 1L : 0L, 22);
                isVar.g(sfVar.f, 23);
                isVar.g(sfVar.g, 24);
                bg bgVar = sfVar.h;
                byte[] bArr = null;
                r3 = 0;
                ObjectOutputStream objectOutputStream2 = null;
                if (bgVar.a.size() != 0) {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        try {
                            try {
                                objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                            } catch (IOException e) {
                                objectOutputStream2 = e;
                                objectOutputStream2.printStackTrace();
                            }
                        } catch (IOException e2) {
                            e = e2;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        objectOutputStream = objectOutputStream2;
                    }
                    try {
                        objectOutputStream.writeInt(bgVar.a.size());
                        Iterator it = bgVar.a.iterator();
                        while (true) {
                            hasNext = it.hasNext();
                            if (!hasNext) {
                                break;
                            }
                            bg.a aVar = (bg.a) it.next();
                            objectOutputStream.writeUTF(aVar.a.toString());
                            objectOutputStream.writeBoolean(aVar.b);
                        }
                        objectOutputStream.close();
                        objectOutputStream2 = hasNext;
                    } catch (IOException e3) {
                        e = e3;
                        objectOutputStream2 = objectOutputStream;
                        e.printStackTrace();
                        if (objectOutputStream2 != 0) {
                            objectOutputStream2.close();
                            objectOutputStream2 = objectOutputStream2;
                        }
                        byteArrayOutputStream.close();
                        bArr = byteArrayOutputStream.toByteArray();
                        if (bArr != null) {
                        }
                        isVar.t(25);
                    } catch (Throwable th3) {
                        th = th3;
                        if (objectOutputStream != null) {
                            try {
                                objectOutputStream.close();
                            } catch (IOException e4) {
                                e4.printStackTrace();
                            }
                        }
                        try {
                            byteArrayOutputStream.close();
                        } catch (IOException e5) {
                            e5.printStackTrace();
                        }
                        throw th;
                    }
                    byteArrayOutputStream.close();
                    bArr = byteArrayOutputStream.toByteArray();
                }
                if (bArr != null) {
                    isVar.a(bArr, 25);
                    return;
                }
            } else {
                isVar.t(18);
                isVar.t(19);
                isVar.t(20);
                isVar.t(21);
                isVar.t(22);
                isVar.t(23);
                isVar.t(24);
            }
            isVar.t(25);
        }
    }

    /* renamed from: n71$b */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class b extends qr0 {
        public b(bm0 bm0Var) {
            super(bm0Var);
        }

        @Override // defpackage.qr0
        public final String b() {
            return "DELETE FROM workspec WHERE id=?";
        }
    }

    /* renamed from: n71$c */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class c extends qr0 {
        public c(bm0 bm0Var) {
            super(bm0Var);
        }

        @Override // defpackage.qr0
        public final String b() {
            return "UPDATE workspec SET output=? WHERE id=?";
        }
    }

    /* renamed from: n71$d */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class d extends qr0 {
        public d(bm0 bm0Var) {
            super(bm0Var);
        }

        @Override // defpackage.qr0
        public final String b() {
            return "UPDATE workspec SET period_start_time=? WHERE id=?";
        }
    }

    /* renamed from: n71$e */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class e extends qr0 {
        public e(bm0 bm0Var) {
            super(bm0Var);
        }

        @Override // defpackage.qr0
        public final String b() {
            return "UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?";
        }
    }

    /* renamed from: n71$f */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class f extends qr0 {
        public f(bm0 bm0Var) {
            super(bm0Var);
        }

        @Override // defpackage.qr0
        public final String b() {
            return "UPDATE workspec SET run_attempt_count=0 WHERE id=?";
        }
    }

    /* renamed from: n71$g */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class g extends qr0 {
        public g(bm0 bm0Var) {
            super(bm0Var);
        }

        @Override // defpackage.qr0
        public final String b() {
            return "UPDATE workspec SET schedule_requested_at=? WHERE id=?";
        }
    }

    /* renamed from: n71$h */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class h extends qr0 {
        public h(bm0 bm0Var) {
            super(bm0Var);
        }

        @Override // defpackage.qr0
        public final String b() {
            return "UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)";
        }
    }

    public n71(bm0 bm0Var) {
        this.a = bm0Var;
        this.b = new a(bm0Var);
        this.c = new b(bm0Var);
        this.d = new c(bm0Var);
        this.e = new d(bm0Var);
        this.f = new e(bm0Var);
        this.g = new f(bm0Var);
        this.h = new g(bm0Var);
        this.i = new h(bm0Var);
        new AtomicBoolean(false);
    }

    public final void a(String str) {
        this.a.b();
        is a2 = this.c.a();
        if (str == null) {
            a2.t(1);
        } else {
            a2.y(1, str);
        }
        this.a.c();
        try {
            a2.E();
            this.a.h();
        } finally {
            this.a.f();
            this.c.c(a2);
        }
    }

    public final ArrayList b() {
        em0 em0Var;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        em0 a2 = em0.a(1, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 ORDER BY period_start_time LIMIT ?");
        a2.t(200, 1);
        this.a.b();
        Cursor g2 = this.a.g(a2);
        try {
            int i = ea2.i(g2, "required_network_type");
            int i2 = ea2.i(g2, "requires_charging");
            int i3 = ea2.i(g2, "requires_device_idle");
            int i4 = ea2.i(g2, "requires_battery_not_low");
            int i5 = ea2.i(g2, "requires_storage_not_low");
            int i6 = ea2.i(g2, "trigger_content_update_delay");
            int i7 = ea2.i(g2, "trigger_max_content_delay");
            int i8 = ea2.i(g2, "content_uri_triggers");
            int i9 = ea2.i(g2, "id");
            int i10 = ea2.i(g2, "state");
            int i11 = ea2.i(g2, "worker_class_name");
            int i12 = ea2.i(g2, "input_merger_class_name");
            int i13 = ea2.i(g2, "input");
            int i14 = ea2.i(g2, "output");
            em0Var = a2;
            try {
                int i15 = ea2.i(g2, "initial_delay");
                int i16 = ea2.i(g2, "interval_duration");
                int i17 = ea2.i(g2, "flex_duration");
                int i18 = ea2.i(g2, "run_attempt_count");
                int i19 = ea2.i(g2, "backoff_policy");
                int i20 = ea2.i(g2, "backoff_delay_duration");
                int i21 = ea2.i(g2, "period_start_time");
                int i22 = ea2.i(g2, "minimum_retention_duration");
                int i23 = ea2.i(g2, "schedule_requested_at");
                int i24 = ea2.i(g2, "run_in_foreground");
                int i25 = ea2.i(g2, "out_of_quota_policy");
                int i26 = i14;
                ArrayList arrayList = new ArrayList(g2.getCount());
                while (g2.moveToNext()) {
                    String string = g2.getString(i9);
                    int i27 = i9;
                    String string2 = g2.getString(i11);
                    int i28 = i11;
                    sf sfVar = new sf();
                    int i29 = i;
                    sfVar.a = s71.c(g2.getInt(i));
                    if (g2.getInt(i2) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    sfVar.b = z;
                    if (g2.getInt(i3) != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    sfVar.c = z2;
                    if (g2.getInt(i4) != 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    sfVar.d = z3;
                    if (g2.getInt(i5) != 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    sfVar.e = z4;
                    int i30 = i2;
                    sfVar.f = g2.getLong(i6);
                    sfVar.g = g2.getLong(i7);
                    sfVar.h = s71.a(g2.getBlob(i8));
                    l71 l71Var = new l71(string, string2);
                    l71Var.b = s71.e(g2.getInt(i10));
                    l71Var.d = g2.getString(i12);
                    l71Var.e = androidx.work.b.a(g2.getBlob(i13));
                    int i31 = i26;
                    l71Var.f = androidx.work.b.a(g2.getBlob(i31));
                    int i32 = i13;
                    i26 = i31;
                    int i33 = i15;
                    l71Var.g = g2.getLong(i33);
                    i15 = i33;
                    int i34 = i3;
                    int i35 = i16;
                    l71Var.h = g2.getLong(i35);
                    i16 = i35;
                    int i36 = i17;
                    l71Var.i = g2.getLong(i36);
                    int i37 = i18;
                    l71Var.k = g2.getInt(i37);
                    int i38 = i19;
                    i18 = i37;
                    l71Var.l = s71.b(g2.getInt(i38));
                    i17 = i36;
                    int i39 = i20;
                    l71Var.m = g2.getLong(i39);
                    i20 = i39;
                    int i40 = i21;
                    l71Var.n = g2.getLong(i40);
                    i21 = i40;
                    int i41 = i22;
                    l71Var.o = g2.getLong(i41);
                    i22 = i41;
                    int i42 = i23;
                    l71Var.p = g2.getLong(i42);
                    int i43 = i24;
                    if (g2.getInt(i43) != 0) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    l71Var.q = z5;
                    int i44 = i25;
                    i24 = i43;
                    l71Var.r = s71.d(g2.getInt(i44));
                    l71Var.j = sfVar;
                    arrayList.add(l71Var);
                    i25 = i44;
                    i23 = i42;
                    i13 = i32;
                    i9 = i27;
                    i11 = i28;
                    i = i29;
                    i2 = i30;
                    i19 = i38;
                    i3 = i34;
                }
                g2.close();
                em0Var.F();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                g2.close();
                em0Var.F();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            em0Var = a2;
        }
    }

    public final ArrayList c(int i) {
        em0 em0Var;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        em0 a2 = em0.a(1, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY period_start_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND state NOT IN (2, 3, 5))");
        a2.t(i, 1);
        this.a.b();
        Cursor g2 = this.a.g(a2);
        try {
            int i2 = ea2.i(g2, "required_network_type");
            int i3 = ea2.i(g2, "requires_charging");
            int i4 = ea2.i(g2, "requires_device_idle");
            int i5 = ea2.i(g2, "requires_battery_not_low");
            int i6 = ea2.i(g2, "requires_storage_not_low");
            int i7 = ea2.i(g2, "trigger_content_update_delay");
            int i8 = ea2.i(g2, "trigger_max_content_delay");
            int i9 = ea2.i(g2, "content_uri_triggers");
            int i10 = ea2.i(g2, "id");
            int i11 = ea2.i(g2, "state");
            int i12 = ea2.i(g2, "worker_class_name");
            int i13 = ea2.i(g2, "input_merger_class_name");
            int i14 = ea2.i(g2, "input");
            int i15 = ea2.i(g2, "output");
            em0Var = a2;
            try {
                int i16 = ea2.i(g2, "initial_delay");
                int i17 = ea2.i(g2, "interval_duration");
                int i18 = ea2.i(g2, "flex_duration");
                int i19 = ea2.i(g2, "run_attempt_count");
                int i20 = ea2.i(g2, "backoff_policy");
                int i21 = ea2.i(g2, "backoff_delay_duration");
                int i22 = ea2.i(g2, "period_start_time");
                int i23 = ea2.i(g2, "minimum_retention_duration");
                int i24 = ea2.i(g2, "schedule_requested_at");
                int i25 = ea2.i(g2, "run_in_foreground");
                int i26 = ea2.i(g2, "out_of_quota_policy");
                int i27 = i15;
                ArrayList arrayList = new ArrayList(g2.getCount());
                while (g2.moveToNext()) {
                    String string = g2.getString(i10);
                    int i28 = i10;
                    String string2 = g2.getString(i12);
                    int i29 = i12;
                    sf sfVar = new sf();
                    int i30 = i2;
                    sfVar.a = s71.c(g2.getInt(i2));
                    if (g2.getInt(i3) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    sfVar.b = z;
                    if (g2.getInt(i4) != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    sfVar.c = z2;
                    if (g2.getInt(i5) != 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    sfVar.d = z3;
                    if (g2.getInt(i6) != 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    sfVar.e = z4;
                    int i31 = i3;
                    sfVar.f = g2.getLong(i7);
                    sfVar.g = g2.getLong(i8);
                    sfVar.h = s71.a(g2.getBlob(i9));
                    l71 l71Var = new l71(string, string2);
                    l71Var.b = s71.e(g2.getInt(i11));
                    l71Var.d = g2.getString(i13);
                    l71Var.e = androidx.work.b.a(g2.getBlob(i14));
                    int i32 = i27;
                    l71Var.f = androidx.work.b.a(g2.getBlob(i32));
                    int i33 = i16;
                    int i34 = i14;
                    i27 = i32;
                    l71Var.g = g2.getLong(i33);
                    int i35 = i4;
                    int i36 = i17;
                    l71Var.h = g2.getLong(i36);
                    i17 = i36;
                    int i37 = i18;
                    l71Var.i = g2.getLong(i37);
                    int i38 = i19;
                    l71Var.k = g2.getInt(i38);
                    int i39 = i20;
                    i19 = i38;
                    l71Var.l = s71.b(g2.getInt(i39));
                    i18 = i37;
                    int i40 = i21;
                    l71Var.m = g2.getLong(i40);
                    i21 = i40;
                    int i41 = i22;
                    l71Var.n = g2.getLong(i41);
                    i22 = i41;
                    int i42 = i23;
                    l71Var.o = g2.getLong(i42);
                    i23 = i42;
                    int i43 = i24;
                    l71Var.p = g2.getLong(i43);
                    int i44 = i25;
                    if (g2.getInt(i44) != 0) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    l71Var.q = z5;
                    int i45 = i26;
                    i25 = i44;
                    l71Var.r = s71.d(g2.getInt(i45));
                    l71Var.j = sfVar;
                    arrayList.add(l71Var);
                    i14 = i34;
                    i26 = i45;
                    i24 = i43;
                    i16 = i33;
                    i10 = i28;
                    i12 = i29;
                    i2 = i30;
                    i3 = i31;
                    i20 = i39;
                    i4 = i35;
                }
                g2.close();
                em0Var.F();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                g2.close();
                em0Var.F();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            em0Var = a2;
        }
    }

    public final ArrayList d() {
        em0 em0Var;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        em0 a2 = em0.a(0, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=1");
        this.a.b();
        Cursor g2 = this.a.g(a2);
        try {
            int i = ea2.i(g2, "required_network_type");
            int i2 = ea2.i(g2, "requires_charging");
            int i3 = ea2.i(g2, "requires_device_idle");
            int i4 = ea2.i(g2, "requires_battery_not_low");
            int i5 = ea2.i(g2, "requires_storage_not_low");
            int i6 = ea2.i(g2, "trigger_content_update_delay");
            int i7 = ea2.i(g2, "trigger_max_content_delay");
            int i8 = ea2.i(g2, "content_uri_triggers");
            int i9 = ea2.i(g2, "id");
            int i10 = ea2.i(g2, "state");
            int i11 = ea2.i(g2, "worker_class_name");
            int i12 = ea2.i(g2, "input_merger_class_name");
            int i13 = ea2.i(g2, "input");
            int i14 = ea2.i(g2, "output");
            em0Var = a2;
            try {
                int i15 = ea2.i(g2, "initial_delay");
                int i16 = ea2.i(g2, "interval_duration");
                int i17 = ea2.i(g2, "flex_duration");
                int i18 = ea2.i(g2, "run_attempt_count");
                int i19 = ea2.i(g2, "backoff_policy");
                int i20 = ea2.i(g2, "backoff_delay_duration");
                int i21 = ea2.i(g2, "period_start_time");
                int i22 = ea2.i(g2, "minimum_retention_duration");
                int i23 = ea2.i(g2, "schedule_requested_at");
                int i24 = ea2.i(g2, "run_in_foreground");
                int i25 = ea2.i(g2, "out_of_quota_policy");
                int i26 = i14;
                ArrayList arrayList = new ArrayList(g2.getCount());
                while (g2.moveToNext()) {
                    String string = g2.getString(i9);
                    int i27 = i9;
                    String string2 = g2.getString(i11);
                    int i28 = i11;
                    sf sfVar = new sf();
                    int i29 = i;
                    sfVar.a = s71.c(g2.getInt(i));
                    if (g2.getInt(i2) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    sfVar.b = z;
                    if (g2.getInt(i3) != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    sfVar.c = z2;
                    if (g2.getInt(i4) != 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    sfVar.d = z3;
                    if (g2.getInt(i5) != 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    sfVar.e = z4;
                    int i30 = i2;
                    sfVar.f = g2.getLong(i6);
                    sfVar.g = g2.getLong(i7);
                    sfVar.h = s71.a(g2.getBlob(i8));
                    l71 l71Var = new l71(string, string2);
                    l71Var.b = s71.e(g2.getInt(i10));
                    l71Var.d = g2.getString(i12);
                    l71Var.e = androidx.work.b.a(g2.getBlob(i13));
                    int i31 = i26;
                    l71Var.f = androidx.work.b.a(g2.getBlob(i31));
                    int i32 = i13;
                    i26 = i31;
                    int i33 = i15;
                    l71Var.g = g2.getLong(i33);
                    i15 = i33;
                    int i34 = i3;
                    int i35 = i16;
                    l71Var.h = g2.getLong(i35);
                    i16 = i35;
                    int i36 = i17;
                    l71Var.i = g2.getLong(i36);
                    int i37 = i18;
                    l71Var.k = g2.getInt(i37);
                    int i38 = i19;
                    i18 = i37;
                    l71Var.l = s71.b(g2.getInt(i38));
                    i17 = i36;
                    int i39 = i20;
                    l71Var.m = g2.getLong(i39);
                    i20 = i39;
                    int i40 = i21;
                    l71Var.n = g2.getLong(i40);
                    i21 = i40;
                    int i41 = i22;
                    l71Var.o = g2.getLong(i41);
                    i22 = i41;
                    int i42 = i23;
                    l71Var.p = g2.getLong(i42);
                    int i43 = i24;
                    if (g2.getInt(i43) != 0) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    l71Var.q = z5;
                    int i44 = i25;
                    i24 = i43;
                    l71Var.r = s71.d(g2.getInt(i44));
                    l71Var.j = sfVar;
                    arrayList.add(l71Var);
                    i25 = i44;
                    i23 = i42;
                    i13 = i32;
                    i9 = i27;
                    i11 = i28;
                    i = i29;
                    i2 = i30;
                    i19 = i38;
                    i3 = i34;
                }
                g2.close();
                em0Var.F();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                g2.close();
                em0Var.F();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            em0Var = a2;
        }
    }

    public final ArrayList e() {
        em0 em0Var;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        em0 a2 = em0.a(0, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 AND schedule_requested_at<>-1");
        this.a.b();
        Cursor g2 = this.a.g(a2);
        try {
            int i = ea2.i(g2, "required_network_type");
            int i2 = ea2.i(g2, "requires_charging");
            int i3 = ea2.i(g2, "requires_device_idle");
            int i4 = ea2.i(g2, "requires_battery_not_low");
            int i5 = ea2.i(g2, "requires_storage_not_low");
            int i6 = ea2.i(g2, "trigger_content_update_delay");
            int i7 = ea2.i(g2, "trigger_max_content_delay");
            int i8 = ea2.i(g2, "content_uri_triggers");
            int i9 = ea2.i(g2, "id");
            int i10 = ea2.i(g2, "state");
            int i11 = ea2.i(g2, "worker_class_name");
            int i12 = ea2.i(g2, "input_merger_class_name");
            int i13 = ea2.i(g2, "input");
            int i14 = ea2.i(g2, "output");
            em0Var = a2;
            try {
                int i15 = ea2.i(g2, "initial_delay");
                int i16 = ea2.i(g2, "interval_duration");
                int i17 = ea2.i(g2, "flex_duration");
                int i18 = ea2.i(g2, "run_attempt_count");
                int i19 = ea2.i(g2, "backoff_policy");
                int i20 = ea2.i(g2, "backoff_delay_duration");
                int i21 = ea2.i(g2, "period_start_time");
                int i22 = ea2.i(g2, "minimum_retention_duration");
                int i23 = ea2.i(g2, "schedule_requested_at");
                int i24 = ea2.i(g2, "run_in_foreground");
                int i25 = ea2.i(g2, "out_of_quota_policy");
                int i26 = i14;
                ArrayList arrayList = new ArrayList(g2.getCount());
                while (g2.moveToNext()) {
                    String string = g2.getString(i9);
                    int i27 = i9;
                    String string2 = g2.getString(i11);
                    int i28 = i11;
                    sf sfVar = new sf();
                    int i29 = i;
                    sfVar.a = s71.c(g2.getInt(i));
                    if (g2.getInt(i2) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    sfVar.b = z;
                    if (g2.getInt(i3) != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    sfVar.c = z2;
                    if (g2.getInt(i4) != 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    sfVar.d = z3;
                    if (g2.getInt(i5) != 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    sfVar.e = z4;
                    int i30 = i2;
                    sfVar.f = g2.getLong(i6);
                    sfVar.g = g2.getLong(i7);
                    sfVar.h = s71.a(g2.getBlob(i8));
                    l71 l71Var = new l71(string, string2);
                    l71Var.b = s71.e(g2.getInt(i10));
                    l71Var.d = g2.getString(i12);
                    l71Var.e = androidx.work.b.a(g2.getBlob(i13));
                    int i31 = i26;
                    l71Var.f = androidx.work.b.a(g2.getBlob(i31));
                    int i32 = i13;
                    i26 = i31;
                    int i33 = i15;
                    l71Var.g = g2.getLong(i33);
                    i15 = i33;
                    int i34 = i3;
                    int i35 = i16;
                    l71Var.h = g2.getLong(i35);
                    i16 = i35;
                    int i36 = i17;
                    l71Var.i = g2.getLong(i36);
                    int i37 = i18;
                    l71Var.k = g2.getInt(i37);
                    int i38 = i19;
                    i18 = i37;
                    l71Var.l = s71.b(g2.getInt(i38));
                    i17 = i36;
                    int i39 = i20;
                    l71Var.m = g2.getLong(i39);
                    i20 = i39;
                    int i40 = i21;
                    l71Var.n = g2.getLong(i40);
                    i21 = i40;
                    int i41 = i22;
                    l71Var.o = g2.getLong(i41);
                    i22 = i41;
                    int i42 = i23;
                    l71Var.p = g2.getLong(i42);
                    int i43 = i24;
                    if (g2.getInt(i43) != 0) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    l71Var.q = z5;
                    int i44 = i25;
                    i24 = i43;
                    l71Var.r = s71.d(g2.getInt(i44));
                    l71Var.j = sfVar;
                    arrayList.add(l71Var);
                    i25 = i44;
                    i23 = i42;
                    i13 = i32;
                    i9 = i27;
                    i11 = i28;
                    i = i29;
                    i2 = i30;
                    i19 = i38;
                    i3 = i34;
                }
                g2.close();
                em0Var.F();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                g2.close();
                em0Var.F();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            em0Var = a2;
        }
    }

    public final y61 f(String str) {
        em0 a2 = em0.a(1, "SELECT state FROM workspec WHERE id=?");
        if (str == null) {
            a2.y(1);
        } else {
            a2.E(1, str);
        }
        this.a.b();
        y61 y61Var = null;
        Cursor g2 = this.a.g(a2);
        try {
            if (g2.moveToFirst()) {
                y61Var = s71.e(g2.getInt(0));
            }
            return y61Var;
        } finally {
            g2.close();
            a2.F();
        }
    }

    public final ArrayList g(String str) {
        em0 a2 = em0.a(1, "SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)");
        if (str == null) {
            a2.y(1);
        } else {
            a2.E(1, str);
        }
        this.a.b();
        Cursor g2 = this.a.g(a2);
        try {
            ArrayList arrayList = new ArrayList(g2.getCount());
            while (g2.moveToNext()) {
                arrayList.add(g2.getString(0));
            }
            return arrayList;
        } finally {
            g2.close();
            a2.F();
        }
    }

    public final ArrayList h(String str) {
        em0 a2 = em0.a(1, "SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM worktag WHERE tag=?)");
        if (str == null) {
            a2.y(1);
        } else {
            a2.E(1, str);
        }
        this.a.b();
        Cursor g2 = this.a.g(a2);
        try {
            ArrayList arrayList = new ArrayList(g2.getCount());
            while (g2.moveToNext()) {
                arrayList.add(g2.getString(0));
            }
            return arrayList;
        } finally {
            g2.close();
            a2.F();
        }
    }

    public final l71 i(String str) {
        em0 em0Var;
        l71 l71Var;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        em0 a2 = em0.a(1, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE id=?");
        if (str == null) {
            a2.y(1);
        } else {
            a2.E(1, str);
        }
        this.a.b();
        Cursor g2 = this.a.g(a2);
        try {
            int i = ea2.i(g2, "required_network_type");
            int i2 = ea2.i(g2, "requires_charging");
            int i3 = ea2.i(g2, "requires_device_idle");
            int i4 = ea2.i(g2, "requires_battery_not_low");
            int i5 = ea2.i(g2, "requires_storage_not_low");
            int i6 = ea2.i(g2, "trigger_content_update_delay");
            int i7 = ea2.i(g2, "trigger_max_content_delay");
            int i8 = ea2.i(g2, "content_uri_triggers");
            int i9 = ea2.i(g2, "id");
            int i10 = ea2.i(g2, "state");
            int i11 = ea2.i(g2, "worker_class_name");
            int i12 = ea2.i(g2, "input_merger_class_name");
            int i13 = ea2.i(g2, "input");
            int i14 = ea2.i(g2, "output");
            em0Var = a2;
            try {
                int i15 = ea2.i(g2, "initial_delay");
                int i16 = ea2.i(g2, "interval_duration");
                int i17 = ea2.i(g2, "flex_duration");
                int i18 = ea2.i(g2, "run_attempt_count");
                int i19 = ea2.i(g2, "backoff_policy");
                int i20 = ea2.i(g2, "backoff_delay_duration");
                int i21 = ea2.i(g2, "period_start_time");
                int i22 = ea2.i(g2, "minimum_retention_duration");
                int i23 = ea2.i(g2, "schedule_requested_at");
                int i24 = ea2.i(g2, "run_in_foreground");
                int i25 = ea2.i(g2, "out_of_quota_policy");
                if (g2.moveToFirst()) {
                    String string = g2.getString(i9);
                    String string2 = g2.getString(i11);
                    sf sfVar = new sf();
                    sfVar.a = s71.c(g2.getInt(i));
                    if (g2.getInt(i2) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    sfVar.b = z;
                    if (g2.getInt(i3) != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    sfVar.c = z2;
                    if (g2.getInt(i4) != 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    sfVar.d = z3;
                    if (g2.getInt(i5) != 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    sfVar.e = z4;
                    sfVar.f = g2.getLong(i6);
                    sfVar.g = g2.getLong(i7);
                    sfVar.h = s71.a(g2.getBlob(i8));
                    l71Var = new l71(string, string2);
                    l71Var.b = s71.e(g2.getInt(i10));
                    l71Var.d = g2.getString(i12);
                    l71Var.e = androidx.work.b.a(g2.getBlob(i13));
                    l71Var.f = androidx.work.b.a(g2.getBlob(i14));
                    l71Var.g = g2.getLong(i15);
                    l71Var.h = g2.getLong(i16);
                    l71Var.i = g2.getLong(i17);
                    l71Var.k = g2.getInt(i18);
                    l71Var.l = s71.b(g2.getInt(i19));
                    l71Var.m = g2.getLong(i20);
                    l71Var.n = g2.getLong(i21);
                    l71Var.o = g2.getLong(i22);
                    l71Var.p = g2.getLong(i23);
                    if (g2.getInt(i24) != 0) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    l71Var.q = z5;
                    l71Var.r = s71.d(g2.getInt(i25));
                    l71Var.j = sfVar;
                } else {
                    l71Var = null;
                }
                g2.close();
                em0Var.F();
                return l71Var;
            } catch (Throwable th) {
                th = th;
                g2.close();
                em0Var.F();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            em0Var = a2;
        }
    }

    public final ArrayList j(String str) {
        em0 a2 = em0.a(1, "SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)");
        if (str == null) {
            a2.y(1);
        } else {
            a2.E(1, str);
        }
        this.a.b();
        Cursor g2 = this.a.g(a2);
        try {
            int i = ea2.i(g2, "id");
            int i2 = ea2.i(g2, "state");
            ArrayList arrayList = new ArrayList(g2.getCount());
            while (g2.moveToNext()) {
                l71.a aVar = new l71.a();
                aVar.a = g2.getString(i);
                aVar.b = s71.e(g2.getInt(i2));
                arrayList.add(aVar);
            }
            return arrayList;
        } finally {
            g2.close();
            a2.F();
        }
    }

    public final int k(String str) {
        this.a.b();
        is a2 = this.f.a();
        if (str == null) {
            a2.t(1);
        } else {
            a2.y(1, str);
        }
        this.a.c();
        try {
            int E = a2.E();
            this.a.h();
            return E;
        } finally {
            this.a.f();
            this.f.c(a2);
        }
    }

    public final int l(String str, long j) {
        this.a.b();
        is a2 = this.h.a();
        a2.g(j, 1);
        if (str == null) {
            a2.t(2);
        } else {
            a2.y(2, str);
        }
        this.a.c();
        try {
            int E = a2.E();
            this.a.h();
            return E;
        } finally {
            this.a.f();
            this.h.c(a2);
        }
    }

    public final int m(String str) {
        this.a.b();
        is a2 = this.g.a();
        if (str == null) {
            a2.t(1);
        } else {
            a2.y(1, str);
        }
        this.a.c();
        try {
            int E = a2.E();
            this.a.h();
            return E;
        } finally {
            this.a.f();
            this.g.c(a2);
        }
    }

    public final void n(String str, androidx.work.b bVar) {
        this.a.b();
        is a2 = this.d.a();
        byte[] b2 = androidx.work.b.b(bVar);
        if (b2 == null) {
            a2.t(1);
        } else {
            a2.a(b2, 1);
        }
        if (str == null) {
            a2.t(2);
        } else {
            a2.y(2, str);
        }
        this.a.c();
        try {
            a2.E();
            this.a.h();
        } finally {
            this.a.f();
            this.d.c(a2);
        }
    }

    public final void o(String str, long j) {
        this.a.b();
        is a2 = this.e.a();
        a2.g(j, 1);
        if (str == null) {
            a2.t(2);
        } else {
            a2.y(2, str);
        }
        this.a.c();
        try {
            a2.E();
            this.a.h();
        } finally {
            this.a.f();
            this.e.c(a2);
        }
    }

    public final int p(y61 y61Var, String... strArr) {
        this.a.b();
        StringBuilder sb = new StringBuilder();
        sb.append("UPDATE workspec SET state=");
        sb.append("?");
        sb.append(" WHERE id IN (");
        int length = strArr.length;
        for (int i = 0; i < length; i++) {
            sb.append("?");
            if (i < length - 1) {
                sb.append(",");
            }
        }
        sb.append(")");
        String sb2 = sb.toString();
        bm0 bm0Var = this.a;
        bm0Var.a();
        bm0Var.b();
        is isVar = new is(((es) bm0Var.c.x()).P.compileStatement(sb2));
        isVar.g(s71.f(y61Var), 1);
        int i2 = 2;
        for (String str : strArr) {
            if (str == null) {
                isVar.t(i2);
            } else {
                isVar.y(i2, str);
            }
            i2++;
        }
        this.a.c();
        try {
            int E = isVar.E();
            this.a.h();
            return E;
        } finally {
            this.a.f();
        }
    }
}