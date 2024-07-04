package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.b;

/* renamed from: b40  reason: default package */
public final class b40 extends kt0 {
    public final /* synthetic */ int u0;
    public final /* synthetic */ b v0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b40(b bVar, int i, int i2) {
        super(i);
        this.v0 = bVar;
        this.u0 = i2;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void J0(RecyclerView.a0 a0Var, int[] iArr) {
        if (this.u0 == 0) {
            iArr[0] = this.v0.P0.getWidth();
            iArr[1] = this.v0.P0.getWidth();
            return;
        }
        iArr[0] = this.v0.P0.getHeight();
        iArr[1] = this.v0.P0.getHeight();
    }
}