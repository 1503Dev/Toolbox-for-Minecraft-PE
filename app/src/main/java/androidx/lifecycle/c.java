package androidx.lifecycle;

import java.util.concurrent.atomic.AtomicReference;

public abstract class c {

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[b.values().length];
            b = iArr;
            try {
                iArr[b.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[b.ON_STOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[b.ON_START.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                b[b.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                b[b.ON_RESUME.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                b[b.ON_DESTROY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                b[b.ON_ANY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr2 = new int[EnumC0007c.values().length];
            a = iArr2;
            try {
                iArr2[2] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[3] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[4] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[0] = 4;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                a[1] = 5;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public enum b {
        ON_CREATE,
        ON_START,
        ON_RESUME,
        ON_PAUSE,
        ON_STOP,
        ON_DESTROY,
        ON_ANY;

        public final EnumC0007c b() {
            switch (a.b[ordinal()]) {
                case 1:
                case 2:
                    return EnumC0007c.CREATED;
                case 3:
                case 4:
                    return EnumC0007c.STARTED;
                case 5:
                    return EnumC0007c.RESUMED;
                case 6:
                    return EnumC0007c.DESTROYED;
                default:
                    throw new IllegalArgumentException(this + " has no target state");
            }
        }
    }

    /* renamed from: androidx.lifecycle.c$c  reason: collision with other inner class name */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public enum EnumC0007c {
        DESTROYED,
        INITIALIZED,
        CREATED,
        STARTED,
        RESUMED
    }

    public c() {
        new AtomicReference();
    }

    public abstract void a(a10 a10Var);
}