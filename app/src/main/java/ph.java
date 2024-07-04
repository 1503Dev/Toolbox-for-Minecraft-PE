package defpackage;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import defpackage.xv;

/* renamed from: ph  reason: default package */
public final class ph {
    public final Intent a;
    public final Bundle b;

    /* renamed from: ph$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static final class a {
        public final Intent a;
        public final lh b;
        public Bundle c;
        public boolean d;

        public a() {
            this.a = new Intent("android.intent.action.VIEW");
            this.b = new lh();
            this.d = true;
        }

        public a(rh rhVar) {
            Intent intent = new Intent("android.intent.action.VIEW");
            this.a = intent;
            this.b = new lh();
            this.d = true;
            if (rhVar != null) {
                intent.setPackage(((ComponentName) rhVar.d).getPackageName());
                xv.a aVar = (xv.a) ((xv) rhVar.c);
                aVar.getClass();
                PendingIntent pendingIntent = (PendingIntent) rhVar.e;
                Bundle bundle = new Bundle();
                bundle.putBinder("android.support.customtabs.extra.SESSION", aVar);
                if (pendingIntent != null) {
                    bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
                }
                intent.putExtras(bundle);
            }
        }

        public final ph a() {
            if (!this.a.hasExtra("android.support.customtabs.extra.SESSION")) {
                Bundle bundle = new Bundle();
                bundle.putBinder("android.support.customtabs.extra.SESSION", null);
                this.a.putExtras(bundle);
            }
            this.a.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", this.d);
            Intent intent = this.a;
            lh lhVar = this.b;
            Integer num = lhVar.a;
            Integer num2 = lhVar.b;
            Bundle bundle2 = new Bundle();
            if (num != null) {
                bundle2.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", num.intValue());
            }
            if (num2 != null) {
                bundle2.putInt("android.support.customtabs.extra.SECONDARY_TOOLBAR_COLOR", num2.intValue());
            }
            intent.putExtras(bundle2);
            this.a.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", 0);
            return new ph(this.a, this.c);
        }
    }

    public ph(Intent intent, Bundle bundle) {
        this.a = intent;
        this.b = bundle;
    }
}