package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;
import java.util.WeakHashMap;

/* renamed from: a51  reason: default package */
public final class a51 {
    public static final f51 a;
    public static final a b;

    /* renamed from: a51$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class a extends Property<View, Float> {
        public a() {
            super(Float.class, "translationAlpha");
        }

        @Override // android.util.Property
        public final Float get(View view) {
            return Float.valueOf(a51.a.q(view));
        }

        @Override // android.util.Property
        public final void set(View view, Float f) {
            float floatValue = f.floatValue();
            a51.a.r(view, floatValue);
        }
    }

    /* renamed from: a51$b */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class b extends Property<View, Rect> {
        public b(Class cls) {
            super(cls, "clipBounds");
        }

        @Override // android.util.Property
        public final Rect get(View view) {
            WeakHashMap<View, String> weakHashMap = a41.a;
            return view.getClipBounds();
        }

        @Override // android.util.Property
        public final void set(View view, Rect rect) {
            WeakHashMap<View, String> weakHashMap = a41.a;
            view.setClipBounds(rect);
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        a = i >= 29 ? new n51() : i >= 23 ? new m51() : i >= 22 ? new k51() : i >= 21 ? new i51() : new f51();
        b = new a();
        new b(Rect.class);
    }

    public static void a(View view, int i, int i2, int i3, int i4) {
        a.l(view, i, i2, i3, i4);
    }
}