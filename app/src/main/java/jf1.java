package defpackage;

import android.content.Context;
import android.os.StatFs;
import java.io.File;

/* renamed from: jf1  reason: default package */
public final class jf1 {
    public String a;
    public String b;
    public String c;
    public String d;
    public File e;
    public File f;
    public File g;

    public final void a() {
        String absolutePath;
        double d;
        ad1 h = ga1.h();
        StringBuilder sb = new StringBuilder();
        Context context = ga1.P;
        String str = "";
        if (context == null) {
            absolutePath = "";
        } else {
            absolutePath = context.getFilesDir().getAbsolutePath();
        }
        this.a = qq.d(sb, absolutePath, "/adc3/");
        this.b = qq.d(new StringBuilder(), this.a, "media/");
        File file = new File(this.b);
        this.e = file;
        if (!file.isDirectory()) {
            this.e.delete();
            this.e.mkdirs();
        }
        if (!this.e.isDirectory()) {
            h.j();
            return;
        }
        try {
            StatFs statFs = new StatFs(this.b);
            d = statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong();
        } catch (RuntimeException unused) {
            d = 0.0d;
        }
        if (d < 2.097152E7d) {
            ga1.h().n().d(0, 1, "Not enough memory available at media path, disabling AdColony.", false);
            h.j();
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        Context context2 = ga1.P;
        if (context2 != null) {
            str = context2.getFilesDir().getAbsolutePath();
        }
        this.c = qq.d(sb2, str, "/adc3/data/");
        File file2 = new File(this.c);
        this.f = file2;
        if (!file2.isDirectory()) {
            this.f.delete();
        }
        this.f.mkdirs();
        this.d = qq.d(new StringBuilder(), this.a, "tmp/");
        File file3 = new File(this.d);
        this.g = file3;
        if (!file3.isDirectory()) {
            this.g.delete();
            this.g.mkdirs();
        }
    }

    public final ic1 b() {
        if (new File(qq.d(new StringBuilder(), this.a, "AppVersion")).exists()) {
            return eb1.n(this.a + "AppVersion");
        }
        return new ic1();
    }

    public final void c() {
        File file = this.e;
        if (file == null || this.f == null || this.g == null) {
            return;
        }
        if (!file.isDirectory()) {
            this.e.delete();
        }
        if (!this.f.isDirectory()) {
            this.f.delete();
        }
        if (!this.g.isDirectory()) {
            this.g.delete();
        }
        this.e.mkdirs();
        this.f.mkdirs();
        this.g.mkdirs();
    }
}