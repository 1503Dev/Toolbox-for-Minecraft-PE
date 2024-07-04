package defpackage;

import java.util.List;

/* renamed from: kd2  reason: default package */
public final class kd2 {
    public final String[] a;
    public final double[] b;
    public final double[] c;
    public final int[] d;
    public int e;

    public kd2(ob2 ob2Var) {
        int size = ((List) ob2Var.b).size();
        this.a = (String[]) ((List) ob2Var.a).toArray(new String[size]);
        List list = (List) ob2Var.b;
        int size2 = list.size();
        double[] dArr = new double[size2];
        for (int i = 0; i < size2; i++) {
            dArr[i] = ((Double) list.get(i)).doubleValue();
        }
        this.b = dArr;
        List list2 = (List) ob2Var.c;
        int size3 = list2.size();
        double[] dArr2 = new double[size3];
        for (int i2 = 0; i2 < size3; i2++) {
            dArr2[i2] = ((Double) list2.get(i2)).doubleValue();
        }
        this.c = dArr2;
        this.d = new int[size];
        this.e = 0;
    }
}