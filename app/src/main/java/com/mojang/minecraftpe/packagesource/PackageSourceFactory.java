package com.mojang.minecraftpe.packagesource;

public class PackageSourceFactory {
    public static PackageSource createGooglePlayPackageSource(String str, PackageSourceListener packageSourceListener) {
        return new StubPackageSource(packageSourceListener);
    }
}