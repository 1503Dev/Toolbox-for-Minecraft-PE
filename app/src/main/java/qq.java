package defpackage;

import androidx.databinding.ViewDataBinding;
import com.warkiz.widget.IndicatorSeekBar;
import defpackage.it0;
import defpackage.lj;
import io.mrarm.mctoolbox.ui.c;

/* renamed from: qq  reason: default package */
public final /* synthetic */ class qq implements c.C0038c.a.InterfaceC0039a, lj.b {
    public static int c(int i, int i2, int i3, int i4) {
        return ((i * i2) / i3) + i4;
    }

    public static String d(StringBuilder sb, String str, String str2) {
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    @Override // io.mrarm.mctoolbox.ui.c.C0038c.a.InterfaceC0039a
    public tv0 a(String str) {
        return new e30(Long.parseLong(str));
    }

    @Override // defpackage.lj.b
    public void b(kj kjVar, ViewDataBinding viewDataBinding, Object obj) {
        boolean z;
        IndicatorSeekBar indicatorSeekBar;
        float f;
        z10 z10Var = (z10) viewDataBinding;
        final it0 it0Var = (it0) obj;
        lj ljVar = it0.r;
        z10Var.e0.setOnSeekChangeListener(null);
        z10Var.e0.setMin(it0Var.n);
        z10Var.e0.setMax(it0Var.o);
        if (it0Var.l == 0) {
            z10Var.e0.setFloatProgress(false);
            z10Var.e0.setTickCount(it0Var.m.length);
            z10Var.e0.setIndicatorTextCallback(new ix() { // from class: ht0
                @Override // defpackage.ix
                public final String a(float f2) {
                    return String.valueOf(it0.this.m[Math.round(f2)]);
                }
            });
            indicatorSeekBar = z10Var.e0;
            f = it0Var.k.Q;
        } else {
            IndicatorSeekBar indicatorSeekBar2 = z10Var.e0;
            if (it0Var.p > 0) {
                z = true;
            } else {
                z = false;
            }
            indicatorSeekBar2.setFloatProgress(z);
            z10Var.e0.setDecimalScale(it0Var.p);
            z10Var.e0.setTickCount(0);
            z10Var.e0.setIndicatorTextCallback(null);
            indicatorSeekBar = z10Var.e0;
            f = it0Var.q.Q;
        }
        indicatorSeekBar.setProgress(f);
        z10Var.e0.setOnSeekChangeListener(new it0.a());
    }
}