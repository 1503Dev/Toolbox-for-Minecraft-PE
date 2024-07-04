package defpackage;

import java.io.Serializable;
import java.math.BigInteger;

/* renamed from: b00  reason: default package */
public final class b00 extends wz {
    public final Serializable P;

    public b00(Boolean bool) {
        bool.getClass();
        this.P = bool;
    }

    public static boolean s(b00 b00Var) {
        Serializable serializable = b00Var.P;
        if (serializable instanceof Number) {
            Number number = (Number) serializable;
            if ((number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
                return true;
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b00.class != obj.getClass()) {
            return false;
        }
        b00 b00Var = (b00) obj;
        if (this.P == null) {
            return b00Var.P == null;
        } else if (s(this) && s(b00Var)) {
            return r().longValue() == b00Var.r().longValue();
        } else {
            Serializable serializable = this.P;
            if ((serializable instanceof Number) && (b00Var.P instanceof Number)) {
                double doubleValue = r().doubleValue();
                double doubleValue2 = b00Var.r().doubleValue();
                if (doubleValue != doubleValue2) {
                    return Double.isNaN(doubleValue) && Double.isNaN(doubleValue2);
                }
                return true;
            }
            return serializable.equals(b00Var.P);
        }
    }

    @Override // defpackage.wz
    public final boolean g() {
        Serializable serializable = this.P;
        if (serializable instanceof Boolean) {
            return ((Boolean) serializable).booleanValue();
        }
        return Boolean.parseBoolean(q());
    }

    @Override // defpackage.wz
    public final float h() {
        if (this.P instanceof Number) {
            return r().floatValue();
        }
        return Float.parseFloat(q());
    }

    public final int hashCode() {
        long doubleToLongBits;
        if (this.P == null) {
            return 31;
        }
        if (s(this)) {
            doubleToLongBits = r().longValue();
        } else {
            Serializable serializable = this.P;
            if (!(serializable instanceof Number)) {
                return serializable.hashCode();
            }
            doubleToLongBits = Double.doubleToLongBits(r().doubleValue());
        }
        return (int) ((doubleToLongBits >>> 32) ^ doubleToLongBits);
    }

    @Override // defpackage.wz
    public final int m() {
        if (this.P instanceof Number) {
            return r().intValue();
        }
        return Integer.parseInt(q());
    }

    @Override // defpackage.wz
    public final String q() {
        Serializable serializable = this.P;
        if (serializable instanceof Number) {
            return r().toString();
        }
        if (serializable instanceof Boolean) {
            return ((Boolean) serializable).toString();
        }
        return (String) serializable;
    }

    public final Number r() {
        Serializable serializable = this.P;
        return serializable instanceof String ? new v00((String) serializable) : (Number) serializable;
    }

    public b00(Number number) {
        number.getClass();
        this.P = number;
    }

    public b00(String str) {
        str.getClass();
        this.P = str;
    }
}