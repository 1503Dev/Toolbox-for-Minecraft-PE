package defpackage;

import android.content.Context;
import android.view.LayoutInflater;

/* renamed from: dl0  reason: default package */
public abstract class dl0 extends ah {
    public int X;
    public int Y;
    public LayoutInflater Z;

    @Deprecated
    public dl0(Context context, int i) {
        super(context);
        this.Y = i;
        this.X = i;
        this.Z = (LayoutInflater) context.getSystemService("layout_inflater");
    }
}