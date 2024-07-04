package defpackage;

import java.io.Serializable;

/* renamed from: d43  reason: default package */
public enum d43 {
    VOID(Void.class, null),
    INT(Integer.class, 0),
    LONG(Long.class, 0L),
    FLOAT(Float.class, Float.valueOf(0.0f)),
    DOUBLE(Double.class, Double.valueOf(0.0d)),
    BOOLEAN(Boolean.class, Boolean.FALSE),
    STRING(String.class, ""),
    BYTE_STRING(y82.class, y82.Q),
    ENUM(Integer.class, null),
    MESSAGE(Object.class, null);
    
    public final Object P;

    d43(Class cls, Serializable serializable) {
        this.P = serializable;
    }
}