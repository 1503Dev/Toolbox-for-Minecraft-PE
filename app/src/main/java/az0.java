package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.ad0;
import defpackage.xs0;
import io.mrarm.mctoolbox.bridge.a;
import io.mrarm.mctoolbox.bridge.b;

/* renamed from: az0  reason: default package */
public final class az0 extends t90 {
    public static final /* synthetic */ int g = 0;
    public final io.mrarm.mctoolbox.bridge.a c;
    private final a.InterfaceC0035a d;
    public final TextView e;
    public int f;

    /* renamed from: az0$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class a extends LinearLayoutManager {
        public a() {
            super(1);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o
        public final void U(View view, int i, int i2, int i3, int i4) {
            int i5;
            int i6;
            RecyclerView recyclerView = (RecyclerView) view.getParent();
            if (recyclerView.getAdapter() != null && recyclerView.getChildAdapterPosition(view) == recyclerView.getAdapter().d() - 1) {
                int max = Math.max(i2, (this.e0 - getPaddingBottom()) - (i4 - i2));
                i6 = i4 + (max - i2);
                i5 = max;
            } else {
                i5 = i2;
                i6 = i4;
            }
            super.U(view, i, i5, i3, i6);
        }
    }

    public az0(final Context context, g21 g21Var, final b bVar, final tv tvVar, final ve0 ve0Var) {
        super(0);
        a.InterfaceC0035a interfaceC0035a = new a.InterfaceC0035a() { // from class: ty0
            @Override // io.mrarm.mctoolbox.bridge.a.InterfaceC0035a
            public final void a() {
                az0.this.a();
            }
        };
        this.d = interfaceC0035a;
        this.f = -1;
        this.c = bVar;
        setFocusable(true);
        View inflate = LayoutInflater.from(context).inflate(2131493006, (ViewGroup) null);
        setContentView(inflate);
        inflate.setOnClickListener(new nu(2, this));
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(2131296343);
        RecyclerView recyclerView2 = (RecyclerView) inflate.findViewById(2131296515);
        final za0 za0Var = new za0();
        za0Var.H(g21Var.b.get(0));
        recyclerView.setLayoutManager(new a());
        kc kcVar = new kc(g21Var, za0Var);
        kcVar.g = new uy0(context, g21Var, za0Var);
        recyclerView.setAdapter(kcVar);
        recyclerView2.setLayoutManager(new LinearLayoutManager(1));
        final ad0 ad0Var = new ad0();
        final ad0.c cVar = new ad0.c(recyclerView2);
        za0Var.a(new xs0(new xs0.a() { // from class: vy0
            @Override // defpackage.xs0.a
            public final void a() {
                ad0 ad0Var2 = ad0.this;
                za0 za0Var2 = za0Var;
                ad0.c cVar2 = cVar;
                ad0Var2.n((vv) za0Var2.Q);
                vv vvVar = (vv) za0Var2.Q;
                vv vvVar2 = cVar2.b;
                if (vvVar2 != null) {
                    vvVar2.a(cVar2);
                }
                cVar2.b = vvVar;
                if (vvVar != null) {
                    vvVar.b(cVar2);
                }
            }
        }));
        ad0Var.n((vv) za0Var.Q);
        vv vvVar = (vv) za0Var.Q;
        vv vvVar2 = cVar.b;
        if (vvVar2 != null) {
            vvVar2.a(cVar);
        }
        cVar.b = vvVar;
        if (vvVar != null) {
            vvVar.b(cVar);
        }
        recyclerView2.addItemDecoration(new ad0.b(context));
        recyclerView2.setAdapter(ad0Var);
        TextView textView = (TextView) inflate.findViewById(2131296541);
        this.e = textView;
        textView.setOnClickListener(new View.OnClickListener() { // from class: wy0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                new n21(view.getContext(), bVar, tvVar, ve0Var, true).show();
            }
        });
        bVar.P("internal/premium/remaining_time", interfaceC0035a);
        a();
        inflate.findViewById(2131296579).setOnClickListener(new View.OnClickListener() { // from class: xy0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                new hr0(context, tvVar, ve0Var).show();
            }
        });
        inflate.findViewById(2131296393).setOnClickListener(new n80(1, context));
        inflate.findViewById(2131296428).setOnClickListener(new View.OnClickListener() { // from class: yy0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                String str;
                za0 za0Var2 = za0.this;
                Context context2 = context;
                vv vvVar3 = (vv) za0Var2.Q;
                if (vvVar3 != null) {
                    str = vvVar3.c();
                } else {
                    str = null;
                }
                new ou(context2, str).show();
            }
        });
        setSoftInputMode(16);
    }

    public final void a() {
        String str;
        float n = ((b) this.c).n("internal/premium/remaining_time");
        int round = n > 0.0f ? Math.round(n / 5.0f) * 5 : 0;
        if (round == this.f) {
            return;
        }
        if (round == 0) {
            h21.a(new nx(1, this));
            return;
        }
        StringBuilder sb = new StringBuilder();
        if (round >= 60) {
            str = this.e.getResources().getString(2131755297, Integer.valueOf(round / 60)) + " ";
        } else {
            str = "";
        }
        sb.append(str);
        int i = round % 60;
        sb.append(i != 0 ? this.e.getResources().getString(2131755298, Integer.valueOf(i)) : "");
        final String sb2 = sb.toString();
        h21.a(new Runnable() { // from class: zy0
            @Override // java.lang.Runnable
            public final void run() {
                az0 az0Var = az0.this;
                String str2 = sb2;
                az0Var.e.setVisibility(0);
                TextView textView = az0Var.e;
                textView.setText(textView.getResources().getString(2131755202, str2));
            }
        });
    }
}