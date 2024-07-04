package defpackage;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import javax.annotation.Nullable;

/* renamed from: uu3  reason: default package */
public final class uu3 implements SensorEventListener {
    public final Context a;
    @Nullable
    public SensorManager b;
    public Sensor c;
    public long d;
    public int e;
    public tu3 f;
    public boolean g;

    public uu3(Context context) {
        this.a = context;
    }

    public final void a() {
        SensorManager sensorManager;
        Sensor sensor;
        synchronized (this) {
            l92 l92Var = x92.B7;
            w82 w82Var = w82.d;
            if (!((Boolean) w82Var.c.a(l92Var)).booleanValue()) {
                return;
            }
            if (this.b == null) {
                SensorManager sensorManager2 = (SensorManager) this.a.getSystemService("sensor");
                this.b = sensorManager2;
                if (sensorManager2 == null) {
                    sv2.g("Shake detection failed to initialize. Failed to obtain accelerometer.");
                    return;
                }
                this.c = sensorManager2.getDefaultSensor(1);
            }
            if (!this.g && (sensorManager = this.b) != null && (sensor = this.c) != null) {
                sensorManager.registerListener(this, sensor, 2);
                jv5.A.j.getClass();
                this.d = System.currentTimeMillis() - ((Integer) w82Var.c.a(x92.D7)).intValue();
                this.g = true;
                vz3.k("Listening for shake gestures.");
            }
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        l92 l92Var = x92.B7;
        w82 w82Var = w82.d;
        if (((Boolean) w82Var.c.a(l92Var)).booleanValue()) {
            float[] fArr = sensorEvent.values;
            float f = fArr[0];
            float f2 = f / 9.80665f;
            float f3 = fArr[1] / 9.80665f;
            float f4 = fArr[2] / 9.80665f;
            if (((float) Math.sqrt((f4 * f4) + (f3 * f3) + (f2 * f2))) < ((Float) w82Var.c.a(x92.C7)).floatValue()) {
                return;
            }
            jv5.A.j.getClass();
            long currentTimeMillis = System.currentTimeMillis();
            if (this.d + ((Integer) w82Var.c.a(x92.D7)).intValue() > currentTimeMillis) {
                return;
            }
            if (this.d + ((Integer) w82Var.c.a(x92.E7)).intValue() < currentTimeMillis) {
                this.e = 0;
            }
            vz3.k("Shake detected.");
            this.d = currentTimeMillis;
            int i = this.e + 1;
            this.e = i;
            tu3 tu3Var = this.f;
            if (tu3Var != null) {
                if (i == ((Integer) w82Var.c.a(x92.F7)).intValue()) {
                    ((cu3) tu3Var).d(new zt3(), bu3.GESTURE);
                }
            }
        }
    }
}