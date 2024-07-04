package defpackage;

import android.util.Base64;
import android.util.JsonWriter;

/* renamed from: a53  reason: default package */
public final class a53 implements qv2, mg {
    public final Object P;

    public /* synthetic */ a53(Object obj) {
        this.P = obj;
    }

    @Override // defpackage.qv2
    public final void a(JsonWriter jsonWriter) {
        String str;
        byte[] bArr = (byte[]) this.P;
        Object obj = rv2.b;
        jsonWriter.name("params").beginObject();
        int length = bArr.length;
        String encodeToString = Base64.encodeToString(bArr, 0);
        if (length < 10000) {
            str = "body";
        } else {
            encodeToString = mv2.m(encodeToString, "MD5");
            str = encodeToString != null ? "bodydigest" : "bodydigest";
            jsonWriter.name("bodylength").value(length);
            jsonWriter.endObject();
        }
        jsonWriter.name(str).value(encodeToString);
        jsonWriter.name("bodylength").value(length);
        jsonWriter.endObject();
    }

    @Override // defpackage.mg
    public final Object b(yv0 yv0Var) {
        Exception exc;
        et5 et5Var = (et5) this.P;
        if (!yv0Var.l() && !yv0Var.j()) {
            Exception h = yv0Var.h();
            if (h instanceof m4) {
                int i = ((m4) h).P.Q;
                if (i != 43001 && i != 43002 && i != 43003 && i != 17) {
                    if (i == 43000) {
                        exc = new Exception("Failed to get app set ID due to an internal error. Please try again later.");
                    } else if (i == 15) {
                        exc = new Exception("The operation to get app set ID timed out. Please try again later.");
                    } else {
                        return yv0Var;
                    }
                    return dw0.a(exc);
                }
                return et5Var.b.a();
            }
            return yv0Var;
        }
        return yv0Var;
    }
}