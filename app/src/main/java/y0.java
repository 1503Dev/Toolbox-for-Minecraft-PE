package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import io.mrarm.yurai.xbox.XboxLoginActivity;
import java.io.File;

/* renamed from: y0  reason: default package */
public final class y0 {
    public final File a;

    public y0(XboxLoginActivity xboxLoginActivity) {
        File file = new File(xboxLoginActivity.getCacheDir(), "msa-profile-pictures");
        this.a = file;
        file.mkdirs();
    }

    public static Bitmap a(Bitmap bitmap) {
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        canvas.drawCircle(bitmap.getWidth() / 2.0f, bitmap.getHeight() / 2.0f, bitmap.getWidth() / 2.0f, paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        return createBitmap;
    }

    public final File b(String str) {
        return new File(this.a, ij.c("account-", str, ".png"));
    }
}