package defpackage;

import android.view.View;

/* renamed from: xb0  reason: default package */
public final class xb0 implements View.OnClickListener {
    public final a P;
    public final int Q;

    /* renamed from: xb0$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public interface a {
        void d(View view, int i);
    }

    public xb0(a aVar, int i) {
        this.P = aVar;
        this.Q = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.P.d(view, this.Q);
    }
}