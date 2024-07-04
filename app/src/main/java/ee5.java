package defpackage;

import defpackage.ee5;
import defpackage.ie5;
import java.io.IOException;

/* renamed from: ee5  reason: default package */
public class ee5<MessageType extends ie5<MessageType, BuilderType>, BuilderType extends ee5<MessageType, BuilderType>> extends uc5<MessageType, BuilderType> {
    public final ie5 P;
    public ie5 Q;

    public ee5(MessageType messagetype) {
        this.P = messagetype;
        if (messagetype.r()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.Q = messagetype.i();
    }

    public final Object clone() {
        ee5 ee5Var = (ee5) this.P.t(5, null);
        ee5Var.Q = i();
        return ee5Var;
    }

    public final void e(ie5 ie5Var) {
        if (!this.P.equals(ie5Var)) {
            if (!this.Q.r()) {
                ie5 i = this.P.i();
                vf5.c.a(i.getClass()).c(i, this.Q);
                this.Q = i;
            }
            ie5 ie5Var2 = this.Q;
            vf5.c.a(ie5Var2.getClass()).c(ie5Var2, ie5Var);
        }
    }

    public final void f(byte[] bArr, int i, ud5 ud5Var) {
        if (!this.Q.r()) {
            ie5 i2 = this.P.i();
            vf5.c.a(i2.getClass()).c(i2, this.Q);
            this.Q = i2;
        }
        try {
            vf5.c.a(this.Q.getClass()).h(this.Q, bArr, 0, i, new yc5(ud5Var));
        } catch (te5 e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e2);
        } catch (IndexOutOfBoundsException unused) {
            throw te5.f();
        }
    }

    public final MessageType h() {
        MessageType i = i();
        if (i.q()) {
            return i;
        }
        throw new ng5();
    }

    public final MessageType i() {
        if (!this.Q.r()) {
            return (MessageType) this.Q;
        }
        ie5 ie5Var = this.Q;
        ie5Var.getClass();
        vf5.c.a(ie5Var.getClass()).a(ie5Var);
        ie5Var.m();
        return (MessageType) this.Q;
    }

    public final void j() {
        if (!this.Q.r()) {
            ie5 i = this.P.i();
            vf5.c.a(i.getClass()).c(i, this.Q);
            this.Q = i;
        }
    }
}