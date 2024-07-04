package defpackage;

import android.graphics.Rect;
import defpackage.pp;
import java.util.Comparator;

/* renamed from: oq  reason: default package */
public final class oq {

    /* renamed from: oq$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public interface a<T> {
    }

    /* renamed from: oq$b */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class b<T> implements Comparator<T> {
        public final Rect P = new Rect();
        public final Rect Q = new Rect();
        public final boolean R;
        public final a<T> S;

        public b(boolean z, pp.a aVar) {
            this.R = z;
            this.S = aVar;
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            Rect rect = this.P;
            Rect rect2 = this.Q;
            ((pp.a) this.S).getClass();
            ((s0) t).e(rect);
            ((pp.a) this.S).getClass();
            ((s0) t2).e(rect2);
            int i = rect.top;
            int i2 = rect2.top;
            if (i < i2) {
                return -1;
            }
            if (i > i2) {
                return 1;
            }
            int i3 = rect.left;
            int i4 = rect2.left;
            if (i3 < i4) {
                if (!this.R) {
                    return -1;
                }
                return 1;
            } else if (i3 > i4) {
                if (this.R) {
                    return -1;
                }
                return 1;
            } else {
                int i5 = rect.bottom;
                int i6 = rect2.bottom;
                if (i5 < i6) {
                    return -1;
                }
                if (i5 > i6) {
                    return 1;
                }
                int i7 = rect.right;
                int i8 = rect2.right;
                if (i7 < i8) {
                    if (!this.R) {
                        return -1;
                    }
                    return 1;
                } else if (i7 > i8) {
                    if (this.R) {
                        return -1;
                    }
                    return 1;
                } else {
                    return 0;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0026, code lost:
        if (r10.bottom <= r12.top) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0033, code lost:
        if (r10.right <= r12.left) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003a, code lost:
        if (r10.top >= r12.bottom) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0041, code lost:
        if (r10.left >= r12.right) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0043, code lost:
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0045, code lost:
        r7 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean a(int i, Rect rect, Rect rect2, Rect rect3) {
        boolean z;
        int i2;
        int i3;
        boolean b2 = b(i, rect, rect2);
        if (b(i, rect, rect3) || !b2) {
            return false;
        }
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
        }
        if (!z || i == 17 || i == 66) {
            return true;
        }
        int d = d(i, rect, rect2);
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i == 130) {
                        i2 = rect3.bottom;
                        i3 = rect.bottom;
                    } else {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                } else {
                    i2 = rect3.right;
                    i3 = rect.right;
                }
            } else {
                i2 = rect.top;
                i3 = rect3.top;
            }
        } else {
            i2 = rect.left;
            i3 = rect3.left;
        }
        if (d >= Math.max(1, i2 - i3)) {
            return false;
        }
        return true;
    }

    public static boolean b(int i, Rect rect, Rect rect2) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return rect2.right >= rect.left && rect2.left <= rect.right;
        }
        return rect2.bottom >= rect.top && rect2.top <= rect.bottom;
    }

    public static boolean c(int i, Rect rect, Rect rect2) {
        if (i == 17) {
            int i2 = rect.right;
            int i3 = rect2.right;
            return (i2 > i3 || rect.left >= i3) && rect.left > rect2.left;
        } else if (i == 33) {
            int i4 = rect.bottom;
            int i5 = rect2.bottom;
            return (i4 > i5 || rect.top >= i5) && rect.top > rect2.top;
        } else if (i == 66) {
            int i6 = rect.left;
            int i7 = rect2.left;
            return (i6 < i7 || rect.right <= i7) && rect.right < rect2.right;
        } else if (i == 130) {
            int i8 = rect.top;
            int i9 = rect2.top;
            return (i8 < i9 || rect.bottom <= i9) && rect.bottom < rect2.bottom;
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
    }

    public static int d(int i, Rect rect, Rect rect2) {
        int i2;
        int i3;
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i == 130) {
                        i2 = rect2.top;
                        i3 = rect.bottom;
                    } else {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                } else {
                    i2 = rect2.left;
                    i3 = rect.right;
                }
            } else {
                i2 = rect.top;
                i3 = rect2.bottom;
            }
        } else {
            i2 = rect.left;
            i3 = rect2.right;
        }
        return Math.max(0, i2 - i3);
    }

    public static int e(int i, Rect rect, Rect rect2) {
        int height;
        int i2;
        int height2;
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            height = (rect.width() / 2) + rect.left;
            i2 = rect2.left;
            height2 = rect2.width();
            return Math.abs(height - ((height2 / 2) + i2));
        }
        height = (rect.height() / 2) + rect.top;
        i2 = rect2.top;
        height2 = rect2.height();
        return Math.abs(height - ((height2 / 2) + i2));
    }
}