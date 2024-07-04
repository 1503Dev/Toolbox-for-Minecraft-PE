package defpackage;

import java.io.UnsupportedEncodingException;
import java.lang.Character;
import java.util.ArrayList;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* renamed from: o32  reason: default package */
public final class o32 {
    public static int a(String str) {
        byte[] bytes;
        try {
            bytes = str.getBytes("UTF-8");
        } catch (UnsupportedEncodingException unused) {
            bytes = str.getBytes();
        }
        int length = bytes.length;
        int i = (length & (-4)) + 0;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3 += 4) {
            int i4 = ((bytes[i3] & 255) | ((bytes[i3 + 1] & 255) << 8) | ((bytes[i3 + 2] & 255) << 16) | (bytes[i3 + 3] << 24)) * (-862048943);
            int i5 = i2 ^ (((i4 << 15) | (i4 >>> 17)) * 461845907);
            i2 = (((i5 >>> 19) | (i5 << 13)) * 5) - 430675100;
        }
        int i6 = length & 3;
        if (i6 != 1) {
            if (i6 != 2) {
                r2 = i6 == 3 ? (bytes[i + 2] & 255) << 16 : 0;
                int i7 = i2 ^ length;
                int i8 = (i7 ^ (i7 >>> 16)) * (-2048144789);
                int i9 = (i8 ^ (i8 >>> 13)) * (-1028477387);
                return i9 ^ (i9 >>> 16);
            }
            r2 |= (bytes[i + 1] & 255) << 8;
        }
        int i10 = ((bytes[i] & 255) | r2) * (-862048943);
        i2 ^= ((i10 >>> 17) | (i10 << 15)) * 461845907;
        int i72 = i2 ^ length;
        int i82 = (i72 ^ (i72 >>> 16)) * (-2048144789);
        int i92 = (i82 ^ (i82 >>> 13)) * (-1028477387);
        return i92 ^ (i92 >>> 16);
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x00ee, code lost:
        if (true != r4) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00fe, code lost:
        if (true != r4) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0100, code lost:
        r5 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0101, code lost:
        r4 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String[] b(String str, boolean z) {
        if (str == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        char[] charArray = str.toCharArray();
        int i = 0;
        boolean z2 = false;
        int i2 = 0;
        while (i < str.length()) {
            int codePointAt = Character.codePointAt(charArray, i);
            int charCount = Character.charCount(codePointAt);
            if (Character.isLetter(codePointAt)) {
                Character.UnicodeBlock of = Character.UnicodeBlock.of(codePointAt);
                if (of.equals(Character.UnicodeBlock.BOPOMOFO) || of.equals(Character.UnicodeBlock.BOPOMOFO_EXTENDED) || of.equals(Character.UnicodeBlock.CJK_COMPATIBILITY) || of.equals(Character.UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS) || of.equals(Character.UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS_SUPPLEMENT) || of.equals(Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS) || of.equals(Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_A) || of.equals(Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_B) || of.equals(Character.UnicodeBlock.ENCLOSED_CJK_LETTERS_AND_MONTHS) || of.equals(Character.UnicodeBlock.HANGUL_JAMO) || of.equals(Character.UnicodeBlock.HANGUL_SYLLABLES) || of.equals(Character.UnicodeBlock.HIRAGANA) || of.equals(Character.UnicodeBlock.KATAKANA) || of.equals(Character.UnicodeBlock.KATAKANA_PHONETIC_EXTENSIONS) || ((codePointAt >= 65382 && codePointAt <= 65437) || (codePointAt >= 65441 && codePointAt <= 65500))) {
                    if (z2) {
                        arrayList.add(new String(charArray, i2, i - i2));
                    }
                    arrayList.add(new String(charArray, i, charCount));
                    z2 = false;
                    i += charCount;
                }
            }
            if (!Character.isLetterOrDigit(codePointAt) && Character.getType(codePointAt) != 6 && Character.getType(codePointAt) != 8) {
                if (!z || Character.charCount(codePointAt) != 1 || Character.toChars(codePointAt)[0] != '\'') {
                    if (z2) {
                        arrayList.add(new String(charArray, i2, i - i2));
                        z2 = false;
                    }
                }
            }
            i += charCount;
        }
        if (z2) {
            arrayList.add(new String(charArray, i2, i - i2));
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }
}