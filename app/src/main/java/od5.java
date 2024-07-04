package defpackage;

import java.io.IOException;

/* renamed from: od5  reason: default package */
public final class od5 extends IOException {
    public od5(IndexOutOfBoundsException indexOutOfBoundsException) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", indexOutOfBoundsException);
    }

    public od5(String str, IndexOutOfBoundsException indexOutOfBoundsException) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(String.valueOf(str)), indexOutOfBoundsException);
    }
}