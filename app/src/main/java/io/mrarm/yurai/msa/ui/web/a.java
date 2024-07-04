package io.mrarm.yurai.msa.ui.web;

import android.webkit.JavascriptInterface;

public final class a {
    public InterfaceC0041a a;
    public kz b = new kz();

    /* renamed from: io.mrarm.yurai.msa.ui.web.a$a  reason: collision with other inner class name */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public interface InterfaceC0041a {
        void d(kz kzVar);

        void g();
    }

    public a(InterfaceC0041a interfaceC0041a) {
        this.a = interfaceC0041a;
    }

    @JavascriptInterface
    public void FinalBack() {
        this.a.g();
    }

    @JavascriptInterface
    public void FinalNext() {
        this.a.d(this.b);
    }

    @JavascriptInterface
    public String Property(String str) {
        return this.b.a(str);
    }

    @JavascriptInterface
    public void Property(String str, String str2) {
        this.b.a.put(str, str2);
    }
}