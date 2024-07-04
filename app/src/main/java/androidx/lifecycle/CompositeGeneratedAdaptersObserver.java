package androidx.lifecycle;

import androidx.lifecycle.c;
import java.util.HashMap;

/* JADX INFO: Access modifiers changed from: package-private */
public class CompositeGeneratedAdaptersObserver implements d {
    public final b[] a;

    public CompositeGeneratedAdaptersObserver(b[] bVarArr) {
        this.a = bVarArr;
    }

    @Override // androidx.lifecycle.d
    public final void d(b10 b10Var, c.b bVar) {
        new HashMap();
        for (b bVar2 : this.a) {
            bVar2.a();
        }
        for (b bVar3 : this.a) {
            bVar3.a();
        }
    }
}