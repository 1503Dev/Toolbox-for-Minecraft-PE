package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.NoRouteToHostException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.GZIPInputStream;

/* renamed from: l55  reason: default package */
public final class l55 extends xq4 implements nb5 {
    public final boolean e;
    public final int f;
    public final int g;
    public final String h;
    public final u53 i;
    public final u53 j;
    public HttpURLConnection k;
    public InputStream l;
    public boolean m;
    public int n;
    public long o;
    public long p;

    @Deprecated
    public l55() {
        this(null, 8000, 8000, false, null);
    }

    public l55(String str, int i, int i2, boolean z, u53 u53Var) {
        super(true);
        this.h = str;
        this.f = i;
        this.g = i2;
        this.e = z;
        this.i = u53Var;
        this.j = new u53();
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x017a  */
    @Override // defpackage.fv4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long a(kz4 kz4Var) {
        boolean z;
        HttpURLConnection k;
        bw4 bw4Var;
        boolean z2;
        long j;
        long parseLong;
        long j2;
        long j3 = 0;
        this.p = 0L;
        this.o = 0L;
        g(kz4Var);
        int i = 1;
        try {
            URL url = new URL(kz4Var.a.toString());
            long j4 = kz4Var.d;
            long j5 = kz4Var.e;
            if ((kz4Var.f & 1) == 1) {
                z = true;
            } else {
                z = false;
            }
            if (!this.e) {
                k = k(url, j4, j5, z, true, kz4Var.b);
            } else {
                int i2 = 0;
                URL url2 = url;
                int i3 = 1;
                while (true) {
                    int i4 = i2 + 1;
                    if (i2 <= 20) {
                        long j6 = j5;
                        k = k(url2, j4, j5, z, false, kz4Var.b);
                        int responseCode = k.getResponseCode();
                        String headerField = k.getHeaderField("Location");
                        if (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303 && responseCode != 307 && responseCode != 308) {
                            i = i3;
                            break;
                        }
                        k.disconnect();
                        url2 = l(url2, headerField);
                        i3 = 1;
                        i2 = i4;
                        j5 = j6;
                    } else {
                        throw new g95(new NoRouteToHostException("Too many redirects: " + i4), 2001, 1);
                    }
                }
            }
            this.k = k;
            this.n = k.getResponseCode();
            k.getResponseMessage();
            int i5 = this.n;
            if (i5 >= 200 && i5 <= 299) {
                k.getContentType();
                if (this.n == 200) {
                    long j7 = kz4Var.d;
                    if (j7 != 0) {
                        j3 = j7;
                    }
                }
                boolean equalsIgnoreCase = "gzip".equalsIgnoreCase(k.getHeaderField("Content-Encoding"));
                long j8 = kz4Var.e;
                if (!equalsIgnoreCase && j8 == -1) {
                    String headerField2 = k.getHeaderField("Content-Length");
                    String headerField3 = k.getHeaderField("Content-Range");
                    Pattern pattern = ec5.a;
                    if (!TextUtils.isEmpty(headerField2)) {
                        try {
                            parseLong = Long.parseLong(headerField2);
                        } catch (NumberFormatException unused) {
                            lb4.a("HttpUtil", "Unexpected Content-Length [" + headerField2 + "]");
                        }
                        if (!TextUtils.isEmpty(headerField3)) {
                            Matcher matcher = ec5.a.matcher(headerField3);
                            if (matcher.matches()) {
                                try {
                                    String group = matcher.group(2);
                                    group.getClass();
                                    long parseLong2 = Long.parseLong(group);
                                    String group2 = matcher.group(i);
                                    group2.getClass();
                                    int i6 = (parseLong > 0L ? 1 : (parseLong == 0L ? 0 : -1));
                                    long parseLong3 = (parseLong2 - Long.parseLong(group2)) + 1;
                                    if (i6 < 0) {
                                        parseLong = parseLong3;
                                    } else if (parseLong != parseLong3) {
                                        lb4.c("HttpUtil", "Inconsistent headers [" + headerField2 + "] [" + headerField3 + "]");
                                        parseLong = Math.max(parseLong, parseLong3);
                                    }
                                } catch (NumberFormatException unused2) {
                                    lb4.a("HttpUtil", "Unexpected Content-Range [" + headerField3 + "]");
                                }
                            }
                        }
                        if (parseLong == -1) {
                            j2 = parseLong - j3;
                        } else {
                            j2 = -1;
                        }
                        this.o = j2;
                    }
                    parseLong = -1;
                    if (!TextUtils.isEmpty(headerField3)) {
                    }
                    if (parseLong == -1) {
                    }
                    this.o = j2;
                } else {
                    this.o = j8;
                }
                try {
                    this.l = k.getInputStream();
                    if (equalsIgnoreCase) {
                        this.l = new GZIPInputStream(this.l);
                    }
                    this.m = true;
                    h(kz4Var);
                    if (j3 != 0) {
                        try {
                            byte[] bArr = new byte[4096];
                            for (long j9 = 0; j3 > j9; j9 = 0) {
                                int min = (int) Math.min(j3, 4096L);
                                InputStream inputStream = this.l;
                                int i7 = zn4.a;
                                int read = inputStream.read(bArr, 0, min);
                                if (!Thread.currentThread().isInterrupted()) {
                                    if (read != -1) {
                                        j3 -= read;
                                        v(read);
                                    } else {
                                        throw new g95();
                                    }
                                } else {
                                    throw new g95(new InterruptedIOException(), (int) RecyclerView.MAX_SCROLL_DURATION, 1);
                                }
                            }
                        } catch (IOException e) {
                            m();
                            if (e instanceof g95) {
                                throw ((g95) e);
                            }
                            throw new g95(e, (int) RecyclerView.MAX_SCROLL_DURATION, 1);
                        }
                    }
                    return this.o;
                } catch (IOException e2) {
                    m();
                    throw new g95(e2, (int) RecyclerView.MAX_SCROLL_DURATION, 1);
                }
            }
            Map<String, List<String>> headerFields = k.getHeaderFields();
            if (this.n == 416) {
                String headerField4 = k.getHeaderField("Content-Range");
                Pattern pattern2 = ec5.a;
                if (!TextUtils.isEmpty(headerField4)) {
                    Matcher matcher2 = ec5.b.matcher(headerField4);
                    if (matcher2.matches()) {
                        z2 = true;
                        String group3 = matcher2.group(1);
                        group3.getClass();
                        j = Long.parseLong(group3);
                        if (kz4Var.d == j) {
                            this.m = z2;
                            h(kz4Var);
                            long j10 = kz4Var.e;
                            if (j10 != -1) {
                                return j10;
                            }
                            return 0L;
                        }
                    }
                }
                z2 = true;
                j = -1;
                if (kz4Var.d == j) {
                }
            }
            InputStream errorStream = k.getErrorStream();
            try {
                if (errorStream != null) {
                    int i8 = zn4.a;
                    byte[] bArr2 = new byte[4096];
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    while (true) {
                        int read2 = errorStream.read(bArr2);
                        if (read2 == -1) {
                            break;
                        }
                        byteArrayOutputStream.write(bArr2, 0, read2);
                    }
                    byteArrayOutputStream.toByteArray();
                } else {
                    int i9 = zn4.a;
                }
            } catch (IOException unused3) {
                int i10 = zn4.a;
            }
            m();
            if (this.n == 416) {
                bw4Var = new bw4(2008);
            } else {
                bw4Var = null;
            }
            throw new ja5(this.n, bw4Var, headerFields);
        } catch (IOException e3) {
            m();
            throw g95.a(e3, 1);
        }
    }

