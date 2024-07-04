package defpackage;

import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* renamed from: pq  reason: default package */
public final class pq {
    public static final a a = new a();

    /* renamed from: pq$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class a implements Comparator<byte[]> {
        @Override // java.util.Comparator
        public final int compare(byte[] bArr, byte[] bArr2) {
            byte[] bArr3 = bArr;
            byte[] bArr4 = bArr2;
            if (bArr3.length != bArr4.length) {
                return bArr3.length - bArr4.length;
            }
            for (int i = 0; i < bArr3.length; i++) {
                byte b = bArr3[i];
                byte b2 = bArr4[i];
                if (b != b2) {
                    return b - b2;
                }
            }
            return 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0090 A[LOOP:1: B:15:0x004b->B:30:0x0090, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0094 A[EDGE_INSN: B:80:0x0094->B:32:0x0094 ?: BREAK  , SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static yq a(Context context, rq rqVar) {
        Cursor cursor;
        int i;
        int i2;
        Uri withAppendedId;
        int i3;
        boolean z;
        boolean z2;
        PackageManager packageManager = context.getPackageManager();
        Resources resources = context.getResources();
        String str = rqVar.a;
        ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(str, 0);
        if (resolveContentProvider != null) {
            if (resolveContentProvider.packageName.equals(rqVar.b)) {
                Signature[] signatureArr = packageManager.getPackageInfo(resolveContentProvider.packageName, 64).signatures;
                ArrayList arrayList = new ArrayList();
                for (Signature signature : signatureArr) {
                    arrayList.add(signature.toByteArray());
                }
                Collections.sort(arrayList, a);
                List<List<byte[]>> list = rqVar.d;
                if (list == null) {
                    list = xq.b(resources, 0);
                }
                int i4 = 0;
                while (true) {
                    cursor = null;
                    if (i4 < list.size()) {
                        ArrayList arrayList2 = new ArrayList(list.get(i4));
                        Collections.sort(arrayList2, a);
                        if (arrayList.size() == arrayList2.size()) {
                            for (int i5 = 0; i5 < arrayList.size(); i5++) {
                                if (Arrays.equals((byte[]) arrayList.get(i5), (byte[]) arrayList2.get(i5))) {
                                }
                            }
                            z2 = true;
                            if (!z2) {
                                break;
                            }
                            i4++;
                        }
                        z2 = false;
                        if (!z2) {
                        }
                    } else {
                        resolveContentProvider = null;
                        break;
                    }
                }
                if (resolveContentProvider == null) {
                    return new yq(1, null);
                }
                String str2 = resolveContentProvider.authority;
                ArrayList arrayList3 = new ArrayList();
                Uri build = new Uri.Builder().scheme("content").authority(str2).build();
                Uri build2 = new Uri.Builder().scheme("content").authority(str2).appendPath("file").build();
                try {
                    cursor = context.getContentResolver().query(build, new String[]{"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"}, "query = ?", new String[]{rqVar.c}, null, null);
                    if (cursor != null && cursor.getCount() > 0) {
                        int columnIndex = cursor.getColumnIndex("result_code");
                        arrayList3 = new ArrayList();
                        int columnIndex2 = cursor.getColumnIndex("_id");
                        int columnIndex3 = cursor.getColumnIndex("file_id");
                        int columnIndex4 = cursor.getColumnIndex("font_ttc_index");
                        int columnIndex5 = cursor.getColumnIndex("font_weight");
                        int columnIndex6 = cursor.getColumnIndex("font_italic");
                        while (cursor.moveToNext()) {
                            if (columnIndex != -1) {
                                i = cursor.getInt(columnIndex);
                            } else {
                                i = 0;
                            }
                            if (columnIndex4 != -1) {
                                i2 = cursor.getInt(columnIndex4);
                            } else {
                                i2 = 0;
                            }
                            if (columnIndex3 == -1) {
                                withAppendedId = ContentUris.withAppendedId(build, cursor.getLong(columnIndex2));
                            } else {
                                withAppendedId = ContentUris.withAppendedId(build2, cursor.getLong(columnIndex3));
                            }
                            Uri uri = withAppendedId;
                            if (columnIndex5 != -1) {
                                i3 = cursor.getInt(columnIndex5);
                            } else {
                                i3 = 400;
                            }
                            if (columnIndex6 != -1 && cursor.getInt(columnIndex6) == 1) {
                                z = true;
                            } else {
                                z = false;
                            }
                            arrayList3.add(new zq(uri, i2, i3, z, i));
                        }
                    }
                    return new yq(0, (zq[]) arrayList3.toArray(new zq[0]));
                } finally {
                    if (cursor != null) {
                        cursor.close();
                    }
                }
            }
            throw new PackageManager.NameNotFoundException("Found content provider " + str + ", but package was not " + rqVar.b);
        }
        throw new PackageManager.NameNotFoundException(k6.b("No package found for authority: ", str));
    }
}