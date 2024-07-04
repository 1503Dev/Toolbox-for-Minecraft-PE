package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.MutableContextWrapper;

/* renamed from: j23  reason: default package */
public final class j23 extends MutableContextWrapper {
    public Activity a;
    public Context b;
    public Context c;

    public j23(Context context) {
        super(context);
        setBaseContext(context);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        return this.c.getSystemService(str);
    }

    @Override // android.content.MutableContextWrapper
    public final void setBaseContext(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.b = applicationContext;
        this.a = context instanceof Activity ? (Activity) context : null;
        this.c = context;
        super.setBaseContext(applicationContext);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void startActivity(Intent intent) {
        Activity activity = this.a;
        if (activity != null) {
            activity.startActivity(intent);
            return;
        }
        intent.setFlags(268435456);
        this.b.startActivity(intent);
    }
}