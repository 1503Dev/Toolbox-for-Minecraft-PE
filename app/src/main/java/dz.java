package defpackage;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import androidx.core.widget.NestedScrollView;
import defpackage.cw;
import defpackage.dz;
import defpackage.iy0;
import defpackage.uo;
import defpackage.xs0;
import defpackage.zv;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: dz  reason: default package */
public final class dz {
    public static final Pattern f = Pattern.compile("^([0-9]+)(:([0-9]*))?$");
    public final za0<String> a;
    public final zv b;
    public final zv.b[] c;
    public final View d;
    public final bb0 e;

    /* renamed from: dz$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public interface a {
        void a(int i);
    }

    /* renamed from: dz$b */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public interface b {
    }

    /* renamed from: dz$c */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public interface c {
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public dz(final Activity activity, final jl jlVar, final zv zvVar, zv.b[] bVarArr, final b bVar, c cVar) {
        za0<String> za0Var = new za0<>();
        this.a = za0Var;
        bb0 bb0Var = new bb0(-1);
        this.e = bb0Var;
        this.b = zvVar;
        this.c = bVarArr;
        h60 h60Var = new h60(activity);
        jlVar.f0.setBitmap(h60Var.a("textures/", "ui/icon_recipe_construction"));
        jlVar.g0.setBitmap(h60Var.a("textures/", "ui/icon_recipe_equipment"));
        jlVar.h0.setBitmap(h60Var.a("textures/", "ui/icon_recipe_item"));
        jlVar.i0.setBitmap(h60Var.a("textures/", "ui/icon_recipe_nature"));
        jlVar.Y(new a() { // from class: oy
            @Override // defpackage.dz.a
            public final void a(int i) {
                bb0 bb0Var2 = dz.this.e;
                if (i == bb0Var2.Q) {
                    i = -1;
                }
                bb0Var2.I(i);
            }
        });
        ox oxVar = new ox(activity);
        this.d = oxVar;
        oxVar.a(zvVar, bVarArr);
        oxVar.setBackgroundColor(activity.getResources().getColor(2131099680));
        jlVar.o0.addView(oxVar);
        NestedScrollView nestedScrollView = new NestedScrollView(activity, null);
        final int dimensionPixelSize = activity.getResources().getDimensionPixelSize(2131165344);
        final bz bzVar = new bz(this, activity, dimensionPixelSize);
        bzVar.setOnTouchListener(new cz(oxVar, new sy(zvVar, bzVar, jlVar, cVar, activity), activity, jlVar));
        bzVar.setClickable(true);
        oxVar.setTotalHeightListener(new ia0(1, bzVar));
        oxVar.setOffsetY(-dimensionPixelSize);
        nestedScrollView.addView(bzVar);
        nestedScrollView.setOnScrollChangeListener(new NestedScrollView.b() { // from class: ty
            /* JADX WARN: Type inference failed for: r2v2, types: [cw, android.view.View] */
            @Override // androidx.core.widget.NestedScrollView.b
            public final void a(NestedScrollView nestedScrollView2, int i) {
                dz.this.d.setOffsetY(i - dimensionPixelSize);
            }
        });
        jlVar.o0.addView(nestedScrollView);
        za0Var.a(new xs0(new le(1, this)));
        bb0Var.a(new xs0(new xs0.a() { // from class: uy
            @Override // defpackage.xs0.a
            public final void a() {
                dz.a(dz.this);
            }
        }));
        jlVar.a0(za0Var);
        jlVar.Z(bb0Var);
        jlVar.S(new Runnable() { // from class: vy
            @Override // java.lang.Runnable
            public final void run() {
                jl jlVar2 = jl.this;
                zv zvVar2 = zvVar;
                final dz.b bVar2 = bVar;
                final zv.b bVar3 = jlVar2.t0;
                final int i = 1;
                try {
                    i = Integer.parseInt(jlVar2.k0.getText().toString());
                } catch (Exception unused) {
                }
                ((iy0) zvVar2).I0(new Runnable() { // from class: zy
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i2 = i;
                        final zv.b bVar4 = bVar3;
                        dz.b bVar5 = bVar2;
                        if (i2 > bVar4.i()) {
                            i2 = bVar4.i();
                        }
                        bVar4.e(i2);
                        final zv zvVar3 = (zv) ((yd) bVar5).a;
                        ((iy0) zvVar3).I0(new Runnable() { // from class: gz
                            @Override // java.lang.Runnable
                            public final void run() {
                                iy0.Q(((iy0) zv.this).M().a, ((iy0.c) bVar4).a);
                            }
                        });
                    }
                });
                jlVar2.R(null);
            }
        });
        jlVar.W(new Runnable() { // from class: wy
            @Override // java.lang.Runnable
            public final void run() {
                final zv zvVar2 = zv.this;
                final jl jlVar2 = jlVar;
                final View view = bzVar;
                final Context context = activity;
                ((iy0) zvVar2).I0(new Runnable() { // from class: yy
                    @Override // java.lang.Runnable
                    public final void run() {
                        final zv zvVar3 = zv.this;
                        final jl jlVar3 = jlVar2;
                        View view2 = view;
                        final Context context2 = context;
                        final uo.a aVar = new uo.a(zvVar3, jlVar3.t0);
                        view2.post(new Runnable() { // from class: ry
                            @Override // java.lang.Runnable
                            public final void run() {
                                new uo(context2, zvVar3, aVar, new re0(jlVar3)).show();
                            }
                        });
                    }
                });
            }
        });
        jlVar.U(new m30(1, jlVar));
        jlVar.j0.setOnTouchListener(new View.OnTouchListener() { // from class: xy
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                jl jlVar2 = jl.this;
                if (motionEvent.getAction() == 0) {
                    jlVar2.R(null);
                    return false;
                }
                return false;
            }
        });
        if (oxVar.P == null) {
            ny nyVar = new ny(null, oxVar.getWidth(), oxVar.getHeight(), oxVar.getContext().getResources().getDimension(2131165345), oxVar.Q, oxVar.R, oxVar.S);
            oxVar.P = nyVar;
            int i = oxVar.T;
            if (i != 0) {
                nyVar.v(i);
            }
            cw.a aVar = oxVar.U;
            if (aVar != null) {
                ((ia0) aVar).a();
                return;
            }
            return;
        }
        throw new IllegalStateException();
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [cw, android.view.View] */
    /* JADX WARN: Type inference failed for: r0v6, types: [cw, android.view.View] */
    public static void a(dz dzVar) {
        String str;
        String str2;
        zv.b[] bVarArr;
        int i;
        boolean p0;
        String str3 = dzVar.a.Q;
        int i2 = dzVar.e.Q;
        if ((str3 == null || str3.isEmpty()) && i2 == -1) {
            dzVar.d.a(dzVar.b, dzVar.c);
            return;
        }
        if (str3 != null) {
            str = str3.toLowerCase();
        } else {
            str = null;
        }
        ArrayList arrayList = new ArrayList();
        Pattern pattern = f;
        if (str != null) {
            str2 = str;
        } else {
            str2 = "";
        }
        Matcher matcher = pattern.matcher(str2);
        if (matcher.matches()) {
            int parseInt = Integer.parseInt(matcher.group(1));
            String group = matcher.group(3);
            if (group != null && !group.isEmpty()) {
                i = Integer.parseInt(group);
            } else {
                i = 0;
            }
            iy0.d P = ((iy0) dzVar.b).P(parseInt, 1, i);
            if (P != null) {
                p0 = iy0.p0(P.a);
                if (!p0) {
                    arrayList.add(P);
                }
            }
        }
        for (zv.b bVar : dzVar.c) {
            if ((i2 == -1 || bVar.a() == i2) && (str == null || bVar.g().toLowerCase().contains(str))) {
                arrayList.add(bVar);
            }
        }
        dzVar.d.a(dzVar.b, (zv.b[]) arrayList.toArray(new zv.b[0]));
    }
}