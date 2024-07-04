package android.app;

import android.annotation.NonNull;
import android.annotation.Nullable;
import android.content.BroadcastReceiver;
import android.content.ContentProvider;
import android.content.Intent;

public /* synthetic */ class AppComponentFactory {
    static {
        throw new NoClassDefFoundError();
    }

    @NonNull
    public native /* synthetic */ Activity instantiateActivity(@NonNull ClassLoader classLoader, @NonNull String str, @Nullable Intent intent) throws ClassNotFoundException, IllegalAccessException, InstantiationException;

    @NonNull
    public native /* synthetic */ Application instantiateApplication(@NonNull ClassLoader classLoader, @NonNull String str) throws ClassNotFoundException, IllegalAccessException, InstantiationException;

    @NonNull
    public native /* synthetic */ ContentProvider instantiateProvider(@NonNull ClassLoader classLoader, @NonNull String str) throws ClassNotFoundException, IllegalAccessException, InstantiationException;

    @NonNull
    public native /* synthetic */ BroadcastReceiver instantiateReceiver(@NonNull ClassLoader classLoader, @NonNull String str, @Nullable Intent intent) throws ClassNotFoundException, IllegalAccessException, InstantiationException;

    @NonNull
    public native /* synthetic */ Service instantiateService(@NonNull ClassLoader classLoader, @NonNull String str, @Nullable Intent intent) throws ClassNotFoundException, IllegalAccessException, InstantiationException;
}