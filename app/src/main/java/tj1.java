package defpackage;

import android.net.Uri;
import android.util.Log;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

/* renamed from: tj1  reason: default package */
public final class tj1 extends Thread {
    public final /* synthetic */ Map P;

    public tj1(HashMap hashMap) {
        this.P = hashMap;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        String sb;
        Map map = this.P;
        Uri.Builder buildUpon = Uri.parse("https://pagead2.googlesyndication.com/pagead/gen_204?id=gmob-apps").buildUpon();
        for (String str : map.keySet()) {
            buildUpon.appendQueryParameter(str, (String) map.get(str));
        }
        String uri = buildUpon.build().toString();
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(uri).openConnection();
            try {
                int responseCode = httpURLConnection.getResponseCode();
                if (responseCode < 200 || responseCode >= 300) {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(uri).length() + 65);
                    sb2.append("Received non-success response code ");
                    sb2.append(responseCode);
                    sb2.append(" from pinging URL: ");
                    sb2.append(uri);
                    Log.w("HttpUrlPinger", sb2.toString());
                }
                httpURLConnection.disconnect();
            } catch (Throwable th) {
                httpURLConnection.disconnect();
                throw th;
            }
        } catch (IOException e) {
            e = e;
            String message = e.getMessage();
            StringBuilder sb3 = new StringBuilder(String.valueOf(uri).length() + 27 + String.valueOf(message).length());
            sb3.append("Error while pinging URL: ");
            sb3.append(uri);
            sb3.append(". ");
            sb3.append(message);
            sb = sb3.toString();
            Log.w("HttpUrlPinger", sb, e);
        } catch (IndexOutOfBoundsException e2) {
            e = e2;
            String message2 = e.getMessage();
            StringBuilder sb4 = new StringBuilder(String.valueOf(uri).length() + 32 + String.valueOf(message2).length());
            sb4.append("Error while parsing ping URL: ");
            sb4.append(uri);
            sb4.append(". ");
            sb4.append(message2);
            sb = sb4.toString();
            Log.w("HttpUrlPinger", sb, e);
        } catch (RuntimeException e3) {
            e = e3;
            String message3 = e.getMessage();
            StringBuilder sb32 = new StringBuilder(String.valueOf(uri).length() + 27 + String.valueOf(message3).length());
            sb32.append("Error while pinging URL: ");
            sb32.append(uri);
            sb32.append(". ");
            sb32.append(message3);
            sb = sb32.toString();
            Log.w("HttpUrlPinger", sb, e);
        }
    }
}