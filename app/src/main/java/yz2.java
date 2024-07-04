package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.NoRouteToHostException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.net.ssl.HttpsURLConnection;

/* renamed from: yz2  reason: default package */
public final class yz2 extends xq4 implements nb5 {
    public static final Pattern t = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");
    public static final AtomicReference u = new AtomicReference();
    public final xz2 e;
    public final int f;
    public final int g;
    public final String h;
    public final u53 i;
    public HttpURLConnection j;
    public InputStream k;
    public boolean l;
    public int m;
    public long n;
    public long o;
    public long p;
    public long q;
    public int r;
    public final HashSet s;

    public yz2(String str, l03 l03Var, int i, int i2, int i3) {
        super(true);
        this.e = new xz2(this);
        this.s = new HashSet();
        if (!TextUtils.isEmpty(str)) {
            this.h = str;
            this.i = new u53();
            this.f = i;
            this.g = i2;
            this.r = i3;
            if (l03Var != null) {
                c(l03Var);
                return;
            }
            return;
        }
        throw new IllegalArgumentException();
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x0101, code lost:
        if (r3 == 0) goto L95;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0235 A[Catch: IOException -> 0x0282, TryCatch #2 {IOException -> 0x0282, blocks: (B:3:0x000d, B:8:0x0025, B:10:0x002b, B:12:0x0035, B:13:0x003d, B:14:0x0055, B:16:0x005b, B:23:0x007d, B:25:0x0099, B:26:0x00aa, B:27:0x00af, B:29:0x00b8, B:30:0x00bf, B:43:0x00e7, B:100:0x022a, B:102:0x0235, B:104:0x0246, B:107:0x024f, B:108:0x025e, B:110:0x0263, B:111:0x026a, B:112:0x026b, B:113:0x0281), top: B:122:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0263 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b8 A[Catch: IOException -> 0x0282, TryCatch #2 {IOException -> 0x0282, blocks: (B:3:0x000d, B:8:0x0025, B:10:0x002b, B:12:0x0035, B:13:0x003d, B:14:0x0055, B:16:0x005b, B:23:0x007d, B:25:0x0099, B:26:0x00aa, B:27:0x00af, B:29:0x00b8, B:30:0x00bf, B:43:0x00e7, B:100:0x022a, B:102:0x0235, B:104:0x0246, B:107:0x024f, B:108:0x025e, B:110:0x0263, B:111:0x026a, B:112:0x026b, B:113:0x0281), top: B:122:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0202  */
    @Override // defpackage.fv4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long a(kz4 kz4Var) {
        boolean z;
        int responseCode;
        String headerField;
        int responseCode2;
        long j;
        boolean z2;
        long parseLong;
        String headerField2;
        long j2 = 0;
        this.q = 0L;
        this.p = 0L;
        try {
            URL url = new URL(kz4Var.a.toString());
            long j3 = kz4Var.d;
            long j4 = kz4Var.e;
            if ((kz4Var.f & 1) == 1) {
                z = true;
            } else {
                z = false;
            }
            int i = 0;
            while (true) {
                int i2 = i + 1;
                if (i <= 20) {
                    HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                    if (httpURLConnection instanceof HttpsURLConnection) {
                        ((HttpsURLConnection) httpURLConnection).setSSLSocketFactory(this.e);
                    }
                    httpURLConnection.setConnectTimeout(this.f);
                    httpURLConnection.setReadTimeout(this.g);
                    for (Map.Entry entry : this.i.a().entrySet()) {
                        httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
                    }
                    if (j3 == j2) {
                        if (j4 != -1) {
                        }
                        httpURLConnection.setRequestProperty("User-Agent", this.h);
                        if (!z) {
                            httpURLConnection.setRequestProperty("Accept-Encoding", "identity");
                        }
                        httpURLConnection.setInstanceFollowRedirects(false);
                        httpURLConnection.setDoOutput(false);
                        httpURLConnection.connect();
                        responseCode = httpURLConnection.getResponseCode();
                        if (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303 && responseCode != 307 && responseCode != 308) {
                            this.j = httpURLConnection;
                            try {
                                responseCode2 = httpURLConnection.getResponseCode();
                                this.m = responseCode2;
                                if (responseCode2 < 200 && responseCode2 <= 299) {
                                    if (responseCode2 == 200) {
                                        j = kz4Var.d;
                                    }
                                    j = 0;
                                    this.n = j;
                                    if ((kz4Var.f & 1) == 1) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    long j5 = kz4Var.e;
                                    if (!z2 && j5 == -1) {
                                        HttpURLConnection httpURLConnection2 = this.j;
                                        String headerField3 = httpURLConnection2.getHeaderField("Content-Length");
                                        if (!TextUtils.isEmpty(headerField3)) {
                                            try {
                                                parseLong = Long.parseLong(headerField3);
                                            } catch (NumberFormatException unused) {
                                                sv2.d("Unexpected Content-Length [" + headerField3 + "]");
                                            }
                                            headerField2 = httpURLConnection2.getHeaderField("Content-Range");
                                            if (!TextUtils.isEmpty(headerField2)) {
                                                Matcher matcher = t.matcher(headerField2);
                                                if (matcher.find()) {
                                                    try {
                                                        int i3 = (parseLong > 0L ? 1 : (parseLong == 0L ? 0 : -1));
                                                        long parseLong2 = (Long.parseLong(matcher.group(2)) - Long.parseLong(matcher.group(1))) + 1;
                                                        if (i3 < 0) {
                                                            parseLong = parseLong2;
                                                        } else if (parseLong != parseLong2) {
                                                            sv2.g("Inconsistent headers [" + headerField3 + "] [" + headerField2 + "]");
                                                            parseLong = Math.max(parseLong, parseLong2);
                                                        }
                                                    } catch (NumberFormatException unused2) {
                                                        sv2.d("Unexpected Content-Range [" + headerField2 + "]");
                                                    }
                                                }
                                            }
                                            j5 = -1;
                                            if (parseLong != -1) {
                                                j5 = parseLong - this.n;
                                            }
                                        }
                                        parseLong = -1;
                                        headerField2 = httpURLConnection2.getHeaderField("Content-Range");
                                        if (!TextUtils.isEmpty(headerField2)) {
                                        }
                                        j5 = -1;
                                        if (parseLong != -1) {
                                        }
                                    }
                                    this.o = j5;
                                    try {
                                        this.k = this.j.getInputStream();
                                        this.l = true;
                                        h(kz4Var);
                                        return this.o;
                                    } catch (IOException e) {
                                        k();
                                        throw new g95(e, (int) RecyclerView.MAX_SCROLL_DURATION, 1);
                                    }
                                }
                                Map<String, List<String>> headerFields = this.j.getHeaderFields();
                                k();
                                int i4 = this.m;
                                int i5 = zn4.a;
                                ja5 ja5Var = new ja5(i4, null, headerFields);
                                if (this.m == 416) {
                                    ja5Var.initCause(new bw4(2008));
                                }
                                throw ja5Var;
                            } catch (IOException e2) {
                                k();
                                throw new g95("Unable to connect to ".concat(String.valueOf(kz4Var.a.toString())), e2, RecyclerView.MAX_SCROLL_DURATION, 1);
                            }
                        }
                        j2 = 0;
                        headerField = httpURLConnection.getHeaderField("Location");
                        httpURLConnection.disconnect();
                        if (headerField == null) {
                            URL url2 = new URL(url, headerField);
                            String protocol = url2.getProtocol();
                            if (!"https".equals(protocol) && !"http".equals(protocol)) {
                                throw new ProtocolException("Unsupported protocol redirect: ".concat(String.valueOf(protocol)));
                            }
                            url = url2;
                            i = i2;
                        } else {
                            throw new ProtocolException("Null location redirect");
                        }
                    } else {
                        j2 = j3;
                    }
                    String str = "bytes=" + j2 + "-";
                    if (j4 != -1) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(str);
                        sb.append((j2 + j4) - 1);
                        str = sb.toString();
                    }
                    httpURLConnection.setRequestProperty("Range", str);
                    httpURLConnection.setRequestProperty("User-Agent", this.h);
                    if (!z) {
                    }
                    httpURLConnection.setInstanceFollowRedirects(false);
                    httpURLConnection.setDoOutput(false);
                    httpURLConnection.connect();
                    responseCode = httpURLConnection.getResponseCode();
                    if (responseCode != 300) {
                        this.j = httpURLConnection;
                        responseCode2 = httpURLConnection.getResponseCode();
                        this.m = responseCode2;
                        if (responseCode2 < 200) {
                        }
                        Map<String, List<String>> headerFields2 = this.j.getHeaderFields();
                        k();
                        int i42 = this.m;
                        int i52 = zn4.a;
                        ja5 ja5Var2 = new ja5(i42, null, headerFields2);
                        if (this.m == 416) {
                        }
                        throw ja5Var2;
                    }
                    j2 = 0;
                    headerField = httpURLConnection.getHeaderField("Location");
                    httpURLConnection.disconnect();
                    if (headerField == null) {
                    }
                } else {
                    throw new NoRouteToHostException("Too many redirects: " + i2);
                }
            }
        } catch (IOException e3) {
            throw new g95("Unable to connect to ".concat(String.valueOf(kz4Var.a.toString())), e3, RecyclerView.MAX_SCROLL_DURATION, 1);
        }
    }

