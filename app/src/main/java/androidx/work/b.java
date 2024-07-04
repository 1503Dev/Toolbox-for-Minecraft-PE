package androidx.work;

import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public final class b {
    public static final String b = y20.e("Data");
    public static final b c;
    public HashMap a;

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static final class a {
        public HashMap a = new HashMap();

        public final void a(HashMap hashMap) {
            for (Map.Entry entry : hashMap.entrySet()) {
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                if (value == null) {
                    this.a.put(str, null);
                } else {
                    Class<?> cls = value.getClass();
                    if (cls != Boolean.class && cls != Byte.class && cls != Integer.class && cls != Long.class && cls != Float.class && cls != Double.class && cls != String.class && cls != Boolean[].class && cls != Byte[].class && cls != Integer[].class && cls != Long[].class && cls != Float[].class && cls != Double[].class && cls != String[].class) {
                        int i = 0;
                        if (cls == boolean[].class) {
                            HashMap hashMap2 = this.a;
                            boolean[] zArr = (boolean[]) value;
                            String str2 = b.b;
                            Boolean[] boolArr = new Boolean[zArr.length];
                            while (i < zArr.length) {
                                boolArr[i] = Boolean.valueOf(zArr[i]);
                                i++;
                            }
                            hashMap2.put(str, boolArr);
                        } else if (cls == byte[].class) {
                            HashMap hashMap3 = this.a;
                            byte[] bArr = (byte[]) value;
                            String str3 = b.b;
                            Byte[] bArr2 = new Byte[bArr.length];
                            while (i < bArr.length) {
                                bArr2[i] = Byte.valueOf(bArr[i]);
                                i++;
                            }
                            hashMap3.put(str, bArr2);
                        } else if (cls == int[].class) {
                            HashMap hashMap4 = this.a;
                            int[] iArr = (int[]) value;
                            String str4 = b.b;
                            Integer[] numArr = new Integer[iArr.length];
                            while (i < iArr.length) {
                                numArr[i] = Integer.valueOf(iArr[i]);
                                i++;
                            }
                            hashMap4.put(str, numArr);
                        } else if (cls == long[].class) {
                            HashMap hashMap5 = this.a;
                            long[] jArr = (long[]) value;
                            String str5 = b.b;
                            Long[] lArr = new Long[jArr.length];
                            while (i < jArr.length) {
                                lArr[i] = Long.valueOf(jArr[i]);
                                i++;
                            }
                            hashMap5.put(str, lArr);
                        } else if (cls == float[].class) {
                            HashMap hashMap6 = this.a;
                            float[] fArr = (float[]) value;
                            String str6 = b.b;
                            Float[] fArr2 = new Float[fArr.length];
                            while (i < fArr.length) {
                                fArr2[i] = Float.valueOf(fArr[i]);
                                i++;
                            }
                            hashMap6.put(str, fArr2);
                        } else if (cls == double[].class) {
                            HashMap hashMap7 = this.a;
                            double[] dArr = (double[]) value;
                            String str7 = b.b;
                            Double[] dArr2 = new Double[dArr.length];
                            while (i < dArr.length) {
                                dArr2[i] = Double.valueOf(dArr[i]);
                                i++;
                            }
                            hashMap7.put(str, dArr2);
                        } else {
                            throw new IllegalArgumentException(String.format("Key %s has invalid type %s", str, cls));
                        }
                    } else {
                        this.a.put(str, value);
                    }
                }
            }
        }
    }

    static {
        b bVar = new b(new HashMap());
        b(bVar);
        c = bVar;
    }

    public b() {
    }

    public b(b bVar) {
        this.a = new HashMap(bVar.a);
    }

    public b(HashMap hashMap) {
        this.a = new HashMap(hashMap);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:3|(2:4|5)|(5:7|8|(2:10|11)|13|14)|15|16|17|18) */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0039, code lost:
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x005b, code lost:
        android.util.Log.e(androidx.work.b.b, "Error in Data#fromByteArray: ", r7);
     */
    /* JADX WARN: Not initialized variable reg: 3, insn: 0x0067: MOVE  (r7 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]), block:B:39:0x0066 */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0050 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x006a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static b a(byte[] bArr) {
        ObjectInputStream objectInputStream;
        Throwable e;
        ObjectInputStream objectInputStream2;
        if (bArr.length <= 10240) {
            HashMap hashMap = new HashMap();
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            ObjectInputStream objectInputStream3 = null;
            try {
                try {
                    objectInputStream = new ObjectInputStream(byteArrayInputStream);
                } catch (Throwable th) {
                    th = th;
                    objectInputStream3 = objectInputStream2;
                    if (objectInputStream3 != null) {
                        try {
                            objectInputStream3.close();
                        } catch (IOException e2) {
                            Log.e(b, "Error in Data#fromByteArray: ", e2);
                        }
                    }
                    try {
                        byteArrayInputStream.close();
                    } catch (IOException e3) {
                        Log.e(b, "Error in Data#fromByteArray: ", e3);
                    }
                    throw th;
                }
            } catch (IOException e4) {
                e = e4;
                Throwable th2 = e;
                objectInputStream = null;
                e = th2;
                Log.e(b, "Error in Data#fromByteArray: ", e);
                if (objectInputStream != null) {
                    try {
                        objectInputStream.close();
                    } catch (IOException e5) {
                        Log.e(b, "Error in Data#fromByteArray: ", e5);
                    }
                }
                byteArrayInputStream.close();
                return new b(hashMap);
            } catch (ClassNotFoundException e6) {
                e = e6;
                Throwable th22 = e;
                objectInputStream = null;
                e = th22;
                Log.e(b, "Error in Data#fromByteArray: ", e);
                if (objectInputStream != null) {
                }
                byteArrayInputStream.close();
                return new b(hashMap);
            } catch (Throwable th3) {
                th = th3;
                if (objectInputStream3 != null) {
                }
                byteArrayInputStream.close();
                throw th;
            }
            try {
                for (int readInt = objectInputStream.readInt(); readInt > 0; readInt--) {
                    hashMap.put(objectInputStream.readUTF(), objectInputStream.readObject());
                }
                try {
                    objectInputStream.close();
                } catch (IOException e7) {
                    Log.e(b, "Error in Data#fromByteArray: ", e7);
                }
            } catch (IOException e8) {
                e = e8;
                Log.e(b, "Error in Data#fromByteArray: ", e);
                if (objectInputStream != null) {
                }
                byteArrayInputStream.close();
                return new b(hashMap);
            } catch (ClassNotFoundException e9) {
                e = e9;
                Log.e(b, "Error in Data#fromByteArray: ", e);
                if (objectInputStream != null) {
                }
                byteArrayInputStream.close();
                return new b(hashMap);
            }
            byteArrayInputStream.close();
            return new b(hashMap);
        }
        throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
    }

    public static byte[] b(b bVar) {
        ObjectOutputStream objectOutputStream;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream2 = null;
        try {
            try {
                objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            } catch (Throwable th) {
                th = th;
                objectOutputStream = null;
            }
        } catch (IOException e) {
            e = e;
        }
        try {
            objectOutputStream.writeInt(bVar.a.size());
            for (Map.Entry entry : bVar.a.entrySet()) {
                objectOutputStream.writeUTF((String) entry.getKey());
                objectOutputStream.writeObject(entry.getValue());
            }
            try {
                objectOutputStream.close();
            } catch (IOException e2) {
                Log.e(b, "Error in Data#toByteArray: ", e2);
            }
            try {
                byteArrayOutputStream.close();
            } catch (IOException e3) {
                Log.e(b, "Error in Data#toByteArray: ", e3);
            }
            if (byteArrayOutputStream.size() <= 10240) {
                return byteArrayOutputStream.toByteArray();
            }
            throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
        } catch (IOException e4) {
            e = e4;
            objectOutputStream2 = objectOutputStream;
            Log.e(b, "Error in Data#toByteArray: ", e);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            if (objectOutputStream2 != null) {
                try {
                    objectOutputStream2.close();
                } catch (IOException e5) {
                    Log.e(b, "Error in Data#toByteArray: ", e5);
                }
            }
            try {
                byteArrayOutputStream.close();
            } catch (IOException e6) {
                Log.e(b, "Error in Data#toByteArray: ", e6);
            }
            return byteArray;
        } catch (Throwable th2) {
            th = th2;
            if (objectOutputStream != null) {
                try {
                    objectOutputStream.close();
                } catch (IOException e7) {
                    Log.e(b, "Error in Data#toByteArray: ", e7);
                }
            }
            try {
                byteArrayOutputStream.close();
            } catch (IOException e8) {
                Log.e(b, "Error in Data#toByteArray: ", e8);
            }
            throw th;
        }
    }

    public final boolean equals(Object obj) {
        boolean z;
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        Set<String> keySet = this.a.keySet();
        if (keySet.equals(bVar.a.keySet())) {
            for (String str : keySet) {
                Object obj2 = this.a.get(str);
                Object obj3 = bVar.a.get(str);
                if (obj2 == null || obj3 == null) {
                    if (obj2 == obj3) {
                        z = true;
                        continue;
                    } else {
                        z = false;
                        continue;
                    }
                } else if ((obj2 instanceof Object[]) && (obj3 instanceof Object[])) {
                    z = Arrays.deepEquals((Object[]) obj2, (Object[]) obj3);
                    continue;
                } else {
                    z = obj2.equals(obj3);
                    continue;
                }
                if (!z) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Data {");
        if (!this.a.isEmpty()) {
            for (String str : this.a.keySet()) {
                sb.append(str);
                sb.append(" : ");
                Object obj = this.a.get(str);
                if (obj instanceof Object[]) {
                    sb.append(Arrays.toString((Object[]) obj));
                } else {
                    sb.append(obj);
                }
                sb.append(", ");
            }
        }
        sb.append("}");
        return sb.toString();
    }
}