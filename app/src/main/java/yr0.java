package defpackage;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Pair;
import android.view.View;
import android.widget.EditText;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import io.mrarm.mctoolbox.ui.AppBottomSheetDialog;
import java.util.Iterator;
import java.util.regex.Pattern;

/* renamed from: yr0  reason: default package */
public final class yr0 extends AppBottomSheetDialog {

    /* renamed from: yr0$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class a implements TextWatcher {
        public final /* synthetic */ vr0 P;

        public a(vr0 vr0Var) {
            this.P = vr0Var;
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            vr0 vr0Var = this.P;
            String obj = editable.toString();
            vr0Var.getClass();
            vr0Var.f = obj.length() > 0 ? Pattern.compile(Pattern.quote(obj), 2) : null;
            Iterator it = vr0Var.g.iterator();
            while (it.hasNext()) {
                Pair pair = (Pair) it.next();
                ((t01) pair.first).i(((Integer) pair.second).intValue());
            }
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    public yr0(Context context, g21 g21Var, mw mwVar) {
        super(context);
        setContentView(2131492929);
        RecyclerView recyclerView = (RecyclerView) findViewById(2131296450);
        View findViewById = findViewById(2131296328);
        recyclerView.setLayoutManager(new LinearLayoutManager(1));
        vr0 vr0Var = new vr0(context, g21Var, mwVar);
        recyclerView.setAdapter(vr0Var);
        ((EditText) findViewById(2131296412)).addTextChangedListener(new a(vr0Var));
        findViewById.setOnClickListener(new View.OnClickListener() { // from class: xr0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                yr0.this.cancel();
            }
        });
    }
}