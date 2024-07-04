package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: i44  reason: default package */
public final class i44 {
    public final kd a;
    public final j44 b;
    public final gn4 c;
    public final List d = Collections.synchronizedList(new ArrayList());
    public final boolean e = ((Boolean) w82.d.c.a(x92.O5)).booleanValue();
    public final j14 f;

    public i44(kd kdVar, j44 j44Var, j14 j14Var, gn4 gn4Var) {
        this.a = kdVar;
        this.b = j44Var;
        this.f = j14Var;
        this.c = gn4Var;
    }

    public static void a(i44 i44Var, String str, int i, long j, String str2, Integer num) {
        String str3 = str + "." + i + "." + j;
        if (!TextUtils.isEmpty(str2)) {
            str3 = ij.c(str3, ".", str2);
        }
        if (((Boolean) w82.d.c.a(x92.m1)).booleanValue() && num != null && !TextUtils.isEmpty(str2)) {
            str3 = str3 + "." + num;
        }
        i44Var.d.add(str3);
    }
}