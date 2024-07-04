package defpackage;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.view.Display;
import android.view.WindowManager;

/* renamed from: dy2  reason: default package */
public final class dy2 implements SensorEventListener {
    public final SensorManager a;
    public final Display c;
    public float[] f;
    public br4 g;
    public cy2 h;
    public final float[] d = new float[9];
    public final float[] e = new float[9];
    public final Object b = new Object();

    public dy2(Context context) {
        this.a = (SensorManager) context.getSystemService("sensor");
        this.c = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
    }

    public final void a() {
        if (this.g == null) {
            return;
        }
        this.a.unregisterListener(this);
        this.g.post(new by2());
        this.g = null;
    }

    public final boolean b(float[] fArr) {
        synchronized (this.b) {
            float[] fArr2 = this.f;
            if (fArr2 == null) {
                return false;
            }
            System.arraycopy(fArr2, 0, fArr, 0, 9);
            return true;
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        float[] fArr = sensorEvent.values;
        if (fArr[0] != 0.0f || fArr[1] != 0.0f || fArr[2] != 0.0f) {
            synchronized (this.b) {
                if (this.f == null) {
                    this.f = new float[9];
                }
            }
            SensorManager.getRotationMatrixFromVector(this.d, fArr);
            int rotation = this.c.getRotation();
            if (rotation != 1) {
                if (rotation != 2) {
                    if (rotation != 3) {
                        System.arraycopy(this.d, 0, this.e, 0, 9);
                    } else {
                        SensorManager.remapCoordinateSystem(this.d, 130, 1, this.e);
                    }
                } else {
                    SensorManager.remapCoordinateSystem(this.d, 129, 130, this.e);
                }
            } else {
                SensorManager.remapCoordinateSystem(this.d, 2, 129, this.e);
            }
            float[] fArr2 = this.e;
            float f = fArr2[1];
            fArr2[1] = fArr2[3];
            fArr2[3] = f;
            float f2 = fArr2[2];
            fArr2[2] = fArr2[6];
            fArr2[6] = f2;
            float f3 = fArr2[5];
            fArr2[5] = fArr2[7];
            fArr2[7] = f3;
            synchronized (this.b) {
                System.arraycopy(this.e, 0, this.f, 0, 9);
            }
            cy2 cy2Var = this.h;
            if (cy2Var != null) {
                ey2 ey2Var = (ey2) cy2Var;
                synchronized (ey2Var.j0) {
                    ey2Var.j0.notifyAll();
                }
            }
        }
    }
}