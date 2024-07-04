package defpackage;

import android.net.Uri;
import java.util.HashSet;

/* renamed from: bg  reason: default package */
public final class bg {
    public final HashSet a = new HashSet();

    /* renamed from: bg$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static final class a {
        public final Uri a;
        public final boolean b;

        public a(Uri uri, boolean z) {
            this.a = uri;
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.b == aVar.b && this.a.equals(aVar.a);
        }

        public final int hashCode() {
            return (this.a.hashCode() * 31) + (this.b ? 1 : 0);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || bg.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((bg) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}