package defpackage;

import android.view.animation.DecelerateInterpolator;
import androidx.fragment.app.c;
import androidx.fragment.app.f;
import defpackage.n41;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: rr  reason: default package */
public final class rr extends m41 {
    public static final a g = new a();
    public final boolean e;
    public final HashSet<c> b = new HashSet<>();
    public final HashMap<String, rr> c = new HashMap<>();
    public final HashMap<String, o41> d = new HashMap<>();
    public boolean f = false;

    /* renamed from: rr$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class a implements n41.a {
        @Override // defpackage.n41.a
        public final m41 a() {
            return new rr(true);
        }
    }

    public rr(boolean z) {
        this.e = z;
    }

    @Override // defpackage.m41
    public final void a() {
        DecelerateInterpolator decelerateInterpolator = f.u0;
        this.f = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || rr.class != obj.getClass()) {
            return false;
        }
        rr rrVar = (rr) obj;
        return this.b.equals(rrVar.b) && this.c.equals(rrVar.c) && this.d.equals(rrVar.d);
    }

    public final int hashCode() {
        int hashCode = this.c.hashCode();
        return this.d.hashCode() + ((hashCode + (this.b.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator<c> it = this.b.iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator<String> it2 = this.c.keySet().iterator();
        while (it2.hasNext()) {
            sb.append(it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator<String> it3 = this.d.keySet().iterator();
        while (it3.hasNext()) {
            sb.append(it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}