package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;

/* renamed from: j14  reason: default package */
public final class j14 {
    public final String c;
    public ci4 d = null;
    public yh4 e = null;
    public fw5 f = null;
    public final Map b = Collections.synchronizedMap(new HashMap());
    public final List a = Collections.synchronizedList(new ArrayList());

    public j14(String str) {
        this.c = str;
    }

    public final synchronized void a(yh4 yh4Var, int i) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        if (((Boolean) w82.d.c.a(x92.R2)).booleanValue()) {
            str = yh4Var.p0;
        } else {
            str = yh4Var.w;
        }
        if (this.b.containsKey(str)) {
            return;
        }
        Bundle bundle = new Bundle();
        Iterator<String> keys = yh4Var.v.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            try {
                bundle.putString(next, yh4Var.v.getString(next));
            } catch (JSONException unused) {
            }
        }
        if (((Boolean) w82.d.c.a(x92.K5)).booleanValue()) {
            str2 = yh4Var.F;
            str3 = yh4Var.G;
            str4 = yh4Var.H;
            str5 = yh4Var.I;
        } else {
            str2 = "";
            str3 = "";
            str4 = "";
            str5 = "";
        }
        fw5 fw5Var = new fw5(yh4Var.E, 0L, null, bundle, str2, str3, str4, str5);
        try {
            this.a.add(i, fw5Var);
        } catch (IndexOutOfBoundsException e) {
            jv5.A.g.f("AdapterResponseInfoCollector.addAdapterResponseInfoEntryAtLocation", e);
        }
        this.b.put(str, fw5Var);
    }

    public final void b(yh4 yh4Var, long j, tz3 tz3Var, boolean z) {
        String str;
        l92 l92Var = x92.R2;
        w82 w82Var = w82.d;
        if (((Boolean) w82Var.c.a(l92Var)).booleanValue()) {
            str = yh4Var.p0;
        } else {
            str = yh4Var.w;
        }
        if (!this.b.containsKey(str)) {
            return;
        }
        if (this.e == null) {
            this.e = yh4Var;
        }
        fw5 fw5Var = (fw5) this.b.get(str);
        fw5Var.Q = j;
        fw5Var.R = tz3Var;
        if (((Boolean) w82Var.c.a(x92.L5)).booleanValue() && z) {
            this.f = fw5Var;
        }
    }
}