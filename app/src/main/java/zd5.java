package defpackage;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: zd5  reason: default package */
public final class zd5 {
    public static final /* synthetic */ int c = 0;
    public final fg5 a = new fg5(16);
    public boolean b;

    static {
        new zd5(0);
    }

    public zd5() {
    }

    public zd5(int i) {
        a();
        a();
    }

    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(yd5 yd5Var, Object obj) {
        boolean z;
        eh5 c2 = yd5Var.c();
        Charset charset = re5.a;
        obj.getClass();
        eh5[] eh5VarArr = eh5.Q;
        fh5 fh5Var = fh5.Q;
        switch (c2.P.ordinal()) {
            case 0:
                z = obj instanceof Integer;
                if (z) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(yd5Var.a()), yd5Var.c().P, obj.getClass().getName()));
            case 1:
                z = obj instanceof Long;
                if (z) {
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(yd5Var.a()), yd5Var.c().P, obj.getClass().getName()));
            case 2:
                z = obj instanceof Float;
                if (z) {
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(yd5Var.a()), yd5Var.c().P, obj.getClass().getName()));
            case 3:
                z = obj instanceof Double;
                if (z) {
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(yd5Var.a()), yd5Var.c().P, obj.getClass().getName()));
            case 4:
                z = obj instanceof Boolean;
                if (z) {
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(yd5Var.a()), yd5Var.c().P, obj.getClass().getName()));
            case 5:
                z = obj instanceof String;
                if (z) {
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(yd5Var.a()), yd5Var.c().P, obj.getClass().getName()));
            case 6:
                if ((obj instanceof gd5) || (obj instanceof byte[])) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(yd5Var.a()), yd5Var.c().P, obj.getClass().getName()));
            case 7:
                if ((obj instanceof Integer) || (obj instanceof ke5)) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(yd5Var.a()), yd5Var.c().P, obj.getClass().getName()));
            case 8:
                if (obj instanceof nf5) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(yd5Var.a()), yd5Var.c().P, obj.getClass().getName()));
            default:
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(yd5Var.a()), yd5Var.c().P, obj.getClass().getName()));
        }
    }

    public final void a() {
        if (!this.b) {
            for (int i = 0; i < this.a.b(); i++) {
                Map.Entry entry = (Map.Entry) this.a.Q.get(i);
                if (entry.getValue() instanceof ie5) {
                    ie5 ie5Var = (ie5) entry.getValue();
                    ie5Var.getClass();
                    vf5.c.a(ie5Var.getClass()).a(ie5Var);
                    ie5Var.m();
                }
            }
            this.a.a();
            this.b = true;
        }
    }

    public final void b(yd5 yd5Var, Object obj) {
        if (!yd5Var.d()) {
            c(yd5Var, obj);
        } else if (!(obj instanceof List)) {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        } else {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                c(yd5Var, arrayList.get(i));
            }
            obj = arrayList;
        }
        this.a.put(yd5Var, obj);
    }

    public final Object clone() {
        Iterable<Map.Entry> entrySet;
        zd5 zd5Var = new zd5();
        for (int i = 0; i < this.a.b(); i++) {
            Map.Entry entry = (Map.Entry) this.a.Q.get(i);
            zd5Var.b((yd5) entry.getKey(), entry.getValue());
        }
        fg5 fg5Var = this.a;
        if (fg5Var.R.isEmpty()) {
            entrySet = mu2.U;
        } else {
            entrySet = fg5Var.R.entrySet();
        }
        for (Map.Entry entry2 : entrySet) {
            zd5Var.b((yd5) entry2.getKey(), entry2.getValue());
        }
        return zd5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zd5) {
            return this.a.equals(((zd5) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}