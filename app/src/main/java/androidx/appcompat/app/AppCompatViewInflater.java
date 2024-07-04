package androidx.appcompat.app;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.WeakHashMap;

public class AppCompatViewInflater {
    private static final String LOG_TAG = "AppCompatViewInflater";
    private final Object[] mConstructorArgs = new Object[2];
    private static final Class<?>[] sConstructorSignature = {Context.class, AttributeSet.class};
    private static final int[] sOnClickAttrs = {16843375};
    private static final String[] sClassPrefixList = {"android.widget.", "android.view.", "android.webkit."};
    private static final Map<String, Constructor<? extends View>> sConstructorMap = new e7();

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class a implements View.OnClickListener {
        public final View P;
        public final String Q;
        public Method R;
        public Context S;

        public a(View view, String str) {
            this.P = view;
            this.Q = str;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            String sb;
            Method method;
            if (this.R == null) {
                Context context = this.P.getContext();
                while (context != null) {
                    try {
                        if (!context.isRestricted() && (method = context.getClass().getMethod(this.Q, View.class)) != null) {
                            this.R = method;
                            this.S = context;
                        }
                    } catch (NoSuchMethodException unused) {
                    }
                    if (context instanceof ContextWrapper) {
                        context = ((ContextWrapper) context).getBaseContext();
                    } else {
                        context = null;
                    }
                }
                int id = this.P.getId();
                if (id == -1) {
                    sb = "";
                } else {
                    StringBuilder b = e5.b(" with id '");
                    b.append(this.P.getContext().getResources().getResourceEntryName(id));
                    b.append("'");
                    sb = b.toString();
                }
                StringBuilder b2 = e5.b("Could not find method ");
                b2.append(this.Q);
                b2.append("(View) in a parent or ancestor Context for android:onClick attribute defined on view ");
                b2.append(this.P.getClass());
                b2.append(sb);
                throw new IllegalStateException(b2.toString());
            }
            try {
                this.R.invoke(this.S, view);
            } catch (IllegalAccessException e) {
                throw new IllegalStateException("Could not execute non-public method for android:onClick", e);
            } catch (InvocationTargetException e2) {
                throw new IllegalStateException("Could not execute method for android:onClick", e2);
            }
        }
    }

