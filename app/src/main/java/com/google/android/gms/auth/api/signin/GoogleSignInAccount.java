package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public class GoogleSignInAccount extends f0 implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new sg1();
    public final int P;
    public String Q;
    public String R;
    public String S;
    public String T;
    public Uri U;
    public String V;
    public long W;
    public String X;
    public List<Scope> Y;
    public String Z;
    public String a0;
    public HashSet b0 = new HashSet();

    public GoogleSignInAccount(int i, String str, String str2, String str3, String str4, Uri uri, String str5, long j, String str6, ArrayList arrayList, String str7, String str8) {
        this.P = i;
        this.Q = str;
        this.R = str2;
        this.S = str3;
        this.T = str4;
        this.U = uri;
        this.V = str5;
        this.W = j;
        this.X = str6;
        this.Y = arrayList;
        this.Z = str7;
        this.a0 = str8;
    }

    public static GoogleSignInAccount d(String str) {
        Uri uri;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String optString = jSONObject.optString("photoUrl");
        if (!TextUtils.isEmpty(optString)) {
            uri = Uri.parse(optString);
        } else {
            uri = null;
        }
        long parseLong = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            hashSet.add(new Scope(1, jSONArray.getString(i)));
        }
        String optString2 = jSONObject.optString("id");
        if (jSONObject.has("tokenId")) {
            str2 = jSONObject.optString("tokenId");
        } else {
            str2 = null;
        }
        if (jSONObject.has("email")) {
            str3 = jSONObject.optString("email");
        } else {
            str3 = null;
        }
        if (jSONObject.has("displayName")) {
            str4 = jSONObject.optString("displayName");
        } else {
            str4 = null;
        }
        if (jSONObject.has("givenName")) {
            str5 = jSONObject.optString("givenName");
        } else {
            str5 = null;
        }
        if (jSONObject.has("familyName")) {
            str6 = jSONObject.optString("familyName");
        } else {
            str6 = null;
        }
        Long valueOf = Long.valueOf(parseLong);
        String string = jSONObject.getString("obfuscatedIdentifier");
        long longValue = valueOf.longValue();
        if (!TextUtils.isEmpty(string)) {
            GoogleSignInAccount googleSignInAccount = new GoogleSignInAccount(3, optString2, str2, str3, str4, uri, null, longValue, string, new ArrayList(hashSet), str5, str6);
            if (jSONObject.has("serverAuthCode")) {
                str7 = jSONObject.optString("serverAuthCode");
            } else {
                str7 = null;
            }
            googleSignInAccount.V = str7;
            return googleSignInAccount;
        }
        throw new IllegalArgumentException("Given String is empty or null");
    }

    public final HashSet c() {
        HashSet hashSet = new HashSet(this.Y);
        hashSet.addAll(this.b0);
        return hashSet;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof GoogleSignInAccount) {
            GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
            return googleSignInAccount.X.equals(this.X) && googleSignInAccount.c().equals(c());
        }
        return false;
    }

    public final int hashCode() {
        return c().hashCode() + ((this.X.hashCode() + 527) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s = tv2.s(parcel, 20293);
        tv2.g(parcel, 1, this.P);
        tv2.k(parcel, 2, this.Q);
        tv2.k(parcel, 3, this.R);
        tv2.k(parcel, 4, this.S);
        tv2.k(parcel, 5, this.T);
        tv2.i(parcel, 6, this.U, i);
        tv2.k(parcel, 7, this.V);
        tv2.h(parcel, 8, this.W);
        tv2.k(parcel, 9, this.X);
        tv2.p(parcel, 10, this.Y);
        tv2.k(parcel, 11, this.Z);
        tv2.k(parcel, 12, this.a0);
        tv2.A(parcel, s);
    }
}