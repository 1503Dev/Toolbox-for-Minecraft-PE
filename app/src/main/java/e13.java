package defpackage;

import android.net.Uri;
import java.util.List;
import java.util.Map;

/* renamed from: e13  reason: default package */
public final class e13 implements wy4 {
    public final /* synthetic */ List P;
    public final /* synthetic */ String Q;
    public final /* synthetic */ Uri R;
    public final /* synthetic */ g13 S;

    public e13(g13 g13Var, List list, String str, Uri uri) {
        this.S = g13Var;
        this.P = list;
        this.Q = str;
        this.R = uri;
    }

    @Override // defpackage.wy4
    public final /* bridge */ /* synthetic */ void f(Object obj) {
        this.S.d((Map) obj, this.P, this.Q);
    }

    @Override // defpackage.wy4
    public final void h(Throwable th) {
        sv2.g("Failed to parse gmsg params for: ".concat(String.valueOf(this.R)));
    }
}