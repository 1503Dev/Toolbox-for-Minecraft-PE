package defpackage;

import java.util.HashMap;

/* renamed from: a63  reason: default package */
public final class a63 implements w53 {
    public final f25 a;

    public a63(nl5 nl5Var) {
        this.a = nl5Var;
    }

    @Override // defpackage.w53
    public final void a(HashMap hashMap) {
        this.a.k(Boolean.parseBoolean((String) hashMap.get("content_vertical_opted_out")));
    }
}