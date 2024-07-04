package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import androidx.databinding.ViewDataBinding;
import defpackage.ne;
import defpackage.xb0;

/* renamed from: p10  reason: default package */
public final class p10 extends o10 implements xb0.a {
    public final Button f0;
    public final ImageButton g0;
    public final xb0 h0;
    public a i0;
    public long j0;

    /* renamed from: p10$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class a implements View.OnClickListener {
        public ne.a P;

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            ne.a aVar = this.P;
            aVar.getClass();
            Context context = view.getContext();
            ne neVar = ne.this;
            new ie(context, neVar.a, neVar.b, null).show();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p10(View view, hj hjVar) {
        super(view, hjVar);
        Object[] L = ViewDataBinding.L(view, 3, null);
        this.j0 = -1L;
        ((LinearLayout) L[0]).setTag(null);
        Button button = (Button) L[1];
        this.f0 = button;
        button.setTag(null);
        ImageButton imageButton = (ImageButton) L[2];
        this.g0 = imageButton;
        imageButton.setTag(null);
        view.setTag(bi0.dataBinding, this);
        this.h0 = new xb0(this, 1);
        synchronized (this) {
            this.j0 = 4L;
        }
        O();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void I() {
        long j;
        ya0 ya0Var;
        synchronized (this) {
            j = this.j0;
            this.j0 = 0L;
        }
        ne.a aVar = this.e0;
        long j2 = 7 & j;
        boolean z = false;
        a aVar2 = null;
        if (j2 != 0) {
            if (aVar != null) {
                ya0Var = aVar.a;
            } else {
                ya0Var = null;
            }
            Q(0, ya0Var);
            if (ya0Var != null) {
                z = ya0Var.Q;
            }
            if ((j & 6) != 0 && aVar != null) {
                aVar2 = this.i0;
                if (aVar2 == null) {
                    aVar2 = new a();
                    this.i0 = aVar2;
                }
                aVar2.P = aVar;
            }
        }
        if ((6 & j) != 0) {
            this.f0.setOnClickListener(aVar2);
        }
        if (j2 != 0) {
            this.g0.setSelected(z);
        }
        if ((j & 4) != 0) {
            this.g0.setOnClickListener(this.h0);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean J() {
        synchronized (this) {
            return this.j0 != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean M(int i, int i2, Object obj) {
        if (i != 0) {
            return false;
        }
        ya0 ya0Var = (ya0) obj;
        if (i2 == 0) {
            synchronized (this) {
                this.j0 |= 1;
            }
            return true;
        }
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean P(int i, Object obj) {
        if (19 == i) {
            this.e0 = (ne.a) obj;
            synchronized (this) {
                this.j0 |= 2;
            }
            G(19);
            O();
            return true;
        }
        return false;
    }

    @Override // defpackage.xb0.a
    public final void d(View view, int i) {
        ne.a aVar = this.e0;
        if (aVar != null) {
            ya0 ya0Var = aVar.a;
            if (view != null) {
                view.isSelected();
                ya0Var.H(!view.isSelected());
            }
        }
    }
}