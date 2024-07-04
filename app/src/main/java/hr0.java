package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.preference.PreferenceManager;
import android.text.method.LinkMovementMethod;
import android.view.View;
import com.warkiz.widget.IndicatorSeekBar;
import defpackage.ve0;
import defpackage.xs0;
import io.mrarm.mctoolbox.DiagnosticActivity;
import io.mrarm.mctoolbox.ui.AppBottomSheetDialog;
import java.util.Iterator;
import java.util.Objects;

/* renamed from: hr0  reason: default package */
public final class hr0 extends AppBottomSheetDialog {
    public static final /* synthetic */ int U = 0;

    /* renamed from: hr0$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class a implements gc0 {
        public final /* synthetic */ SharedPreferences a;

        public a(SharedPreferences sharedPreferences) {
            this.a = sharedPreferences;
        }

        @Override // defpackage.gc0
        public final void a(rq0 rq0Var) {
        }

        @Override // defpackage.gc0
        public final void b() {
        }

        @Override // defpackage.gc0
        public final void c(IndicatorSeekBar indicatorSeekBar) {
            this.a.edit().putFloat("shortcut_alpha", indicatorSeekBar.getProgressFloat()).apply();
        }
    }

    public hr0(final Context context, final tv tvVar, final uv uvVar) {
        super(context);
        setContentView(2131492930);
        View findViewById = findViewById(2131296580);
        Objects.requireNonNull(findViewById);
        rl rlVar = (rl) jj.a(findViewById);
        rlVar.S(new nu(1, this));
        rlVar.j0.setOnClickListener(new View.OnClickListener() { // from class: cr0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                String str;
                uv uvVar2 = uv.this;
                Context context2 = context;
                Iterator it = ((ve0) uvVar2).c.iterator();
                sg0 sg0Var = null;
                sg0 sg0Var2 = null;
                while (true) {
                    if (it.hasNext()) {
                        ve0.a aVar = (ve0.a) it.next();
                        if (aVar instanceof ve0.b) {
                            if (sg0Var2 != null) {
                                break;
                            }
                            sg0 sg0Var3 = aVar.c;
                            if (sg0Var3 != null) {
                                sg0Var2 = sg0Var3;
                            }
                        }
                    } else {
                        sg0Var = sg0Var2;
                        break;
                    }
                }
                if (sg0Var != null) {
                    str = String.format("https://play.google.com/store/account/subscriptions?sku=%s&package=%s", sg0Var.a().get(0), context2.getPackageName());
                } else {
                    str = "https://play.google.com/store/account/subscriptions";
                }
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(Uri.parse(str));
                context2.startActivity(intent);
            }
        });
        cy0 cy0Var = (cy0) tvVar;
        cy0Var.a();
        if (!cy0Var.d.g()) {
            rlVar.i0.setVisibility(8);
        }
        rlVar.i0.setOnClickListener(new View.OnClickListener() { // from class: dr0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ((cy0) tv.this).c();
            }
        });
        rlVar.l0.setOnClickListener(new vk(2, context));
        rlVar.n0.setMovementMethod(new LinkMovementMethod());
        rlVar.R(true);
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        ya0 ya0Var = new ya0(defaultSharedPreferences.getBoolean("log_overlay_enabled", false));
        rlVar.V(e(defaultSharedPreferences, "show_premium_expire_popup", true));
        rlVar.T(ya0Var);
        ya0Var.a(new xs0(new m80(1, defaultSharedPreferences, ya0Var)));
        rlVar.T(e(defaultSharedPreferences, "log_overlay_enabled", false));
        rlVar.U(e(defaultSharedPreferences, "logcat_record_active", false));
        rlVar.f0.setProgress(defaultSharedPreferences.getFloat("shortcut_alpha", 1.0f));
        rlVar.f0.setIndicatorTextCallback(new er0());
        rlVar.f0.setOnSeekChangeListener(new a(defaultSharedPreferences));
        rlVar.h0.setOnClickListener(new View.OnClickListener() { // from class: fr0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DiagnosticActivity.r(view.getContext());
            }
        });
    }

    public static ya0 e(final SharedPreferences sharedPreferences, final String str, boolean z) {
        final ya0 ya0Var = new ya0(sharedPreferences.getBoolean(str, z));
        ya0Var.a(new xs0(new xs0.a() { // from class: gr0
            @Override // defpackage.xs0.a
            public final void a() {
                SharedPreferences sharedPreferences2 = sharedPreferences;
                sharedPreferences2.edit().putBoolean(str, ya0Var.Q).apply();
            }
        }));
        return ya0Var;
    }
}