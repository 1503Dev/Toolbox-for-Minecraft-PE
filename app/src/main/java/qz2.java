package defpackage;

import android.os.SystemClock;
import androidx.recyclerview.widget.RecyclerView;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import java.text.DecimalFormat;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: qz2  reason: default package */
public final class qz2 extends oz2 {
    public static final Set U = Collections.synchronizedSet(new HashSet());
    public static final DecimalFormat V = new DecimalFormat("#,###");
    public File S;
    public boolean T;

    public qz2(gy2 gy2Var) {
        super(gy2Var);
        File cacheDir = this.P.getCacheDir();
        if (cacheDir == null) {
            sv2.g("Context.getCacheDir() returned null");
            return;
        }
        File file = new File(cacheDir, "admobVideoStreams");
        this.S = file;
        if (!file.isDirectory() && !this.S.mkdirs()) {
            sv2.g("Could not create preload cache directory at ".concat(String.valueOf(this.S.getAbsolutePath())));
            this.S = null;
        } else if (this.S.setReadable(true, false) && this.S.setExecutable(true, false)) {
        } else {
            sv2.g("Could not set cache file permissions at ".concat(String.valueOf(this.S.getAbsolutePath())));
            this.S = null;
        }
    }

    @Override // defpackage.oz2
    public final void l() {
        this.T = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:142:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x03de  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x03fd  */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15, types: [int] */
    /* JADX WARN: Type inference failed for: r1v30 */
    @Override // defpackage.oz2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean t(String str) {
        int i;
        String str2;
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2;
        long j;
        boolean z;
        ByteBuffer byteBuffer;
        FileChannel fileChannel;
        ReadableByteChannel readableByteChannel;
        int i2;
        long j2;
        boolean z2;
        if (this.S != null) {
            do {
                File file = this.S;
                if (file == null) {
                    i = 0;
                } else {
                    i = 0;
                    for (File file2 : file.listFiles()) {
                        if (!file2.getName().endsWith(".done")) {
                            i++;
                        }
                    }
                }
                m92 m92Var = x92.o;
                w82 w82Var = w82.d;
                if (i > ((Integer) w82Var.c.a(m92Var)).intValue()) {
                    File file3 = this.S;
                    if (file3 == null) {
                        break;
                    }
                    File[] listFiles = file3.listFiles();
                    long j3 = RecyclerView.FOREVER_NS;
                    File file4 = null;
                    for (File file5 : listFiles) {
                        if (!file5.getName().endsWith(".done")) {
                            long lastModified = file5.lastModified();
                            if (lastModified < j3) {
                                file4 = file5;
                                j3 = lastModified;
                            }
                        }
                    }
                    if (file4 != null) {
                        z2 = file4.delete();
                        File file6 = new File(this.S, String.valueOf(file4.getName()).concat(".done"));
                        if (file6.isFile()) {
                            z2 &= file6.delete();
                            continue;
                        } else {
                            continue;
                        }
                    } else {
                        z2 = false;
                        continue;
                    }
                } else {
                    File file7 = new File(this.S, mv2.m(str, "MD5"));
                    File file8 = new File(this.S, String.valueOf(file7.getName()).concat(".done"));
                    if (file7.isFile() && file8.isFile()) {
                        int length = (int) file7.length();
                        sv2.b("Stream cache hit at ".concat(String.valueOf(str)));
                        mv2.b.post(new lz2(this, str, file7.getAbsolutePath(), length));
                        return true;
                    }
                    String valueOf = String.valueOf(this.S.getAbsolutePath());
                    String valueOf2 = String.valueOf(str);
                    Set set = U;
                    String concat = valueOf.concat(valueOf2);
                    synchronized (set) {
                        if (set.contains(concat)) {
                            sv2.g("Stream cache already in progress at " + str);
                            m(str, file7.getAbsolutePath(), "inProgress", null);
                            return false;
                        }
                        set.add(concat);
                        String str3 = "error";
                        try {
                            HttpURLConnection a = new ar4().a(new ov2(str));
                            int responseCode = a.getResponseCode();
                            if (responseCode < 400) {
                                int contentLength = a.getContentLength();
                                if (contentLength < 0) {
                                    sv2.g("Stream cache aborted, missing content-length header at " + str);
                                    m(str, file7.getAbsolutePath(), "contentLengthMissing", null);
                                    set.remove(concat);
                                    return false;
                                }
                                String format = V.format(contentLength);
                                int intValue = ((Integer) w82Var.c.a(x92.p)).intValue();
                                if (contentLength > intValue) {
                                    sv2.g("Content length " + format + " exceeds limit at " + str);
                                    StringBuilder sb = new StringBuilder();
                                    sb.append("File too big for full file cache. Size: ");
                                    sb.append(format);
                                    m(str, file7.getAbsolutePath(), "sizeExceeded", sb.toString());
                                    set.remove(concat);
                                    return false;
                                }
                                sv2.b("Caching " + format + " bytes from " + str);
                                ReadableByteChannel newChannel = Channels.newChannel(a.getInputStream());
                                long fileOutputStream3 = new FileOutputStream(file7);
                                try {
                                    FileChannel channel = fileOutputStream3.getChannel();
                                    ByteBuffer allocate = ByteBuffer.allocate(1048576);
                                    jv5.A.j.getClass();
                                    long currentTimeMillis = System.currentTimeMillis();
                                    long longValue = ((Long) w82Var.c.a(x92.s)).longValue();
                                    long j4 = Long.MIN_VALUE;
                                    Object obj = new Object();
                                    long longValue2 = ((Long) w82Var.c.a(x92.r)).longValue();
                                    ?? r1 = 0;
                                    while (true) {
                                        int read = newChannel.read(allocate);
                                        if (read >= 0) {
                                            int i3 = read + r1;
                                            try {
                                                if (i3 <= intValue) {
                                                    allocate.flip();
                                                    do {
                                                    } while (channel.write(allocate) > 0);
                                                    allocate.clear();
                                                    if (System.currentTimeMillis() - currentTimeMillis <= 1000 * longValue2) {
                                                        if (!this.T) {
                                                            synchronized (obj) {
                                                                try {
                                                                    jv5.A.j.getClass();
                                                                    long elapsedRealtime = SystemClock.elapsedRealtime();
                                                                    if (j4 + fileOutputStream3 > elapsedRealtime) {
                                                                        z = false;
                                                                    } else {
                                                                        j4 = elapsedRealtime;
                                                                        z = true;
                                                                    }
                                                                } finally {
                                                                    th = th;
                                                                    j = fileOutputStream3;
                                                                    while (true) {
                                                                        try {
                                                                            break;
                                                                        } catch (Throwable th) {
                                                                            th = th;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            if (z) {
                                                                j2 = fileOutputStream3;
                                                                byteBuffer = allocate;
                                                                fileChannel = channel;
                                                                fileOutputStream2 = fileOutputStream3;
                                                                readableByteChannel = newChannel;
                                                                i2 = intValue;
                                                                try {
                                                                    try {
                                                                        mv2.b.post(new iz2(this, str, file7.getAbsolutePath(), i3, contentLength));
                                                                    } catch (RuntimeException e) {
                                                                        e = e;
                                                                        fileOutputStream = fileOutputStream2;
                                                                        str2 = null;
                                                                        if (e instanceof RuntimeException) {
                                                                            jv5.A.g.f("VideoStreamFullFileCache.preload", e);
                                                                        }
                                                                        try {
                                                                            fileOutputStream.close();
                                                                        } catch (IOException | NullPointerException unused) {
                                                                        }
                                                                        if (this.T) {
                                                                            sv2.f("Preload aborted for URL \"" + str + "\"");
                                                                        } else {
                                                                            sv2.h("Preload failed for URL \"" + str + "\"", e);
                                                                        }
                                                                        if (file7.exists() && !file7.delete()) {
                                                                            sv2.g("Could not delete partial cache file at ".concat(String.valueOf(file7.getAbsolutePath())));
                                                                        }
                                                                        m(str, file7.getAbsolutePath(), str3, str2);
                                                                        U.remove(concat);
                                                                        return false;
                                                                    }
                                                                } catch (IOException e2) {
                                                                    e = e2;
                                                                    fileOutputStream = fileOutputStream2;
                                                                    str2 = null;
                                                                    if (e instanceof RuntimeException) {
                                                                    }
                                                                    fileOutputStream.close();
                                                                    if (this.T) {
                                                                    }
                                                                    if (file7.exists()) {
                                                                        sv2.g("Could not delete partial cache file at ".concat(String.valueOf(file7.getAbsolutePath())));
                                                                    }
                                                                    m(str, file7.getAbsolutePath(), str3, str2);
                                                                    U.remove(concat);
                                                                    return false;
                                                                }
                                                            } else {
                                                                byteBuffer = allocate;
                                                                fileChannel = channel;
                                                                fileOutputStream2 = fileOutputStream3;
                                                                readableByteChannel = newChannel;
                                                                i2 = intValue;
                                                            }
                                                            r1 = i3;
                                                            newChannel = readableByteChannel;
                                                            longValue = j2;
                                                            allocate = byteBuffer;
                                                            channel = fileChannel;
                                                            fileOutputStream3 = fileOutputStream3;
                                                        } else {
                                                            throw new IOException("abort requested");
                                                        }
                                                    } else {
                                                        String str4 = "Timeout exceeded. Limit: " + Long.toString(longValue2) + " sec";
                                                        throw new IOException("stream cache time limit exceeded");
                                                    }
                                                } else {
                                                    String str5 = "File too big for full file cache. Size: " + Integer.toString(i3);
                                                    throw new IOException("stream cache file size limit exceeded");
                                                }
                                            } catch (IOException | RuntimeException e3) {
                                                e = e3;
                                                str2 = r1;
                                                if (e instanceof RuntimeException) {
                                                }
                                                fileOutputStream.close();
                                                if (this.T) {
                                                }
                                                if (file7.exists()) {
                                                }
                                                m(str, file7.getAbsolutePath(), str3, str2);
                                                U.remove(concat);
                                                return false;
                                            }
                                        } else {
                                            fileOutputStream3.close();
                                            if (sv2.j(3)) {
                                                sv2.b("Preloaded " + V.format((long) r1) + " bytes from " + str);
                                            }
                                            file7.setReadable(true, false);
                                            if (file8.isFile()) {
                                                file8.setLastModified(System.currentTimeMillis());
                                            } else {
                                                try {
                                                    file8.createNewFile();
                                                } catch (IOException unused2) {
                                                }
                                            }
                                            mv2.b.post(new lz2(this, str, file7.getAbsolutePath(), r1));
                                            U.remove(concat);
                                            return true;
                                        }
                                    }
                                } catch (IOException | RuntimeException e4) {
                                    e = e4;
                                    fileOutputStream2 = fileOutputStream3;
                                }
                            } else {
                                str3 = "badUrl";
                                str2 = "HTTP request failed. Code: " + Integer.toString(responseCode);
                                try {
                                    throw new IOException("HTTP status code " + responseCode + " at " + str);
                                } catch (IOException e5) {
                                    e = e5;
                                    fileOutputStream = null;
                                    if (e instanceof RuntimeException) {
                                    }
                                    fileOutputStream.close();
                                    if (this.T) {
                                    }
                                    if (file7.exists()) {
                                    }
                                    m(str, file7.getAbsolutePath(), str3, str2);
                                    U.remove(concat);
                                    return false;
                                } catch (RuntimeException e6) {
                                    e = e6;
                                    fileOutputStream = null;
                                    if (e instanceof RuntimeException) {
                                    }
                                    fileOutputStream.close();
                                    if (this.T) {
                                    }
                                    if (file7.exists()) {
                                    }
                                    m(str, file7.getAbsolutePath(), str3, str2);
                                    U.remove(concat);
                                    return false;
                                }
                            }
                        } catch (IOException | RuntimeException e7) {
                            e = e7;
                            str2 = null;
                        }
                    }
                }
            } while (z2);
            sv2.g("Unable to expire stream cache");
            m(str, null, "expireFailed", null);
            return false;
        }
        m(str, null, "noCacheDir", null);
        return false;
    }
}