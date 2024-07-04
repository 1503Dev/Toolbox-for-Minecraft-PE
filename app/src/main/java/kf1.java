package defpackage;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.RandomAccessFile;
import java.util.LinkedList;
import java.util.zip.GZIPInputStream;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: kf1  reason: default package */
public final class kf1 {
    public LinkedList<Runnable> a = new LinkedList<>();
    public boolean b;

    /* renamed from: kf1$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class a implements zc1 {

        /* renamed from: kf1$a$a  reason: collision with other inner class name */
        /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
        public class RunnableC0042a implements Runnable {
            public final /* synthetic */ rc1 P;

            public RunnableC0042a(rc1 rc1Var) {
                this.P = rc1Var;
            }

            @Override // java.lang.Runnable
            public final void run() {
                kf1 kf1Var = kf1.this;
                rc1 rc1Var = this.P;
                kf1Var.getClass();
                ic1 ic1Var = rc1Var.b;
                String q = ic1Var.q("filepath");
                String q2 = ic1Var.q("data");
                boolean equals = ic1Var.q("encoding").equals("utf8");
                ga1.h().r().c();
                ic1 ic1Var2 = new ic1();
                try {
                    kf1.b(q, equals, q2);
                    eb1.m(ic1Var2, "success", true);
                    rc1Var.a(ic1Var2).b();
                } catch (IOException unused) {
                    eb1.m(ic1Var2, "success", false);
                    rc1Var.a(ic1Var2).b();
                }
                kf1.c(kf1.this);
            }
        }

        public a() {
        }

