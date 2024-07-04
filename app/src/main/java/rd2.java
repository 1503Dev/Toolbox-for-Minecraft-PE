package defpackage;

import android.os.IInterface;
import android.os.Parcel;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.Arrays;
import java.util.List;

/* renamed from: rd2  reason: default package */
public abstract class rd2 extends j22 implements sd2 {
    public rd2() {
        super("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x00d9, code lost:
        if (r8.m.c() == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00ea, code lost:
        if (r7.Q.j() != null) goto L64;
     */
    @Override // defpackage.j22
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean s4(int i, Parcel parcel, Parcel parcel2) {
        os0 os0Var;
        String str;
        os0 os0Var2;
        IInterface iInterface;
        os0 os0Var3;
        os0 os0Var4;
        jl3 jl3Var;
        String str2;
        String str3;
        int i2;
        cm3 cm3Var;
        y03 y03Var;
        r0 = 0;
        r0 = 0;
        boolean z = 0;
        r0 = 0;
        r0 = 0;
        r0 = 0;
        int i3 = 0;
        switch (i) {
            case 1:
                String readString = parcel.readString();
                k22.b(parcel);
                nl3 nl3Var = ((ap3) this).Q;
                synchronized (nl3Var) {
                    os0Var = nl3Var.v;
                }
                str = (String) os0Var.getOrDefault(readString, null);
                parcel2.writeNoException();
                parcel2.writeString(str);
                break;
            case 2:
                String readString2 = parcel.readString();
                k22.b(parcel);
                nl3 nl3Var2 = ((ap3) this).Q;
                synchronized (nl3Var2) {
                    os0Var2 = nl3Var2.u;
                }
                iInterface = (ad2) os0Var2.getOrDefault(readString2, null);
                parcel2.writeNoException();
                k22.e(parcel2, iInterface);
                break;
            case 3:
                ap3 ap3Var = (ap3) this;
                nl3 nl3Var3 = ap3Var.Q;
                synchronized (nl3Var3) {
                    os0Var3 = nl3Var3.u;
                }
                nl3 nl3Var4 = ap3Var.Q;
                synchronized (nl3Var4) {
                    os0Var4 = nl3Var4.v;
                }
                String[] strArr = new String[os0Var3.R + os0Var4.R];
                int i4 = 0;
                for (int i5 = 0; i5 < os0Var3.R; i5++) {
                    strArr[i4] = (String) os0Var3.h(i5);
                    i4++;
                }
                for (int i6 = 0; i6 < os0Var4.R; i6++) {
                    strArr[i4] = (String) os0Var4.h(i6);
                    i4++;
                }
                List<String> asList = Arrays.asList(strArr);
                parcel2.writeNoException();
                parcel2.writeStringList(asList);
                break;
            case 4:
                str = ((ap3) this).g();
                parcel2.writeNoException();
                parcel2.writeString(str);
                break;
            case 5:
                String readString3 = parcel.readString();
                k22.b(parcel);
                jl3 jl3Var2 = ((ap3) this).S;
                if (jl3Var2 != null) {
                    synchronized (jl3Var2) {
                        jl3Var2.k.I(readString3);
                    }
                }
                parcel2.writeNoException();
                break;
            case 6:
                jl3 jl3Var3 = ((ap3) this).S;
                if (jl3Var3 != null) {
                    synchronized (jl3Var3) {
                        if (!jl3Var3.v) {
                            jl3Var3.k.w();
                        }
                    }
                }
                parcel2.writeNoException();
                break;
            case 7:
                iInterface = ((ap3) this).Q.g();
                parcel2.writeNoException();
                k22.e(parcel2, iInterface);
                break;
            case 8:
                ap3 ap3Var2 = (ap3) this;
                jl3 jl3Var4 = ap3Var2.S;
                if (jl3Var4 != null) {
                    jl3Var4.q();
                }
                ap3Var2.S = null;
                ap3Var2.R = null;
                parcel2.writeNoException();
                break;
            case 9:
                iInterface = ((ap3) this).f();
                parcel2.writeNoException();
                k22.e(parcel2, iInterface);
                break;
            case 10:
                z = ((ap3) this).m0(uv0.b(parcel, parcel));
                parcel2.writeNoException();
                i2 = z;
                parcel2.writeInt(i2);
                break;
            case 11:
                parcel2.writeNoException();
                k22.e(parcel2, null);
                break;
            case 12:
                ap3 ap3Var3 = (ap3) this;
                jl3 jl3Var5 = ap3Var3.S;
                if (jl3Var5 != null) {
                    break;
                }
                if (ap3Var3.Q.i() != null) {
                    break;
                }
                parcel2.writeNoException();
                ClassLoader classLoader = k22.a;
                i2 = i3;
                parcel2.writeInt(i2);
                break;
            case 13:
                ap3 ap3Var4 = (ap3) this;
                hw l = ap3Var4.Q.l();
                if (l != null) {
                    jv5.A.v.c(l);
                    if (ap3Var4.Q.i() != null) {
                        ap3Var4.Q.i().a("onSdkLoaded", new e7());
                    }
                    i3 = 1;
                    parcel2.writeNoException();
                    ClassLoader classLoader2 = k22.a;
                    i2 = i3;
                    parcel2.writeInt(i2);
                    break;
                } else {
                    sv2.g("Trying to start OMID session before creation.");
                    parcel2.writeNoException();
                    ClassLoader classLoader22 = k22.a;
                    i2 = i3;
                    parcel2.writeInt(i2);
                }
            case 14:
                hw b = uv0.b(parcel, parcel);
                ap3 ap3Var5 = (ap3) this;
                Object c0 = va0.c0(b);
                if ((c0 instanceof View) && ap3Var5.Q.l() != null && (jl3Var = ap3Var5.S) != null) {
                    jl3Var.e((View) c0);
                }
                parcel2.writeNoException();
                break;
            case 15:
                ap3 ap3Var6 = (ap3) this;
                nl3 nl3Var5 = ap3Var6.Q;
                synchronized (nl3Var5) {
                    str2 = nl3Var5.x;
                }
                if ("Google".equals(str2)) {
                    str3 = "Illegal argument specified for omid partner name.";
                } else if (TextUtils.isEmpty(str2)) {
                    str3 = "Not starting OMID session. OM partner name has not been configured.";
                } else {
                    jl3 jl3Var6 = ap3Var6.S;
                    if (jl3Var6 != null) {
                        jl3Var6.s(str2, false);
                    }
                    parcel2.writeNoException();
                    break;
                }
                sv2.g(str3);
                parcel2.writeNoException();
            case 16:
                ll3 ll3Var = ((ap3) this).S.B;
                synchronized (ll3Var) {
                    iInterface = ll3Var.a;
                }
                parcel2.writeNoException();
                k22.e(parcel2, iInterface);
                break;
            case 17:
                hw b2 = uv0.b(parcel, parcel);
                ap3 ap3Var7 = (ap3) this;
                Object c02 = va0.c0(b2);
                if ((c02 instanceof ViewGroup) && (cm3Var = ap3Var7.R) != null && cm3Var.c((ViewGroup) c02, false)) {
                    nl3 nl3Var6 = ap3Var7.Q;
                    synchronized (nl3Var6) {
                        y03Var = nl3Var6.j;
                    }
                    y03Var.F(new wq1(ap3Var7));
                    z = 1;
                }
                parcel2.writeNoException();
                i2 = z;
                parcel2.writeInt(i2);
                break;
            default:
                return false;
        }
        return true;
    }
}