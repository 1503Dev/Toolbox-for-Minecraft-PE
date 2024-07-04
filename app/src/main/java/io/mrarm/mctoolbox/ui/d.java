package io.mrarm.mctoolbox.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.menu.h;
import androidx.recyclerview.widget.LinearLayoutManager;
import defpackage.iy0;
import defpackage.sx0;
import io.mrarm.mctoolbox.bridge.a;
import io.mrarm.mctoolbox.bridge.b;
import io.mrarm.mctoolbox.ui.FullscreenTextEditDialog;
import io.mrarm.mctoolbox.ui.c;
import io.mrarm.mctoolbox.ui.d;
import io.mrarm.mctoolbox.ui.f;

public final class d extends sx0 implements y70, f.a {
    public final Activity l;
    public final nl m;
    public final b n;
    public final zv o;
    public xa0 p;
    public ya0 q;
    public final bb0 r;
    public c.d s;
    public boolean t;
    public long u;
    public int v;
    public int w;
    public int x;

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class a implements lw {
        public a() {
        }

        @Override // defpackage.lw
        public final ya0 a() {
            return null;
        }

        @Override // defpackage.lw
        public final int b(Context context) {
            return context.getResources().getColor(2131099863);
        }

        @Override // defpackage.lw
        public final int c(Context context) {
            return 2131230918;
        }

        @Override // defpackage.lw
        public final void d() {
            d.this.q.H(true);
        }

        @Override // defpackage.lw
        public final String e(Context context) {
            return null;
        }

        @Override // defpackage.lw
        public final String getId() {
            return "nbt_editor/open";
        }
    }