        @Override // defpackage.zc1
        public final void a(rc1 rc1Var) {
            kf1.d(kf1.this, new RunnableC0042a(rc1Var));
        }
    }

    /* renamed from: kf1$b */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class b implements zc1 {

        /* renamed from: kf1$b$a */
        /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
        public class a implements Runnable {
            public final /* synthetic */ rc1 P;

            public a(rc1 rc1Var) {
                this.P = rc1Var;
            }

            @Override // java.lang.Runnable
            public final void run() {
                File file = new File(this.P.b.q("filepath"));
                kf1 kf1Var = kf1.this;
                rc1 rc1Var = this.P;
                kf1Var.getClass();
                ga1.h().r().c();
                ic1 ic1Var = new ic1();
                eb1.m(ic1Var, "success", kf1.e(file));
                rc1Var.a(ic1Var).b();
                kf1.c(kf1.this);
            }
        }

        public b() {
        }

        @Override // defpackage.zc1
        public final void a(rc1 rc1Var) {
            kf1.d(kf1.this, new a(rc1Var));
        }
    }

    /* renamed from: kf1$c */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class c implements zc1 {

        /* renamed from: kf1$c$a */
        /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
        public class a implements Runnable {
            public final /* synthetic */ rc1 P;

            public a(rc1 rc1Var) {
                this.P = rc1Var;
            }

            @Override // java.lang.Runnable
            public final void run() {
                kf1 kf1Var = kf1.this;
                rc1 rc1Var = this.P;
                kf1Var.getClass();
                String q = rc1Var.b.q("filepath");
                ga1.h().r().c();
                ic1 ic1Var = new ic1();
                String[] list = new File(q).list();
                if (list != null) {
                    nr nrVar = new nr();
                    for (String str : list) {
                        ic1 ic1Var2 = new ic1();
                        eb1.j(ic1Var2, "filename", str);
                        if (new File(k6.b(q, str)).isDirectory()) {
                            eb1.m(ic1Var2, "is_folder", true);
                        } else {
                            eb1.m(ic1Var2, "is_folder", false);
                        }
                        nrVar.a(ic1Var2);
                    }
                    eb1.m(ic1Var, "success", true);
                    eb1.h(ic1Var, "entries", nrVar);
                } else {
                    eb1.m(ic1Var, "success", false);
                }
                rc1Var.a(ic1Var).b();
                kf1.c(kf1.this);
            }
        }

        public c() {
        }

        @Override // defpackage.zc1
        public final void a(rc1 rc1Var) {
            kf1.d(kf1.this, new a(rc1Var));
        }
    }

    /* renamed from: kf1$d */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class d implements zc1 {

        /* renamed from: kf1$d$a */
        /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
        public class a implements Runnable {
            public final /* synthetic */ rc1 P;

            public a(rc1 rc1Var) {
                this.P = rc1Var;
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean z;
                kf1 kf1Var = kf1.this;
                rc1 rc1Var = this.P;
                kf1Var.getClass();
                ic1 ic1Var = rc1Var.b;
                String q = ic1Var.q("filepath");
                String q2 = ic1Var.q("encoding");
                if (q2 != null && q2.equals("utf8")) {
                    z = true;
                } else {
                    z = false;
                }
                ga1.h().r().c();
                ic1 ic1Var2 = new ic1();
                try {
                    StringBuilder a = kf1.a(q, z);
                    eb1.m(ic1Var2, "success", true);
                    eb1.j(ic1Var2, "data", a.toString());
                    rc1Var.a(ic1Var2).b();
                } catch (IOException unused) {
                    eb1.m(ic1Var2, "success", false);
                    rc1Var.a(ic1Var2).b();
                }
                kf1.c(kf1.this);
            }
        }

        public d() {
        }

        @Override // defpackage.zc1
        public final void a(rc1 rc1Var) {
            kf1.d(kf1.this, new a(rc1Var));
        }
    }

    /* renamed from: kf1$e */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class e implements zc1 {

        /* renamed from: kf1$e$a */
        /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
        public class a implements Runnable {
            public final /* synthetic */ rc1 P;

            public a(rc1 rc1Var) {
                this.P = rc1Var;
            }

            @Override // java.lang.Runnable
            public final void run() {
                kf1 kf1Var = kf1.this;
                rc1 rc1Var = this.P;
                kf1Var.getClass();
                ic1 ic1Var = rc1Var.b;
                String q = ic1Var.q("filepath");
                String q2 = ic1Var.q("new_filepath");
                ga1.h().r().c();
                ic1 ic1Var2 = new ic1();
                try {
                    if (new File(q).renameTo(new File(q2))) {
                        eb1.m(ic1Var2, "success", true);
                    } else {
                        eb1.m(ic1Var2, "success", false);
                    }
                    rc1Var.a(ic1Var2).b();
                } catch (Exception unused) {
                    eb1.m(ic1Var2, "success", false);
                    rc1Var.a(ic1Var2).b();
                }
                kf1.c(kf1.this);
            }
        }

        public e() {
        }

        @Override // defpackage.zc1
        public final void a(rc1 rc1Var) {
            kf1.d(kf1.this, new a(rc1Var));
        }
    }

    /* renamed from: kf1$f */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class f implements zc1 {

        /* renamed from: kf1$f$a */
        /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
        public class a implements Runnable {
            public final /* synthetic */ rc1 P;

            public a(rc1 rc1Var) {
                this.P = rc1Var;
            }

            @Override // java.lang.Runnable
            public final void run() {
                kf1 kf1Var = kf1.this;
                rc1 rc1Var = this.P;
                kf1Var.getClass();
                String q = rc1Var.b.q("filepath");
                ga1.h().r().c();
                ic1 ic1Var = new ic1();
                try {
                    eb1.m(ic1Var, "result", new File(q).exists());
                    eb1.m(ic1Var, "success", true);
                    rc1Var.a(ic1Var).b();
                } catch (Exception e) {
                    eb1.m(ic1Var, "result", false);
                    eb1.m(ic1Var, "success", false);
                    rc1Var.a(ic1Var).b();
                    e.printStackTrace();
                }
                kf1.c(kf1.this);
            }
        }

        public f() {
        }

        @Override // defpackage.zc1
        public final void a(rc1 rc1Var) {
            kf1.d(kf1.this, new a(rc1Var));
        }
    }

    /* renamed from: kf1$g */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class g implements zc1 {

        /* renamed from: kf1$g$a */
        /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
        public class a implements Runnable {
            public final /* synthetic */ rc1 P;

            public a(rc1 rc1Var) {
                this.P = rc1Var;
            }

            @Override // java.lang.Runnable
            public final void run() {
                kf1 kf1Var = kf1.this;
                rc1 rc1Var = this.P;
                kf1Var.getClass();
                ic1 ic1Var = rc1Var.b;
                String q = ic1Var.q("filepath");
                ga1.h().r().c();
                ic1 ic1Var2 = new ic1();
                try {
                    int l = ic1Var.l("offset");
                    int l2 = ic1Var.l("size");
                    boolean j = ic1Var.j("gunzip");
                    String q2 = ic1Var.q("output_filepath");
                    InputStream lf1Var = new lf1(new FileInputStream(q), l, l2);
                    if (j) {
                        lf1Var = new GZIPInputStream(lf1Var, 1024);
                    }
                    if (q2.equals("")) {
                        StringBuilder sb = new StringBuilder(lf1Var.available());
                        byte[] bArr = new byte[1024];
                        while (true) {
                            int read = lf1Var.read(bArr, 0, 1024);
                            if (read < 0) {
                                break;
                            }
                            sb.append(new String(bArr, 0, read, "ISO-8859-1"));
                        }
                        eb1.l(sb.length(), ic1Var2, "size");
                        eb1.j(ic1Var2, "data", sb.toString());
                    } else {
                        FileOutputStream fileOutputStream = new FileOutputStream(q2);
                        byte[] bArr2 = new byte[1024];
                        int i = 0;
                        while (true) {
                            int read2 = lf1Var.read(bArr2, 0, 1024);
                            if (read2 < 0) {
                                break;
                            }
                            fileOutputStream.write(bArr2, 0, read2);
                            i += read2;
                        }
                        fileOutputStream.close();
                        eb1.l(i, ic1Var2, "size");
                    }
                    lf1Var.close();
                    eb1.m(ic1Var2, "success", true);
                    rc1Var.a(ic1Var2).b();
                } catch (IOException unused) {
                    eb1.m(ic1Var2, "success", false);
                    rc1Var.a(ic1Var2).b();
                    kf1.c(kf1.this);
                } catch (OutOfMemoryError unused2) {
                    ga1.h().n().d(0, 0, "Out of memory error - disabling AdColony.", false);
                    ga1.h().j();
                    eb1.m(ic1Var2, "success", false);
                    rc1Var.a(ic1Var2).b();
                    kf1.c(kf1.this);
                }
                kf1.c(kf1.this);
            }
        }

        public g() {
        }

        @Override // defpackage.zc1
        public final void a(rc1 rc1Var) {
            kf1.d(kf1.this, new a(rc1Var));
        }
    }

    /* renamed from: kf1$h */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class h implements zc1 {

        /* renamed from: kf1$h$a */
        /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
        public class a implements Runnable {
            public final /* synthetic */ rc1 P;

            public a(rc1 rc1Var) {
                this.P = rc1Var;
            }

            @Override // java.lang.Runnable
            public final void run() {
                kf1 kf1Var = kf1.this;
                rc1 rc1Var = this.P;
                kf1Var.getClass();
                ic1 ic1Var = rc1Var.b;
                String q = ic1Var.q("filepath");
                String q2 = ic1Var.q("bundle_path");
                nr c = eb1.c(ic1Var, "bundle_filenames");
                ga1.h().r().c();
                ic1 ic1Var2 = new ic1();
                try {
                    File file = new File(q2);
                    RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
                    byte[] bArr = new byte[32];
                    randomAccessFile.readInt();
                    int readInt = randomAccessFile.readInt();
                    nr nrVar = new nr();
                    byte[] bArr2 = new byte[1024];
                    int i = 0;
                    while (i < readInt) {
                        randomAccessFile.seek((i * 44) + 8);
                        randomAccessFile.read(bArr);
                        randomAccessFile.readInt();
                        int readInt2 = randomAccessFile.readInt();
                        int readInt3 = randomAccessFile.readInt();
                        nrVar.h(readInt3);
                        byte[] bArr3 = bArr;
                        try {
                            StringBuilder sb = new StringBuilder();
                            sb.append(q);
                            String str = q;
                            sb.append(((JSONArray) c.b).get(i));
                            String sb2 = sb.toString();
                            int i2 = readInt;
                            randomAccessFile.seek(readInt2);
                            FileOutputStream fileOutputStream = new FileOutputStream(sb2);
                            int i3 = readInt3 / 1024;
                            int i4 = readInt3 % 1024;
                            int i5 = 0;
                            while (i5 < i3) {
                                randomAccessFile.read(bArr2, 0, 1024);
                                fileOutputStream.write(bArr2, 0, 1024);
                                i5++;
                                c = c;
                            }
                            randomAccessFile.read(bArr2, 0, i4);
                            fileOutputStream.write(bArr2, 0, i4);
                            fileOutputStream.close();
                            i++;
                            bArr = bArr3;
                            q = str;
                            readInt = i2;
                            c = c;
                        } catch (JSONException unused) {
                            ga1.h().n().d(0, 0, "Couldn't extract file name at index " + i + " unpacking ad unit bundle at " + q2, false);
                            eb1.m(ic1Var2, "success", false);
                        }
                    }
                    randomAccessFile.close();
                    file.delete();
                    eb1.m(ic1Var2, "success", true);
                    eb1.h(ic1Var2, "file_sizes", nrVar);
                    rc1Var.a(ic1Var2).b();
                } catch (IOException unused2) {
                    t1.b(0, 0, k6.b("Failed to find or open ad unit bundle at path: ", q2), true);
                    eb1.m(ic1Var2, "success", false);
                    rc1Var.a(ic1Var2).b();
                    kf1.c(kf1.this);
                } catch (OutOfMemoryError unused3) {
                    ga1.h().n().d(0, 0, "Out of memory error - disabling AdColony.", false);
                    ga1.h().j();
                    eb1.m(ic1Var2, "success", false);
                    rc1Var.a(ic1Var2).b();
                    kf1.c(kf1.this);
                }
                kf1.c(kf1.this);
            }
        }

        public h() {
        }

        @Override // defpackage.zc1
        public final void a(rc1 rc1Var) {
            kf1.d(kf1.this, new a(rc1Var));
        }
    }

    /* renamed from: kf1$i */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class i implements zc1 {

        /* renamed from: kf1$i$a */
        /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
        public class a implements Runnable {
            public final /* synthetic */ rc1 P;

            public a(rc1 rc1Var) {
                this.P = rc1Var;
            }

            @Override // java.lang.Runnable
            public final void run() {
                kf1 kf1Var = kf1.this;
                rc1 rc1Var = this.P;
                kf1Var.getClass();
                String q = rc1Var.b.q("filepath");
                ga1.h().r().c();
                ic1 ic1Var = new ic1();
                try {
                    if (new File(q).mkdir()) {
                        eb1.m(ic1Var, "success", true);
                        rc1Var.a(ic1Var).b();
                    } else {
                        eb1.m(ic1Var, "success", false);
                    }
                } catch (Exception unused) {
                    eb1.m(ic1Var, "success", false);
                    rc1Var.a(ic1Var).b();
                }
                kf1.c(kf1.this);
            }
        }

        public i() {
        }

        @Override // defpackage.zc1
        public final void a(rc1 rc1Var) {
            kf1.d(kf1.this, new a(rc1Var));
        }
    }

    public static StringBuilder a(String str, boolean z) {
        File file = new File(str);
        StringBuilder sb = new StringBuilder((int) file.length());
        BufferedReader bufferedReader = new BufferedReader(z ? new InputStreamReader(new FileInputStream(file.getAbsolutePath()), sc1.a) : new InputStreamReader(new FileInputStream(file.getAbsolutePath())));
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                bufferedReader.close();
                return sb;
            }
            sb.append(readLine);
            sb.append("\n");
        }
    }

    public static void b(String str, boolean z, String str2) {
        BufferedWriter bufferedWriter = z ? new BufferedWriter(new OutputStreamWriter(new FileOutputStream(str), sc1.a)) : new BufferedWriter(new OutputStreamWriter(new FileOutputStream(str)));
        bufferedWriter.write(str2);
        bufferedWriter.flush();
        bufferedWriter.close();
    }

    public static void c(kf1 kf1Var) {
        kf1Var.b = false;
        if (!kf1Var.a.isEmpty()) {
            kf1Var.b = true;
            kf1Var.a.removeLast().run();
        }
    }

    public static void d(kf1 kf1Var, Runnable runnable) {
        if (kf1Var.a.isEmpty() && !kf1Var.b) {
            kf1Var.b = true;
            runnable.run();
            return;
        }
        kf1Var.a.push(runnable);
    }

    public static boolean e(File file) {
        try {
            if (file.isDirectory() && file.list().length != 0) {
                String[] list = file.list();
                if (list.length > 0) {
                    return e(new File(file, list[0]));
                }
                if (file.list().length == 0) {
                    return file.delete();
                }
                return false;
            }
            return file.delete();
        } catch (Exception unused) {
            return false;
        }
    }

    public final void f() {
        ga1.f("FileSystem.save", new a());
        ga1.f("FileSystem.delete", new b());
        ga1.f("FileSystem.listing", new c());
        ga1.f("FileSystem.load", new d());
        ga1.f("FileSystem.rename", new e());
        ga1.f("FileSystem.exists", new f());
        ga1.f("FileSystem.extract", new g());
        ga1.f("FileSystem.unpack_bundle", new h());
        ga1.f("FileSystem.create_directory", new i());
    }
}