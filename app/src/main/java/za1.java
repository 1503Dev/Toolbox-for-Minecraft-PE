package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: za1  reason: default package */
public final class za1 implements zc1 {
    public final /* synthetic */ ob1 a;

    public za1(ob1 ob1Var) {
        this.a = ob1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x03dd  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x03fc  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x040d  */
    @Override // defpackage.zc1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(rc1 rc1Var) {
        String str;
        String str2;
        String str3;
        int i;
        String str4;
        ob1 ob1Var;
        String str5;
        yf1 yf1Var;
        FrameLayout.LayoutParams layoutParams;
        int i2;
        int i3;
        Typeface typeface;
        int i4;
        ob1 ob1Var2;
        HashMap<Integer, Boolean> hashMap;
        Integer valueOf;
        Boolean bool;
        gf1 gf1Var;
        Typeface typeface2;
        int i5;
        boolean z;
        if (this.a.b(rc1Var)) {
            ob1 ob1Var3 = this.a;
            ob1Var3.getClass();
            ic1 ic1Var = rc1Var.b;
            int l = ic1Var.l("id");
            if (ic1Var.j("editable")) {
                gf1 gf1Var2 = new gf1(ob1Var3.q0, rc1Var, l, ob1Var3);
                ic1 ic1Var2 = gf1Var2.h0.b;
                gf1Var2.c0 = ic1Var2.q("ad_session_id");
                gf1Var2.Q = ic1Var2.l("x");
                gf1Var2.R = ic1Var2.l("y");
                gf1Var2.S = ic1Var2.l("width");
                gf1Var2.T = ic1Var2.l("height");
                gf1Var2.V = ic1Var2.l("font_family");
                gf1Var2.U = ic1Var2.l("font_style");
                gf1Var2.W = ic1Var2.l("font_size");
                gf1Var2.d0 = ic1Var2.q("background_color");
                gf1Var2.e0 = ic1Var2.q("font_color");
                gf1Var2.f0 = ic1Var2.q("text");
                gf1Var2.a0 = ic1Var2.l("align_x");
                gf1Var2.b0 = ic1Var2.l("align_y");
                gf1Var2.setVisibility(4);
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(gf1Var2.S, gf1Var2.T);
                layoutParams2.setMargins(gf1Var2.Q, gf1Var2.R, 0, 0);
                layoutParams2.gravity = 0;
                gf1Var2.g0.addView(gf1Var2, layoutParams2);
                int i6 = gf1Var2.V;
                if (i6 != 0) {
                    if (i6 != 1) {
                        if (i6 != 2) {
                            if (i6 == 3) {
                                typeface2 = Typeface.MONOSPACE;
                            }
                            i5 = gf1Var2.U;
                            if (i5 == 0) {
                                if (i5 != 1) {
                                    if (i5 != 2) {
                                        if (i5 == 3) {
                                            gf1Var2.setTypeface(gf1Var2.getTypeface(), 3);
                                        }
                                    } else {
                                        gf1Var2.setTypeface(gf1Var2.getTypeface(), 2);
                                    }
                                } else {
                                    gf1Var2.setTypeface(gf1Var2.getTypeface(), 1);
                                }
                                z = false;
                            } else {
                                z = false;
                                gf1Var2.setTypeface(gf1Var2.getTypeface(), 0);
                            }
                            gf1Var2.setText(gf1Var2.f0);
                            gf1Var2.setTextSize(gf1Var2.W);
                            gf1Var2.setGravity(gf1.a(gf1Var2.a0, true) | gf1.a(gf1Var2.b0, z));
                            if (!gf1Var2.d0.equals("")) {
                                gf1Var2.setBackgroundColor(eg1.v(gf1Var2.d0));
                            }
                            if (!gf1Var2.e0.equals("")) {
                                gf1Var2.setTextColor(eg1.v(gf1Var2.e0));
                            }
                            ArrayList<zc1> arrayList = gf1Var2.g0.k0;
                            ue1 ue1Var = new ue1(gf1Var2);
                            ga1.g("TextView.set_visible", ue1Var);
                            arrayList.add(ue1Var);
                            ArrayList<zc1> arrayList2 = gf1Var2.g0.k0;
                            ve1 ve1Var = new ve1(gf1Var2);
                            ga1.g("TextView.set_bounds", ve1Var);
                            arrayList2.add(ve1Var);
                            ArrayList<zc1> arrayList3 = gf1Var2.g0.k0;
                            we1 we1Var = new we1(gf1Var2);
                            ga1.g("TextView.set_font_color", we1Var);
                            arrayList3.add(we1Var);
                            ArrayList<zc1> arrayList4 = gf1Var2.g0.k0;
                            xe1 xe1Var = new xe1(gf1Var2);
                            ga1.g("TextView.set_background_color", xe1Var);
                            arrayList4.add(xe1Var);
                            ArrayList<zc1> arrayList5 = gf1Var2.g0.k0;
                            ye1 ye1Var = new ye1(gf1Var2);
                            ga1.g("TextView.set_typeface", ye1Var);
                            arrayList5.add(ye1Var);
                            ArrayList<zc1> arrayList6 = gf1Var2.g0.k0;
                            ze1 ze1Var = new ze1(gf1Var2);
                            ga1.g("TextView.set_font_size", ze1Var);
                            arrayList6.add(ze1Var);
                            ArrayList<zc1> arrayList7 = gf1Var2.g0.k0;
                            af1 af1Var = new af1(gf1Var2);
                            ga1.g("TextView.set_font_style", af1Var);
                            arrayList7.add(af1Var);
                            ArrayList<zc1> arrayList8 = gf1Var2.g0.k0;
                            bf1 bf1Var = new bf1(gf1Var2);
                            ga1.g("TextView.get_text", bf1Var);
                            arrayList8.add(bf1Var);
                            ArrayList<zc1> arrayList9 = gf1Var2.g0.k0;
                            cf1 cf1Var = new cf1(gf1Var2);
                            ga1.g("TextView.set_text", cf1Var);
                            arrayList9.add(cf1Var);
                            ArrayList<zc1> arrayList10 = gf1Var2.g0.k0;
                            te1 te1Var = new te1(gf1Var2);
                            ga1.g("TextView.align", te1Var);
                            arrayList10.add(te1Var);
                            gf1Var2.g0.l0.add("TextView.set_visible");
                            gf1Var2.g0.l0.add("TextView.set_bounds");
                            gf1Var2.g0.l0.add("TextView.set_font_color");
                            gf1Var2.g0.l0.add("TextView.set_background_color");
                            gf1Var2.g0.l0.add("TextView.set_typeface");
                            gf1Var2.g0.l0.add("TextView.set_font_size");
                            gf1Var2.g0.l0.add("TextView.set_font_style");
                            gf1Var2.g0.l0.add("TextView.get_text");
                            gf1Var2.g0.l0.add("TextView.set_text");
                            gf1Var2.g0.l0.add("TextView.align");
                            ob1Var3.S.put(Integer.valueOf(l), gf1Var2);
                            ob1Var3.V.put(Integer.valueOf(l), gf1Var2);
                            HashMap<Integer, Boolean> hashMap2 = ob1Var3.U;
                            Integer valueOf2 = Integer.valueOf(l);
                            bool = Boolean.TRUE;
                            valueOf = valueOf2;
                            hashMap = hashMap2;
                            ob1Var2 = ob1Var3;
                            gf1Var = gf1Var2;
                        } else {
                            typeface2 = Typeface.SANS_SERIF;
                        }
                    } else {
                        typeface2 = Typeface.SERIF;
                    }
                } else {
                    typeface2 = Typeface.DEFAULT;
                }
                gf1Var2.setTypeface(typeface2);
                i5 = gf1Var2.U;
                if (i5 == 0) {
                }
                gf1Var2.setText(gf1Var2.f0);
                gf1Var2.setTextSize(gf1Var2.W);
                gf1Var2.setGravity(gf1.a(gf1Var2.a0, true) | gf1.a(gf1Var2.b0, z));
                if (!gf1Var2.d0.equals("")) {
                }
                if (!gf1Var2.e0.equals("")) {
                }
                ArrayList<zc1> arrayList11 = gf1Var2.g0.k0;
                ue1 ue1Var2 = new ue1(gf1Var2);
                ga1.g("TextView.set_visible", ue1Var2);
                arrayList11.add(ue1Var2);
                ArrayList<zc1> arrayList22 = gf1Var2.g0.k0;
                ve1 ve1Var2 = new ve1(gf1Var2);
                ga1.g("TextView.set_bounds", ve1Var2);
                arrayList22.add(ve1Var2);
                ArrayList<zc1> arrayList32 = gf1Var2.g0.k0;
                we1 we1Var2 = new we1(gf1Var2);
                ga1.g("TextView.set_font_color", we1Var2);
                arrayList32.add(we1Var2);
                ArrayList<zc1> arrayList42 = gf1Var2.g0.k0;
                xe1 xe1Var2 = new xe1(gf1Var2);
                ga1.g("TextView.set_background_color", xe1Var2);
                arrayList42.add(xe1Var2);
                ArrayList<zc1> arrayList52 = gf1Var2.g0.k0;
                ye1 ye1Var2 = new ye1(gf1Var2);
                ga1.g("TextView.set_typeface", ye1Var2);
                arrayList52.add(ye1Var2);
                ArrayList<zc1> arrayList62 = gf1Var2.g0.k0;
                ze1 ze1Var2 = new ze1(gf1Var2);
                ga1.g("TextView.set_font_size", ze1Var2);
                arrayList62.add(ze1Var2);
                ArrayList<zc1> arrayList72 = gf1Var2.g0.k0;
                af1 af1Var2 = new af1(gf1Var2);
                ga1.g("TextView.set_font_style", af1Var2);
                arrayList72.add(af1Var2);
                ArrayList<zc1> arrayList82 = gf1Var2.g0.k0;
                bf1 bf1Var2 = new bf1(gf1Var2);
                ga1.g("TextView.get_text", bf1Var2);
                arrayList82.add(bf1Var2);
                ArrayList<zc1> arrayList92 = gf1Var2.g0.k0;
                cf1 cf1Var2 = new cf1(gf1Var2);
                ga1.g("TextView.set_text", cf1Var2);
                arrayList92.add(cf1Var2);
                ArrayList<zc1> arrayList102 = gf1Var2.g0.k0;
                te1 te1Var2 = new te1(gf1Var2);
                ga1.g("TextView.align", te1Var2);
                arrayList102.add(te1Var2);
                gf1Var2.g0.l0.add("TextView.set_visible");
                gf1Var2.g0.l0.add("TextView.set_bounds");
                gf1Var2.g0.l0.add("TextView.set_font_color");
                gf1Var2.g0.l0.add("TextView.set_background_color");
                gf1Var2.g0.l0.add("TextView.set_typeface");
                gf1Var2.g0.l0.add("TextView.set_font_size");
                gf1Var2.g0.l0.add("TextView.set_font_style");
                gf1Var2.g0.l0.add("TextView.get_text");
                gf1Var2.g0.l0.add("TextView.set_text");
                gf1Var2.g0.l0.add("TextView.align");
                ob1Var3.S.put(Integer.valueOf(l), gf1Var2);
                ob1Var3.V.put(Integer.valueOf(l), gf1Var2);
                HashMap<Integer, Boolean> hashMap22 = ob1Var3.U;
                Integer valueOf22 = Integer.valueOf(l);
                bool = Boolean.TRUE;
                valueOf = valueOf22;
                hashMap = hashMap22;
                ob1Var2 = ob1Var3;
                gf1Var = gf1Var2;
            } else {
                if (!ic1Var.j("button")) {
                    yf1Var = new yf1(ob1Var3.q0, rc1Var, l, ob1Var3);
                    str3 = "align_x";
                    i = l;
                    str = "font_family";
                    str2 = "TextView.set_font_color";
                    str4 = "ad_session_id";
                    ob1Var = ob1Var3;
                    str5 = "font_size";
                } else {
                    Context context = ob1Var3.q0;
                    str = "font_family";
                    str2 = "TextView.set_font_color";
                    str3 = "align_x";
                    i = l;
                    str4 = "ad_session_id";
                    ob1Var = ob1Var3;
                    str5 = "font_size";
                    yf1Var = new yf1(context, rc1Var, l, ob1Var3, 0);
                }
                ic1 ic1Var3 = yf1Var.h0.b;
                yf1Var.f0 = ic1Var3.q(str4);
                yf1Var.Q = ic1Var3.l("x");
                yf1Var.R = ic1Var3.l("y");
                yf1Var.S = ic1Var3.l("width");
                yf1Var.T = ic1Var3.l("height");
                yf1Var.V = ic1Var3.l(str);
                yf1Var.U = ic1Var3.l("font_style");
                yf1Var.W = ic1Var3.l(str5);
                yf1Var.c0 = ic1Var3.q("background_color");
                yf1Var.d0 = ic1Var3.q("font_color");
                yf1Var.e0 = ic1Var3.q("text");
                yf1Var.a0 = ic1Var3.l(str3);
                yf1Var.b0 = ic1Var3.l("align_y");
                ad1 h = ga1.h();
                if (yf1Var.e0.equals("")) {
                    yf1Var.e0 = "Learn More";
                }
                yf1Var.setVisibility(4);
                if (ic1Var3.j("wrap_content")) {
                    layoutParams = new FrameLayout.LayoutParams(-2, -2);
                } else {
                    layoutParams = new FrameLayout.LayoutParams(yf1Var.S, yf1Var.T);
                }
                layoutParams.gravity = 0;
                yf1Var.setText(yf1Var.e0);
                yf1Var.setTextSize(yf1Var.W);
                if (ic1Var3.j("overlay")) {
                    yf1Var.Q = 0;
                    yf1Var.R = 0;
                    h.l().getClass();
                    i2 = (int) (he1.f() * 6.0f);
                    h.l().getClass();
                    i3 = (int) (he1.f() * 6.0f);
                    h.l().getClass();
                    int f = (int) (he1.f() * 4.0f);
                    yf1Var.setPadding(f, f, f, f);
                    layoutParams.gravity = 8388693;
                } else {
                    i2 = 0;
                    i3 = 0;
                }
                layoutParams.setMargins(yf1Var.Q, yf1Var.R, i2, i3);
                yf1Var.g0.addView(yf1Var, layoutParams);
                int i7 = yf1Var.V;
                if (i7 != 0) {
                    if (i7 != 1) {
                        if (i7 != 2) {
                            if (i7 == 3) {
                                typeface = Typeface.MONOSPACE;
                            }
                            i4 = yf1Var.U;
                            if (i4 == 0) {
                                if (i4 != 1) {
                                    if (i4 != 2) {
                                        if (i4 == 3) {
                                            yf1Var.setTypeface(yf1Var.getTypeface(), 3);
                                        }
                                    } else {
                                        yf1Var.setTypeface(yf1Var.getTypeface(), 2);
                                    }
                                } else {
                                    yf1Var.setTypeface(yf1Var.getTypeface(), 1);
                                }
                            } else {
                                yf1Var.setTypeface(yf1Var.getTypeface(), 0);
                            }
                            yf1Var.setGravity(yf1.a(yf1Var.a0, true) | yf1.a(yf1Var.b0, false));
                            if (!yf1Var.c0.equals("")) {
                                yf1Var.setBackgroundColor(eg1.v(yf1Var.c0));
                            }
                            if (!yf1Var.d0.equals("")) {
                                yf1Var.setTextColor(eg1.v(yf1Var.d0));
                            }
                            ArrayList<zc1> arrayList12 = yf1Var.g0.k0;
                            pf1 pf1Var = new pf1(yf1Var);
                            ga1.g("TextView.set_visible", pf1Var);
                            arrayList12.add(pf1Var);
                            ArrayList<zc1> arrayList13 = yf1Var.g0.k0;
                            qf1 qf1Var = new qf1(yf1Var);
                            ga1.g("TextView.set_bounds", qf1Var);
                            arrayList13.add(qf1Var);
                            ArrayList<zc1> arrayList14 = yf1Var.g0.k0;
                            rf1 rf1Var = new rf1(yf1Var);
                            String str6 = str2;
                            ga1.g(str6, rf1Var);
                            arrayList14.add(rf1Var);
                            ArrayList<zc1> arrayList15 = yf1Var.g0.k0;
                            sf1 sf1Var = new sf1(yf1Var);
                            ga1.g("TextView.set_background_color", sf1Var);
                            arrayList15.add(sf1Var);
                            ArrayList<zc1> arrayList16 = yf1Var.g0.k0;
                            tf1 tf1Var = new tf1(yf1Var);
                            ga1.g("TextView.set_typeface", tf1Var);
                            arrayList16.add(tf1Var);
                            ArrayList<zc1> arrayList17 = yf1Var.g0.k0;
                            uf1 uf1Var = new uf1(yf1Var);
                            ga1.g("TextView.set_font_size", uf1Var);
                            arrayList17.add(uf1Var);
                            ArrayList<zc1> arrayList18 = yf1Var.g0.k0;
                            vf1 vf1Var = new vf1(yf1Var);
                            ga1.g("TextView.set_font_style", vf1Var);
                            arrayList18.add(vf1Var);
                            ArrayList<zc1> arrayList19 = yf1Var.g0.k0;
                            wf1 wf1Var = new wf1(yf1Var);
                            ga1.g("TextView.get_text", wf1Var);
                            arrayList19.add(wf1Var);
                            ArrayList<zc1> arrayList20 = yf1Var.g0.k0;
                            xf1 xf1Var = new xf1(yf1Var);
                            ga1.g("TextView.set_text", xf1Var);
                            arrayList20.add(xf1Var);
                            ArrayList<zc1> arrayList21 = yf1Var.g0.k0;
                            of1 of1Var = new of1(yf1Var);
                            ga1.g("TextView.align", of1Var);
                            arrayList21.add(of1Var);
                            yf1Var.g0.l0.add("TextView.set_visible");
                            yf1Var.g0.l0.add("TextView.set_bounds");
                            yf1Var.g0.l0.add(str6);
                            yf1Var.g0.l0.add("TextView.set_background_color");
                            yf1Var.g0.l0.add("TextView.set_typeface");
                            yf1Var.g0.l0.add("TextView.set_font_size");
                            yf1Var.g0.l0.add("TextView.set_font_style");
                            yf1Var.g0.l0.add("TextView.get_text");
                            yf1Var.g0.l0.add("TextView.set_text");
                            yf1Var.g0.l0.add("TextView.align");
                            ob1Var2 = ob1Var;
                            ob1Var2.Q.put(Integer.valueOf(i), yf1Var);
                            ob1Var2.V.put(Integer.valueOf(i), yf1Var);
                            hashMap = ob1Var2.U;
                            valueOf = Integer.valueOf(i);
                            bool = Boolean.FALSE;
                            gf1Var = yf1Var;
                        } else {
                            typeface = Typeface.SANS_SERIF;
                        }
                    } else {
                        typeface = Typeface.SERIF;
                    }
                } else {
                    typeface = Typeface.DEFAULT;
                }
                yf1Var.setTypeface(typeface);
                i4 = yf1Var.U;
                if (i4 == 0) {
                }
                yf1Var.setGravity(yf1.a(yf1Var.a0, true) | yf1.a(yf1Var.b0, false));
                if (!yf1Var.c0.equals("")) {
                }
                if (!yf1Var.d0.equals("")) {
                }
                ArrayList<zc1> arrayList122 = yf1Var.g0.k0;
                pf1 pf1Var2 = new pf1(yf1Var);
                ga1.g("TextView.set_visible", pf1Var2);
                arrayList122.add(pf1Var2);
                ArrayList<zc1> arrayList132 = yf1Var.g0.k0;
                qf1 qf1Var2 = new qf1(yf1Var);
                ga1.g("TextView.set_bounds", qf1Var2);
                arrayList132.add(qf1Var2);
                ArrayList<zc1> arrayList142 = yf1Var.g0.k0;
                rf1 rf1Var2 = new rf1(yf1Var);
                String str62 = str2;
                ga1.g(str62, rf1Var2);
                arrayList142.add(rf1Var2);
                ArrayList<zc1> arrayList152 = yf1Var.g0.k0;
                sf1 sf1Var2 = new sf1(yf1Var);
                ga1.g("TextView.set_background_color", sf1Var2);
                arrayList152.add(sf1Var2);
                ArrayList<zc1> arrayList162 = yf1Var.g0.k0;
                tf1 tf1Var2 = new tf1(yf1Var);
                ga1.g("TextView.set_typeface", tf1Var2);
                arrayList162.add(tf1Var2);
                ArrayList<zc1> arrayList172 = yf1Var.g0.k0;
                uf1 uf1Var2 = new uf1(yf1Var);
                ga1.g("TextView.set_font_size", uf1Var2);
                arrayList172.add(uf1Var2);
                ArrayList<zc1> arrayList182 = yf1Var.g0.k0;
                vf1 vf1Var2 = new vf1(yf1Var);
                ga1.g("TextView.set_font_style", vf1Var2);
                arrayList182.add(vf1Var2);
                ArrayList<zc1> arrayList192 = yf1Var.g0.k0;
                wf1 wf1Var2 = new wf1(yf1Var);
                ga1.g("TextView.get_text", wf1Var2);
                arrayList192.add(wf1Var2);
                ArrayList<zc1> arrayList202 = yf1Var.g0.k0;
                xf1 xf1Var2 = new xf1(yf1Var);
                ga1.g("TextView.set_text", xf1Var2);
                arrayList202.add(xf1Var2);
                ArrayList<zc1> arrayList212 = yf1Var.g0.k0;
                of1 of1Var2 = new of1(yf1Var);
                ga1.g("TextView.align", of1Var2);
                arrayList212.add(of1Var2);
                yf1Var.g0.l0.add("TextView.set_visible");
                yf1Var.g0.l0.add("TextView.set_bounds");
                yf1Var.g0.l0.add(str62);
                yf1Var.g0.l0.add("TextView.set_background_color");
                yf1Var.g0.l0.add("TextView.set_typeface");
                yf1Var.g0.l0.add("TextView.set_font_size");
                yf1Var.g0.l0.add("TextView.set_font_style");
                yf1Var.g0.l0.add("TextView.get_text");
                yf1Var.g0.l0.add("TextView.set_text");
                yf1Var.g0.l0.add("TextView.align");
                ob1Var2 = ob1Var;
                ob1Var2.Q.put(Integer.valueOf(i), yf1Var);
                ob1Var2.V.put(Integer.valueOf(i), yf1Var);
                hashMap = ob1Var2.U;
                valueOf = Integer.valueOf(i);
                bool = Boolean.FALSE;
                gf1Var = yf1Var;
            }
            hashMap.put(valueOf, bool);
            ob1Var2.a(gf1Var, js.OTHER);
        }
    }
}