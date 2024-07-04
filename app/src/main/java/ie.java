package defpackage;

import android.content.Context;
import android.text.Editable;
import android.view.View;
import androidx.databinding.e;
import defpackage.me;
import io.mrarm.mctoolbox.ui.AppBottomSheetDialog;
import java.util.Objects;
import java.util.UUID;

/* renamed from: ie  reason: default package */
public final class ie extends AppBottomSheetDialog {
    public static final int[] V = {-3, -2, 1, 2, 5, 10};
    public yk U;

    /* renamed from: ie$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class a extends e.a {
        public final /* synthetic */ me a;

        public a(me meVar) {
            this.a = meVar;
        }

        @Override // androidx.databinding.e.a
        public final void g(int i, e eVar) {
            String str;
            boolean z;
            me meVar;
            me meVar2;
            if (i == 38 || i == 16) {
                ie ieVar = ie.this;
                String str2 = ieVar.U.m0;
                if ((str2 != null && !str2.isEmpty() && ((meVar2 = this.a) == null || !ie.this.U.m0.equals(meVar2.c.Q))) || ((str = ie.this.U.n0) != null && !str.isEmpty() && ((meVar = this.a) == null || !ie.this.U.n0.equals(meVar.e)))) {
                    z = false;
                } else {
                    z = true;
                }
                ieVar.setCanceledOnTouchOutside(z);
            }
        }
    }

    /* renamed from: ie$b */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public interface b {
        void a(me.b bVar);
    }

    public ie(Context context, zv zvVar, final wv wvVar, final me meVar) {
        super(context);
        float[] k0;
        setContentView(2131492917);
        View findViewById = findViewById(2131296398);
        Objects.requireNonNull(findViewById);
        final yk ykVar = (yk) jj.a(findViewById);
        this.U = ykVar;
        Objects.requireNonNull(ykVar);
        ykVar.Z(new b() { // from class: de
            @Override // defpackage.ie.b
            public final void a(me.b bVar) {
                yk.this.X(bVar);
            }
        });
        this.U.g0.setMax(5);
        this.U.g0.setTickCount(5);
        this.U.g0.setIndicatorTextCallback(new r1());
        this.U.R(new ee(0, this));
        this.U.T(new View.OnClickListener() { // from class: fe
            /* JADX WARN: Removed duplicated region for block: B:40:0x00c7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:42:0x00b2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            @Override // android.view.View.OnClickListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void onClick(View view) {
                boolean z;
                float parseFloat;
                Editable text;
                float parseFloat2;
                Editable text2;
                ie ieVar = ie.this;
                wv wvVar2 = wvVar;
                me meVar2 = meVar;
                String str = ieVar.U.m0;
                if (str != null && !str.isEmpty()) {
                    z = true;
                } else {
                    ieVar.U.f0.setError(ieVar.getContext().getString(2131755098));
                    z = false;
                }
                if (z) {
                    if (meVar2 == null) {
                        xz0 xz0Var = (xz0) wvVar2;
                        xz0Var.getClass();
                        meVar2 = xz0Var.a(UUID.randomUUID());
                    }
                    meVar2.c.H(ieVar.U.m0);
                    meVar2.i = ieVar.U.k0;
                    za0<String> za0Var = meVar2.d;
                    Context context2 = ieVar.getContext();
                    String resourceEntryName = context2.getResources().getResourceEntryName(ieVar.U.l0);
                    if (resourceEntryName.startsWith("ic_")) {
                        resourceEntryName = resourceEntryName.substring(3);
                    }
                    if (resourceEntryName.endsWith("_black_24dp")) {
                        resourceEntryName = resourceEntryName.substring(0, resourceEntryName.length() - 11);
                    }
                    za0Var.H(resourceEntryName);
                    yk ykVar2 = ieVar.U;
                    meVar2.e = ykVar2.n0;
                    meVar2.j = ie.V[ykVar2.g0.getProgress()];
                    Editable text3 = ieVar.U.h0.getText();
                    float f = 0.0f;
                    if (text3 != null) {
                        try {
                            parseFloat = Float.parseFloat(text3.toString());
                        } catch (NumberFormatException unused) {
                        }
                        meVar2.f = parseFloat;
                        text = ieVar.U.i0.getText();
                        if (text != null) {
                            try {
                                parseFloat2 = Float.parseFloat(text.toString());
                            } catch (NumberFormatException unused2) {
                            }
                            meVar2.g = parseFloat2;
                            text2 = ieVar.U.j0.getText();
                            if (text2 != null) {
                                try {
                                    f = Float.parseFloat(text2.toString());
                                } catch (NumberFormatException unused3) {
                                }
                            }
                            meVar2.h = f;
                            meVar2.b();
                        }
                        parseFloat2 = 0.0f;
                        meVar2.g = parseFloat2;
                        text2 = ieVar.U.j0.getText();
                        if (text2 != null) {
                        }
                        meVar2.h = f;
                        meVar2.b();
                    }
                    parseFloat = 0.0f;
                    meVar2.f = parseFloat;
                    text = ieVar.U.i0.getText();
                    if (text != null) {
                    }
                    parseFloat2 = 0.0f;
                    meVar2.g = parseFloat2;
                    text2 = ieVar.U.j0.getText();
                    if (text2 != null) {
                    }
                    meVar2.h = f;
                    meVar2.b();
                } else {
                    String str2 = ieVar.U.n0;
                    if (str2 != null && !str2.isEmpty()) {
                        return;
                    }
                }
                ieVar.dismiss();
            }
        });
        this.U.U(new ge(this, 0));
        yk ykVar2 = this.U;
        if (meVar != null) {
            ykVar2.W(true);
            this.U.X(meVar.i);
            this.U.Y(meVar.c.Q);
            this.U.S(meVar.e);
            this.U.V(n42.g(getContext(), meVar.d.Q));
            this.U.h0.setText(String.valueOf(meVar.f));
            this.U.i0.setText(String.valueOf(meVar.g));
            this.U.j0.setText(String.valueOf(meVar.h));
            int i = 0;
            while (true) {
                int[] iArr = V;
                if (i >= 6) {
                    break;
                }
                if (iArr[i] == meVar.j) {
                    this.U.g0.setProgress(i);
                }
                i++;
            }
        } else {
            ykVar2.X(me.b.Single);
            this.U.V(2131230947);
            this.U.g0.setProgress(3.0f);
        }
        if (meVar == null || meVar.i != me.b.Teleport) {
            iy0 iy0Var = (iy0) zvVar;
            if (iy0Var.M() != null) {
                k0 = iy0.k0(iy0Var.M().a);
                this.U.h0.setText(String.valueOf(k0[0]));
                this.U.i0.setText(String.valueOf(k0[1]));
                this.U.j0.setText(String.valueOf(k0[2]));
            }
        }
        this.U.a(new a(meVar));
    }
}