    public d(final Activity activity, final io.mrarm.mctoolbox.bridge.b bVar, iy0 iy0Var) {
        super(activity);
        this.p = new xa0(new t20(1, this), new l80(0, this));
        this.t = false;
        this.l = activity;
        this.o = iy0Var;
        nl nlVar = (nl) jj.c(LayoutInflater.from(activity), 2131492925, null, null);
        this.m = nlVar;
        View view = nlVar.T;
        if (this.b == null) {
            this.b = view;
            bb0 bb0Var = new bb0(bVar.p("nbt_editor/mode"));
            this.r = bb0Var;
            bb0Var.a(new xs0(new m80(0, this, bVar)));
            nlVar.R(bb0Var);
            nlVar.n0.setOnClickListener(new n80(0, this));
            nlVar.k0.setOnClickListener(new View.OnClickListener() { // from class: o80
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    final d dVar = d.this;
                    lf0 lf0Var = new lf0(dVar.m.k0.getContext(), dVar.m.k0);
                    ((h) lf0Var.a.add(2131755170)).p = new MenuItem.OnMenuItemClickListener() { // from class: i80
                        @Override // android.view.MenuItem.OnMenuItemClickListener
                        public final boolean onMenuItemClick(MenuItem menuItem) {
                            String str;
                            d dVar2 = d.this;
                            dVar2.getClass();
                            FullscreenTextEditDialog fullscreenTextEditDialog = new FullscreenTextEditDialog(dVar2.m.k0.getContext());
                            c.d dVar3 = dVar2.s;
                            if (dVar3 == null) {
                                str = "";
                            } else {
                                str = dVar3.b().v(512);
                            }
                            if (str == null) {
                                fullscreenTextEditDialog.S.setText("");
                            } else {
                                fullscreenTextEditDialog.S.setText(str);
                            }
                            fullscreenTextEditDialog.R = new rc0(dVar2, fullscreenTextEditDialog);
                            fullscreenTextEditDialog.show();
                            return true;
                        }
                    };
                    ((h) lf0Var.a.add(2131755049)).p = new MenuItem.OnMenuItemClickListener() { // from class: j80
                        @Override // android.view.MenuItem.OnMenuItemClickListener
                        public final boolean onMenuItemClick(MenuItem menuItem) {
                            d dVar2 = d.this;
                            int i = dVar2.r.Q;
                            if (i == 0) {
                                dVar2.h();
                            } else if (i == 1) {
                                iy0.e eVar = ((iy0) dVar2.o).a;
                                je jeVar = new je(1, dVar2);
                                eVar.getClass();
                                iy0.x0(jeVar);
                            }
                            return true;
                        }
                    };
                    lf0Var.a();
                }
            });
            b bVar2 = new b();
            this.n = bVar2;
            nlVar.g0.setOnClickListener(new ee(2, this));
            nlVar.j0.setLayoutManager(new LinearLayoutManager(1));
            nlVar.j0.setAdapter(bVar2);
            nlVar.i0.getDragHelper().d = new sx0.a();
            nlVar.l0.setOnClickListener(new View.OnClickListener() { // from class: p80
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    d dVar = d.this;
                    Activity activity2 = activity;
                    dVar.getClass();
                    f fVar = new f(activity2, dVar);
                    View view3 = dVar.b;
                    int[] iArr = new int[2];
                    view3.getLocationOnScreen(iArr);
                    int[] iArr2 = new int[2];
                    view2.getLocationOnScreen(iArr2);
                    int dimensionPixelSize = fVar.d.getResources().getDimensionPixelSize(2131165510) + iArr[0];
                    int height = view2.getHeight() + iArr2[1];
                    fVar.f.setArrowOffset(((view2.getWidth() / 2) + iArr2[0]) - dimensionPixelSize);
                    Point point = new Point();
                    view3.getDisplay().getSize(point);
                    fVar.setWidth(fVar.d.getResources().getDimensionPixelSize(2131165509));
                    fVar.setHeight(Math.min(point.y - height, fVar.d.getResources().getDimensionPixelSize(2131165508)));
                    fVar.showAtLocation(fVar.d.getWindow().getDecorView(), 51, dimensionPixelSize, height);
                }
            });
            nlVar.m0.getDragHelper().d = new sx0.b();
            z70.e(this);
            bVar.P("nbt_editor/enabled", new a.InterfaceC0035a() { // from class: q80
                @Override // io.mrarm.mctoolbox.bridge.a.InterfaceC0035a
                public final void a() {
                    d dVar = d.this;
                    a aVar = bVar;
                    dVar.getClass();
                    if (((b) aVar).j("nbt_editor/enabled")) {
                        dVar.u = 0L;
                        dVar.r.I(0);
                        dVar.h();
                    }
                }
            });
            e(0, 0);
            return;
        }
        throw new IllegalStateException("Cannot change content View");
    }

    public final void g(final int i, final int i2, final int i3) {
        long n0;
        iy0.b bVar;
        byte[] A0;
        ((iy0) this.o).a.getClass();
        n0 = iy0.n0(i, i2, i3);
        ze zeVar = null;
        if (n0 != 0) {
            bVar = new iy0.b(n0);
        } else {
            bVar = null;
        }
        if (bVar != null) {
            A0 = iy0.A0(bVar.a);
            zeVar = iy0.K0(A0);
        }
        final ze zeVar2 = zeVar;
        h21.a(new Runnable() { // from class: k80
            @Override // java.lang.Runnable
            public final void run() {
                d dVar = d.this;
                int i4 = i;
                int i5 = i2;
                int i6 = i3;
                tv0 tv0Var = zeVar2;
                dVar.t = true;
                dVar.v = i4;
                dVar.w = i5;
                dVar.x = i6;
                if (dVar.r.Q == 1) {
                    dVar.j(tv0Var);
                }
            }
        });
    }

    public final void h() {
        ((iy0) this.o).I0(new g80(0, this));
    }

    public final void i() {
        iy0.e eVar;
        Runnable runnable;
        c.d dVar = this.s;
        if (dVar == null) {
            return;
        }
        final tv0 b = dVar.b();
        if (!(b instanceof ze)) {
            return;
        }
        int i = this.r.Q;
        if (i == 0) {
            ((iy0) this.o).J0(new s30(1, this, b));
            return;
        }
        if (i == 1 && this.t) {
            eVar = ((iy0) this.o).a;
            runnable = new Runnable() { // from class: s80
                /* JADX WARN: Code restructure failed: missing block: B:7:0x0026, code lost:
                    r1 = defpackage.iy0.N0((defpackage.ze) r1);
                 */
                @Override // java.lang.Runnable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void run() {
                    long n0;
                    iy0.b bVar;
                    byte[] N0;
                    d dVar2 = d.this;
                    tv0 tv0Var = b;
                    iy0.e eVar2 = ((iy0) dVar2.o).a;
                    int i2 = dVar2.v;
                    int i3 = dVar2.w;
                    int i4 = dVar2.x;
                    eVar2.getClass();
                    n0 = iy0.n0(i2, i3, i4);
                    if (n0 != 0) {
                        bVar = new iy0.b(n0);
                    } else {
                        bVar = null;
                    }
                    if (bVar != null && N0 != null) {
                        iy0.t0(bVar.a, N0);
                    }
                }
            };
        } else if (i == 1) {
            eVar = ((iy0) this.o).a;
            runnable = new Runnable() { // from class: h80
                /* JADX WARN: Code restructure failed: missing block: B:8:0x0026, code lost:
                    r0 = defpackage.iy0.N0((defpackage.ze) r1);
                 */
                @Override // java.lang.Runnable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void run() {
                    byte[] N0;
                    long m0;
                    d dVar2 = d.this;
                    tv0 tv0Var = b;
                    long j = dVar2.u;
                    iy0.a aVar = null;
                    if (j != 0) {
                        ((iy0) dVar2.o).a.getClass();
                        m0 = iy0.m0(j);
                        if (m0 != 0) {
                            aVar = new iy0.a(m0);
                        }
                    }
                    if (aVar != null && N0 != null) {
                        iy0.s0(aVar.a, N0);
                    }
                }
            };
        } else {
            return;
        }
        eVar.getClass();
        iy0.x0(runnable);
    }

    public final void j(tv0 tv0Var) {
        boolean z;
        c.d dVar;
        nl nlVar = this.m;
        if (tv0Var == null) {
            z = true;
        } else {
            z = false;
        }
        nlVar.S(z);
        if (tv0Var != null) {
            dVar = c.a(null, tv0Var);
        } else {
            dVar = null;
        }
        this.s = dVar;
        b bVar = this.n;
        if (dVar == null) {
            bVar.getClass();
            bVar.m(new oj());
            return;
        }
        bVar.m(bVar.n(0, dVar, null));
        bVar.c.h();
    }
}