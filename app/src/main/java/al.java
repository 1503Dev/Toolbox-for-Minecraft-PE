package defpackage;

import android.view.View;
import android.widget.ImageButton;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: al  reason: default package */
public abstract class al extends ViewDataBinding {
    public final ImageButton e0;
    public final RecyclerView f0;
    public View.OnClickListener g0;
    public View.OnClickListener h0;

    public al(Object obj, View view, ImageButton imageButton, RecyclerView recyclerView) {
        super(0, view, obj);
        this.e0 = imageButton;
        this.f0 = recyclerView;
    }

    public abstract void R(View.OnClickListener onClickListener);

    public abstract void S(View.OnClickListener onClickListener);
}