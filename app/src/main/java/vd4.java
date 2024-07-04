package defpackage;

import java.util.concurrent.Callable;
import org.json.JSONObject;

/* renamed from: vd4  reason: default package */
public final class vd4 implements nc4 {
    public final ez4 a;

    public vd4(yw2 yw2Var) {
        this.a = yw2Var;
    }

    @Override // defpackage.nc4
    public final int a() {
        return 45;
    }

    @Override // defpackage.nc4
    public final dz4 c() {
        return this.a.b(new Callable() { // from class: ud4
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new wd4(new JSONObject());
            }
        });
    }
}