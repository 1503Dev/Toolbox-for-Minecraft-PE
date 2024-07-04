package defpackage;

import defpackage.ft2;
import defpackage.ox2;

/* renamed from: ft2  reason: default package */
public class ft2<MessageType extends ox2<MessageType, BuilderType>, BuilderType extends ft2<MessageType, BuilderType>> extends ct1<MessageType, BuilderType> {
    public final ox2 P;
    public ox2 Q;

    public ft2(MessageType messagetype) {
        this.P = messagetype;
        if (!messagetype.l()) {
            this.Q = (ox2) messagetype.m(4);
            return;
        }
        throw new IllegalArgumentException("Default instance must be immutable.");
    }

    public final MessageType a() {
        MessageType b = b();
        if (b.k()) {
            return b;
        }
        throw new f44();
    }

    public final MessageType b() {
        if (!this.Q.l()) {
            return (MessageType) this.Q;
        }
        ox2 ox2Var = this.Q;
        ox2Var.getClass();
        lq3.c.a(ox2Var.getClass()).a(ox2Var);
        ox2Var.f();
        return (MessageType) this.Q;
    }

    public final Object clone() {
        ft2 ft2Var = (ft2) this.P.m(5);
        ft2Var.Q = b();
        return ft2Var;
    }

    public final void d() {
        if (!this.Q.l()) {
            ox2 ox2Var = (ox2) this.P.m(4);
            lq3.c.a(ox2Var.getClass()).c(ox2Var, this.Q);
            this.Q = ox2Var;
        }
    }
}