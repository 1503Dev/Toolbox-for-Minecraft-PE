package defpackage;

import android.graphics.Path;
import android.util.Log;
import java.util.ArrayList;

/* renamed from: de0  reason: default package */
public final class de0 {

    /* renamed from: de0$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class a {
        public char a;
        public float[] b;

        public a(char c, float[] fArr) {
            this.a = c;
            this.b = fArr;
        }

        public a(a aVar) {
            this.a = aVar.a;
            float[] fArr = aVar.b;
            this.b = de0.b(fArr, fArr.length);
        }

        public static void a(Path path, float f, float f2, float f3, float f4, float f5, float f6, float f7, boolean z, boolean z2) {
            double d;
            double d2;
            double radians = Math.toRadians(f7);
            double cos = Math.cos(radians);
            double sin = Math.sin(radians);
            double d3 = f;
            Double.isNaN(d3);
            Double.isNaN(d3);
            double d4 = f2;
            Double.isNaN(d4);
            Double.isNaN(d4);
            double d5 = (d4 * sin) + (d3 * cos);
            double d6 = d3;
            double d7 = f5;
            Double.isNaN(d7);
            Double.isNaN(d7);
            double d8 = d5 / d7;
            double d9 = -f;
            Double.isNaN(d9);
            Double.isNaN(d9);
            Double.isNaN(d4);
            Double.isNaN(d4);
            double d10 = (d4 * cos) + (d9 * sin);
            double d11 = f6;
            Double.isNaN(d11);
            Double.isNaN(d11);
            double d12 = d10 / d11;
            double d13 = d4;
            double d14 = f3;
            Double.isNaN(d14);
            Double.isNaN(d14);
            double d15 = f4;
            Double.isNaN(d15);
            Double.isNaN(d15);
            Double.isNaN(d7);
            Double.isNaN(d7);
            double d16 = ((d15 * sin) + (d14 * cos)) / d7;
            double d17 = -f3;
            Double.isNaN(d17);
            Double.isNaN(d17);
            Double.isNaN(d15);
            Double.isNaN(d15);
            Double.isNaN(d11);
            Double.isNaN(d11);
            double d18 = ((d15 * cos) + (d17 * sin)) / d11;
            double d19 = d8 - d16;
            double d20 = d12 - d18;
            double d21 = (d8 + d16) / 2.0d;
            double d22 = (d12 + d18) / 2.0d;
            double d23 = (d20 * d20) + (d19 * d19);
            if (d23 == 0.0d) {
                Log.w("PathParser", " Points are coincident");
                return;
            }
            double d24 = (1.0d / d23) - 0.25d;
            if (d24 < 0.0d) {
                Log.w("PathParser", "Points are too far apart " + d23);
                float sqrt = (float) (Math.sqrt(d23) / 1.99999d);
                a(path, f, f2, f3, f4, f5 * sqrt, f6 * sqrt, f7, z, z2);
                return;
            }
            double sqrt2 = Math.sqrt(d24);
            double d25 = d19 * sqrt2;
            double d26 = sqrt2 * d20;
            if (z == z2) {
                d = d21 - d26;
                d2 = d22 + d25;
            } else {
                d = d21 + d26;
                d2 = d22 - d25;
            }
            double atan2 = Math.atan2(d12 - d2, d8 - d);
            double atan22 = Math.atan2(d18 - d2, d16 - d) - atan2;
            int i = 0;
            if (z2 != (atan22 >= 0.0d)) {
                atan22 = atan22 > 0.0d ? atan22 - 6.283185307179586d : atan22 + 6.283185307179586d;
            }
            Double.isNaN(d7);
            Double.isNaN(d7);
            double d27 = d * d7;
            Double.isNaN(d11);
            Double.isNaN(d11);
            double d28 = d2 * d11;
            double d29 = (d27 * cos) - (d28 * sin);
            double d30 = (d28 * cos) + (d27 * sin);
            int ceil = (int) Math.ceil(Math.abs((atan22 * 4.0d) / 3.141592653589793d));
            double cos2 = Math.cos(radians);
            double sin2 = Math.sin(radians);
            double cos3 = Math.cos(atan2);
            double sin3 = Math.sin(atan2);
            Double.isNaN(d7);
            Double.isNaN(d7);
            double d31 = -d7;
            double d32 = d31 * cos2;
            Double.isNaN(d11);
            Double.isNaN(d11);
            double d33 = d11 * sin2;
            double d34 = (d32 * sin3) - (d33 * cos3);
            double d35 = d31 * sin2;
            Double.isNaN(d11);
            Double.isNaN(d11);
            double d36 = d11 * cos2;
            double d37 = (cos3 * d36) + (sin3 * d35);
            double d38 = ceil;
            Double.isNaN(d38);
            Double.isNaN(d38);
            Double.isNaN(d38);
            double d39 = atan22 / d38;
            double d40 = atan2;
            while (i < ceil) {
                double d41 = d40 + d39;
                double sin4 = Math.sin(d41);
                double cos4 = Math.cos(d41);
                Double.isNaN(d7);
                Double.isNaN(d7);
                double d42 = d39;
                double d43 = (((d7 * cos2) * cos4) + d29) - (d33 * sin4);
                Double.isNaN(d7);
                Double.isNaN(d7);
                double d44 = d29;
                double d45 = (d36 * sin4) + (d7 * sin2 * cos4) + d30;
                double d46 = (d32 * sin4) - (d33 * cos4);
                double d47 = (cos4 * d36) + (sin4 * d35);
                double d48 = d41 - d40;
                double tan = Math.tan(d48 / 2.0d);
                double sqrt3 = ((Math.sqrt(((tan * 3.0d) * tan) + 4.0d) - 1.0d) * Math.sin(d48)) / 3.0d;
                path.rLineTo(0.0f, 0.0f);
                path.cubicTo((float) ((d34 * sqrt3) + d6), (float) ((d37 * sqrt3) + d13), (float) (d43 - (sqrt3 * d46)), (float) (d45 - (sqrt3 * d47)), (float) d43, (float) d45);
                i++;
                d36 = d36;
                d35 = d35;
                ceil = ceil;
                cos2 = cos2;
                d40 = d41;
                d7 = d7;
                d37 = d47;
                d34 = d46;
                d6 = d43;
                d13 = d45;
                d39 = d42;
                d29 = d44;
            }
        }

        public static void b(a[] aVarArr, Path path) {
            int i;
            int i2;
            float[] fArr;
            char c;
            int i3;
            boolean z;
            boolean z2;
            float f;
            float f2;
            boolean z3;
            boolean z4;
            float f3;
            float f4;
            float f5;
            float f6;
            float f7;
            float f8;
            float f9;
            float f10;
            float f11;
            float f12;
            float f13;
            float f14;
            float f15;
            float f16;
            float f17;
            float f18;
            float f19;
            float f20;
            float f21;
            a[] aVarArr2 = aVarArr;
            float[] fArr2 = new float[6];
            char c2 = 'm';
            char c3 = 0;
            char c4 = 'm';
            int i4 = 0;
            while (i4 < aVarArr2.length) {
                a aVar = aVarArr2[i4];
                char c5 = aVar.a;
                float[] fArr3 = aVar.b;
                float f22 = fArr2[c3];
                float f23 = fArr2[1];
                float f24 = fArr2[2];
                float f25 = fArr2[3];
                float f26 = fArr2[4];
                float f27 = fArr2[5];
                switch (c5) {
                    case 'A':
                    case 'a':
                        i = 7;
                        break;
                    case 'C':
                    case 'c':
                        i = 6;
                        break;
                    case 'H':
                    case 'V':
                    case 'h':
                    case 'v':
                        i = 1;
                        break;
                    case 'Q':
                    case 'S':
                    case 'q':
                    case 's':
                        i = 4;
                        break;
                    case 'Z':
                    case 'z':
                        path.close();
                        path.moveTo(f26, f27);
                        f22 = f26;
                        f24 = f22;
                        f23 = f27;
                        f25 = f23;
                    default:
                        i = 2;
                        break;
                }
                float f28 = f26;
                float f29 = f27;
                float f30 = f22;
                float f31 = f23;
                int i5 = 0;
                while (i5 < fArr3.length) {
                    if (c5 != 'A') {
                        if (c5 != 'C') {
                            if (c5 != 'H') {
                                if (c5 != 'Q') {
                                    if (c5 != 'V') {
                                        if (c5 != 'a') {
                                            if (c5 != 'c') {
                                                if (c5 != 'h') {
                                                    if (c5 != 'q') {
                                                        if (c5 != 'v') {
                                                            if (c5 != 'L') {
                                                                if (c5 != 'M') {
                                                                    if (c5 != 'S') {
                                                                        if (c5 != 'T') {
                                                                            if (c5 != 'l') {
                                                                                if (c5 != c2) {
                                                                                    if (c5 != 's') {
                                                                                        if (c5 == 't') {
                                                                                            if (c4 != 'q' && c4 != 't' && c4 != 'Q' && c4 != 'T') {
                                                                                                f21 = 0.0f;
                                                                                                f20 = 0.0f;
                                                                                            } else {
                                                                                                f20 = f30 - f24;
                                                                                                f21 = f31 - f25;
                                                                                            }
                                                                                            int i6 = i5 + 0;
                                                                                            int i7 = i5 + 1;
                                                                                            path.rQuadTo(f20, f21, fArr3[i6], fArr3[i7]);
                                                                                            float f32 = f20 + f30;
                                                                                            float f33 = f21 + f31;
                                                                                            f30 += fArr3[i6];
                                                                                            f31 += fArr3[i7];
                                                                                            f25 = f33;
                                                                                            f24 = f32;
                                                                                        }
                                                                                        i2 = i5;
                                                                                    } else {
                                                                                        if (c4 != 'c' && c4 != 's' && c4 != 'C' && c4 != 'S') {
                                                                                            f19 = 0.0f;
                                                                                            f18 = 0.0f;
                                                                                        } else {
                                                                                            f18 = f31 - f25;
                                                                                            f19 = f30 - f24;
                                                                                        }
                                                                                        int i8 = i5 + 0;
                                                                                        int i9 = i5 + 1;
                                                                                        int i10 = i5 + 2;
                                                                                        int i11 = i5 + 3;
                                                                                        i2 = i5;
                                                                                        f3 = f31;
                                                                                        float f34 = f30;
                                                                                        path.rCubicTo(f19, f18, fArr3[i8], fArr3[i9], fArr3[i10], fArr3[i11]);
                                                                                        f4 = fArr3[i8] + f34;
                                                                                        f5 = fArr3[i9] + f3;
                                                                                        f6 = f34 + fArr3[i10];
                                                                                        f7 = fArr3[i11];
                                                                                    }
                                                                                } else {
                                                                                    i2 = i5;
                                                                                    float f35 = fArr3[i2 + 0];
                                                                                    f30 += f35;
                                                                                    float f36 = fArr3[i2 + 1];
                                                                                    f31 += f36;
                                                                                    if (i2 > 0) {
                                                                                        path.rLineTo(f35, f36);
                                                                                    } else {
                                                                                        path.rMoveTo(f35, f36);
                                                                                        f29 = f31;
                                                                                        f28 = f30;
                                                                                    }
                                                                                }
                                                                            } else {
                                                                                i2 = i5;
                                                                                f10 = f31;
                                                                                int i12 = i2 + 0;
                                                                                int i13 = i2 + 1;
                                                                                path.rLineTo(fArr3[i12], fArr3[i13]);
                                                                                f30 += fArr3[i12];
                                                                                f11 = fArr3[i13];
                                                                            }
                                                                        } else {
                                                                            i2 = i5;
                                                                            float f37 = f31;
                                                                            float f38 = f30;
                                                                            if (c4 != 'q' && c4 != 't' && c4 != 'Q' && c4 != 'T') {
                                                                                f16 = f38;
                                                                                f17 = f37;
                                                                            } else {
                                                                                f16 = (f38 * 2.0f) - f24;
                                                                                f17 = (f37 * 2.0f) - f25;
                                                                            }
                                                                            int i14 = i2 + 0;
                                                                            int i15 = i2 + 1;
                                                                            path.quadTo(f16, f17, fArr3[i14], fArr3[i15]);
                                                                            f25 = f17;
                                                                            f24 = f16;
                                                                            fArr = fArr3;
                                                                            c = c5;
                                                                            i3 = i4;
                                                                            f30 = fArr3[i14];
                                                                            f31 = fArr3[i15];
                                                                        }
                                                                    } else {
                                                                        i2 = i5;
                                                                        float f39 = f31;
                                                                        float f40 = f30;
                                                                        if (c4 != 'c' && c4 != 's' && c4 != 'C' && c4 != 'S') {
                                                                            f15 = f40;
                                                                            f14 = f39;
                                                                        } else {
                                                                            f14 = (f39 * 2.0f) - f25;
                                                                            f15 = (f40 * 2.0f) - f24;
                                                                        }
                                                                        int i16 = i2 + 0;
                                                                        int i17 = i2 + 1;
                                                                        int i18 = i2 + 2;
                                                                        int i19 = i2 + 3;
                                                                        path.cubicTo(f15, f14, fArr3[i16], fArr3[i17], fArr3[i18], fArr3[i19]);
                                                                        float f41 = fArr3[i16];
                                                                        float f42 = fArr3[i17];
                                                                        f9 = fArr3[i18];
                                                                        f8 = fArr3[i19];
                                                                        f24 = f41;
                                                                        f25 = f42;
                                                                        f30 = f9;
                                                                        f31 = f8;
                                                                    }
                                                                } else {
                                                                    i2 = i5;
                                                                    f12 = fArr3[i2 + 0];
                                                                    f13 = fArr3[i2 + 1];
                                                                    if (i2 > 0) {
                                                                        path.lineTo(f12, f13);
                                                                    } else {
                                                                        path.moveTo(f12, f13);
                                                                        f28 = f12;
                                                                        f29 = f13;
                                                                    }
                                                                }
                                                                f30 = f28;
                                                                f31 = f29;
                                                            } else {
                                                                i2 = i5;
                                                                int i20 = i2 + 0;
                                                                int i21 = i2 + 1;
                                                                path.lineTo(fArr3[i20], fArr3[i21]);
                                                                f12 = fArr3[i20];
                                                                f13 = fArr3[i21];
                                                            }
                                                            f30 = f12;
                                                            f31 = f13;
                                                        } else {
                                                            i2 = i5;
                                                            f10 = f31;
                                                            int i22 = i2 + 0;
                                                            path.rLineTo(0.0f, fArr3[i22]);
                                                            f11 = fArr3[i22];
                                                        }
                                                        f31 = f10 + f11;
                                                    } else {
                                                        i2 = i5;
                                                        f3 = f31;
                                                        float f43 = f30;
                                                        int i23 = i2 + 0;
                                                        int i24 = i2 + 1;
                                                        int i25 = i2 + 2;
                                                        int i26 = i2 + 3;
                                                        path.rQuadTo(fArr3[i23], fArr3[i24], fArr3[i25], fArr3[i26]);
                                                        f4 = fArr3[i23] + f43;
                                                        f5 = fArr3[i24] + f3;
                                                        float f44 = f43 + fArr3[i25];
                                                        float f45 = fArr3[i26];
                                                        f6 = f44;
                                                        f7 = f45;
                                                    }
                                                } else {
                                                    i2 = i5;
                                                    int i27 = i2 + 0;
                                                    path.rLineTo(fArr3[i27], 0.0f);
                                                    f30 += fArr3[i27];
                                                }
                                                fArr = fArr3;
                                                c = c5;
                                                i3 = i4;
                                            } else {
                                                i2 = i5;
                                                f3 = f31;
                                                float f46 = f30;
                                                int i28 = i2 + 2;
                                                int i29 = i2 + 3;
                                                int i30 = i2 + 4;
                                                int i31 = i2 + 5;
                                                path.rCubicTo(fArr3[i2 + 0], fArr3[i2 + 1], fArr3[i28], fArr3[i29], fArr3[i30], fArr3[i31]);
                                                f4 = fArr3[i28] + f46;
                                                f5 = fArr3[i29] + f3;
                                                f6 = f46 + fArr3[i30];
                                                f7 = fArr3[i31];
                                            }
                                            f8 = f3 + f7;
                                            f24 = f4;
                                            f25 = f5;
                                            f9 = f6;
                                            f30 = f9;
                                            f31 = f8;
                                            fArr = fArr3;
                                            c = c5;
                                            i3 = i4;
                                        } else {
                                            i2 = i5;
                                            float f47 = f31;
                                            float f48 = f30;
                                            int i32 = i2 + 5;
                                            float f49 = fArr3[i32] + f48;
                                            int i33 = i2 + 6;
                                            float f50 = fArr3[i33] + f47;
                                            float f51 = fArr3[i2 + 0];
                                            float f52 = fArr3[i2 + 1];
                                            float f53 = fArr3[i2 + 2];
                                            if (fArr3[i2 + 3] != 0.0f) {
                                                z3 = true;
                                            } else {
                                                z3 = false;
                                            }
                                            if (fArr3[i2 + 4] != 0.0f) {
                                                z4 = true;
                                            } else {
                                                z4 = false;
                                            }
                                            fArr = fArr3;
                                            c = c5;
                                            i3 = i4;
                                            a(path, f48, f47, f49, f50, f51, f52, f53, z3, z4);
                                            f30 = f48 + fArr[i32];
                                            f31 = f47 + fArr[i33];
                                        }
                                    } else {
                                        i2 = i5;
                                        fArr = fArr3;
                                        c = c5;
                                        i3 = i4;
                                        int i34 = i2 + 0;
                                        path.lineTo(f30, fArr[i34]);
                                        f31 = fArr[i34];
                                    }
                                } else {
                                    i2 = i5;
                                    fArr = fArr3;
                                    c = c5;
                                    i3 = i4;
                                    int i35 = i2 + 0;
                                    int i36 = i2 + 1;
                                    int i37 = i2 + 2;
                                    int i38 = i2 + 3;
                                    path.quadTo(fArr[i35], fArr[i36], fArr[i37], fArr[i38]);
                                    f = fArr[i35];
                                    f2 = fArr[i36];
                                    f30 = fArr[i37];
                                    f31 = fArr[i38];
                                }
                            } else {
                                i2 = i5;
                                fArr = fArr3;
                                c = c5;
                                i3 = i4;
                                int i39 = i2 + 0;
                                path.lineTo(fArr[i39], f31);
                                f30 = fArr[i39];
                            }
                            i5 = i2 + i;
                            c4 = c;
                            c5 = c4;
                            fArr3 = fArr;
                            i4 = i3;
                            c2 = 'm';
                        } else {
                            i2 = i5;
                            fArr = fArr3;
                            c = c5;
                            i3 = i4;
                            int i40 = i2 + 2;
                            int i41 = i2 + 3;
                            int i42 = i2 + 4;
                            int i43 = i2 + 5;
                            path.cubicTo(fArr[i2 + 0], fArr[i2 + 1], fArr[i40], fArr[i41], fArr[i42], fArr[i43]);
                            float f54 = fArr[i42];
                            float f55 = fArr[i43];
                            f = fArr[i40];
                            f30 = f54;
                            f31 = f55;
                            f2 = fArr[i41];
                        }
                        f24 = f;
                        f25 = f2;
                        i5 = i2 + i;
                        c4 = c;
                        c5 = c4;
                        fArr3 = fArr;
                        i4 = i3;
                        c2 = 'm';
                    } else {
                        i2 = i5;
                        float f56 = f31;
                        float f57 = f30;
                        fArr = fArr3;
                        c = c5;
                        i3 = i4;
                        int i44 = i2 + 5;
                        float f58 = fArr[i44];
                        int i45 = i2 + 6;
                        float f59 = fArr[i45];
                        float f60 = fArr[i2 + 0];
                        float f61 = fArr[i2 + 1];
                        float f62 = fArr[i2 + 2];
                        if (fArr[i2 + 3] != 0.0f) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (fArr[i2 + 4] != 0.0f) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        a(path, f57, f56, f58, f59, f60, f61, f62, z, z2);
                        f30 = fArr[i44];
                        f31 = fArr[i45];
                    }
                    f25 = f31;
                    f24 = f30;
                    i5 = i2 + i;
                    c4 = c;
                    c5 = c4;
                    fArr3 = fArr;
                    i4 = i3;
                    c2 = 'm';
                }
                int i46 = i4;
                fArr2[0] = f30;
                fArr2[1] = f31;
                fArr2[2] = f24;
                fArr2[3] = f25;
                fArr2[4] = f28;
                fArr2[5] = f29;
                i4 = i46 + 1;
                c4 = aVarArr[i46].a;
                c2 = 'm';
                c3 = 0;
                aVarArr2 = aVarArr;
            }
        }
    }

    public static boolean a(a[] aVarArr, a[] aVarArr2) {
        if (aVarArr == null || aVarArr2 == null || aVarArr.length != aVarArr2.length) {
            return false;
        }
        for (int i = 0; i < aVarArr.length; i++) {
            a aVar = aVarArr[i];
            char c = aVar.a;
            a aVar2 = aVarArr2[i];
            if (c != aVar2.a || aVar.b.length != aVar2.b.length) {
                return false;
            }
        }
        return true;
    }

    public static float[] b(float[] fArr, int i) {
        if (i >= 0) {
            int length = fArr.length;
            if (length >= 0) {
                int i2 = i - 0;
                int min = Math.min(i2, length - 0);
                float[] fArr2 = new float[i2];
                System.arraycopy(fArr, 0, fArr2, 0, min);
                return fArr2;
            }
            throw new ArrayIndexOutOfBoundsException();
        }
        throw new IllegalArgumentException();
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x008b, code lost:
        if (r13 == false) goto L53;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0098 A[Catch: NumberFormatException -> 0x00b9, LOOP:3: B:29:0x006d->B:49:0x0098, LOOP_END, TryCatch #0 {NumberFormatException -> 0x00b9, blocks: (B:26:0x005a, B:29:0x006d, B:31:0x0073, B:36:0x0081, B:49:0x0098, B:51:0x009d, B:54:0x00ad, B:56:0x00b1), top: B:71:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x009d A[Catch: NumberFormatException -> 0x00b9, TryCatch #0 {NumberFormatException -> 0x00b9, blocks: (B:26:0x005a, B:29:0x006d, B:31:0x0073, B:36:0x0081, B:49:0x0098, B:51:0x009d, B:54:0x00ad, B:56:0x00b1), top: B:71:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ad A[Catch: NumberFormatException -> 0x00b9, TryCatch #0 {NumberFormatException -> 0x00b9, blocks: (B:26:0x005a, B:29:0x006d, B:31:0x0073, B:36:0x0081, B:49:0x0098, B:51:0x009d, B:54:0x00ad, B:56:0x00b1), top: B:71:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0097 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static a[] c(String str) {
        String trim;
        float[] fArr;
        int i;
        if (str == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        int i3 = 1;
        int i4 = 0;
        while (i3 < str.length()) {
            while (i3 < str.length()) {
                char charAt = str.charAt(i3);
                if ((charAt - 'Z') * (charAt - 'A') > 0) {
                    if ((charAt - 'z') * (charAt - 'a') > 0) {
                        continue;
                        i3++;
                    }
                }
                if (charAt != 'e' && charAt != 'E') {
                    trim = str.substring(i4, i3).trim();
                    if (trim.length() > 0) {
                        if (trim.charAt(i2) != 'z' && trim.charAt(i2) != 'Z') {
                            try {
                                float[] fArr2 = new float[trim.length()];
                                int length = trim.length();
                                int i5 = 0;
                                for (int i6 = 1; i6 < length; i6 = i) {
                                    boolean z = false;
                                    boolean z2 = false;
                                    boolean z3 = false;
                                    boolean z4 = false;
                                    i = i6;
                                    while (i < trim.length()) {
                                        char charAt2 = trim.charAt(i);
                                        if (charAt2 != ' ') {
                                            if (charAt2 != 'E' && charAt2 != 'e') {
                                                switch (charAt2) {
                                                    case '-':
                                                        if (i != i6) {
                                                        }
                                                        break;
                                                    case '.':
                                                        if (!z3) {
                                                            z3 = true;
                                                            break;
                                                        }
                                                        z2 = true;
                                                        break;
                                                }
                                                z4 = false;
                                                if (!z) {
                                                }
                                            } else {
                                                z4 = true;
                                                if (!z) {
                                                    i++;
                                                } else {
                                                    if (i6 < i) {
                                                        fArr2[i5] = Float.parseFloat(trim.substring(i6, i));
                                                        i5++;
                                                    }
                                                    if (z2) {
                                                        i++;
                                                    }
                                                }
                                            }
                                        }
                                        z = true;
                                        z4 = false;
                                        if (!z) {
                                        }
                                    }
                                    if (i6 < i) {
                                    }
                                    if (z2) {
                                    }
                                }
                                fArr = b(fArr2, i5);
                                i2 = 0;
                            } catch (NumberFormatException e) {
                                throw new RuntimeException(ij.c("error in parsing \"", trim, "\""), e);
                            }
                        } else {
                            fArr = new float[i2];
                        }
                        arrayList.add(new a(trim.charAt(i2), fArr));
                    }
                    i4 = i3;
                    i3++;
                    i2 = 0;
                }
                i3++;
            }
            trim = str.substring(i4, i3).trim();
            if (trim.length() > 0) {
            }
            i4 = i3;
            i3++;
            i2 = 0;
        }
        if (i3 - i4 == 1 && i4 < str.length()) {
            arrayList.add(new a(str.charAt(i4), new float[0]));
        }
        return (a[]) arrayList.toArray(new a[arrayList.size()]);
    }

    public static Path d(String str) {
        Path path = new Path();
        a[] c = c(str);
        if (c != null) {
            try {
                a.b(c, path);
                return path;
            } catch (RuntimeException e) {
                throw new RuntimeException(k6.b("Error in parsing ", str), e);
            }
        }
        return null;
    }

    public static a[] e(a[] aVarArr) {
        if (aVarArr == null) {
            return null;
        }
        a[] aVarArr2 = new a[aVarArr.length];
        for (int i = 0; i < aVarArr.length; i++) {
            aVarArr2[i] = new a(aVarArr[i]);
        }
        return aVarArr2;
    }
}