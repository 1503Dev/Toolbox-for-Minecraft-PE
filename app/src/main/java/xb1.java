package defpackage;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Serializable;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.zip.GZIPOutputStream;

/* renamed from: xb1  reason: default package */
public final class xb1 {
    public Serializable a;

    public /* synthetic */ xb1(URL url) {
        this.a = url;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0084 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0090  */
    /* JADX WARN: Type inference failed for: r3v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(String str) {
        OutputStream outputStream;
        DataOutputStream dataOutputStream;
        OutputStream outputStream2;
        OutputStream outputStream3;
        HttpURLConnection httpURLConnection;
        boolean z = true;
        OutputStream outputStream4 = null;
        boolean z2 = false;
        try {
            httpURLConnection = (HttpURLConnection) ((URL) this.a).openConnection();
            try {
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
                httpURLConnection.setRequestProperty("Content-Type", "application/json");
                httpURLConnection.setDoInput(true);
                outputStream3 = new GZIPOutputStream(httpURLConnection.getOutputStream());
            } catch (IOException e) {
                e = e;
                dataOutputStream = null;
            } catch (Throwable th) {
                th = th;
                outputStream = null;
                dataOutputStream = null;
                outputStream4 = httpURLConnection;
                z = false;
                httpURLConnection = outputStream4;
                outputStream3 = outputStream;
                outputStream4 = dataOutputStream;
                httpURLConnection = httpURLConnection;
                z2 = z;
                if (outputStream4 != null) {
                    outputStream4.close();
                }
                if (outputStream3 != null) {
                }
                if (httpURLConnection != 0) {
                }
                throw th;
            }
        } catch (IOException e2) {
            e = e2;
            outputStream2 = null;
            dataOutputStream = null;
        } catch (Throwable th2) {
            th = th2;
            outputStream = null;
            dataOutputStream = null;
        }
        try {
            dataOutputStream = new DataOutputStream(outputStream3);
        } catch (IOException e3) {
            e = e3;
            dataOutputStream = null;
        } catch (Throwable th3) {
            th = th3;
            if (outputStream4 != null) {
            }
            if (outputStream3 != null) {
            }
            if (httpURLConnection != 0) {
            }
            throw th;
        }
        try {
            dataOutputStream.write(str.getBytes(sc1.a));
            dataOutputStream.close();
            try {
                httpURLConnection.getResponseCode();
                outputStream3.close();
                if (httpURLConnection.getInputStream() != null) {
                    httpURLConnection.getInputStream().close();
                }
                httpURLConnection.disconnect();
            } catch (IOException e4) {
                e = e4;
                outputStream4 = outputStream3;
                z2 = z;
                outputStream2 = outputStream4;
                outputStream4 = httpURLConnection;
                try {
                    throw e;
                } catch (Throwable th4) {
                    th = th4;
                    boolean z3 = z2;
                    outputStream = outputStream2;
                    z = z3;
                    httpURLConnection = outputStream4;
                    outputStream3 = outputStream;
                    outputStream4 = dataOutputStream;
                    httpURLConnection = httpURLConnection;
                    z2 = z;
                    if (outputStream4 != null && !z2) {
                        outputStream4.close();
                    }
                    if (outputStream3 != null) {
                        outputStream3.close();
                    }
                    if (httpURLConnection != 0) {
                        if (httpURLConnection.getInputStream() != null) {
                            httpURLConnection.getInputStream().close();
                        }
                        httpURLConnection.disconnect();
                    }
                    throw th;
                }
            } catch (Throwable th5) {
                th = th5;
                outputStream4 = dataOutputStream;
                httpURLConnection = httpURLConnection;
                z2 = z;
                if (outputStream4 != null) {
                }
                if (outputStream3 != null) {
                }
                if (httpURLConnection != 0) {
                }
                throw th;
            }
        } catch (IOException e5) {
            e = e5;
            outputStream4 = outputStream3;
            z = false;
            z2 = z;
            outputStream2 = outputStream4;
            outputStream4 = httpURLConnection;
            throw e;
        } catch (Throwable th6) {
            th = th6;
            outputStream4 = dataOutputStream;
            z = false;
            httpURLConnection = httpURLConnection;
            z2 = z;
            if (outputStream4 != null) {
            }
            if (outputStream3 != null) {
            }
            if (httpURLConnection != 0) {
            }
            throw th;
        }
    }
}