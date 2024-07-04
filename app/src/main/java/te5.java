package defpackage;

import java.io.IOException;

/* renamed from: te5  reason: default package */
public class te5 extends IOException {
    public static final /* synthetic */ int Q = 0;
    public boolean P;

    public te5(IOException iOException) {
        super(iOException.getMessage(), iOException);
    }

    public te5(String str) {
        super(str);
    }

    public static se5 a() {
        return new se5();
    }

    public static te5 b() {
        return new te5("Protocol message had invalid UTF-8.");
    }

    public static te5 c() {
        return new te5("CodedInputStream encountered a malformed varint.");
    }

    public static te5 d() {
        return new te5("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static te5 e() {
        return new te5("Failed to parse the message.");
    }

    public static te5 f() {
        return new te5("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}