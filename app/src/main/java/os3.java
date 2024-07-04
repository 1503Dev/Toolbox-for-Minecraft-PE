package defpackage;

import android.content.Context;
import android.os.SystemClock;
import android.util.JsonWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.util.Collections;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;

/* renamed from: os3  reason: default package */
public final class os3 implements r6, ff3, vj1, nd3, ae3, be3, le3, qd3, pl4 {
    public final List P;
    public final js3 Q;
    public long R;

    public os3(js3 js3Var, q23 q23Var) {
        this.Q = js3Var;
        this.P = Collections.singletonList(q23Var);
    }

    @Override // defpackage.vj1
    public final void J() {
        t(vj1.class, "onAdClicked", new Object[0]);
    }

    @Override // defpackage.nd3
    public final void K() {
        t(nd3.class, "onAdOpened", new Object[0]);
    }

    @Override // defpackage.be3
    public final void a(Context context) {
        t(be3.class, "onDestroy", context);
    }

    @Override // defpackage.pl4
    public final void b(ml4 ml4Var, String str) {
        t(ll4.class, "onTaskSucceeded", str);
    }

    @Override // defpackage.pl4
    public final void c(String str) {
        t(ll4.class, "onTaskCreated", str);
    }

    @Override // defpackage.be3
    public final void d(Context context) {
        t(be3.class, "onResume", context);
    }

    @Override // defpackage.be3
    public final void e(Context context) {
        t(be3.class, "onPause", context);
    }

    @Override // defpackage.ff3
    public final void f(hi4 hi4Var) {
    }

    @Override // defpackage.pl4
    public final void h(ml4 ml4Var, String str) {
        t(ll4.class, "onTaskStarted", str);
    }

    @Override // defpackage.r6
    public final void i(String str, String str2) {
        t(r6.class, "onAppEvent", str, str2);
    }

    @Override // defpackage.nd3
    public final void j() {
        t(nd3.class, "onAdClosed", new Object[0]);
    }

    @Override // defpackage.le3
    public final void k() {
        jv5.A.j.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.R;
        vz3.k("Ad Request Latency : " + elapsedRealtime);
        t(le3.class, "onAdLoaded", new Object[0]);
    }

    @Override // defpackage.nd3
    @ParametersAreNonnullByDefault
    public final void l(cr2 cr2Var, String str, String str2) {
        t(nd3.class, "onRewarded", cr2Var, str, str2);
    }

    @Override // defpackage.nd3
    public final void m() {
        t(nd3.class, "onRewardedVideoStarted", new Object[0]);
    }

    @Override // defpackage.ae3
    public final void n() {
        t(ae3.class, "onAdImpression", new Object[0]);
    }

    @Override // defpackage.nd3
    public final void o() {
        t(nd3.class, "onAdLeftApplication", new Object[0]);
    }

    @Override // defpackage.qd3
    public final void p(tz3 tz3Var) {
        t(qd3.class, "onAdFailedToLoad", Integer.valueOf(tz3Var.P), tz3Var.Q, tz3Var.R);
    }

    @Override // defpackage.nd3
    public final void q() {
        t(nd3.class, "onRewardedVideoCompleted", new Object[0]);
    }

    @Override // defpackage.ff3
    public final void q0(rq2 rq2Var) {
        jv5.A.j.getClass();
        this.R = SystemClock.elapsedRealtime();
        t(ff3.class, "onAdRequest", new Object[0]);
    }

    @Override // defpackage.pl4
    public final void s(ml4 ml4Var, String str, Throwable th) {
        t(ll4.class, "onTaskFailed", str, th.getClass().getSimpleName());
    }

    public final void t(Class cls, String str, Object... objArr) {
        js3 js3Var = this.Q;
        List<Object> list = this.P;
        String concat = "Event-".concat(cls.getSimpleName());
        js3Var.getClass();
        if (((Boolean) rb2.a.d()).booleanValue()) {
            long a = js3Var.a.a();
            StringWriter stringWriter = new StringWriter();
            JsonWriter jsonWriter = new JsonWriter(stringWriter);
            try {
                jsonWriter.beginObject();
                jsonWriter.name("timestamp").value(a);
                jsonWriter.name("source").value(concat);
                jsonWriter.name("event").value(str);
                jsonWriter.name("components").beginArray();
                for (Object obj : list) {
                    jsonWriter.value(obj.toString());
                }
                jsonWriter.endArray();
                jsonWriter.name("params").beginArray();
                int length = objArr.length;
                for (int i = 0; i < length; i++) {
                    Object obj2 = objArr[i];
                    jsonWriter.value(obj2 != null ? obj2.toString() : null);
                }
                jsonWriter.endArray();
                jsonWriter.endObject();
                jsonWriter.flush();
                jsonWriter.close();
            } catch (IOException e) {
                sv2.e("unable to log", e);
            }
            sv2.f("AD-DBG ".concat(String.valueOf(stringWriter.toString())));
        }
    }
}