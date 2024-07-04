package defpackage;

import android.annotation.SuppressLint;
import android.widget.ImageButton;

@SuppressLint({"AppCompatCustomView"})
/* renamed from: r51  reason: default package */
public class r51 extends ImageButton {
    public int P;

    public final void b(int i, boolean z) {
        super.setVisibility(i);
        if (z) {
            this.P = i;
        }
    }

    public final int getUserSetVisibility() {
        return this.P;
    }

    @Override // android.widget.ImageView, android.view.View
    public void setVisibility(int i) {
        b(i, true);
    }
}