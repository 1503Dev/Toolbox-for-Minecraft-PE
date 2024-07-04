package io.mrarm.yurai.msa;

import android.content.Context;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class MSASingleton {
    private static MSASingleton instance;
    private AccountManager accountManager;
    private LoginManager loginManager;
    private File path;
    private StorageManager storageManager;

    public MSASingleton(Context context) {
        File file = new File(context.getFilesDir(), "msa");
        this.path = file;
        file.mkdirs();
        initCurlSsl(context);
        SimpleStorageManager simpleStorageManager = new SimpleStorageManager(this.path.getAbsolutePath());
        this.storageManager = simpleStorageManager;
        this.loginManager = new LoginManager(simpleStorageManager);
        this.accountManager = new AccountManager(this.storageManager);
    }

    public static MSASingleton getInstance(Context context) {
        if (instance == null && context != null) {
            instance = new MSASingleton(context);
        }
        return instance;
    }

    private void initCurlSsl(Context context) {
        File file = new File(this.path, "microsoft_ca.pem");
        try {
            InputStream openRawResource = context.getResources().openRawResource(pi0.microsoft_ca);
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            byte[] bArr = new byte[16384];
            while (true) {
                int read = openRawResource.read(bArr);
                if (read <= 0) {
                    openRawResource.close();
                    fileOutputStream.close();
                    nativeInitCurlSsl(file.getAbsolutePath());
                    return;
                }
                fileOutputStream.write(bArr, 0, read);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static native void nativeInitCurlSsl(String str);

    public AccountManager getAccountManager() {
        return this.accountManager;
    }

    public LoginManager getLoginManager() {
        return this.loginManager;
    }
}