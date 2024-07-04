package defpackage;

import java.util.Comparator;
import java.util.regex.Pattern;

/* renamed from: vt5  reason: default package */
public final /* synthetic */ class vt5 implements Comparator {
    public final /* synthetic */ iu5 P;

    public /* synthetic */ vt5(iu5 iu5Var) {
        this.P = iu5Var;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        iu5 iu5Var = this.P;
        Pattern pattern = lu5.a;
        return iu5Var.e(obj2) - iu5Var.e(obj);
    }
}