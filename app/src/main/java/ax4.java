package defpackage;

import java.util.Iterator;
import javax.annotation.CheckForNull;

/* renamed from: ax4  reason: default package */
public final class ax4 extends sv4 {
    public final transient Object S;

    public ax4(Object obj) {
        this.S = obj;
    }

    @Override // defpackage.iv4, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(@CheckForNull Object obj) {
        return this.S.equals(obj);
    }

    @Override // defpackage.iv4
    public final int g(int i, Object[] objArr) {
        objArr[i] = this.S;
        return i + 1;
    }

    @Override // defpackage.sv4, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.S.hashCode();
    }

    @Override // defpackage.sv4, defpackage.iv4, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return new uv4(this.S);
    }

    @Override // defpackage.sv4, defpackage.iv4
    public final nv4 n() {
        return nv4.v(this.S);
    }

    @Override // defpackage.iv4
    public final cx4 o() {
        return new uv4(this.S);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return ij.c("[", this.S.toString(), "]");
    }
}