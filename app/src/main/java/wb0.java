package defpackage;

import android.widget.CompoundButton;

/* renamed from: wb0  reason: default package */
public final class wb0 implements CompoundButton.OnCheckedChangeListener {
    public final a a;

    /* renamed from: wb0$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public interface a {
        void C(CompoundButton compoundButton, boolean z);
    }

    public wb0(a aVar) {
        this.a = aVar;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        this.a.C(compoundButton, z);
    }
}