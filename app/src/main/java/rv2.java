package defpackage;

import android.util.JsonWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* renamed from: rv2  reason: default package */
public final class rv2 {
    public static boolean c = false;
    public static boolean d = false;
    public final List a;
    public static final Object b = new Object();
    public static final HashSet e = new HashSet(Arrays.asList(new String[0]));

    public rv2() {
        this.a = !c() ? new ArrayList() : Arrays.asList("network_request_".concat(String.valueOf(UUID.randomUUID().toString())));
    }

    public static boolean c() {
        boolean z;
        synchronized (b) {
            z = false;
            if (c && d) {
                z = true;
            }
        }
        return z;
    }

    public static void e(JsonWriter jsonWriter, Map map) {
        if (map == null) {
            return;
        }
        jsonWriter.name("headers").beginArray();
        Iterator it = map.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getKey();
            if (!e.contains(str)) {
                if (!(entry.getValue() instanceof List)) {
                    if (!(entry.getValue() instanceof String)) {
                        sv2.d("Connection headers should be either Map<String, String> or Map<String, List<String>>");
                        break;
                    }
                    jsonWriter.beginObject();
                    jsonWriter.name("name").value(str);
                    jsonWriter.name("value").value((String) entry.getValue());
                    jsonWriter.endObject();
                } else {
                    for (String str2 : (List) entry.getValue()) {
                        jsonWriter.beginObject();
                        jsonWriter.name("name").value(str);
                        jsonWriter.name("value").value(str2);
                        jsonWriter.endObject();
                    }
                }
            }
        }
        jsonWriter.endArray();
    }

    public final void a(HttpURLConnection httpURLConnection, byte[] bArr) {
        if (c()) {
            d("onNetworkRequest", new pv2(new String(httpURLConnection.getURL().toString()), new String(httpURLConnection.getRequestMethod()), httpURLConnection.getRequestProperties() == null ? null : new HashMap(httpURLConnection.getRequestProperties()), bArr));
        }
    }

    public final void b(HttpURLConnection httpURLConnection, int i) {
        HashMap hashMap;
        if (!c()) {
            return;
        }
        String str = null;
        if (httpURLConnection.getHeaderFields() == null) {
            hashMap = null;
        } else {
            hashMap = new HashMap(httpURLConnection.getHeaderFields());
        }
        d("onNetworkResponse", new nv2(i, hashMap));
        if (i >= 200 && i < 300) {
            return;
        }
        try {
            str = httpURLConnection.getResponseMessage();
        } catch (IOException e2) {
            sv2.g("Can not get error message from error HttpURLConnection\n".concat(String.valueOf(e2.getMessage())));
        }
        d("onNetworkRequestError", new ov2(str));
    }

    public final void d(String str, qv2 qv2Var) {
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        try {
            jsonWriter.beginObject();
            jsonWriter.name("timestamp").value(System.currentTimeMillis());
            jsonWriter.name("event").value(str);
            jsonWriter.name("components").beginArray();
            for (String str2 : this.a) {
                jsonWriter.value(str2);
            }
            jsonWriter.endArray();
            qv2Var.a(jsonWriter);
            jsonWriter.endObject();
            jsonWriter.flush();
            jsonWriter.close();
        } catch (IOException e2) {
            sv2.e("unable to log", e2);
        }
        String stringWriter2 = stringWriter.toString();
        synchronized (rv2.class) {
            sv2.f("GMA Debug BEGIN");
            int i = 0;
            while (i < stringWriter2.length()) {
                int i2 = i + 4000;
                sv2.f("GMA Debug CONTENT ".concat(String.valueOf(stringWriter2.substring(i, Math.min(i2, stringWriter2.length())))));
                i = i2;
            }
            sv2.f("GMA Debug FINISH");
        }
    }
}