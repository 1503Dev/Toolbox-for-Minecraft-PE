package defpackage;

import java.util.ArrayList;

/* renamed from: wa0  reason: default package */
public final class wa0 {

    /* renamed from: wa0$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static final class a {
        public final ArrayList a;
        public final Object b;

        public /* synthetic */ a(Object obj) {
            uf0.f(obj);
            this.b = obj;
            this.a = new ArrayList();
        }

        public final void a(String str, Object obj) {
            ArrayList arrayList = this.a;
            String valueOf = String.valueOf(obj);
            StringBuilder sb = new StringBuilder(str.length() + 1 + valueOf.length());
            sb.append(str);
            sb.append("=");
            sb.append(valueOf);
            arrayList.add(sb.toString());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder(100);
            sb.append(this.b.getClass().getSimpleName());
            sb.append('{');
            int size = this.a.size();
            for (int i = 0; i < size; i++) {
                sb.append((String) this.a.get(i));
                if (i < size - 1) {
                    sb.append(", ");
                }
            }
            sb.append('}');
            return sb.toString();
        }
    }

    public static boolean a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }
}