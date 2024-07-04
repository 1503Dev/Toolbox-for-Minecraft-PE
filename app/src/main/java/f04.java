package defpackage;

import android.content.Context;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import android.util.SparseArray;

/* renamed from: f04  reason: default package */
public final class f04 extends s33 {
    public static final SparseArray W;
    public final Context R;
    public final tc3 S;
    public final TelephonyManager T;
    public final hz3 U;
    public int V;

    static {
        SparseArray sparseArray = new SparseArray();
        W = sparseArray;
        sparseArray.put(NetworkInfo.DetailedState.CONNECTED.ordinal(), m72.S);
        int ordinal = NetworkInfo.DetailedState.AUTHENTICATING.ordinal();
        m72 m72Var = m72.R;
        sparseArray.put(ordinal, m72Var);
        sparseArray.put(NetworkInfo.DetailedState.CONNECTING.ordinal(), m72Var);
        sparseArray.put(NetworkInfo.DetailedState.OBTAINING_IPADDR.ordinal(), m72Var);
        sparseArray.put(NetworkInfo.DetailedState.DISCONNECTING.ordinal(), m72.T);
        int ordinal2 = NetworkInfo.DetailedState.BLOCKED.ordinal();
        m72 m72Var2 = m72.U;
        sparseArray.put(ordinal2, m72Var2);
        sparseArray.put(NetworkInfo.DetailedState.DISCONNECTED.ordinal(), m72Var2);
        sparseArray.put(NetworkInfo.DetailedState.FAILED.ordinal(), m72Var2);
        sparseArray.put(NetworkInfo.DetailedState.IDLE.ordinal(), m72Var2);
        sparseArray.put(NetworkInfo.DetailedState.SCANNING.ordinal(), m72Var2);
        sparseArray.put(NetworkInfo.DetailedState.SUSPENDED.ordinal(), m72.V);
        sparseArray.put(NetworkInfo.DetailedState.CAPTIVE_PORTAL_CHECK.ordinal(), m72Var);
        sparseArray.put(NetworkInfo.DetailedState.VERIFYING_POOR_LINK.ordinal(), m72Var);
    }

    public f04(Context context, tc3 tc3Var, hz3 hz3Var, ez3 ez3Var, nl5 nl5Var) {
        super(ez3Var, nl5Var);
        this.R = context;
        this.S = tc3Var;
        this.U = hz3Var;
        this.T = (TelephonyManager) context.getSystemService("phone");
    }
}