package defpackage;

import android.os.SystemClock;
import android.text.TextUtils;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: aw1  reason: default package */
public final class aw1 implements ou1 {
    public final zv1 c;
    public final LinkedHashMap a = new LinkedHashMap(16, 0.75f, true);
    public long b = 0;
    public final int d = 20971520;

    public aw1(File file) {
        this.c = new wv1(file);
    }

    public aw1(ln1 ln1Var) {
        this.c = ln1Var;
    }

    public static long d(InputStream inputStream) {
        return (k(inputStream) & 255) | ((k(inputStream) & 255) << 8) | ((k(inputStream) & 255) << 16) | ((k(inputStream) & 255) << 24) | ((k(inputStream) & 255) << 32) | ((k(inputStream) & 255) << 40) | ((k(inputStream) & 255) << 48) | ((k(inputStream) & 255) << 56);
    }

    public static String f(yv1 yv1Var) {
        return new String(j(yv1Var, d(yv1Var)), "UTF-8");
    }

    public static void g(BufferedOutputStream bufferedOutputStream, int i) {
        bufferedOutputStream.write(i & 255);
        bufferedOutputStream.write((i >> 8) & 255);
        bufferedOutputStream.write((i >> 16) & 255);
        bufferedOutputStream.write((i >> 24) & 255);
    }

    public static void h(BufferedOutputStream bufferedOutputStream, long j) {
        bufferedOutputStream.write((byte) j);
        bufferedOutputStream.write((byte) (j >>> 8));
        bufferedOutputStream.write((byte) (j >>> 16));
        bufferedOutputStream.write((byte) (j >>> 24));
        bufferedOutputStream.write((byte) (j >>> 32));
        bufferedOutputStream.write((byte) (j >>> 40));
        bufferedOutputStream.write((byte) (j >>> 48));
        bufferedOutputStream.write((byte) (j >>> 56));
    }

    public static void i(BufferedOutputStream bufferedOutputStream, String str) {
        byte[] bytes = str.getBytes("UTF-8");
        int length = bytes.length;
        h(bufferedOutputStream, length);
        bufferedOutputStream.write(bytes, 0, length);
    }

    public static byte[] j(yv1 yv1Var, long j) {
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        long j2 = yv1Var.P - yv1Var.Q;
        if (i >= 0 && j <= j2) {
            int i2 = (int) j;
            if (i2 == j) {
                byte[] bArr = new byte[i2];
                new DataInputStream(yv1Var).readFully(bArr);
                return bArr;
            }
        }
        throw new IOException("streamToBytes length=" + j + ", maxLength=" + j2);
    }

    public static int k(InputStream inputStream) {
        int read = inputStream.read();
        if (read != -1) {
            return read;
        }
        throw new EOFException();
    }

    public static final String m(String str) {
        int length = str.length() / 2;
        return String.valueOf(String.valueOf(str.substring(0, length).hashCode())).concat(String.valueOf(String.valueOf(str.substring(length).hashCode())));
    }

    public final synchronized nu1 a(String str) {
        xv1 xv1Var = (xv1) this.a.get(str);
        if (xv1Var == null) {
            return null;
        }
        File e = e(str);
        try {
            yv1 yv1Var = new yv1(new BufferedInputStream(new FileInputStream(e)), e.length());
            try {
                xv1 a = xv1.a(yv1Var);
                if (!TextUtils.equals(str, a.b)) {
                    rv1.a("%s: key=%s, found=%s", e.getAbsolutePath(), str, a.b);
                    xv1 xv1Var2 = (xv1) this.a.remove(str);
                    if (xv1Var2 != null) {
                        this.b -= xv1Var2.a;
                    }
                    return null;
                }
                byte[] j = j(yv1Var, yv1Var.P - yv1Var.Q);
                nu1 nu1Var = new nu1();
                nu1Var.a = j;
                nu1Var.b = xv1Var.c;
                nu1Var.c = xv1Var.d;
                nu1Var.d = xv1Var.e;
                nu1Var.e = xv1Var.f;
                nu1Var.f = xv1Var.g;
                List<uu1> list = xv1Var.h;
                TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
                for (uu1 uu1Var : list) {
                    treeMap.put(uu1Var.a, uu1Var.b);
                }
                nu1Var.g = treeMap;
                nu1Var.h = Collections.unmodifiableList(xv1Var.h);
                return nu1Var;
            } finally {
                yv1Var.close();
            }
        } catch (IOException e2) {
            rv1.a("%s: %s", e.getAbsolutePath(), e2.toString());
            synchronized (this) {
                boolean delete = e(str).delete();
                xv1 xv1Var3 = (xv1) this.a.remove(str);
                if (xv1Var3 != null) {
                    this.b -= xv1Var3.a;
                }
                if (!delete) {
                    rv1.a("Could not delete cache entry for key=%s, filename=%s", str, m(str));
                }
                return null;
            }
        }
    }

