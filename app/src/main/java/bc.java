package defpackage;

import android.graphics.Typeface;

/* renamed from: bc  reason: default package */
public final class bc extends z61 {
    public final Typeface f;
    public final a g;
    public boolean h;

    /* renamed from: bc$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public interface a {
    }

    public bc(md mdVar, Typeface typeface) {
        this.f = typeface;
        this.g = mdVar;
    }

    @Override // defpackage.z61
    public final void S0(int i) {
        Typeface typeface = this.f;
        if (!this.h) {
            nd ndVar = ((md) this.g).a;
            bc bcVar = ndVar.v;
            boolean z = true;
            if (bcVar != null) {
                bcVar.h = true;
            }
            if (ndVar.s != typeface) {
                ndVar.s = typeface;
            } else {
                z = false;
            }
            if (z) {
                ndVar.h();
            }
        }
    }

    @Override // defpackage.z61
    public final void T0(Typeface typeface, boolean z) {
        if (!this.h) {
            nd ndVar = ((md) this.g).a;
            bc bcVar = ndVar.v;
            boolean z2 = true;
            if (bcVar != null) {
                bcVar.h = true;
            }
            if (ndVar.s != typeface) {
                ndVar.s = typeface;
            } else {
                z2 = false;
            }
            if (z2) {
                ndVar.h();
            }
        }
    }
}