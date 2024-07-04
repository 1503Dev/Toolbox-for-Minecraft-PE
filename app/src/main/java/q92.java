package defpackage;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* renamed from: q92  reason: default package */
public abstract class q92 {
    public final int a;
    public final String b;
    public final Object c;

    public q92(int i, String str, Object obj) {
        this.a = i;
        this.b = str;
        this.c = obj;
        w82.d.a.a.add(this);
    }

    public static m92 e(int i, String str) {
        return new m92(str, Integer.valueOf(i));
    }

    public static n92 f(long j, String str) {
        return new n92(str, Long.valueOf(j));
    }

    public static l92 g(int i, String str, Boolean bool) {
        return new l92(i, str, bool);
    }

    public static p92 h(String str, String str2) {
        return new p92(str, str2);
    }

    public static void i() {
        w82.d.a.b.add(new p92("gads:sdk_core_constants:experiment_id", null));
    }

    public abstract Object a(JSONObject jSONObject);

    public abstract Object b(Bundle bundle);

    public abstract Object c(SharedPreferences sharedPreferences);

    public abstract void d(SharedPreferences.Editor editor, Object obj);
}