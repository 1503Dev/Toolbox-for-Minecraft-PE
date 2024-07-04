package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.warkiz.widget.IndicatorSeekBar;
import defpackage.ko;

/* renamed from: dl  reason: default package */
public final class dl extends cl {
    public static final SparseIntArray k0;
    public final TextView g0;
    public final EditText h0;
    public a i0;
    public long j0;

    /* renamed from: dl$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class a implements jy {
        public a() {
        }

        @Override // defpackage.jy
        public final void a() {
            boolean z;
            String a = qw0.a(dl.this.h0);
            ko.b bVar = dl.this.f0;
            boolean z2 = false;
            if (bVar != null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                bb0 bb0Var = bVar.b;
                if (bb0Var != null) {
                    z2 = true;
                }
                if (z2) {
                    int i = bb0Var.Q;
                    try {
                        i = Integer.parseInt(a);
                    } catch (NumberFormatException unused) {
                    }
                    bb0Var.I(i);
                }
            }
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        k0 = sparseIntArray;
        sparseIntArray.put(2131296575, 3);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public dl(View view, hj hjVar) {
        super(hjVar, view, (IndicatorSeekBar) r0[3]);
        Object[] L = ViewDataBinding.L(view, 4, k0);
        this.i0 = new a();
        this.j0 = -1L;
        ((LinearLayout) L[0]).setTag(null);
        TextView textView = (TextView) L[1];
        this.g0 = textView;
        textView.setTag(null);
        EditText editText = (EditText) L[2];
        this.h0 = editText;
        editText.setTag(null);
        view.setTag(bi0.dataBinding, this);
        synchronized (this) {
            this.j0 = 4L;
        }
        O();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void I() {
        long j;
        String str;
        bb0 bb0Var;
        synchronized (this) {
            j = this.j0;
            this.j0 = 0L;
        }
        ko.b bVar = this.f0;
        long j2 = 7 & j;
        String str2 = null;
        if (j2 != 0) {
            if (bVar != null) {
                bb0Var = bVar.b;
            } else {
                bb0Var = null;
            }
            int i = 0;
            Q(0, bb0Var);
            if (bb0Var != null) {
                i = bb0Var.H();
            }
            str = k6.a("", i);
            if ((j & 6) != 0 && bVar != null) {
                str2 = bVar.a;
            }
        } else {
            str = null;
        }
        if ((6 & j) != 0) {
            qw0.c(this.g0, str2);
        }
        if (j2 != 0) {
            qw0.c(this.h0, str);
        }
        if ((j & 4) != 0) {
            qw0.d(this.h0, this.i0);
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
        bb0 bb0Var = (bb0) obj;
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
        if (27 == i) {
            this.f0 = (ko.b) obj;
            synchronized (this) {
                this.j0 |= 2;
            }
            G(27);
            O();
            return true;
        }
        return false;
    }
}