package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;

/* renamed from: yw0  reason: default package */
public final class yw0 {
    public static final int[] a = {gh0.colorPrimary};
    public static final int[] b = {gh0.colorPrimaryVariant};
    public static final int[] c = {16842752, gh0.theme};
    public static final int[] d = {gh0.materialThemeOverlay};

    public static void a(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ij0.ThemeEnforcement, i, i2);
        boolean z = obtainStyledAttributes.getBoolean(ij0.ThemeEnforcement_enforceMaterialTheme, false);
        obtainStyledAttributes.recycle();
        if (z) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(gh0.isMaterialTheme, typedValue, true) || (typedValue.type == 18 && typedValue.data == 0)) {
                c(context, b, "Theme.MaterialComponents");
            }
        }
        c(context, a, "Theme.AppCompat");
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001d, code lost:
        if (r0.getResourceId(defpackage.ij0.ThemeEnforcement_android_textAppearance, -1) != (-1)) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void b(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ij0.ThemeEnforcement, i, i2);
        boolean z = false;
        if (!obtainStyledAttributes.getBoolean(ij0.ThemeEnforcement_enforceTextAppearance, false)) {
            obtainStyledAttributes.recycle();
            return;
        }
        if (iArr2.length != 0) {
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr, i, i2);
            for (int i3 : iArr2) {
                if (obtainStyledAttributes2.getResourceId(i3, -1) == -1) {
                    obtainStyledAttributes2.recycle();
                    break;
                }
            }
            obtainStyledAttributes2.recycle();
            z = true;
        }
        obtainStyledAttributes.recycle();
        if (z) {
            return;
        }
        throw new IllegalArgumentException("This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant).");
    }

    public static void c(Context context, int[] iArr, String str) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(iArr);
        boolean z = false;
        int i = 0;
        while (true) {
            if (i < iArr.length) {
                if (!obtainStyledAttributes.hasValue(i)) {
                    obtainStyledAttributes.recycle();
                    break;
                }
                i++;
            } else {
                obtainStyledAttributes.recycle();
                z = true;
                break;
            }
        }
        if (z) {
            return;
        }
        throw new IllegalArgumentException(ij.c("The style on this component requires your app theme to be ", str, " (or a descendant)."));
    }

    public static Context d(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, d, i, i2);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        if (resourceId != 0) {
            if (!(context instanceof kg) || ((kg) context).a != resourceId) {
                kg kgVar = new kg(context, resourceId);
                TypedArray obtainStyledAttributes2 = kgVar.obtainStyledAttributes(attributeSet, c);
                int resourceId2 = obtainStyledAttributes2.getResourceId(0, 0);
                int resourceId3 = obtainStyledAttributes2.getResourceId(1, 0);
                obtainStyledAttributes2.recycle();
                if (resourceId2 == 0) {
                    resourceId2 = resourceId3;
                }
                if (resourceId2 != 0) {
                    return new kg(kgVar, resourceId2);
                }
                return kgVar;
            }
            return context;
        }
        return context;
    }

    public static TypedArray e(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        a(context, attributeSet, i, i2);
        b(context, attributeSet, iArr, i, i2, iArr2);
        return context.obtainStyledAttributes(attributeSet, iArr, i, i2);
    }
}