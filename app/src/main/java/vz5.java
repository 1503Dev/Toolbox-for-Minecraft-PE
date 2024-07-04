package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* renamed from: vz5  reason: default package */
public final class vz5 {
    public int d;
    public int e;
    public int f;
    public final uz5[] b = new uz5[5];
    public final ArrayList a = new ArrayList();
    public int c = -1;

    public final float a() {
        ArrayList arrayList;
        if (this.c != 0) {
            Collections.sort(this.a, new Comparator() { // from class: tz5
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return Float.compare(((uz5) obj).c, ((uz5) obj2).c);
                }
            });
            this.c = 0;
        }
        float f = this.e;
        int i = 0;
        for (int i2 = 0; i2 < this.a.size(); i2++) {
            uz5 uz5Var = (uz5) this.a.get(i2);
            i += uz5Var.b;
            if (i >= 0.5f * f) {
                return uz5Var.c;
            }
        }
        if (this.a.isEmpty()) {
            return Float.NaN;
        }
        return ((uz5) this.a.get(arrayList.size() - 1)).c;
    }

    public final void b(int i, float f) {
        uz5 uz5Var;
        int i2;
        uz5 uz5Var2;
        int i3;
        if (this.c != 1) {
            Collections.sort(this.a, new Comparator() { // from class: sz5
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return ((uz5) obj).a - ((uz5) obj2).a;
                }
            });
            this.c = 1;
        }
        int i4 = this.f;
        if (i4 > 0) {
            uz5[] uz5VarArr = this.b;
            int i5 = i4 - 1;
            this.f = i5;
            uz5Var = uz5VarArr[i5];
        } else {
            uz5Var = new uz5(0);
        }
        int i6 = this.d;
        this.d = i6 + 1;
        uz5Var.a = i6;
        uz5Var.b = i;
        uz5Var.c = f;
        this.a.add(uz5Var);
        int i7 = this.e + i;
        while (true) {
            this.e = i7;
            while (true) {
                int i8 = this.e;
                if (i8 <= 2000) {
                    return;
                }
                i2 = i8 - 2000;
                uz5Var2 = (uz5) this.a.get(0);
                i3 = uz5Var2.b;
                if (i3 <= i2) {
                    this.e -= i3;
                    this.a.remove(0);
                    int i9 = this.f;
                    if (i9 < 5) {
                        uz5[] uz5VarArr2 = this.b;
                        this.f = i9 + 1;
                        uz5VarArr2[i9] = uz5Var2;
                    }
                }
            }
            uz5Var2.b = i3 - i2;
            i7 = this.e - i2;
        }
    }
}