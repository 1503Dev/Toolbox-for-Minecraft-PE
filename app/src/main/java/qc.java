package defpackage;

import java.nio.charset.Charset;

/* renamed from: qc  reason: default package */
public final class qc {
    public static final Charset a;

    static {
        Charset forName = Charset.forName("UTF-8");
        hy.d("Charset.forName(\"UTF-8\")", forName);
        a = forName;
        hy.d("Charset.forName(\"UTF-16\")", Charset.forName("UTF-16"));
        hy.d("Charset.forName(\"UTF-16BE\")", Charset.forName("UTF-16BE"));
        hy.d("Charset.forName(\"UTF-16LE\")", Charset.forName("UTF-16LE"));
        hy.d("Charset.forName(\"US-ASCII\")", Charset.forName("US-ASCII"));
        hy.d("Charset.forName(\"ISO-8859-1\")", Charset.forName("ISO-8859-1"));
    }
}