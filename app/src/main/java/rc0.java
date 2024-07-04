package defpackage;

import android.text.Editable;
import android.widget.Toast;
import defpackage.qs0;
import io.mrarm.mctoolbox.bridge.b;
import io.mrarm.mctoolbox.ui.FullscreenTextEditDialog;
import io.mrarm.mctoolbox.ui.d;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* renamed from: rc0  reason: default package */
public final /* synthetic */ class rc0 implements qs0.b, FullscreenTextEditDialog.a {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;

    public /* synthetic */ rc0(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    @Override // io.mrarm.mctoolbox.ui.FullscreenTextEditDialog.a
    public final boolean a() {
        String str;
        d dVar = (d) this.a;
        FullscreenTextEditDialog fullscreenTextEditDialog = (FullscreenTextEditDialog) this.b;
        dVar.getClass();
        try {
            Editable text = fullscreenTextEditDialog.S.getText();
            if (text != null) {
                str = text.toString();
            } else {
                str = "";
            }
            dVar.j(m60.b(str));
            dVar.i();
            return true;
        } catch (l60 e) {
            Toast.makeText(dVar.m.k0.getContext(), e.getMessage(), 0).show();
            return false;
        }
    }

    @Override // defpackage.qs0.b
    public final void b(ol0 ol0Var) {
        tc0 tc0Var = (tc0) this.a;
        Runnable runnable = (Runnable) this.b;
        tc0Var.getClass();
        if (ol0Var.c != null) {
            xt xtVar = new xt();
            ql0 ql0Var = ol0Var.c;
            bb y = ql0Var.y();
            try {
                e50 t = ql0Var.t();
                Charset charset = StandardCharsets.UTF_8;
                if (t != null) {
                    try {
                        String str = t.c;
                        if (str != null) {
                            charset = Charset.forName(str);
                        }
                    } catch (IllegalArgumentException unused) {
                    }
                }
                String C = y.C(c31.a(y, charset));
                ql0.a(null, y);
                if ("expired".equals(((k31) xtVar.e(k31.class, C)).b())) {
                    tc0Var.d(false);
                    tc0Var.a(null);
                    runnable.run();
                    return;
                }
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    if (y != null) {
                        ql0.a(th, y);
                    }
                    throw th2;
                }
            }
        }
        T t2 = ol0Var.b;
        if (t2 != 0) {
            if (((k31) t2).c()) {
                tc0Var.a(((k31) ol0Var.b).a());
                ((b) tc0Var.b).h(((k31) ol0Var.b).a(), false);
                runnable.run();
                return;
            }
            throw new IllegalArgumentException("Server verification not successful");
        }
        throw new IllegalArgumentException("Body can't be null");
    }
}