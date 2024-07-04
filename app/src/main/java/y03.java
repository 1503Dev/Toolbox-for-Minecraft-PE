package defpackage;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* renamed from: y03  reason: default package */
public interface y03 extends vj1, oi3, p03, pi2, r13, u13, aj2, s22, c23, yn5, e23, f23, gy2, g23 {
    void A0(k23 k23Var);

    void B0();

    ci4 C();

    void C0(String str, mg2 mg2Var);

    boolean D();

    void D0(String str, mg2 mg2Var);

    void F(mc2 mc2Var);

    void F0();

    void G(Context context);

    void G0(qf4 qf4Var);

    void I(yh4 yh4Var, ci4 ci4Var);

    void I0(qn5 qn5Var);

    void J0(boolean z);

    boolean K0(int i, boolean z);

    k23 L();

    void L0();

    z32 M();

    qn5 N();

    void N0(qn5 qn5Var);

    qn5 O();

    void O0(int i);

    void P0(boolean z);

    void Q(kc2 kc2Var);

    g13 R();

    void S(int i);

    void T(boolean z);

    boolean V();

    void W();

    void X(String str, String str2);

    boolean Y();

    String a0();

    void b0(boolean z);

    boolean c0();

    boolean canGoBack();

    mc2 d0();

    void destroy();

    void e0(String str, vi2 vi2Var);

    void f0();

    Activity g();

    @Override // defpackage.u13, defpackage.gy2
    Context getContext();

    int getHeight();

    ViewGroup.LayoutParams getLayoutParams();

    void getLocationOnScreen(int[] iArr);

    int getMeasuredHeight();

    int getMeasuredWidth();

    ViewParent getParent();

    int getWidth();

    void goBack();

    void i0(boolean z);

    uj1 j();

    void j0(hw hwVar);

    xv2 k();

    boolean k0();

    void l0();

    void loadData(String str, String str2, String str3);

    void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5);

    void loadUrl(String str);

    WebView m0();

    void measure(int i, int i2);

    ka2 o();

    hw o0();

    void onPause();

    void onResume();

    void p0();

    q13 q();

    rz1 r();

    Context s0();

    @Override // defpackage.gy2
    void setBackgroundColor(int i);

    void setOnClickListener(View.OnClickListener onClickListener);

    void setOnTouchListener(View.OnTouchListener onTouchListener);

    void setWebChromeClient(WebChromeClient webChromeClient);

    void setWebViewClient(WebViewClient webViewClient);

    dz4 t0();

    void u0();

    void v(String str, oz2 oz2Var);

    void w0(boolean z);

    View x();

    void y(q13 q13Var);

    boolean y0();

    yh4 z();

    WebViewClient z0();
}