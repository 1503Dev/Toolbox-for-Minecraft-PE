package defpackage;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.bf0;
import defpackage.iy0;
import defpackage.zv;
import io.mrarm.mctoolbox.ui.AppBottomSheetDialog;
import java.util.List;
import java.util.regex.Pattern;

/* renamed from: bf0  reason: default package */
public final class bf0 extends AppBottomSheetDialog {
    public static final /* synthetic */ int U = 0;

    /* renamed from: bf0$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class a implements TextWatcher {
        public final /* synthetic */ xe0 P;

        public a(xe0 xe0Var) {
            this.P = xe0Var;
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            xe0 xe0Var = this.P;
            String obj = editable.toString();
            xe0Var.getClass();
            xe0Var.f = obj.length() > 0 ? Pattern.compile(Pattern.quote(obj), 2) : null;
            xe0Var.h.i(xe0Var.g.size());
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: bf0$b */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public interface b {
        void a(zv.a aVar);
    }

    /* renamed from: bf0$c */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class c {
        public final String a;
        public final zv.a b;

        public c(zv.a aVar) {
            String i0;
            this.b = aVar;
            i0 = iy0.i0(((iy0.a) aVar).a);
            this.a = i0;
        }
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [af0] */
    public bf0(Context context, List<c> list, final b bVar) {
        super(context);
        setContentView(2131492929);
        RecyclerView recyclerView = (RecyclerView) findViewById(2131296450);
        View findViewById = findViewById(2131296328);
        recyclerView.setLayoutManager(new LinearLayoutManager(1));
        xe0 xe0Var = new xe0(list, new b() { // from class: af0
            @Override // defpackage.bf0.b
            public final void a(zv.a aVar) {
                bf0 bf0Var = bf0.this;
                bf0.b bVar2 = bVar;
                bf0Var.getClass();
                bVar2.a(aVar);
                bf0Var.dismiss();
            }
        });
        recyclerView.setAdapter(xe0Var);
        ((EditText) findViewById(2131296412)).addTextChangedListener(new a(xe0Var));
        findViewById.setOnClickListener(new ms(this, 1));
    }
}