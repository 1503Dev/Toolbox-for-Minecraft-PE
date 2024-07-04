package defpackage;

import android.graphics.drawable.Drawable;
import android.text.Spanned;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;

/* renamed from: qw0  reason: default package */
public final class qw0 {

    /* renamed from: qw0$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public interface a {
        void a();
    }

    /* renamed from: qw0$b */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public interface b {
        void a();
    }

    /* renamed from: qw0$c */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public interface c {
        void a();
    }

    public static String a(EditText editText) {
        return editText.getText().toString();
    }

    public static void b(TextView textView, Drawable drawable) {
        if (drawable != null) {
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        }
        Drawable[] compoundDrawables = textView.getCompoundDrawables();
        textView.setCompoundDrawables(drawable, compoundDrawables[1], compoundDrawables[2], compoundDrawables[3]);
    }

    public static void c(TextView textView, CharSequence charSequence) {
        boolean z;
        boolean z2;
        CharSequence text = textView.getText();
        if (charSequence != text) {
            if (charSequence != null || text.length() != 0) {
                if (charSequence instanceof Spanned) {
                    if (charSequence.equals(text)) {
                        return;
                    }
                } else {
                    boolean z3 = true;
                    if (charSequence == null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (text == null) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z == z2) {
                        if (charSequence != null) {
                            int length = charSequence.length();
                            if (length == text.length()) {
                                for (int i = 0; i < length; i++) {
                                    if (charSequence.charAt(i) != text.charAt(i)) {
                                        break;
                                    }
                                }
                            }
                        }
                        z3 = false;
                    }
                    if (!z3) {
                        return;
                    }
                }
                textView.setText(charSequence);
            }
        }
    }

    public static void d(EditText editText, jy jyVar) {
        TextWatcher pw0Var;
        if (jyVar == null) {
            pw0Var = null;
        } else {
            pw0Var = new pw0(jyVar);
        }
        int i = ci0.textWatcher;
        int i2 = k20.a;
        Object tag = editText.getTag(i);
        editText.setTag(i, pw0Var);
        TextWatcher textWatcher = (TextWatcher) tag;
        if (textWatcher != null) {
            editText.removeTextChangedListener(textWatcher);
        }
        if (pw0Var != null) {
            editText.addTextChangedListener(pw0Var);
        }
    }
}