package defpackage;

import android.content.Context;
import java.nio.charset.StandardCharsets;
import java.util.UUID;

/* renamed from: dr4  reason: default package */
public class dr4 {
    public static final String g = new UUID(0, 0).toString();
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final er4 f;

    public dr4(Context context, String str, String str2, String str3) {
        if (er4.c == null) {
            er4.c = new er4(context);
        }
        this.f = er4.c;
        this.a = str;
        this.b = str.concat("_3p");
        this.c = str2;
        this.d = str2.concat("_3p");
        this.e = str3;
    }

    public final cr4 a(long j, String str, boolean z, String str2) {
        boolean z2;
        String str3;
        String str4;
        String str5;
        String str6;
        if (str != null) {
            try {
                UUID.fromString(str);
                if (!str.equals(g)) {
                    er4 er4Var = this.f;
                    String string = er4Var.b.getString(this.b, null);
                    String string2 = this.f.b.getString("paid_3p_hash_key", null);
                    if (string != null && string2 != null && !string.equals(e(str, str2, string2))) {
                        return b(str, str2);
                    }
                }
            } catch (IllegalArgumentException unused) {
            }
            return new cr4();
        }
        if (str != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis >= 0) {
            er4 er4Var2 = this.f;
            if (z2) {
                str3 = this.d;
            } else {
                str3 = this.c;
            }
            long j2 = er4Var2.b.getLong(str3, -1L);
            if (j2 != -1) {
                if (currentTimeMillis < j2) {
                    er4 er4Var3 = this.f;
                    if (z2) {
                        str6 = this.d;
                    } else {
                        str6 = this.c;
                    }
                    er4Var3.a(str6, Long.valueOf(currentTimeMillis));
                } else if (currentTimeMillis >= j2 + j) {
                    return b(str, str2);
                }
            }
            er4 er4Var4 = this.f;
            if (z2) {
                str4 = this.b;
            } else {
                str4 = this.a;
            }
            String string3 = er4Var4.b.getString(str4, null);
            if (string3 == null && !z) {
                return b(str, str2);
            }
            er4 er4Var5 = this.f;
            if (z2) {
                str5 = this.d;
            } else {
                str5 = this.c;
            }
            return new cr4(string3, er4Var5.b.getLong(str5, -1L));
        }
        throw new IllegalStateException(this.e.concat(": Invalid negative current timestamp. Updating PAID failed"));
    }

    public final cr4 b(String str, String str2) {
        String e;
        boolean z;
        if (str == null) {
            e = UUID.randomUUID().toString();
            z = false;
        } else {
            String uuid = UUID.randomUUID().toString();
            this.f.a("paid_3p_hash_key", uuid);
            e = e(str, str2, uuid);
            z = true;
        }
        return c(e, z);
    }

    public final cr4 c(String str, boolean z) {
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis >= 0) {
            this.f.a(z ? this.d : this.c, Long.valueOf(currentTimeMillis));
            this.f.a(z ? this.b : this.a, str);
            return new cr4(str, currentTimeMillis);
        }
        throw new IllegalStateException(this.e.concat(": Invalid negative current timestamp. Updating PAID failed"));
    }

    public final void d(boolean z) {
        this.f.b(z ? this.d : this.c);
        this.f.b(z ? this.b : this.a);
    }

    public final String e(String str, String str2, String str3) {
        String str4;
        if (str2 != null && str3 != null) {
            return UUID.nameUUIDFromBytes(ij.c(str, str2, str3).getBytes(StandardCharsets.UTF_8)).toString();
        }
        StringBuilder c = yg.c(this.e, ": Invalid argument to generate PAIDv1 on 3p traffic, Ad ID is not null, package name is ");
        String str5 = "null";
        if (str2 == null) {
            str4 = "null";
        } else {
            str4 = "not null";
        }
        c.append(str4);
        c.append(", hashKey is ");
        if (str3 != null) {
            str5 = "not null";
        }
        c.append(str5);
        throw new IllegalArgumentException(c.toString());
    }
}