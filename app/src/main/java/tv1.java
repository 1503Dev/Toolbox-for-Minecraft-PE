package defpackage;

import android.os.SystemClock;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.TreeMap;
import java.util.TreeSet;

/* renamed from: tv1  reason: default package */
public class tv1 implements vu1 {
    public final vv1 a = new vv1();

    /* JADX WARN: Removed duplicated region for block: B:144:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0379 A[LOOP:0: B:3:0x000a->B:182:0x0379, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:192:0x02b5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0393 A[EDGE_INSN: B:218:0x0393->B:183:0x0393 ?: BREAK  , SYNTHETIC] */
    @Override // defpackage.vu1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public yu1 a(gv1 gv1Var) {
        hw1 hw1Var;
        byte[] bArr;
        jg1 jg1Var;
        jg1 jg1Var2;
        int i;
        int i2;
        Map map;
        Object obj;
        byte[] bArr2;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        while (true) {
            Collections.emptyList();
            boolean z = true;
            try {
                nu1 nu1Var = gv1Var.Y;
                if (nu1Var == null) {
                    map = Collections.emptyMap();
                } else {
                    HashMap hashMap = new HashMap();
                    String str = nu1Var.b;
                    if (str != null) {
                        hashMap.put("If-None-Match", str);
                    }
                    long j = nu1Var.d;
                    if (j > 0) {
                        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
                        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
                        hashMap.put("If-Modified-Since", simpleDateFormat.format(new Date(j)));
                    }
                    map = hashMap;
                }
                String str2 = gv1Var.R;
                HashMap hashMap2 = new HashMap();
                hashMap2.putAll(map);
                hashMap2.putAll(gv1Var.f());
                URL url = new URL(str2);
                HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                httpURLConnection.setInstanceFollowRedirects(HttpURLConnection.getFollowRedirects());
                int i3 = gv1Var.a0.a;
                httpURLConnection.setConnectTimeout(i3);
                httpURLConnection.setReadTimeout(i3);
                httpURLConnection.setUseCaches(false);
                httpURLConnection.setDoInput(true);
                "https".equals(url.getProtocol());
                try {
                    for (String str3 : hashMap2.keySet()) {
                        httpURLConnection.setRequestProperty(str3, (String) hashMap2.get(str3));
                    }
                    if (gv1Var.Q != 0) {
                        httpURLConnection.setRequestMethod("POST");
                        byte[] m = gv1Var.m();
                        if (m != null) {
                            httpURLConnection.setDoOutput(true);
                            if (!httpURLConnection.getRequestProperties().containsKey("Content-Type")) {
                                httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8");
                            }
                            DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
                            dataOutputStream.write(m);
                            dataOutputStream.close();
                        }
                    } else {
                        httpURLConnection.setRequestMethod("GET");
                    }
                    int responseCode = httpURLConnection.getResponseCode();
                    if (responseCode != -1) {
                        if ((responseCode < 100 || responseCode >= 200) && responseCode != 204 && responseCode != 304) {
                            try {
                                hw1Var = new hw1(responseCode, jw1.n(httpURLConnection.getHeaderFields()), httpURLConnection.getContentLength(), new iw1(httpURLConnection));
                            } catch (Throwable th) {
                                th = th;
                                if (!z) {
                                    try {
                                        httpURLConnection.disconnect();
                                    } catch (IOException e) {
                                        e = e;
                                        hw1Var = null;
                                        bArr = null;
                                        if (e instanceof SocketTimeoutException) {
                                            jg1Var = new jg1("socket", (ov1) new nv1());
                                        } else if (!(e instanceof MalformedURLException)) {
                                            if (hw1Var != null) {
                                                int i4 = hw1Var.a;
                                                rv1.b("Unexpected response code %d for %s", Integer.valueOf(i4), gv1Var.R);
                                                if (bArr != null) {
                                                    List<uu1> unmodifiableList = Collections.unmodifiableList(hw1Var.b);
                                                    SystemClock.elapsedRealtime();
                                                    if (unmodifiableList != null) {
                                                        if (unmodifiableList.isEmpty()) {
                                                            Collections.emptyMap();
                                                        } else {
                                                            TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
                                                            for (uu1 uu1Var : unmodifiableList) {
                                                                treeMap.put(uu1Var.a, uu1Var.b);
                                                            }
                                                        }
                                                    }
                                                    if (unmodifiableList != null) {
                                                        Collections.unmodifiableList(unmodifiableList);
                                                    }
                                                    if (i4 != 401 && i4 != 403) {
                                                        if (i4 >= 400 && i4 <= 499) {
                                                            throw new qu1();
                                                        }
                                                        throw new mv1();
                                                    }
                                                    jg1Var = new jg1("auth", (ov1) new mu1());
                                                } else {
                                                    jg1Var = new jg1("network", (ov1) new xu1());
                                                }
                                            } else {
                                                throw new zu1(e);
                                            }
                                        } else {
                                            throw new RuntimeException("Bad URL ".concat(String.valueOf(gv1Var.R)), e);
                                        }
                                        jg1Var2 = jg1Var;
                                        ru1 ru1Var = gv1Var.a0;
                                        i = ru1Var.a;
                                        try {
                                            ov1 ov1Var = (ov1) jg1Var2.Q;
                                            i2 = ru1Var.b + 1;
                                            ru1Var.b = i2;
                                            ru1Var.a = i + i;
                                            if (i2 <= 1) {
                                                gv1Var.g(String.format("%s-retry [timeout=%s]", (String) jg1Var2.P, Integer.valueOf(i)));
                                            } else {
                                                throw ov1Var;
                                            }
                                        } catch (ov1 e2) {
                                            gv1Var.g(String.format("%s-timeout-giveup [timeout=%s]", (String) jg1Var2.P, Integer.valueOf(i)));
                                            throw e2;
                                        }
                                    }
                                }
                                throw th;
                                break;
                            }
                        } else {
                            hw1Var = new hw1(responseCode, jw1.n(httpURLConnection.getHeaderFields()), -1, null);
                            httpURLConnection.disconnect();
                        }
                        try {
                            int i5 = hw1Var.a;
                            List<uu1> unmodifiableList2 = Collections.unmodifiableList(hw1Var.b);
                            if (i5 == 304) {
                                long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
                                nu1 nu1Var2 = gv1Var.Y;
                                if (nu1Var2 == null) {
                                    return new yu1(304, (byte[]) null, true, elapsedRealtime2, unmodifiableList2);
                                }
                                TreeSet treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
                                if (!unmodifiableList2.isEmpty()) {
                                    for (uu1 uu1Var2 : unmodifiableList2) {
                                        treeSet.add(uu1Var2.a);
                                    }
                                }
                                ArrayList arrayList = new ArrayList(unmodifiableList2);
                                List list = nu1Var2.h;
                                if (list != null) {
                                    if (!list.isEmpty()) {
                                        for (uu1 uu1Var3 : nu1Var2.h) {
                                            if (!treeSet.contains(uu1Var3.a)) {
                                                arrayList.add(uu1Var3);
                                            }
                                        }
                                    }
                                } else if (!nu1Var2.g.isEmpty()) {
                                    for (Map.Entry entry : nu1Var2.g.entrySet()) {
                                        if (!treeSet.contains(entry.getKey())) {
                                            arrayList.add(new uu1((String) entry.getKey(), (String) entry.getValue()));
                                        }
                                    }
                                }
                                return new yu1(304, nu1Var2.a, true, elapsedRealtime2, (List) arrayList);
                            }
                            InputStream inputStream = hw1Var.d;
                            if (inputStream == null) {
                                inputStream = null;
                            }
                            if (inputStream != null) {
                                int i6 = hw1Var.c;
                                try {
                                    vv1 vv1Var = this.a;
                                    kw1 kw1Var = new kw1(vv1Var, i6);
                                    try {
                                        bArr2 = vv1Var.b(1024);
                                        while (true) {
                                            try {
                                                int read = inputStream.read(bArr2);
                                                if (read == -1) {
                                                    break;
                                                }
                                                kw1Var.write(bArr2, 0, read);
                                            } catch (Throwable th2) {
                                                th = th2;
                                                try {
                                                    inputStream.close();
                                                    break;
                                                } catch (IOException unused) {
                                                    rv1.c("Error occurred when closing InputStream", new Object[0]);
                                                }
                                                vv1Var.a(bArr2);
                                                kw1Var.close();
                                                throw th;
                                            }
                                        }
                                        byte[] byteArray = kw1Var.toByteArray();
                                        try {
                                            inputStream.close();
                                        } catch (IOException unused2) {
                                            rv1.c("Error occurred when closing InputStream", new Object[0]);
                                        }
                                        vv1Var.a(bArr2);
                                        kw1Var.close();
                                        bArr = byteArray;
                                    } catch (Throwable th3) {
                                        th = th3;
                                        bArr2 = null;
                                    }
                                } catch (IOException e3) {
                                    e = e3;
                                    bArr = null;
                                    if (e instanceof SocketTimeoutException) {
                                    }
                                    jg1Var2 = jg1Var;
                                    ru1 ru1Var2 = gv1Var.a0;
                                    i = ru1Var2.a;
                                    ov1 ov1Var2 = (ov1) jg1Var2.Q;
                                    i2 = ru1Var2.b + 1;
                                    ru1Var2.b = i2;
                                    ru1Var2.a = i + i;
                                    if (i2 <= 1) {
                                    }
                                }
                            } else {
                                bArr = new byte[0];
                            }
                            try {
                                long elapsedRealtime3 = SystemClock.elapsedRealtime() - elapsedRealtime;
                                if (rv1.a || elapsedRealtime3 > 3000) {
                                    Object[] objArr = new Object[5];
                                    objArr[0] = gv1Var;
                                    objArr[1] = Long.valueOf(elapsedRealtime3);
                                    if (bArr != null) {
                                        obj = Integer.valueOf(bArr.length);
                                    } else {
                                        obj = "null";
                                    }
                                    objArr[2] = obj;
                                    objArr[3] = Integer.valueOf(i5);
                                    objArr[4] = Integer.valueOf(gv1Var.a0.b);
                                    rv1.a("HTTP response for request=<%s> [lifetime=%d], [size=%s], [rc=%d], [retryCount=%s]", objArr);
                                }
                                if (i5 >= 200 && i5 <= 299) {
                                    return new yu1(i5, bArr, false, SystemClock.elapsedRealtime() - elapsedRealtime, unmodifiableList2);
                                }
                                throw new IOException();
                            } catch (IOException e4) {
                                e = e4;
                                if (e instanceof SocketTimeoutException) {
                                }
                                jg1Var2 = jg1Var;
                                ru1 ru1Var22 = gv1Var.a0;
                                i = ru1Var22.a;
                                ov1 ov1Var22 = (ov1) jg1Var2.Q;
                                i2 = ru1Var22.b + 1;
                                ru1Var22.b = i2;
                                ru1Var22.a = i + i;
                                if (i2 <= 1) {
                                }
                            }
                        } catch (IOException e5) {
                            e = e5;
                        }
                    } else {
                        try {
                            throw new IOException("Could not retrieve response code from HttpUrlConnection.");
                            break;
                        } catch (Throwable th4) {
                            th = th4;
                            z = false;
                            if (!z) {
                            }
                            throw th;
                            break;
                            break;
                        }
                    }
                } catch (Throwable th5) {
                    th = th5;
                }
            } catch (IOException e6) {
                e = e6;
            }
            gv1Var.g(String.format("%s-retry [timeout=%s]", (String) jg1Var2.P, Integer.valueOf(i)));
        }
    }
}