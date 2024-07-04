package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import android.view.InflateException;
import defpackage.de0;
import java.util.ArrayList;

/* renamed from: k4  reason: default package */
public final class k4 {

    /* renamed from: k4$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class a implements TypeEvaluator<de0.a[]> {
        public de0.a[] a;

        @Override // android.animation.TypeEvaluator
        public final de0.a[] evaluate(float f, de0.a[] aVarArr, de0.a[] aVarArr2) {
            de0.a[] aVarArr3 = aVarArr;
            de0.a[] aVarArr4 = aVarArr2;
            if (de0.a(aVarArr3, aVarArr4)) {
                if (!de0.a(this.a, aVarArr3)) {
                    this.a = de0.e(aVarArr3);
                }
                for (int i = 0; i < aVarArr3.length; i++) {
                    de0.a aVar = this.a[i];
                    de0.a aVar2 = aVarArr3[i];
                    de0.a aVar3 = aVarArr4[i];
                    aVar.getClass();
                    aVar.a = aVar2.a;
                    int i2 = 0;
                    while (true) {
                        float[] fArr = aVar2.b;
                        if (i2 < fArr.length) {
                            aVar.b[i2] = (aVar3.b[i2] * f) + ((1.0f - f) * fArr[i2]);
                            i2++;
                        }
                    }
                }
                return this.a;
            }
            throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:165:0x0321, code lost:
        if (r27 == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x0323, code lost:
        if (r12 == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x0325, code lost:
        r1 = new android.animation.Animator[r12.size()];
        r2 = r12.iterator();
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x0334, code lost:
        if (r2.hasNext() == false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x0336, code lost:
        r1[r3] = (android.animation.Animator) r2.next();
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x0342, code lost:
        if (r28 != 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x0344, code lost:
        r27.playTogether(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x0348, code lost:
        r27.playSequentially(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x034b, code lost:
        return r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:160:0x02fa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Animator a(Context context, Resources resources, Resources.Theme theme, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, AnimatorSet animatorSet, int i) {
        int i2;
        PropertyValuesHolder[] propertyValuesHolderArr;
        AttributeSet attributeSet2;
        String str;
        int i3;
        int i4;
        PropertyValuesHolder propertyValuesHolder;
        int size;
        float f;
        int i5;
        int i6;
        ObjectAnimator objectAnimator;
        Resources resources2 = resources;
        Resources.Theme theme2 = theme;
        int depth = xmlResourceParser.getDepth();
        ValueAnimator valueAnimator = null;
        ArrayList arrayList = null;
        while (true) {
            int next = xmlResourceParser.next();
            int i7 = 3;
            boolean z = false;
            if (next == 3 && xmlResourceParser.getDepth() <= depth) {
                break;
            }
            int i8 = 1;
            if (next == 1) {
                break;
            }
            int i9 = 2;
            if (next == 2) {
                String name = xmlResourceParser.getName();
                if (name.equals("objectAnimator")) {
                    ObjectAnimator objectAnimator2 = new ObjectAnimator();
                    e(context, resources, theme, attributeSet, objectAnimator2, xmlResourceParser);
                    objectAnimator = objectAnimator2;
                } else if (name.equals("animator")) {
                    objectAnimator = e(context, resources, theme, attributeSet, null, xmlResourceParser);
                } else {
                    if (name.equals("set")) {
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        TypedArray f2 = v11.f(resources2, theme2, attributeSet, c4.h);
                        a(context, resources, theme, xmlResourceParser, attributeSet, animatorSet2, v11.c(f2, xmlResourceParser, "ordering", 0, 0));
                        f2.recycle();
                        i2 = depth;
                        valueAnimator = animatorSet2;
                    } else {
                        String str2 = "propertyValuesHolder";
                        if (name.equals("propertyValuesHolder")) {
                            AttributeSet asAttributeSet = Xml.asAttributeSet(xmlResourceParser);
                            ArrayList arrayList2 = null;
                            while (true) {
                                int eventType = xmlResourceParser.getEventType();
                                if (eventType == i7 || eventType == i8) {
                                    break;
                                } else if (eventType != i9) {
                                    xmlResourceParser.next();
                                } else {
                                    if (xmlResourceParser.getName().equals(str2)) {
                                        TypedArray f3 = v11.f(resources2, theme2, asAttributeSet, c4.i);
                                        String d = v11.d(f3, xmlResourceParser, "propertyName", i7);
                                        attributeSet2 = asAttributeSet;
                                        int c = v11.c(f3, xmlResourceParser, "valueType", i9, 4);
                                        ArrayList arrayList3 = null;
                                        int i10 = c;
                                        str = str2;
                                        while (true) {
                                            int next2 = xmlResourceParser.next();
                                            if (next2 == i7 || next2 == 1) {
                                                break;
                                            }
                                            if (xmlResourceParser.getName().equals("keyframe")) {
                                                if (i10 == 4) {
                                                    TypedArray f4 = v11.f(resources2, theme2, Xml.asAttributeSet(xmlResourceParser), c4.j);
                                                    TypedValue peekValue = !v11.e(xmlResourceParser, "value") ? null : f4.peekValue(0);
                                                    i10 = ((peekValue != null) && d(peekValue.type)) ? 3 : 0;
                                                    f4.recycle();
                                                }
                                                i5 = depth;
                                                TypedArray f5 = v11.f(resources2, theme2, Xml.asAttributeSet(xmlResourceParser), c4.j);
                                                float b = v11.b(f5, xmlResourceParser, "fraction", 3, -1.0f);
                                                TypedValue peekValue2 = !v11.e(xmlResourceParser, "value") ? null : f5.peekValue(0);
                                                boolean z2 = peekValue2 != null;
                                                if (i10 == 4) {
                                                    i6 = (z2 && d(peekValue2.type)) ? 3 : 0;
                                                } else {
                                                    i6 = i10;
                                                }
                                                Keyframe ofInt = z2 ? i6 != 0 ? (i6 == 1 || i6 == 3) ? Keyframe.ofInt(b, v11.c(f5, xmlResourceParser, "value", 0, 0)) : null : Keyframe.ofFloat(b, v11.b(f5, xmlResourceParser, "value", 0, 0.0f)) : i6 == 0 ? Keyframe.ofFloat(b) : Keyframe.ofInt(b);
                                                int resourceId = !v11.e(xmlResourceParser, "interpolator") ? 0 : f5.getResourceId(1, 0);
                                                if (resourceId > 0) {
                                                    ofInt.setInterpolator(j4.b(context, resourceId));
                                                }
                                                f5.recycle();
                                                if (ofInt != null) {
                                                    if (arrayList3 == null) {
                                                        arrayList3 = new ArrayList();
                                                    }
                                                    arrayList3.add(ofInt);
                                                }
                                                xmlResourceParser.next();
                                            } else {
                                                i5 = depth;
                                            }
                                            i7 = 3;
                                            resources2 = resources;
                                            theme2 = theme;
                                            depth = i5;
                                        }
                                        i3 = depth;
                                        if (arrayList3 == null || (size = arrayList3.size()) <= 0) {
                                            i4 = 3;
                                            propertyValuesHolder = null;
                                        } else {
                                            Keyframe keyframe = (Keyframe) arrayList3.get(0);
                                            Keyframe keyframe2 = (Keyframe) arrayList3.get(size - 1);
                                            float fraction = keyframe2.getFraction();
                                            if (fraction < 1.0f) {
                                                if (fraction < 0.0f) {
                                                    keyframe2.setFraction(1.0f);
                                                } else {
                                                    arrayList3.add(arrayList3.size(), b(keyframe2, 1.0f));
                                                    size++;
                                                }
                                            }
                                            float fraction2 = keyframe.getFraction();
                                            if (fraction2 != 0.0f) {
                                                if (fraction2 < 0.0f) {
                                                    keyframe.setFraction(0.0f);
                                                } else {
                                                    arrayList3.add(0, b(keyframe, 0.0f));
                                                    size++;
                                                }
                                            }
                                            Keyframe[] keyframeArr = new Keyframe[size];
                                            arrayList3.toArray(keyframeArr);
                                            int i11 = 0;
                                            while (i11 < size) {
                                                Keyframe keyframe3 = keyframeArr[i11];
                                                if (keyframe3.getFraction() < 0.0f) {
                                                    if (i11 == 0) {
                                                        f = 0.0f;
                                                    } else {
                                                        int i12 = size - 1;
                                                        if (i11 == i12) {
                                                            f = 1.0f;
                                                        } else {
                                                            int i13 = i11;
                                                            for (int i14 = i11 + 1; i14 < i12 && keyframeArr[i14].getFraction() < 0.0f; i14++) {
                                                                i13 = i14;
                                                            }
                                                            float fraction3 = (keyframeArr[i13 + 1].getFraction() - keyframeArr[i11 - 1].getFraction()) / ((i13 - i11) + 2);
                                                            int i15 = i11;
                                                            while (i15 <= i13) {
                                                                keyframeArr[i15].setFraction(keyframeArr[i15 - 1].getFraction() + fraction3);
                                                                i15++;
                                                                size = size;
                                                            }
                                                        }
                                                    }
                                                    keyframe3.setFraction(f);
                                                }
                                                i11++;
                                                size = size;
                                            }
                                            propertyValuesHolder = PropertyValuesHolder.ofKeyframe(d, keyframeArr);
                                            i4 = 3;
                                            if (i10 == 3) {
                                                propertyValuesHolder.setEvaluator(b7.a);
                                            }
                                        }
                                        if (propertyValuesHolder == null) {
                                            propertyValuesHolder = c(f3, c, 0, 1, d);
                                        }
                                        if (propertyValuesHolder != null) {
                                            if (arrayList2 == null) {
                                                arrayList2 = new ArrayList();
                                            }
                                            arrayList2.add(propertyValuesHolder);
                                        }
                                        f3.recycle();
                                        i7 = i4;
                                    } else {
                                        attributeSet2 = asAttributeSet;
                                        str = str2;
                                        i3 = depth;
                                    }
                                    xmlResourceParser.next();
                                    i8 = 1;
                                    i9 = 2;
                                    resources2 = resources;
                                    theme2 = theme;
                                    asAttributeSet = attributeSet2;
                                    str2 = str;
                                    depth = i3;
                                }
                            }
                            i2 = depth;
                            if (arrayList2 != null) {
                                int size2 = arrayList2.size();
                                propertyValuesHolderArr = new PropertyValuesHolder[size2];
                                for (int i16 = 0; i16 < size2; i16++) {
                                    propertyValuesHolderArr[i16] = (PropertyValuesHolder) arrayList2.get(i16);
                                }
                            } else {
                                propertyValuesHolderArr = null;
                            }
                            if (propertyValuesHolderArr != null && (valueAnimator instanceof ValueAnimator)) {
                                valueAnimator.setValues(propertyValuesHolderArr);
                            }
                            z = true;
                        } else {
                            StringBuilder b2 = e5.b("Unknown animator name: ");
                            b2.append(xmlResourceParser.getName());
                            throw new RuntimeException(b2.toString());
                        }
                    }
                    if (animatorSet != null && !z) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(valueAnimator);
                    }
                    resources2 = resources;
                    theme2 = theme;
                    depth = i2;
                }
                valueAnimator = objectAnimator;
                i2 = depth;
                if (animatorSet != null) {
                    if (arrayList == null) {
                    }
                    arrayList.add(valueAnimator);
                }
                resources2 = resources;
                theme2 = theme;
                depth = i2;
            }
        }
    }

    public static Keyframe b(Keyframe keyframe, float f) {
        return keyframe.getType() == Float.TYPE ? Keyframe.ofFloat(f) : keyframe.getType() == Integer.TYPE ? Keyframe.ofInt(f) : Keyframe.ofObject(f);
    }

    public static PropertyValuesHolder c(TypedArray typedArray, int i, int i2, int i3, String str) {
        boolean z;
        int i4;
        boolean z2;
        int i5;
        boolean z3;
        b7 b7Var;
        int i6;
        PropertyValuesHolder ofInt;
        int i7;
        int i8;
        float f;
        float f2;
        float f3;
        PropertyValuesHolder ofObject;
        TypedValue peekValue = typedArray.peekValue(i2);
        if (peekValue != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i4 = peekValue.type;
        } else {
            i4 = 0;
        }
        TypedValue peekValue2 = typedArray.peekValue(i3);
        if (peekValue2 != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            i5 = peekValue2.type;
        } else {
            i5 = 0;
        }
        if (i == 4) {
            if ((z && d(i4)) || (z2 && d(i5))) {
                i = 3;
            } else {
                i = 0;
            }
        }
        if (i == 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        PropertyValuesHolder propertyValuesHolder = null;
        if (i == 2) {
            String string = typedArray.getString(i2);
            String string2 = typedArray.getString(i3);
            de0.a[] c = de0.c(string);
            de0.a[] c2 = de0.c(string2);
            if (c == null && c2 == null) {
                return null;
            }
            if (c != null) {
                a aVar = new a();
                if (c2 != null) {
                    if (de0.a(c, c2)) {
                        ofObject = PropertyValuesHolder.ofObject(str, aVar, c, c2);
                    } else {
                        throw new InflateException(ho.b(" Can't morph from ", string, " to ", string2));
                    }
                } else {
                    ofObject = PropertyValuesHolder.ofObject(str, aVar, c);
                }
                return ofObject;
            } else if (c2 == null) {
                return null;
            } else {
                return PropertyValuesHolder.ofObject(str, new a(), c2);
            }
        }
        if (i == 3) {
            b7Var = b7.a;
        } else {
            b7Var = null;
        }
        if (z3) {
            if (z) {
                if (i4 == 5) {
                    f2 = typedArray.getDimension(i2, 0.0f);
                } else {
                    f2 = typedArray.getFloat(i2, 0.0f);
                }
                if (z2) {
                    if (i5 == 5) {
                        f3 = typedArray.getDimension(i3, 0.0f);
                    } else {
                        f3 = typedArray.getFloat(i3, 0.0f);
                    }
                    ofInt = PropertyValuesHolder.ofFloat(str, f2, f3);
                } else {
                    ofInt = PropertyValuesHolder.ofFloat(str, f2);
                }
            } else {
                if (i5 == 5) {
                    f = typedArray.getDimension(i3, 0.0f);
                } else {
                    f = typedArray.getFloat(i3, 0.0f);
                }
                ofInt = PropertyValuesHolder.ofFloat(str, f);
            }
        } else if (z) {
            if (i4 == 5) {
                i7 = (int) typedArray.getDimension(i2, 0.0f);
            } else if (d(i4)) {
                i7 = typedArray.getColor(i2, 0);
            } else {
                i7 = typedArray.getInt(i2, 0);
            }
            if (z2) {
                if (i5 == 5) {
                    i8 = (int) typedArray.getDimension(i3, 0.0f);
                } else if (d(i5)) {
                    i8 = typedArray.getColor(i3, 0);
                } else {
                    i8 = typedArray.getInt(i3, 0);
                }
                ofInt = PropertyValuesHolder.ofInt(str, i7, i8);
            } else {
                ofInt = PropertyValuesHolder.ofInt(str, i7);
            }
        } else {
            if (z2) {
                if (i5 == 5) {
                    i6 = (int) typedArray.getDimension(i3, 0.0f);
                } else if (d(i5)) {
                    i6 = typedArray.getColor(i3, 0);
                } else {
                    i6 = typedArray.getInt(i3, 0);
                }
                ofInt = PropertyValuesHolder.ofInt(str, i6);
            }
            if (propertyValuesHolder == null && b7Var != null) {
                propertyValuesHolder.setEvaluator(b7Var);
                return propertyValuesHolder;
            }
        }
        propertyValuesHolder = ofInt;
        return propertyValuesHolder == null ? propertyValuesHolder : propertyValuesHolder;
    }

    public static boolean d(int i) {
        return i >= 28 && i <= 31;
    }

    public static ValueAnimator e(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, ObjectAnimator objectAnimator, XmlResourceParser xmlResourceParser) {
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2;
        TypedArray typedArray;
        TypedArray typedArray2;
        ValueAnimator valueAnimator3;
        PropertyValuesHolder propertyValuesHolder;
        PropertyValuesHolder propertyValuesHolder2;
        boolean z;
        int i;
        boolean z2;
        int i2;
        TypedArray f = v11.f(resources, theme, attributeSet, c4.g);
        TypedArray f2 = v11.f(resources, theme, attributeSet, c4.k);
        if (objectAnimator == null) {
            valueAnimator = new ValueAnimator();
        } else {
            valueAnimator = objectAnimator;
        }
        long c = v11.c(f, xmlResourceParser, "duration", 1, 300);
        int i3 = 0;
        long c2 = v11.c(f, xmlResourceParser, "startOffset", 2, 0);
        int c3 = v11.c(f, xmlResourceParser, "valueType", 7, 4);
        if (v11.e(xmlResourceParser, "valueFrom") && v11.e(xmlResourceParser, "valueTo")) {
            if (c3 == 4) {
                TypedValue peekValue = f.peekValue(5);
                if (peekValue != null) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    i = peekValue.type;
                } else {
                    i = 0;
                }
                TypedValue peekValue2 = f.peekValue(6);
                if (peekValue2 != null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    i2 = peekValue2.type;
                } else {
                    i2 = 0;
                }
                if ((z && d(i)) || (z2 && d(i2))) {
                    c3 = 3;
                } else {
                    c3 = 0;
                }
            }
            PropertyValuesHolder c4 = c(f, c3, 5, 6, "");
            if (c4 != null) {
                valueAnimator.setValues(c4);
            }
        }
        valueAnimator.setDuration(c);
        valueAnimator.setStartDelay(c2);
        valueAnimator.setRepeatCount(v11.c(f, xmlResourceParser, "repeatCount", 3, 0));
        valueAnimator.setRepeatMode(v11.c(f, xmlResourceParser, "repeatMode", 4, 1));
        if (f2 != null) {
            ObjectAnimator objectAnimator2 = (ObjectAnimator) valueAnimator;
            String d = v11.d(f2, xmlResourceParser, "pathData", 1);
            if (d != null) {
                String d2 = v11.d(f2, xmlResourceParser, "propertyXName", 2);
                String d3 = v11.d(f2, xmlResourceParser, "propertyYName", 3);
                if (d2 == null && d3 == null) {
                    throw new InflateException(f2.getPositionDescription() + " propertyXName or propertyYName is needed for PathData");
                }
                Path d4 = de0.d(d);
                PathMeasure pathMeasure = new PathMeasure(d4, false);
                ArrayList arrayList = new ArrayList();
                arrayList.add(Float.valueOf(0.0f));
                float f3 = 0.0f;
                do {
                    f3 += pathMeasure.getLength();
                    arrayList.add(Float.valueOf(f3));
                } while (pathMeasure.nextContour());
                PathMeasure pathMeasure2 = new PathMeasure(d4, false);
                int min = Math.min(100, ((int) (f3 / 0.5f)) + 1);
                float[] fArr = new float[min];
                float[] fArr2 = new float[min];
                float[] fArr3 = new float[2];
                float f4 = f3 / (min - 1);
                valueAnimator2 = valueAnimator;
                typedArray = f;
                int i4 = 0;
                float f5 = 0.0f;
                while (true) {
                    propertyValuesHolder = null;
                    if (i3 >= min) {
                        break;
                    }
                    int i5 = min;
                    pathMeasure2.getPosTan(f5 - ((Float) arrayList.get(i4)).floatValue(), fArr3, null);
                    fArr[i3] = fArr3[0];
                    fArr2[i3] = fArr3[1];
                    f5 += f4;
                    int i6 = i4 + 1;
                    if (i6 < arrayList.size() && f5 > ((Float) arrayList.get(i6)).floatValue()) {
                        pathMeasure2.nextContour();
                        i4 = i6;
                    }
                    i3++;
                    min = i5;
                }
                if (d2 != null) {
                    propertyValuesHolder2 = PropertyValuesHolder.ofFloat(d2, fArr);
                } else {
                    propertyValuesHolder2 = null;
                }
                if (d3 != null) {
                    propertyValuesHolder = PropertyValuesHolder.ofFloat(d3, fArr2);
                }
                if (propertyValuesHolder2 == null) {
                    i3 = 0;
                    objectAnimator2.setValues(propertyValuesHolder);
                } else {
                    i3 = 0;
                    if (propertyValuesHolder == null) {
                        objectAnimator2.setValues(propertyValuesHolder2);
                    } else {
                        objectAnimator2.setValues(propertyValuesHolder2, propertyValuesHolder);
                    }
                }
            } else {
                valueAnimator2 = valueAnimator;
                typedArray = f;
                objectAnimator2.setPropertyName(v11.d(f2, xmlResourceParser, "propertyName", 0));
            }
        } else {
            valueAnimator2 = valueAnimator;
            typedArray = f;
        }
        if (!v11.e(xmlResourceParser, "interpolator")) {
            typedArray2 = typedArray;
        } else {
            typedArray2 = typedArray;
            i3 = typedArray2.getResourceId(i3, i3);
        }
        if (i3 > 0) {
            valueAnimator3 = valueAnimator2;
            valueAnimator3.setInterpolator(j4.b(context, i3));
        } else {
            valueAnimator3 = valueAnimator2;
        }
        typedArray2.recycle();
        if (f2 != null) {
            f2.recycle();
        }
        return valueAnimator3;
    }
}