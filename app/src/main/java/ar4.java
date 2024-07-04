package defpackage;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Set;

/* renamed from: ar4  reason: default package */
public final class ar4 extends vq4 {
    public qt4<Integer> P = mu2.R;
    public ov2 Q = null;
    public HttpURLConnection R;

    public final HttpURLConnection a(ov2 ov2Var) {
        this.P = new qt4() { // from class: wq4
            public final /* synthetic */ int P = -1;

            @Override // defpackage.qt4
            public final Object a() {
                return Integer.valueOf(this.P);
            }
        };
        this.Q = ov2Var;
        Integer num = 265;
        num.intValue();
        ((Integer) this.P.a()).intValue();
        ov2 ov2Var2 = this.Q;
        ov2Var2.getClass();
        String str = ov2Var2.P;
        Set set = qz2.U;
        cx2 cx2Var = jv5.A.o;
        int intValue = ((Integer) w82.d.c.a(x92.t)).intValue();
        URL url = new URL(str);
        int i = 0;
        while (true) {
            i++;
            if (i <= 20) {
                URLConnection openConnection = url.openConnection();
                openConnection.setConnectTimeout(intValue);
                openConnection.setReadTimeout(intValue);
                if (openConnection instanceof HttpURLConnection) {
                    HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
                    rv2 rv2Var = new rv2();
                    rv2Var.a(httpURLConnection, null);
                    httpURLConnection.setInstanceFollowRedirects(false);
                    int responseCode = httpURLConnection.getResponseCode();
                    rv2Var.b(httpURLConnection, responseCode);
                    if (responseCode / 100 == 3) {
                        String headerField = httpURLConnection.getHeaderField("Location");
                        if (headerField != null) {
                            URL url2 = new URL(url, headerField);
                            String protocol = url2.getProtocol();
                            if (protocol != null) {
                                if (!protocol.equals("http") && !protocol.equals("https")) {
                                    throw new IOException("Unsupported scheme: ".concat(protocol));
                                }
                                sv2.b("Redirecting to ".concat(headerField));
                                httpURLConnection.disconnect();
                                url = url2;
                            } else {
                                throw new IOException("Protocol is null");
                            }
                        } else {
                            throw new IOException("Missing Location header in redirect");
                        }
                    } else {
                        this.R = httpURLConnection;
                        return httpURLConnection;
                    }
                } else {
                    throw new IOException("Invalid protocol.");
                }
            } else {
                throw new IOException("Too many redirects (20)");
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        HttpURLConnection httpURLConnection = this.R;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
    }
}