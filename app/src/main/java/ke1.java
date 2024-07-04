package defpackage;

import android.content.Context;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;

/* renamed from: ke1  reason: default package */
public final class ke1 implements Runnable {
    public HttpURLConnection P;
    public InputStream Q;
    public rc1 R;
    public a S;
    public String U;
    public Map<String, List<String>> X;
    public boolean c0;
    public int d0;
    public int e0;
    public qc1 T = null;
    public int V = 0;
    public boolean W = false;
    public String Y = "";
    public String Z = "";
    public String a0 = "";
    public String b0 = "";

    /* renamed from: ke1$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public interface a {
        void a(ke1 ke1Var, rc1 rc1Var, Map<String, List<String>> map);
    }

    public ke1(rc1 rc1Var, a aVar) {
        this.R = rc1Var;
        this.S = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x01a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b() {
        boolean z;
        HttpURLConnection httpURLConnection;
        String str;
        InputStream fileInputStream;
        qc1 qc1Var;
        ic1 ic1Var = this.R.b;
        String q = ic1Var.q("content_type");
        String q2 = ic1Var.q("content");
        ic1 o = ic1Var.o("dictionaries");
        ic1 o2 = ic1Var.o("dictionaries_mapping");
        this.a0 = ic1Var.q("url");
        if (o != null) {
            HashMap i = o.i();
            LinkedHashMap linkedHashMap = qc1.e;
            synchronized (linkedHashMap) {
                linkedHashMap.putAll(i);
                j21 j21Var = j21.a;
            }
        }
        if (ga1.h().W && o2 != null) {
            String o3 = eb1.o(o2, "request");
            String o4 = eb1.o(o2, "response");
            LinkedHashMap linkedHashMap2 = qc1.e;
            if (o3 != null && o4 != null) {
                LinkedHashMap linkedHashMap3 = qc1.e;
                synchronized (linkedHashMap3) {
                    if (!linkedHashMap3.containsKey(o3)) {
                        o3 = "default";
                    }
                    if (!linkedHashMap3.containsKey(o4)) {
                        o4 = "default";
                    }
                    qc1Var = new qc1(o3, o4, (String) linkedHashMap3.get(o3), (String) linkedHashMap3.get(o4));
                }
            } else {
                qc1Var = null;
            }
            this.T = qc1Var;
        }
        String q3 = ic1Var.q("user_agent");
        int a2 = ic1Var.a(60000, "read_timeout");
        int a3 = ic1Var.a(60000, "connect_timeout");
        boolean j = ic1Var.j("no_redirect");
        this.a0 = ic1Var.q("url");
        this.Y = ic1Var.q("filepath");
        StringBuilder sb = new StringBuilder();
        sb.append(ga1.h().r().d);
        String str2 = this.Y;
        sb.append(str2.substring(str2.lastIndexOf("/") + 1));
        this.Z = sb.toString();
        this.U = ic1Var.q("encoding");
        int a4 = ic1Var.a(0, "max_size");
        this.V = a4;
        if (a4 != 0) {
            z = true;
        } else {
            z = false;
        }
        this.W = z;
        this.d0 = 0;
        this.Q = null;
        this.P = null;
        this.X = null;
        if (this.a0.startsWith("file://")) {
            if (this.a0.startsWith("file:///android_asset/")) {
                Context context = ga1.P;
                if (context != null) {
                    fileInputStream = context.getAssets().open(this.a0.substring(22));
                }
            } else {
                fileInputStream = new FileInputStream(this.a0.substring(7));
            }
            this.Q = fileInputStream;
        } else {
            HttpURLConnection httpURLConnection2 = (HttpURLConnection) new URL(this.a0).openConnection();
            this.P = httpURLConnection2;
            httpURLConnection2.setReadTimeout(a2);
            this.P.setConnectTimeout(a3);
            this.P.setInstanceFollowRedirects(!j);
            if (q3 != null && !q3.equals("")) {
                this.P.setRequestProperty("User-Agent", q3);
            }
            if (this.T != null) {
                this.P.setRequestProperty("Content-Type", "application/octet-stream");
                this.P.setRequestProperty("Req-Dict-Id", this.T.a);
                httpURLConnection = this.P;
                q = this.T.b;
                str = "Resp-Dict-Id";
            } else {
                this.P.setRequestProperty("Accept-Charset", sc1.a.name());
                if (!q.equals("")) {
                    httpURLConnection = this.P;
                    str = "Content-Type";
                }
                if (this.R.a.equals("WebServices.post")) {
                    this.P.setDoOutput(true);
                    qc1 qc1Var2 = this.T;
                    if (qc1Var2 != null) {
                        Charset charset = sc1.a;
                        byte[] bytes = q2.getBytes(charset);
                        String str3 = qc1Var2.c;
                        Deflater deflater = new Deflater();
                        try {
                            if (str3 != null) {
                                deflater.setDictionary(str3.getBytes(charset));
                                deflater.setInput(bytes);
                                deflater.finish();
                                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                byte[] bArr = new byte[512];
                                while (!deflater.finished()) {
                                    byteArrayOutputStream.write(bArr, 0, deflater.deflate(bArr));
                                }
                                byte[] byteArray = byteArrayOutputStream.toByteArray();
                                vj.l(byteArrayOutputStream, null);
                                deflater.end();
                                this.P.setFixedLengthStreamingMode(byteArray.length);
                                this.P.getOutputStream().write(byteArray);
                                this.P.getOutputStream().flush();
                            } else {
                                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                            }
                        } catch (Throwable th) {
                            deflater.end();
                            throw th;
                        }
                    } else {
                        this.P.setFixedLengthStreamingMode(q2.getBytes(sc1.a).length);
                        new PrintStream(this.P.getOutputStream()).print(q2);
                    }
                }
            }
            httpURLConnection.setRequestProperty(str, q);
            if (this.R.a.equals("WebServices.post")) {
            }
        }
        if (this.P != null || this.Q != null) {
            return true;
        }
        return false;
    }

    public final void c() {
        OutputStream outputStream;
        InputStream errorStream;
        String byteArrayOutputStream;
        String str = this.R.a;
        if (this.Q != null) {
            if (this.Y.length() == 0) {
                outputStream = new ByteArrayOutputStream(4096);
            } else {
                outputStream = new FileOutputStream(new File(this.Y).getAbsolutePath());
            }
        } else if (str.equals("WebServices.download")) {
            this.Q = this.P.getInputStream();
            outputStream = new FileOutputStream(this.Z);
        } else if (str.equals("WebServices.get")) {
            this.Q = this.P.getInputStream();
            outputStream = new ByteArrayOutputStream(4096);
        } else if (str.equals("WebServices.post")) {
            this.P.connect();
            if (this.P.getResponseCode() >= 200 && this.P.getResponseCode() <= 299) {
                errorStream = this.P.getInputStream();
            } else {
                errorStream = this.P.getErrorStream();
            }
            this.Q = errorStream;
            outputStream = new ByteArrayOutputStream(4096);
        } else {
            outputStream = null;
        }
        HttpURLConnection httpURLConnection = this.P;
        if (httpURLConnection != null) {
            this.e0 = httpURLConnection.getResponseCode();
            this.X = this.P.getHeaderFields();
        }
        InputStream inputStream = this.Q;
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
            byte[] bArr = new byte[4096];
            while (true) {
                int read = bufferedInputStream.read(bArr, 0, 4096);
                if (read != -1) {
                    int i = this.d0 + read;
                    this.d0 = i;
                    if (this.W && i > this.V) {
                        throw new Exception("Data exceeds expected maximum (" + this.d0 + "/" + this.V + "): " + this.P.getURL().toString());
                    }
                    outputStream.write(bArr, 0, read);
                } else {
                    String str2 = "UTF-8";
                    String str3 = this.U;
                    if (str3 != null && !str3.isEmpty()) {
                        str2 = this.U;
                    }
                    if (outputStream instanceof ByteArrayOutputStream) {
                        String headerField = this.P.getHeaderField("Content-Type");
                        if (this.T != null && headerField != null && headerField.contains("application/octet-stream") && ((ByteArrayOutputStream) outputStream).size() != 0) {
                            byteArrayOutputStream = this.T.a(((ByteArrayOutputStream) outputStream).toByteArray());
                        } else {
                            byteArrayOutputStream = ((ByteArrayOutputStream) outputStream).toString(str2);
                        }
                        this.b0 = byteArrayOutputStream;
                    }
                    bufferedInputStream.close();
                    if (inputStream != null) {
                        return;
                    }
                    return;
                }
            }
        } finally {
            if (outputStream != null) {
                outputStream.close();
            }
            if (inputStream != null) {
                inputStream.close();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        boolean z;
        boolean z2;
        this.c0 = false;
        try {
            if (b()) {
                c();
                if (this.R.a.equals("WebServices.post") && this.e0 != 200) {
                    z2 = false;
                    this.c0 = z2;
                }
                z2 = true;
                this.c0 = z2;
            }
        } catch (IOException e) {
            StringBuilder b = e5.b("Download of ");
            b.append(this.a0);
            b.append(" failed: ");
            b.append(e.toString());
            t1.b(0, 1, b.toString(), true);
            int i = this.e0;
            if (i == 0) {
                i = 504;
            }
            this.e0 = i;
        } catch (AssertionError e2) {
            StringBuilder b2 = e5.b("okhttp error: ");
            b2.append(e2.toString());
            ga1.h().n().d(0, 0, b2.toString(), false);
            e2.printStackTrace();
        } catch (IllegalArgumentException e3) {
            e = e3;
            StringBuilder b3 = e5.b("Exception, possibly response encoded with different dictionary: ");
            b3.append(e.toString());
            t1.b(0, 0, b3.toString(), true);
            e.printStackTrace();
        } catch (IllegalStateException e4) {
            StringBuilder b4 = e5.b("okhttp error: ");
            b4.append(e4.toString());
            ga1.h().n().d(0, 0, b4.toString(), false);
            e4.printStackTrace();
            z = false;
            if (z) {
            }
        } catch (MalformedURLException e5) {
            StringBuilder b5 = e5.b("MalformedURLException: ");
            b5.append(e5.toString());
            t1.b(0, 0, b5.toString(), true);
            this.c0 = true;
        } catch (Exception e6) {
            e = e6;
            StringBuilder b6 = e5.b("Exception: ");
            b6.append(e.toString());
            t1.b(0, 0, b6.toString(), false);
            e.printStackTrace();
        } catch (OutOfMemoryError unused) {
            StringBuilder b7 = e5.b("Out of memory error - disabling AdColony. (");
            b7.append(this.d0);
            b7.append("/");
            b7.append(this.V);
            b7.append("): " + this.a0);
            ga1.h().n().d(0, 0, b7.toString(), false);
            ga1.h().j();
        } catch (DataFormatException e7) {
            StringBuilder b8 = e5.b("Exception, possibly trying to decompress plain response: ");
            b8.append(e7.toString());
            ga1.h().n().d(0, 0, b8.toString(), true);
            e7.printStackTrace();
            z = false;
            if (z) {
            }
        }
        z = true;
        if (z) {
            if (this.R.a.equals("WebServices.download")) {
                String str = this.Z;
                String str2 = this.Y;
                try {
                    String substring = str2.substring(0, str2.lastIndexOf("/") + 1);
                    if (!str2.equals("") && !substring.equals(ga1.h().r().d) && !new File(str).renameTo(new File(str2))) {
                        ga1.h().n().d(0, 1, "Moving of " + str + " failed.", true);
                    }
                } catch (Exception e8) {
                    StringBuilder b9 = e5.b("Exception: ");
                    b9.append(e8.toString());
                    ga1.h().n().d(0, 0, b9.toString(), false);
                    e8.printStackTrace();
                }
            }
            this.S.a(this, this.R, this.X);
        }
    }
}