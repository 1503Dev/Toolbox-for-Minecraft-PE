package defpackage;

import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: zp1  reason: default package */
public final class zp1 extends bq1 {
    public final long b;
    public final ArrayList c;
    public final ArrayList d;

    public zp1(long j, int i) {
        super(i);
        this.b = j;
        this.c = new ArrayList();
        this.d = new ArrayList();
    }

    public final zp1 c(int i) {
        int size = this.d.size();
        for (int i2 = 0; i2 < size; i2++) {
            zp1 zp1Var = (zp1) this.d.get(i2);
            if (zp1Var.a == i) {
                return zp1Var;
            }
        }
        return null;
    }

    public final aq1 d(int i) {
        int size = this.c.size();
        for (int i2 = 0; i2 < size; i2++) {
            aq1 aq1Var = (aq1) this.c.get(i2);
            if (aq1Var.a == i) {
                return aq1Var;
            }
        }
        return null;
    }

    @Override // defpackage.bq1
    public final String toString() {
        String b = bq1.b(this.a);
        String arrays = Arrays.toString(this.c.toArray());
        String arrays2 = Arrays.toString(this.d.toArray());
        return b + " leaves: " + arrays + " containers: " + arrays2;
    }
}