package defpackage;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: jb1  reason: default package */
public final class jb1 {
    public static final Pattern a = Pattern.compile("<(head)( [^>]*)?>", 2);
    public static final Pattern b = Pattern.compile("<(head)( [^>]*)?/>", 2);
    public static final Pattern c = Pattern.compile("<(body)( [^>]*?)?>", 2);
    public static final Pattern d = Pattern.compile("<(body)( [^>]*?)?/>", 2);
    public static final Pattern e = Pattern.compile("<(html)( [^>]*?)?>", 2);
    public static final Pattern f = Pattern.compile("<(html)( [^>]*?)?/>", 2);
    public static final Pattern g = Pattern.compile("<!DOCTYPE [^>]*>", 2);

    public static boolean a(String str, StringBuilder sb, Pattern pattern, String str2, int[][] iArr) {
        boolean z;
        Matcher matcher = pattern.matcher(str);
        int i = 0;
        while (matcher.find(i)) {
            int start = matcher.start();
            int end = matcher.end();
            if (iArr != null) {
                for (int[] iArr2 : iArr) {
                    if (start >= iArr2[0] && start <= iArr2[1]) {
                        z = true;
                        break;
                    }
                }
            }
            z = false;
            if (!z) {
                sb.append(str.substring(0, matcher.end()));
                sb.append(str2);
                sb.append(str.substring(matcher.end()));
                return true;
            }
            i = end;
        }
        return false;
    }

    public static boolean b(String str, StringBuilder sb, Pattern pattern, String str2, int[][] iArr) {
        boolean z;
        Matcher matcher = pattern.matcher(str);
        int i = 0;
        while (matcher.find(i)) {
            int start = matcher.start();
            int end = matcher.end();
            if (iArr != null) {
                for (int[] iArr2 : iArr) {
                    if (start >= iArr2[0] && start <= iArr2[1]) {
                        z = true;
                        break;
                    }
                }
            }
            z = false;
            if (!z) {
                sb.append(str.substring(0, matcher.end() - 2));
                sb.append(">");
                sb.append(str2);
                sb.append("</");
                sb.append(matcher.group(1));
                sb.append(">");
                sb.append(str.substring(matcher.end()));
                return true;
            }
            i = end;
        }
        return false;
    }
}