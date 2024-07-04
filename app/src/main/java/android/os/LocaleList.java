package android.os;

import android.annotation.NonNull;
import android.annotation.Nullable;
import java.util.Locale;

public final /* synthetic */ class LocaleList implements Parcelable {
    static {
        throw new NoClassDefFoundError();
    }

    public /* synthetic */ LocaleList(@NonNull Locale... localeArr) {
    }

    @NonNull
    public static native /* synthetic */ LocaleList forLanguageTags(@Nullable String str);

    @NonNull
    public static native /* synthetic */ LocaleList getDefault();

    public native /* synthetic */ boolean equals(@Nullable Object obj);

    public native /* synthetic */ Locale get(int i);

    public native /* synthetic */ int hashCode();

    public native /* synthetic */ int size();

    @NonNull
    public native /* synthetic */ String toLanguageTags();

    public native /* synthetic */ String toString();
}