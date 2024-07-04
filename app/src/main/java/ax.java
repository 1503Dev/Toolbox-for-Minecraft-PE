package defpackage;

import android.graphics.Matrix;
import android.util.Property;
import android.widget.ImageView;

/* renamed from: ax  reason: default package */
public final class ax extends Property<ImageView, Matrix> {
    public final Matrix a;

    public ax() {
        super(Matrix.class, "imageMatrixProperty");
        this.a = new Matrix();
    }

    @Override // android.util.Property
    public final Matrix get(ImageView imageView) {
        this.a.set(imageView.getImageMatrix());
        return this.a;
    }

    @Override // android.util.Property
    public final void set(ImageView imageView, Matrix matrix) {
        imageView.setImageMatrix(matrix);
    }
}