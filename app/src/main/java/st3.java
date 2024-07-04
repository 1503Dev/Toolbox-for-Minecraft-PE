package defpackage;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import javax.annotation.Nullable;

/* renamed from: st3  reason: default package */
public final class st3 implements SensorEventListener {
    @Nullable
    public final SensorManager a;
    @Nullable
    public final Sensor b;
    public float c = 0.0f;
    public Float d = Float.valueOf(0.0f);
    public long e;
    public int f;
    public boolean g;
    public boolean h;
    @Nullable
    public rt3 i;
    public boolean j;

    public st3(Context context) {
        jv5.A.j.getClass();
        this.e = System.currentTimeMillis();
        this.f = 0;
        this.g = false;
        this.h = false;
        this.i = null;
        this.j = false;
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        this.a = sensorManager;
        if (sensorManager != null) {
            this.b = sensorManager.getDefaultSensor(4);
        } else {
            this.b = null;
        }
    }

    public final void a() {
        SensorManager sensorManager;
        Sensor sensor;
        synchronized (this) {
            if (!((Boolean) w82.d.c.a(x92.G7)).booleanValue()) {
                return;
            }
            if (!this.j && (sensorManager = this.a) != null && (sensor = this.b) != null) {
                sensorManager.registerListener(this, sensor, 2);
                this.j = true;
                vz3.k("Listening for flick gestures.");
            }
            if (this.a != null && this.b != null) {
                return;
            }
            sv2.g("Flick detection failed to initialize. Failed to obtain gyroscope.");
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        l92 l92Var = x92.G7;
        w82 w82Var = w82.d;
        if (!((Boolean) w82Var.c.a(l92Var)).booleanValue()) {
            return;
        }
        jv5.A.j.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        if (this.e + ((Integer) w82Var.c.a(x92.I7)).intValue() < currentTimeMillis) {
            this.f = 0;
            this.e = currentTimeMillis;
            this.g = false;
            this.h = false;
            this.c = this.d.floatValue();
        }
        Float valueOf = Float.valueOf(this.d.floatValue() + (sensorEvent.values[1] * 4.0f));
        this.d = valueOf;
        float floatValue = valueOf.floatValue();
        float f = this.c;
        o92 o92Var = x92.H7;
        if (floatValue > ((Float) w82Var.c.a(o92Var)).floatValue() + f) {
            this.c = this.d.floatValue();
            this.h = true;
        } else if (this.d.floatValue() < this.c - ((Float) w82Var.c.a(o92Var)).floatValue()) {
            this.c = this.d.floatValue();
            this.g = true;
        }
        if (this.d.isInfinite()) {
            this.d = Float.valueOf(0.0f);
            this.c = 0.0f;
        }
        if (this.g && this.h) {
            vz3.k("Flick detected.");
            this.e = currentTimeMillis;
            int i = this.f + 1;
            this.f = i;
            this.g = false;
            this.h = false;
            rt3 rt3Var = this.i;
            if (rt3Var != null) {
                if (i == ((Integer) w82Var.c.a(x92.J7)).intValue()) {
                    ((cu3) rt3Var).d(new au3(), bu3.GESTURE);
                }
            }
        }
    }
}