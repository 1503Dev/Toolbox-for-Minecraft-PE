package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import defpackage.ko;
import defpackage.uo;
import defpackage.zv;
import io.mrarm.mctoolbox.ui.AppBottomSheetDialog;
import java.util.Objects;

/* renamed from: uo  reason: default package */
public final class uo extends AppBottomSheetDialog {
    public static final /* synthetic */ int V = 0;
    public final ko U;

    /* renamed from: uo$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class a {
        public final zv.b a;
        public final String[] b;
        public final int[] c;
        public final int[] d;
        public final String e;
        public final za0<String> f;
        public Bitmap g;

        public a(zv zvVar, zv.b bVar) {
            this.a = bVar;
            this.b = ((iy0) zvVar).J();
            this.c = bVar.c();
            this.d = bVar.f();
            this.e = bVar.g();
            this.f = new za0<>(bVar.h());
        }
    }

    /* renamed from: uo$b */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public interface b {
        void a(String str, int[] iArr);
    }

    public uo(Context context, zv zvVar, final a aVar, final b bVar) {
        super(context);
        setContentView(2131492919);
        View findViewById = findViewById(2131296398);
        Objects.requireNonNull(findViewById);
        al alVar = (al) jj.a(findViewById);
        alVar.f0.setLayoutManager(new LinearLayoutManager(1));
        ko koVar = new ko(aVar);
        this.U = koVar;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(2131165331);
        Bitmap createBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
        ((iy0) zvVar).L0(createBitmap, dimensionPixelSize, dimensionPixelSize, aVar.a, new Runnable() { // from class: qo
            @Override // java.lang.Runnable
            public final void run() {
                int i = uo.V;
            }
        });
        aVar.g = createBitmap;
        alVar.f0.setAdapter(koVar);
        alVar.S(new View.OnClickListener() { // from class: ro
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                uo uoVar = uo.this;
                uo.b bVar2 = bVar;
                uo.a aVar2 = aVar;
                uoVar.getClass();
                String str = aVar2.f.Q;
                ko koVar2 = uoVar.U;
                int size = koVar2.f.size();
                int[] iArr = new int[size];
                for (int i = 0; i < size; i++) {
                    iArr[i] = ((ko.b) koVar2.f.get(i)).b.Q;
                }
                bVar2.a(str, iArr);
                uoVar.dismiss();
            }
        });
        alVar.R(new so(0, this));
    }
}