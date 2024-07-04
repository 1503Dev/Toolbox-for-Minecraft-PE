package defpackage;

import java.util.Collections;

/* renamed from: sm1  reason: default package */
public final class sm1 extends yg5 {
    public static final int[] T = {5512, 11025, 22050, 44100};
    public boolean Q;
    public boolean R;
    public int S;

    public sm1(pl1 pl1Var) {
        super(pl1Var);
    }

    @Override // defpackage.yg5
    public final boolean b(kh4 kh4Var) {
        String str;
        cu1 cu1Var;
        if (!this.Q) {
            int n = kh4Var.n();
            int i = n >> 4;
            this.S = i;
            if (i == 2) {
                int i2 = T[(n >> 2) & 3];
                bs1 bs1Var = new bs1();
                bs1Var.j = "audio/mpeg";
                bs1Var.w = 1;
                bs1Var.x = i2;
                cu1Var = new cu1(bs1Var);
            } else if (i != 7 && i != 8) {
                if (i != 10) {
                    throw new vm1(k6.a("Audio format not supported: ", i));
                }
                this.Q = true;
            } else {
                bs1 bs1Var2 = new bs1();
                if (i == 7) {
                    str = "audio/g711-alaw";
                } else {
                    str = "audio/g711-mlaw";
                }
                bs1Var2.j = str;
                bs1Var2.w = 1;
                bs1Var2.x = 8000;
                cu1Var = new cu1(bs1Var2);
            }
            ((pl1) this.P).e(cu1Var);
            this.R = true;
            this.Q = true;
        } else {
            kh4Var.f(1);
        }
        return true;
    }

    @Override // defpackage.yg5
    public final boolean d(long j, kh4 kh4Var) {
        int i;
        if (this.S == 2) {
            i = kh4Var.c;
        } else {
            int n = kh4Var.n();
            if (n == 0 && !this.R) {
                int i2 = kh4Var.c - kh4Var.b;
                byte[] bArr = new byte[i2];
                kh4Var.a(bArr, 0, i2);
                e16 a = f16.a(new eh4(bArr, i2), false);
                bs1 bs1Var = new bs1();
                bs1Var.j = "audio/mp4a-latm";
                bs1Var.g = a.c;
                bs1Var.w = a.b;
                bs1Var.x = a.a;
                bs1Var.l = Collections.singletonList(bArr);
                ((pl1) this.P).e(new cu1(bs1Var));
                this.R = true;
                return false;
            } else if (this.S == 10 && n != 1) {
                return false;
            } else {
                i = kh4Var.c;
            }
        }
        int i3 = i - kh4Var.b;
        ((pl1) this.P).a(i3, kh4Var);
        ((pl1) this.P).b(j, 1, i3, 0, null);
        return true;
    }
}