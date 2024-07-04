package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import defpackage.n5;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: gl0  reason: default package */
public final class gl0 {
    public static gl0 i;
    public WeakHashMap<Context, nt0<ColorStateList>> a;
    public e7<String, d> b;
    public nt0<String> c;
    public final WeakHashMap<Context, d30<WeakReference<Drawable.ConstantState>>> d = new WeakHashMap<>(0);
    public TypedValue e;
    public boolean f;
    public e g;
    public static final PorterDuff.Mode h = PorterDuff.Mode.SRC_IN;
    public static final c j = new c();

    /* renamed from: gl0$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class a implements d {
        @Override // defpackage.gl0.d
        public final Drawable a(Context context, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return f4.g(context, theme, context.getResources(), attributeSet, xmlResourceParser);
            } catch (Exception e) {
                Log.e("AsldcInflateDelegate", "Exception while inflating <animated-selector>", e);
                return null;
            }
        }
    }

    /* renamed from: gl0$b */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class b implements d {
        @Override // defpackage.gl0.d
        public final Drawable a(Context context, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                Resources resources = context.getResources();
                g4 g4Var = new g4(context);
                g4Var.inflate(resources, xmlResourceParser, attributeSet, theme);
                return g4Var;
            } catch (Exception e) {
                Log.e("AvdcInflateDelegate", "Exception while inflating <animated-vector>", e);
                return null;
            }
        }
    }

    /* renamed from: gl0$c */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class c extends g30<Integer, PorterDuffColorFilter> {
        public c() {
            super(6);
        }
    }

    /* renamed from: gl0$d */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public interface d {
        Drawable a(Context context, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme);
    }

    /* renamed from: gl0$e */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public interface e {
    }

    /* renamed from: gl0$f */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class f implements d {
        @Override // defpackage.gl0.d
        public final Drawable a(Context context, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                Resources resources = context.getResources();
                g31 g31Var = new g31();
                g31Var.inflate(resources, xmlResourceParser, attributeSet, theme);
                return g31Var;
            } catch (Exception e) {
                Log.e("VdcInflateDelegate", "Exception while inflating <vector>", e);
                return null;
            }
        }
    }

    public static synchronized gl0 d() {
        gl0 gl0Var;
        synchronized (gl0.class) {
            if (i == null) {
                gl0 gl0Var2 = new gl0();
                i = gl0Var2;
                if (Build.VERSION.SDK_INT < 24) {
                    gl0Var2.a("vector", new f());
                    gl0Var2.a("animated-vector", new b());
                    gl0Var2.a("animated-selector", new a());
                }
            }
            gl0Var = i;
        }
        return gl0Var;
    }

    public static synchronized PorterDuffColorFilter h(int i2, PorterDuff.Mode mode) {
        PorterDuffColorFilter a2;
        synchronized (gl0.class) {
            c cVar = j;
            cVar.getClass();
            int i3 = (i2 + 31) * 31;
            a2 = cVar.a(Integer.valueOf(mode.hashCode() + i3));
            if (a2 == null) {
                a2 = new PorterDuffColorFilter(i2, mode);
                cVar.b(Integer.valueOf(mode.hashCode() + i3), a2);
            }
        }
        return a2;
    }

    public final void a(String str, d dVar) {
        if (this.b == null) {
            this.b = new e7<>();
        }
        this.b.put(str, dVar);
    }

    public final synchronized void b(Context context, long j2, Drawable drawable) {
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState != null) {
            d30<WeakReference<Drawable.ConstantState>> d30Var = this.d.get(context);
            if (d30Var == null) {
                d30Var = new d30<>();
                this.d.put(context, d30Var);
            }
            d30Var.f(j2, new WeakReference<>(constantState));
        }
    }

    public final Drawable c(Context context, int i2) {
        if (this.e == null) {
            this.e = new TypedValue();
        }
        TypedValue typedValue = this.e;
        context.getResources().getValue(i2, typedValue, true);
        long j2 = (typedValue.assetCookie << 32) | typedValue.data;
        Drawable e2 = e(context, j2);
        if (e2 != null) {
            return e2;
        }
        LayerDrawable layerDrawable = null;
        if (this.g != null && i2 == zh0.abc_cab_background_top_material) {
            layerDrawable = new LayerDrawable(new Drawable[]{f(context, zh0.abc_cab_background_internal_bg), f(context, zh0.abc_cab_background_top_mtrl_alpha)});
        }
        if (layerDrawable != null) {
            layerDrawable.setChangingConfigurations(typedValue.changingConfigurations);
            b(context, j2, layerDrawable);
        }
        return layerDrawable;
    }

    public final synchronized Drawable e(Context context, long j2) {
        d30<WeakReference<Drawable.ConstantState>> d30Var = this.d.get(context);
        if (d30Var == null) {
            return null;
        }
        WeakReference weakReference = (WeakReference) d30Var.e(j2, null);
        if (weakReference != null) {
            Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            int i2 = gw.i(d30Var.S, j2, d30Var.Q);
            if (i2 >= 0) {
                Object[] objArr = d30Var.R;
                Object obj = objArr[i2];
                Object obj2 = d30.T;
                if (obj != obj2) {
                    objArr[i2] = obj2;
                    d30Var.P = true;
                }
            }
        }
        return null;
    }

    public final synchronized Drawable f(Context context, int i2) {
        return g(context, i2, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x002a, code lost:
        if (r0 == false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0119, code lost:
        defpackage.km.g(r13, r3);
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01a1 A[Catch: all -> 0x00cb, TRY_LEAVE, TryCatch #1 {all -> 0x00cb, blocks: (B:3:0x0001, B:16:0x002c, B:18:0x0031, B:20:0x0037, B:22:0x003d, B:25:0x004b, B:29:0x005c, B:31:0x0060, B:32:0x0067, B:60:0x00e9, B:62:0x00ef, B:64:0x00f5, B:66:0x00fb, B:68:0x0101, B:69:0x0105, B:76:0x0119, B:72:0x0111, B:74:0x0115, B:78:0x011f, B:80:0x0123, B:82:0x012f, B:83:0x015a, B:85:0x015e, B:87:0x0162, B:89:0x0166, B:93:0x0194, B:100:0x01a1, B:35:0x0081, B:37:0x0085, B:39:0x0091, B:40:0x0099, B:45:0x00a5, B:47:0x00b8, B:49:0x00c2, B:52:0x00ce, B:53:0x00d5, B:55:0x00d7, B:57:0x00e0, B:28:0x0055, B:6:0x0008, B:8:0x0012, B:10:0x0016, B:103:0x01a6, B:104:0x01af), top: B:110:0x0001, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00e9 A[Catch: all -> 0x00cb, TryCatch #1 {all -> 0x00cb, blocks: (B:3:0x0001, B:16:0x002c, B:18:0x0031, B:20:0x0037, B:22:0x003d, B:25:0x004b, B:29:0x005c, B:31:0x0060, B:32:0x0067, B:60:0x00e9, B:62:0x00ef, B:64:0x00f5, B:66:0x00fb, B:68:0x0101, B:69:0x0105, B:76:0x0119, B:72:0x0111, B:74:0x0115, B:78:0x011f, B:80:0x0123, B:82:0x012f, B:83:0x015a, B:85:0x015e, B:87:0x0162, B:89:0x0166, B:93:0x0194, B:100:0x01a1, B:35:0x0081, B:37:0x0085, B:39:0x0091, B:40:0x0099, B:45:0x00a5, B:47:0x00b8, B:49:0x00c2, B:52:0x00ce, B:53:0x00d5, B:55:0x00d7, B:57:0x00e0, B:28:0x0055, B:6:0x0008, B:8:0x0012, B:10:0x0016, B:103:0x01a6, B:104:0x01af), top: B:110:0x0001, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ef A[Catch: all -> 0x00cb, TryCatch #1 {all -> 0x00cb, blocks: (B:3:0x0001, B:16:0x002c, B:18:0x0031, B:20:0x0037, B:22:0x003d, B:25:0x004b, B:29:0x005c, B:31:0x0060, B:32:0x0067, B:60:0x00e9, B:62:0x00ef, B:64:0x00f5, B:66:0x00fb, B:68:0x0101, B:69:0x0105, B:76:0x0119, B:72:0x0111, B:74:0x0115, B:78:0x011f, B:80:0x0123, B:82:0x012f, B:83:0x015a, B:85:0x015e, B:87:0x0162, B:89:0x0166, B:93:0x0194, B:100:0x01a1, B:35:0x0081, B:37:0x0085, B:39:0x0091, B:40:0x0099, B:45:0x00a5, B:47:0x00b8, B:49:0x00c2, B:52:0x00ce, B:53:0x00d5, B:55:0x00d7, B:57:0x00e0, B:28:0x0055, B:6:0x0008, B:8:0x0012, B:10:0x0016, B:103:0x01a6, B:104:0x01af), top: B:110:0x0001, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00f5 A[Catch: all -> 0x00cb, TryCatch #1 {all -> 0x00cb, blocks: (B:3:0x0001, B:16:0x002c, B:18:0x0031, B:20:0x0037, B:22:0x003d, B:25:0x004b, B:29:0x005c, B:31:0x0060, B:32:0x0067, B:60:0x00e9, B:62:0x00ef, B:64:0x00f5, B:66:0x00fb, B:68:0x0101, B:69:0x0105, B:76:0x0119, B:72:0x0111, B:74:0x0115, B:78:0x011f, B:80:0x0123, B:82:0x012f, B:83:0x015a, B:85:0x015e, B:87:0x0162, B:89:0x0166, B:93:0x0194, B:100:0x01a1, B:35:0x0081, B:37:0x0085, B:39:0x0091, B:40:0x0099, B:45:0x00a5, B:47:0x00b8, B:49:0x00c2, B:52:0x00ce, B:53:0x00d5, B:55:0x00d7, B:57:0x00e0, B:28:0x0055, B:6:0x0008, B:8:0x0012, B:10:0x0016, B:103:0x01a6, B:104:0x01af), top: B:110:0x0001, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0193  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized Drawable g(Context context, int i2, boolean z) {
        boolean z2;
        Drawable drawable;
        int next;
        try {
            boolean z3 = false;
            if (!this.f) {
                this.f = true;
                Drawable f2 = f(context, th0.abc_vector_test);
                if (f2 != null) {
                    if (!(f2 instanceof g31) && !"android.graphics.drawable.VectorDrawable".equals(f2.getClass().getName())) {
                        z2 = false;
                    }
                    z2 = true;
                }
                this.f = false;
                throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
            }
            e7<String, d> e7Var = this.b;
            Drawable drawable2 = null;
            r3 = null;
            PorterDuff.Mode mode = null;
            if (e7Var != null && !e7Var.isEmpty()) {
                nt0<String> nt0Var = this.c;
                if (nt0Var != null) {
                    String str = (String) nt0Var.d(i2, null);
                    if (!"appcompat_skip_skip".equals(str)) {
                        if (str != null && this.b.getOrDefault(str, null) == null) {
                        }
                    }
                } else {
                    this.c = new nt0<>();
                }
                if (this.e == null) {
                    this.e = new TypedValue();
                }
                TypedValue typedValue = this.e;
                Resources resources = context.getResources();
                resources.getValue(i2, typedValue, true);
                long j2 = (typedValue.assetCookie << 32) | typedValue.data;
                drawable = e(context, j2);
                if (drawable == null) {
                    CharSequence charSequence = typedValue.string;
                    if (charSequence != null && charSequence.toString().endsWith(".xml")) {
                        try {
                            XmlResourceParser xml = resources.getXml(i2);
                            AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
                            while (true) {
                                next = xml.next();
                                if (next == 2 || next == 1) {
                                    break;
                                }
                            }
                            if (next == 2) {
                                String name = xml.getName();
                                this.c.a(i2, name);
                                d orDefault = this.b.getOrDefault(name, null);
                                if (orDefault != null) {
                                    drawable = orDefault.a(context, xml, asAttributeSet, context.getTheme());
                                }
                                if (drawable != null) {
                                    drawable.setChangingConfigurations(typedValue.changingConfigurations);
                                    b(context, j2, drawable);
                                }
                            } else {
                                throw new XmlPullParserException("No start tag found");
                            }
                        } catch (Exception e2) {
                            Log.e("ResourceManagerInternal", "Exception while inflating drawable", e2);
                        }
                    }
                    if (drawable == null) {
                        this.c.a(i2, "appcompat_skip_skip");
                    }
                }
                if (drawable == null) {
                    drawable = c(context, i2);
                }
                if (drawable == null) {
                    drawable = cg.b(context, i2);
                }
                if (drawable != null) {
                    ColorStateList i3 = i(context, i2);
                    if (i3 != null) {
                        if (um.a(drawable)) {
                            drawable = drawable.mutate();
                        }
                        Drawable h2 = km.h(drawable);
                        km.f(h2, i3);
                        if (this.g != null && i2 == zh0.abc_switch_thumb_material) {
                            mode = PorterDuff.Mode.MULTIPLY;
                        }
                        drawable2 = h2;
                    } else {
                        if (this.g != null) {
                            if (i2 == zh0.abc_seekbar_track_material) {
                                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                                Drawable findDrawableByLayerId = layerDrawable.findDrawableByLayerId(16908288);
                                int i4 = ih0.colorControlNormal;
                                int b2 = zw0.b(context, i4);
                                PorterDuff.Mode mode2 = n5.b;
                                n5.a.d(findDrawableByLayerId, b2, mode2);
                                n5.a.d(layerDrawable.findDrawableByLayerId(16908303), zw0.b(context, i4), mode2);
                                n5.a.d(layerDrawable.findDrawableByLayerId(16908301), zw0.b(context, ih0.colorControlActivated), mode2);
                            } else {
                                if (i2 == zh0.abc_ratingbar_material || i2 == zh0.abc_ratingbar_indicator_material || i2 == zh0.abc_ratingbar_small_material) {
                                    LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                                    Drawable findDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(16908288);
                                    int a2 = zw0.a(context, ih0.colorControlNormal);
                                    PorterDuff.Mode mode3 = n5.b;
                                    n5.a.d(findDrawableByLayerId2, a2, mode3);
                                    Drawable findDrawableByLayerId3 = layerDrawable2.findDrawableByLayerId(16908303);
                                    int i5 = ih0.colorControlActivated;
                                    n5.a.d(findDrawableByLayerId3, zw0.b(context, i5), mode3);
                                    n5.a.d(layerDrawable2.findDrawableByLayerId(16908301), zw0.b(context, i5), mode3);
                                }
                                if (z3) {
                                    drawable2 = drawable;
                                }
                            }
                            z3 = true;
                            if (z3) {
                            }
                        }
                        if (!j(context, i2, drawable) && z) {
                        }
                        drawable2 = drawable;
                    }
                    drawable = drawable2;
                }
                if (drawable != null) {
                    um.b(drawable);
                }
            }
            drawable = null;
            if (drawable == null) {
            }
            if (drawable == null) {
            }
            if (drawable != null) {
            }
            if (drawable != null) {
            }
        } catch (Throwable th) {
            throw th;
        }
        return drawable;
    }

    public final synchronized ColorStateList i(Context context, int i2) {
        ColorStateList colorStateList;
        nt0<ColorStateList> nt0Var;
        try {
            WeakHashMap<Context, nt0<ColorStateList>> weakHashMap = this.a;
            ColorStateList colorStateList2 = null;
            if (weakHashMap != null && (nt0Var = weakHashMap.get(context)) != null) {
                colorStateList = (ColorStateList) nt0Var.d(i2, null);
            } else {
                colorStateList = null;
            }
            if (colorStateList == null) {
                e eVar = this.g;
                if (eVar != null) {
                    colorStateList2 = ((n5.a) eVar).c(context, i2);
                }
                if (colorStateList2 != null) {
                    if (this.a == null) {
                        this.a = new WeakHashMap<>();
                    }
                    nt0<ColorStateList> nt0Var2 = this.a.get(context);
                    if (nt0Var2 == null) {
                        nt0Var2 = new nt0<>();
                        this.a.put(context, nt0Var2);
                    }
                    nt0Var2.a(i2, colorStateList2);
                }
                colorStateList = colorStateList2;
            }
        } catch (Throwable th) {
            throw th;
        }
        return colorStateList;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean j(Context context, int i2, Drawable drawable) {
        int i3;
        int i4;
        boolean z;
        boolean z2;
        e eVar = this.g;
        if (eVar != null) {
            n5.a aVar = (n5.a) eVar;
            PorterDuff.Mode mode = n5.b;
            int i5 = 16842801;
            if (n5.a.a(aVar.a, i2)) {
                i5 = ih0.colorControlNormal;
            } else if (n5.a.a(aVar.c, i2)) {
                i5 = ih0.colorControlActivated;
            } else if (n5.a.a(aVar.d, i2)) {
                mode = PorterDuff.Mode.MULTIPLY;
            } else if (i2 == zh0.abc_list_divider_mtrl_alpha) {
                i3 = 16842800;
                i4 = Math.round(40.8f);
                z = true;
                if (z) {
                    if (um.a(drawable)) {
                        drawable = drawable.mutate();
                    }
                    drawable.setColorFilter(n5.c(zw0.b(context, i3), mode));
                    if (i4 != -1) {
                        drawable.setAlpha(i4);
                    }
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    return true;
                }
            } else if (i2 != zh0.abc_dialog_material_background) {
                i3 = 0;
                i4 = -1;
                z = false;
                if (z) {
                }
                if (z2) {
                }
            }
            i3 = i5;
            i4 = -1;
            z = true;
            if (z) {
            }
            if (z2) {
            }
        }
        return false;
    }
}