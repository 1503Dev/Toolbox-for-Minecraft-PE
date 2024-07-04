package defpackage;

/* renamed from: mx4  reason: default package */
public final class mx4 {
    public static final mx4 b = new mx4(new a());
    public final Throwable a;

    /* renamed from: mx4$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class a extends Throwable {
        public a() {
            super("Failure occurred while trying to finish a future.");
        }

        @Override // java.lang.Throwable
        public final synchronized Throwable fillInStackTrace() {
            return this;
        }
    }

    public mx4(Throwable th) {
        th.getClass();
        this.a = th;
    }
}