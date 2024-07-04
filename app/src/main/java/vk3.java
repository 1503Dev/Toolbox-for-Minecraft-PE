package defpackage;

/* renamed from: vk3  reason: default package */
public final class vk3 {
    public static final vk3 b;
    public final nv4 a;

    static {
        lv4 lv4Var = nv4.Q;
        b = new vk3(nw4.T);
        Integer.toString(0, 36);
    }

    public vk3(nw4 nw4Var) {
        this.a = nv4.t(nw4Var);
    }

    public final boolean a(int i) {
        boolean z;
        for (int i2 = 0; i2 < this.a.size(); i2++) {
            dk3 dk3Var = (dk3) this.a.get(i2);
            boolean[] zArr = dk3Var.c;
            int length = zArr.length;
            int i3 = 0;
            while (true) {
                if (i3 < length) {
                    if (zArr[i3]) {
                        z = true;
                        break;
                    }
                    i3++;
                } else {
                    z = false;
                    break;
                }
            }
            if (z && dk3Var.a.b == i) {
                return true;
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || vk3.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((vk3) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}