package defpackage;

import java.util.Objects;

/* renamed from: lv  reason: default package */
public final class lv extends RuntimeException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lv(ol0<?> ol0Var) {
        super("HTTP " + ol0Var.a.R + " " + ol0Var.a.S);
        Objects.requireNonNull(ol0Var, "response == null");
        nl0 nl0Var = ol0Var.a;
        int i = nl0Var.R;
        String str = nl0Var.S;
    }
}