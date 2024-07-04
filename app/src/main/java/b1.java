package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* renamed from: b1  reason: default package */
public abstract class b1 {

    /* renamed from: b1$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class a extends ViewGroup.MarginLayoutParams {
        public int a;

        public a() {
            super(-2, -2);
            this.a = 8388627;
        }

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.a = 0;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, lj0.ActionBarLayout);
            this.a = obtainStyledAttributes.getInt(lj0.ActionBarLayout_android_layout_gravity, 0);
            obtainStyledAttributes.recycle();
        }

        public a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.a = 0;
        }

        public a(a aVar) {
            super((ViewGroup.MarginLayoutParams) aVar);
            this.a = 0;
            this.a = aVar.a;
        }
    }

    /* renamed from: b1$b */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public interface b {
        void a();
    }

    @Deprecated
    /* renamed from: b1$c */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static abstract class c {
    }
}