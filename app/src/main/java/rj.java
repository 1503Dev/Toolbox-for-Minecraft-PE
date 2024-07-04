package defpackage;

import android.icu.text.DateFormat;
import android.icu.util.TimeZone;
import android.os.Build;
import java.util.Date;
import java.util.Locale;

/* renamed from: rj  reason: default package */
public final class rj {
    public static String a(long j) {
        Locale locale = Locale.getDefault();
        if (Build.VERSION.SDK_INT >= 24) {
            DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton("MMMEd", locale);
            instanceForSkeleton.setTimeZone(TimeZone.getTimeZone("UTC"));
            return instanceForSkeleton.format(new Date(j));
        }
        java.text.DateFormat dateInstance = java.text.DateFormat.getDateInstance(0, locale);
        dateInstance.setTimeZone(java.util.TimeZone.getTimeZone("UTC"));
        return dateInstance.format(new Date(j));
    }

    public static String b(long j) {
        Locale locale = Locale.getDefault();
        if (Build.VERSION.SDK_INT >= 24) {
            DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton("yMMMEd", locale);
            instanceForSkeleton.setTimeZone(TimeZone.getTimeZone("UTC"));
            return instanceForSkeleton.format(new Date(j));
        }
        java.text.DateFormat dateInstance = java.text.DateFormat.getDateInstance(0, locale);
        dateInstance.setTimeZone(java.util.TimeZone.getTimeZone("UTC"));
        return dateInstance.format(new Date(j));
    }
}