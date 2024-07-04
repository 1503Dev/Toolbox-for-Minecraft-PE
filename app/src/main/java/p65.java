package defpackage;

import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* renamed from: p65  reason: default package */
public final class p65 implements r65 {
    public final String a;
    public final sc5 b;
    public final gd5 c;
    public final int d;
    public final int e;
    @Nullable
    public final Integer f;

    public p65(String str, gd5 gd5Var, int i, int i2, @Nullable Integer num) {
        this.a = str;
        this.b = y65.a(str);
        this.c = gd5Var;
        this.d = i;
        this.e = i2;
        this.f = num;
    }

    public static p65 a(String str, gd5 gd5Var, int i, int i2, @Nullable Integer num) {
        if (i2 == 4) {
            if (num != null) {
                throw new GeneralSecurityException("Keys with output prefix type raw should not have an id requirement.");
            }
        } else if (num == null) {
            throw new GeneralSecurityException("Keys with output prefix type different from raw should have an id requirement.");
        }
        return new p65(str, gd5Var, i, i2, num);
    }
}