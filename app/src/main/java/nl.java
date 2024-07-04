package defpackage;

import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import io.mrarm.mctoolbox.ui.view.PopupCrashWorkaroundImageButton;
import io.mrarm.mctoolbox.ui.view.WindowDragHandle;

/* renamed from: nl  reason: default package */
public abstract class nl extends ViewDataBinding {
    public final ImageButton e0;
    public final ImageButton f0;
    public final ImageButton g0;
    public final LinearLayout h0;
    public final WindowDragHandle i0;
    public final RecyclerView j0;
    public final PopupCrashWorkaroundImageButton k0;
    public final ImageButton l0;
    public final WindowDragHandle m0;
    public final ImageButton n0;
    public bb0 o0;
    public boolean p0;

    public nl(Object obj, View view, ImageButton imageButton, ImageButton imageButton2, ImageButton imageButton3, LinearLayout linearLayout, WindowDragHandle windowDragHandle, RecyclerView recyclerView, PopupCrashWorkaroundImageButton popupCrashWorkaroundImageButton, ImageButton imageButton4, WindowDragHandle windowDragHandle2, ImageButton imageButton5) {
        super(1, view, obj);
        this.e0 = imageButton;
        this.f0 = imageButton2;
        this.g0 = imageButton3;
        this.h0 = linearLayout;
        this.i0 = windowDragHandle;
        this.j0 = recyclerView;
        this.k0 = popupCrashWorkaroundImageButton;
        this.l0 = imageButton4;
        this.m0 = windowDragHandle2;
        this.n0 = imageButton5;
    }

    public abstract void R(bb0 bb0Var);

    public abstract void S(boolean z);
}