    private void checkOnClickListener(View view, AttributeSet attributeSet) {
        Context context = view.getContext();
        if (context instanceof ContextWrapper) {
            WeakHashMap<View, String> weakHashMap = a41.a;
            if (view.hasOnClickListeners()) {
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, sOnClickAttrs);
                String string = obtainStyledAttributes.getString(0);
                if (string != null) {
                    view.setOnClickListener(new a(view, string));
                }
                obtainStyledAttributes.recycle();
            }
        }
    }

    private View createViewByPrefix(Context context, String str, String str2) {
        String str3;
        Map<String, Constructor<? extends View>> map = sConstructorMap;
        Constructor<? extends View> constructor = map.get(str);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    str3 = str2 + str;
                } catch (Exception unused) {
                    return null;
                }
            } else {
                str3 = str;
            }
            constructor = Class.forName(str3, false, context.getClassLoader()).asSubclass(View.class).getConstructor(sConstructorSignature);
            map.put(str, constructor);
        }
        constructor.setAccessible(true);
        return constructor.newInstance(this.mConstructorArgs);
    }

    private View createViewFromTag(Context context, String str, AttributeSet attributeSet) {
        if (str.equals("view")) {
            str = attributeSet.getAttributeValue(null, "class");
        }
        try {
            Object[] objArr = this.mConstructorArgs;
            objArr[0] = context;
            objArr[1] = attributeSet;
            if (-1 != str.indexOf(46)) {
                return createViewByPrefix(context, str, null);
            }
            int i = 0;
            while (true) {
                String[] strArr = sClassPrefixList;
                if (i >= strArr.length) {
                    return null;
                }
                View createViewByPrefix = createViewByPrefix(context, str, strArr[i]);
                if (createViewByPrefix != null) {
                    return createViewByPrefix;
                }
                i++;
            }
        } catch (Exception unused) {
            return null;
        } finally {
            Object[] objArr2 = this.mConstructorArgs;
            objArr2[0] = null;
            objArr2[1] = null;
        }
    }

    private static Context themifyContext(Context context, AttributeSet attributeSet, boolean z, boolean z2) {
        int i;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, lj0.View, 0, 0);
        if (z) {
            i = obtainStyledAttributes.getResourceId(lj0.View_android_theme, 0);
        } else {
            i = 0;
        }
        if (z2 && i == 0 && (i = obtainStyledAttributes.getResourceId(lj0.View_theme, 0)) != 0) {
            Log.i(LOG_TAG, "app:theme is now deprecated. Please move to using android:theme instead.");
        }
        obtainStyledAttributes.recycle();
        if (i != 0) {
            if (!(context instanceof kg) || ((kg) context).a != i) {
                return new kg(context, i);
            }
            return context;
        }
        return context;
    }

    private void verifyNotNull(View view, String str) {
        if (view != null) {
            return;
        }
        throw new IllegalStateException(getClass().getName() + " asked to inflate view for <" + str + ">, but returned null");
    }

    public v4 createAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        return new v4(context, attributeSet);
    }

    public x4 createButton(Context context, AttributeSet attributeSet) {
        return new x4(context, attributeSet);
    }

    public z4 createCheckBox(Context context, AttributeSet attributeSet) {
        return new z4(context, attributeSet);
    }

    public a5 createCheckedTextView(Context context, AttributeSet attributeSet) {
        return new a5(context, attributeSet);
    }

    public o5 createEditText(Context context, AttributeSet attributeSet) {
        return new o5(context, attributeSet);
    }

    public q5 createImageButton(Context context, AttributeSet attributeSet) {
        return new q5(context, attributeSet);
    }

    public s5 createImageView(Context context, AttributeSet attributeSet) {
        return new s5(context, attributeSet, 0);
    }

    public t5 createMultiAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        return new t5(context, attributeSet);
    }

    public w5 createRadioButton(Context context, AttributeSet attributeSet) {
        return new w5(context, attributeSet, ih0.radioButtonStyle);
    }

    public x5 createRatingBar(Context context, AttributeSet attributeSet) {
        return new x5(context, attributeSet);
    }

    public a6 createSeekBar(Context context, AttributeSet attributeSet) {
        return new a6(context, attributeSet);
    }

    public d6 createSpinner(Context context, AttributeSet attributeSet) {
        return new d6(context, attributeSet, ih0.spinnerStyle);
    }

    public AppCompatTextView createTextView(Context context, AttributeSet attributeSet) {
        return new AppCompatTextView(context, attributeSet);
    }

    public p6 createToggleButton(Context context, AttributeSet attributeSet) {
        return new p6(context, attributeSet);
    }

    public View createView(Context context, String str, AttributeSet attributeSet) {
        return null;
    }

    public final View createView(View view, String str, Context context, AttributeSet attributeSet, boolean z, boolean z2, boolean z3, boolean z4) {
        View createRatingBar;
        Context context2 = (!z || view == null) ? context : view.getContext();
        if (z2 || z3) {
            context2 = themifyContext(context2, attributeSet, z2, z3);
        }
        if (z4) {
            context2 = ex0.a(context2);
        }
        str.getClass();
        char c = 65535;
        switch (str.hashCode()) {
            case -1946472170:
                if (str.equals("RatingBar")) {
                    c = 0;
                    break;
                }
                break;
            case -1455429095:
                if (str.equals("CheckedTextView")) {
                    c = 1;
                    break;
                }
                break;
            case -1346021293:
                if (str.equals("MultiAutoCompleteTextView")) {
                    c = 2;
                    break;
                }
                break;
            case -938935918:
                if (str.equals("TextView")) {
                    c = 3;
                    break;
                }
                break;
            case -937446323:
                if (str.equals("ImageButton")) {
                    c = 4;
                    break;
                }
                break;
            case -658531749:
                if (str.equals("SeekBar")) {
                    c = 5;
                    break;
                }
                break;
            case -339785223:
                if (str.equals("Spinner")) {
                    c = 6;
                    break;
                }
                break;
            case 776382189:
                if (str.equals("RadioButton")) {
                    c = 7;
                    break;
                }
                break;
            case 799298502:
                if (str.equals("ToggleButton")) {
                    c = '\b';
                    break;
                }
                break;
            case 1125864064:
                if (str.equals("ImageView")) {
                    c = '\t';
                    break;
                }
                break;
            case 1413872058:
                if (str.equals("AutoCompleteTextView")) {
                    c = '\n';
                    break;
                }
                break;
            case 1601505219:
                if (str.equals("CheckBox")) {
                    c = 11;
                    break;
                }
                break;
            case 1666676343:
                if (str.equals("EditText")) {
                    c = '\f';
                    break;
                }
                break;
            case 2001146706:
                if (str.equals("Button")) {
                    c = '\r';
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                createRatingBar = createRatingBar(context2, attributeSet);
                verifyNotNull(createRatingBar, str);
                break;
            case 1:
                createRatingBar = createCheckedTextView(context2, attributeSet);
                verifyNotNull(createRatingBar, str);
                break;
            case 2:
                createRatingBar = createMultiAutoCompleteTextView(context2, attributeSet);
                verifyNotNull(createRatingBar, str);
                break;
            case 3:
                createRatingBar = createTextView(context2, attributeSet);
                verifyNotNull(createRatingBar, str);
                break;
            case 4:
                createRatingBar = createImageButton(context2, attributeSet);
                verifyNotNull(createRatingBar, str);
                break;
            case 5:
                createRatingBar = createSeekBar(context2, attributeSet);
                verifyNotNull(createRatingBar, str);
                break;
            case 6:
                createRatingBar = createSpinner(context2, attributeSet);
                verifyNotNull(createRatingBar, str);
                break;
            case 7:
                createRatingBar = createRadioButton(context2, attributeSet);
                verifyNotNull(createRatingBar, str);
                break;
            case '\b':
                createRatingBar = createToggleButton(context2, attributeSet);
                verifyNotNull(createRatingBar, str);
                break;
            case '\t':
                createRatingBar = createImageView(context2, attributeSet);
                verifyNotNull(createRatingBar, str);
                break;
            case '\n':
                createRatingBar = createAutoCompleteTextView(context2, attributeSet);
                verifyNotNull(createRatingBar, str);
                break;
            case 11:
                createRatingBar = createCheckBox(context2, attributeSet);
                verifyNotNull(createRatingBar, str);
                break;
            case '\f':
                createRatingBar = createEditText(context2, attributeSet);
                verifyNotNull(createRatingBar, str);
                break;
            case '\r':
                createRatingBar = createButton(context2, attributeSet);
                verifyNotNull(createRatingBar, str);
                break;
            default:
                createRatingBar = createView(context2, str, attributeSet);
                break;
        }
        if (createRatingBar == null && context != context2) {
            createRatingBar = createViewFromTag(context2, str, attributeSet);
        }
        if (createRatingBar != null) {
            checkOnClickListener(createRatingBar, attributeSet);
        }
        return createRatingBar;
    }
}