package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.InputFilter;
import android.view.MotionEvent;
import android.view.View;
import defpackage.dz;
import defpackage.iy0;
import defpackage.zv;

/* renamed from: jz  reason: default package */
public class jz implements View.OnTouchListener {
    public final cw P;
    public boolean Q;
    public int R;
    public a S;

    /* renamed from: jz$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public interface a {
    }

    public jz(cw cwVar, sy syVar) {
        this.P = cwVar;
        this.S = syVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003f, code lost:
        if (r9.P.getRenderer().d((int) r11.getX(), (int) r11.getY()) != r9.R) goto L12;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.Q = true;
            this.R = this.P.getRenderer().d((int) motionEvent.getX(), (int) motionEvent.getY());
        } else if (this.Q) {
            if (action != 2) {
                if (action == 1) {
                    int d = this.P.getRenderer().d((int) motionEvent.getX(), (int) motionEvent.getY());
                    if (d == this.R && d < this.P.getItems().length) {
                        a aVar = this.S;
                        final zv.b bVar = this.P.getItems()[d];
                        sy syVar = (sy) aVar;
                        zv zvVar = syVar.a;
                        final View view2 = syVar.b;
                        final jl jlVar = syVar.c;
                        final dz.c cVar = syVar.d;
                        Context context = syVar.e;
                        iy0 iy0Var = (iy0) zvVar;
                        iy0Var.I0(new Runnable() { // from class: az
                            @Override // java.lang.Runnable
                            public final void run() {
                                zv.b bVar2 = zv.b.this;
                                View view3 = view2;
                                final jl jlVar2 = jlVar;
                                final dz.c cVar2 = cVar;
                                final iy0.d j = bVar2.j();
                                final int i = bVar2.i();
                                final String g = bVar2.g();
                                view3.post(new Runnable() { // from class: qy
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        jl jlVar3 = jl.this;
                                        zv.b bVar3 = j;
                                        int i2 = i;
                                        String str = g;
                                        dz.c cVar3 = cVar2;
                                        jlVar3.R(bVar3);
                                        jlVar3.k0.setFilters(new InputFilter[]{new InputFilter.LengthFilter(String.valueOf(i2).length())});
                                        jlVar3.k0.setText(String.valueOf(i2));
                                        jlVar3.V(str);
                                        cVar3.getClass();
                                    }
                                });
                            }
                        });
                        int dimensionPixelSize = context.getResources().getDimensionPixelSize(2131165331);
                        Bitmap createBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                        iy0Var.L0(createBitmap, dimensionPixelSize, dimensionPixelSize, bVar, new py(0, jlVar, createBitmap));
                    }
                    this.Q = false;
                }
            }
        }
        return true;
    }
}