package com.google.android.gms.ads.internal.overlay;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.hw;

public final class AdOverlayInfoParcel extends f0 implements ReflectedParcelable {
    public static final Parcelable.Creator<AdOverlayInfoParcel> CREATOR = new fp5();
    public final tw2 P;
    public final vj1 Q;
    public final zp5 R;
    public final y03 S;
    public final ef2 T;
    public final String U;
    public final boolean V;
    public final String W;
    public final b16 X;
    public final int Y;
    public final int Z;
    public final String a0;
    public final xv2 b0;
    public final String c0;
    public final tl5 d0;
    public final cf2 e0;
    public final String f0;
    public final r04 g0;
    public final zr3 h0;
    public final wl4 i0;
    public final co2 j0;
    public final String k0;
    public final String l0;
    public final wd3 m0;
    public final oi3 n0;

    public AdOverlayInfoParcel(ju3 ju3Var, y03 y03Var, xv2 xv2Var) {
        this.R = ju3Var;
        this.S = y03Var;
        this.Y = 1;
        this.b0 = xv2Var;
        this.P = null;
        this.Q = null;
        this.e0 = null;
        this.T = null;
        this.U = null;
        this.V = false;
        this.W = null;
        this.X = null;
        this.Z = 1;
        this.a0 = null;
        this.c0 = null;
        this.d0 = null;
        this.f0 = null;
        this.k0 = null;
        this.g0 = null;
        this.h0 = null;
        this.i0 = null;
        this.j0 = null;
        this.l0 = null;
        this.m0 = null;
        this.n0 = null;
    }

    public AdOverlayInfoParcel(qj3 qj3Var, y03 y03Var, int i, xv2 xv2Var, String str, tl5 tl5Var, String str2, String str3, String str4, wd3 wd3Var) {
        this.P = null;
        this.Q = null;
        this.R = qj3Var;
        this.S = y03Var;
        this.e0 = null;
        this.T = null;
        this.V = false;
        if (((Boolean) w82.d.c.a(x92.v0)).booleanValue()) {
            this.U = null;
            this.W = null;
        } else {
            this.U = str2;
            this.W = str3;
        }
        this.X = null;
        this.Y = i;
        this.Z = 1;
        this.a0 = null;
        this.b0 = xv2Var;
        this.c0 = str;
        this.d0 = tl5Var;
        this.f0 = null;
        this.k0 = null;
        this.g0 = null;
        this.h0 = null;
        this.i0 = null;
        this.j0 = null;
        this.l0 = str4;
        this.m0 = wd3Var;
        this.n0 = null;
    }

    public AdOverlayInfoParcel(tw2 tw2Var, IBinder iBinder, IBinder iBinder2, IBinder iBinder3, IBinder iBinder4, String str, boolean z, String str2, IBinder iBinder5, int i, int i2, String str3, xv2 xv2Var, String str4, tl5 tl5Var, IBinder iBinder6, String str5, IBinder iBinder7, IBinder iBinder8, IBinder iBinder9, IBinder iBinder10, String str6, String str7, IBinder iBinder11, IBinder iBinder12) {
        this.P = tw2Var;
        this.Q = (vj1) va0.c0(hw.a.Z(iBinder));
        this.R = (zp5) va0.c0(hw.a.Z(iBinder2));
        this.S = (y03) va0.c0(hw.a.Z(iBinder3));
        this.e0 = (cf2) va0.c0(hw.a.Z(iBinder6));
        this.T = (ef2) va0.c0(hw.a.Z(iBinder4));
        this.U = str;
        this.V = z;
        this.W = str2;
        this.X = (b16) va0.c0(hw.a.Z(iBinder5));
        this.Y = i;
        this.Z = i2;
        this.a0 = str3;
        this.b0 = xv2Var;
        this.c0 = str4;
        this.d0 = tl5Var;
        this.f0 = str5;
        this.k0 = str6;
        this.g0 = (r04) va0.c0(hw.a.Z(iBinder7));
        this.h0 = (zr3) va0.c0(hw.a.Z(iBinder8));
        this.i0 = (wl4) va0.c0(hw.a.Z(iBinder9));
        this.j0 = (co2) va0.c0(hw.a.Z(iBinder10));
        this.l0 = str7;
        this.m0 = (wd3) va0.c0(hw.a.Z(iBinder11));
        this.n0 = (oi3) va0.c0(hw.a.Z(iBinder12));
    }

    public AdOverlayInfoParcel(tw2 tw2Var, vj1 vj1Var, zp5 zp5Var, b16 b16Var, xv2 xv2Var, y03 y03Var, oi3 oi3Var) {
        this.P = tw2Var;
        this.Q = vj1Var;
        this.R = zp5Var;
        this.S = y03Var;
        this.e0 = null;
        this.T = null;
        this.U = null;
        this.V = false;
        this.W = null;
        this.X = b16Var;
        this.Y = -1;
        this.Z = 4;
        this.a0 = null;
        this.b0 = xv2Var;
        this.c0 = null;
        this.d0 = null;
        this.f0 = null;
        this.k0 = null;
        this.g0 = null;
        this.h0 = null;
        this.i0 = null;
        this.j0 = null;
        this.l0 = null;
        this.m0 = null;
        this.n0 = oi3Var;
    }

