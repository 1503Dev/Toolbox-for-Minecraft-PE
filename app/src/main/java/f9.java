package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import defpackage.mw0;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* renamed from: f9  reason: default package */
public final class f9 extends Drawable implements mw0.b {
    public static final int f0 = zi0.Widget_MaterialComponents_Badge;
    public static final int g0 = gh0.badgeStyle;
    public final WeakReference<Context> P;
    public final o40 Q;
    public final mw0 R;
    public final Rect S;
    public final float T;
    public final float U;
    public final float V;
    public final a W;
    public float X;
    public float Y;
    public int Z;
    public float a0;
    public float b0;
    public float c0;
    public WeakReference<View> d0;
    public WeakReference<ViewGroup> e0;

    /* renamed from: f9$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static final class a implements Parcelable {
        public static final Parcelable.Creator<a> CREATOR = new C0033a();
        public int P;
        public int Q;
        public int R;
        public int S;
        public int T;
        public String U;
        public int V;
        public int W;

        /* renamed from: f9$a$a  reason: collision with other inner class name */
        /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
        public static class C0033a implements Parcelable.Creator<a> {
            @Override // android.os.Parcelable.Creator
            public final a createFromParcel(Parcel parcel) {
                return new a(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final a[] newArray(int i) {
                return new a[i];
            }
        }

        public a(Context context) {
            this.R = 255;
            this.S = -1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(zi0.TextAppearance_MaterialComponents_Badge, ij0.TextAppearance);
            obtainStyledAttributes.getDimension(ij0.TextAppearance_android_textSize, 0.0f);
            ColorStateList b = n40.b(context, obtainStyledAttributes, ij0.TextAppearance_android_textColor);
            n40.b(context, obtainStyledAttributes, ij0.TextAppearance_android_textColorHint);
            n40.b(context, obtainStyledAttributes, ij0.TextAppearance_android_textColorLink);
            obtainStyledAttributes.getInt(ij0.TextAppearance_android_textStyle, 0);
            obtainStyledAttributes.getInt(ij0.TextAppearance_android_typeface, 1);
            int i = ij0.TextAppearance_fontFamily;
            i = obtainStyledAttributes.hasValue(i) ? i : ij0.TextAppearance_android_fontFamily;
            obtainStyledAttributes.getResourceId(i, 0);
            obtainStyledAttributes.getString(i);
            obtainStyledAttributes.getBoolean(ij0.TextAppearance_textAllCaps, false);
            n40.b(context, obtainStyledAttributes, ij0.TextAppearance_android_shadowColor);
            obtainStyledAttributes.getFloat(ij0.TextAppearance_android_shadowDx, 0.0f);
            obtainStyledAttributes.getFloat(ij0.TextAppearance_android_shadowDy, 0.0f);
            obtainStyledAttributes.getFloat(ij0.TextAppearance_android_shadowRadius, 0.0f);
            obtainStyledAttributes.recycle();
            this.Q = b.getDefaultColor();
            this.U = context.getString(ui0.mtrl_badge_numberless_content_description);
            this.V = oi0.mtrl_badge_content_description;
        }

        public a(Parcel parcel) {
            this.R = 255;
            this.S = -1;
            this.P = parcel.readInt();
            this.Q = parcel.readInt();
            this.R = parcel.readInt();
            this.S = parcel.readInt();
            this.T = parcel.readInt();
            this.U = parcel.readString();
            this.V = parcel.readInt();
            this.W = parcel.readInt();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.P);
            parcel.writeInt(this.Q);
            parcel.writeInt(this.R);
            parcel.writeInt(this.S);
            parcel.writeInt(this.T);
            parcel.writeString(this.U.toString());
            parcel.writeInt(this.V);
            parcel.writeInt(this.W);
        }
    }

    public f9(Context context) {
        iw0 iw0Var;
        Context context2;
        WeakReference<Context> weakReference = new WeakReference<>(context);
        this.P = weakReference;
        yw0.c(context, yw0.b, "Theme.MaterialComponents");
        Resources resources = context.getResources();
        this.S = new Rect();
        this.Q = new o40();
        this.T = resources.getDimensionPixelSize(rh0.mtrl_badge_radius);
        this.V = resources.getDimensionPixelSize(rh0.mtrl_badge_long_text_horizontal_padding);
        this.U = resources.getDimensionPixelSize(rh0.mtrl_badge_with_text_radius);
        mw0 mw0Var = new mw0(this);
        this.R = mw0Var;
        mw0Var.a.setTextAlign(Paint.Align.CENTER);
        this.W = new a(context);
        int i = zi0.TextAppearance_MaterialComponents_Badge;
        Context context3 = weakReference.get();
        if (context3 != null && mw0Var.f != (iw0Var = new iw0(context3, i)) && (context2 = weakReference.get()) != null) {
            mw0Var.b(iw0Var, context2);
            e();
        }
    }

