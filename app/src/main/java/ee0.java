package defpackage;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.util.Property;

/* renamed from: ee0  reason: default package */
public final class ee0<T> extends Property<T, Float> {
    public final Property<T, PointF> a;
    public final PathMeasure b;
    public final float c;
    public final float[] d;
    public final PointF e;
    public float f;

    public ee0(Property<T, PointF> property, Path path) {
        super(Float.class, property.getName());
        this.d = new float[2];
        this.e = new PointF();
        this.a = property;
        PathMeasure pathMeasure = new PathMeasure(path, false);
        this.b = pathMeasure;
        this.c = pathMeasure.getLength();
    }

    @Override // android.util.Property
    public final Float get(Object obj) {
        return Float.valueOf(this.f);
    }

    @Override // android.util.Property
    public final void set(Object obj, Float f) {
        Float f2 = f;
        this.f = f2.floatValue();
        this.b.getPosTan(f2.floatValue() * this.c, this.d, null);
        PointF pointF = this.e;
        float[] fArr = this.d;
        pointF.x = fArr[0];
        pointF.y = fArr[1];
        this.a.set(obj, pointF);
    }
}