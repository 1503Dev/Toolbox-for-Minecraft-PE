package defpackage;

import android.net.Uri;
import android.os.Build;
import defpackage.bg;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/* renamed from: s71  reason: default package */
public final class s71 {
    /* JADX WARN: Not initialized variable reg: 2, insn: 0x005c: MOVE  (r7 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]), block:B:34:0x005b */
    /* JADX WARN: Removed duplicated region for block: B:51:0x005f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static bg a(byte[] bArr) {
        ObjectInputStream objectInputStream;
        IOException e;
        ObjectInputStream objectInputStream2;
        bg bgVar = new bg();
        if (bArr == null) {
            return bgVar;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        ObjectInputStream objectInputStream3 = null;
        try {
            try {
                objectInputStream = new ObjectInputStream(byteArrayInputStream);
                try {
                    for (int readInt = objectInputStream.readInt(); readInt > 0; readInt--) {
                        bgVar.a.add(new bg.a(Uri.parse(objectInputStream.readUTF()), objectInputStream.readBoolean()));
                    }
                    try {
                        objectInputStream.close();
                    } catch (IOException e2) {
                        e2.printStackTrace();
                    }
                } catch (IOException e3) {
                    e = e3;
                    e.printStackTrace();
                    if (objectInputStream != null) {
                        try {
                            objectInputStream.close();
                        } catch (IOException e4) {
                            e4.printStackTrace();
                        }
                    }
                    byteArrayInputStream.close();
                    return bgVar;
                }
            } catch (Throwable th) {
                th = th;
                objectInputStream3 = objectInputStream2;
                if (objectInputStream3 != null) {
                    try {
                        objectInputStream3.close();
                    } catch (IOException e5) {
                        e5.printStackTrace();
                    }
                }
                try {
                    byteArrayInputStream.close();
                } catch (IOException e6) {
                    e6.printStackTrace();
                }
                throw th;
            }
        } catch (IOException e7) {
            objectInputStream = null;
            e = e7;
        } catch (Throwable th2) {
            th = th2;
            if (objectInputStream3 != null) {
            }
            byteArrayInputStream.close();
            throw th;
        }
        try {
            byteArrayInputStream.close();
        } catch (IOException e8) {
            e8.printStackTrace();
        }
        return bgVar;
    }

    public static int b(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        throw new IllegalArgumentException(bp.b("Could not convert ", i, " to BackoffPolicy"));
    }

    public static o90 c(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (Build.VERSION.SDK_INT >= 30 && i == 5) {
                                return o90.TEMPORARILY_UNMETERED;
                            }
                            throw new IllegalArgumentException(bp.b("Could not convert ", i, " to NetworkType"));
                        }
                        return o90.METERED;
                    }
                    return o90.NOT_ROAMING;
                }
                return o90.UNMETERED;
            }
            return o90.CONNECTED;
        }
        return o90.NOT_REQUIRED;
    }

    public static int d(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        throw new IllegalArgumentException(bp.b("Could not convert ", i, " to OutOfQuotaPolicy"));
    }

    public static y61 e(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i == 5) {
                                return y61.CANCELLED;
                            }
                            throw new IllegalArgumentException(bp.b("Could not convert ", i, " to State"));
                        }
                        return y61.BLOCKED;
                    }
                    return y61.FAILED;
                }
                return y61.SUCCEEDED;
            }
            return y61.RUNNING;
        }
        return y61.ENQUEUED;
    }

    public static int f(y61 y61Var) {
        int ordinal = y61Var.ordinal();
        if (ordinal != 0) {
            int i = 1;
            if (ordinal != 1) {
                i = 2;
                if (ordinal != 2) {
                    i = 3;
                    if (ordinal != 3) {
                        i = 4;
                        if (ordinal != 4) {
                            if (ordinal == 5) {
                                return 5;
                            }
                            throw new IllegalArgumentException("Could not convert " + y61Var + " to int");
                        }
                    }
                }
            }
            return i;
        }
        return 0;
    }
}