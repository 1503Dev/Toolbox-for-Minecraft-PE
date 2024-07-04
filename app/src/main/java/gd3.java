package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.List;
import org.json.JSONException;

/* renamed from: gd3  reason: default package */
public final class gd3 extends sp3 {
    public final String P;
    public final String Q;
    public final String R;
    public final String S;
    public final List T;
    public final long U;
    public final String V;
    public final j14 W;
    public final Bundle X;

    public gd3(yh4 yh4Var, String str, j14 j14Var, ci4 ci4Var, String str2) {
        String str3;
        String str4;
        Bundle bundle;
        String str5;
        String str6 = null;
        if (yh4Var == null) {
            str3 = null;
        } else {
            str3 = yh4Var.b0;
        }
        this.Q = str3;
        this.R = str2;
        if (ci4Var == null) {
            str4 = null;
        } else {
            str4 = ci4Var.b;
        }
        this.S = str4;
        if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str) || "com.google.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
            try {
                str6 = yh4Var.v.getString("class_name");
            } catch (JSONException unused) {
            }
        }
        this.P = str6 != null ? str6 : str;
        this.T = j14Var.a;
        this.W = j14Var;
        jv5.A.j.getClass();
        this.U = System.currentTimeMillis() / 1000;
        l92 l92Var = x92.M5;
        w82 w82Var = w82.d;
        if (((Boolean) w82Var.c.a(l92Var)).booleanValue() && ci4Var != null) {
            bundle = ci4Var.j;
        } else {
            bundle = new Bundle();
        }
        this.X = bundle;
        if (((Boolean) w82Var.c.a(x92.O7)).booleanValue() && ci4Var != null && !TextUtils.isEmpty(ci4Var.h)) {
            str5 = ci4Var.h;
        } else {
            str5 = "";
        }
        this.V = str5;
    }

    @Override // defpackage.mq3
    public final Bundle b() {
        return this.X;
    }

    @Override // defpackage.mq3
    public final fw5 e() {
        j14 j14Var = this.W;
        if (j14Var != null) {
            return j14Var.f;
        }
        return null;
    }

    @Override // defpackage.mq3
    public final String f() {
        return this.R;
    }

    @Override // defpackage.mq3
    public final String g() {
        return this.Q;
    }

    @Override // defpackage.mq3
    public final String h() {
        return this.P;
    }

    @Override // defpackage.mq3
    public final List j() {
        return this.T;
    }
}