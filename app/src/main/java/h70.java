package defpackage;

import android.content.Context;
import android.content.res.AssetManager;
import dalvik.system.BaseDexClassLoader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: h70  reason: default package */
public final class h70 {
    public static final String[] b = {"libgnustl_shared.so", "libyurai.so"};
    public final File a;

    public h70(Context context, String str) {
        File file = new File(context.getFilesDir(), "native32");
        this.a = file;
        file.mkdir();
        String str2 = "lib" + str + ".so";
        String[] strArr = b;
        for (int i = 0; i < 2; i++) {
            String str3 = strArr[i];
            try {
                a(context.getAssets(), "lib/armeabi-v7a/" + str3, new File(this.a, str3));
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        try {
            a(context.getAssets(), "lib/armeabi-v7a/" + str2, new File(this.a, str2));
            try {
                b(context.getClassLoader());
            } catch (Exception e2) {
                throw new RuntimeException(e2);
            }
        } catch (Exception e3) {
            throw new RuntimeException(e3);
        }
    }

    public static void a(AssetManager assetManager, String str, File file) {
        InputStream inputStream = (InputStream) AssetManager.class.getDeclaredMethod("openNonAsset", String.class).invoke(assetManager, str);
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        byte[] bArr = new byte[16384];
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                inputStream.close();
                fileOutputStream.close();
                return;
            }
            fileOutputStream.write(bArr, 0, read);
        }
    }

    public final void b(ClassLoader classLoader) {
        Object[] objArr;
        Field declaredField = BaseDexClassLoader.class.getDeclaredField("pathList");
        declaredField.setAccessible(true);
        Object obj = declaredField.get(classLoader);
        try {
            Field declaredField2 = obj.getClass().getDeclaredField("nativeLibraryDirectories");
            declaredField2.setAccessible(true);
            File[] fileArr = (File[]) declaredField2.get(obj);
            File[] fileArr2 = new File[fileArr.length + 1];
            System.arraycopy(fileArr, 0, fileArr2, 1, fileArr.length);
            fileArr[0] = this.a;
            declaredField2.set(obj, fileArr2);
        } catch (Exception unused) {
        }
        try {
            try {
                Method declaredMethod = obj.getClass().getDeclaredMethod("makePathElements", List.class);
                declaredMethod.setAccessible(true);
                objArr = (Object[]) declaredMethod.invoke(null, Arrays.asList(this.a));
            } catch (Exception unused2) {
                Method declaredMethod2 = obj.getClass().getDeclaredMethod("makePathElements", List.class, File.class, List.class);
                declaredMethod2.setAccessible(true);
                objArr = (Object[]) declaredMethod2.invoke(null, Arrays.asList(this.a), null, new ArrayList());
            }
            Field declaredField3 = obj.getClass().getDeclaredField("nativeLibraryPathElements");
            declaredField3.setAccessible(true);
            Object[] objArr2 = (Object[]) declaredField3.get(obj);
            Object[] copyOf = Arrays.copyOf(objArr, objArr2.length + objArr.length);
            System.arraycopy(objArr2, 0, copyOf, objArr.length, objArr2.length);
            declaredField3.set(obj, copyOf);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}