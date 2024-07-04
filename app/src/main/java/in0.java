package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: in0  reason: default package */
public final class in0 {

    /* renamed from: in0$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class a extends RuntimeException {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public a(String str, Parcel parcel) {
            super(r2.toString());
            int dataPosition = parcel.dataPosition();
            int dataSize = parcel.dataSize();
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 41);
            sb.append(str);
            sb.append(" Parcel: pos=");
            sb.append(dataPosition);
            sb.append(" size=");
            sb.append(dataSize);
        }
    }

    public static Bundle a(Parcel parcel, int i) {
        int m = m(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (m == 0) {
            return null;
        }
        Bundle readBundle = parcel.readBundle();
        parcel.setDataPosition(dataPosition + m);
        return readBundle;
    }

    public static byte[] b(Parcel parcel, int i) {
        int m = m(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (m == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        parcel.setDataPosition(dataPosition + m);
        return createByteArray;
    }

    public static <T extends Parcelable> T c(Parcel parcel, int i, Parcelable.Creator<T> creator) {
        int m = m(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (m == 0) {
            return null;
        }
        T createFromParcel = creator.createFromParcel(parcel);
        parcel.setDataPosition(dataPosition + m);
        return createFromParcel;
    }

    public static String d(Parcel parcel, int i) {
        int m = m(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (m == 0) {
            return null;
        }
        String readString = parcel.readString();
        parcel.setDataPosition(dataPosition + m);
        return readString;
    }

    public static String[] e(Parcel parcel, int i) {
        int m = m(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (m == 0) {
            return null;
        }
        String[] createStringArray = parcel.createStringArray();
        parcel.setDataPosition(dataPosition + m);
        return createStringArray;
    }

    public static ArrayList<String> f(Parcel parcel, int i) {
        int m = m(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (m == 0) {
            return null;
        }
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(dataPosition + m);
        return createStringArrayList;
    }

    public static <T> T[] g(Parcel parcel, int i, Parcelable.Creator<T> creator) {
        int m = m(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (m == 0) {
            return null;
        }
        T[] tArr = (T[]) parcel.createTypedArray(creator);
        parcel.setDataPosition(dataPosition + m);
        return tArr;
    }

    public static void h(Parcel parcel, int i) {
        if (parcel.dataPosition() == i) {
            return;
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Overread allowed size end=");
        sb.append(i);
        throw new a(sb.toString(), parcel);
    }

    public static boolean i(Parcel parcel, int i) {
        p(parcel, i, 4);
        return parcel.readInt() != 0;
    }

    public static IBinder j(Parcel parcel, int i) {
        int m = m(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (m == 0) {
            return null;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(dataPosition + m);
        return readStrongBinder;
    }

    public static int k(Parcel parcel, int i) {
        p(parcel, i, 4);
        return parcel.readInt();
    }

    public static long l(Parcel parcel, int i) {
        p(parcel, i, 8);
        return parcel.readLong();
    }

    public static int m(Parcel parcel, int i) {
        return (i & (-65536)) != -65536 ? (char) (i >> 16) : parcel.readInt();
    }

    public static void n(Parcel parcel, int i) {
        parcel.setDataPosition(parcel.dataPosition() + m(parcel, i));
    }

    public static int o(Parcel parcel) {
        String str;
        int readInt = parcel.readInt();
        int m = m(parcel, readInt);
        int dataPosition = parcel.dataPosition();
        if (((char) readInt) != 20293) {
            String valueOf = String.valueOf(Integer.toHexString(readInt));
            if (valueOf.length() != 0) {
                str = "Expected object header. Got 0x".concat(valueOf);
            } else {
                str = new String("Expected object header. Got 0x");
            }
            throw new a(str, parcel);
        }
        int i = m + dataPosition;
        if (i >= dataPosition && i <= parcel.dataSize()) {
            return i;
        }
        StringBuilder sb = new StringBuilder(54);
        sb.append("Size read is invalid start=");
        sb.append(dataPosition);
        sb.append(" end=");
        sb.append(i);
        throw new a(sb.toString(), parcel);
    }

    public static void p(Parcel parcel, int i, int i2) {
        int m = m(parcel, i);
        if (m == i2) {
            return;
        }
        String hexString = Integer.toHexString(m);
        StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + 46);
        sb.append("Expected size ");
        sb.append(i2);
        sb.append(" got ");
        sb.append(m);
        sb.append(" (0x");
        sb.append(hexString);
        sb.append(")");
        throw new a(sb.toString(), parcel);
    }
}