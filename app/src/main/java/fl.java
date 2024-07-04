package defpackage;

import android.graphics.Bitmap;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.textfield.TextInputEditText;
import defpackage.uo;
import io.mrarm.mctoolbox.ui.view.StaticLabelTextInputLayout;

/* renamed from: fl  reason: default package */
public final class fl extends el {
    public static final SparseIntArray j0;
    public a h0;
    public long i0;

    /* renamed from: fl$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class a implements jy {
        public a() {
        }

        @Override // defpackage.jy
        public final void a() {
            String a = qw0.a(fl.this.f0);
            uo.a aVar = fl.this.g0;
            if (aVar != null) {
                za0<String> za0Var = aVar.f;
                if (za0Var != null) {
                    za0Var.H(a);
                }
            }
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        j0 = sparseIntArray;
        sparseIntArray.put(2131296501, 3);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public fl(View view, hj hjVar) {
        super(hjVar, view, (ImageView) r0[1], (TextInputEditText) r0[2]);
        Object[] L = ViewDataBinding.L(view, 4, j0);
        StaticLabelTextInputLayout staticLabelTextInputLayout = (StaticLabelTextInputLayout) L[3];
        this.h0 = new a();
        this.i0 = -1L;
        this.e0.setTag(null);
        ((LinearLayout) L[0]).setTag(null);
        this.f0.setTag(null);
        view.setTag(bi0.dataBinding, this);
        synchronized (this) {
            this.i0 = 4L;
        }
        O();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void I() {
        long j;
        String str;
        String str2;
        Bitmap bitmap;
        za0<String> za0Var;
        synchronized (this) {
            j = this.i0;
            this.i0 = 0L;
        }
        uo.a aVar = this.g0;
        long j2 = 7 & j;
        Bitmap bitmap2 = null;
        String str3 = null;
        if (j2 != 0) {
            if ((j & 6) != 0 && aVar != null) {
                bitmap = aVar.g;
                str2 = aVar.e;
            } else {
                bitmap = null;
                str2 = null;
            }
            if (aVar != null) {
                za0Var = aVar.f;
            } else {
                za0Var = null;
            }
            Q(0, za0Var);
            if (za0Var != null) {
                str3 = za0Var.Q;
            }
            str = str3;
            bitmap2 = bitmap;
        } else {
            str = null;
            str2 = null;
        }
        if ((6 & j) != 0) {
            this.e0.setImageBitmap(bitmap2);
            this.f0.setHint(str2);
        }
        if (j2 != 0) {
            qw0.c(this.f0, str);
        }
        if ((j & 4) != 0) {
            qw0.d(this.f0, this.h0);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean J() {
        synchronized (this) {
            return this.i0 != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean M(int i, int i2, Object obj) {
        if (i != 0) {
            return false;
        }
        za0 za0Var = (za0) obj;
        if (i2 == 0) {
            synchronized (this) {
                this.i0 |= 1;
            }
            return true;
        }
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean P(int i, Object obj) {
        if (35 == i) {
            this.g0 = (uo.a) obj;
            synchronized (this) {
                this.i0 |= 2;
            }
            G(35);
            O();
            return true;
        }
        return false;
    }
}