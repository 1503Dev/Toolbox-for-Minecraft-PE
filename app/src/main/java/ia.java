package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.Log;
import com.google.android.flexbox.FlexboxLayout;
import defpackage.ia;
import defpackage.iw;
import io.mrarm.mctoolbox.bridge.b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: ia  reason: default package */
public final class ia extends xc0 {
    public static final k41 n;
    public ArrayList k;
    public ArrayList l;
    public final HashSet m;

    /* renamed from: ia$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class a extends j41<ia, Object> {
        public int i0;
        public Drawable.ConstantState j0;
        public ia k0;
        public ha l0;

        /* JADX WARN: Illegal instructions before constructor call */
        /* JADX WARN: Type inference failed for: r1v1, types: [ha] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public a(Context context) {
            super(r0);
            FlexboxLayout flexboxLayout = new FlexboxLayout(context, null);
            this.l0 = new iw.a() { // from class: ha
                @Override // defpackage.iw.a
                public final void a(iw iwVar) {
                    ia.a.this.D();
                }
            };
            this.i0 = context.getResources().getDimensionPixelSize(2131165265);
            this.j0 = context.getResources().getDrawable(2131230982).getConstantState();
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(2131165264);
            flexboxLayout.setPadding(dimensionPixelSize, 0, dimensionPixelSize, 0);
            flexboxLayout.setFlexWrap(1);
        }

        @Override // defpackage.j41
        public final void B(ia iaVar, Object obj) {
            ia iaVar2 = iaVar;
            if (this.k0 == null) {
                this.k0 = iaVar2;
                FlexboxLayout flexboxLayout = (FlexboxLayout) this.P;
                int size = iaVar2.k.size();
                FlexboxLayout flexboxLayout2 = (FlexboxLayout) this.P;
                int childCount = flexboxLayout2.getChildCount();
                if (size < childCount) {
                    flexboxLayout2.removeViews(size, childCount - size);
                }
                while (childCount < size) {
                    ka kaVar = new ka(flexboxLayout2.getContext());
                    kaVar.setBackground(this.j0.newDrawable());
                    kaVar.setOnClickListener(new iz0(1, this));
                    int i = this.i0;
                    flexboxLayout2.addView(kaVar, i, i);
                    childCount++;
                }
                for (int i2 = 0; i2 < size; i2++) {
                    ka kaVar2 = (ka) flexboxLayout.getChildAt(i2);
                    kaVar2.setBitmaps((Bitmap[]) iaVar2.k.get(i2));
                    kaVar2.setTag(iaVar2.l.get(i2));
                }
                D();
                iaVar2.b(this.l0);
                return;
            }
            throw new RuntimeException("Bad bind without unbind");
        }

        @Override // defpackage.j41
        public final void C() {
            ia iaVar = this.k0;
            if (iaVar != null) {
                iaVar.a(this.l0);
            }
            this.k0 = null;
        }

        public final void D() {
            FlexboxLayout flexboxLayout = (FlexboxLayout) this.P;
            int size = this.k0.k.size();
            for (int i = 0; i < size; i++) {
                ia iaVar = this.k0;
                ((ka) flexboxLayout.getChildAt(i)).setSelected(iaVar.m.contains(((String[]) iaVar.l.get(i))[0]));
            }
        }
    }

    static {
        t1 t1Var = new t1();
        int i = l41.b;
        n = new k41(t1Var);
    }

    public ia(io.mrarm.mctoolbox.bridge.a aVar) {
        super(aVar);
        this.m = new HashSet();
    }

    @Override // defpackage.iw
    public final void e(oj ojVar, boolean z) {
        ojVar.o(new ct0(this, n));
    }

    @Override // defpackage.xc0
    public final void g() {
        this.m.clear();
        String[] s = ((b) this.a).s(this.f);
        if (s != null) {
            this.m.addAll(Arrays.asList(s));
        }
        h();
    }

    @Override // defpackage.xc0
    public final void i(Context context, zz zzVar) {
        Bitmap[] bitmapArr;
        super.i(context, zzVar);
        h60 h60Var = new h60(context);
        this.k = new ArrayList();
        Iterator<wz> it = ((qz) zzVar.P.get("block_textures")).iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            wz next = it.next();
            next.getClass();
            if (next instanceof qz) {
                qz n2 = next.n();
                bitmapArr = new Bitmap[3];
                for (int i = 0; i < 3; i++) {
                    bitmapArr[i] = h60Var.a("textures/blocks/", n2.r(i).q());
                }
            } else {
                Bitmap a2 = h60Var.a("textures/blocks/", next.q());
                bitmapArr = new Bitmap[]{a2, a2, a2};
            }
            this.k.add(bitmapArr);
        }
        this.l = new ArrayList();
        Iterator<wz> it2 = ((qz) zzVar.P.get("block_values")).iterator();
        while (it2.hasNext()) {
            wz next2 = it2.next();
            next2.getClass();
            if (next2 instanceof qz) {
                qz n3 = next2.n();
                int size = n3.P.size();
                String[] strArr = new String[size];
                for (int i2 = 0; i2 < size; i2++) {
                    strArr[i2] = n3.r(i2).q();
                }
                this.l.add(strArr);
            } else {
                this.l.add(new String[]{next2.q()});
            }
        }
        if (this.l.size() != this.k.size()) {
            Log.e("BlockListOption", "Mismatched block_textures and block_values sizes");
            this.l.clear();
            this.k.clear();
        }
    }
}