    @Override // defpackage.mw0.b
    public final void a() {
        invalidateSelf();
    }

    public final String b() {
        if (c() <= this.Z) {
            return Integer.toString(c());
        }
        Context context = this.P.get();
        return context == null ? "" : context.getString(ui0.mtrl_exceed_max_badge_number_suffix, Integer.valueOf(this.Z), "+");
    }

    public final int c() {
        if (d()) {
            return this.W.S;
        }
        return 0;
    }

    public final boolean d() {
        return this.W.S != -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (!getBounds().isEmpty() && this.W.R != 0 && isVisible()) {
            this.Q.draw(canvas);
            if (d()) {
                Rect rect = new Rect();
                String b = b();
                this.R.a.getTextBounds(b, 0, b.length(), rect);
                canvas.drawText(b, this.X, this.Y + (rect.height() / 2), this.R.a);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00af, code lost:
        if (r1.getLayoutDirection() == 0) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00b8, code lost:
        if (r1.getLayoutDirection() == 0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00ba, code lost:
        r1 = (r4.left - r8.b0) + r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00c3, code lost:
        r1 = (r4.right + r8.b0) - r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e() {
        View view;
        int i;
        float a2;
        int i2;
        float f;
        Context context = this.P.get();
        WeakReference<View> weakReference = this.d0;
        ViewGroup viewGroup = null;
        if (weakReference != null) {
            view = weakReference.get();
        } else {
            view = null;
        }
        if (context != null && view != null) {
            Rect rect = new Rect();
            rect.set(this.S);
            Rect rect2 = new Rect();
            view.getDrawingRect(rect2);
            WeakReference<ViewGroup> weakReference2 = this.e0;
            if (weakReference2 != null) {
                viewGroup = weakReference2.get();
            }
            if (viewGroup != null) {
                if (viewGroup == null) {
                    viewGroup = (ViewGroup) view.getParent();
                }
                viewGroup.offsetDescendantRectToMyCoords(view, rect2);
            }
            int i3 = this.W.W;
            if (i3 != 8388691 && i3 != 8388693) {
                i = rect2.top;
            } else {
                i = rect2.bottom;
            }
            this.Y = i;
            if (c() <= 9) {
                if (!d()) {
                    a2 = this.T;
                } else {
                    a2 = this.U;
                }
                this.a0 = a2;
                this.c0 = a2;
            } else {
                float f2 = this.U;
                this.a0 = f2;
                this.c0 = f2;
                a2 = (this.R.a(b()) / 2.0f) + this.V;
            }
            this.b0 = a2;
            Resources resources = context.getResources();
            if (d()) {
                i2 = rh0.mtrl_badge_text_horizontal_edge_offset;
            } else {
                i2 = rh0.mtrl_badge_horizontal_edge_offset;
            }
            int dimensionPixelSize = resources.getDimensionPixelSize(i2);
            int i4 = this.W.W;
            if (i4 != 8388659 && i4 != 8388691) {
                WeakHashMap<View, String> weakHashMap = a41.a;
            } else {
                WeakHashMap<View, String> weakHashMap2 = a41.a;
            }
            this.X = f;
            Rect rect3 = this.S;
            float f3 = this.Y;
            float f4 = this.b0;
            float f5 = this.c0;
            rect3.set((int) (f - f4), (int) (f3 - f5), (int) (f + f4), (int) (f3 + f5));
            o40 o40Var = this.Q;
            o40Var.setShapeAppearanceModel(o40Var.P.a.e(this.a0));
            if (!rect.equals(this.S)) {
                this.Q.setBounds(this.S);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.W.R;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.S.height();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.S.width();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return false;
    }

    @Override // android.graphics.drawable.Drawable, defpackage.mw0.b
    public final boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.W.R = i;
        this.R.a.setAlpha(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}