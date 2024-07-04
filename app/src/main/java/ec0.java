package defpackage;

import android.view.View;

/* renamed from: ec0  reason: default package */
public final class ec0 implements View.OnLongClickListener {
    public final a P;

    /* renamed from: ec0$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public interface a {
        boolean c(View view);
    }

    public ec0(a aVar, int i) {
        this.P = aVar;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        return this.P.c(view);
    }
}