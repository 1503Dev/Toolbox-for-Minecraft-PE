package defpackage;

import android.content.SharedPreferences;
import defpackage.iy0;
import defpackage.xs0;
import io.mrarm.mctoolbox.bridge.a;
import io.mrarm.mctoolbox.bridge.b;
import io.mrarm.mctoolbox.ui.d;

/* renamed from: m80  reason: default package */
public final /* synthetic */ class m80 implements xs0.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ m80(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.xs0.a
    public final void a() {
        switch (this.a) {
            case 0:
                d dVar = (d) this.b;
                ((b) ((a) this.c)).T(dVar.r.Q, "nbt_editor/mode");
                int i = dVar.r.Q;
                if (i == 0) {
                    dVar.h();
                    return;
                } else if (i == 1) {
                    iy0.e eVar = ((iy0) dVar.o).a;
                    je jeVar = new je(1, dVar);
                    eVar.getClass();
                    iy0.x0(jeVar);
                    return;
                } else {
                    return;
                }
            default:
                int i2 = hr0.U;
                ((SharedPreferences) this.b).edit().putBoolean("log_overlay_enabled", ((ya0) this.c).Q).apply();
                return;
        }
    }
}