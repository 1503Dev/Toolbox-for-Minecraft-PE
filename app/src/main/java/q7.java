package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Handler;
import android.util.Log;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.net.URL;

/* renamed from: q7  reason: default package */
public final class q7 {
    public Handler a = new Handler();
    public y0 b;

    /* renamed from: q7$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class a implements Runnable {
        public final b P;

        /* renamed from: q7$a$a  reason: collision with other inner class name */
        /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
        public class C0046a {
            public C0046a() {
            }
        }

        public a(b bVar) {
            this.P = bVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.P.a.get() == null) {
                return;
            }
            y0 y0Var = q7.this.b;
            String str = this.P.b;
            C0046a c0046a = new C0046a();
            y0Var.getClass();
            String format = String.format("https://storage.live.com/users/0x%s/myprofile/expressionprofile/profilephoto:UserTileStatic", str);
            Bitmap decodeFile = BitmapFactory.decodeFile(y0Var.b(str).getAbsolutePath());
            if (decodeFile != null) {
                Log.d("AccountImageLoader", "Loaded image from cache for " + str);
                q7.this.a.post(new p7(c0046a, decodeFile));
            }
            try {
                Log.d("AccountImageLoader", "Loading image from network for " + str + " from " + format);
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(format).openConnection();
                httpURLConnection.setUseCaches(true);
                if (httpURLConnection.getResponseCode() == 404) {
                    y0Var.b(str).delete();
                    q7.this.a.post(new p7(c0046a, null));
                }
                if (httpURLConnection.getResponseCode() == 200) {
                    Bitmap a = y0.a(BitmapFactory.decodeStream(httpURLConnection.getInputStream()));
                    Log.d("AccountImageLoader", "Loaded image from network for " + str);
                    q7.this.a.post(new p7(c0046a, a));
                    FileOutputStream fileOutputStream = new FileOutputStream(y0Var.b(str));
                    a.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
                    fileOutputStream.close();
                }
            } catch (IOException e) {
                Log.d("AccountImageLoader", "Failed to load image from network for " + str);
                e.printStackTrace();
            }
        }
    }

    /* renamed from: q7$b */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class b {
        public WeakReference<c> a;
        public String b;

        public b(c cVar, String str) {
            this.a = new WeakReference<>(cVar);
            this.b = str;
        }
    }

    /* renamed from: q7$c */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public interface c {
        void a(Bitmap bitmap);
    }

    public q7(y0 y0Var) {
        this.b = y0Var;
    }
}