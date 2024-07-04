package defpackage;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;

/* renamed from: xl5  reason: default package */
public final class xl5 implements SurfaceHolder.Callback, TextureView.SurfaceTextureListener, d16, oq5, kk5, eo5, uk5 {
    public final /* synthetic */ bm5 P;

    public /* synthetic */ xl5(bm5 bm5Var) {
        this.P = bm5Var;
    }

    @Override // defpackage.uk5
    public final void a() {
        bm5 bm5Var = this.P;
        int i = bm5.X;
        int e = bm5Var.e();
        if (e == 2 || e == 3) {
            bm5Var.D();
            boolean z = bm5Var.S.o;
            bm5Var.r();
            bm5Var.r();
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        bm5 bm5Var = this.P;
        int i3 = bm5.X;
        Surface surface = new Surface(surfaceTexture);
        bm5Var.z(surface);
        bm5Var.H = surface;
        this.P.x(i, i2);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        bm5 bm5Var = this.P;
        int i = bm5.X;
        bm5Var.z(null);
        this.P.x(0, 0);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        bm5 bm5Var = this.P;
        int i3 = bm5.X;
        bm5Var.x(i, i2);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        bm5 bm5Var = this.P;
        int i4 = bm5.X;
        bm5Var.x(i2, i3);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        bm5 bm5Var = this.P;
        int i = bm5.X;
        bm5Var.x(0, 0);
    }
}