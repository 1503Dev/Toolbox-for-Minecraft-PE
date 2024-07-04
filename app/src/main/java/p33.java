package defpackage;

import java.io.IOException;

/* renamed from: p33  reason: default package */
public class p33 extends IOException {
    public static final /* synthetic */ int P = 0;

    public p33(IOException iOException) {
        super(iOException.getMessage(), iOException);
    }

    public p33(String str) {
        super(str);
    }

    public static p33 a() {
        return new p33("Protocol message had invalid UTF-8.");
    }

    public static p33 b() {
        return new p33("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static p33 c() {
        return new p33("Failed to parse the message.");
    }

    public static p33 d() {
        return new p33("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}