package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.StaticLayout$Builder;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.Log;
import android.util.TypedValue;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: o6  reason: default package */
public final class o6 {
    public static final RectF k = new RectF();
    public static ConcurrentHashMap<String, Method> l = new ConcurrentHashMap<>();
    public int a = 0;
    public boolean b = false;
    public float c = -1.0f;
    public float d = -1.0f;
    public float e = -1.0f;
    public int[] f = new int[0];
    public boolean g = false;
    public TextPaint h;
    public final TextView i;
    public final Context j;

    static {
        new ConcurrentHashMap();
    }

    public o6(TextView textView) {
        this.i = textView;
        this.j = textView.getContext();
    }

    public static int[] b(int[] iArr) {
        int length = iArr.length;
        if (length == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        for (int i : iArr) {
            if (i > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i)) < 0) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        if (length == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr2[i2] = ((Integer) arrayList.get(i2)).intValue();
        }
        return iArr2;
    }

    public static Method d(String str) {
        try {
            Method method = l.get(str);
            if (method == null && (method = TextView.class.getDeclaredMethod(str, new Class[0])) != null) {
                method.setAccessible(true);
                l.put(str, method);
            }
            return method;
        } catch (Exception e) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e);
            return null;
        }
    }

    public static Object e(TextView textView, String str, Object obj) {
        try {
            return d(str).invoke(textView, new Object[0]);
        } catch (Exception e) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e);
            return obj;
        }
    }

    public final void a() {
        boolean z;
        boolean booleanValue;
        int measuredWidth;
        if (i() && this.a != 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return;
        }
        if (this.b) {
            if (this.i.getMeasuredHeight() > 0 && this.i.getMeasuredWidth() > 0) {
                if (Build.VERSION.SDK_INT >= 29) {
                    booleanValue = m6.b(this.i);
                } else {
                    booleanValue = ((Boolean) e(this.i, "getHorizontallyScrolling", Boolean.FALSE)).booleanValue();
                }
                if (booleanValue) {
                    measuredWidth = 1048576;
                } else {
                    measuredWidth = (this.i.getMeasuredWidth() - this.i.getTotalPaddingLeft()) - this.i.getTotalPaddingRight();
                }
                int height = (this.i.getHeight() - this.i.getCompoundPaddingBottom()) - this.i.getCompoundPaddingTop();
                if (measuredWidth > 0 && height > 0) {
                    RectF rectF = k;
                    synchronized (rectF) {
                        rectF.setEmpty();
                        rectF.right = measuredWidth;
                        rectF.bottom = height;
                        float c = c(rectF);
                        if (c != this.i.getTextSize()) {
                            f(0, c);
                        }
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        }
        this.b = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0117, code lost:
        if (r7.getLineEnd(r7.getLineCount() - 1) != r8.length()) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0138 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x012d A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int c(RectF rectF) {
        int i;
        int i2;
        StaticLayout staticLayout;
        boolean z;
        int i3;
        TextDirectionHeuristic a;
        CharSequence transformation;
        int length = this.f.length;
        if (length != 0) {
            int i4 = length - 1;
            int i5 = 0;
            int i6 = 1;
            int i7 = 0;
            while (i6 <= i4) {
                int i8 = (i6 + i4) / 2;
                int i9 = this.f[i8];
                CharSequence text = this.i.getText();
                TransformationMethod transformationMethod = this.i.getTransformationMethod();
                if (transformationMethod != null && (transformation = transformationMethod.getTransformation(text, this.i)) != null) {
                    text = transformation;
                }
                int i10 = Build.VERSION.SDK_INT;
                int maxLines = this.i.getMaxLines();
                TextPaint textPaint = this.h;
                if (textPaint == null) {
                    this.h = new TextPaint();
                } else {
                    textPaint.reset();
                }
                this.h.set(this.i.getPaint());
                this.h.setTextSize(i9);
                Layout.Alignment alignment = (Layout.Alignment) e(this.i, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL);
                int round = Math.round(rectF.right);
                if (i10 >= 23) {
                    StaticLayout$Builder obtain = StaticLayout$Builder.obtain(text, i5, text.length(), this.h, round);
                    StaticLayout$Builder hyphenationFrequency = obtain.setAlignment(alignment).setLineSpacing(this.i.getLineSpacingExtra(), this.i.getLineSpacingMultiplier()).setIncludePad(this.i.getIncludeFontPadding()).setBreakStrategy(this.i.getBreakStrategy()).setHyphenationFrequency(this.i.getHyphenationFrequency());
                    if (maxLines == -1) {
                        i3 = Integer.MAX_VALUE;
                    } else {
                        i3 = maxLines;
                    }
                    hyphenationFrequency.setMaxLines(i3);
                    if (i10 >= 29) {
                        try {
                            a = n6.a(this.i);
                        } catch (ClassCastException unused) {
                            Log.w("ACTVAutoSizeHelper", "Failed to obtain TextDirectionHeuristic, auto size may be incorrect");
                        }
                    } else {
                        a = (TextDirectionHeuristic) e(this.i, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR);
                    }
                    obtain.setTextDirection(a);
                    staticLayout = obtain.build();
                    i2 = maxLines;
                    i = -1;
                } else {
                    i = -1;
                    i2 = maxLines;
                    staticLayout = new StaticLayout(text, this.h, round, alignment, this.i.getLineSpacingMultiplier(), this.i.getLineSpacingExtra(), this.i.getIncludeFontPadding());
                }
                if (i2 != i) {
                    if (staticLayout.getLineCount() <= i2) {
                    }
                    z = false;
                    if (z) {
                        int i11 = i8 + 1;
                        i5 = 0;
                        i7 = i6;
                        i6 = i11;
                    } else {
                        i7 = i8 - 1;
                        i4 = i7;
                        i5 = 0;
                    }
                }
                if (staticLayout.getHeight() <= rectF.bottom) {
                    z = true;
                    if (z) {
                    }
                }
                z = false;
                if (z) {
                }
            }
            return this.f[i7];
        }
        throw new IllegalStateException("No available text sizes to choose from.");
    }

    public final void f(int i, float f) {
        Context context = this.j;
        float applyDimension = TypedValue.applyDimension(i, f, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics());
        if (applyDimension != this.i.getPaint().getTextSize()) {
            this.i.getPaint().setTextSize(applyDimension);
            boolean isInLayout = this.i.isInLayout();
            if (this.i.getLayout() != null) {
                this.b = false;
                try {
                    Method d = d("nullLayouts");
                    if (d != null) {
                        d.invoke(this.i, new Object[0]);
                    }
                } catch (Exception e) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e);
                }
                if (isInLayout) {
                    this.i.forceLayout();
                } else {
                    this.i.requestLayout();
                }
                this.i.invalidate();
            }
        }
    }

    public final boolean g() {
        if (i() && this.a == 1) {
            if (!this.g || this.f.length == 0) {
                int floor = ((int) Math.floor((this.e - this.d) / this.c)) + 1;
                int[] iArr = new int[floor];
                for (int i = 0; i < floor; i++) {
                    iArr[i] = Math.round((i * this.c) + this.d);
                }
                this.f = b(iArr);
            }
            this.b = true;
        } else {
            this.b = false;
        }
        return this.b;
    }

    public final boolean h() {
        int[] iArr = this.f;
        int length = iArr.length;
        boolean z = length > 0;
        this.g = z;
        if (z) {
            this.a = 1;
            this.d = iArr[0];
            this.e = iArr[length - 1];
            this.c = -1.0f;
        }
        return z;
    }

    public final boolean i() {
        return !(this.i instanceof o5);
    }

    public final void j(float f, float f2, float f3) {
        if (f <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f + "px) is less or equal to (0px)");
        } else if (f2 <= f) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f2 + "px) is less or equal to minimum auto-size text size (" + f + "px)");
        } else if (f3 <= 0.0f) {
            throw new IllegalArgumentException("The auto-size step granularity (" + f3 + "px) is less or equal to (0px)");
        } else {
            this.a = 1;
            this.d = f;
            this.e = f2;
            this.c = f3;
            this.g = false;
        }
    }
}