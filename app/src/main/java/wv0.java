package defpackage;

import java.util.HashMap;

/* renamed from: wv0  reason: default package */
public final class wv0 {
    public static HashMap a = new HashMap();
    public static HashMap b = new HashMap();

    /* renamed from: wv0$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class a<T extends tv0<?>> {
        public int a;
        public b b;
        public Class<T> c;

        public a(int i, b bVar, Class<T> cls) {
            this.a = i;
            this.b = bVar;
            this.c = cls;
        }
    }

    /* renamed from: wv0$b */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public interface b {
        tv0 get();
    }

    static {
        c(0, new e80(), wo.class);
        c(1, new r1(), gb.class);
        c(2, new vn(), rr0.class);
        c(3, new uv0(), yx.class);
        c(4, new tr0(), e30.class);
        c(5, new ik(), jq.class);
        c(6, new yg(), am.class);
        c(7, new ho(), eb.class);
        c(8, new vv0(), gu0.class);
        c(9, new t1(), b20.class);
        c(10, new f80(), ze.class);
        c(11, new er0(), wx.class);
    }

    public static tv0<?> a(int i) {
        a aVar = (a) a.get(Integer.valueOf(i));
        if (aVar != null) {
            return aVar.b.get();
        }
        throw new IllegalArgumentException(k6.a("unknown Tag id ", i));
    }

    public static byte b(Class<?> cls) {
        a aVar = (a) b.get(cls);
        if (aVar != null) {
            return (byte) aVar.a;
        }
        StringBuilder b2 = e5.b("unknown Tag class ");
        b2.append(cls.getName());
        throw new IllegalArgumentException(b2.toString());
    }

    public static <T extends tv0<?>> void c(int i, b bVar, Class<T> cls) {
        a aVar = new a(i, bVar, cls);
        a.put(Integer.valueOf(i), aVar);
        b.put(cls, aVar);
    }
}