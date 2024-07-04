package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import androidx.appcompat.view.menu.k;

public abstract class a implements k {
    public Context P;
    public Context Q;
    public f R;
    public LayoutInflater S;
    public k.a T;
    public int U;
    public int V;
    public l W;

    public a(Context context, int i, int i2) {
        this.P = context;
        this.S = LayoutInflater.from(context);
        this.U = i;
        this.V = i2;
    }

    @Override // androidx.appcompat.view.menu.k
    public final boolean d(h hVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.k
    public final void j(k.a aVar) {
        this.T = aVar;
    }

    @Override // androidx.appcompat.view.menu.k
    public final boolean k(h hVar) {
        return false;
    }
}