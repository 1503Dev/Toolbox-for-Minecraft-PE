package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.TypedValue;
import android.util.Xml;
import java.lang.reflect.Array;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: ae  reason: default package */
public final class ae {
    public static final ThreadLocal<TypedValue> a = new ThreadLocal<>();

    public static ColorStateList a(Resources resources, XmlResourceParser xmlResourceParser, Resources.Theme theme) {
        int next;
        AttributeSet asAttributeSet = Xml.asAttributeSet(xmlResourceParser);
        do {
            next = xmlResourceParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return b(resources, xmlResourceParser, asAttributeSet, theme);
        }
        throw new XmlPullParserException("No start tag found");
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00a3, code lost:
        if (r9.hasValue(r12) != false) goto L72;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0109  */
    /* JADX WARN: Type inference failed for: r9v17, types: [java.lang.Object[], java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ColorStateList b(Resources resources, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) {
        int depth;
        TypedArray obtainStyledAttributes;
        int color;
        int i;
        int attributeCount;
        int i2;
        int i3;
        int i4;
        boolean z;
        String name = xmlResourceParser.getName();
        if (name.equals("selector")) {
            boolean z2 = true;
            int depth2 = xmlResourceParser.getDepth() + 1;
            int[][] iArr = new int[20];
            int[] iArr2 = new int[20];
            int i5 = 0;
            while (true) {
                int next = xmlResourceParser.next();
                if (next == z2 || ((depth = xmlResourceParser.getDepth()) < depth2 && next == 3)) {
                    break;
                }
                if (next == 2 && depth <= depth2 && xmlResourceParser.getName().equals("item")) {
                    int[] iArr3 = fj0.ColorStateListItem;
                    if (theme == null) {
                        obtainStyledAttributes = resources.obtainAttributes(attributeSet, iArr3);
                    } else {
                        obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr3, 0, 0);
                    }
                    int i6 = fj0.ColorStateListItem_android_color;
                    int resourceId = obtainStyledAttributes.getResourceId(i6, -1);
                    if (resourceId != -1) {
                        ThreadLocal<TypedValue> threadLocal = a;
                        TypedValue typedValue = threadLocal.get();
                        if (typedValue == null) {
                            typedValue = new TypedValue();
                            threadLocal.set(typedValue);
                        }
                        resources.getValue(resourceId, typedValue, z2);
                        int i7 = typedValue.type;
                        if (i7 >= 28 && i7 <= 31) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (!z) {
                            try {
                                color = a(resources, resources.getXml(resourceId), theme).getDefaultColor();
                            } catch (Exception unused) {
                                i6 = fj0.ColorStateListItem_android_color;
                            }
                            float f = 1.0f;
                            i = fj0.ColorStateListItem_android_alpha;
                            if (!obtainStyledAttributes.hasValue(i)) {
                                i = fj0.ColorStateListItem_alpha;
                            }
                            f = obtainStyledAttributes.getFloat(i, 1.0f);
                            obtainStyledAttributes.recycle();
                            attributeCount = attributeSet.getAttributeCount();
                            int[] iArr4 = new int[attributeCount];
                            int i8 = 0;
                            for (i2 = 0; i2 < attributeCount; i2++) {
                                int attributeNameResource = attributeSet.getAttributeNameResource(i2);
                                if (attributeNameResource != 16843173 && attributeNameResource != 16843551 && attributeNameResource != eh0.alpha) {
                                    int i9 = i8 + 1;
                                    if (!attributeSet.getAttributeBooleanValue(i2, false)) {
                                        attributeNameResource = -attributeNameResource;
                                    }
                                    iArr4[i8] = attributeNameResource;
                                    i8 = i9;
                                }
                            }
                            int[] trimStateSet = StateSet.trimStateSet(iArr4, i8);
                            int round = (Math.round(Color.alpha(color) * f) << 24) | (color & 16777215);
                            i3 = i5 + 1;
                            int i10 = 8;
                            if (i3 > iArr2.length) {
                                if (i5 <= 4) {
                                    i4 = 8;
                                } else {
                                    i4 = i5 * 2;
                                }
                                int[] iArr5 = new int[i4];
                                System.arraycopy(iArr2, 0, iArr5, 0, i5);
                                iArr2 = iArr5;
                            }
                            iArr2[i5] = round;
                            if (i3 > iArr.length) {
                                Class<?> componentType = iArr.getClass().getComponentType();
                                if (i5 > 4) {
                                    i10 = i5 * 2;
                                }
                                ?? r9 = (Object[]) Array.newInstance(componentType, i10);
                                System.arraycopy(iArr, 0, r9, 0, i5);
                                iArr = r9;
                            }
                            iArr[i5] = trimStateSet;
                            iArr = iArr;
                            i5 = i3;
                        }
                    }
                    color = obtainStyledAttributes.getColor(i6, -65281);
                    float f2 = 1.0f;
                    i = fj0.ColorStateListItem_android_alpha;
                    if (!obtainStyledAttributes.hasValue(i)) {
                    }
                    f2 = obtainStyledAttributes.getFloat(i, 1.0f);
                    obtainStyledAttributes.recycle();
                    attributeCount = attributeSet.getAttributeCount();
                    int[] iArr42 = new int[attributeCount];
                    int i82 = 0;
                    while (i2 < attributeCount) {
                    }
                    int[] trimStateSet2 = StateSet.trimStateSet(iArr42, i82);
                    int round2 = (Math.round(Color.alpha(color) * f2) << 24) | (color & 16777215);
                    i3 = i5 + 1;
                    int i102 = 8;
                    if (i3 > iArr2.length) {
                    }
                    iArr2[i5] = round2;
                    if (i3 > iArr.length) {
                    }
                    iArr[i5] = trimStateSet2;
                    iArr = iArr;
                    i5 = i3;
                }
                z2 = true;
            }
            int[] iArr6 = new int[i5];
            int[][] iArr7 = new int[i5];
            System.arraycopy(iArr2, 0, iArr6, 0, i5);
            System.arraycopy(iArr, 0, iArr7, 0, i5);
            return new ColorStateList(iArr7, iArr6);
        }
        throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": invalid color state list tag " + name);
    }
}