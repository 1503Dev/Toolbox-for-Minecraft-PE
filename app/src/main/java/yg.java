package defpackage;

import androidx.databinding.ViewDataBinding;
import com.warkiz.widget.IndicatorSeekBar;
import defpackage.ko;
import defpackage.lj;
import defpackage.wv0;
import defpackage.xs0;
import java.util.ArrayList;

/* renamed from: yg  reason: default package */
public final /* synthetic */ class yg implements lj.b, u7, wv0.b {
    public static long a(long j, long j2, long j3, long j4) {
        return (j * j2) + j3 + j4;
    }

    public static StringBuilder c(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        return sb;
    }

    public static void d(o oVar, String str, String str2, String str3, String str4) {
        oVar.w(str);
        oVar.w(str2);
        oVar.w(str3);
        oVar.w(str4);
    }

    @Override // defpackage.lj.b
    public void b(kj kjVar, ViewDataBinding viewDataBinding, Object obj) {
        final cl clVar = (cl) viewDataBinding;
        final ko.b bVar = (ko.b) obj;
        clVar.e0.setOnSeekChangeListener(null);
        clVar.e0.setIndicatorTextCallback(new ho());
        final ko.a aVar = new ko.a(bVar);
        final xs0 xs0Var = new xs0(new xs0.a() { // from class: io
            @Override // defpackage.xs0.a
            public final void a() {
                int i;
                cl clVar2 = cl.this;
                ko.b bVar2 = bVar;
                gc0 gc0Var = aVar;
                clVar2.e0.setOnSeekChangeListener(null);
                IndicatorSeekBar indicatorSeekBar = clVar2.e0;
                int i2 = bVar2.b.Q;
                int i3 = 1;
                while (true) {
                    int[] iArr = ko.g;
                    if (i3 < 9) {
                        if (iArr[i3] > i2) {
                            i = i3 - 1;
                            break;
                        }
                        i3++;
                    } else {
                        i = 8;
                        break;
                    }
                }
                indicatorSeekBar.setProgress(i);
                clVar2.e0.setOnSeekChangeListener(gc0Var);
            }
        });
        bVar.b.a(xs0Var);
        xs0Var.g(0, null);
        Runnable runnable = new Runnable() { // from class: jo
            @Override // java.lang.Runnable
            public final void run() {
                ko.b bVar2 = ko.b.this;
                bVar2.b.z(xs0Var);
            }
        };
        if (kjVar.k0 == null) {
            kjVar.k0 = new ArrayList();
        }
        kjVar.k0.add(runnable);
    }

    @Override // defpackage.wv0.b
    public tv0 get() {
        return new am();
    }
}