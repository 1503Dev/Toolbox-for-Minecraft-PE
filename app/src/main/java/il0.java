package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import defpackage.xq;
import java.io.IOException;
import java.util.Objects;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: il0  reason: default package */
public final class il0 {
    public static final ThreadLocal<TypedValue> a = new ThreadLocal<>();
    public static final WeakHashMap<b, SparseArray<a>> b = new WeakHashMap<>(0);
    public static final Object c = new Object();

    /* renamed from: il0$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class a {
        public final ColorStateList a;
        public final Configuration b;

        public a(ColorStateList colorStateList, Configuration configuration) {
            this.a = colorStateList;
            this.b = configuration;
        }
    }

    /* renamed from: il0$b */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static final class b {
        public final Resources a;
        public final Resources.Theme b;

        public b(Resources resources, Resources.Theme theme) {
            this.a = resources;
            this.b = theme;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || b.class != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            return this.a.equals(bVar.a) && Objects.equals(this.b, bVar.b);
        }

        public final int hashCode() {
            return Objects.hash(this.a, this.b);
        }
    }

    /* renamed from: il0$c */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static abstract class c {
        public final void a(int i) {
            new Handler(Looper.getMainLooper()).post(new kl0(this, i));
        }

        public final void b(Typeface typeface) {
            new Handler(Looper.getMainLooper()).post(new jl0(this, typeface));
        }

        public abstract void c(int i);

        public abstract void d(Typeface typeface);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00ae, code lost:
        if (r19 != null) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b0, code lost:
        r19.a(-3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0024, code lost:
        if (r19 != null) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Typeface a(Context context, int i, TypedValue typedValue, int i2, c cVar, boolean z) {
        StringBuilder sb;
        String str;
        Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        CharSequence charSequence = typedValue.string;
        if (charSequence != null) {
            String charSequence2 = charSequence.toString();
            Typeface typeface = null;
            if (charSequence2.startsWith("res/")) {
                g30<String, Typeface> g30Var = w11.b;
                Typeface a2 = g30Var.a(w11.b(resources, i, i2));
                if (a2 != null) {
                    if (cVar != null) {
                        cVar.b(a2);
                    }
                } else {
                    try {
                        if (charSequence2.toLowerCase().endsWith(".xml")) {
                            xq.a a3 = xq.a(resources.getXml(i), resources);
                            if (a3 == null) {
                                Log.e("ResourcesCompat", "Failed to find font-family tag");
                                if (cVar != null) {
                                    cVar.a(-3);
                                }
                            } else {
                                typeface = w11.a(context, a3, resources, i, i2, cVar, z);
                            }
                        } else {
                            a2 = w11.a.d(context, resources, i, charSequence2, i2);
                            if (a2 != null) {
                                g30Var.b(w11.b(resources, i, i2), a2);
                            }
                            if (cVar != null) {
                                if (a2 != null) {
                                    cVar.b(a2);
                                } else {
                                    cVar.a(-3);
                                }
                            }
                        }
                    } catch (IOException e) {
                        e = e;
                        sb = new StringBuilder();
                        str = "Failed to read xml resource ";
                        sb.append(str);
                        sb.append(charSequence2);
                        Log.e("ResourcesCompat", sb.toString(), e);
                    } catch (XmlPullParserException e2) {
                        e = e2;
                        sb = new StringBuilder();
                        str = "Failed to parse xml resource ";
                        sb.append(str);
                        sb.append(charSequence2);
                        Log.e("ResourcesCompat", sb.toString(), e);
                    }
                }
                typeface = a2;
            }
            if (typeface == null && cVar == null) {
                StringBuilder b2 = e5.b("Font resource ID #0x");
                b2.append(Integer.toHexString(i));
                b2.append(" could not be retrieved.");
                throw new Resources.NotFoundException(b2.toString());
            }
            return typeface;
        }
        StringBuilder b3 = e5.b("Resource \"");
        b3.append(resources.getResourceName(i));
        b3.append("\" (");
        b3.append(Integer.toHexString(i));
        b3.append(") is not a Font: ");
        b3.append(typedValue);
        throw new Resources.NotFoundException(b3.toString());
    }
}