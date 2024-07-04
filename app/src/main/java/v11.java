package defpackage;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: v11  reason: default package */
public final class v11 {
    public static ue a(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i) {
        ue ueVar;
        if (e(xmlPullParser, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i, typedValue);
            int i2 = typedValue.type;
            if (i2 >= 28 && i2 <= 31) {
                return new ue(null, null, typedValue.data);
            }
            try {
                ueVar = ue.a(typedArray.getResources(), typedArray.getResourceId(i, 0), theme);
            } catch (Exception e) {
                Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e);
                ueVar = null;
            }
            if (ueVar != null) {
                return ueVar;
            }
        }
        return new ue(null, null, 0);
    }

    public static float b(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, float f) {
        return !e(xmlPullParser, str) ? f : typedArray.getFloat(i, f);
    }

    public static int c(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, int i2) {
        return !e(xmlPullParser, str) ? i2 : typedArray.getInt(i, i2);
    }

    public static String d(TypedArray typedArray, XmlResourceParser xmlResourceParser, String str, int i) {
        if (e(xmlResourceParser, str)) {
            return typedArray.getString(i);
        }
        return null;
    }

    public static boolean e(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    public static TypedArray f(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }
}