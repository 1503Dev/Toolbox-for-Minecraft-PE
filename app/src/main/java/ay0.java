package defpackage;

import android.view.View;
import androidx.appcompat.widget.e;

/* renamed from: ay0  reason: default package */
public final class ay0 extends vx {
    public boolean h = false;
    public final /* synthetic */ int i;
    public final /* synthetic */ e j;

    public ay0(e eVar, int i) {
        this.j = eVar;
        this.i = i;
    }

    @Override // defpackage.y41
    public final void a() {
        if (this.h) {
            return;
        }
        this.j.a.setVisibility(this.i);
    }

    @Override // defpackage.vx, defpackage.y41
    public final void b(View view) {
        this.h = true;
    }

    @Override // defpackage.vx, defpackage.y41
    public final void c() {
        this.j.a.setVisibility(0);
    }
}