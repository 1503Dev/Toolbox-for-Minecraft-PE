package defpackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* renamed from: ze  reason: default package */
public final class ze extends tv0<Map<String, tv0<?>>> implements Iterable<Map.Entry<String, tv0<?>>>, Comparable<ze> {
    public ze() {
        super(new HashMap(8));
    }

    @Override // java.lang.Comparable
    public final int compareTo(ze zeVar) {
        return Integer.compare(((Map) this.P).size(), ((Map) zeVar.P).size());
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0032  */
    @Override // defpackage.tv0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (super.equals(obj)) {
            ze zeVar = (ze) obj;
            if (((Map) this.P).size() == ((Map) zeVar.P).size()) {
                for (Map.Entry entry : ((Map) this.P).entrySet()) {
                    tv0 tv0Var = (tv0) ((Map) zeVar.P).get((String) entry.getKey());
                    if (tv0Var == null || !((tv0) entry.getValue()).equals(tv0Var)) {
                        return false;
                    }
                    while (r1.hasNext()) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.Iterable
    public final Iterator<Map.Entry<String, tv0<?>>> iterator() {
        return new v90(((Map) this.P).entrySet()).iterator();
    }

    @Override // defpackage.tv0
    public final void o(o00 o00Var, int i) {
        ((Map) this.P).clear();
        while (true) {
            int readUnsignedByte = ((byte) o00Var.readUnsignedByte()) & 255;
            if (readUnsignedByte != 0) {
                tv0<?> a = wv0.a(readUnsignedByte);
                String readUTF = o00Var.readUTF();
                a.o(o00Var, tv0.n(i));
                x(readUTF, a);
            } else {
                return;
            }
        }
    }

    @Override // defpackage.tv0
    public final void q(p00 p00Var, int i) {
        for (Map.Entry entry : ((Map) this.P).entrySet()) {
            tv0 tv0Var = (tv0) entry.getValue();
            String str = (String) entry.getKey();
            int n = tv0.n(i);
            p00Var.writeByte(wv0.b(tv0Var.getClass()));
            if (wv0.b(tv0Var.getClass()) != 0) {
                p00Var.writeUTF(str);
            }
            tv0Var.q(p00Var, n);
        }
        p00Var.writeByte(wv0.b(wo.V.getClass()));
        if (wv0.b(wo.class) != 0) {
            p00Var.writeUTF("");
        }
    }

    @Override // defpackage.tv0
    public final String u(int i) {
        String str;
        StringBuilder sb = new StringBuilder("{");
        boolean z = true;
        for (Map.Entry entry : ((Map) this.P).entrySet()) {
            if (z) {
                str = "";
            } else {
                str = ",";
            }
            sb.append(str);
            sb.append(tv0.p((String) entry.getKey(), false));
            sb.append(":");
            sb.append(((tv0) entry.getValue()).s(tv0.n(i)));
            z = false;
        }
        sb.append("}");
        return sb.toString();
    }

    @Override // defpackage.tv0
    public final String v(int i) {
        String str;
        StringBuilder sb = new StringBuilder("{");
        boolean z = true;
        for (Map.Entry entry : ((Map) this.P).entrySet()) {
            if (z) {
                str = "";
            } else {
                str = ",";
            }
            sb.append(str);
            sb.append(tv0.p((String) entry.getKey(), true));
            sb.append(":");
            sb.append(((tv0) entry.getValue()).v(tv0.n(i)));
            z = false;
        }
        sb.append("}");
        return sb.toString();
    }

    @Override // defpackage.tv0
    /* renamed from: w */
    public final ze m() {
        ze zeVar = new ze();
        for (Map.Entry entry : ((Map) this.P).entrySet()) {
            zeVar.x((String) entry.getKey(), ((tv0) entry.getValue()).clone());
        }
        return zeVar;
    }

    public final void x(String str, tv0 tv0Var) {
        Objects.requireNonNull(str);
        Objects.requireNonNull(tv0Var);
        tv0 tv0Var2 = (tv0) ((Map) this.P).put(str, tv0Var);
    }
}