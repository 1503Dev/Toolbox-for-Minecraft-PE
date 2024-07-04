package defpackage;

import java.util.ArrayList;

/* renamed from: qt  reason: default package */
public final class qt {
    public final int[] a;
    public final float[] b;

    public qt(int i, int i2) {
        this.a = new int[]{i, i2};
        this.b = new float[]{0.0f, 1.0f};
    }

    public qt(int i, int i2, int i3) {
        this.a = new int[]{i, i2, i3};
        this.b = new float[]{0.0f, 0.5f, 1.0f};
    }

    public qt(ArrayList arrayList, ArrayList arrayList2) {
        int size = arrayList.size();
        this.a = new int[size];
        this.b = new float[size];
        for (int i = 0; i < size; i++) {
            this.a[i] = ((Integer) arrayList.get(i)).intValue();
            this.b[i] = ((Float) arrayList2.get(i)).floatValue();
        }
    }
}