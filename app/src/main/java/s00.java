package defpackage;

import java.io.Serializable;

/* renamed from: s00  reason: default package */
public abstract class s00<R> implements Serializable {
    public final String toString() {
        fk0.a.getClass();
        String obj = getClass().getGenericInterfaces()[0].toString();
        if (obj.startsWith("kotlin.jvm.functions.")) {
            obj = obj.substring(21);
        }
        hy.d("Reflection.renderLambdaToString(this)", obj);
        return obj;
    }
}