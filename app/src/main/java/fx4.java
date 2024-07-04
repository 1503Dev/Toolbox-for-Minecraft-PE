package defpackage;

import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Pattern;

/* renamed from: fx4  reason: default package */
public final class fx4 implements FilenameFilter {
    public final Pattern a;

    public fx4(Pattern pattern) {
        pattern.getClass();
        this.a = pattern;
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        return this.a.matcher(str).matches();
    }
}