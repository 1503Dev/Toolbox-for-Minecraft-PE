package defpackage;

import android.content.Context;
import android.os.Looper;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONException;
import org.json.JSONObject;

@ParametersAreNonnullByDefault
/* renamed from: zi2  reason: default package */
public final class zi2 implements ui2, qi2 {
    public final l13 P;

    public zi2(Context context, xv2 xv2Var) {
        k13 k13Var = jv5.A.d;
        l13 a = k13.a(context, new k23(0, 0, 0), "", false, false, null, null, xv2Var, null, null, new j52(), null, null);
        this.P = a;
        a.setWillNotDraw(true);
    }

    public static final void b(Runnable runnable) {
        boolean z;
        mv2 mv2Var = n62.f.a;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            runnable.run();
        } else {
            cu5.i.post(runnable);
        }
    }

    @Override // defpackage.aj2
    public final /* synthetic */ void B(String str, String str2) {
        v32.r(this, str, str2);
    }

    @Override // defpackage.aj2
    public final void M0(String str, JSONObject jSONObject) {
        v32.r(this, str, jSONObject.toString());
    }

    @Override // defpackage.pi2
    public final void a(String str, Map map) {
        try {
            p(str, n62.f.a.g(map));
        } catch (JSONException unused) {
            sv2.g("Could not convert parameters to JSON.");
        }
    }

    @Override // defpackage.ui2
    public final void d() {
        this.P.destroy();
    }

    @Override // defpackage.ui2
    public final boolean g() {
        return this.P.c0();
    }

    @Override // defpackage.sj2
    public final void g0(String str, mg2 mg2Var) {
        this.P.D0(str, new yi2(this, mg2Var));
    }

    @Override // defpackage.ui2
    public final tj2 j() {
        return new tj2(this);
    }

    @Override // defpackage.aj2
    public final void m(String str) {
        b(new yk5(2, this, str));
    }

    @Override // defpackage.sj2
    public final void n(String str, mg2 mg2Var) {
        this.P.e0(str, new vi2(0, mg2Var));
    }

    @Override // defpackage.pi2
    public final /* synthetic */ void p(String str, JSONObject jSONObject) {
        v32.p(this, str, jSONObject);
    }
}