    public final synchronized void b() {
        File a = this.c.a();
        if (!a.exists()) {
            if (a.mkdirs()) {
                return;
            }
            rv1.b("Unable to create cache dir %s", a.getAbsolutePath());
            return;
        }
        File[] listFiles = a.listFiles();
        if (listFiles != null) {
            for (File file : listFiles) {
                try {
                    long length = file.length();
                    yv1 yv1Var = new yv1(new BufferedInputStream(new FileInputStream(file)), length);
                    try {
                        xv1 a2 = xv1.a(yv1Var);
                        a2.a = length;
                        l(a2.b, a2);
                        yv1Var.close();
                    } catch (Throwable th) {
                        yv1Var.close();
                        throw th;
                        break;
                    }
                } catch (IOException unused) {
                    file.delete();
                }
            }
        }
    }

    public final synchronized void c(String str, nu1 nu1Var) {
        BufferedOutputStream bufferedOutputStream;
        xv1 xv1Var;
        long j;
        long j2 = this.b;
        int length = nu1Var.a.length;
        long j3 = j2 + length;
        int i = this.d;
        if (j3 > i && length > i * 0.9f) {
            return;
        }
        File e = e(str);
        try {
            bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(e));
            xv1Var = new xv1(str, nu1Var);
        } catch (IOException unused) {
            if (!e.delete()) {
                rv1.a("Could not clean up file %s", e.getAbsolutePath());
            }
            if (!this.c.a().exists()) {
                rv1.a("Re-initializing cache after external clearing.", new Object[0]);
                this.a.clear();
                this.b = 0L;
                b();
                return;
            }
        }
        try {
            g(bufferedOutputStream, 538247942);
            i(bufferedOutputStream, str);
            String str2 = xv1Var.c;
            if (str2 == null) {
                str2 = "";
            }
            i(bufferedOutputStream, str2);
            h(bufferedOutputStream, xv1Var.d);
            h(bufferedOutputStream, xv1Var.e);
            h(bufferedOutputStream, xv1Var.f);
            h(bufferedOutputStream, xv1Var.g);
            List<uu1> list = xv1Var.h;
            if (list != null) {
                g(bufferedOutputStream, list.size());
                for (uu1 uu1Var : list) {
                    i(bufferedOutputStream, uu1Var.a);
                    i(bufferedOutputStream, uu1Var.b);
                }
            } else {
                g(bufferedOutputStream, 0);
            }
            bufferedOutputStream.flush();
            bufferedOutputStream.write(nu1Var.a);
            bufferedOutputStream.close();
            xv1Var.a = e.length();
            l(str, xv1Var);
            if (this.b >= this.d) {
                if (rv1.a) {
                    rv1.c("Pruning old cache entries.", new Object[0]);
                }
                long j4 = this.b;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                Iterator it = this.a.entrySet().iterator();
                int i2 = 0;
                while (true) {
                    if (it.hasNext()) {
                        xv1 xv1Var2 = (xv1) ((Map.Entry) it.next()).getValue();
                        if (e(xv1Var2.b).delete()) {
                            j = elapsedRealtime;
                            this.b -= xv1Var2.a;
                        } else {
                            j = elapsedRealtime;
                            String str3 = xv1Var2.b;
                            rv1.a("Could not delete cache entry for key=%s, filename=%s", str3, m(str3));
                        }
                        it.remove();
                        i2++;
                        if (((float) this.b) < this.d * 0.9f) {
                            break;
                        }
                        elapsedRealtime = j;
                    } else {
                        j = elapsedRealtime;
                        break;
                    }
                }
                if (rv1.a) {
                    rv1.c("pruned %d files, %d bytes, %d ms", Integer.valueOf(i2), Long.valueOf(this.b - j4), Long.valueOf(SystemClock.elapsedRealtime() - j));
                }
            }
        } catch (IOException e2) {
            rv1.a("%s", e2.toString());
            bufferedOutputStream.close();
            rv1.a("Failed to write header for %s", e.getAbsolutePath());
            throw new IOException();
        }
    }

    public final File e(String str) {
        return new File(this.c.a(), m(str));
    }

    public final void l(String str, xv1 xv1Var) {
        if (this.a.containsKey(str)) {
            this.b = (xv1Var.a - ((xv1) this.a.get(str)).a) + this.b;
        } else {
            this.b += xv1Var.a;
        }
        this.a.put(str, xv1Var);
    }
}