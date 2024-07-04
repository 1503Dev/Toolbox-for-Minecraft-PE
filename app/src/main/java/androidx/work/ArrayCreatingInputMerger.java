package androidx.work;

import androidx.work.b;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public final class ArrayCreatingInputMerger extends rx {
    @Override // defpackage.rx
    public final b a(ArrayList arrayList) {
        Object newInstance;
        Object newInstance2;
        b.a aVar = new b.a();
        HashMap hashMap = new HashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            for (Map.Entry entry : Collections.unmodifiableMap(((b) it.next()).a).entrySet()) {
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                Class<?> cls = value.getClass();
                Object obj = hashMap.get(str);
                if (obj == null) {
                    if (!cls.isArray()) {
                        newInstance2 = Array.newInstance(value.getClass(), 1);
                        Array.set(newInstance2, 0, value);
                        value = newInstance2;
                        hashMap.put(str, value);
                    } else {
                        hashMap.put(str, value);
                    }
                } else {
                    Class<?> cls2 = obj.getClass();
                    if (cls2.equals(cls)) {
                        if (cls2.isArray()) {
                            int length = Array.getLength(obj);
                            int length2 = Array.getLength(value);
                            Object newInstance3 = Array.newInstance(obj.getClass().getComponentType(), length + length2);
                            System.arraycopy(obj, 0, newInstance3, 0, length);
                            System.arraycopy(value, 0, newInstance3, length, length2);
                            value = newInstance3;
                        } else {
                            newInstance2 = Array.newInstance(obj.getClass(), 2);
                            Array.set(newInstance2, 0, obj);
                            Array.set(newInstance2, 1, value);
                            value = newInstance2;
                        }
                    } else {
                        if (cls2.isArray() && cls2.getComponentType().equals(cls)) {
                            int length3 = Array.getLength(obj);
                            newInstance = Array.newInstance(value.getClass(), length3 + 1);
                            System.arraycopy(obj, 0, newInstance, 0, length3);
                            Array.set(newInstance, length3, value);
                        } else if (cls.isArray() && cls.getComponentType().equals(cls2)) {
                            int length4 = Array.getLength(value);
                            newInstance = Array.newInstance(obj.getClass(), length4 + 1);
                            System.arraycopy(value, 0, newInstance, 0, length4);
                            Array.set(newInstance, length4, obj);
                        } else {
                            throw new IllegalArgumentException();
                        }
                        value = newInstance;
                    }
                    hashMap.put(str, value);
                }
            }
        }
        aVar.a(hashMap);
        b bVar = new b(aVar.a);
        b.b(bVar);
        return bVar;
    }
}