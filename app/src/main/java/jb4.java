package defpackage;

import android.os.Bundle;

/* renamed from: jb4  reason: default package */
public final class jb4 implements mc4 {
    public cr4 a;
    public cr4 b;
    public boolean c;
    public boolean d;
    public final boolean e = false;
    public final boolean f;

    public jb4(cr4 cr4Var, cr4 cr4Var2, boolean z, boolean z2, boolean z3) {
        this.a = cr4Var;
        this.b = cr4Var2;
        this.c = z;
        this.d = z2;
        this.f = z3;
    }

    public jb4(boolean z) {
        this.f = z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003c, code lost:
        if (((java.lang.Boolean) defpackage.w82.d.c.a(defpackage.x92.p2)).booleanValue() != false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003e, code lost:
        r2 = r10.a;
        r7 = r2.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0042, code lost:
        if (r7 == null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0048, code lost:
        if (r2.b < 0) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004a, code lost:
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004c, code lost:
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004d, code lost:
        if (r2 == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004f, code lost:
        r1.putString("paidv1_id_android", r7);
        r1.putLong("paidv1_creation_time_android", r10.a.b);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0071, code lost:
        if (((java.lang.Boolean) defpackage.w82.d.c.a(defpackage.x92.o2)).booleanValue() == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0087, code lost:
        if (((java.lang.Boolean) defpackage.w82.d.c.a(defpackage.x92.q2)).booleanValue() != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0089, code lost:
        r2 = r10.b;
        r7 = r2.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x008d, code lost:
        if (r7 == null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0093, code lost:
        if (r2.b < 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0096, code lost:
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0097, code lost:
        if (r3 == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0099, code lost:
        r1.putString("paidv2_id_android", r7);
        r1.putLong("paidv2_creation_time_android", r10.b.b);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a7, code lost:
        r1.putBoolean("paidv2_pub_option_android", r10.c);
        r1.putBoolean("paidv2_user_option_android", r10.d);
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0026, code lost:
        if (((java.lang.Boolean) defpackage.w82.d.c.a(defpackage.x92.n2)).booleanValue() == false) goto L37;
     */
    @Override // defpackage.mc4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(Object obj) {
        Bundle bundle = (Bundle) obj;
        if (!this.e) {
            Bundle a = hj4.a(bundle, "pii");
            boolean z = true;
            if (!this.f) {
            }
            if (this.f) {
            }
            if (!this.f) {
            }
            if (this.f) {
            }
            if (!a.isEmpty()) {
                bundle.putBundle("pii", a);
            }
        }
    }
}