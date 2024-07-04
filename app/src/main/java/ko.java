package defpackage;

import com.warkiz.widget.IndicatorSeekBar;
import defpackage.uo;
import java.util.ArrayList;
import java.util.HashSet;

/* renamed from: ko  reason: default package */
public final class ko extends fj {
    public static final int[] g = {0, 1, 2, 3, 4, 8, 16, 256, 32767};
    public static final lj h;
    public static final lj i;
    public static final lj j;
    public final ArrayList f;

    /* renamed from: ko$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class a implements gc0 {
        public final /* synthetic */ b a;

        public a(b bVar) {
            this.a = bVar;
        }

        @Override // defpackage.gc0
        public final void a(rq0 rq0Var) {
            this.a.b.I(ko.g[rq0Var.a]);
        }

        @Override // defpackage.gc0
        public final void b() {
        }

        @Override // defpackage.gc0
        public final void c(IndicatorSeekBar indicatorSeekBar) {
        }
    }

    /* renamed from: ko$b */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class b {
        public String a;
        public final bb0 b;

        public b(String str, int i) {
            this.a = str;
            this.b = new bb0(i);
        }
    }

    static {
        int i2 = l41.b;
        lj ljVar = new lj();
        ljVar.d = 2131492921;
        ljVar.e = 35;
        h = ljVar;
        lj ljVar2 = new lj();
        ljVar2.d = 2131492922;
        i = ljVar2;
        lj ljVar3 = new lj();
        ljVar3.d = 2131492920;
        ljVar3.e = 27;
        ljVar3.g = new mj(new yg());
        j = ljVar3;
    }

    public ko(uo.a aVar) {
        int[] iArr;
        HashSet hashSet = new HashSet();
        this.f = new ArrayList();
        int i2 = 0;
        while (true) {
            String[] strArr = aVar.b;
            if (i2 >= strArr.length) {
                break;
            }
            this.f.add(new b(strArr[i2], aVar.d[i2]));
            i2++;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i3 : aVar.c) {
            arrayList.add((b) this.f.get(i3));
            hashSet.add(Integer.valueOf(i3));
        }
        for (int i4 = 0; i4 < aVar.b.length; i4++) {
            if (!hashSet.contains(Integer.valueOf(i4))) {
                arrayList2.add((b) this.f.get(i4));
            }
        }
        oj ojVar = new oj();
        ojVar.o(new ct0(aVar, h));
        lj ljVar = j;
        ojVar.o(new s10(arrayList, ljVar));
        ojVar.o(new ct0(null, i));
        ojVar.o(new s10(arrayList2, ljVar));
        m(ojVar);
    }
}