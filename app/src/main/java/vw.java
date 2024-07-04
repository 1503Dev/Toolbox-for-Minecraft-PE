package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import java.util.ArrayList;

/* renamed from: vw  reason: default package */
public final class vw extends fj {
    public static final lj f;

    /* renamed from: vw$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public interface a {
        void a(int i);
    }

    static {
        int i = l41.b;
        lj ljVar = new lj();
        ljVar.d = 2131493008;
        ljVar.e = 31;
        ljVar.f = 36;
        f = ljVar;
    }

    public vw(Context context, ww wwVar) {
        TypedArray obtainTypedArray = context.getResources().obtainTypedArray(2130903040);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < obtainTypedArray.length(); i++) {
            arrayList.add(Integer.valueOf(obtainTypedArray.getResourceId(i, 0)));
        }
        obtainTypedArray.recycle();
        s10 s10Var = new s10(arrayList, f);
        s10Var.b = wwVar;
        m(s10Var);
    }
}