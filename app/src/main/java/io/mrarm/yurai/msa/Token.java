package io.mrarm.yurai.msa;

public abstract class Token {
    public long sharedHandle;

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static final class TimePoint {
        public long value;

        private TimePoint(long j) {
            this.value = j;
        }

        public static TimePoint fromString(String str) {
            return new TimePoint(Token.nativeParseTimePoint(str));
        }
    }

    public Token(long j) {
        this.sharedHandle = j;
    }

    private static native void nativeDestroy(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nativeParseTimePoint(String str);

    public void finalize() {
        nativeDestroy(this.sharedHandle);
        super.finalize();
    }
}