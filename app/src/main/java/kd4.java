package defpackage;

import java.util.concurrent.Callable;
import org.json.JSONObject;

/* renamed from: kd4  reason: default package */
public final class kd4 implements nc4 {
    public final ez4 a;

    public kd4(yw2 yw2Var) {
        this.a = yw2Var;
    }

    @Override // defpackage.nc4
    public final int a() {
        return 42;
    }

    @Override // defpackage.nc4
    public final dz4 c() {
        return this.a.b(new Callable() { // from class: jd4
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new ld4(new JSONObject());
            }
        });
    }
}