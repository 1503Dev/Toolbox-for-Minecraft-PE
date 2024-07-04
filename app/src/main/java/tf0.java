package defpackage;

import android.annotation.NonNull;
import android.annotation.SuppressLint;
import android.os.Build;
import android.text.PrecomputedText$Params;
import android.text.Spannable;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;
import java.util.Objects;

/* renamed from: tf0  reason: default package */
public final class tf0 implements Spannable {

    /* renamed from: tf0$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static final class a {
        public final TextPaint a;
        public final TextDirectionHeuristic b;
        public final int c;
        public final int d;

        public a(PrecomputedText$Params precomputedText$Params) {
            this.a = precomputedText$Params.getTextPaint();
            this.b = precomputedText$Params.getTextDirection();
            this.c = precomputedText$Params.getBreakStrategy();
            this.d = precomputedText$Params.getHyphenationFrequency();
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [android.text.PrecomputedText$Params$Builder] */
        @SuppressLint({"NewApi"})
        public a(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i, int i2) {
            if (Build.VERSION.SDK_INT >= 29) {
                new Object(textPaint) { // from class: android.text.PrecomputedText$Params.Builder
                    static {
                        throw new NoClassDefFoundError();
                    }

                    @NonNull
                    public native /* synthetic */ PrecomputedText$Params build();

                    public native /* synthetic */ Builder setBreakStrategy(int i3);

                    public native /* synthetic */ Builder setHyphenationFrequency(int i3);

                    public native /* synthetic */ Builder setTextDirection(@NonNull TextDirectionHeuristic textDirectionHeuristic2);
                }.setBreakStrategy(i).setHyphenationFrequency(i2).setTextDirection(textDirectionHeuristic).build();
            }
            this.a = textPaint;
            this.b = textDirectionHeuristic;
            this.c = i;
            this.d = i2;
        }

        public final boolean a(a aVar) {
            int i = Build.VERSION.SDK_INT;
            if ((i >= 23 && (this.c != aVar.c || this.d != aVar.d)) || this.a.getTextSize() != aVar.a.getTextSize() || this.a.getTextScaleX() != aVar.a.getTextScaleX() || this.a.getTextSkewX() != aVar.a.getTextSkewX()) {
                return false;
            }
            if ((i >= 21 && (this.a.getLetterSpacing() != aVar.a.getLetterSpacing() || !TextUtils.equals(this.a.getFontFeatureSettings(), aVar.a.getFontFeatureSettings()))) || this.a.getFlags() != aVar.a.getFlags()) {
                return false;
            }
            if (i >= 24) {
                if (!this.a.getTextLocales().equals(aVar.a.getTextLocales())) {
                    return false;
                }
            } else if (!this.a.getTextLocale().equals(aVar.a.getTextLocale())) {
                return false;
            }
            if (this.a.getTypeface() == null) {
                if (aVar.a.getTypeface() != null) {
                    return false;
                }
                return true;
            } else if (!this.a.getTypeface().equals(aVar.a.getTypeface())) {
                return false;
            } else {
                return true;
            }
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return a(aVar) && this.b == aVar.b;
            }
            return false;
        }

        public final int hashCode() {
            float letterSpacing;
            float letterSpacing2;
            int i = Build.VERSION.SDK_INT;
            if (i >= 24) {
                letterSpacing2 = this.a.getLetterSpacing();
                return Objects.hash(Float.valueOf(this.a.getTextSize()), Float.valueOf(this.a.getTextScaleX()), Float.valueOf(this.a.getTextSkewX()), Float.valueOf(letterSpacing2), Integer.valueOf(this.a.getFlags()), sf0.a(this.a), this.a.getTypeface(), Boolean.valueOf(fm.d(this.a)), this.b, Integer.valueOf(this.c), Integer.valueOf(this.d));
            } else if (i >= 21) {
                letterSpacing = this.a.getLetterSpacing();
                return Objects.hash(Float.valueOf(this.a.getTextSize()), Float.valueOf(this.a.getTextScaleX()), Float.valueOf(this.a.getTextSkewX()), Float.valueOf(letterSpacing), Integer.valueOf(this.a.getFlags()), this.a.getTextLocale(), this.a.getTypeface(), Boolean.valueOf(fm.d(this.a)), this.b, Integer.valueOf(this.c), Integer.valueOf(this.d));
            } else {
                return Objects.hash(Float.valueOf(this.a.getTextSize()), Float.valueOf(this.a.getTextScaleX()), Float.valueOf(this.a.getTextSkewX()), Integer.valueOf(this.a.getFlags()), this.a.getTextLocale(), this.a.getTypeface(), this.b, Integer.valueOf(this.c), Integer.valueOf(this.d));
            }
        }

        public final String toString() {
            StringBuilder b;
            Object textLocale;
            float letterSpacing;
            StringBuilder sb = new StringBuilder("{");
            StringBuilder b2 = e5.b("textSize=");
            b2.append(this.a.getTextSize());
            sb.append(b2.toString());
            sb.append(", textScaleX=" + this.a.getTextScaleX());
            sb.append(", textSkewX=" + this.a.getTextSkewX());
            int i = Build.VERSION.SDK_INT;
            if (i >= 21) {
                StringBuilder b3 = e5.b(", letterSpacing=");
                letterSpacing = this.a.getLetterSpacing();
                b3.append(letterSpacing);
                sb.append(b3.toString());
                sb.append(", elegantTextHeight=" + fm.d(this.a));
            }
            if (i >= 24) {
                b = e5.b(", textLocale=");
                textLocale = sf0.a(this.a);
            } else {
                b = e5.b(", textLocale=");
                textLocale = this.a.getTextLocale();
            }
            b.append(textLocale);
            sb.append(b.toString());
            sb.append(", typeface=" + this.a.getTypeface());
            if (i >= 26) {
                StringBuilder b4 = e5.b(", variationSettings=");
                b4.append(h6.a(this.a));
                sb.append(b4.toString());
            }
            StringBuilder b5 = e5.b(", textDir=");
            b5.append(this.b);
            sb.append(b5.toString());
            sb.append(", breakStrategy=" + this.c);
            sb.append(", hyphenationFrequency=" + this.d);
            sb.append("}");
            return sb.toString();
        }
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        throw null;
    }

    @Override // android.text.Spanned
    public final int getSpanEnd(Object obj) {
        throw null;
    }

    @Override // android.text.Spanned
    public final int getSpanFlags(Object obj) {
        throw null;
    }

    @Override // android.text.Spanned
    public final int getSpanStart(Object obj) {
        throw null;
    }

    @Override // android.text.Spanned
    @SuppressLint({"NewApi"})
    public final <T> T[] getSpans(int i, int i2, Class<T> cls) {
        int i3 = Build.VERSION.SDK_INT;
        throw null;
    }

    @Override // java.lang.CharSequence
    public final int length() {
        throw null;
    }

    @Override // android.text.Spanned
    public final int nextSpanTransition(int i, int i2, Class cls) {
        throw null;
    }

    @Override // android.text.Spannable
    @SuppressLint({"NewApi"})
    public final void removeSpan(Object obj) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be removed from PrecomputedText.");
        }
        int i = Build.VERSION.SDK_INT;
        throw null;
    }

    @Override // android.text.Spannable
    @SuppressLint({"NewApi"})
    public final void setSpan(Object obj, int i, int i2, int i3) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be set to PrecomputedText.");
        }
        int i4 = Build.VERSION.SDK_INT;
        throw null;
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        throw null;
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        throw null;
    }
}