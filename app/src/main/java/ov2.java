package defpackage;

import android.util.JsonWriter;

/* renamed from: ov2  reason: default package */
public final /* synthetic */ class ov2 implements qv2, i52 {
    public final /* synthetic */ String P;

    public /* synthetic */ ov2(String str) {
        this.P = str;
    }

    @Override // defpackage.qv2
    public final void a(JsonWriter jsonWriter) {
        String str = this.P;
        Object obj = rv2.b;
        jsonWriter.name("params").beginObject();
        if (str != null) {
            jsonWriter.name("error_description").value(str);
        }
        jsonWriter.endObject();
    }

    @Override // defpackage.i52
    public final void j(t62 t62Var) {
        String str = this.P;
        t62Var.j();
        u62.B((u62) t62Var.Q, str);
    }
}