    @Override // defpackage.xq4, defpackage.fv4
    public final Map b() {
        HttpURLConnection httpURLConnection = this.j;
        if (httpURLConnection == null) {
            return null;
        }
        return httpURLConnection.getHeaderFields();
    }

    @Override // defpackage.fv4
    public final Uri d() {
        HttpURLConnection httpURLConnection = this.j;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // defpackage.fv4
    public final void i() {
        try {
            if (this.k != null) {
                HttpURLConnection httpURLConnection = this.j;
                long j = this.o;
                if (j != -1) {
                    j -= this.q;
                }
                int i = zn4.a;
                if (i == 19 || i == 20) {
                    try {
                        InputStream inputStream = httpURLConnection.getInputStream();
                        if (j == -1) {
                            if (inputStream.read() != -1) {
                            }
                        } else if (j <= 2048) {
                        }
                        String name = inputStream.getClass().getName();
                        if (name.equals("com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream") || name.equals("com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream")) {
                            Method declaredMethod = inputStream.getClass().getSuperclass().getDeclaredMethod("unexpectedEndOfInput", new Class[0]);
                            declaredMethod.setAccessible(true);
                            declaredMethod.invoke(inputStream, new Object[0]);
                        }
                    } catch (Exception unused) {
                    }
                }
                try {
                    this.k.close();
                } catch (IOException e) {
                    throw new g95(e, (int) RecyclerView.MAX_SCROLL_DURATION, 3);
                }
            }
        } finally {
            this.k = null;
            k();
            if (this.l) {
                this.l = false;
                f();
            }
            this.s.clear();
        }
    }

    public final void k() {
        HttpURLConnection httpURLConnection = this.j;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                sv2.e("Unexpected error while disconnecting", e);
            }
            this.j = null;
        }
    }

    @Override // defpackage.gv5
    public final int x(byte[] bArr, int i, int i2) {
        try {
            if (this.p != this.n) {
                byte[] bArr2 = (byte[]) u.getAndSet(null);
                if (bArr2 == null) {
                    bArr2 = new byte[4096];
                }
                while (true) {
                    long j = this.p;
                    long j2 = this.n;
                    if (j == j2) {
                        u.set(bArr2);
                        break;
                    }
                    int read = this.k.read(bArr2, 0, (int) Math.min(j2 - j, bArr2.length));
                    if (Thread.interrupted()) {
                        throw new InterruptedIOException();
                    }
                    if (read == -1) {
                        throw new EOFException();
                    }
                    this.p += read;
                    v(read);
                }
            }
            if (i2 == 0) {
                return 0;
            }
            long j3 = this.o;
            if (j3 != -1) {
                long j4 = j3 - this.q;
                if (j4 == 0) {
                    return -1;
                }
                i2 = (int) Math.min(i2, j4);
            }
            int read2 = this.k.read(bArr, i, i2);
            if (read2 == -1) {
                if (this.o != -1) {
                    throw new EOFException();
                }
                return -1;
            }
            this.q += read2;
            v(read2);
            return read2;
        } catch (IOException e) {
            throw new g95(e, (int) RecyclerView.MAX_SCROLL_DURATION, 2);
        }
    }
}