    @Override // defpackage.xq4, defpackage.fv4
    public final Map b() {
        HttpURLConnection httpURLConnection = this.k;
        if (httpURLConnection == null) {
            return sw4.V;
        }
        return new v35(httpURLConnection.getHeaderFields());
    }

    @Override // defpackage.fv4
    public final Uri d() {
        HttpURLConnection httpURLConnection = this.k;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // defpackage.fv4
    public final void i() {
        try {
            InputStream inputStream = this.l;
            if (inputStream != null) {
                long j = this.o;
                long j2 = j == -1 ? -1L : j - this.p;
                HttpURLConnection httpURLConnection = this.k;
                try {
                    if (httpURLConnection != null) {
                        if (zn4.a <= 20) {
                            try {
                                InputStream inputStream2 = httpURLConnection.getInputStream();
                                if (j2 == -1) {
                                    if (inputStream2.read() != -1) {
                                    }
                                } else if (j2 <= 2048) {
                                }
                                String name = inputStream2.getClass().getName();
                                if ("com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream".equals(name) || "com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream".equals(name)) {
                                    Class<? super Object> superclass = inputStream2.getClass().getSuperclass();
                                    superclass.getClass();
                                    Method declaredMethod = superclass.getDeclaredMethod("unexpectedEndOfInput", new Class[0]);
                                    declaredMethod.setAccessible(true);
                                    declaredMethod.invoke(inputStream2, new Object[0]);
                                }
                            } catch (Exception unused) {
                            }
                        }
                        inputStream.close();
                    }
                    inputStream.close();
                } catch (IOException e) {
                    int i = zn4.a;
                    throw new g95(e, (int) RecyclerView.MAX_SCROLL_DURATION, 3);
                }
            }
        } finally {
            this.l = null;
            m();
            if (this.m) {
                this.m = false;
                f();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0092  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final HttpURLConnection k(URL url, long j, long j2, boolean z, boolean z2, Map map) {
        String sb;
        String str;
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(this.f);
        httpURLConnection.setReadTimeout(this.g);
        HashMap hashMap = new HashMap();
        hashMap.putAll(this.i.a());
        hashMap.putAll(this.j.a());
        hashMap.putAll(map);
        for (Map.Entry entry : hashMap.entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        if (j == 0) {
            if (j2 == -1) {
                sb = null;
                if (sb != null) {
                    httpURLConnection.setRequestProperty("Range", sb);
                }
                str = this.h;
                if (str != null) {
                    httpURLConnection.setRequestProperty("User-Agent", str);
                }
                httpURLConnection.setRequestProperty("Accept-Encoding", true == z ? "identity" : "gzip");
                httpURLConnection.setInstanceFollowRedirects(z2);
                httpURLConnection.setDoOutput(false);
                int i = kz4.g;
                httpURLConnection.setRequestMethod("GET");
                httpURLConnection.connect();
                return httpURLConnection;
            }
            j = 0;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("bytes=");
        sb2.append(j);
        sb2.append("-");
        if (j2 != -1) {
            sb2.append((j + j2) - 1);
        }
        sb = sb2.toString();
        if (sb != null) {
        }
        str = this.h;
        if (str != null) {
        }
        httpURLConnection.setRequestProperty("Accept-Encoding", true == z ? "identity" : "gzip");
        httpURLConnection.setInstanceFollowRedirects(z2);
        httpURLConnection.setDoOutput(false);
        int i2 = kz4.g;
        httpURLConnection.setRequestMethod("GET");
        httpURLConnection.connect();
        return httpURLConnection;
    }

    public final URL l(URL url, String str) {
        if (str != null) {
            try {
                URL url2 = new URL(url, str);
                String protocol = url2.getProtocol();
                if ("https".equals(protocol) || "http".equals(protocol)) {
                    if (this.e || protocol.equals(url.getProtocol())) {
                        return url2;
                    }
                    String protocol2 = url.getProtocol();
                    throw new g95("Disallowed cross-protocol redirect (" + protocol2 + " to " + protocol + ")", 2001, 1);
                }
                throw new g95("Unsupported protocol redirect: ".concat(String.valueOf(protocol)), 2001, 1);
            } catch (MalformedURLException e) {
                throw new g95(e, 2001, 1);
            }
        }
        throw new g95("Null location redirect", 2001, 1);
    }

    public final void m() {
        HttpURLConnection httpURLConnection = this.k;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                lb4.b("DefaultHttpDataSource", "Unexpected error while disconnecting", e);
            }
            this.k = null;
        }
    }

    @Override // defpackage.gv5
    public final int x(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        try {
            long j = this.o;
            if (j != -1) {
                long j2 = j - this.p;
                if (j2 == 0) {
                    return -1;
                }
                i2 = (int) Math.min(i2, j2);
            }
            InputStream inputStream = this.l;
            int i3 = zn4.a;
            int read = inputStream.read(bArr, i, i2);
            if (read == -1) {
                return -1;
            }
            this.p += read;
            v(read);
            return read;
        } catch (IOException e) {
            int i4 = zn4.a;
            throw g95.a(e, 2);
        }
    }
}