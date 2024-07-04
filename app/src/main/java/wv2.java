package defpackage;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/* renamed from: wv2  reason: default package */
public class wv2 implements lv2 {
    public final String P;

    public wv2() {
        this.P = null;
    }

    public wv2(String str) {
        this.P = str;
    }

    @Override // defpackage.lv2
    public boolean m(String str) {
        StringBuilder sb;
        HttpURLConnection httpURLConnection;
        int responseCode;
        boolean z = false;
        try {
            sv2.b("Pinging URL: " + str);
            httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            try {
                mv2 mv2Var = n62.f.a;
                String str2 = this.P;
                httpURLConnection.setConnectTimeout(60000);
                httpURLConnection.setInstanceFollowRedirects(true);
                httpURLConnection.setReadTimeout(60000);
                if (str2 != null) {
                    httpURLConnection.setRequestProperty("User-Agent", str2);
                }
                httpURLConnection.setUseCaches(false);
                rv2 rv2Var = new rv2();
                rv2Var.a(httpURLConnection, null);
                responseCode = httpURLConnection.getResponseCode();
                rv2Var.b(httpURLConnection, responseCode);
            } catch (Throwable th) {
                httpURLConnection.disconnect();
                throw th;
            }
        } catch (IOException e) {
            e = e;
            String message = e.getMessage();
            sb = new StringBuilder();
            sb.append("Error while pinging URL: ");
            sb.append(str);
            sb.append(". ");
            sb.append(message);
            sv2.g(sb.toString());
            return z;
        } catch (IndexOutOfBoundsException e2) {
            String message2 = e2.getMessage();
            sb = new StringBuilder();
            sb.append("Error while parsing ping URL: ");
            sb.append(str);
            sb.append(". ");
            sb.append(message2);
            sv2.g(sb.toString());
            return z;
        } catch (RuntimeException e3) {
            e = e3;
            String message3 = e.getMessage();
            sb = new StringBuilder();
            sb.append("Error while pinging URL: ");
            sb.append(str);
            sb.append(". ");
            sb.append(message3);
            sv2.g(sb.toString());
            return z;
        }
        if (responseCode >= 200 && responseCode < 300) {
            z = true;
            httpURLConnection.disconnect();
            return z;
        }
        sv2.g("Received non-success response code " + responseCode + " from pinging URL: " + str);
        httpURLConnection.disconnect();
        return z;
    }
}