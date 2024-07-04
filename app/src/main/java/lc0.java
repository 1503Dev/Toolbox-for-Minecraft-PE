package defpackage;

import androidx.work.ListenableWorker;
import androidx.work.OverwritingInputMerger;
import defpackage.k71;

/* renamed from: lc0  reason: default package */
public final class lc0 extends k71 {

    /* renamed from: lc0$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static final class a extends k71.a<a, lc0> {
        public a(Class<? extends ListenableWorker> cls) {
            super(cls);
            this.b.d = OverwritingInputMerger.class.getName();
        }
    }

    public lc0(a aVar) {
        super(aVar.a, aVar.b, aVar.c);
    }
}