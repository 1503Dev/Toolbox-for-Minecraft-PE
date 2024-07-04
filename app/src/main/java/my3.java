package defpackage;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: my3  reason: default package */
public final class my3 implements bl4 {
    public final Context P;
    public final String Q;

    public my3(Context context, String str) {
        this.P = context;
        this.Q = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:80:0x01f1, code lost:
        defpackage.sv2.g("Received error HTTP response code: " + r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0218, code lost:
        throw new defpackage.vu3(1, "Received error HTTP response code: " + r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0239, code lost:
        r10.disconnect();
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x023c, code lost:
        return r9;
     */
    @Override // defpackage.bl4
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ly3 e(ky3 ky3Var) {
        InputStreamReader inputStreamReader;
        BufferedOutputStream bufferedOutputStream;
        BufferedOutputStream bufferedOutputStream2;
        String str = ky3Var.a;
        int i = ky3Var.b;
        Map map = ky3Var.c;
        byte[] bArr = ky3Var.d;
        String str2 = ky3Var.e;
        jv5.A.j.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        try {
            ly3 ly3Var = new ly3();
            String str3 = this.Q;
            sv2.f("SDK version: " + str3);
            sv2.b("AdRequestServiceImpl: Sending request: " + str);
            URL url = new URL(str);
            HashMap hashMap = new HashMap();
            int i2 = 0;
            while (true) {
                HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                try {
                    jv5.A.c.s(this.P, this.Q, httpURLConnection, i);
                    for (Map.Entry entry : map.entrySet()) {
                        httpURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                    }
                    if (!TextUtils.isEmpty(str2)) {
                        httpURLConnection.setRequestProperty("Content-Type", str2);
                    }
                    int length = bArr.length;
                    if (length > 0) {
                        httpURLConnection.setDoOutput(true);
                        httpURLConnection.setFixedLengthStreamingMode(length);
                        try {
                            bufferedOutputStream2 = new BufferedOutputStream(httpURLConnection.getOutputStream());
                        } catch (Throwable th) {
                            th = th;
                            bufferedOutputStream = null;
                        }
                        try {
                            bufferedOutputStream2.write(bArr);
                            gw.j(bufferedOutputStream2);
                        } catch (Throwable th2) {
                            th = th2;
                            bufferedOutputStream = bufferedOutputStream2;
                            gw.j(bufferedOutputStream);
                            throw th;
                        }
                    }
                    rv2 rv2Var = new rv2();
                    rv2Var.a(httpURLConnection, bArr);
                    int responseCode = httpURLConnection.getResponseCode();
                    for (Map.Entry<String, List<String>> entry2 : httpURLConnection.getHeaderFields().entrySet()) {
                        String key = entry2.getKey();
                        List<String> value = entry2.getValue();
                        if (hashMap.containsKey(key)) {
                            ((List) hashMap.get(key)).addAll(value);
                        } else {
                            hashMap.put(key, new ArrayList(value));
                            str2 = str2;
                        }
                    }
                    String str4 = str2;
                    rv2Var.b(httpURLConnection, responseCode);
                    ly3Var.a = responseCode;
                    ly3Var.b = hashMap;
                    ly3Var.c = "";
                    if (responseCode >= 200 && responseCode < 300) {
                        try {
                            InputStreamReader inputStreamReader2 = new InputStreamReader(httpURLConnection.getInputStream());
                            try {
                                jv5 jv5Var = jv5.A;
                                cu5 cu5Var = jv5Var.c;
                                StringBuilder sb = new StringBuilder(8192);
                                char[] cArr = new char[2048];
                                while (true) {
                                    int read = inputStreamReader2.read(cArr);
                                    if (read == -1) {
                                        break;
                                    }
                                    sb.append(cArr, 0, read);
                                }
                                String sb2 = sb.toString();
                                gw.j(inputStreamReader2);
                                if (rv2.c() && sb2 != null) {
                                    rv2Var.d("onNetworkResponseBody", new a53(sb2.getBytes()));
                                }
                                ly3Var.c = sb2;
                                if (TextUtils.isEmpty(sb2)) {
                                    if (!((Boolean) w82.d.c.a(x92.v4)).booleanValue()) {
                                        throw new vu3(3);
                                    }
                                }
                                jv5Var.j.getClass();
                                ly3Var.d = SystemClock.elapsedRealtime() - elapsedRealtime;
                            } catch (Throwable th3) {
                                th = th3;
                                inputStreamReader = inputStreamReader2;
                                gw.j(inputStreamReader);
                                throw th;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            inputStreamReader = null;
                        }
                    } else if (responseCode < 300 || responseCode >= 400) {
                        break;
                    } else {
                        String headerField = httpURLConnection.getHeaderField("Location");
                        if (!TextUtils.isEmpty(headerField)) {
                            URL url2 = new URL(headerField);
                            i2++;
                            if (i2 <= ((Integer) w82.d.c.a(x92.h4)).intValue()) {
                                httpURLConnection.disconnect();
                                url = url2;
                                str2 = str4;
                            } else {
                                sv2.g("Too many redirects.");
                                throw new vu3(1, "Too many redirects");
                            }
                        } else {
                            sv2.g("No location header to follow redirect.");
                            throw new vu3(1, "No location header to follow redirect");
                        }
                    }
                } catch (vu3 e) {
                    if (((Boolean) w82.d.c.a(x92.X6)).booleanValue()) {
                        jv5.A.j.getClass();
                        ly3Var.d = SystemClock.elapsedRealtime() - elapsedRealtime;
                    } else {
                        throw e;
                    }
                }
            }
        } catch (IOException e2) {
            String concat = "Error while connecting to ad server: ".concat(String.valueOf(e2.getMessage()));
            sv2.g(concat);
            throw new vu3(concat, e2);
        }
    }
}