    public AdOverlayInfoParcel(vj1 vj1Var, f13 f13Var, cf2 cf2Var, ef2 ef2Var, b16 b16Var, y03 y03Var, boolean z, int i, String str, String str2, xv2 xv2Var, oi3 oi3Var) {
        this.P = null;
        this.Q = vj1Var;
        this.R = f13Var;
        this.S = y03Var;
        this.e0 = cf2Var;
        this.T = ef2Var;
        this.U = str2;
        this.V = z;
        this.W = str;
        this.X = b16Var;
        this.Y = i;
        this.Z = 3;
        this.a0 = null;
        this.b0 = xv2Var;
        this.c0 = null;
        this.d0 = null;
        this.f0 = null;
        this.k0 = null;
        this.g0 = null;
        this.h0 = null;
        this.i0 = null;
        this.j0 = null;
        this.l0 = null;
        this.m0 = null;
        this.n0 = oi3Var;
    }

    public AdOverlayInfoParcel(vj1 vj1Var, f13 f13Var, cf2 cf2Var, ef2 ef2Var, b16 b16Var, y03 y03Var, boolean z, int i, String str, xv2 xv2Var, oi3 oi3Var) {
        this.P = null;
        this.Q = vj1Var;
        this.R = f13Var;
        this.S = y03Var;
        this.e0 = cf2Var;
        this.T = ef2Var;
        this.U = null;
        this.V = z;
        this.W = null;
        this.X = b16Var;
        this.Y = i;
        this.Z = 3;
        this.a0 = str;
        this.b0 = xv2Var;
        this.c0 = null;
        this.d0 = null;
        this.f0 = null;
        this.k0 = null;
        this.g0 = null;
        this.h0 = null;
        this.i0 = null;
        this.j0 = null;
        this.l0 = null;
        this.m0 = null;
        this.n0 = oi3Var;
    }

    public AdOverlayInfoParcel(vj1 vj1Var, zp5 zp5Var, b16 b16Var, y03 y03Var, boolean z, int i, xv2 xv2Var, oi3 oi3Var) {
        this.P = null;
        this.Q = vj1Var;
        this.R = zp5Var;
        this.S = y03Var;
        this.e0 = null;
        this.T = null;
        this.U = null;
        this.V = z;
        this.W = null;
        this.X = b16Var;
        this.Y = i;
        this.Z = 2;
        this.a0 = null;
        this.b0 = xv2Var;
        this.c0 = null;
        this.d0 = null;
        this.f0 = null;
        this.k0 = null;
        this.g0 = null;
        this.h0 = null;
        this.i0 = null;
        this.j0 = null;
        this.l0 = null;
        this.m0 = null;
        this.n0 = oi3Var;
    }

    public AdOverlayInfoParcel(y03 y03Var, xv2 xv2Var, co2 co2Var, r04 r04Var, zr3 zr3Var, wl4 wl4Var, String str, String str2) {
        this.P = null;
        this.Q = null;
        this.R = null;
        this.S = y03Var;
        this.e0 = null;
        this.T = null;
        this.U = null;
        this.V = false;
        this.W = null;
        this.X = null;
        this.Y = 14;
        this.Z = 5;
        this.a0 = null;
        this.b0 = xv2Var;
        this.c0 = null;
        this.d0 = null;
        this.f0 = str;
        this.k0 = str2;
        this.g0 = r04Var;
        this.h0 = zr3Var;
        this.i0 = wl4Var;
        this.j0 = co2Var;
        this.l0 = null;
        this.m0 = null;
        this.n0 = null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s = tv2.s(parcel, 20293);
        tv2.i(parcel, 2, this.P, i);
        tv2.f(parcel, 3, new va0(this.Q));
        tv2.f(parcel, 4, new va0(this.R));
        tv2.f(parcel, 5, new va0(this.S));
        tv2.f(parcel, 6, new va0(this.T));
        tv2.k(parcel, 7, this.U);
        tv2.a(parcel, 8, this.V);
        tv2.k(parcel, 9, this.W);
        tv2.f(parcel, 10, new va0(this.X));
        tv2.g(parcel, 11, this.Y);
        tv2.g(parcel, 12, this.Z);
        tv2.k(parcel, 13, this.a0);
        tv2.i(parcel, 14, this.b0, i);
        tv2.k(parcel, 16, this.c0);
        tv2.i(parcel, 17, this.d0, i);
        tv2.f(parcel, 18, new va0(this.e0));
        tv2.k(parcel, 19, this.f0);
        tv2.f(parcel, 20, new va0(this.g0));
        tv2.f(parcel, 21, new va0(this.h0));
        tv2.f(parcel, 22, new va0(this.i0));
        tv2.f(parcel, 23, new va0(this.j0));
        tv2.k(parcel, 24, this.k0);
        tv2.k(parcel, 25, this.l0);
        tv2.f(parcel, 26, new va0(this.m0));
        tv2.f(parcel, 27, new va0(this.n0));
        tv2.A(parcel, s);
    }
}