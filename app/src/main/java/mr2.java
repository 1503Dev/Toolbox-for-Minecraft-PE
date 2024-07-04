package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: mr2  reason: default package */
public abstract class mr2 {
    public static final Logger a = Logger.getLogger(hg2.class.getName());
    public static final String b = "com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader";

    public static hk2 b() {
        String format;
        ClassLoader classLoader = mr2.class.getClassLoader();
        if (hk2.class.equals(hk2.class)) {
            format = b;
        } else if (!hk2.class.getPackage().equals(mr2.class.getPackage())) {
            throw new IllegalArgumentException(hk2.class.getName());
        } else {
            format = String.format("%s.BlazeGenerated%sLoader", hk2.class.getPackage().getName(), hk2.class.getSimpleName());
        }
        try {
            try {
                try {
                    try {
                        return (hk2) hk2.class.cast(((mr2) Class.forName(format, true, classLoader).getConstructor(new Class[0]).newInstance(new Object[0])).a());
                    } catch (IllegalAccessException e) {
                        throw new IllegalStateException(e);
                    }
                } catch (InvocationTargetException e2) {
                    throw new IllegalStateException(e2);
                }
            } catch (InstantiationException e3) {
                throw new IllegalStateException(e3);
            } catch (NoSuchMethodException e4) {
                throw new IllegalStateException(e4);
            }
        } catch (ClassNotFoundException unused) {
            Iterator it = ServiceLoader.load(mr2.class, classLoader).iterator();
            ArrayList arrayList = new ArrayList();
            while (it.hasNext()) {
                try {
                    arrayList.add((hk2) hk2.class.cast(((mr2) it.next()).a()));
                } catch (ServiceConfigurationError e5) {
                    a.logp(Level.SEVERE, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", "Unable to load ".concat(hk2.class.getSimpleName()), (Throwable) e5);
                }
            }
            if (arrayList.size() == 1) {
                return (hk2) arrayList.get(0);
            }
            if (arrayList.size() == 0) {
                return null;
            }
            try {
                return (hk2) hk2.class.getMethod("combine", Collection.class).invoke(null, arrayList);
            } catch (IllegalAccessException e6) {
                throw new IllegalStateException(e6);
            } catch (NoSuchMethodException e7) {
                throw new IllegalStateException(e7);
            } catch (InvocationTargetException e8) {
                throw new IllegalStateException(e8);
            }
        }
    }

    public abstract hk2 a();
}