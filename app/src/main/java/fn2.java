package defpackage;

import android.os.RemoteException;
import android.util.JsonReader;
import defpackage.b70;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collections;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: fn2  reason: default package */
public final class fn2 implements i50, h23, b70.c {
    public final Object P;
    public final Object Q;
    public final Object R;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    public /* synthetic */ fn2(JsonReader jsonReader) {
        ?? emptyList = Collections.emptyList();
        ArrayList arrayList = new ArrayList();
        jsonReader.beginObject();
        ci4 ci4Var = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if ("responses".equals(nextName)) {
                jsonReader.beginArray();
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String nextName2 = jsonReader.nextName();
                    if ("ad_configs".equals(nextName2)) {
                        emptyList = new ArrayList();
                        jsonReader.beginArray();
                        while (jsonReader.hasNext()) {
                            emptyList.add(new yh4(jsonReader));
                        }
                        jsonReader.endArray();
                    } else if (nextName2.equals("common")) {
                        ci4Var = new ci4(jsonReader);
                    } else {
                        jsonReader.skipValue();
                    }
                }
                jsonReader.endObject();
            } else if (nextName.equals("actions")) {
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    jsonReader.beginObject();
                    String str = null;
                    JSONObject jSONObject = null;
                    while (jsonReader.hasNext()) {
                        String nextName3 = jsonReader.nextName();
                        if ("name".equals(nextName3)) {
                            str = jsonReader.nextString();
                        } else if ("info".equals(nextName3)) {
                            jSONObject = mq2.f(jsonReader);
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    if (str != null) {
                        arrayList.add(new gi4(str, jSONObject));
                    }
                    jsonReader.endObject();
                }
            }
            jsonReader.endArray();
        }
        this.R = arrayList;
        this.P = emptyList;
        this.Q = ci4Var == null ? new ci4(new JsonReader(new StringReader("{}"))) : ci4Var;
    }

    public /* synthetic */ fn2(Object obj, Object obj2, Object obj3) {
        this.P = obj;
        this.Q = obj2;
        this.R = obj3;
    }

    public /* synthetic */ fn2(ln2 ln2Var, qm2 qm2Var, cl2 cl2Var) {
        this.R = ln2Var;
        this.P = qm2Var;
        this.Q = cl2Var;
    }

    public static fn2 a(Reader reader) {
        try {
            try {
                return new fn2(new JsonReader(reader));
            } finally {
                gw.j(reader);
            }
        } catch (IOException | AssertionError | IllegalStateException | NumberFormatException | JSONException e) {
            throw new di4("unable to parse ServerResponse", e);
        }
    }

    @Override // defpackage.i50
    public final void c(n2 n2Var) {
        try {
            ((qm2) this.P).p(n2Var.a());
        } catch (RemoteException e) {
            sv2.e("", e);
        }
    }

    @Override // defpackage.h23
    public final void d(boolean z) {
        po3 po3Var = (po3) this.P;
        y03 y03Var = (y03) this.Q;
        ax2 ax2Var = (ax2) this.R;
        if (z) {
            if (po3Var.a.a != null && y03Var.q() != null) {
                y03Var.q().v4(po3Var.a.a);
            }
            ax2Var.d();
            return;
        }
        po3Var.getClass();
        ax2Var.c(new l44(1, "Html video Web View failed to load."));
    }
}