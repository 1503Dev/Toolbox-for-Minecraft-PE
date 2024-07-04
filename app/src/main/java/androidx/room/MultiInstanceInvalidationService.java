package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.util.Log;
import java.util.HashMap;

public class MultiInstanceInvalidationService extends Service {
    public int P = 0;
    public final HashMap<Integer, String> Q = new HashMap<>();
    public final a R = new a();
    public final b S = new b();

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class a extends RemoteCallbackList<ew> {
        public a() {
        }

        @Override // android.os.RemoteCallbackList
        public final void onCallbackDied(ew ewVar, Object obj) {
            MultiInstanceInvalidationService.this.Q.remove(Integer.valueOf(((Integer) obj).intValue()));
        }
    }

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class b extends fw {
        public b() {
        }

        public final void A(String[] strArr, int i) {
            synchronized (MultiInstanceInvalidationService.this.R) {
                String str = MultiInstanceInvalidationService.this.Q.get(Integer.valueOf(i));
                if (str == null) {
                    Log.w("ROOM", "Remote invalidation client ID not registered");
                    return;
                }
                int beginBroadcast = MultiInstanceInvalidationService.this.R.beginBroadcast();
                for (int i2 = 0; i2 < beginBroadcast; i2++) {
                    int intValue = ((Integer) MultiInstanceInvalidationService.this.R.getBroadcastCookie(i2)).intValue();
                    String str2 = MultiInstanceInvalidationService.this.Q.get(Integer.valueOf(intValue));
                    if (i != intValue && str.equals(str2)) {
                        try {
                            MultiInstanceInvalidationService.this.R.getBroadcastItem(i2).N1(strArr);
                        } catch (RemoteException e) {
                            Log.w("ROOM", "Error invoking a remote callback", e);
                        }
                    }
                }
                MultiInstanceInvalidationService.this.R.finishBroadcast();
            }
        }

        public final int Z(ew ewVar, String str) {
            if (str == null) {
                return 0;
            }
            synchronized (MultiInstanceInvalidationService.this.R) {
                MultiInstanceInvalidationService multiInstanceInvalidationService = MultiInstanceInvalidationService.this;
                int i = multiInstanceInvalidationService.P + 1;
                multiInstanceInvalidationService.P = i;
                if (multiInstanceInvalidationService.R.register(ewVar, Integer.valueOf(i))) {
                    MultiInstanceInvalidationService.this.Q.put(Integer.valueOf(i), str);
                    return i;
                }
                MultiInstanceInvalidationService multiInstanceInvalidationService2 = MultiInstanceInvalidationService.this;
                multiInstanceInvalidationService2.P--;
                return 0;
            }
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return this.S;
    }
}