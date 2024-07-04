package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* renamed from: y42  reason: default package */
public final class y42 extends f0 {
    public static final Parcelable.Creator<y42> CREATOR = new z42();
    public final String P;
    public final long Q;
    public final String R;
    public final String S;
    public final String T;
    public final Bundle U;
    public final boolean V;
    public long W;
    public String X;
    public int Y;

    public y42(String str, long j, String str2, String str3, String str4, Bundle bundle, boolean z, long j2, String str5, int i) {
        this.P = str;
        this.Q = j;
        this.R = str2 == null ? "" : str2;
        this.S = str3 == null ? "" : str3;
        this.T = str4 == null ? "" : str4;
        this.U = bundle == null ? new Bundle() : bundle;
        this.V = z;
        this.W = j2;
        this.X = str5;
        this.Y = i;
    }

    public static y42 c(Uri uri) {
        try {
            if ("gcache".equals(uri.getScheme())) {
                List<String> pathSegments = uri.getPathSegments();
                if (pathSegments.size() != 2) {
                    int size = pathSegments.size();
                    sv2.g("Expected 2 path parts for namespace and id, found :" + size);
                    return null;
                }
                String str = pathSegments.get(0);
                String str2 = pathSegments.get(1);
                String host = uri.getHost();
                String queryParameter = uri.getQueryParameter("url");
                boolean equals = "1".equals(uri.getQueryParameter("read_only"));
                String queryParameter2 = uri.getQueryParameter("expiration");
                long parseLong = queryParameter2 == null ? 0L : Long.parseLong(queryParameter2);
                Bundle bundle = new Bundle();
                for (String str3 : uri.getQueryParameterNames()) {
                    if (str3.startsWith("tag.")) {
                        bundle.putString(str3.substring(4), uri.getQueryParameter(str3));
                    }
                }
                return new y42(queryParameter, parseLong, host, str, str2, bundle, equals, 0L, "", 0);
            }
            return null;
        } catch (NullPointerException | NumberFormatException e) {
            sv2.h("Unable to parse Uri into cache offering.", e);
            return null;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s = tv2.s(parcel, 20293);
        tv2.k(parcel, 2, this.P);
        tv2.h(parcel, 3, this.Q);
        tv2.k(parcel, 4, this.R);
        tv2.k(parcel, 5, this.S);
        tv2.k(parcel, 6, this.T);
        tv2.b(parcel, 7, this.U);
        tv2.a(parcel, 8, this.V);
        tv2.h(parcel, 9, this.W);
        tv2.k(parcel, 10, this.X);
        tv2.g(parcel, 11, this.Y);
        tv2.A(parcel, s);
    }
}