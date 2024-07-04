package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import android.util.Xml;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: ue  reason: default package */
public final class ue {
    public final Shader a;
    public final ColorStateList b;
    public int c;

    public ue(Shader shader, ColorStateList colorStateList, int i) {
        this.a = shader;
        this.b = colorStateList;
        this.c = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x0182, code lost:
        throw new org.xmlpull.v1.XmlPullParserException(r2.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
     */
    /* JADX WARN: Type inference failed for: r5v8, types: [float, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v9, types: [float, int[]] */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13, types: [float, android.content.res.Resources] */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r8v9, types: [float, java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ue a(Resources resources, int i, Resources.Theme theme) {
        int next;
        int color;
        int color2;
        int i2;
        int color3;
        int next2;
        float f;
        float f2;
        qt qtVar;
        Shader.TileMode tileMode;
        Shader radialGradient;
        Shader.TileMode tileMode2;
        XmlResourceParser xml = resources.getXml(i);
        AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
        do {
            next = xml.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            String name = xml.getName();
            name.getClass();
            if (!name.equals("gradient")) {
                if (name.equals("selector")) {
                    ColorStateList b = ae.b(resources, xml, asAttributeSet, theme);
                    return new ue(null, b, b.getDefaultColor());
                }
                throw new XmlPullParserException(xml.getPositionDescription() + ": unsupported complex color tag " + name);
            }
            String name2 = xml.getName();
            if (name2.equals("gradient")) {
                TypedArray f3 = v11.f(resources, theme, asAttributeSet, fj0.GradientColor);
                float b2 = v11.b(f3, xml, "startX", fj0.GradientColor_android_startX, 0.0f);
                float b3 = v11.b(f3, xml, "startY", fj0.GradientColor_android_startY, 0.0f);
                float b4 = v11.b(f3, xml, "endX", fj0.GradientColor_android_endX, 0.0f);
                v11.b(f3, xml, "endY", fj0.GradientColor_android_endY, 0.0f);
                v11.b(f3, xml, "centerX", fj0.GradientColor_android_centerX, 0.0f);
                v11.b(f3, xml, "centerY", fj0.GradientColor_android_centerY, 0.0f);
                int c = v11.c(f3, xml, "type", fj0.GradientColor_android_type, 0);
                int i3 = fj0.GradientColor_android_startColor;
                if (!v11.e(xml, "startColor")) {
                    color = 0;
                } else {
                    color = f3.getColor(i3, 0);
                }
                boolean e = v11.e(xml, "centerColor");
                int i4 = fj0.GradientColor_android_centerColor;
                if (!v11.e(xml, "centerColor")) {
                    color2 = 0;
                } else {
                    color2 = f3.getColor(i4, 0);
                }
                int i5 = fj0.GradientColor_android_endColor;
                if (!v11.e(xml, "endColor")) {
                    i2 = 0;
                    color3 = 0;
                } else {
                    i2 = 0;
                    color3 = f3.getColor(i5, 0);
                }
                int c2 = v11.c(f3, xml, "tileMode", fj0.GradientColor_android_tileMode, i2);
                v11.b(f3, xml, "gradientRadius", fj0.GradientColor_android_gradientRadius, 0.0f);
                f3.recycle();
                int depth = xml.getDepth() + 1;
                ?? arrayList = new ArrayList(20);
                ?? arrayList2 = new ArrayList(20);
                ?? r7 = resources;
                while (true) {
                    next2 = xml.next();
                    f = b4;
                    if (next2 != 1) {
                        int depth2 = xml.getDepth();
                        f2 = b3;
                        if (depth2 < depth && next2 == 3) {
                            break;
                        }
                        if (next2 == 2) {
                            if (depth2 <= depth) {
                                if (xml.getName().equals("item")) {
                                    TypedArray f4 = v11.f(r7, theme, asAttributeSet, fj0.GradientColorItem);
                                    int i6 = fj0.GradientColorItem_android_color;
                                    boolean hasValue = f4.hasValue(i6);
                                    int i7 = fj0.GradientColorItem_android_offset;
                                    boolean hasValue2 = f4.hasValue(i7);
                                    if (!hasValue || !hasValue2) {
                                        break;
                                    }
                                    int color4 = f4.getColor(i6, 0);
                                    float f5 = f4.getFloat(i7, 0.0f);
                                    f4.recycle();
                                    arrayList2.add(Integer.valueOf(color4));
                                    arrayList.add(Float.valueOf(f5));
                                } else {
                                    continue;
                                }
                            }
                            r7 = resources;
                        }
                        b4 = f;
                        b3 = f2;
                        r7 = r7;
                    } else {
                        f2 = b3;
                        break;
                    }
                }
                if (arrayList2.size() > 0) {
                    qtVar = new qt((ArrayList) arrayList2, (ArrayList) arrayList);
                } else {
                    qtVar = null;
                }
                if (qtVar == null) {
                    if (e) {
                        qtVar = new qt(color, color2, color3);
                    } else {
                        qtVar = new qt(color, color3);
                    }
                }
                if (c != 1) {
                    if (c != 2) {
                        int[] iArr = qtVar.a;
                        float[] fArr = qtVar.b;
                        if (c2 != 1) {
                            if (c2 != 2) {
                                tileMode2 = Shader.TileMode.CLAMP;
                            } else {
                                tileMode2 = Shader.TileMode.MIRROR;
                            }
                        } else {
                            tileMode2 = Shader.TileMode.REPEAT;
                        }
                        radialGradient = new LinearGradient(b2, f2, f, (float) next2, iArr, fArr, tileMode2);
                    } else {
                        radialGradient = new SweepGradient((float) r7, (float) arrayList, qtVar.a, qtVar.b);
                    }
                } else if (arrayList2 > 0.0f) {
                    ?? r5 = qtVar.a;
                    float[] fArr2 = qtVar.b;
                    if (c2 != 1) {
                        if (c2 != 2) {
                            tileMode = Shader.TileMode.CLAMP;
                        } else {
                            tileMode = Shader.TileMode.MIRROR;
                        }
                    } else {
                        tileMode = Shader.TileMode.REPEAT;
                    }
                    radialGradient = new RadialGradient((float) r7, (float) arrayList, (float) r5, (int[]) r5, fArr2, tileMode);
                } else {
                    throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
                }
                return new ue(radialGradient, null, 0);
            }
            throw new XmlPullParserException(xml.getPositionDescription() + ": invalid gradient color tag " + name2);
        }
        throw new XmlPullParserException("No start tag found");
    }

    public final boolean b() {
        ColorStateList colorStateList;
        return this.a == null && (colorStateList = this.b) != null && colorStateList.isStateful();
    }
}