package defpackage;

import java.util.HashMap;

/* renamed from: y53  reason: default package */
public final class y53 implements w53 {
    public final f25 a;

    public y53(nl5 nl5Var) {
        this.a = nl5Var;
    }

    @Override // defpackage.w53
    public final void a(HashMap hashMap) {
        this.a.t(Boolean.parseBoolean((String) hashMap.get("content_url_opted_out")));
    }
}