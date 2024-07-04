package defpackage;

import defpackage.lw0;

/* renamed from: x9  reason: default package */
public final class x9 {
    public static final String d;
    public static final String e;
    public static final x9 f;
    public static final x9 g;
    public final boolean a;
    public final int b;
    public final kw0 c;

    /* renamed from: x9$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class a {
        public static final byte[] e = new byte[1792];
        public final CharSequence a;
        public final int b;
        public int c;
        public char d;

        static {
            for (int i = 0; i < 1792; i++) {
                e[i] = Character.getDirectionality(i);
            }
        }

        public a(CharSequence charSequence) {
            this.a = charSequence;
            this.b = charSequence.length();
        }

        public final byte a() {
            char charAt = this.a.charAt(this.c - 1);
            this.d = charAt;
            if (Character.isLowSurrogate(charAt)) {
                int codePointBefore = Character.codePointBefore(this.a, this.c);
                this.c -= Character.charCount(codePointBefore);
                return Character.getDirectionality(codePointBefore);
            }
            this.c--;
            char c = this.d;
            return c < 1792 ? e[c] : Character.getDirectionality(c);
        }
    }

    static {
        lw0.d dVar = lw0.c;
        d = Character.toString((char) 8206);
        e = Character.toString((char) 8207);
        f = new x9(false, 2, dVar);
        g = new x9(true, 2, dVar);
    }

    public x9(boolean z, int i, lw0.d dVar) {
        this.a = z;
        this.b = i;
        this.c = dVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0070, code lost:
        if (r3 != 0) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0073, code lost:
        if (r4 == 0) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0079, code lost:
        if (r0.c <= 0) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x007f, code lost:
        switch(r0.a()) {
            case 14: goto L62;
            case 15: goto L62;
            case 16: goto L57;
            case 17: goto L57;
            case 18: goto L53;
            default: goto L65;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0083, code lost:
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0086, code lost:
        if (r3 != r5) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0088, code lost:
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x008a, code lost:
        if (r3 != r5) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x008e, code lost:
        r5 = r5 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0091, code lost:
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:?, code lost:
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:?, code lost:
        return 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int a(CharSequence charSequence) {
        byte directionality;
        a aVar = new a(charSequence);
        aVar.c = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int i4 = aVar.c;
            if (i4 < aVar.b && i == 0) {
                char charAt = aVar.a.charAt(i4);
                aVar.d = charAt;
                if (Character.isHighSurrogate(charAt)) {
                    int codePointAt = Character.codePointAt(aVar.a, aVar.c);
                    aVar.c = Character.charCount(codePointAt) + aVar.c;
                    directionality = Character.getDirectionality(codePointAt);
                } else {
                    aVar.c++;
                    char c = aVar.d;
                    if (c < 1792) {
                        directionality = a.e[c];
                    } else {
                        directionality = Character.getDirectionality(c);
                    }
                }
                if (directionality != 0) {
                    if (directionality != 1 && directionality != 2) {
                        if (directionality != 9) {
                            switch (directionality) {
                                case 14:
                                case 15:
                                    i3++;
                                    i2 = -1;
                                    break;
                                case 16:
                                case 17:
                                    i3++;
                                    i2 = 1;
                                    break;
                                case 18:
                                    i3--;
                                    i2 = 0;
                                    break;
                            }
                        }
                    } else if (i3 == 0) {
                    }
                } else if (i3 == 0) {
                }
                i = i3;
            }
        }
        return -1;
    }

    public static int b(CharSequence charSequence) {
        a aVar = new a(charSequence);
        aVar.c = aVar.b;
        int i = 0;
        int i2 = 0;
        while (aVar.c > 0) {
            byte a2 = aVar.a();
            if (a2 != 0) {
                if (a2 == 1 || a2 == 2) {
                    if (i == 0) {
                        return 1;
                    }
                    if (i2 == 0) {
                        i2 = i;
                    }
                } else if (a2 != 9) {
                    switch (a2) {
                        case 14:
                        case 15:
                            if (i2 == i) {
                                return -1;
                            }
                            i--;
                            break;
                        case 16:
                        case 17:
                            if (i2 == i) {
                                return 1;
                            }
                            i--;
                            break;
                        case 18:
                            i++;
                            break;
                        default:
                            if (i2 != 0) {
                                break;
                            } else {
                                i2 = i;
                                break;
                            }
                    }
                } else {
                    continue;
                }
            } else if (i == 0) {
                return -1;
            } else {
                if (i2 == 0) {
                    i2 = i;
                }
            }
        }
        return 0;
    }
}