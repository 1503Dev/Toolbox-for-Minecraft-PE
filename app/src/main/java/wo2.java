package defpackage;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: wo2  reason: default package */
public final class wo2 {
    public static final /* synthetic */ int c = 0;
    public final mt3 a = new mt3(16);
    public boolean b;

    static {
        new wo2(0);
    }

    public wo2() {
    }

    public wo2(int i) {
        a();
        a();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(do2 do2Var, Object obj) {
        boolean z;
        hg4 c2 = do2Var.c();
        Charset charset = z13.a;
        obj.getClass();
        hg4[] hg4VarArr = hg4.Q;
        fh4 fh4Var = fh4.Q;
        switch (c2.P.ordinal()) {
            case 0:
                z = obj instanceof Integer;
                if (z) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(do2Var.a()), do2Var.c().P, obj.getClass().getName()));
            case 1:
                z = obj instanceof Long;
                if (z) {
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(do2Var.a()), do2Var.c().P, obj.getClass().getName()));
            case 2:
                z = obj instanceof Float;
                if (z) {
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(do2Var.a()), do2Var.c().P, obj.getClass().getName()));
            case 3:
                z = obj instanceof Double;
                if (z) {
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(do2Var.a()), do2Var.c().P, obj.getClass().getName()));
            case 4:
                z = obj instanceof Boolean;
                if (z) {
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(do2Var.a()), do2Var.c().P, obj.getClass().getName()));
            case 5:
                z = obj instanceof String;
                if (z) {
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(do2Var.a()), do2Var.c().P, obj.getClass().getName()));
            case 6:
                if ((obj instanceof y82) || (obj instanceof byte[])) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(do2Var.a()), do2Var.c().P, obj.getClass().getName()));
            case 7:
                if (obj instanceof Integer) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(do2Var.a()), do2Var.c().P, obj.getClass().getName()));
            case 8:
                if (obj instanceof fk3) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(do2Var.a()), do2Var.c().P, obj.getClass().getName()));
            default:
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(do2Var.a()), do2Var.c().P, obj.getClass().getName()));
        }
    }

    public final void a() {
        if (!this.b) {
            for (int i = 0; i < this.a.b(); i++) {
                Map.Entry entry = (Map.Entry) this.a.Q.get(i);
                if (entry.getValue() instanceof ox2) {
                    ox2 ox2Var = (ox2) entry.getValue();
                    ox2Var.getClass();
                    lq3.c.a(ox2Var.getClass()).a(ox2Var);
                    ox2Var.f();
                }
            }
            this.a.a();
            this.b = true;
        }
    }

    public final void b(do2 do2Var, Object obj) {
        if (!do2Var.d()) {
            c(do2Var, obj);
        } else if (!(obj instanceof List)) {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        } else {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                c(do2Var, arrayList.get(i));
            }
            obj = arrayList;
        }
        this.a.put(do2Var, obj);
    }

    public final Object clone() {
        Iterable<Map.Entry> entrySet;
        wo2 wo2Var = new wo2();
        for (int i = 0; i < this.a.b(); i++) {
            Map.Entry entry = (Map.Entry) this.a.Q.get(i);
            wo2Var.b((do2) entry.getKey(), entry.getValue());
        }
        mt3 mt3Var = this.a;
        if (mt3Var.R.isEmpty()) {
            entrySet = mh.T;
        } else {
            entrySet = mt3Var.R.entrySet();
        }
        for (Map.Entry entry2 : entrySet) {
            wo2Var.b((do2) entry2.getKey(), entry2.getValue());
        }
        return wo2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof wo2) {
            return this.a.equals(((wo2) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}