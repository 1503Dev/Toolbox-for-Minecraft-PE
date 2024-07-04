package defpackage;

/* renamed from: zv0  reason: default package */
public abstract class zv0<A, ResultT> {
    public final wp[] a;
    public final boolean b;
    public final int c;

    /* renamed from: zv0$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class a<A, ResultT> {
        public rk0<A, aw0<ResultT>> a;
        public wp[] c;
        public boolean b = true;
        public int d = 0;

        public final th1 a() {
            if (this.a != null) {
                return new th1(this, this.c, this.b, this.d);
            }
            throw new IllegalArgumentException("execute parameter required");
        }
    }

    public zv0(wp[] wpVarArr, boolean z, int i) {
        this.a = wpVarArr;
        boolean z2 = false;
        if (wpVarArr != null && z) {
            z2 = true;
        }
        this.b = z2;
        this.c = i;
    }
}