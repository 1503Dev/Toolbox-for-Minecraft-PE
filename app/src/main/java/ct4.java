package defpackage;

import java.util.Arrays;

/* renamed from: ct4  reason: default package */
public final class ct4 {
    public final String a;
    public final bt4 b;
    public bt4 c;

    public /* synthetic */ ct4(String str) {
        bt4 bt4Var = new bt4();
        this.b = bt4Var;
        this.c = bt4Var;
        this.a = str;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append(this.a);
        sb.append('{');
        bt4 bt4Var = this.b.b;
        String str = "";
        while (bt4Var != null) {
            Object obj = bt4Var.a;
            sb.append(str);
            if (obj == null || !obj.getClass().isArray()) {
                sb.append(obj);
            } else {
                String deepToString = Arrays.deepToString(new Object[]{obj});
                sb.append((CharSequence) deepToString, 1, deepToString.length() - 1);
            }
            bt4Var = bt4Var.b;
            str = ", ";
        }
        sb.append('}');
        return sb.toString();
    }
}