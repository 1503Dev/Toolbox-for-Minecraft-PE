package defpackage;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.view.View;

/* renamed from: rz1  reason: default package */
public final class rz1 {
    public static final String[] c = {"/aclk", "/pcs/click", "/dbm/clk"};
    public final String[] a = {".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"};
    public final nz1 b;

    @Deprecated
    public rz1(nz1 nz1Var) {
        this.b = nz1Var;
    }

    public static Uri c(Uri uri, String str) {
        String encodedPath;
        String str2;
        uri.getClass();
        try {
            try {
                if (uri.getHost().equals("ad.doubleclick.net")) {
                    if (uri.toString().contains("dc_ms=")) {
                        throw new sz1("Parameter already exists: dc_ms");
                    }
                    String uri2 = uri.toString();
                    int indexOf = uri2.indexOf(";adurl");
                    if (indexOf != -1) {
                        int i = indexOf + 1;
                        str2 = uri2.substring(0, i) + "dc_ms=" + str + ";" + uri2.substring(i);
                    } else {
                        int indexOf2 = uri2.indexOf(uri.getEncodedPath());
                        str2 = uri2.substring(0, encodedPath.length() + indexOf2) + ";dc_ms=" + str + ";" + uri2.substring(indexOf2 + encodedPath.length());
                    }
                    return Uri.parse(str2);
                }
            } catch (NullPointerException unused) {
            }
            if (uri.getQueryParameter("ms") == null) {
                String uri3 = uri.toString();
                int indexOf3 = uri3.indexOf("&adurl");
                if (indexOf3 == -1) {
                    indexOf3 = uri3.indexOf("?adurl");
                }
                if (indexOf3 != -1) {
                    int i2 = indexOf3 + 1;
                    return Uri.parse(uri3.substring(0, i2) + "ms=" + str + "&" + uri3.substring(i2));
                }
                return uri.buildUpon().appendQueryParameter("ms", str).build();
            }
            throw new sz1("Query parameter already exists: ms");
        } catch (UnsupportedOperationException unused2) {
            throw new sz1("Provided Uri is not in a valid state");
        }
    }

    @Deprecated
    public final Uri a(Uri uri, Context context, View view, Activity activity) {
        try {
            return c(uri, this.b.i(context, uri.getQueryParameter("ai"), view, activity));
        } catch (UnsupportedOperationException unused) {
            throw new sz1("Provided Uri is not in a valid state");
        }
    }

    public final boolean b(Uri uri) {
        uri.getClass();
        try {
            String host = uri.getHost();
            String[] strArr = this.a;
            for (int i = 0; i < 3; i++) {
                if (host.endsWith(strArr[i])) {
                    return true;
                }
            }
        } catch (NullPointerException unused) {
        }
        return false;
    }
}