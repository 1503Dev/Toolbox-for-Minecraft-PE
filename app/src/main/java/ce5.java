package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: ce5  reason: default package */
public abstract class ce5 {
    public static final Logger a = Logger.getLogger(qd5.class.getName());
    public static final String b = "com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader";

    public static ud5 b() {
        String format;
        ClassLoader classLoader = ce5.class.getClassLoader();
        if (ud5.class.equals(ud5.class)) {
            format = b;
        } else if (!ud5.class.getPackage().equals(ce5.class.getPackage())) {
            throw new IllegalArgumentException(ud5.class.getName());
        } else {
            format = String.format("%s.BlazeGenerated%sLoader", ud5.class.getPackage().getName(), ud5.class.getSimpleName());
        }
        try {
            try {
                try {
                    try {
                        return (ud5) ud5.class.cast(((ce5) Class.forName(format, true, classLoader).getConstructor(new Class[0]).newInstance(new Object[0])).a());
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
            Iterator it = ServiceLoader.load(ce5.class, classLoader).iterator();
            ArrayList arrayList = new ArrayList();
            while (it.hasNext()) {
                try {
                    arrayList.add((ud5) ud5.class.cast(((ce5) it.next()).a()));
                } catch (ServiceConfigurationError e5) {
                    a.logp(Level.SEVERE, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", "Unable to load ".concat(ud5.class.getSimpleName()), (Throwable) e5);
                }
            }
            if (arrayList.size() == 1) {
                return (ud5) arrayList.get(0);
            }
            if (arrayList.size() == 0) {
                return null;
            }
            try {
                return (ud5) ud5.class.getMethod("combine", Collection.class).invoke(null, arrayList);
            } catch (IllegalAccessException e6) {
                throw new IllegalStateException(e6);
            } catch (NoSuchMethodException e7) {
                throw new IllegalStateException(e7);
            } catch (InvocationTargetException e8) {
                throw new IllegalStateException(e8);
            }
        }
    }

    public abstract ud5 a();
}