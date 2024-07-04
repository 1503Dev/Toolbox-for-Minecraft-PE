package defpackage;

import android.annotation.SuppressLint;

/* renamed from: uc0  reason: default package */
public interface uc0 {
    @SuppressLint({"SyntheticAccessor"})
    public static final a.c a = new a.c();
    @SuppressLint({"SyntheticAccessor"})
    public static final a.b b = new a.b();

    /* renamed from: uc0$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static abstract class a {

        /* renamed from: uc0$a$a  reason: collision with other inner class name */
        /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
        public static final class C0047a extends a {
            public final Throwable a;

            public C0047a(Throwable th) {
                this.a = th;
            }

            public final String toString() {
                return String.format("FAILURE (%s)", this.a.getMessage());
            }
        }

        /* renamed from: uc0$a$b */
        /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
        public static final class b extends a {
            public final String toString() {
                return "IN_PROGRESS";
            }
        }

        /* renamed from: uc0$a$c */
        /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
        public static final class c extends a {
            public final String toString() {
                return "SUCCESS";
            }
        }
    }
}