package defpackage;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.os.Build;
import android.util.Base64;
import android.util.TypedValue;
import android.util.Xml;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: xq  reason: default package */
public final class xq {

    /* renamed from: xq$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public interface a {
    }

    /* renamed from: xq$b */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static final class b implements a {
        public final c[] a;

        public b(c[] cVarArr) {
            this.a = cVarArr;
        }
    }

    /* renamed from: xq$c */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static final class c {
        public final String a;
        public int b;
        public boolean c;
        public String d;
        public int e;
        public int f;

        public c(int i, int i2, int i3, String str, String str2, boolean z) {
            this.a = str;
            this.b = i;
            this.c = z;
            this.d = str2;
            this.e = i2;
            this.f = i3;
        }
    }

    /* renamed from: xq$d */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static final class d implements a {
        public final rq a;
        public final int b;
        public final int c;
        public final String d;

        public d(rq rqVar, int i, int i2, String str) {
            this.a = rqVar;
            this.c = i;
            this.b = i2;
            this.d = str;
        }
    }

    public static a a(XmlResourceParser xmlResourceParser, Resources resources) {
        int next;
        boolean z;
        do {
            next = xmlResourceParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            xmlResourceParser.require(2, null, "font-family");
            if (xmlResourceParser.getName().equals("font-family")) {
                TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), fj0.FontFamily);
                String string = obtainAttributes.getString(fj0.FontFamily_fontProviderAuthority);
                String string2 = obtainAttributes.getString(fj0.FontFamily_fontProviderPackage);
                String string3 = obtainAttributes.getString(fj0.FontFamily_fontProviderQuery);
                int resourceId = obtainAttributes.getResourceId(fj0.FontFamily_fontProviderCerts, 0);
                int integer = obtainAttributes.getInteger(fj0.FontFamily_fontProviderFetchStrategy, 1);
                int integer2 = obtainAttributes.getInteger(fj0.FontFamily_fontProviderFetchTimeout, 500);
                String string4 = obtainAttributes.getString(fj0.FontFamily_fontProviderSystemFontFamily);
                obtainAttributes.recycle();
                if (string != null && string2 != null && string3 != null) {
                    while (xmlResourceParser.next() != 3) {
                        c(xmlResourceParser);
                    }
                    return new d(new rq(string, string2, string3, b(resources, resourceId)), integer, integer2, string4);
                }
                ArrayList arrayList = new ArrayList();
                while (xmlResourceParser.next() != 3) {
                    if (xmlResourceParser.getEventType() == 2) {
                        if (xmlResourceParser.getName().equals("font")) {
                            TypedArray obtainAttributes2 = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), fj0.FontFamilyFont);
                            int i = fj0.FontFamilyFont_fontWeight;
                            if (!obtainAttributes2.hasValue(i)) {
                                i = fj0.FontFamilyFont_android_fontWeight;
                            }
                            int i2 = obtainAttributes2.getInt(i, 400);
                            int i3 = fj0.FontFamilyFont_fontStyle;
                            if (!obtainAttributes2.hasValue(i3)) {
                                i3 = fj0.FontFamilyFont_android_fontStyle;
                            }
                            if (1 == obtainAttributes2.getInt(i3, 0)) {
                                z = true;
                            } else {
                                z = false;
                            }
                            int i4 = fj0.FontFamilyFont_ttcIndex;
                            if (!obtainAttributes2.hasValue(i4)) {
                                i4 = fj0.FontFamilyFont_android_ttcIndex;
                            }
                            int i5 = fj0.FontFamilyFont_fontVariationSettings;
                            if (!obtainAttributes2.hasValue(i5)) {
                                i5 = fj0.FontFamilyFont_android_fontVariationSettings;
                            }
                            String string5 = obtainAttributes2.getString(i5);
                            int i6 = obtainAttributes2.getInt(i4, 0);
                            int i7 = fj0.FontFamilyFont_font;
                            if (!obtainAttributes2.hasValue(i7)) {
                                i7 = fj0.FontFamilyFont_android_font;
                            }
                            int resourceId2 = obtainAttributes2.getResourceId(i7, 0);
                            String string6 = obtainAttributes2.getString(i7);
                            obtainAttributes2.recycle();
                            while (xmlResourceParser.next() != 3) {
                                c(xmlResourceParser);
                            }
                            arrayList.add(new c(i2, i6, resourceId2, string6, string5, z));
                        } else {
                            c(xmlResourceParser);
                        }
                    }
                }
                if (arrayList.isEmpty()) {
                    return null;
                }
                return new b((c[]) arrayList.toArray(new c[arrayList.size()]));
            }
            c(xmlResourceParser);
            return null;
        }
        throw new XmlPullParserException("No start tag found");
    }

    public static List<List<byte[]>> b(Resources resources, int i) {
        int i2;
        if (i == 0) {
            return Collections.emptyList();
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            if (Build.VERSION.SDK_INT >= 21) {
                i2 = obtainTypedArray.getType(0);
            } else {
                TypedValue typedValue = new TypedValue();
                obtainTypedArray.getValue(0, typedValue);
                i2 = typedValue.type;
            }
            if (i2 == 1) {
                for (int i3 = 0; i3 < obtainTypedArray.length(); i3++) {
                    int resourceId = obtainTypedArray.getResourceId(i3, 0);
                    if (resourceId != 0) {
                        String[] stringArray = resources.getStringArray(resourceId);
                        ArrayList arrayList2 = new ArrayList();
                        for (String str : stringArray) {
                            arrayList2.add(Base64.decode(str, 0));
                        }
                        arrayList.add(arrayList2);
                    }
                }
            } else {
                String[] stringArray2 = resources.getStringArray(i);
                ArrayList arrayList3 = new ArrayList();
                for (String str2 : stringArray2) {
                    arrayList3.add(Base64.decode(str2, 0));
                }
                arrayList.add(arrayList3);
            }
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    public static void c(XmlResourceParser xmlResourceParser) {
        int i = 1;
        while (i > 0) {
            int next = xmlResourceParser.next();
            if (next == 2) {
                i++;
            } else if (next == 3) {
                i--;
            }
        }
    }
}