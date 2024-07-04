package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.wa0;
import java.util.Arrays;

public final class Status extends f0 implements tl0, ReflectedParcelable {
    public static final Parcelable.Creator<Status> CREATOR;
    public static final Status U = new Status(0, null);
    public static final Status V;
    public final int P;
    public final int Q;
    public final String R;
    public final PendingIntent S;
    public final gf T;

    static {
        new Status(14, null);
        new Status(8, null);
        new Status(15, null);
        V = new Status(16, null);
        new Status(17, null);
        new Status(18, null);
        CREATOR = new g82();
    }

    public Status() {
        throw null;
    }

    public Status(int i, int i2, String str, PendingIntent pendingIntent, gf gfVar) {
        this.P = i;
        this.Q = i2;
        this.R = str;
        this.S = pendingIntent;
        this.T = gfVar;
    }

    public Status(int i, String str) {
        this(1, i, str, null, null);
    }

    @Override // defpackage.tl0
    public final Status a() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Status) {
            Status status = (Status) obj;
            return this.P == status.P && this.Q == status.Q && wa0.a(this.R, status.R) && wa0.a(this.S, status.S) && wa0.a(this.T, status.T);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.P), Integer.valueOf(this.Q), this.R, this.S, this.T});
    }

    public final String toString() {
        wa0.a aVar = new wa0.a(this);
        String str = this.R;
        if (str == null) {
            int i = this.Q;
            switch (i) {
                case -1:
                    str = "SUCCESS_CACHE";
                    break;
                case 0:
                    str = "SUCCESS";
                    break;
                case 1:
                case 9:
                case 11:
                case 12:
                default:
                    StringBuilder sb = new StringBuilder(32);
                    sb.append("unknown status code: ");
                    sb.append(i);
                    str = sb.toString();
                    break;
                case 2:
                    str = "SERVICE_VERSION_UPDATE_REQUIRED";
                    break;
                case 3:
                    str = "SERVICE_DISABLED";
                    break;
                case 4:
                    str = "SIGN_IN_REQUIRED";
                    break;
                case 5:
                    str = "INVALID_ACCOUNT";
                    break;
                case 6:
                    str = "RESOLUTION_REQUIRED";
                    break;
                case 7:
                    str = "NETWORK_ERROR";
                    break;
                case 8:
                    str = "INTERNAL_ERROR";
                    break;
                case 10:
                    str = "DEVELOPER_ERROR";
                    break;
                case 13:
                    str = "ERROR";
                    break;
                case 14:
                    str = "INTERRUPTED";
                    break;
                case 15:
                    str = "TIMEOUT";
                    break;
                case 16:
                    str = "CANCELED";
                    break;
                case 17:
                    str = "API_NOT_CONNECTED";
                    break;
                case 18:
                    str = "DEAD_CLIENT";
                    break;
                case 19:
                    str = "REMOTE_EXCEPTION";
                    break;
                case 20:
                    str = "CONNECTION_SUSPENDED_DURING_CALL";
                    break;
                case 21:
                    str = "RECONNECTION_TIMED_OUT_DURING_UPDATE";
                    break;
                case 22:
                    str = "RECONNECTION_TIMED_OUT";
                    break;
            }
        }
        aVar.a("statusCode", str);
        aVar.a("resolution", this.S);
        return aVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s = tv2.s(parcel, 20293);
        tv2.g(parcel, 1, this.Q);
        tv2.k(parcel, 2, this.R);
        tv2.i(parcel, 3, this.S, i);
        tv2.i(parcel, 4, this.T, i);
        tv2.g(parcel, 1000, this.P);
        tv2.A(parcel, s);
    }
}