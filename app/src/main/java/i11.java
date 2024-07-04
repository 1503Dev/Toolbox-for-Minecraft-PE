package defpackage;

/* renamed from: i11  reason: default package */
public final class i11 {
    public static i11 d;
    public long a;
    public long b;
    public int c;

    public final void a(long j, double d2, double d3) {
        float f;
        float f2 = ((float) (j - 946728000000L)) / 8.64E7f;
        double d4 = (0.01720197f * f2) + 6.24006f;
        Double.isNaN(d4);
        double sin = (Math.sin(f * 3.0f) * 5.236000106378924E-6d) + (Math.sin(2.0f * f) * 3.4906598739326E-4d) + (Math.sin(d4) * 0.03341960161924362d) + d4 + 1.796593063d + 3.141592653589793d;
        double d5 = (-d3) / 360.0d;
        double d6 = f2 - 9.0E-4f;
        Double.isNaN(d6);
        double round = ((float) Math.round(d6 - d5)) + 9.0E-4f;
        Double.isNaN(round);
        double sin2 = (Math.sin(2.0d * sin) * (-0.0069d)) + (Math.sin(d4) * 0.0053d) + round + d5;
        double asin = Math.asin(Math.sin(0.4092797040939331d) * Math.sin(sin));
        double d7 = 0.01745329238474369d * d2;
        double sin3 = (Math.sin(-0.10471975803375244d) - (Math.sin(asin) * Math.sin(d7))) / (Math.cos(asin) * Math.cos(d7));
        if (sin3 >= 1.0d) {
            this.c = 1;
        } else if (sin3 > -1.0d) {
            double acos = (float) (Math.acos(sin3) / 6.283185307179586d);
            Double.isNaN(acos);
            this.a = Math.round((sin2 + acos) * 8.64E7d) + 946728000000L;
            Double.isNaN(acos);
            long round2 = Math.round((sin2 - acos) * 8.64E7d) + 946728000000L;
            this.b = round2;
            if (round2 >= j || this.a <= j) {
                this.c = 1;
                return;
            } else {
                this.c = 0;
                return;
            }
        } else {
            this.c = 0;
        }
        this.a = -1L;
        this.b = -1L;
    }
}