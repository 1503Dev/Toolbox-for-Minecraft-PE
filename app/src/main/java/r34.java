package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.view.View;
import defpackage.hw;
import java.util.ArrayList;
import java.util.concurrent.Executor;

/* renamed from: r34  reason: default package */
public final class r34 implements k14 {
    public final Context a;
    public final nk3 b;
    public final Executor c;

    public r34(Context context, nk3 nk3Var, Executor executor) {
        this.a = context;
        this.b = nk3Var;
        this.c = executor;
    }

    public static final boolean c(hi4 hi4Var, int i) {
        return ((li4) hi4Var.a.P).g.contains(Integer.toString(i));
    }

    /* JADX WARN: Removed duplicated region for block: B:90:0x0547  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x058b  */
    @Override // defpackage.k14
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(hi4 hi4Var, yh4 yh4Var, h14 h14Var) {
        ni4 ni4Var;
        pl2 pl2Var;
        ll2 ll2Var;
        ml2 ml2Var;
        ml3 ml3Var;
        uc2 t4;
        View view;
        String readString;
        ArrayList readArrayList;
        String readString2;
        Bundle bundle;
        String readString3;
        View view2;
        hw Z;
        String readString4;
        ad2 t42;
        nl3 nl3Var;
        ml2 ml2Var2;
        hi4 hi4Var2;
        ml3 ml3Var2;
        ml3 ml3Var3;
        uc2 t43;
        View view3;
        String readString5;
        ArrayList readArrayList2;
        String readString6;
        Bundle bundle2;
        String readString7;
        View view4;
        hw Z2;
        ml3 ml3Var4;
        mj4 mj4Var = (mj4) h14Var.b;
        mj4Var.getClass();
        try {
            ll2 L = mj4Var.a.L();
            mj4 mj4Var2 = (mj4) h14Var.b;
            mj4Var2.getClass();
            try {
                ml2 C = mj4Var2.a.C();
                mj4 mj4Var3 = (mj4) h14Var.b;
                mj4Var3.getClass();
                try {
                    pl2 l = mj4Var3.a.l();
                    nl3 nl3Var2 = null;
                    if (l != null && c(hi4Var, 6)) {
                        nl3Var2 = nl3.k(l);
                    } else if (L != null && c(hi4Var, 6)) {
                        try {
                            Parcel Z3 = L.Z(L.A(), 17);
                            cs3 t44 = mr3.t4(Z3.readStrongBinder());
                            Z3.recycle();
                            if (t44 == null) {
                                ml3Var4 = null;
                            } else {
                                ml3Var4 = new ml3(t44, null);
                            }
                            Parcel Z4 = L.Z(L.A(), 19);
                            uc2 t45 = tc2.t4(Z4.readStrongBinder());
                            Z4.recycle();
                            Parcel Z5 = L.Z(L.A(), 18);
                            hw Z6 = hw.a.Z(Z5.readStrongBinder());
                            Z5.recycle();
                            View view5 = (View) nl3.d(Z6);
                            Parcel Z7 = L.Z(L.A(), 2);
                            String readString8 = Z7.readString();
                            Z7.recycle();
                            Parcel Z8 = L.Z(L.A(), 3);
                            ArrayList readArrayList3 = Z8.readArrayList(k22.a);
                            Z8.recycle();
                            Parcel Z9 = L.Z(L.A(), 4);
                            String readString9 = Z9.readString();
                            Z9.recycle();
                            Parcel Z10 = L.Z(L.A(), 15);
                            Z10.recycle();
                            Parcel Z11 = L.Z(L.A(), 6);
                            String readString10 = Z11.readString();
                            Z11.recycle();
                            View view6 = (View) nl3.d(L.d3());
                            Parcel Z12 = L.Z(L.A(), 21);
                            hw Z13 = hw.a.Z(Z12.readStrongBinder());
                            Z12.recycle();
                            Parcel Z14 = L.Z(L.A(), 8);
                            String readString11 = Z14.readString();
                            Z14.recycle();
                            Parcel Z15 = L.Z(L.A(), 9);
                            String readString12 = Z15.readString();
                            Z15.recycle();
                            Parcel Z16 = L.Z(L.A(), 7);
                            double readDouble = Z16.readDouble();
                            Z16.recycle();
                            Parcel Z17 = L.Z(L.A(), 5);
                            ad2 t46 = lc2.t4(Z17.readStrongBinder());
                            Z17.recycle();
                            nl3Var2 = nl3.c(ml3Var4, t45, view5, readString8, readArrayList3, readString9, (Bundle) k22.a(Z10, Bundle.CREATOR), readString10, view6, Z13, readString11, readString12, readDouble, t46, null, 0.0f);
                        } catch (RemoteException e) {
                            sv2.h("Failed to get native ad assets from app install ad mapper", e);
                        }
                    } else {
                        if (L != null && c(hi4Var, 2)) {
                            try {
                                Parcel Z18 = L.Z(L.A(), 17);
                                cs3 t47 = mr3.t4(Z18.readStrongBinder());
                                Z18.recycle();
                                if (t47 == null) {
                                    ml3Var3 = null;
                                } else {
                                    ml3Var3 = new ml3(t47, null);
                                }
                                Parcel Z19 = L.Z(L.A(), 19);
                                t43 = tc2.t4(Z19.readStrongBinder());
                                Z19.recycle();
                                Parcel Z20 = L.Z(L.A(), 18);
                                hw Z21 = hw.a.Z(Z20.readStrongBinder());
                                Z20.recycle();
                                view3 = (View) nl3.d(Z21);
                                Parcel Z22 = L.Z(L.A(), 2);
                                readString5 = Z22.readString();
                                Z22.recycle();
                                Parcel Z23 = L.Z(L.A(), 3);
                                readArrayList2 = Z23.readArrayList(k22.a);
                                Z23.recycle();
                                Parcel Z24 = L.Z(L.A(), 4);
                                readString6 = Z24.readString();
                                Z24.recycle();
                                pl2Var = l;
                                try {
                                    Parcel Z25 = L.Z(L.A(), 15);
                                    bundle2 = (Bundle) k22.a(Z25, Bundle.CREATOR);
                                    Z25.recycle();
                                    Parcel Z26 = L.Z(L.A(), 6);
                                    readString7 = Z26.readString();
                                    Z26.recycle();
                                    view4 = (View) nl3.d(L.d3());
                                    Parcel Z27 = L.Z(L.A(), 21);
                                    Z2 = hw.a.Z(Z27.readStrongBinder());
                                    Z27.recycle();
                                    ml2Var = C;
                                } catch (RemoteException e2) {
                                    e = e2;
                                    ml2Var = C;
                                }
                            } catch (RemoteException e3) {
                                e = e3;
                                ml2Var = C;
                                pl2Var = l;
                            }
                            try {
                                Parcel Z28 = L.Z(L.A(), 8);
                                String readString13 = Z28.readString();
                                Z28.recycle();
                                Parcel Z29 = L.Z(L.A(), 9);
                                String readString14 = Z29.readString();
                                Z29.recycle();
                                Parcel Z30 = L.Z(L.A(), 7);
                                double readDouble2 = Z30.readDouble();
                                Z30.recycle();
                                Parcel Z31 = L.Z(L.A(), 5);
                                ad2 t48 = lc2.t4(Z31.readStrongBinder());
                                Z31.recycle();
                                nl3 nl3Var3 = new nl3();
                                nl3Var3.a = 2;
                                nl3Var3.b = ml3Var3;
                                nl3Var3.c = t43;
                                nl3Var3.d = view3;
                                nl3Var3.b("headline", readString5);
                                nl3Var3.e = readArrayList2;
                                nl3Var3.b("body", readString6);
                                nl3Var3.h = bundle2;
                                nl3Var3.b("call_to_action", readString7);
                                nl3Var3.m = view4;
                                nl3Var3.p = Z2;
                                nl3Var3.b("store", readString13);
                                nl3Var3.b("price", readString14);
                                nl3Var3.q = readDouble2;
                                nl3Var3.r = t48;
                                nl3Var2 = nl3Var3;
                                ll2Var = L;
                            } catch (RemoteException e4) {
                                e = e4;
                                sv2.h("Failed to get native ad from app install ad mapper", e);
                                ll2Var = L;
                                nl3Var2 = null;
                                hi4Var2 = hi4Var;
                                if (!((li4) hi4Var2.a.P).g.contains(Integer.toString(nl3Var2.e()))) {
                                }
                            }
                            hi4Var2 = hi4Var;
                        } else {
                            pl2Var = l;
                            if (C != null && c(hi4Var, 6)) {
                                try {
                                    Parcel A = C.A();
                                    ml2Var2 = C;
                                    try {
                                        Parcel Z32 = ml2Var2.Z(A, 16);
                                        cs3 t49 = mr3.t4(Z32.readStrongBinder());
                                        Z32.recycle();
                                        if (t49 == null) {
                                            ml3Var2 = null;
                                        } else {
                                            ml3Var2 = new ml3(t49, null);
                                        }
                                        Parcel Z33 = ml2Var2.Z(ml2Var2.A(), 19);
                                        uc2 t410 = tc2.t4(Z33.readStrongBinder());
                                        Z33.recycle();
                                        Parcel Z34 = ml2Var2.Z(ml2Var2.A(), 15);
                                        hw Z35 = hw.a.Z(Z34.readStrongBinder());
                                        Z34.recycle();
                                        View view7 = (View) nl3.d(Z35);
                                        Parcel Z36 = ml2Var2.Z(ml2Var2.A(), 2);
                                        String readString15 = Z36.readString();
                                        Z36.recycle();
                                        Parcel Z37 = ml2Var2.Z(ml2Var2.A(), 3);
                                        ArrayList readArrayList4 = Z37.readArrayList(k22.a);
                                        Z37.recycle();
                                        Parcel Z38 = ml2Var2.Z(ml2Var2.A(), 4);
                                        String readString16 = Z38.readString();
                                        Z38.recycle();
                                        Parcel Z39 = ml2Var2.Z(ml2Var2.A(), 13);
                                        Bundle bundle3 = (Bundle) k22.a(Z39, Bundle.CREATOR);
                                        Z39.recycle();
                                        Parcel Z40 = ml2Var2.Z(ml2Var2.A(), 6);
                                        String readString17 = Z40.readString();
                                        Z40.recycle();
                                        View view8 = (View) nl3.d(ml2Var2.d3());
                                        Parcel Z41 = ml2Var2.Z(ml2Var2.A(), 21);
                                        hw Z42 = hw.a.Z(Z41.readStrongBinder());
                                        Z41.recycle();
                                        Parcel Z43 = ml2Var2.Z(ml2Var2.A(), 5);
                                        ad2 t411 = lc2.t4(Z43.readStrongBinder());
                                        Z43.recycle();
                                        Parcel Z44 = ml2Var2.Z(ml2Var2.A(), 7);
                                        String readString18 = Z44.readString();
                                        Z44.recycle();
                                        nl3Var2 = nl3.c(ml3Var2, t410, view7, readString15, readArrayList4, readString16, bundle3, readString17, view8, Z42, null, null, -1.0d, t411, readString18, 0.0f);
                                        hi4Var2 = hi4Var;
                                        ll2Var = L;
                                        ml2Var = ml2Var2;
                                    } catch (RemoteException e5) {
                                        e = e5;
                                        sv2.h("Failed to get native ad assets from content ad mapper", e);
                                        hi4Var2 = hi4Var;
                                        ll2Var = L;
                                        ml2Var = ml2Var2;
                                        nl3Var2 = null;
                                        if (!((li4) hi4Var2.a.P).g.contains(Integer.toString(nl3Var2.e()))) {
                                        }
                                    }
                                } catch (RemoteException e6) {
                                    e = e6;
                                    ml2Var2 = C;
                                }
                            } else if (C != null && c(hi4Var, 1)) {
                                try {
                                    Parcel Z45 = C.Z(C.A(), 16);
                                    cs3 t412 = mr3.t4(Z45.readStrongBinder());
                                    Z45.recycle();
                                    if (t412 == null) {
                                        ml3Var = null;
                                    } else {
                                        ml3Var = new ml3(t412, null);
                                    }
                                    Parcel Z46 = C.Z(C.A(), 19);
                                    t4 = tc2.t4(Z46.readStrongBinder());
                                    Z46.recycle();
                                    Parcel Z47 = C.Z(C.A(), 15);
                                    hw Z48 = hw.a.Z(Z47.readStrongBinder());
                                    Z47.recycle();
                                    view = (View) nl3.d(Z48);
                                    Parcel Z49 = C.Z(C.A(), 2);
                                    readString = Z49.readString();
                                    Z49.recycle();
                                    Parcel Z50 = C.Z(C.A(), 3);
                                    readArrayList = Z50.readArrayList(k22.a);
                                    Z50.recycle();
                                    Parcel Z51 = C.Z(C.A(), 4);
                                    readString2 = Z51.readString();
                                    Z51.recycle();
                                    Parcel Z52 = C.Z(C.A(), 13);
                                    bundle = (Bundle) k22.a(Z52, Bundle.CREATOR);
                                    Z52.recycle();
                                    Parcel Z53 = C.Z(C.A(), 6);
                                    readString3 = Z53.readString();
                                    Z53.recycle();
                                    view2 = (View) nl3.d(C.d3());
                                    ll2Var = L;
                                    try {
                                        Parcel Z54 = C.Z(C.A(), 21);
                                        Z = hw.a.Z(Z54.readStrongBinder());
                                        Z54.recycle();
                                        Parcel Z55 = C.Z(C.A(), 7);
                                        readString4 = Z55.readString();
                                        Z55.recycle();
                                        Parcel Z56 = C.Z(C.A(), 5);
                                        t42 = lc2.t4(Z56.readStrongBinder());
                                        Z56.recycle();
                                        nl3Var = new nl3();
                                        ml2Var = C;
                                    } catch (RemoteException e7) {
                                        e = e7;
                                        ml2Var = C;
                                        sv2.h("Failed to get native ad from content ad mapper", e);
                                        nl3Var2 = null;
                                        hi4Var2 = hi4Var;
                                        if (!((li4) hi4Var2.a.P).g.contains(Integer.toString(nl3Var2.e()))) {
                                        }
                                    }
                                } catch (RemoteException e8) {
                                    e = e8;
                                    ll2Var = L;
                                }
                                try {
                                    nl3Var.a = 1;
                                    nl3Var.b = ml3Var;
                                    nl3Var.c = t4;
                                    nl3Var.d = view;
                                    nl3Var.b("headline", readString);
                                    nl3Var.e = readArrayList;
                                    nl3Var.b("body", readString2);
                                    nl3Var.h = bundle;
                                    nl3Var.b("call_to_action", readString3);
                                    nl3Var.m = view2;
                                    nl3Var.p = Z;
                                    nl3Var.b("advertiser", readString4);
                                    nl3Var.s = t42;
                                    nl3Var2 = nl3Var;
                                } catch (RemoteException e9) {
                                    e = e9;
                                    sv2.h("Failed to get native ad from content ad mapper", e);
                                    nl3Var2 = null;
                                    hi4Var2 = hi4Var;
                                    if (!((li4) hi4Var2.a.P).g.contains(Integer.toString(nl3Var2.e()))) {
                                    }
                                }
                                hi4Var2 = hi4Var;
                            } else {
                                throw new l44(1, "No native ad mappers");
                            }
                        }
                        if (!((li4) hi4Var2.a.P).g.contains(Integer.toString(nl3Var2.e()))) {
                            z43 d = this.b.d(new ts1(hi4Var2, yh4Var, h14Var.a), new z63(1, nl3Var2), new cn3(ml2Var, ll2Var, pl2Var));
                            ((w24) h14Var.c).u4(d.t());
                            d.r().Q0(new u63((mj4) h14Var.b), this.c);
                            return d.q();
                        }
                        throw new l44(1, "No corresponding native ad listener");
                    }
                    hi4Var2 = hi4Var;
                    ll2Var = L;
                    ml2Var = C;
                    pl2Var = l;
                    if (!((li4) hi4Var2.a.P).g.contains(Integer.toString(nl3Var2.e()))) {
                    }
                } finally {
                }
            } finally {
            }
        } finally {
        }
    }

    @Override // defpackage.k14
    public final void b(hi4 hi4Var, yh4 yh4Var, h14 h14Var) {
        mj4 mj4Var = (mj4) h14Var.b;
        Context context = this.a;
        pn5 pn5Var = ((li4) hi4Var.a.P).d;
        String jSONObject = yh4Var.v.toString();
        String j = mq2.j(yh4Var.s);
        cl2 cl2Var = (cl2) h14Var.c;
        li4 li4Var = (li4) hi4Var.a.P;
        nc2 nc2Var = li4Var.i;
        ArrayList arrayList = li4Var.g;
        mj4Var.getClass();
        try {
            mj4Var.a.u2(new va0(context), pn5Var, jSONObject, j, cl2Var, nc2Var, arrayList);
        } catch (Throwable th) {
            throw new ni4(th);
        }
    }
}