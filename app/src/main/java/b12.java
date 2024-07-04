package defpackage;

import android.content.Context;
import android.content.pm.ApkChecksum;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager$OnChecksumsReadyListener;
import android.os.Build;
import java.io.ByteArrayInputStream;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: b12  reason: default package */
public final class b12 extends c22 {
    public static final d22 i = new d22();
    public final Context h;

    public b12(l02 l02Var, gx1 gx1Var, int i2, Context context) {
        super(l02Var, "AEKrzIydHngo8q7U2b8x25JI4cfZS+4qAP315Zd3WikH6poIulxYQwD/LrG8ezMS", "vKrEk100dPKKqaxICALjJbVlJ7Gg4dfwKwDEqSKZDKo=", gx1Var, i2, 27);
        this.h = context;
    }

    @Override // defpackage.c22
    public final void b() {
        int i2;
        boolean z;
        String str;
        uy1 uy1Var;
        AtomicReference n = i.n(this.h.getPackageName());
        synchronized (n) {
            uy1 uy1Var2 = (uy1) n.get();
            if (uy1Var2 == null || o02.b(uy1Var2.a) || uy1Var2.a.equals("E") || uy1Var2.a.equals("0000000000000000000000000000000000000000000000000000000000000000")) {
                String str2 = null;
                if (!o02.b(null)) {
                    i2 = 5;
                } else {
                    i2 = 3;
                }
                if (i2 == 3) {
                    z = true;
                } else {
                    z = false;
                }
                Boolean valueOf = Boolean.valueOf(z);
                l92 l92Var = x92.Q1;
                w82 w82Var = w82.d;
                Boolean bool = (Boolean) w82Var.c.a(l92Var);
                if (((Boolean) w82Var.c.a(x92.P1)).booleanValue()) {
                    str = d();
                } else {
                    str = null;
                }
                if (bool.booleanValue() && this.a.n && o02.b(str)) {
                    try {
                        Future future = this.a.k;
                        if (future != null) {
                            future.get();
                        }
                        ey1 ey1Var = this.a.j;
                        if (ey1Var != null && ey1Var.h0()) {
                            str = ey1Var.w0();
                        }
                    } catch (InterruptedException | ExecutionException unused) {
                    }
                    str = null;
                }
                uy1 uy1Var3 = new uy1((String) this.e.invoke(null, this.h, valueOf, str));
                if (o02.b(uy1Var3.a) || uy1Var3.a.equals("E")) {
                    int i3 = i2 - 1;
                    if (i3 != 3) {
                        if (i3 == 4) {
                            throw null;
                        }
                    } else {
                        try {
                            Future future2 = this.a.k;
                            if (future2 != null) {
                                future2.get();
                            }
                            ey1 ey1Var2 = this.a.j;
                            if (ey1Var2 != null && ey1Var2.h0()) {
                                str2 = ey1Var2.w0();
                            }
                        } catch (InterruptedException | ExecutionException unused2) {
                        }
                        if (!o02.b(str2)) {
                            uy1Var3.a = str2;
                        }
                    }
                }
                n.set(uy1Var3);
            }
            uy1Var = (uy1) n.get();
        }
        synchronized (this.d) {
            if (uy1Var != null) {
                try {
                    gx1 gx1Var = this.d;
                    String str3 = uy1Var.a;
                    gx1Var.j();
                    ey1.L0((ey1) gx1Var.Q, str3);
                    gx1 gx1Var2 = this.d;
                    long j = uy1Var.b;
                    gx1Var2.j();
                    ey1.y((ey1) gx1Var2.Q, j);
                    gx1 gx1Var3 = this.d;
                    String str4 = uy1Var.c;
                    gx1Var3.j();
                    ey1.x((ey1) gx1Var3.Q, str4);
                    gx1 gx1Var4 = this.d;
                    String str5 = uy1Var.d;
                    gx1Var4.j();
                    ey1.I((ey1) gx1Var4.Q, str5);
                    gx1 gx1Var5 = this.d;
                    String str6 = uy1Var.e;
                    gx1Var5.j();
                    ey1.J((ey1) gx1Var5.Q, str6);
                } finally {
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [e22] */
    public final String d() {
        ArrayList arrayList;
        Context context;
        String packageName;
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            p92 p92Var = x92.R1;
            w82 w82Var = w82.d;
            byte[] c = o02.c((String) w82Var.c.a(p92Var));
            arrayList = new ArrayList();
            arrayList.add(certificateFactory.generateCertificate(new ByteArrayInputStream(c)));
            if (!Build.TYPE.equals("user")) {
                arrayList.add(certificateFactory.generateCertificate(new ByteArrayInputStream(o02.c((String) w82Var.c.a(x92.S1)))));
            }
            context = this.h;
            packageName = context.getPackageName();
            this.a.getClass();
        } catch (PackageManager.NameNotFoundException | InterruptedException | NoClassDefFoundError | CertificateEncodingException | CertificateException | ExecutionException unused) {
        }
        if (Build.VERSION.SDK_INT > 30 || Build.VERSION.CODENAME.equals("S")) {
            final lz4 lz4Var = new lz4();
            context.getPackageManager().requestChecksums(packageName, false, 8, arrayList, new PackageManager$OnChecksumsReadyListener() { // from class: e22
                public final void onChecksumsReady(List list) {
                    lz4 lz4Var2 = lz4.this;
                    if (list == null) {
                        lz4Var2.h(null);
                        return;
                    }
                    try {
                        int size = list.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            ApkChecksum apkChecksum = (ApkChecksum) list.get(i2);
                            if (apkChecksum.getType() == 8) {
                                byte[] value = apkChecksum.getValue();
                                char[] cArr = o02.a;
                                int length = value.length;
                                char[] cArr2 = new char[length + length];
                                for (int i3 = 0; i3 < value.length; i3++) {
                                    int i4 = value[i3] & 255;
                                    char[] cArr3 = o02.a;
                                    int i5 = i3 + i3;
                                    cArr2[i5] = cArr3[i4 >>> 4];
                                    cArr2[i5 + 1] = cArr3[i4 & 15];
                                }
                                lz4Var2.h(new String(cArr2));
                                return;
                            }
                        }
                        lz4Var2.h(null);
                    } catch (Throwable unused2) {
                        lz4Var2.h(null);
                    }
                }
            });
            return (String) lz4Var.get();
        }
        return null;
    }
}