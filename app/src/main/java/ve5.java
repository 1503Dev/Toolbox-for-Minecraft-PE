package defpackage;

import java.io.Serializable;

/* renamed from: ve5  reason: default package */
public enum ve5 {
    VOID(Void.class, null),
    INT(Integer.class, 0),
    LONG(Long.class, 0L),
    FLOAT(Float.class, Float.valueOf(0.0f)),
    DOUBLE(Double.class, Double.valueOf(0.0d)),
    BOOLEAN(Boolean.class, Boolean.FALSE),
    STRING(String.class, ""),
    BYTE_STRING(gd5.class, gd5.Q),
    ENUM(Integer.class, null),
    MESSAGE(Object.class, null);
    
    public final Object P;

    ve5(Class cls, Serializable serializable) {
        this.P = serializable;
    }
}