package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: lj  reason: default package */
public final class lj<T> extends l41<T> {
    public int d = -1;
    public int e = -1;
    public int f = -1;
    public a<T, ?, ?> g;

    /* renamed from: lj$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public interface a<T, CT, VT extends ViewDataBinding> {
    }

    /* renamed from: lj$b */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public interface b<T, VT extends ViewDataBinding> {
        void b(kj<T, ?> kjVar, VT vt, T t);
    }

    @Override // defpackage.l41
    public final j41 a(Context context, RecyclerView recyclerView) {
        return new kj(jj.c(LayoutInflater.from(context), this.d, recyclerView, null), this);
    }
}