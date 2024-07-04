package defpackage;

/* renamed from: b30  reason: default package */
public abstract class b30 implements tl {
    public static final long[] d0 = {4794697086780616226L, 8158064640168781261L, -5349999486874862801L, -1606136188198331460L, 4131703408338449720L, 6480981068601479193L, -7908458776815382629L, -6116909921290321640L, -2880145864133508542L, 1334009975649890238L, 2608012711638119052L, 6128411473006802146L, 8268148722764581231L, -9160688886553864527L, -7215885187991268811L, -4495734319001033068L, -1973867731355612462L, -1171420211273849373L, 1135362057144423861L, 2597628984639134821L, 3308224258029322869L, 5365058923640841347L, 6679025012923562964L, 8573033837759648693L, -7476448914759557205L, -6327057829258317296L, -5763719355590565569L, -4658551843659510044L, -4116276920077217854L, -3051310485924567259L, 489312712824947311L, 1452737877330783856L, 2861767655752347644L, 3322285676063803686L, 5560940570517711597L, 5996557281743188959L, 7280758554555802590L, 8532644243296465576L, -9096487096722542874L, -7894198246740708037L, -6719396339535248540L, -6333637450476146687L, -4446306890439682159L, -4076793802049405392L, -3345356375505022440L, -2983346525034927856L, -860691631967231958L, 1182934255886127544L, 1847814050463011016L, 2177327727835720531L, 2830643537854262169L, 3796741975233480872L, 4115178125766777443L, 5681478168544905931L, 6601373596472566643L, 7507060721942968483L, 8399075790359081724L, 8693463985226723168L, -8878714635349349518L, -8302665154208450068L, -8016688836872298968L, -6606660893046293015L, -4685533653050689259L, -4147400797238176981L, -3880063495543823972L, -3348786107499101689L, -1523767162380948706L, -757361751448694408L, 500013540394364858L, 748580250866718886L, 1242879168328830382L, 1977374033974150939L, 2944078676154940804L, 3659926193048069267L, 4368137639120453308L, 4836135668995329356L, 5532061633213252278L, 6448918945643986474L, 6902733635092675308L, 7801388544844847127L};
    public long R;
    public long S;
    public long T;
    public long U;
    public long V;
    public long W;
    public long X;
    public long Y;
    public long Z;
    public long a0;
    public int c0;
    public byte[] P = new byte[8];
    public long[] b0 = new long[80];
    public int Q = 0;

    public b30() {
        reset();
    }

    public static long e(long j, long j2, long j3) {
        return ((j ^ (-1)) & j3) ^ (j2 & j);
    }

    public static long g(long j, long j2, long j3) {
        return ((j & j3) ^ (j & j2)) ^ (j2 & j3);
    }

    public static long h(long j) {
        return ((j >>> 39) | (j << 25)) ^ (((j << 36) | (j >>> 28)) ^ ((j << 30) | (j >>> 34)));
    }

    public static long i(long j) {
        return ((j >>> 41) | (j << 23)) ^ (((j << 50) | (j >>> 14)) ^ ((j << 46) | (j >>> 18)));
    }

    @Override // defpackage.tl
    public final void f(byte b) {
        byte[] bArr = this.P;
        int i = this.Q;
        int i2 = i + 1;
        this.Q = i2;
        bArr[i] = b;
        if (i2 == bArr.length) {
            l(bArr, 0);
            this.Q = 0;
        }
        this.R++;
    }

    public final void j() {
        long j = this.R;
        if (j > 2305843009213693951L) {
            this.S += j >>> 61;
            this.R = j & 2305843009213693951L;
        }
        long j2 = this.R << 3;
        long j3 = this.S;
        byte b = Byte.MIN_VALUE;
        while (true) {
            f(b);
            if (this.Q == 0) {
                break;
            }
            b = 0;
        }
        if (this.c0 > 14) {
            k();
        }
        long[] jArr = this.b0;
        jArr[14] = j3;
        jArr[15] = j2;
        k();
    }

