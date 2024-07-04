package defpackage;

import defpackage.j7;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

/* renamed from: u  reason: default package */
public abstract class u extends t implements Iterable {
    public Vector P = new Vector();

    public u() {
    }

    public u(s82 s82Var) {
        for (int i = 0; i != s82Var.i(); i++) {
            this.P.addElement(s82Var.h(i));
        }
    }

    public static u w(Object obj) {
        if (obj != null && !(obj instanceof u)) {
            if (obj instanceof v) {
                return w(((v) obj).h());
            }
            if (obj instanceof byte[]) {
                try {
                    return w(t.s((byte[]) obj));
                } catch (IOException e) {
                    StringBuilder b = e5.b("failed to construct sequence from byte[]: ");
                    b.append(e.getMessage());
                    throw new IllegalArgumentException(b.toString());
                }
            }
            if (obj instanceof g) {
                t h = ((g) obj).h();
                if (h instanceof u) {
                    return (u) h;
                }
            }
            StringBuilder b2 = e5.b("unknown object in getInstance: ");
            b2.append(obj.getClass().getName());
            throw new IllegalArgumentException(b2.toString());
        }
        return (u) obj;
    }

    @Override // defpackage.t, defpackage.n
    public final int hashCode() {
        Enumeration y = y();
        int size = size();
        while (y.hasMoreElements()) {
            size = (size * 17) ^ ((g) y.nextElement()).hashCode();
        }
        return size;
    }

    @Override // java.lang.Iterable
    public final Iterator<g> iterator() {
        return new j7.a(z());
    }

    @Override // defpackage.t
    public final boolean p(t tVar) {
        if (!(tVar instanceof u)) {
            return false;
        }
        u uVar = (u) tVar;
        if (size() != uVar.size()) {
            return false;
        }
        Enumeration y = y();
        Enumeration y2 = uVar.y();
        while (y.hasMoreElements()) {
            t h = ((g) y.nextElement()).h();
            t h2 = ((g) y2.nextElement()).h();
            if (h != h2 && !h.equals(h2)) {
                return false;
            }
        }
        return true;
    }

    public int size() {
        return this.P.size();
    }

    @Override // defpackage.t
    public final boolean t() {
        return true;
    }

    public final String toString() {
        return this.P.toString();
    }

    @Override // defpackage.t
    public t u() {
        mi miVar = new mi();
        miVar.P = this.P;
        return miVar;
    }

    @Override // defpackage.t
    public t v() {
        yi yiVar = new yi();
        yiVar.P = this.P;
        return yiVar;
    }

    public g x(int i) {
        return (g) this.P.elementAt(i);
    }

    public Enumeration y() {
        return this.P.elements();
    }

    public final g[] z() {
        g[] gVarArr = new g[size()];
        for (int i = 0; i != size(); i++) {
            gVarArr[i] = x(i);
        }
        return gVarArr;
    }
}