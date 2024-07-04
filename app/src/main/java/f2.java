package defpackage;

import android.util.JsonReader;
import android.util.SparseArray;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: f2  reason: default package */
public final class f2 implements bl4, wy4 {
    public Object P;
    public Object Q;

    public /* synthetic */ f2(Object obj, Object obj2) {
        this.P = obj2;
        this.Q = obj;
    }

    public /* synthetic */ f2(String str, String str2) {
        if (eg1.u(str) || eg1.u(str2)) {
            this.P = str;
            this.Q = str2;
        }
    }

    public /* synthetic */ f2(JSONObject jSONObject, tq2 tq2Var) {
        this.P = jSONObject;
        this.Q = tq2Var;
    }

    public final boolean a(int i) {
        return ((hp1) this.P).a.get(i);
    }

    @Override // defpackage.bl4
    public final Object e(Object obj) {
        JSONObject jSONObject = (JSONObject) this.P;
        tq2 tq2Var = (tq2) this.Q;
        InputStreamReader inputStreamReader = new InputStreamReader((InputStream) obj);
        try {
            try {
                JsonReader jsonReader = new JsonReader(inputStreamReader);
                HashMap hashMap = new HashMap();
                long j = -1;
                String str = "";
                jsonReader.beginObject();
                int i = 0;
                while (jsonReader.hasNext()) {
                    String nextName = jsonReader.nextName();
                    if ("response".equals(nextName)) {
                        i = jsonReader.nextInt();
                    } else if ("body".equals(nextName)) {
                        str = jsonReader.nextString();
                    } else if ("latency".equals(nextName)) {
                        j = jsonReader.nextLong();
                    } else if ("headers".equals(nextName)) {
                        hashMap = new HashMap();
                        jsonReader.beginObject();
                        while (jsonReader.hasNext()) {
                            hashMap.put(jsonReader.nextName(), mq2.c(jsonReader));
                        }
                        jsonReader.endObject();
                    } else {
                        jsonReader.skipValue();
                    }
                }
                jsonReader.endObject();
                ly3 ly3Var = new ly3();
                ly3Var.a = i;
                if (str != null) {
                    ly3Var.c = str;
                }
                ly3Var.d = j;
                ly3Var.b = hashMap;
                gw.j(inputStreamReader);
                return new by3(ly3Var, jSONObject, tq2Var);
            } catch (Throwable th) {
                gw.j(inputStreamReader);
                throw th;
            }
        } catch (IOException | AssertionError | IllegalStateException | NumberFormatException e) {
            throw new di4("Unable to parse Response", e);
        }
    }

    @Override // defpackage.wy4
    public final void f(Object obj) {
        ((jl4) this.Q).f.c.K((el4) this.P);
    }

    @Override // defpackage.wy4
    public final void h(Throwable th) {
        ((jl4) this.Q).f.c.E0((el4) this.P, th);
    }

    public f2(hp1 hp1Var, SparseArray sparseArray) {
        this.P = hp1Var;
        SparseArray sparseArray2 = new SparseArray(hp1Var.a.size());
        for (int i = 0; i < hp1Var.a.size(); i++) {
            int a = hp1Var.a(i);
            io5 io5Var = (io5) sparseArray.get(a);
            io5Var.getClass();
            sparseArray2.append(a, io5Var);
        }
        this.Q = sparseArray2;
    }
}