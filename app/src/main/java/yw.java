package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.EditText;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.vw;
import io.mrarm.mctoolbox.ui.AppBottomSheetDialog;

/* renamed from: yw  reason: default package */
public final class yw extends AppBottomSheetDialog {
    public static final /* synthetic */ int U = 0;

    /* JADX WARN: Type inference failed for: r4v0, types: [ww] */
    public yw(final Context context, final he heVar) {
        super(context);
        setContentView(2131492929);
        RecyclerView recyclerView = (RecyclerView) findViewById(2131296450);
        View findViewById = findViewById(2131296328);
        ((EditText) findViewById(2131296412)).setVisibility(8);
        final GridLayoutManager gridLayoutManager = new GridLayoutManager();
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setAdapter(new vw(context, new vw.a() { // from class: ww
            @Override // defpackage.vw.a
            public final void a(int i) {
                yw ywVar = yw.this;
                vw.a aVar = heVar;
                ywVar.getClass();
                aVar.a(i);
                ywVar.dismiss();
            }
        }));
        final int dimensionPixelSize = context.getResources().getDimensionPixelSize(2131165342);
        recyclerView.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        findViewById.setOnClickListener(new vk(1, this));
        recyclerView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: xw
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                GridLayoutManager.this.u1(((i3 - i) - (dimensionPixelSize * 2)) / context.getResources().getDimensionPixelSize(2131165343));
            }
        });
    }
}