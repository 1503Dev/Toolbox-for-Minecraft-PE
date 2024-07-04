package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.LocaleList;
import android.text.TextUtils;
import android.util.Log;
import java.util.Locale;
import javax.annotation.concurrent.GuardedBy;

/* renamed from: gh1  reason: default package */
public final class gh1 {
    @GuardedBy("sCache")
    public static final os0<String, String> a = new os0<>();
    @GuardedBy("sCache")
    public static Locale b;

    public static String a(Context context) {
        String packageName = context.getPackageName();
        try {
            md0 a2 = c81.a(context);
            return a2.a.getPackageManager().getApplicationLabel(a2.a.getPackageManager().getApplicationInfo(packageName, 0)).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            if (TextUtils.isEmpty(str)) {
                return packageName;
            }
            return str;
        }
    }

    public static String b(Context context, int i) {
        Resources resources = context.getResources();
        String a2 = a(context);
        if (i != 1) {
            if (i == 2) {
                return sk.c(context) ? resources.getString(si0.common_google_play_services_wear_update_text) : resources.getString(si0.common_google_play_services_update_text, a2);
            } else if (i != 3) {
                if (i != 5) {
                    if (i != 7) {
                        if (i != 9) {
                            if (i != 20) {
                                switch (i) {
                                    case 16:
                                        return d(context, "common_google_play_services_api_unavailable_text", a2);
                                    case 17:
                                        return d(context, "common_google_play_services_sign_in_failed_text", a2);
                                    case 18:
                                        return resources.getString(si0.common_google_play_services_updating_text, a2);
                                    default:
                                        return resources.getString(ti0.common_google_play_services_unknown_issue, a2);
                                }
                            }
                            return d(context, "common_google_play_services_restricted_profile_text", a2);
                        }
                        return resources.getString(si0.common_google_play_services_unsupported_text, a2);
                    }
                    return d(context, "common_google_play_services_network_error_text", a2);
                }
                return d(context, "common_google_play_services_invalid_account_text", a2);
            } else {
                return resources.getString(si0.common_google_play_services_enable_text, a2);
            }
        }
        return resources.getString(si0.common_google_play_services_install_text, a2);
    }

    public static String c(Context context, int i) {
        String str;
        Resources resources = context.getResources();
        switch (i) {
            case 1:
                return resources.getString(si0.common_google_play_services_install_title);
            case 2:
                return resources.getString(si0.common_google_play_services_update_title);
            case 3:
                return resources.getString(si0.common_google_play_services_enable_title);
            case 4:
            case 6:
            case 18:
                return null;
            case 5:
                Log.e("GoogleApiAvailability", "An invalid account was specified when connecting. Please provide a valid account.");
                return e(context, "common_google_play_services_invalid_account_title");
            case 7:
                Log.e("GoogleApiAvailability", "Network error occurred. Please retry request later.");
                return e(context, "common_google_play_services_network_error_title");
            case 8:
                str = "Internal error occurred. Please see logs for detailed information";
                break;
            case 9:
                str = "Google Play services is invalid. Cannot recover.";
                break;
            case 10:
                str = "Developer error occurred. Please see logs for detailed information";
                break;
            case 11:
                str = "The application is not licensed to the user.";
                break;
            case 12:
            case 13:
            case 14:
            case 15:
            case 19:
            default:
                StringBuilder sb = new StringBuilder(33);
                sb.append("Unexpected error code ");
                sb.append(i);
                str = sb.toString();
                break;
            case 16:
                str = "One of the API components you attempted to connect to is not available.";
                break;
            case 17:
                Log.e("GoogleApiAvailability", "The specified account could not be signed in.");
                return e(context, "common_google_play_services_sign_in_failed_title");
            case 20:
                Log.e("GoogleApiAvailability", "The current user profile is restricted and could not use authenticated features.");
                return e(context, "common_google_play_services_restricted_profile_title");
        }
        Log.e("GoogleApiAvailability", str);
        return null;
    }

    public static String d(Context context, String str, String str2) {
        Resources resources = context.getResources();
        String e = e(context, str);
        if (e == null) {
            e = resources.getString(ti0.common_google_play_services_unknown_issue);
        }
        return String.format(resources.getConfiguration().locale, e, str2);
    }

    public static String e(Context context, String str) {
        n20 a2;
        Resources resources;
        String str2;
        String str3;
        LocaleList locales;
        os0<String, String> os0Var = a;
        synchronized (os0Var) {
            try {
                Configuration configuration = context.getResources().getConfiguration();
                if (Build.VERSION.SDK_INT >= 24) {
                    locales = configuration.getLocales();
                    a2 = new n20(new q20(locales));
                } else {
                    a2 = n20.a(configuration.locale);
                }
                Locale locale = a2.a.get();
                if (!locale.equals(b)) {
                    os0Var.clear();
                    b = locale;
                }
                String orDefault = os0Var.getOrDefault(str, null);
                if (orDefault != null) {
                    return orDefault;
                }
                int i = nt.c;
                try {
                    resources = context.getPackageManager().getResourcesForApplication("com.google.android.gms");
                } catch (PackageManager.NameNotFoundException unused) {
                    resources = null;
                }
                if (resources == null) {
                    return null;
                }
                int identifier = resources.getIdentifier(str, "string", "com.google.android.gms");
                if (identifier == 0) {
                    if (str.length() != 0) {
                        str3 = "Missing resource: ".concat(str);
                    } else {
                        str3 = new String("Missing resource: ");
                    }
                    Log.w("GoogleApiAvailability", str3);
                    return null;
                }
                String string = resources.getString(identifier);
                if (TextUtils.isEmpty(string)) {
                    if (str.length() != 0) {
                        str2 = "Got empty resource: ".concat(str);
                    } else {
                        str2 = new String("Got empty resource: ");
                    }
                    Log.w("GoogleApiAvailability", str2);
                    return null;
                }
                a.put(str, string);
                return string;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}