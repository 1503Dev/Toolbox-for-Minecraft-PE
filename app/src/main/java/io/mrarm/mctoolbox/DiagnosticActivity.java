package io.mrarm.mctoolbox;

import android.annotation.SuppressLint;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import io.mrarm.mctoolbox.DiagnosticActivity;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.security.MessageDigest;

public class DiagnosticActivity extends AppCompatActivity {
    public static final /* synthetic */ int d0 = 0;
    public k1 c0;

    public static void r(Context context) {
        if (Build.VERSION.SDK_INT >= 29) {
            File file = new File(context.getFilesDir(), "ToolboxLogSnapshot.txt");
            try {
                file.delete();
                Runtime runtime = Runtime.getRuntime();
                runtime.exec("logcat -L -d -b all -f " + file.getAbsolutePath()).waitFor();
                if (!file.exists() || file.length() == 0) {
                    Runtime runtime2 = Runtime.getRuntime();
                    runtime2.exec("logcat -d -b all -f " + file.getAbsolutePath()).waitFor();
                }
            } catch (Exception e) {
                StringBuilder b = e5.b("Failed to save logcat: ");
                b.append(e.getMessage());
                Toast.makeText(context, b.toString(), 0).show();
                e.printStackTrace();
            }
            if (file.exists()) {
                ContentResolver contentResolver = context.getContentResolver();
                Log.e("DEBUG", "Toolbox Log size: " + file.length());
                ContentValues contentValues = new ContentValues();
                contentValues.put("_display_name", "ToolboxLogSnapshot.txt");
                contentValues.put("_size", Long.valueOf(file.length()));
                Uri insert = contentResolver.insert(MediaStore.Downloads.EXTERNAL_CONTENT_URI, contentValues);
                FileInputStream fileInputStream = new FileInputStream(file);
                OutputStream openOutputStream = contentResolver.openOutputStream(insert);
                try {
                    byte[] bArr = new byte[8096];
                    while (true) {
                        int read = fileInputStream.read(bArr);
                        if (read <= 0) {
                            break;
                        }
                        openOutputStream.write(bArr, 0, read);
                    }
                    if (openOutputStream != null) {
                        openOutputStream.close();
                    }
                    fileInputStream.close();
                    Toast.makeText(context, "Saved logcat to Downloads as ToolboxLogSnapshot.txt", 0).show();
                    file.delete();
                    return;
                } catch (Throwable th) {
                    if (openOutputStream != null) {
                        try {
                            openOutputStream.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            }
            throw new RuntimeException("File not saved");
        }
        File file2 = new File(Environment.getExternalStorageDirectory(), "ToolboxLogSnapshot.txt");
        try {
            file2.delete();
            Runtime runtime3 = Runtime.getRuntime();
            runtime3.exec("logcat -L -d -b all -f " + file2.getAbsolutePath()).waitFor();
            if (file2.exists()) {
                Toast.makeText(context, "Saved logcat to: " + file2, 0).show();
                return;
            }
            throw new RuntimeException("File not saved");
        } catch (Exception e2) {
            StringBuilder b2 = e5.b("Failed to save logcat: ");
            b2.append(e2.getMessage());
            Toast.makeText(context, b2.toString(), 0).show();
            e2.printStackTrace();
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String str;
        PackageInfo packageInfo;
        PackageInfo packageInfo2;
        String str2;
        i60 a;
        StringBuilder b;
        String message;
        String str3;
        String str4;
        String str5;
        File a2;
        super.onCreate(bundle);
        t(getIntent());
        androidx.databinding.DataBinderMapperImpl dataBinderMapperImpl = jj.a;
        setContentView(2131492892);
        k1 k1Var = (k1) jj.b(null, (ViewGroup) getWindow().getDecorView().findViewById(16908290), 0, 2131492892);
        this.c0 = k1Var;
        TextView textView = k1Var.e0;
        StringBuilder sb = new StringBuilder();
        if (Build.VERSION.SDK_INT >= 21) {
            for (String str6 : Build.SUPPORTED_ABIS) {
                sb.append(str6);
                sb.append(" ");
            }
        } else {
            sb.append(Build.CPU_ABI);
            sb.append(" ");
            sb.append(Build.CPU_ABI2);
        }
        StringBuilder b2 = e5.b("Device Model: ");
        b2.append(Build.MANUFACTURER);
        b2.append(" (");
        b2.append(Build.BRAND);
        b2.append(") ");
        b2.append(Build.MODEL);
        b2.append("\nAndroid Version: ");
        b2.append(Build.VERSION.RELEASE);
        b2.append(" (SDK_INT=");
        b2.append(Build.VERSION.SDK_INT);
        b2.append(")\nABI: ");
        b2.append((Object) sb);
        textView.setText(b2.toString());
        TextView textView2 = this.c0.g0;
        String str7 = "";
        try {
            packageInfo = getPackageManager().getPackageInfo(getPackageName(), 0);
            try {
                packageInfo2 = getPackageManager().getPackageInfo("com.mojang.minecraftpe", 0);
                try {
                    str2 = getPackageManager().getInstallerPackageName(getPackageName());
                    try {
                        str7 = getPackageManager().getInstallerPackageName("com.mojang.minecraftpe");
                    } catch (IllegalArgumentException unused) {
                    }
                } catch (IllegalArgumentException unused2) {
                    str2 = "";
                }
                a = i60.a(this);
                b = e5.b("Minecraft: ");
                b.append(packageInfo2.versionName);
                b.append(" ");
                b.append(packageInfo2.versionCode);
                b.append(" ");
                b.append(str7);
                b.append("\nMinecraft lib: ");
                try {
                    a2 = new jd0(this).a("libminecraftpe.so");
                } catch (Exception e) {
                    message = e.getMessage();
                }
            } catch (PackageManager.NameNotFoundException unused3) {
                str = "Minecraft NOT INSTALLED";
            }
        } catch (PackageManager.NameNotFoundException unused4) {
            str = "Toolbox missing?";
        }
        if (a2 != null) {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            FileInputStream fileInputStream = new FileInputStream(a2);
            byte[] bArr = new byte[524288];
            while (true) {
                int read = fileInputStream.read(bArr);
                if (read <= 0) {
                    break;
                }
                messageDigest.update(bArr, 0, read);
            }
            fileInputStream.close();
            byte[] digest = messageDigest.digest();
            StringBuilder sb2 = new StringBuilder(digest.length * 2);
            int length = digest.length;
            for (int i = 0; i < length; i++) {
                sb2.append(String.format("%02x", Integer.valueOf(digest[i] & 255)));
            }
            message = sb2.substring(0, 24);
            b.append(message);
            b.append("\nToolbox: ");
            b.append(packageInfo.packageName);
            b.append(" ");
            b.append(packageInfo.versionName);
            b.append(" ");
            b.append(packageInfo.versionCode);
            b.append(" ");
            b.append(str2);
            b.append("\nSupported versions: ");
            b.append(i60.a(this).b());
            b.append("\n64-bit: Process ");
            String str8 = "YES";
            if (a0.a()) {
                str3 = "YES";
            } else {
                str3 = "NO";
            }
            b.append(str3);
            b.append(", Minecraft ");
            if (!a0.b(packageInfo2.applicationInfo)) {
                str4 = "YES";
            } else {
                str4 = "NO";
            }
            b.append(str4);
            b.append("\nVersion Supported: 64-bit ");
            if (a.c(packageInfo2.versionName, true)) {
                str5 = "YES";
            } else {
                str5 = "NO";
            }
            b.append(str5);
            b.append(", 32-bit ");
            if (!a.c(packageInfo2.versionName, false)) {
                str8 = "NO";
            }
            b.append(str8);
            str = b.toString();
            textView2.setText(str);
            this.c0.i0.setText(u());
            this.c0.j0.setOnClickListener(new View.OnClickListener() { // from class: tk
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    DiagnosticActivity diagnosticActivity = DiagnosticActivity.this;
                    int i2 = DiagnosticActivity.d0;
                    diagnosticActivity.getClass();
                    new File(diagnosticActivity.s()).delete();
                    diagnosticActivity.c0.i0.setText(diagnosticActivity.u());
                }
            });
            this.c0.f0.setOnClickListener(new View.OnClickListener() { // from class: uk
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i2 = DiagnosticActivity.d0;
                    DiagnosticActivity.r(view.getContext());
                }
            });
            this.c0.h0.setOnClickListener(new vk(0, this));
            return;
        }
        throw new RuntimeException("Lib not found");
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        t(intent);
        k1 k1Var = this.c0;
        if (k1Var != null) {
            k1Var.i0.setText(u());
        }
    }

    @SuppressLint({"SdCardPath"})
    public final String s() {
        StringBuilder b = e5.b("/data/data/");
        b.append(getPackageName());
        b.append("/files/StartupHM.txt");
        return b.toString();
    }

    public final void t(Intent intent) {
        String queryParameter;
        if (intent == null || intent.getData() == null || (queryParameter = intent.getData().getQueryParameter("setHM")) == null) {
            return;
        }
        getFilesDir();
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(new File(s())));
            bufferedWriter.write(queryParameter);
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public final String u() {
        String str;
        StringBuilder sb = new StringBuilder();
        if (new File(Environment.getExternalStorageDirectory(), "tbgui").exists()) {
            sb.append("IMGUI menu files exist\n");
        }
        if (new File(Environment.getExternalStorageDirectory(), "ToolboxMenuOverride").exists()) {
            sb.append("Menu override exists\n");
        }
        if (new File(s()).exists()) {
            StringBuilder b = e5.b("StartupHM file exists: ");
            try {
                BufferedReader bufferedReader = new BufferedReader(new FileReader(new File(s())));
                str = bufferedReader.readLine();
                bufferedReader.close();
            } catch (IOException unused) {
                str = "Failed to read file";
            }
            b.append(str);
            b.append("\n");
            sb.append(b.toString());
        }
        if (sb.length() > 0) {
            return sb.toString().trim();
        }
        return "No launch options";
    }
}