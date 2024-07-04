package defpackage;

import android.util.JsonWriter;
import java.util.Map;

/* renamed from: nv2  reason: default package */
public final /* synthetic */ class nv2 implements qv2 {
    public final /* synthetic */ int P;
    public final /* synthetic */ Map Q;

    public /* synthetic */ nv2(int i, Map map) {
        this.P = i;
        this.Q = map;
    }

    @Override // defpackage.qv2
    public final void a(JsonWriter jsonWriter) {
        int i = this.P;
        Map map = this.Q;
        jsonWriter.name("params").beginObject();
        jsonWriter.name("firstline").beginObject();
        jsonWriter.name("code").value(i);
        jsonWriter.endObject();
        rv2.e(jsonWriter, map);
        jsonWriter.endObject();
    }
}