package defpackage;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.os.Message;
import android.view.View;
import android.view.WindowManager;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebStorage;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;

/* renamed from: x03  reason: default package */
public final class x03 extends WebChromeClient {
    public final y03 a;

    public x03(l13 l13Var) {
        this.a = l13Var;
    }

    public static final Context b(WebView webView) {
        if (webView instanceof y03) {
            y03 y03Var = (y03) webView;
            Activity g = y03Var.g();
            return g != null ? g : y03Var.getContext();
        }
        return webView.getContext();
    }

    public final boolean a(Context context, String str, String str2, String str3, String str4, JsResult jsResult, JsPromptResult jsPromptResult, boolean z) {
        y03 y03Var;
        AlertDialog.Builder onCancelListener;
        o82 o82Var;
        try {
            y03Var = this.a;
        } catch (WindowManager.BadTokenException e) {
            sv2.h("Fail to display Dialog.", e);
        }
        if (y03Var != null && y03Var.R() != null && this.a.R().h0 != null && (o82Var = this.a.R().h0) != null && !o82Var.b()) {
            o82Var.a("window." + str + "('" + str3 + "')");
            return false;
        }
        cu5 cu5Var = jv5.A.c;
        AlertDialog.Builder e2 = cu5.e(context);
        e2.setTitle(str2);
        if (z) {
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            TextView textView = new TextView(context);
            textView.setText(str3);
            EditText editText = new EditText(context);
            editText.setText(str4);
            linearLayout.addView(textView);
            linearLayout.addView(editText);
            onCancelListener = e2.setView(linearLayout).setPositiveButton(17039370, new v03(jsPromptResult, editText)).setNegativeButton(17039360, new u03(jsPromptResult)).setOnCancelListener(new t03(jsPromptResult));
        } else {
            onCancelListener = e2.setMessage(str3).setPositiveButton(17039370, new s03(jsResult)).setNegativeButton(17039360, new r03(jsResult)).setOnCancelListener(new q03(jsResult));
        }
        onCancelListener.create().show();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final void onCloseWindow(WebView webView) {
        String str;
        if (webView instanceof y03) {
            qn5 N = ((y03) webView).N();
            if (N != null) {
                N.c();
                return;
            }
            str = "Tried to close an AdWebView not associated with an overlay.";
        } else {
            str = "Tried to close a WebView that wasn't an AdWebView.";
        }
        sv2.g(str);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        String message = consoleMessage.message();
        String sourceId = consoleMessage.sourceId();
        int lineNumber = consoleMessage.lineNumber();
        StringBuilder b = sd1.b("JS: ", message, " (", sourceId, ":");
        b.append(lineNumber);
        b.append(")");
        String sb = b.toString();
        if (sb.contains("Application Cache")) {
            return super.onConsoleMessage(consoleMessage);
        }
        int i = w03.a[consoleMessage.messageLevel().ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3 && i != 4 && i == 5) {
                    sv2.b(sb);
                } else {
                    sv2.f(sb);
                }
            } else {
                sv2.g(sb);
            }
        } else {
            sv2.d(sb);
        }
        return super.onConsoleMessage(consoleMessage);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
        WebView.WebViewTransport webViewTransport = (WebView.WebViewTransport) message.obj;
        WebView webView2 = new WebView(webView.getContext());
        if (this.a.z0() != null) {
            webView2.setWebViewClient(this.a.z0());
        }
        webViewTransport.setWebView(webView2);
        message.sendToTarget();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final void onExceededDatabaseQuota(String str, String str2, long j, long j2, long j3, WebStorage.QuotaUpdater quotaUpdater) {
        long j4 = 5242880 - j3;
        if (j4 <= 0) {
            quotaUpdater.updateQuota(j);
            return;
        }
        if (j == 0) {
            if (j2 > j4 || j2 > 1048576) {
                j2 = 0;
            }
        } else if (j2 == 0) {
            j2 = Math.min(Math.min(131072L, j4) + j, 1048576L);
        } else {
            if (j2 <= Math.min(1048576 - j, j4)) {
                j += j2;
            }
            j2 = j;
        }
        quotaUpdater.updateQuota(j2);
    }

    @Override // android.webkit.WebChromeClient
    public final void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        boolean z;
        if (callback != null) {
            jv5 jv5Var = jv5.A;
            cu5 cu5Var = jv5Var.c;
            if (!cu5.E(this.a.getContext(), "android.permission.ACCESS_FINE_LOCATION")) {
                cu5 cu5Var2 = jv5Var.c;
                if (!cu5.E(this.a.getContext(), "android.permission.ACCESS_COARSE_LOCATION")) {
                    z = false;
                    callback.invoke(str, z, true);
                }
            }
            z = true;
            callback.invoke(str, z, true);
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onHideCustomView() {
        qn5 N = this.a.N();
        if (N == null) {
            sv2.g("Could not get ad overlay when hiding custom view.");
        } else {
            N.e();
        }
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        return a(b(webView), "alert", str, str2, null, jsResult, null, false);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
        return a(b(webView), "onBeforeUnload", str, str2, null, jsResult, null, false);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        return a(b(webView), "confirm", str, str2, null, jsResult, null, false);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        return a(b(webView), "prompt", str, str2, str3, null, jsPromptResult, true);
    }

    @Override // android.webkit.WebChromeClient
    @Deprecated
    public final void onShowCustomView(View view, int i, WebChromeClient.CustomViewCallback customViewCallback) {
        qn5 N = this.a.N();
        if (N == null) {
            sv2.g("Could not get ad overlay when showing custom view.");
            customViewCallback.onCustomViewHidden();
            return;
        }
        FrameLayout frameLayout = new FrameLayout(N.Q);
        N.W = frameLayout;
        frameLayout.setBackgroundColor(-16777216);
        N.W.addView(view, -1, -1);
        N.Q.setContentView(N.W);
        N.f0 = true;
        N.X = customViewCallback;
        N.V = true;
        N.x4(i);
    }

    @Override // android.webkit.WebChromeClient
    public final void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        onShowCustomView(view, -1, customViewCallback);
    }
}