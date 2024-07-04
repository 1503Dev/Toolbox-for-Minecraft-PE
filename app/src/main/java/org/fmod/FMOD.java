package org.fmod;

import android.content.Context;
import android.content.res.AssetManager;
import android.media.AudioManager;
import android.util.Log;

public class FMOD {
    public static Context gContext;

    public static boolean checkInit() {
        boolean z;
        StringBuilder b = e5.b("checkInit: ");
        if (gContext != null) {
            z = true;
        } else {
            z = false;
        }
        b.append(z);
        Log.i("FMod", b.toString());
        if (gContext != null) {
            return true;
        }
        return false;
    }

    public static void close() {
        Log.i("FMod", "close");
        gContext = null;
    }

    public static AssetManager getAssetManager() {
        Log.i("FMod", "getAssetManager");
        Context context = gContext;
        if (context == null) {
            return null;
        }
        return context.getAssets();
    }

    public static int getOutputBlockSize() {
        Log.i("FMod", "getOutputBlockSize");
        Context context = gContext;
        if (context == null) {
            return 0;
        }
        return Integer.parseInt(((AudioManager) context.getSystemService("audio")).getProperty("android.media.property.OUTPUT_FRAMES_PER_BUFFER"));
    }

    public static int getOutputSampleRate() {
        Log.i("FMod", "getOutputSampleRate");
        Context context = gContext;
        if (context == null) {
            return 0;
        }
        return Integer.parseInt(((AudioManager) context.getSystemService("audio")).getProperty("android.media.property.OUTPUT_SAMPLE_RATE"));
    }

    public static void init(Context context) {
        gContext = context;
        Log.i("FMod", "init");
    }

    public static boolean supportsLowLatency() {
        Log.i("FMod", "supportsLowLatency");
        Context context = gContext;
        if (context == null) {
            return false;
        }
        return context.getPackageManager().hasSystemFeature("android.hardware.audio.low_latency");
    }
}