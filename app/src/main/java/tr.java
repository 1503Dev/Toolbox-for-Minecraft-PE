package defpackage;

import androidx.fragment.app.l;
import java.util.ArrayList;

/* renamed from: tr  reason: default package */
public final class tr implements Runnable {
    public final /* synthetic */ ArrayList P;

    public tr(ArrayList arrayList) {
        this.P = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        l.i(this.P, 4);
    }
}