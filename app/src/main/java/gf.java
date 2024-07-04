package defpackage;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.wa0;
import java.util.Arrays;

/* renamed from: gf  reason: default package */
public final class gf extends f0 {
    public final int P;
    public final int Q;
    public final PendingIntent R;
    public final String S;
    public static final gf T = new gf(0);
    public static final Parcelable.Creator<gf> CREATOR = new f82();

    public gf() {
        throw null;
    }

    public gf(int i) {
        this(1, i, null, null);
    }

    public gf(int i, int i2, PendingIntent pendingIntent, String str) {
        this.P = i;
        this.Q = i2;
        this.R = pendingIntent;
        this.S = str;
    }

    public static String c(int i) {
        if (i != 99) {
            if (i != 1500) {
                switch (i) {
                    case -1:
                        return "UNKNOWN";
                    case 0:
                        return "SUCCESS";
                    case 1:
                        return "SERVICE_MISSING";
                    case 2:
                        return "SERVICE_VERSION_UPDATE_REQUIRED";
                    case 3:
                        return "SERVICE_DISABLED";
                    case 4:
                        return "SIGN_IN_REQUIRED";
                    case 5:
                        return "INVALID_ACCOUNT";
                    case 6:
                        return "RESOLUTION_REQUIRED";
                    case 7:
                        return "NETWORK_ERROR";
                    case 8:
                        return "INTERNAL_ERROR";
                    case 9:
                        return "SERVICE_INVALID";
                    case 10:
                        return "DEVELOPER_ERROR";
                    case 11:
                        return "LICENSE_CHECK_FAILED";
                    default:
                        switch (i) {
                            case 13:
                                return "CANCELED";
                            case 14:
                                return "TIMEOUT";
                            case 15:
                                return "INTERRUPTED";
                            case 16:
                                return "API_UNAVAILABLE";
                            case 17:
                                return "SIGN_IN_FAILED";
                            case 18:
                                return "SERVICE_UPDATING";
                            case 19:
                                return "SERVICE_MISSING_PERMISSION";
                            case 20:
                                return "RESTRICTED_PROFILE";
                            case 21:
                                return "API_VERSION_UPDATE_REQUIRED";
                            case 22:
                                return "RESOLUTION_ACTIVITY_NOT_FOUND";
                            case 23:
                                return "API_DISABLED";
                            case 24:
                                return "API_DISABLED_FOR_CONNECTION";
                            default:
                                StringBuilder sb = new StringBuilder(31);
                                sb.append("UNKNOWN_ERROR_CODE(");
                                sb.append(i);
                                sb.append(")");
                                return sb.toString();
                        }
                }
            }
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        return "UNFINISHED";
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof gf) {
            gf gfVar = (gf) obj;
            return this.Q == gfVar.Q && wa0.a(this.R, gfVar.R) && wa0.a(this.S, gfVar.S);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.Q), this.R, this.S});
    }

    public final String toString() {
        wa0.a aVar = new wa0.a(this);
        aVar.a("statusCode", c(this.Q));
        aVar.a("resolution", this.R);
        aVar.a("message", this.S);
        return aVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s = tv2.s(parcel, 20293);
        tv2.g(parcel, 1, this.P);
        tv2.g(parcel, 2, this.Q);
        tv2.i(parcel, 3, this.R, i);
        tv2.k(parcel, 4, this.S);
        tv2.A(parcel, s);
    }

    public gf(int i, PendingIntent pendingIntent) {
        this(1, i, pendingIntent, null);
    }
}