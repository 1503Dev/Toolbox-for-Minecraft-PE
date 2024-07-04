package defpackage;

import android.annotation.NonNull;
import android.annotation.Nullable;
import android.app.Person;
import android.graphics.drawable.Icon;

/* renamed from: he0  reason: default package */
public final class he0 {
    /* JADX WARN: Type inference failed for: r0v0, types: [android.app.Person$Builder] */
    public static Person a() {
        return new Object() { // from class: android.app.Person$Builder
            static {
                throw new NoClassDefFoundError();
            }

            @NonNull
            public native /* synthetic */ Person build();

            @NonNull
            public native /* synthetic */ Person$Builder setBot(boolean z);

            @NonNull
            public native /* synthetic */ Person$Builder setIcon(@Nullable Icon icon);

            @NonNull
            public native /* synthetic */ Person$Builder setImportant(boolean z);

            @NonNull
            public native /* synthetic */ Person$Builder setKey(@Nullable String str);

            @NonNull
            public native /* synthetic */ Person$Builder setName(@Nullable CharSequence charSequence);

            @NonNull
            public native /* synthetic */ Person$Builder setUri(@Nullable String str);
        }.setName(null).setIcon(null).setUri(null).setKey(null).setBot(false).setImportant(false).build();
    }
}