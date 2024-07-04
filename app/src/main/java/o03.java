package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayDeque;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: o03  reason: default package */
public final class o03 extends xq4 implements nb5 {
    public static final Pattern v = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");
    public final int e;
    public final int f;
    public final String g;
    public final u53 h;
    public kz4 i;
    public HttpURLConnection j;
    public final ArrayDeque k;
    public InputStream l;
    public boolean m;
    public int n;
    public long o;
    public long p;
    public long q;
    public long r;
    public long s;
    public final long t;
    public final long u;

    public o03(String str, l03 l03Var, int i, int i2, long j, long j2) {
        super(true);
        if (!TextUtils.isEmpty(str)) {
            this.g = str;
            this.h = new u53();
            this.e = i;
            this.f = i2;
            this.k = new ArrayDeque();
            this.t = j;
            this.u = j2;
            if (l03Var != null) {
                c(l03Var);
                return;
            }
            return;
        }
        throw new IllegalArgumentException();
    }

    @Override // defpackage.fv4
    public final long a(kz4 kz4Var) {
        long j;
        this.i = kz4Var;
        this.p = 0L;
        long j2 = kz4Var.d;
        long j3 = kz4Var.e;
        long min = j3 == -1 ? this.t : Math.min(this.t, j3);
        this.q = j2;
        HttpURLConnection k = k(j2, 1, (min + j2) - 1);
        this.j = k;
        String headerField = k.getHeaderField("Content-Range");
        if (!TextUtils.isEmpty(headerField)) {
            Matcher matcher = v.matcher(headerField);
            if (matcher.find()) {
                try {
                    Long.parseLong(matcher.group(1));
                    long parseLong = Long.parseLong(matcher.group(2));
                    long parseLong2 = Long.parseLong(matcher.group(3));
                    long j4 = kz4Var.e;
                    if (j4 != -1) {
                        this.o = j4;
                        j = Math.max(parseLong, (this.q + j4) - 1);
                    } else {
                        this.o = parseLong2 - this.q;
                        j = parseLong2 - 1;
                    }
                    this.r = j;
                    this.s = parseLong;
                    this.m = true;
                    h(kz4Var);
                    return this.o;
                } catch (NumberFormatException unused) {
                    sv2.d("Unexpected Content-Range [" + headerField + "]");
                }
            }
        }
        throw new m03(headerField);
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
            InputStream inputStream = this.l;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    throw new g95(e, (int) RecyclerView.MAX_SCROLL_DURATION, 3);
                }
            }
        } finally {
            this.l = null;
            l();
            if (this.m) {
                this.m = false;
                f();
            }
        }
    }

    public final HttpURLConnection k(long j, int i, long j2) {
        String uri = this.i.a.toString();
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(uri).openConnection();
            httpURLConnection.setConnectTimeout(this.e);
            httpURLConnection.setReadTimeout(this.f);
            for (Map.Entry entry : this.h.a().entrySet()) {
                httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
            httpURLConnection.setRequestProperty("Range", "bytes=" + j + "-" + j2);
            httpURLConnection.setRequestProperty("User-Agent", this.g);
            httpURLConnection.setRequestProperty("Accept-Encoding", "identity");
            httpURLConnection.setRequestMethod("GET");
            httpURLConnection.connect();
            this.k.add(httpURLConnection);
            String uri2 = this.i.a.toString();
            try {
                int responseCode = httpURLConnection.getResponseCode();
                this.n = responseCode;
                if (responseCode < 200 || responseCode > 299) {
                    httpURLConnection.getHeaderFields();
                    l();
                    throw new n03(this.n, i);
                }
                try {
                    InputStream inputStream = httpURLConnection.getInputStream();
                    if (this.l != null) {
                        inputStream = new SequenceInputStream(this.l, inputStream);
                    }
                    this.l = inputStream;
                    return httpURLConnection;
                } catch (IOException e) {
                    l();
                    throw new g95(e, (int) RecyclerView.MAX_SCROLL_DURATION, i);
                }
            } catch (IOException e2) {
                l();
                throw new g95("Unable to connect to ".concat(String.valueOf(uri2)), e2, RecyclerView.MAX_SCROLL_DURATION, i);
            }
        } catch (IOException e3) {
            throw new g95("Unable to connect to ".concat(String.valueOf(uri)), e3, RecyclerView.MAX_SCROLL_DURATION, i);
        }
    }

    public final void l() {
        while (!this.k.isEmpty()) {
            try {
                ((HttpURLConnection) this.k.remove()).disconnect();
            } catch (Exception e) {
                sv2.e("Unexpected error while disconnecting", e);
            }
        }
        this.j = null;
    }

    @Override // defpackage.gv5
    public final int x(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        try {
            long j = this.o;
            long j2 = this.p;
            if (j - j2 == 0) {
                return -1;
            }
            long j3 = this.q + j2;
            long j4 = i2;
            long j5 = this.u;
            long j6 = this.s;
            long j7 = j6 + 1;
            if (j3 + j4 + j5 > j7) {
                long j8 = this.r;
                if (j6 < j8) {
                    long min = Math.min(j8, Math.max(((this.t + j7) - j5) - 1, (-1) + j7 + j4));
                    k(j7, 2, min);
                    this.s = min;
                    j6 = min;
                }
            }
            int read = this.l.read(bArr, i, (int) Math.min(j4, ((j6 + 1) - this.q) - this.p));
            if (read != -1) {
                this.p += read;
                v(read);
                return read;
            }
            throw new EOFException();
        } catch (IOException e) {
            throw new g95(e, (int) RecyclerView.MAX_SCROLL_DURATION, 2);
        }
    }
}