package defpackage;

import java.util.Map;

/* renamed from: ng2  reason: default package */
public final class ng2 implements mg2 {
    public final og2 P;

    public ng2(og2 og2Var) {
        this.P = og2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0039 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // defpackage.mg2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(Object obj, Map map) {
        float f;
        og2 og2Var;
        y03 y03Var = (y03) obj;
        boolean equals = "1".equals(map.get("transparentBackground"));
        boolean equals2 = "1".equals(map.get("blur"));
        try {
        } catch (NumberFormatException e) {
            sv2.e("Fail to parse float", e);
        }
        if (map.get("blurRadius") != null) {
            f = Float.parseFloat((String) map.get("blurRadius"));
            og2Var = this.P;
            synchronized (og2Var) {
                og2Var.a = equals;
                og2Var.d.set(true);
            }
            og2 og2Var2 = this.P;
            synchronized (og2Var2) {
                og2Var2.b = equals2;
                og2Var2.c = f;
            }
            y03Var.b0(equals);
            return;
        }
        f = 0.0f;
        og2Var = this.P;
        synchronized (og2Var) {
        }
    }
}