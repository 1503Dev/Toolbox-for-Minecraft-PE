package defpackage;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;

/* renamed from: fr  reason: default package */
public final class fr extends vk0 {
    public static final e50 c = e50.a("application/x-www-form-urlencoded");
    public final List<String> a;
    public final List<String> b;

    /* renamed from: fr$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static final class a {
        public final ArrayList a = new ArrayList();
        public final ArrayList b = new ArrayList();
    }

    public fr(ArrayList arrayList, ArrayList arrayList2) {
        this.a = c31.l(arrayList);
        this.b = c31.l(arrayList2);
    }

    public final long a(@Nullable ab abVar, boolean z) {
        za b;
        if (z) {
            b = new za();
        } else {
            b = abVar.b();
        }
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                b.S(38);
            }
            String str = this.a.get(i);
            b.getClass();
            b.X(0, str.length(), str);
            b.S(61);
            String str2 = this.b.get(i);
            b.X(0, str2.length(), str2);
        }
        if (z) {
            long j = b.Q;
            b.a();
            return j;
        }
        return 0L;
    }

    @Override // defpackage.vk0
    public final long contentLength() {
        return a(null, true);
    }

    @Override // defpackage.vk0
    public final e50 contentType() {
        return c;
    }

    @Override // defpackage.vk0
    public final void writeTo(ab abVar) {
        a(abVar, false);
    }
}