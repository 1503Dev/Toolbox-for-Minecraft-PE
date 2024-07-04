package defpackage;

import java.util.Comparator;

/* renamed from: uv1  reason: default package */
public final class uv1 implements Comparator {
    public final /* synthetic */ int P = 0;

    public uv1() {
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        switch (this.P) {
            case 0:
                return ((byte[]) obj).length - ((byte[]) obj2).length;
            default:
                u32 u32Var = (u32) obj;
                u32 u32Var2 = (u32) obj2;
                int i = u32Var.c - u32Var2.c;
                if (i == 0) {
                    return (u32Var.a > u32Var2.a ? 1 : (u32Var.a == u32Var2.a ? 0 : -1));
                }
                return i;
        }
    }

    public uv1(int i) {
    }
}