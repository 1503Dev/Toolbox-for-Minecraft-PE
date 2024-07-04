package defpackage;

import android.util.Base64;
import android.util.JsonWriter;
import java.util.Map;

/* renamed from: pv2  reason: default package */
public final /* synthetic */ class pv2 implements qv2 {
    public final /* synthetic */ String P;
    public final /* synthetic */ String Q;
    public final /* synthetic */ Map R;
    public final /* synthetic */ byte[] S;

    public /* synthetic */ pv2(String str, String str2, Map map, byte[] bArr) {
        this.P = str;
        this.Q = str2;
        this.R = map;
        this.S = bArr;
    }

    @Override // defpackage.qv2
    public final void a(JsonWriter jsonWriter) {
        String str = this.P;
        String str2 = this.Q;
        Map map = this.R;
        byte[] bArr = this.S;
        jsonWriter.name("params").beginObject();
        jsonWriter.name("firstline").beginObject();
        jsonWriter.name("uri").value(str);
        jsonWriter.name("verb").value(str2);
        jsonWriter.endObject();
        rv2.e(jsonWriter, map);
        if (bArr != null) {
            jsonWriter.name("body").value(Base64.encodeToString(bArr, 0));
        }
        jsonWriter.endObject();
    }
}