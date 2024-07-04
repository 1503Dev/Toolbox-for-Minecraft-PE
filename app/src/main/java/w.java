package defpackage;

import defpackage.j7;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

/* renamed from: w  reason: default package */
public abstract class w extends t implements Iterable {
    public Vector P;
    public boolean Q;

    public w() {
        this.P = new Vector();
        this.Q = false;
    }

    public w(s82 s82Var) {
        this.P = new Vector();
        this.Q = false;
        for (int i = 0; i != s82Var.i(); i++) {
            this.P.addElement(s82Var.h(i));
        }
    }

    public w(t tVar) {
        Vector vector = new Vector();
        this.P = vector;
        this.Q = false;
        vector.addElement(tVar);
    }

    public w(g[] gVarArr) {
        this.P = new Vector();
        this.Q = false;
        for (int i = 0; i != gVarArr.length; i++) {
            this.P.addElement(gVarArr[i]);
        }
    }

    @Override // defpackage.t, defpackage.n
    public final int hashCode() {
        Enumeration w = w();
        int size = this.P.size();
        while (w.hasMoreElements()) {
            Object obj = (g) w.nextElement();
            if (obj == null) {
                obj = gi.P;
            }
            size = (size * 17) ^ obj.hashCode();
        }
        return size;
    }

    @Override // java.lang.Iterable
    public final Iterator<g> iterator() {
        g[] gVarArr = new g[this.P.size()];
        for (int i = 0; i != this.P.size(); i++) {
            gVarArr[i] = (g) this.P.elementAt(i);
        }
        return new j7.a(gVarArr);
    }

    @Override // defpackage.t
    public final boolean p(t tVar) {
        if (!(tVar instanceof w)) {
            return false;
        }
        w wVar = (w) tVar;
        if (this.P.size() != wVar.P.size()) {
            return false;
        }
        Enumeration w = w();
        Enumeration w2 = wVar.w();
        while (w.hasMoreElements()) {
            g gVar = (g) w.nextElement();
            if (gVar == null) {
                gVar = gi.P;
            }
            g gVar2 = (g) w2.nextElement();
            if (gVar2 == null) {
                gVar2 = gi.P;
            }
            t h = gVar.h();
            t h2 = gVar2.h();
            if (h != h2 && !h.equals(h2)) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.t
    public final boolean t() {
        return true;
    }

    public final String toString() {
        return this.P.toString();
    }

    @Override // defpackage.t
    public final t u() {
        if (this.Q) {
            oi oiVar = new oi();
            oiVar.P = this.P;
            return oiVar;
        }
        Vector vector = new Vector();
        for (int i = 0; i != this.P.size(); i++) {
            vector.addElement(this.P.elementAt(i));
        }
        oi oiVar2 = new oi();
        oiVar2.P = vector;
        oiVar2.x();
        return oiVar2;
    }

    @Override // defpackage.t
    public final t v() {
        zi ziVar = new zi();
        ziVar.P = this.P;
        return ziVar;
    }

    public final Enumeration w() {
        return this.P.elements();
    }

    /*  JADX ERROR: JadxOverflowException in pass: LoopRegionVisitor
        jadx.core.utils.exceptions.JadxOverflowException: LoopRegionVisitor.assignOnlyInLoop endless recursion
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:56)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:30)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:18)
        */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0059, code lost:
        if ((r13 & 255) < (r14 & 255)) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0060, code lost:
        if (r11 == r7.length) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0064, code lost:
        r11 = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void x() {
        /*
            r15 = this;
            java.lang.String r0 = "cannot encode object added to SET"
            java.lang.String r1 = "DER"
            boolean r2 = r15.Q
            if (r2 != 0) goto L90
            r2 = 1
            r15.Q = r2
            java.util.Vector r3 = r15.P
            int r3 = r3.size()
            if (r3 <= r2) goto L90
            java.util.Vector r3 = r15.P
            int r3 = r3.size()
            int r3 = r3 - r2
            r4 = 1
        L1b:
            if (r4 == 0) goto L90
            java.util.Vector r4 = r15.P
            r5 = 0
            java.lang.Object r4 = r4.elementAt(r5)
            g r4 = (defpackage.g) r4
            t r4 = r4.h()     // Catch: java.io.IOException -> L8a
            byte[] r4 = r4.o(r1)     // Catch: java.io.IOException -> L8a
            r7 = r4
            r4 = 0
            r6 = 0
            r8 = 0
        L32:
            if (r8 == r3) goto L87
            java.util.Vector r9 = r15.P
            int r10 = r8 + 1
            java.lang.Object r9 = r9.elementAt(r10)
            g r9 = (defpackage.g) r9
            t r9 = r9.h()     // Catch: java.io.IOException -> L81
            byte[] r9 = r9.o(r1)     // Catch: java.io.IOException -> L81
            int r11 = r7.length
            int r12 = r9.length
            int r11 = java.lang.Math.min(r11, r12)
            r12 = 0
        L4d:
            if (r12 == r11) goto L5f
            r13 = r7[r12]
            r14 = r9[r12]
            if (r13 == r14) goto L5c
            r11 = r13 & 255(0xff, float:3.57E-43)
            r12 = r14 & 255(0xff, float:3.57E-43)
            if (r11 >= r12) goto L64
            goto L62
        L5c:
            int r12 = r12 + 1
            goto L4d
        L5f:
            int r12 = r7.length
            if (r11 != r12) goto L64
        L62:
            r11 = 1
            goto L65
        L64:
            r11 = 0
        L65:
            if (r11 == 0) goto L69
            r7 = r9
            goto L7f
        L69:
            java.util.Vector r4 = r15.P
            java.lang.Object r4 = r4.elementAt(r8)
            java.util.Vector r6 = r15.P
            java.lang.Object r9 = r6.elementAt(r10)
            r6.setElementAt(r9, r8)
            java.util.Vector r6 = r15.P
            r6.setElementAt(r4, r10)
            r4 = r8
            r6 = 1
        L7f:
            r8 = r10
            goto L32
        L81:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>(r0)
            throw r1
        L87:
            r3 = r4
            r4 = r6
            goto L1b
        L8a:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>(r0)
            throw r1
        L90:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w.x():void");
    }
}