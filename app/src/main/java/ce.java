package defpackage;

import android.text.SpannableStringBuilder;

/* renamed from: ce  reason: default package */
public final class ce {
    public SpannableStringBuilder a = new SpannableStringBuilder();

    public final void a(CharSequence charSequence, Object... objArr) {
        this.a.append(charSequence);
        for (Object obj : objArr) {
            SpannableStringBuilder spannableStringBuilder = this.a;
            spannableStringBuilder.setSpan(obj, spannableStringBuilder.length() - charSequence.length(), this.a.length(), 33);
        }
    }

    public final void b(Class<?> cls) {
        Object[] spans;
        SpannableStringBuilder spannableStringBuilder = this.a;
        for (Object obj : spannableStringBuilder.getSpans(spannableStringBuilder.length(), this.a.length(), cls)) {
            int spanFlags = this.a.getSpanFlags(obj) & 51;
            if (spanFlags == 18 || spanFlags == 34) {
                int spanStart = this.a.getSpanStart(obj);
                this.a.removeSpan(obj);
                if (this.a.length() - spanStart > 0) {
                    SpannableStringBuilder spannableStringBuilder2 = this.a;
                    spannableStringBuilder2.setSpan(obj, spanStart, spannableStringBuilder2.length(), (spanFlags & (-52)) | 33);
                }
            }
        }
    }
}