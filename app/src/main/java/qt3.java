package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.Base64;
import java.io.ByteArrayOutputStream;
import org.json.JSONObject;

/* renamed from: qt3  reason: default package */
public final class qt3 {
    public final Context a;
    public final ApplicationInfo b;
    public final int c;
    public final int d;
    public String e = "";

    public qt3(Context context) {
        this.a = context;
        this.b = context.getApplicationInfo();
        m92 m92Var = x92.K7;
        w82 w82Var = w82.d;
        this.c = ((Integer) w82Var.c.a(m92Var)).intValue();
        this.d = ((Integer) w82Var.c.a(x92.L7)).intValue();
    }

    public final JSONObject a() {
        Drawable drawable;
        String encodeToString;
        JSONObject jSONObject = new JSONObject();
        try {
            md0 a = c81.a(this.a);
            jSONObject.put("name", a.a.getPackageManager().getApplicationLabel(a.a.getPackageManager().getApplicationInfo(this.b.packageName, 0)));
        } catch (PackageManager.NameNotFoundException unused) {
        }
        jSONObject.put("packageName", this.b.packageName);
        cu5 cu5Var = jv5.A.c;
        jSONObject.put("adMobAppId", cu5.y(this.a));
        if (this.e.isEmpty()) {
            try {
                md0 a2 = c81.a(this.a);
                ApplicationInfo applicationInfo = a2.a.getPackageManager().getApplicationInfo(this.b.packageName, 0);
                a2.a.getPackageManager().getApplicationLabel(applicationInfo);
                drawable = a2.a.getPackageManager().getApplicationIcon(applicationInfo);
            } catch (PackageManager.NameNotFoundException unused2) {
                drawable = null;
            }
            if (drawable == null) {
                encodeToString = "";
            } else {
                drawable.setBounds(0, 0, this.c, this.d);
                Bitmap createBitmap = Bitmap.createBitmap(this.c, this.d, Bitmap.Config.ARGB_8888);
                drawable.draw(new Canvas(createBitmap));
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                createBitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                encodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
            }
            this.e = encodeToString;
        }
        if (!this.e.isEmpty()) {
            jSONObject.put("icon", this.e);
            jSONObject.put("iconWidthPx", this.c);
            jSONObject.put("iconHeightPx", this.d);
        }
        return jSONObject;
    }
}