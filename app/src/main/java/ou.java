package defpackage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.LinearLayout;
import com.google.android.material.tabs.TabLayout;
import defpackage.ou;

/* renamed from: ou  reason: default package */
public final class ou extends m5 {
    public final TabLayout R;
    public final String S;

    /* renamed from: ou$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class a extends WebViewClient {
        public final /* synthetic */ WebView a;
        public final /* synthetic */ View b;

        public a(WebView webView, View view) {
            this.a = webView;
            this.b = view;
        }

        @Override // android.webkit.WebViewClient
        public final void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            this.a.setVisibility(0);
            this.b.setVisibility(8);
        }
    }

    /* renamed from: ou$b */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class b implements TabLayout.d {
        public final /* synthetic */ WebView a;

        public b(WebView webView) {
            this.a = webView;
        }

        @Override // com.google.android.material.tabs.TabLayout.d
        public final void a(TabLayout.f fVar) {
        }

        @Override // com.google.android.material.tabs.TabLayout.d
        public final void b(TabLayout.f fVar) {
        }

        @Override // com.google.android.material.tabs.TabLayout.d
        public final void c(TabLayout.f fVar) {
            WebView webView = this.a;
            StringBuilder b = e5.b("setActiveCategory(");
            b.append(fVar.a);
            b.append(")");
            webView.evaluateJavascript(b.toString(), null);
        }
    }

    /* renamed from: ou$c */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class c {
        public c() {
        }

        @JavascriptInterface
        public void registerCategories(final String[] strArr, final String[] strArr2) {
            h21.a(new Runnable() { // from class: pu
                @Override // java.lang.Runnable
                public final void run() {
                    TabLayout.f fVar;
                    float f;
                    ou.c cVar = ou.c.this;
                    String[] strArr3 = strArr;
                    String[] strArr4 = strArr2;
                    ou ouVar = ou.this;
                    ouVar.R.g();
                    for (int i = 0; i < strArr4.length; i++) {
                        TabLayout tabLayout = ouVar.R;
                        TabLayout.f f2 = tabLayout.f();
                        String str = strArr4[i];
                        if (TextUtils.isEmpty(f2.d) && !TextUtils.isEmpty(str)) {
                            f2.i.setContentDescription(str);
                        }
                        f2.c = str;
                        TabLayout.h hVar = f2.i;
                        if (hVar != null) {
                            hVar.f();
                        }
                        f2.a = Integer.valueOf(i);
                        boolean isEmpty = tabLayout.P.isEmpty();
                        int size = tabLayout.P.size();
                        if (f2.h == tabLayout) {
                            f2.e = size;
                            tabLayout.P.add(size, f2);
                            int size2 = tabLayout.P.size();
                            while (true) {
                                size++;
                                if (size >= size2) {
                                    break;
                                }
                                tabLayout.P.get(size).e = size;
                            }
                            TabLayout.h hVar2 = f2.i;
                            hVar2.setSelected(false);
                            hVar2.setActivated(false);
                            TabLayout.e eVar = tabLayout.S;
                            int i2 = f2.e;
                            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
                            if (tabLayout.r0 == 1 && tabLayout.o0 == 0) {
                                layoutParams.width = 0;
                                f = 1.0f;
                            } else {
                                layoutParams.width = -2;
                                f = 0.0f;
                            }
                            layoutParams.weight = f;
                            eVar.addView(hVar2, i2, layoutParams);
                            if (isEmpty) {
                                TabLayout tabLayout2 = f2.h;
                                if (tabLayout2 != null) {
                                    tabLayout2.h(f2, true);
                                } else {
                                    throw new IllegalArgumentException("Tab not attached to a TabLayout");
                                }
                            }
                        } else {
                            throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
                        }
                    }
                    if (ouVar.S != null) {
                        for (int i3 = 0; i3 < strArr3.length; i3++) {
                            if (strArr3[i3].equals(ouVar.S)) {
                                TabLayout tabLayout3 = ouVar.R;
                                if (i3 >= 0) {
                                    if (i3 < tabLayout3.getTabCount()) {
                                        fVar = tabLayout3.P.get(i3);
                                        tabLayout3.h(fVar, true);
                                        return;
                                    }
                                } else {
                                    tabLayout3.getClass();
                                }
                                fVar = null;
                                tabLayout3.h(fVar, true);
                                return;
                            }
                        }
                    }
                }
            });
        }
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    public ou(Context context, String str) {
        super(context, 2131820555);
        this.S = str;
        setContentView(2131492923);
        View findViewById = findViewById(2131296463);
        View findViewById2 = findViewById(2131296328);
        TabLayout tabLayout = (TabLayout) findViewById(2131296609);
        this.R = tabLayout;
        WebView webView = (WebView) findViewById(2131296672);
        findViewById2.setOnClickListener(new nu(0, this));
        webView.getSettings().setJavaScriptEnabled(true);
        webView.addJavascriptInterface(new c(), "ToolboxHelp");
        webView.getSettings().setCacheMode(2);
        webView.setWebViewClient(new a(webView, findViewById));
        webView.loadUrl("https://mrarm.io/u/ToolboxHelp.html");
        b bVar = new b(webView);
        if (!tabLayout.v0.contains(bVar)) {
            tabLayout.v0.add(bVar);
        }
    }
}