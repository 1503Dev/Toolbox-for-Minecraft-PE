package defpackage;

import java.math.BigDecimal;

/* renamed from: v00  reason: default package */
public final class v00 extends Number {
    public final String P;

    public v00(String str) {
        this.P = str;
    }

    @Override // java.lang.Number
    public final double doubleValue() {
        return Double.parseDouble(this.P);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof v00) {
            String str = this.P;
            String str2 = ((v00) obj).P;
            return str == str2 || str.equals(str2);
        }
        return false;
    }

    @Override // java.lang.Number
    public final float floatValue() {
        return Float.parseFloat(this.P);
    }

    public final int hashCode() {
        return this.P.hashCode();
    }

    @Override // java.lang.Number
    public final int intValue() {
        try {
            try {
                return Integer.parseInt(this.P);
            } catch (NumberFormatException unused) {
                return (int) Long.parseLong(this.P);
            }
        } catch (NumberFormatException unused2) {
            return new BigDecimal(this.P).intValue();
        }
    }

    @Override // java.lang.Number
    public final long longValue() {
        try {
            return Long.parseLong(this.P);
        } catch (NumberFormatException unused) {
            return new BigDecimal(this.P).longValue();
        }
    }

    public final String toString() {
        return this.P;
    }
}