    public final void k() {
        long j = this.R;
        if (j > 2305843009213693951L) {
            this.S += j >>> 61;
            this.R = j & 2305843009213693951L;
        }
        for (int i = 16; i <= 79; i++) {
            long[] jArr = this.b0;
            long j2 = jArr[i - 2];
            long j3 = ((j2 >>> 6) ^ (((j2 << 45) | (j2 >>> 19)) ^ ((j2 << 3) | (j2 >>> 61)))) + jArr[i - 7];
            long j4 = jArr[i - 15];
            jArr[i] = j3 + ((j4 >>> 7) ^ (((j4 << 63) | (j4 >>> 1)) ^ ((j4 << 56) | (j4 >>> 8)))) + jArr[i - 16];
        }
        long j5 = this.T;
        long j6 = this.U;
        long j7 = this.V;
        long j8 = this.W;
        long j9 = this.X;
        long j10 = this.Y;
        long j11 = this.Z;
        long j12 = j5;
        long j13 = this.a0;
        long j14 = j10;
        long j15 = j11;
        long j16 = j7;
        long j17 = j9;
        int i2 = 0;
        long j18 = j6;
        int i3 = 0;
        while (i2 < 10) {
            long[] jArr2 = d0;
            int i4 = i3 + 1;
            long i5 = i(j17) + e(j17, j14, j15) + jArr2[i3] + this.b0[i3] + j13;
            long j19 = j8 + i5;
            long h = h(j12) + g(j12, j18, j16) + i5;
            int i6 = i4 + 1;
            long i7 = i(j19) + e(j19, j17, j14) + jArr2[i4] + this.b0[i4] + j15;
            long j20 = j16 + i7;
            long h2 = h(h) + g(h, j12, j18) + i7;
            int i8 = i6 + 1;
            long i9 = i(j20) + e(j20, j19, j17) + jArr2[i6] + this.b0[i6] + j14;
            long j21 = j18 + i9;
            long h3 = h(h2) + g(h2, h, j12) + i9;
            int i10 = i8 + 1;
            long i11 = j17 + i(j21) + e(j21, j20, j19) + jArr2[i8] + this.b0[i8];
            long j22 = j12 + i11;
            long h4 = h(h3) + g(h3, h2, h) + i11;
            int i12 = i10 + 1;
            long i13 = i(j22) + e(j22, j21, j20) + jArr2[i10] + this.b0[i10] + j19;
            j13 = h + i13;
            long h5 = h(h4) + g(h4, h3, h2) + i13;
            int i14 = i12 + 1;
            long i15 = i(j13) + e(j13, j22, j21) + jArr2[i12] + this.b0[i12] + j20;
            j15 = h2 + i15;
            j16 = h(h5) + g(h5, h4, h3) + i15;
            int i16 = i14 + 1;
            long i17 = i(j15) + e(j15, j13, j22) + jArr2[i14] + this.b0[i14] + j21;
            j14 = h3 + i17;
            j18 = h(j16) + g(j16, h5, h4) + i17;
            long i18 = i(j14) + e(j14, j15, j13) + jArr2[i16] + this.b0[i16] + j22;
            j8 = h5;
            i2++;
            j17 = h4 + i18;
            j12 = h(j18) + g(j18, j16, j8) + i18;
            i3 = i16 + 1;
        }
        this.T += j12;
        this.U += j18;
        this.V += j16;
        this.W += j8;
        this.X += j17;
        this.Y += j14;
        this.Z += j15;
        this.a0 += j13;
        this.c0 = 0;
        for (int i19 = 0; i19 < 16; i19++) {
            this.b0[i19] = 0;
        }
    }

    public final void l(byte[] bArr, int i) {
        long[] jArr = this.b0;
        int i2 = this.c0;
        int v = z61.v(bArr, i);
        jArr[i2] = (z61.v(bArr, i + 4) & 4294967295L) | ((v & 4294967295L) << 32);
        int i3 = this.c0 + 1;
        this.c0 = i3;
        if (i3 == 16) {
            k();
        }
    }

    @Override // defpackage.tl
    public void reset() {
        this.R = 0L;
        this.S = 0L;
        int i = 0;
        this.Q = 0;
        int i2 = 0;
        while (true) {
            byte[] bArr = this.P;
            if (i2 >= bArr.length) {
                break;
            }
            bArr[i2] = 0;
            i2++;
        }
        this.c0 = 0;
        while (true) {
            long[] jArr = this.b0;
            if (i == jArr.length) {
                return;
            }
            jArr[i] = 0;
            i++;
        }
    }

    @Override // defpackage.tl
    public final void update(byte[] bArr, int i, int i2) {
        while (this.Q != 0 && i2 > 0) {
            f(bArr[i]);
            i++;
            i2--;
        }
        while (i2 > this.P.length) {
            l(bArr, i);
            byte[] bArr2 = this.P;
            i += bArr2.length;
            i2 -= bArr2.length;
            this.R += bArr2.length;
        }
        while (i2 > 0) {
            f(bArr[i]);
            i++;
            i2--;
        }
    }
}