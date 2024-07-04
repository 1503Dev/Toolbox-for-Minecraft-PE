package defpackage;

/* renamed from: yt1  reason: default package */
public final class yt1 {
    public static boolean a(p16 p16Var) {
        kh4 kh4Var = new kh4(8);
        int i = xt1.a(p16Var, kh4Var).a;
        if (i != 1380533830 && i != 1380333108) {
            return false;
        }
        p16Var.B(kh4Var.a, 0, 4, false);
        kh4Var.e(0);
        int i2 = kh4Var.i();
        if (i2 != 1463899717) {
            lb4.a("WavHeaderReader", "Unsupported form type: " + i2);
            return false;
        }
        return true;
    }

    public static xt1 b(int i, p16 p16Var, kh4 kh4Var) {
        while (true) {
            xt1 a = xt1.a(p16Var, kh4Var);
            int i2 = a.a;
            if (i2 == i) {
                return a;
            }
            lb4.c("WavHeaderReader", "Ignoring unknown WAV chunk: " + i2);
            long j = a.b + 8;
            if (j > 2147483647L) {
                int i3 = a.a;
                throw jy2.b("Chunk is too large (~2GB+) to skip; id: " + i3);
            }
            p16Var.k((int) j);
        }
    }
}