package defpackage;

import android.util.JsonReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import org.json.JSONException;

/* renamed from: bt1  reason: default package */
public final /* synthetic */ class bt1 implements ky4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ bt1(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.ky4
    public final dz4 e(Object obj) {
        switch (this.a) {
            case 0:
                ew1 ew1Var = new ew1(new JsonReader(new InputStreamReader((InputStream) obj)));
                try {
                    ew1Var.b = n62.f.a.f(((rq2) this.b).P).toString();
                } catch (JSONException unused) {
                    ew1Var.b = "{}";
                }
                return zw4.C(ew1Var);
            default:
                return (dz4) this.b;
        }
    }
}