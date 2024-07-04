package defpackage;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import defpackage.ec0;
import io.mrarm.mctoolbox.ui.b;
import io.mrarm.mctoolbox.ui.c;
import io.mrarm.mctoolbox.ui.view.PopupCrashWorkaroundLinearLayout;

/* renamed from: b90  reason: default package */
public final class b90 extends a90 implements ec0.a {
    public final PopupCrashWorkaroundLinearLayout f0;
    public final ImageView g0;
    public final TextView h0;
    public final EditText i0;
    public final ec0 j0;
    public a k0;
    public long l0;

    /* renamed from: b90$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class a implements jy {
        public a() {
        }

        @Override // defpackage.jy
        public final void a() {
            boolean z;
            String a = qw0.a(b90.this.i0);
            b.a aVar = b90.this.e0;
            if (aVar != null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                c.d dVar = aVar.a;
                if (dVar instanceof c.C0038c) {
                    ((c.C0038c) dVar).d = a;
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b90(View view, hj hjVar) {
        super(view, hjVar);
        Object[] L = ViewDataBinding.L(view, 4, null);
        this.k0 = new a();
        this.l0 = -1L;
        PopupCrashWorkaroundLinearLayout popupCrashWorkaroundLinearLayout = (PopupCrashWorkaroundLinearLayout) L[0];
        this.f0 = popupCrashWorkaroundLinearLayout;
        popupCrashWorkaroundLinearLayout.setTag(null);
        ImageView imageView = (ImageView) L[1];
        this.g0 = imageView;
        imageView.setTag(null);
        TextView textView = (TextView) L[2];
        this.h0 = textView;
        textView.setTag(null);
        EditText editText = (EditText) L[3];
        this.i0 = editText;
        editText.setTag(null);
        view.setTag(bi0.dataBinding, this);
        this.j0 = new ec0(this, 1);
        synchronized (this) {
            this.l0 = 4L;
        }
        O();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void I() {
        long j;
        String str;
        int i;
        c.d dVar;
        za0<String> za0Var;
        synchronized (this) {
            j = this.l0;
            this.l0 = 0L;
        }
        b.a aVar = this.e0;
        long j2 = 7 & j;
        String str2 = null;
        int i2 = 0;
        if (j2 != 0) {
            if (aVar != null) {
                dVar = aVar.a;
            } else {
                dVar = null;
            }
            if (dVar != null) {
                za0Var = dVar.a;
            } else {
                za0Var = null;
            }
            Q(0, za0Var);
            if (za0Var != null) {
                str = za0Var.Q;
            } else {
                str = null;
            }
            long j3 = j & 6;
            if (j3 != 0 && dVar != null) {
                i = dVar.a();
            } else {
                i = 0;
            }
            if (j3 != 0) {
                if (aVar != null) {
                    i2 = aVar.c;
                    c.d dVar2 = aVar.a;
                    if (dVar2 instanceof c.C0038c) {
                        str2 = ((c.C0038c) dVar2).d;
                    }
                }
                i2 = (int) (this.f0.getResources().getDimension(2131165505) + (this.f0.getResources().getDimension(2131165504) * i2));
            }
        } else {
            str = null;
            i = 0;
        }
        if ((6 & j) != 0) {
            r31.a(this.f0, i2);
            this.g0.setImageResource(i);
            qw0.c(this.i0, str2);
        }
        if ((j & 4) != 0) {
            this.f0.setOnLongClickListener(this.j0);
            qw0.d(this.i0, this.k0);
        }
        if (j2 != 0) {
            qw0.c(this.h0, str);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean J() {
        synchronized (this) {
            return this.l0 != 0;
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
                this.l0 |= 1;
            }
            return true;
        }
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean P(int i, Object obj) {
        if (19 == i) {
            this.e0 = (b.a) obj;
            synchronized (this) {
                this.l0 |= 2;
            }
            G(19);
            O();
            return true;
        }
        return false;
    }

    @Override // defpackage.ec0.a
    public final boolean c(View view) {
        b.a aVar = this.e0;
        if (aVar != null) {
            aVar.a(view);
            return true;
        }
        return false;
    }
}