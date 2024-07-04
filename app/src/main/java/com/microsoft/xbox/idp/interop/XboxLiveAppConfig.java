package com.microsoft.xbox.idp.interop;

public class XboxLiveAppConfig {
    private final long id = create();

    private static native long create();

    private static native void delete(long j);

    private static native String getEnvironment(long j);

    private static native int getOverrideTitleId(long j);

    private static native String getProxy(long j);

    private static native String getSandbox(long j);

    private static native String getScid(long j);

    private static native int getTitleId(long j);

    private static native void setEnvironment(long j, String str);

    private static native void setOverrideTitleId(long j, int i);

    private static native void setProxy(long j, String str);

    private static native void setSandbox(long j, String str);

    public void finalize() {
        delete(this.id);
        super.finalize();
    }
}