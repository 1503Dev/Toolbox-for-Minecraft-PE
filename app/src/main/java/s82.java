package defpackage;

import java.util.Vector;
import java.util.WeakHashMap;
import org.json.JSONObject;

/* renamed from: s82  reason: default package */
public final /* synthetic */ class s82 implements bz1, ex2, nw3, aa3, e74, kg4, bc0, v64 {
    public final /* synthetic */ int P;
    public final Object Q;

    public s82(int i) {
        this.P = i;
        if (i != 12) {
            this.Q = new WeakHashMap();
        } else {
            this.Q = new Vector();
        }
    }

    @Override // defpackage.aa3, defpackage.qt4
    public final cs3 a() {
        mj4 mj4Var = (mj4) this.Q;
        mj4Var.getClass();
        try {
            return mj4Var.a.f();
        } catch (Throwable th) {
            throw new ni4(th);
        }
    }

    @Override // defpackage.e74
    /* renamed from: a */
    public final void mo1a() {
        synchronized (((qf4) this.Q)) {
            ((qf4) this.Q).Y = null;
        }
    }

    @Override // defpackage.bz1
    public final void b(byte[] bArr, byte[] bArr2) {
        fz1 fz1Var = (fz1) this.Q;
        int i = fz1Var.W;
        int i2 = (fz1Var.g2 ^ i) ^ fz1Var.E;
        fz1Var.E = i2;
        int i3 = fz1Var.U;
        int i4 = i2 & i3;
        int i5 = i3 ^ (-1);
        int i6 = fz1Var.S0;
        int i7 = fz1Var.l1;
        int i8 = i6 & i7;
        int i9 = fz1Var.E1;
        int i10 = ((i8 & i9) ^ fz1Var.Y0) & (fz1Var.j ^ (-1));
        int i11 = fz1Var.l0;
        int i12 = (i ^ ((i10 ^ fz1Var.m1) | i11)) ^ fz1Var.A;
        fz1Var.A = i12;
        int i13 = fz1Var.e;
        int i14 = i12 & i13;
        int i15 = i12 ^ i13;
        int i16 = fz1Var.I;
        int i17 = i16 | i15;
        int i18 = i13 | i12;
        int i19 = i12 & (i13 ^ (-1));
        int i20 = i13 | i19;
        int i21 = i13 & (i12 ^ (-1));
        int i22 = i16 | i21;
        int i23 = i13 & (i21 ^ (-1));
        int i24 = i16 | i23;
        int i25 = ((fz1Var.Q1 ^ i8) ^ fz1Var.S1) ^ fz1Var.c1;
        int i26 = fz1Var.L0;
        int i27 = fz1Var.l ^ (i8 & (i26 ^ (-1)));
        int i28 = (((fz1Var.b2 ^ ((i27 ^ (-1)) & i9)) ^ fz1Var.T0) ^ fz1Var.m0) ^ fz1Var.m;
        fz1Var.m = i28;
        int i29 = (i25 ^ ((i27 ^ fz1Var.V1) | i11)) ^ fz1Var.O;
        fz1Var.O = i29;
        int i30 = fz1Var.F1;
        int i31 = i30 & i29;
        int i32 = i29 ^ (-1);
        int i33 = i30 & i32;
        int i34 = (fz1Var.v0 ^ fz1Var.X1) ^ fz1Var.B;
        int i35 = fz1Var.g;
        int i36 = fz1Var.S;
        int i37 = (i35 | i36) ^ i36;
        int i38 = (fz1Var.K0 ^ i37) ^ fz1Var.W1;
        int i39 = fz1Var.K;
        int i40 = (i34 ^ (i38 & (i39 ^ (-1)))) ^ fz1Var.x;
        int i41 = fz1Var.k1;
        int i42 = fz1Var.F;
        int i43 = (i40 & i41) ^ i42;
        int i44 = fz1Var.j0;
        int i45 = i40 & i44;
        int i46 = fz1Var.h;
        int i47 = i46 ^ (-1);
        int i48 = fz1Var.Z0;
        int i49 = fz1Var.p;
        int i50 = i40 & i48;
        int i51 = fz1Var.i2;
        int i52 = fz1Var.f1;
        int i53 = (i52 ^ (i40 & i52)) ^ i46;
        int i54 = i40 & (i48 ^ (-1));
        int i55 = fz1Var.u0;
        int i56 = ((i55 ^ i54) ^ i46) ^ fz1Var.J1;
        int i57 = ((i44 ^ (-1)) & i40) ^ i51;
        int i58 = (((fz1Var.C ^ (i40 & (i55 ^ (-1)))) & i46) ^ i41) ^ fz1Var.H1;
        int i59 = fz1Var.N;
        int i60 = i58 | i59;
        int i61 = fz1Var.D0 ^ ((i51 ^ i50) ^ ((i55 ^ i45) & i47));
        int i62 = i59 ^ (-1);
        int i63 = ((i61 & i62) ^ i56) ^ fz1Var.s1;
        fz1Var.s1 = i63;
        int i64 = fz1Var.e0;
        int i65 = i63 ^ (-1);
        int i66 = i64 & i65;
        int i67 = fz1Var.e1;
        int i68 = i67 & i65;
        int i69 = i64 & i68;
        int i70 = fz1Var.s;
        int i71 = i70 & i65;
        int i72 = i67 ^ (-1);
        int i73 = i63 & i72;
        int i74 = i73 ^ fz1Var.q1;
        fz1Var.q1 = i74;
        int i75 = i67 ^ (i64 & i73);
        int i76 = fz1Var.u;
        int i77 = i63 & i76;
        int i78 = i63 ^ i67;
        int i79 = i78 ^ i64;
        int i80 = i64 & i78;
        int i81 = i64 & (i78 ^ (-1));
        int i82 = i64 & i63;
        int i83 = i67 | i63;
        int i84 = i78 ^ (i64 & ((i83 & i72) ^ (-1)));
        fz1Var.w0 = i84;
        int i85 = i63 & i67;
        int i86 = i85 ^ (-1);
        int i87 = i64 & i86;
        int i88 = i67 & i86;
        int i89 = i64 & i85;
        int i90 = i63 ^ i89;
        fz1Var.z = i90;
        int i91 = i51 ^ i40;
        int i92 = i91 | i46;
        int i93 = fz1Var.c0 ^ (((((((i42 ^ (-1)) & i40) ^ i48) ^ ((i52 ^ i54) & i47)) ^ (((i48 ^ (i40 & (i52 ^ (-1)))) ^ i92) | i49)) & i62) ^ ((i43 ^ i92) ^ (((i91 & i47) ^ i57) | i49)));
        fz1Var.c0 = i93;
        int i94 = i53 ^ (i49 | (i48 ^ ((i44 ^ i45) & i47)));
        int i95 = i93 | i2;
        int i96 = i93 & i5;
        int i97 = ((((i54 & i47) ^ i57) ^ fz1Var.L1) ^ i60) ^ fz1Var.Y;
        fz1Var.Y = i97;
        int i98 = i20 ^ (i97 | i12);
        int i99 = i16 & (i98 ^ (-1));
        int i100 = i16 ^ (-1);
        int i101 = i97 ^ (-1);
        int i102 = i19 & i101;
        int i103 = i14 ^ i102;
        int i104 = i97 | i18;
        int i105 = i16 & (i23 ^ i104);
        int i106 = i13 & i101;
        int i107 = (i13 ^ i106) ^ i17;
        int i108 = i15 ^ i106;
        int i109 = i18 ^ (i97 | i15);
        int i110 = i97 | i23;
        int i111 = i15 ^ i110;
        int i112 = i97 | i19;
        int i113 = i15 ^ i112;
        int i114 = (i12 ^ i102) & i16;
        int i115 = i14 ^ (i20 & i101);
        int i116 = i12 ^ i110;
        int i117 = i12 ^ i112;
        int i118 = i16 & i117;
        int i119 = i16 | i117;
        int i120 = i19 ^ i104;
        int i121 = i102 ^ i22;
        int i122 = i21 ^ ((i20 ^ (i15 & i101)) & i100);
        int i123 = (i94 ^ (i59 | ((i50 & i47) ^ fz1Var.O1))) ^ fz1Var.G;
        fz1Var.G = i123;
        int i124 = fz1Var.q;
        int i125 = i124 & i123;
        int i126 = i123 & i32;
        int i127 = i30 & i126;
        int i128 = i126 ^ i31;
        int i129 = fz1Var.T1;
        int i130 = i129 & i128;
        int i131 = i129 & (i128 ^ (-1));
        int i132 = i123 ^ (-1);
        int i133 = i124 & i132;
        int i134 = fz1Var.i;
        int i135 = i133 & i134;
        int i136 = i123 | i29;
        int i137 = i136 ^ i33;
        int i138 = i129 & i137;
        int i139 = i129 & (i137 ^ (-1));
        int i140 = i129 ^ (-1);
        int i141 = i136 ^ (-1);
        int i142 = i129 & i141;
        int i143 = i30 & i136;
        int i144 = i136 ^ i30;
        int i145 = i29 ^ (i30 & i141);
        int i146 = i136 & i32;
        int i147 = i146 ^ i30;
        int i148 = i129 & (i147 ^ (-1));
        int i149 = i129 & i147;
        int i150 = i146 ^ i127;
        int i151 = i150 ^ fz1Var.n;
        int i152 = i134 & ((i123 ^ i133) ^ (-1));
        int i153 = i30 & i29 & i123;
        int i154 = i123 ^ i29;
        int i155 = i30 & (i154 ^ (-1));
        int i156 = (i154 ^ i33) ^ i129;
        int i157 = i154 ^ i31;
        int i158 = i129 & (i136 ^ i155);
        int i159 = i29 & i132;
        int i160 = i129 & ((i30 & i132) ^ (-1));
        int i161 = i134 & i132;
        int i162 = fz1Var.i0;
        int i163 = (((fz1Var.a0 & ((i162 & (i37 ^ (-1))) ^ (-1))) ^ ((i37 & i162) ^ fz1Var.F0)) ^ fz1Var.U0) ^ fz1Var.d;
        fz1Var.d = i163;
        int i164 = i163 ^ (-1);
        int i165 = (fz1Var.R1 & i164) ^ fz1Var.J;
        int i166 = fz1Var.Y1;
        int i167 = (i165 ^ (-1)) & i166;
        int i168 = fz1Var.M1;
        int i169 = fz1Var.t;
        int i170 = (i169 ^ (i168 & i164)) & i166;
        int i171 = fz1Var.X;
        int i172 = i171 & i163;
        int i173 = i6 ^ (-1);
        int i174 = i171 & i9 & i163;
        int i175 = i174 & i173;
        fz1Var.i0 = i175;
        int i176 = fz1Var.t1 ^ (fz1Var.G1 | i163);
        int i177 = fz1Var.D1 ^ (fz1Var.r | i163);
        int i178 = ((fz1Var.q0 ^ (fz1Var.E0 & i164)) ^ (-1)) & i166;
        int i179 = i9 & i164;
        int i180 = i171 & i179;
        int i181 = i171 & (i163 | i179);
        int i182 = i163 & (i9 ^ (-1));
        int i183 = fz1Var.P;
        int i184 = i182 ^ (-1);
        int i185 = i171 & i184;
        int i186 = i163 & i184;
        int i187 = i182 ^ i185;
        int i188 = i183 & (i187 ^ (i6 & (i187 ^ (-1))));
        int i189 = i88 ^ i66;
        int i190 = i85 ^ i87;
        int i191 = i78 ^ i82;
        int i192 = i78 ^ i80;
        int i193 = fz1Var.f0;
        int i194 = (((i187 ^ (i182 & i173)) ^ (((i182 ^ fz1Var.n0) ^ (-1)) & i183)) ^ (-1)) & i193;
        int i195 = i9 | i163;
        int i196 = i195 | i6;
        int i197 = i9 ^ (i171 & (i195 ^ (-1)));
        fz1Var.g = i197;
        int i198 = i183 & ((i9 ^ (i197 & i173)) ^ (-1));
        int i199 = i186 ^ i172;
        int i200 = (fz1Var.h0 & i164) ^ fz1Var.P1;
        int i201 = i9 ^ i163;
        int i202 = (i199 ^ i6) ^ (i183 & ((i163 ^ (i6 & (i171 & (i201 ^ (-1))))) ^ (-1)));
        fz1Var.p2 = i202;
        int i203 = ((i175 ^ ((i197 ^ (i201 & i173)) & i183)) ^ (-1)) & i193;
        int i204 = i201 ^ (i171 & (i186 ^ (-1)));
        fz1Var.m2 = i204;
        int i205 = i204 ^ (i199 | i6);
        fz1Var.o2 = i205;
        int i206 = i205 ^ (i183 & (i163 ^ (i6 & (i182 ^ i180))));
        int i207 = i201 ^ i185;
        fz1Var.F0 = i207;
        int i208 = i202 ^ ((i207 ^ (i183 & (((i9 ^ i172) ^ i196) ^ (-1)))) & i193);
        fz1Var.G1 = i208;
        int i209 = i208 ^ i39;
        fz1Var.K = i209;
        int i210 = fz1Var.C1;
        int i211 = (i78 ^ i69) ^ (i209 | i89);
        fz1Var.R0 = i211;
        int i212 = ((i90 ^ (i209 | i79)) ^ (-1)) & i210;
        int i213 = i88 | i209;
        int i214 = i210 & ((i74 ^ (i209 | i83)) ^ (-1));
        int i215 = i209 ^ (-1);
        int i216 = i84 ^ (i191 & i215);
        int i217 = i209 | i70;
        int i218 = i63 & (i76 ^ i217);
        int i219 = fz1Var.j1 & i215;
        int i220 = i76 ^ (fz1Var.p1 | i209);
        fz1Var.p1 = i220;
        int i221 = i28 & ((i220 ^ (i63 & i70)) ^ (-1));
        int i222 = fz1Var.K1;
        int i223 = i83 ^ i69;
        int i224 = i63 ^ i80;
        int i225 = fz1Var.Z1 ^ (i209 | i222);
        int i226 = i28 & ((i225 ^ i71) ^ (-1));
        int i227 = i225 ^ i77;
        int i228 = i210 & ((i223 ^ i209) ^ (-1));
        int i229 = i13 ^ i217;
        fz1Var.T0 = i229;
        int i230 = i28 & (i13 ^ (i229 & i65));
        int i231 = fz1Var.u1;
        int i232 = ((((fz1Var.x1 & i215) ^ i70) | i63) ^ i229) ^ i226;
        int i233 = i210 & ((i82 & i209) ^ (-1));
        int i234 = ((i70 ^ i219) ^ ((i222 ^ i219) | i63)) ^ i221;
        int i235 = i70 ^ i217;
        int i236 = (i63 | i235) ^ i220;
        fz1Var.s = i236;
        int i237 = i236 ^ i230;
        int i238 = i237 ^ (i232 & i231);
        fz1Var.x1 = i238;
        int i239 = i238 ^ fz1Var.b0;
        fz1Var.b0 = i239;
        int i240 = (i237 ^ (i232 | i231)) ^ i11;
        fz1Var.l0 = i240;
        int i241 = (i28 & ((i235 ^ i218) ^ (-1))) ^ i227;
        fz1Var.x0 ^= i241 ^ (i231 | i234);
        int i242 = (i241 ^ (i234 & i231)) ^ i171;
        fz1Var.l = i242;
        int i243 = (i191 ^ (i209 & i86)) ^ ((i74 ^ (i209 | i75)) & i210);
        int i244 = (((i83 ^ i81) ^ ((i68 ^ i82) & i215)) ^ (-1)) & i210;
        int i245 = (i64 ^ (i209 | i191)) ^ (i210 & (i190 ^ (i209 | i189)));
        int i246 = (i79 ^ (i209 | i192)) ^ (((i224 & i215) ^ (-1)) & i210);
        int i247 = ((((i201 ^ i181) ^ ((i179 ^ i174) & i173)) ^ i198) ^ i203) ^ fz1Var.b1;
        fz1Var.b1 = i247;
        int i248 = fz1Var.c;
        int i249 = i248 ^ (-1);
        int i250 = fz1Var.k;
        int i251 = i247 ^ (-1);
        int i252 = i250 & i251;
        int i253 = i16 ^ i247;
        int i254 = i12 & i251;
        int i255 = i16 | i247;
        int i256 = i250 & i255;
        int i257 = i248 | (i247 ^ i256);
        int i258 = i255 & i251;
        int i259 = i258 ^ i252;
        int i260 = i248 | i259;
        int i261 = i247 & i16;
        int i262 = i261 ^ i256;
        fz1Var.j1 = i262;
        int i263 = i248 | i262;
        int i264 = i261 ^ fz1Var.s0;
        int i265 = i258 ^ ((i261 ^ fz1Var.c2) & i249);
        int i266 = i264 & i249;
        int i267 = i261 ^ (i250 & i247);
        fz1Var.Q1 = i267;
        int i268 = i267 ^ i260;
        fz1Var.J0 = i268;
        int i269 = ((i30 & (((i248 & ((i255 ^ (i250 & (i253 ^ (-1)))) ^ (-1))) ^ (i12 & (i262 ^ i266))) ^ (-1))) ^ (i268 ^ i254)) ^ i59;
        fz1Var.N = i269;
        int i270 = i261 ^ i250;
        int i271 = ((i255 ^ i250) ^ i257) ^ (i12 & ((i270 ^ i266) ^ (-1)));
        int i272 = (i271 ^ (i30 & (((i261 ^ i266) ^ (i12 & ((i261 ^ (i250 & i261)) ^ (i270 & i249)))) ^ (-1)))) ^ i9;
        fz1Var.E1 = i272;
        fz1Var.T = ((i30 & ((i265 ^ (i12 & ((i248 | i264) ^ (-1)))) ^ (-1))) ^ ((i12 & (i255 ^ ((fz1Var.t0 ^ i247) & i249))) ^ (i270 ^ (i255 & i249)))) ^ fz1Var.T;
        int i273 = i250 & i247 & i100;
        int i274 = ((((i253 ^ i273) ^ i263) ^ (i12 & (i247 ^ i252))) ^ (i30 & (((i16 ^ i273) ^ ((i250 & (i255 ^ (-1))) & i249)) ^ (i12 & (i259 ^ fz1Var.R))))) ^ fz1Var.H;
        fz1Var.H = i274;
        int i275 = ((((i171 ^ i201) ^ i6) ^ i188) ^ i194) ^ fz1Var.o;
        fz1Var.o = i275;
        int i276 = i275 ^ (-1);
        int i277 = fz1Var.B0;
        int i278 = fz1Var.z1;
        int i279 = i163 & (i277 ^ (-1));
        int i280 = i200 ^ (i166 & ((fz1Var.e2 & i164) ^ (-1)));
        int i281 = fz1Var.a2;
        int i282 = i166 & ((i168 ^ (i163 & (i281 ^ (-1)))) ^ (-1));
        int i283 = i102 ^ (i115 & i100);
        int i284 = i120 ^ (i109 & i100);
        int i285 = i97 ^ (i116 & i100);
        int i286 = i116 ^ i99;
        int i287 = i97 ^ (i103 & i100);
        int i288 = i2 & i5;
        int i289 = ((fz1Var.j2 & i164) ^ i167) | i278;
        int i290 = fz1Var.N0;
        int i291 = ((fz1Var.I1 ^ ((i163 | fz1Var.g1) ^ i290)) ^ ((i177 ^ (i166 & (((i163 | i277) ^ fz1Var.A1) ^ (-1)))) & (i278 ^ (-1)))) ^ fz1Var.Q;
        fz1Var.Q = i291;
        int i292 = i291 ^ (-1);
        int i293 = (((((i21 & i101) ^ (i98 & i100)) ^ ((i108 ^ i24) & i292)) | i231) ^ ((i108 ^ i105) ^ (i291 | i122))) ^ i46;
        fz1Var.h = i293;
        int i294 = i293 | i269;
        fz1Var.w1 = i294;
        int i295 = i269 ^ (-1);
        fz1Var.W = i294 & i295;
        fz1Var.v0 = i293 & i295;
        int i296 = i293 & i269;
        fz1Var.L1 = i296;
        fz1Var.H1 = (i296 ^ (-1)) & i269;
        fz1Var.n0 = (i293 ^ (-1)) & i269;
        int i297 = i293 ^ i269;
        fz1Var.I1 = i297;
        int i298 = fz1Var.v ^ ((i286 ^ (i284 & i292)) ^ ((i113 ^ (i291 | i113)) | i231));
        fz1Var.v = i298;
        int i299 = (i285 ^ (i107 & i292)) | i231;
        int i300 = (((i120 ^ i118) ^ (i291 | i114)) ^ ((i283 ^ (i291 | i121)) & (i231 ^ (-1)))) ^ i193;
        fz1Var.f2 = i300;
        int i301 = i300 & i242;
        int i302 = i272 & ((i242 ^ i300) ^ (-1));
        int i303 = fz1Var.V ^ (((i111 ^ i119) ^ (i287 & i292)) ^ i299);
        fz1Var.V = i303;
        int i304 = i303 & i295;
        fz1Var.m1 = i304;
        fz1Var.r0 = i304 ^ i269;
        fz1Var.a1 = i269 & i303;
        int i305 = ((((i163 | fz1Var.d2) ^ i281) ^ i170) ^ i289) ^ fz1Var.M;
        fz1Var.M = i305;
        int i306 = i305 ^ (-1);
        int i307 = i2 & i306;
        int i308 = i93 | i307;
        int i309 = i2 & i305;
        int i310 = i93 & (i305 ^ i288);
        int i311 = i64 ^ i305;
        int i312 = i210 & i306;
        int i313 = i275 & i305;
        int i314 = i3 | i305;
        int i315 = i2 & (i314 ^ (-1));
        int i316 = i64 & i306;
        int i317 = i210 & i316;
        int i318 = i275 | i317;
        int i319 = i305 | i316;
        int i320 = i3 ^ i305;
        int i321 = i305 ^ (i2 & i320);
        int i322 = i93 & (i321 ^ (-1));
        int i323 = i93 | i321;
        int i324 = i93 ^ (-1);
        int i325 = i2 & (i320 ^ (-1)) & i324;
        fz1Var.f1 = (i305 ^ (i2 & (i3 & i305))) ^ i325;
        int i326 = i159 ^ i127;
        int i327 = i314 ^ i309;
        int i328 = i319 ^ (i210 & (i311 ^ (-1)));
        int i329 = i305 ^ i312;
        int i330 = i3 & i306;
        int i331 = i305 | i330;
        int i332 = i2 & i331;
        int i333 = i331 ^ i288;
        int i334 = i2 & (i330 ^ (-1));
        int i335 = i330 ^ i4;
        fz1Var.a0 = (i320 ^ i334) ^ (i335 & i324);
        int i336 = i335 ^ i93;
        int i337 = (i330 ^ i315) & i324;
        int i338 = i93 | (i314 ^ i334);
        int i339 = i305 & i5;
        int i340 = i305 & (i339 ^ (-1));
        int i341 = i340 ^ i4;
        int i342 = i341 ^ i95;
        int i343 = i341 ^ i308;
        int i344 = i340 ^ i323;
        int i345 = i340 ^ i309;
        fz1Var.Z1 = i345 ^ i322;
        fz1Var.J = i93 | i345;
        int i346 = (i339 ^ i332) ^ i325;
        int i347 = i315 ^ ((i2 & i339) & i324);
        int i348 = i339 ^ i334;
        fz1Var.B1 = i348 ^ i310;
        fz1Var.r = i333 ^ (i93 & ((i307 ^ i305) ^ (-1)));
        int i349 = i64 & i305;
        int i350 = i210 & i349;
        int i351 = (fz1Var.V0 ^ i349) & i276;
        int i352 = i2 ^ (-1);
        int i353 = i305 | i64;
        int i354 = (i353 ^ i312) | i275;
        int i355 = i353 | i2;
        int i356 = fz1Var.w;
        int i357 = i305 & (i64 ^ (-1));
        int i358 = i210 & (i357 ^ (-1));
        int i359 = i353 ^ i358;
        int i360 = (i359 ^ ((i349 ^ (i210 & (i316 ^ (-1)))) & i352)) | i356;
        int i361 = (i359 ^ (i275 & (i319 ^ i210))) ^ (i2 | (i275 & (i316 ^ i317)));
        int i362 = ((((i311 ^ i210) ^ (i358 & i276)) ^ ((i329 ^ (i275 & (i358 ^ (-1)))) & i352)) ^ ((i350 ^ i355) & (i356 ^ (-1)))) ^ fz1Var.D;
        fz1Var.D = i362;
        int i363 = i357 & i210;
        int i364 = i64 ^ i363;
        int i365 = ((((i305 ^ i210) ^ i275) ^ (i2 | (i64 ^ (i275 & (i364 ^ (-1)))))) ^ (((i64 ^ (fz1Var.d1 & i276)) ^ (i2 | i363)) | i356)) ^ i6;
        fz1Var.i1 = i365;
        int i366 = (i361 ^ (i356 | (((i364 ^ i313) & i352) ^ (i329 ^ i354)))) ^ fz1Var.d0;
        fz1Var.d0 = i366;
        int i367 = i326 ^ (i144 & i140);
        int i368 = i328 ^ i351;
        int i369 = i326 ^ i138;
        int i370 = (i154 ^ i155) ^ i148;
        fz1Var.g1 = i240 | ((i366 ^ (-1)) & i303);
        int i371 = ((((i64 ^ i312) ^ i318) ^ (i368 & i352)) ^ i360) ^ fz1Var.Z;
        fz1Var.Z = i371;
        int i372 = (i280 ^ (i278 | ((i163 & (i290 ^ (-1))) ^ i282))) ^ fz1Var.y;
        fz1Var.y = i372;
        int i373 = ((i248 | ((i153 ^ i160) ^ (i372 & ((i157 ^ i130) ^ (-1))))) ^ (i156 ^ (i372 & (i128 ^ i131)))) ^ i26;
        fz1Var.L0 = i373;
        int i374 = (((i326 ^ i149) ^ ((i150 ^ (-1)) & i372)) ^ ((i370 ^ ((i370 ^ (-1)) & i372)) & i249)) ^ i49;
        fz1Var.p = i374;
        fz1Var.h1 = i374 & i295;
        fz1Var.Z0 = i297 ^ i374;
        int i375 = i372 & i152;
        fz1Var.t = ((i248 | ((((i159 ^ i155) ^ i158) & i372) ^ (i150 ^ (i137 & i140)))) ^ ((i128 ^ i139) ^ ((i369 ^ (-1)) & i372))) ^ i169;
        int i376 = ((i367 ^ (((i143 ^ i142) ^ (-1)) & i372)) ^ (((i145 ^ i130) ^ (i372 & i151)) & i249)) ^ fz1Var.L;
        fz1Var.L = i376;
        fz1Var.n = i362 ^ i376;
        int i377 = i298 | i376;
        fz1Var.V1 = i377;
        fz1Var.U1 = (i298 ^ (-1)) & i376;
        int i378 = i362 & i376;
        fz1Var.c1 = i378;
        fz1Var.P0 = i239 & i378;
        fz1Var.M0 = i377;
        int i379 = (i362 ^ (-1)) & i376;
        fz1Var.A0 = i379;
        fz1Var.N1 = (i379 ^ (-1)) & i376;
        fz1Var.C0 = i239 & i376;
        fz1Var.v1 = i377;
        fz1Var.B = i362 | i376;
        int i380 = (i376 ^ (-1)) & i362;
        fz1Var.m0 = i380;
        fz1Var.b = i376 | i380;
        int i381 = ((i278 | (i279 ^ ((i163 & (fz1Var.H0 ^ (-1))) & i166))) ^ (i176 ^ i178)) ^ i36;
        fz1Var.S = i381;
        int i382 = ((i211 ^ i233) ^ ((i244 ^ (-1)) & i381)) ^ i163;
        fz1Var.n1 = i382;
        int i383 = i382 | i242;
        int i384 = i300 & (i383 ^ (-1));
        int i385 = i272 ^ (-1);
        int i386 = i242 ^ (-1);
        int i387 = i383 & i386;
        int i388 = i300 & (i387 ^ (-1));
        int i389 = (i382 ^ i388) & i272;
        int i390 = i272 & ((i387 ^ i384) ^ (-1));
        int i391 = i300 & i382;
        int i392 = i382 ^ (-1);
        int i393 = i242 & i392;
        int i394 = i300 & i392;
        int i395 = i382 & i272;
        int i396 = i382 & i242;
        int i397 = i272 & ((i300 & i396) ^ (-1));
        int i398 = i242 & (i396 ^ (-1));
        fz1Var.y0 = (i300 ^ (i272 | (i398 ^ i384))) ^ (i365 & (((i383 ^ i391) ^ (i272 & (i398 ^ (-1)))) ^ (-1)));
        int i399 = i396 ^ i300;
        fz1Var.B0 = (((i394 ^ ((i383 ^ i300) & i272)) ^ (-1)) & i365) ^ (i300 ^ (i272 & ((i300 & i383) ^ (-1))));
        int i400 = i391 & i272;
        fz1Var.d2 = i400 ^ (i365 & (i242 ^ (i399 & i272)));
        int i401 = i382 & i386;
        fz1Var.X = ((i396 ^ i388) ^ i302) ^ (i365 & (i401 ^ (i272 & ((i242 ^ i394) ^ (-1)))));
        int i402 = i396 ^ (i300 & i401);
        fz1Var.h2 = ((i383 & i385) ^ i399) ^ (((i272 | i402) ^ (-1)) & i365);
        int i403 = i242 ^ i382;
        fz1Var.h0 = ((i403 ^ i301) ^ i397) ^ ((i400 ^ (-1)) & i365);
        fz1Var.N0 = i365 ^ ((i396 ^ (i300 & i403)) ^ i389);
        fz1Var.M1 = ((i393 ^ (i300 & (i403 ^ (-1)))) ^ i390) ^ (((i402 ^ i395) ^ (-1)) & i365);
        int i404 = (i243 ^ (((i189 ^ i213) ^ i214) & i381)) ^ fz1Var.f;
        fz1Var.f = i404;
        int i405 = i327 ^ i337;
        int i406 = i216 ^ i212;
        int i407 = i274 ^ (-1);
        fz1Var.k1 = i274 | i404;
        int i408 = i404 ^ i371;
        int i409 = i274 | i408;
        fz1Var.Q0 = i408 ^ i409;
        fz1Var.d1 = i408 ^ i274;
        int i410 = i404 & i407;
        fz1Var.W0 = i408 ^ i410;
        int i411 = (i404 ^ (-1)) & i371;
        fz1Var.X1 = i411 ^ (i411 & i407);
        int i412 = i371 ^ (-1);
        int i413 = i404 & i412;
        fz1Var.E0 = i413 & i407;
        int i414 = i404 & i371;
        fz1Var.e2 = i414;
        int i415 = i371 & (i414 ^ (-1));
        int i416 = i274 | i415;
        fz1Var.P1 = i414 ^ i416;
        fz1Var.a2 = i415 ^ i416;
        fz1Var.g0 = i404 ^ i416;
        fz1Var.X0 = i414 ^ i274;
        fz1Var.l2 = i414 & i407;
        int i417 = i404 | i371;
        int i418 = i417 & i407;
        fz1Var.C = i415 ^ i418;
        fz1Var.A1 = (i274 | i417) ^ i417;
        fz1Var.u0 = i414 ^ i418;
        fz1Var.n2 = i417 ^ (i274 | i371);
        int i419 = i274 | (i417 & i412);
        fz1Var.t1 = i371 ^ i419;
        fz1Var.c2 = i413 ^ i419;
        fz1Var.V0 = i417 ^ i409;
        fz1Var.z0 = i417 ^ i410;
        fz1Var.g2 = i411 ^ i410;
        fz1Var.x = (i246 ^ (i381 & (i223 ^ i228))) ^ i40;
        int i420 = (((i245 ^ (-1)) & i381) ^ i406) ^ i7;
        fz1Var.l1 = i420;
        int i421 = i420 & i385;
        fz1Var.D0 = i421;
        fz1Var.K0 = (i421 ^ (-1)) & i420;
        fz1Var.b2 = i420 & i272;
        int i422 = i272 & (i420 ^ (-1));
        fz1Var.S1 = i422;
        fz1Var.H0 = i422 | i420;
        fz1Var.s0 = i272 | i420;
        fz1Var.J1 = i420 & i373;
        int i423 = (i206 ^ (i193 & ((i183 & ((i180 ^ (i163 & i173)) ^ (-1))) ^ ((i163 ^ i181) ^ (i172 & i173))))) ^ fz1Var.a;
        fz1Var.a = i423;
        fz1Var.t0 = i336 ^ (i423 | i405);
        fz1Var.o0 = i343 ^ (i423 | i347);
        int i424 = i423 ^ (-1);
        int i425 = fz1Var.k0;
        fz1Var.r1 = (((i342 ^ (i346 & i424)) & i425) ^ ((i348 ^ i337) ^ ((i333 ^ i338) | i423))) ^ fz1Var.r1;
        int i426 = i423 & i132;
        int i427 = (i124 & (i123 | i426)) ^ i423;
        fz1Var.R = i427;
        fz1Var.Y0 = i372 & (i427 ^ i135);
        int i428 = i124 & i426;
        fz1Var.j2 = i428;
        int i429 = i134 & (i426 ^ (-1));
        fz1Var.R1 = i426 ^ i428;
        fz1Var.o1 = ((i96 ^ (i344 & i424)) ^ (-1)) & i425;
        int i430 = i423 | i123;
        int i431 = i124 & (i430 ^ (-1));
        fz1Var.y1 = i431;
        fz1Var.O0 = i425 & (((i431 ^ i161) ^ i375) ^ (-1));
        fz1Var.O1 = i134 & ((i430 ^ i125) ^ (-1));
        fz1Var.i2 = i134 & ((i430 ^ i124) ^ (-1));
        int i432 = i123 & i424;
        int i433 = i123 & (i432 ^ (-1));
        fz1Var.p0 = i433;
        fz1Var.I0 = i433 ^ i125;
        fz1Var.S0 = i124 & i432;
        int i434 = i432 ^ i124;
        int i435 = (i134 ^ (-1)) & i434;
        fz1Var.q0 = i372 & (i435 ^ (-1));
        fz1Var.W1 = i434 ^ i429;
        fz1Var.k2 = i372 & (i431 ^ i435);
        fz1Var.f0 = (i124 & i423) ^ i423;
        int i436 = i423 ^ i123;
        fz1Var.U0 = i436;
        fz1Var.D1 = ((i436 ^ i124) & i134) ^ i427;
    }

    @Override // defpackage.bc0
    public final void c(Exception exc) {
        op4 op4Var = (op4) this.Q;
        op4Var.getClass();
        if (exc instanceof InterruptedException) {
            Thread.currentThread().interrupt();
        }
        op4Var.c.c(2025, -1L, exc);
    }

    @Override // defpackage.nw3
    public final dz4 d(rq2 rq2Var) {
        dz4 dz4Var;
        zv3 zv3Var = ((ow3) this.Q).b;
        String str = rq2Var.W;
        synchronized (zv3Var.b) {
            int i = zv3Var.h;
            if (i != 1 && i != 3) {
                dz4Var = new yy4(new gw3(2));
            } else {
                if (!zv3Var.c) {
                    zv3Var.h = 3;
                    zv3Var.c = true;
                    zv3Var.g = str;
                    zv3Var.f.n();
                    zv3Var.a.b(new gz1(5, zv3Var), zw2.f);
                }
                dz4Var = zv3Var.a;
            }
        }
        return dz4Var;
    }

    @Override // defpackage.ex2
    public final void e(Object obj) {
        switch (this.P) {
            case 2:
                ((bx2) this.Q).a((sj2) obj);
                return;
            case 7:
                ar2 ar2Var = (ar2) ((cr2) this.Q);
                ((zr2) obj).r4(new ns2(ar2Var.P, ar2Var.Q));
                return;
            case 10:
                int i = bm5.X;
                ((b53) obj).w(((jn5) this.Q).m);
                return;
            default:
                jo5 jo5Var = (jo5) obj;
                return;
        }
    }

    @Override // defpackage.e74
    public final void f(Object obj) {
        c83 c83Var = (c83) obj;
        synchronized (((qf4) this.Q)) {
            try {
                c83 c83Var2 = ((qf4) this.Q).Y;
                if (c83Var2 != null) {
                    c83Var2.b();
                }
                qf4 qf4Var = (qf4) this.Q;
                qf4Var.Y = c83Var;
                y03 y03Var = c83Var.i;
                if (y03Var != null) {
                    y03Var.G0(qf4Var);
                }
                qf4 qf4Var2 = (qf4) this.Q;
                qf4Var2.U.f(new d83(c83Var, qf4Var2, qf4Var2.U));
                c83Var.a();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void g(g gVar) {
        ((Vector) this.Q).addElement(gVar);
    }

    public final g h(int i) {
        return (g) ((Vector) this.Q).elementAt(i);
    }

    public final int i() {
        return ((Vector) this.Q).size();
    }

    public final int j() {
        int optInt = ((JSONObject) this.Q).optInt("media_type", -1);
        if (optInt != 0) {
            return optInt != 1 ? 3 : 1;
        }
        return 2;
    }

    public /* synthetic */ s82(int i, Object obj) {
        this.P = i;
        this.Q = obj;
    }

    public /* synthetic */ s82(fz1 fz1Var) {
        this.P = 1;
        this.Q = fz1Var;
    }

    public /* synthetic */ s82(io5 io5Var) {
        this.P = 11;
        this.Q = io5Var;
    }
}