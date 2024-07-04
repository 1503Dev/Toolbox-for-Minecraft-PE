package defpackage;

import java.util.Arrays;

/* renamed from: eu5  reason: default package */
public final class eu5 {
    public static final /* synthetic */ int f = 0;
    public final int a;
    public final int b;
    public final int c;
    public final byte[] d;
    public int e;

    static {
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
    }

    @Deprecated
    public eu5(int i, int i2, int i3, byte[] bArr) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && eu5.class == obj.getClass()) {
            eu5 eu5Var = (eu5) obj;
            if (this.a == eu5Var.a && this.b == eu5Var.b && this.c == eu5Var.c && Arrays.equals(this.d, eu5Var.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.e;
        if (i == 0) {
            int i2 = ((((this.a + 527) * 31) + this.b) * 31) + this.c;
            int hashCode = Arrays.hashCode(this.d) + (i2 * 31);
            this.e = hashCode;
            return hashCode;
        }
        return i;
    }

    public final String toString() {
        String str;
        String str2;
        String str3;
        int i = this.a;
        boolean z = true;
        if (i != -1) {
            if (i != 6) {
                if (i != 1) {
                    if (i != 2) {
                        str = "Undefined color space";
                    } else {
                        str = "BT601";
                    }
                } else {
                    str = "BT709";
                }
            } else {
                str = "BT2020";
            }
        } else {
            str = "Unset color space";
        }
        int i2 = this.b;
        if (i2 != -1) {
            if (i2 != 1) {
                if (i2 != 2) {
                    str2 = "Undefined color range";
                } else {
                    str2 = "Limited range";
                }
            } else {
                str2 = "Full range";
            }
        } else {
            str2 = "Unset color range";
        }
        int i3 = this.c;
        if (i3 != -1) {
            if (i3 != 1) {
                if (i3 != 3) {
                    if (i3 != 6) {
                        if (i3 != 7) {
                            str3 = "Undefined color transfer";
                        } else {
                            str3 = "HLG";
                        }
                    } else {
                        str3 = "ST2084 PQ";
                    }
                } else {
                    str3 = "SDR SMPTE 170M";
                }
            } else {
                str3 = "Linear";
            }
        } else {
            str3 = "Unset color transfer";
        }
        if (this.d == null) {
            z = false;
        }
        StringBuilder b = sd1.b("ColorInfo(", str, ", ", str2, ", ");
        b.append(str3);
        b.append(", ");
        b.append(z);
        b.append(")");
        return b.toString();
    }
}