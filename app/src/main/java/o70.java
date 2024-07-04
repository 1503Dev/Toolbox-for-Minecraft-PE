package defpackage;

import android.app.Activity;
import android.content.Context;
import android.text.Editable;
import android.view.View;
import android.widget.Toast;
import androidx.databinding.g;
import io.mrarm.mctoolbox.ui.AppBottomSheetDialog;
import io.mrarm.mctoolbox.ui.view.AutoClearErrorTextInputLayout;
import java.io.IOException;
import java.util.Collections;
import java.util.Objects;

/* renamed from: o70  reason: default package */
public final class o70 extends AppBottomSheetDialog {
    public static final /* synthetic */ int X = 0;
    public final ys0 U;
    public final pl V;
    public final String W;

    public o70(Activity activity, final ys0 ys0Var, final String str, String str2, boolean z) {
        super(activity);
        this.U = ys0Var;
        this.W = str;
        setContentView(2131492928);
        View findViewById = findViewById(2131296398);
        Objects.requireNonNull(findViewById);
        pl plVar = (pl) jj.a(findViewById);
        this.V = plVar;
        plVar.R(new ge(this, 1));
        plVar.T(new View.OnClickListener() { // from class: m70
            /* JADX WARN: Removed duplicated region for block: B:39:0x00c8  */
            /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
            @Override // android.view.View.OnClickListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void onClick(View view) {
                AutoClearErrorTextInputLayout autoClearErrorTextInputLayout;
                String string;
                boolean z2;
                Context context;
                int i;
                boolean z3;
                o70 o70Var = o70.this;
                boolean z4 = true;
                if (o70Var.V.f0.getText() != null && o70Var.V.f0.getText().length() != 0) {
                    if (o70Var.V.h0.getText() != null && o70Var.V.h0.getText().length() != 0) {
                        String obj = o70Var.V.f0.getText().toString();
                        if (!obj.contains("\u0000") && !obj.contains("/")) {
                            try {
                                m60.b(o70Var.V.h0.getText().toString());
                                String str3 = o70Var.W;
                                if (str3 == null || !str3.equals(obj)) {
                                    if (Collections.binarySearch((g) o70Var.U.Q, obj) >= 0) {
                                        z3 = true;
                                    } else {
                                        z3 = false;
                                    }
                                    if (z3) {
                                        autoClearErrorTextInputLayout = o70Var.V.g0;
                                        context = o70Var.getContext();
                                        i = 2131755118;
                                    }
                                }
                                z2 = true;
                            } catch (l60 e) {
                                Toast.makeText(o70Var.getContext(), e.getMessage(), 0).show();
                            }
                            if (z2) {
                                Editable text = o70Var.V.f0.getText();
                                Objects.requireNonNull(text);
                                String obj2 = text.toString();
                                Editable text2 = o70Var.V.h0.getText();
                                Objects.requireNonNull(text2);
                                try {
                                    o70Var.U.i(obj2, text2.toString());
                                    String str4 = o70Var.W;
                                    if (str4 != null && !str4.equals(obj2)) {
                                        o70Var.U.b(o70Var.W);
                                    }
                                } catch (IOException unused) {
                                    Toast.makeText(o70Var.getContext(), 2131755103, 0).show();
                                    z4 = false;
                                }
                                if (z4) {
                                    o70Var.dismiss();
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        autoClearErrorTextInputLayout = o70Var.V.i0;
                        context = o70Var.getContext();
                        i = 2131755102;
                        string = context.getString(i);
                        autoClearErrorTextInputLayout.setError(string);
                        z2 = false;
                        if (z2) {
                        }
                    } else {
                        autoClearErrorTextInputLayout = o70Var.V.i0;
                    }
                } else {
                    autoClearErrorTextInputLayout = o70Var.V.g0;
                }
                string = o70Var.getContext().getString(2131755098);
                autoClearErrorTextInputLayout.setError(string);
                z2 = false;
                if (z2) {
                }
            }
        });
        plVar.f0.setText(str);
        plVar.h0.setText(str2);
        plVar.U(z);
        if (z) {
            plVar.S(new View.OnClickListener() { // from class: n70
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    o70 o70Var = o70.this;
                    ys0 ys0Var2 = ys0Var;
                    String str3 = str;
                    o70Var.getClass();
                    ys0Var2.b(str3);
                    o70Var.dismiss();
                }
            });
        }
    }
}