package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import defpackage.nr0;
import java.util.ArrayList;
import java.util.List;

/* renamed from: mr0  reason: default package */
public final class mr0 extends nr0.f {
    public final /* synthetic */ List b;
    public final /* synthetic */ Matrix c;

    public mr0(ArrayList arrayList, Matrix matrix) {
        this.b = arrayList;
        this.c = matrix;
    }

    @Override // defpackage.nr0.f
    public final void a(Matrix matrix, ir0 ir0Var, int i, Canvas canvas) {
        for (nr0.f fVar : this.b) {
            fVar.a(this.c, ir0Var, i, canvas);
        }
    }
}