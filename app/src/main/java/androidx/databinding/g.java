package androidx.databinding;

import java.util.List;

public interface g<T> extends List<T> {

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static abstract class a<T extends g> {
        public abstract void a(T t);

        public abstract void b(T t, int i, int i2);

        public abstract void c(T t, int i, int i2);

        public abstract void d(T t, int i, int i2, int i3);

        public abstract void e(T t, int i, int i2);
    }

    void j(a<? extends g<T>> aVar);

    void l(a<? extends g<T>> aVar);
}