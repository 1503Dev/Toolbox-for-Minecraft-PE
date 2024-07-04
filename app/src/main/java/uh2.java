package defpackage;

import android.content.Context;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.os.SystemClock;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* renamed from: uh2  reason: default package */
public final class uh2 implements vu1 {
    public volatile ih2 a;
    public final Context b;

    public uh2(Context context) {
        this.b = context;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0123 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0124  */
    @Override // defpackage.vu1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final yu1 a(gv1 gv1Var) {
        jn0 jn0Var;
        lh2 lh2Var;
        Map f = gv1Var.f();
        int size = f.size();
        String[] strArr = new String[size];
        String[] strArr2 = new String[size];
        int i = 0;
        int i2 = 0;
        for (Map.Entry entry : f.entrySet()) {
            strArr[i2] = (String) entry.getKey();
            strArr2[i2] = (String) entry.getValue();
            i2++;
        }
        jh2 jh2Var = new jh2(gv1Var.R, strArr, strArr2);
        jv5 jv5Var = jv5.A;
        jv5Var.j.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        try {
            bx2 bx2Var = new bx2();
            this.a = new ih2(this.b, jv5Var.r.a(), new sh2(this, bx2Var), new th2(bx2Var));
            this.a.n();
            qh2 qh2Var = new qh2(jh2Var);
            yw2 yw2Var = zw2.a;
            dz4 G = zw4.G(zw4.F(bx2Var, qh2Var, yw2Var), ((Integer) w82.d.c.a(x92.G3)).intValue(), TimeUnit.MILLISECONDS, zw2.d);
            G.b(new rh2(0, this), yw2Var);
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) G.get();
            jv5Var.j.getClass();
            vz3.k("Http assets remote cache took " + (SystemClock.elapsedRealtime() - elapsedRealtime) + "ms");
            lq2 lq2Var = new lq2(parcelFileDescriptor);
            Parcelable.Creator<lh2> creator = lh2.CREATOR;
            if (lq2Var.R) {
                if (lq2Var.P == null) {
                    sv2.d("File descriptor is empty, returning null.");
                } else {
                    DataInputStream dataInputStream = new DataInputStream(new ParcelFileDescriptor.AutoCloseInputStream(lq2Var.P));
                    try {
                        try {
                            int readInt = dataInputStream.readInt();
                            byte[] bArr = new byte[readInt];
                            dataInputStream.readFully(bArr, 0, readInt);
                            gw.j(dataInputStream);
                            Parcel obtain = Parcel.obtain();
                            try {
                                obtain.unmarshall(bArr, 0, readInt);
                                obtain.setDataPosition(0);
                                lq2Var.Q = creator.createFromParcel(obtain);
                                obtain.recycle();
                                lq2Var.R = false;
                            } catch (Throwable th) {
                                obtain.recycle();
                                throw th;
                            }
                        } catch (IOException e) {
                            sv2.e("Could not read from parcel file descriptor", e);
                            gw.j(dataInputStream);
                        }
                    } catch (Throwable th2) {
                        gw.j(dataInputStream);
                        throw th2;
                    }
                }
                jn0Var = null;
                lh2Var = (lh2) jn0Var;
                if (lh2Var != null) {
                    return null;
                }
                if (!lh2Var.P) {
                    if (lh2Var.T.length != lh2Var.U.length) {
                        return null;
                    }
                    HashMap hashMap = new HashMap();
                    while (true) {
                        String[] strArr3 = lh2Var.T;
                        if (i < strArr3.length) {
                            hashMap.put(strArr3[i], lh2Var.U[i]);
                            i++;
                        } else {
                            return new yu1(lh2Var.R, lh2Var.S, hashMap, yu1.a(hashMap), lh2Var.V);
                        }
                    }
                } else {
                    throw new ov1(lh2Var.Q);
                }
            }
            jn0Var = (jn0) lq2Var.Q;
            lh2Var = (lh2) jn0Var;
            if (lh2Var != null) {
            }
        } catch (InterruptedException | ExecutionException unused) {
            jv5.A.j.getClass();
            vz3.k("Http assets remote cache took " + (SystemClock.elapsedRealtime() - elapsedRealtime) + "ms");
            return null;
        } catch (Throwable th3) {
            jv5.A.j.getClass();
            vz3.k("Http assets remote cache took " + (SystemClock.elapsedRealtime() - elapsedRealtime) + "ms");
            throw th3;
        }
    }
}