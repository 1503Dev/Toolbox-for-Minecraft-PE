package com.mojang.minecraftpe.packagesource;

public class StubPackageSource extends PackageSource {
    private final PackageSourceListener listener;

    public StubPackageSource(PackageSourceListener packageSourceListener) {
        this.listener = packageSourceListener;
    }

    @Override // com.mojang.minecraftpe.packagesource.PackageSource
    public void abortDownload() {
    }

    @Override // com.mojang.minecraftpe.packagesource.PackageSource
    public void destructor() {
    }

    @Override // com.mojang.minecraftpe.packagesource.PackageSource
    public void downloadFiles(String str, long j, boolean z, boolean z2) {
        this.listener.onDownloadStateChanged(false, false, false, false, true, 0, 8);
    }

    @Override // com.mojang.minecraftpe.packagesource.PackageSource
    public String getDownloadDirectoryPath() {
        return null;
    }

    @Override // com.mojang.minecraftpe.packagesource.PackageSource
    public String getMountPath(String str) {
        return null;
    }

    @Override // com.mojang.minecraftpe.packagesource.PackageSource
    public void mountFiles(String str) {
    }

    @Override // com.mojang.minecraftpe.packagesource.PackageSource
    public void pauseDownload() {
    }

    @Override // com.mojang.minecraftpe.packagesource.PackageSource
    public void resumeDownload() {
    }

    @Override // com.mojang.minecraftpe.packagesource.PackageSource
    public void resumeDownloadOnCell() {
    }

    @Override // com.mojang.minecraftpe.packagesource.PackageSource
    public void unmountFiles(String str) {
    }
}