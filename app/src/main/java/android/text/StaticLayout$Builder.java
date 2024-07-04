package android.text;

import android.annotation.NonNull;
import android.text.Layout;

public final /* synthetic */ class StaticLayout$Builder {
    static {
        throw new NoClassDefFoundError();
    }

    @NonNull
    public static native /* synthetic */ StaticLayout$Builder obtain(@NonNull CharSequence charSequence, int i, int i2, @NonNull TextPaint textPaint, int i3);

    @NonNull
    public native /* synthetic */ StaticLayout build();

    @NonNull
    public native /* synthetic */ StaticLayout$Builder setAlignment(@NonNull Layout.Alignment alignment);

    @NonNull
    public native /* synthetic */ StaticLayout$Builder setBreakStrategy(int i);

    @NonNull
    public native /* synthetic */ StaticLayout$Builder setHyphenationFrequency(int i);

    @NonNull
    public native /* synthetic */ StaticLayout$Builder setIncludePad(boolean z);

    @NonNull
    public native /* synthetic */ StaticLayout$Builder setLineSpacing(float f, float f2);

    @NonNull
    public native /* synthetic */ StaticLayout$Builder setMaxLines(int i);

    @NonNull
    public native /* synthetic */ StaticLayout$Builder setTextDirection(@NonNull TextDirectionHeuristic textDirectionHeuristic);
}