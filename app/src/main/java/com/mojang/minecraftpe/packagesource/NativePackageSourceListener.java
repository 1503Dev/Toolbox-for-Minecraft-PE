package com.mojang.minecraftpe.packagesource;

public final class NativePackageSourceListener implements PackageSourceListener {
    private long handle;

    public native void nativeOnDownloadStateChanged(long j, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i, int i2);

    @Override // com.mojang.minecraftpe.packagesource.PackageSourceListener
    public void onDownloadStateChanged(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i, int i2) {
        nativeOnDownloadStateChanged(this.handle, z, z2, z3, z4, z5, i, i2);
    }

    public void setListener(long j) {
        this.handle = j;
    }
}