package defpackage;

import android.app.AppOpsManager;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import android.os.Process;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: p5  reason: default package */
public class p5 implements dx2, ne5, wg3 {
    public static final /* synthetic */ p5 P = new p5();
    public static final jr3 Q = new jr3();
    public static final o53 R = new o53(2);

    public static Cursor A(SQLiteDatabase sQLiteDatabase, int i) {
        String[] strArr = {"value"};
        String[] strArr2 = new String[1];
        if (i == 0) {
            strArr2[0] = "failed_requests";
        } else if (i == 1) {
            strArr2[0] = "total_requests";
        } else if (i != 2) {
            strArr2[0] = "completed_requests";
        } else {
            strArr2[0] = "last_successful_request_time";
        }
        return sQLiteDatabase.query("offline_signal_statistics", strArr, "statistic_name = ?", strArr2, null, null, null);
    }

    public static void B(SQLiteDatabase sQLiteDatabase, String str) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("statistic_name", str);
        contentValues.put("value", (Integer) 0);
        sQLiteDatabase.insert("offline_signal_statistics", null, contentValues);
    }

    public static void C(SQLiteDatabase sQLiteDatabase, String str) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("value", (Integer) 0);
        sQLiteDatabase.update("offline_signal_statistics", contentValues, "statistic_name = ?", new String[]{str});
    }

    public static void b(String str, ContentValues contentValues, SQLiteDatabase sQLiteDatabase) {
        try {
            try {
                sQLiteDatabase.beginTransaction();
                sQLiteDatabase.insertOrThrow(str, null, contentValues);
                sQLiteDatabase.setTransactionSuccessful();
            } catch (SQLException e) {
                StringBuilder sb = new StringBuilder();
                sb.append("Exception on insert to " + str + ", db version:");
                sb.append(sQLiteDatabase.getVersion());
                sb.append(". Values: " + contentValues.toString() + " caused: ");
                sb.append(e.toString());
                ga1.h().n().d(0, 1, sb.toString(), true);
            }
            sQLiteDatabase.endTransaction();
        } catch (Throwable th) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Error on insert to " + str + ", db version:");
            sb2.append(sQLiteDatabase.getVersion());
            sb2.append(". Values: " + contentValues.toString() + " caused: ");
            sb2.append(th.toString());
            t1.b(0, 0, sb2.toString(), true);
        }
    }

    public static void c(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr[3] ^ jArr2[3];
        jArr3[4] = jArr[4] ^ jArr2[4];
        jArr3[5] = jArr[5] ^ jArr2[5];
        jArr3[6] = jArr[6] ^ jArr2[6];
        jArr3[7] = jArr2[7] ^ jArr[7];
    }

    public static int d(Context context, String str) {
        String str2;
        int i;
        int myPid = Process.myPid();
        int myUid = Process.myUid();
        String packageName = context.getPackageName();
        if (context.checkPermission(str, myPid, myUid) != -1) {
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 23) {
                str2 = v6.b(str);
            } else {
                str2 = null;
            }
            if (str2 == null) {
                return 0;
            }
            if (packageName == null) {
                String[] packagesForUid = context.getPackageManager().getPackagesForUid(myUid);
                if (packagesForUid != null && packagesForUid.length > 0) {
                    packageName = packagesForUid[0];
                }
            }
            if (i2 >= 23) {
                i = w6.a((AppOpsManager) d5.a(context, AppOpsManager.class), str2, packageName);
            } else {
                i = 1;
            }
            if (i == 0) {
                return 0;
            }
            return -2;
        }
        return -1;
    }

    public static int f(int i, int i2, int i3) {
        return i < i2 ? i2 : i > i3 ? i3 : i;
    }

    public static tl g(o oVar) {
        if (oVar.equals(z60.a)) {
            return new vm0();
        }
        if (oVar.equals(z60.c)) {
            return new xm0();
        }
        if (oVar.equals(z60.e)) {
            return new zm0(128);
        }
        if (oVar.equals(z60.f)) {
            return new zm0(256);
        }
        throw new IllegalArgumentException("unrecognized digest OID: " + oVar);
    }

    public static void h(long[] jArr, long[] jArr2) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        jArr2[0] = j & 1152921504606846975L;
        jArr2[1] = ((j >>> 60) ^ (j2 << 4)) & 1152921504606846975L;
        jArr2[2] = ((j2 >>> 56) ^ (j3 << 8)) & 1152921504606846975L;
        jArr2[3] = (j3 >>> 52) ^ (j4 << 12);
    }

    public static void i(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[4];
        long[] jArr5 = new long[4];
        h(jArr, jArr4);
        h(jArr2, jArr5);
        j(jArr4[0], jArr5[0], jArr3, 0);
        j(jArr4[1], jArr5[1], jArr3, 1);
        j(jArr4[2], jArr5[2], jArr3, 2);
        j(jArr4[3], jArr5[3], jArr3, 3);
        int i = 5;
        while (i > 0) {
            int i2 = i - 1;
            jArr3[i] = jArr3[i] ^ jArr3[i2];
            i = i2;
        }
        j(jArr4[0] ^ jArr4[1], jArr5[0] ^ jArr5[1], jArr3, 1);
        j(jArr4[2] ^ jArr4[3], jArr5[2] ^ jArr5[3], jArr3, 3);
        for (int i3 = 7; i3 > 1; i3--) {
            jArr3[i3] = jArr3[i3] ^ jArr3[i3 - 2];
        }
        long j = jArr4[0] ^ jArr4[2];
        long j2 = jArr4[1] ^ jArr4[3];
        long j3 = jArr5[0] ^ jArr5[2];
        long j4 = jArr5[1] ^ jArr5[3];
        j(j ^ j2, j3 ^ j4, jArr3, 3);
        long[] jArr6 = new long[3];
        j(j, j3, jArr6, 0);
        j(j2, j4, jArr6, 1);
        long j5 = jArr6[0];
        long j6 = jArr6[1];
        long j7 = jArr6[2];
        long j8 = jArr3[2] ^ j5;
        jArr3[2] = j8;
        long j9 = jArr3[3] ^ (j5 ^ j6);
        jArr3[3] = j9;
        long j10 = jArr3[4] ^ (j6 ^ j7);
        jArr3[4] = j10;
        long j11 = jArr3[5] ^ j7;
        jArr3[5] = j11;
        long j12 = jArr3[0];
        long j13 = jArr3[1];
        long j14 = jArr3[6];
        long j15 = jArr3[7];
        jArr3[0] = j12 ^ (j13 << 60);
        jArr3[1] = (j13 >>> 4) ^ (j8 << 56);
        jArr3[2] = (j8 >>> 8) ^ (j9 << 52);
        jArr3[3] = (j9 >>> 12) ^ (j10 << 48);
        jArr3[4] = (j10 >>> 16) ^ (j11 << 44);
        jArr3[5] = (j11 >>> 20) ^ (j14 << 40);
        jArr3[6] = (j14 >>> 24) ^ (j15 << 36);
        jArr3[7] = j15 >>> 28;
    }

    public static void j(long j, long j2, long[] jArr, int i) {
        long j3 = j2 << 1;
        long j4 = j3 ^ j2;
        long j5 = j3 << 1;
        long j6 = j4 << 1;
        long[] jArr2 = {0, j2, j3, j4, j5, j5 ^ j2, j6, j6 ^ j2};
        int i2 = (int) j;
        long j7 = (jArr2[(i2 >>> 3) & 7] << 3) ^ jArr2[i2 & 7];
        long j8 = 0;
        int i3 = 54;
        do {
            int i4 = (int) (j >>> i3);
            long j9 = (jArr2[(i4 >>> 3) & 7] << 3) ^ jArr2[i4 & 7];
            j7 ^= j9 << i3;
            j8 ^= j9 >>> (-i3);
            i3 -= 6;
        } while (i3 > 0);
        jArr[i] = jArr[i] ^ (1152921504606846975L & j7);
        int i5 = i + 1;
        jArr[i5] = ((((((j & 585610922974906400L) & ((j2 << 4) >> 63)) >>> 5) ^ j8) << 4) ^ (j7 >>> 60)) ^ jArr[i5];
    }

    public static void k(long[] jArr, long[] jArr2) {
        ar.f(0, jArr[0], jArr2);
        ar.f(2, jArr[1], jArr2);
        ar.f(4, jArr[2], jArr2);
        long j = jArr[3];
        jArr2[6] = ar.d((int) j);
        jArr2[7] = ar.b((int) (j >>> 32)) & 4294967295L;
    }

    public static void l(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[8];
        i(jArr, jArr2, jArr4);
        n(jArr4, jArr3);
    }

    public static void m(InputConnection inputConnection, EditorInfo editorInfo, View view) {
        if (inputConnection == null || editorInfo.hintText != null) {
            return;
        }
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            if (parent instanceof o61) {
                editorInfo.hintText = ((o61) parent).a();
                return;
            }
        }
    }

    public static void n(long[] jArr, long[] jArr2) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        long j5 = jArr[4];
        long j6 = jArr[5];
        long j7 = jArr[6];
        long j8 = jArr[7];
        long j9 = j7 ^ (j8 >>> 17);
        long j10 = (j6 ^ (j8 << 47)) ^ (j9 >>> 17);
        long j11 = ((j5 ^ (j8 >>> 47)) ^ (j9 << 47)) ^ (j10 >>> 17);
        long j12 = j ^ (j11 << 17);
        long j13 = (j2 ^ (j10 << 17)) ^ (j11 >>> 47);
        long j14 = (((j4 ^ (j8 << 17)) ^ (j9 >>> 47)) ^ (j10 << 47)) ^ (j11 >>> 17);
        long j15 = j14 >>> 47;
        jArr2[0] = j12 ^ j15;
        jArr2[1] = j13;
        long j16 = j15 << 30;
        jArr2[2] = j16 ^ (((j3 ^ (j9 << 17)) ^ (j10 >>> 47)) ^ (j11 << 47));
        jArr2[3] = 140737488355327L & j14;
    }

    public static void o(long[] jArr, long[] jArr2) {
        long[] jArr3 = new long[8];
        k(jArr, jArr3);
        n(jArr3, jArr2);
    }

    public static void p(int i, long[] jArr, long[] jArr2) {
        long[] jArr3 = new long[8];
        k(jArr, jArr3);
        while (true) {
            n(jArr3, jArr2);
            i--;
            if (i <= 0) {
                return;
            }
            k(jArr2, jArr3);
        }
    }

    public static double q(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[4];
        byteBuffer.get(bArr);
        double d = ((bArr[0] << 24) & (-16777216)) | ((bArr[1] << 16) & 16711680) | (65280 & (bArr[2] << 8)) | (bArr[3] & 255);
        Double.isNaN(d);
        Double.isNaN(d);
        return d / 1.073741824E9d;
    }

    public static int r(SQLiteDatabase sQLiteDatabase, int i) {
        int i2 = 0;
        if (i == 2) {
            return 0;
        }
        Cursor A = A(sQLiteDatabase, i);
        if (A.getCount() > 0) {
            A.moveToNext();
            i2 = A.getInt(A.getColumnIndexOrThrow("value"));
        }
        A.close();
        return i2;
    }

    public static /* synthetic */ boolean s(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, Object obj, Object obj2, Object obj3) {
        boolean z;
        while (true) {
            if (atomicReferenceFieldUpdater.compareAndSet(obj, obj2, obj3)) {
                z = true;
            } else if (atomicReferenceFieldUpdater.get(obj) != obj2) {
                z = false;
            } else {
                continue;
            }
            if (z) {
                return true;
            }
            if (atomicReferenceFieldUpdater.get(obj) != obj2) {
                return false;
            }
        }
    }

    public static double t(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[4];
        byteBuffer.get(bArr);
        double d = ((bArr[0] << 24) & (-16777216)) | ((bArr[1] << 16) & 16711680) | (65280 & (bArr[2] << 8)) | (bArr[3] & 255);
        Double.isNaN(d);
        Double.isNaN(d);
        return d / 65536.0d;
    }

    public static long u(SQLiteDatabase sQLiteDatabase) {
        long j;
        Cursor A = A(sQLiteDatabase, 2);
        if (A.getCount() > 0) {
            A.moveToNext();
            j = A.getLong(A.getColumnIndexOrThrow("value"));
        } else {
            j = 0;
        }
        A.close();
        return j;
    }

    public static ArrayList v(SQLiteDatabase sQLiteDatabase) {
        ArrayList arrayList = new ArrayList();
        Cursor query = sQLiteDatabase.query("offline_signal_contents", new String[]{"serialized_proto_data"}, null, null, null, null, null);
        while (query.moveToNext()) {
            try {
                arrayList.add(j72.H(query.getBlob(query.getColumnIndexOrThrow("serialized_proto_data"))));
            } catch (te5 e) {
                sv2.d("Unable to deserialize proto from offline signals database:");
                sv2.d(e.getMessage());
            }
        }
        query.close();
        return arrayList;
    }

    public static void w(SQLiteDatabase sQLiteDatabase, long j, byte[] bArr) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("timestamp", Long.valueOf(j));
        contentValues.put("serialized_proto_data", bArr);
        if (sQLiteDatabase.update("offline_signal_contents", contentValues, "timestamp = ?", new String[]{String.valueOf(j)}) == 0) {
            sQLiteDatabase.insert("offline_signal_contents", null, contentValues);
        }
    }

    public static long x(ByteBuffer byteBuffer) {
        long j = byteBuffer.getInt();
        return j < 0 ? j + 4294967296L : j;
    }

    public static long y(ByteBuffer byteBuffer) {
        long x = x(byteBuffer) << 32;
        if (x >= 0) {
            return x(byteBuffer) + x;
        }
        throw new RuntimeException("I don't know how to deal with UInt64! long is not sufficient and I don't want to use BigInt");
    }

    public static void z(SQLiteDatabase sQLiteDatabase, boolean z, boolean z2) {
        String format;
        if (z2) {
            sQLiteDatabase.execSQL(String.format("UPDATE offline_signal_statistics SET value = value+1 WHERE statistic_name = '%s'", "completed_requests"));
            if (z) {
                return;
            }
            format = String.format("UPDATE offline_signal_statistics SET value = value+1 WHERE statistic_name = '%s'", "failed_requests");
        } else {
            format = String.format("UPDATE offline_signal_statistics SET value = value+1 WHERE statistic_name = '%s'", "total_requests");
        }
        sQLiteDatabase.execSQL(format);
    }

    @Override // defpackage.dx2, defpackage.e74
    /* renamed from: a */
    public void mo1a() {
    }

    @Override // defpackage.wg3
    /* renamed from: e */
    public void mo0e(Object obj) {
        ((ve3) obj).h();
    }
}