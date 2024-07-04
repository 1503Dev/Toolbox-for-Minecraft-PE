package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.Typeface$CustomFallbackBuilder;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily$Builder;
import android.graphics.fonts.FontStyle;
import android.os.ParcelFileDescriptor;
import defpackage.xq;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: b21  reason: default package */
public final class b21 extends e21 {
    @Override // defpackage.e21
    public final Typeface a(Context context, xq.b bVar, Resources resources, int i) {
        int i2;
        try {
            xq.c[] cVarArr = bVar.a;
            int length = cVarArr.length;
            int i3 = 0;
            FontFamily$Builder fontFamily$Builder = null;
            int i4 = 0;
            while (true) {
                int i5 = 1;
                if (i4 >= length) {
                    break;
                }
                xq.c cVar = cVarArr[i4];
                try {
                    Font.Builder weight = new Font.Builder(resources, cVar.f).setWeight(cVar.b);
                    if (!cVar.c) {
                        i5 = 0;
                    }
                    Font build = weight.setSlant(i5).setTtcIndex(cVar.e).setFontVariationSettings(cVar.d).build();
                    if (fontFamily$Builder == null) {
                        fontFamily$Builder = new FontFamily$Builder(build);
                    } else {
                        fontFamily$Builder.addFont(build);
                    }
                } catch (IOException unused) {
                }
                i4++;
            }
            if (fontFamily$Builder == null) {
                return null;
            }
            if ((i & 1) != 0) {
                i2 = 700;
            } else {
                i2 = 400;
            }
            if ((i & 2) != 0) {
                i3 = 1;
            }
            return new Typeface$CustomFallbackBuilder(fontFamily$Builder.build()).setStyle(new FontStyle(i2, i3)).build();
        } catch (Exception unused2) {
            return null;
        }
    }

    @Override // defpackage.e21
    public final Typeface b(Context context, zq[] zqVarArr, int i) {
        int i2;
        ParcelFileDescriptor openFileDescriptor;
        ContentResolver contentResolver = context.getContentResolver();
        try {
            int length = zqVarArr.length;
            int i3 = 0;
            FontFamily$Builder fontFamily$Builder = null;
            int i4 = 0;
            while (true) {
                int i5 = 1;
                if (i4 < length) {
                    zq zqVar = zqVarArr[i4];
                    try {
                        openFileDescriptor = contentResolver.openFileDescriptor(zqVar.a, "r", null);
                    } catch (IOException unused) {
                    }
                    if (openFileDescriptor == null) {
                        if (openFileDescriptor == null) {
                            i4++;
                        }
                    } else {
                        try {
                            Font.Builder weight = new Font.Builder(openFileDescriptor).setWeight(zqVar.c);
                            if (!zqVar.d) {
                                i5 = 0;
                            }
                            Font build = weight.setSlant(i5).setTtcIndex(zqVar.b).build();
                            if (fontFamily$Builder == null) {
                                fontFamily$Builder = new FontFamily$Builder(build);
                            } else {
                                fontFamily$Builder.addFont(build);
                            }
                        } catch (Throwable th) {
                            try {
                                openFileDescriptor.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                            break;
                        }
                    }
                    openFileDescriptor.close();
                    i4++;
                } else if (fontFamily$Builder == null) {
                    return null;
                } else {
                    if ((i & 1) != 0) {
                        i2 = 700;
                    } else {
                        i2 = 400;
                    }
                    if ((i & 2) != 0) {
                        i3 = 1;
                    }
                    return new Typeface$CustomFallbackBuilder(fontFamily$Builder.build()).setStyle(new FontStyle(i2, i3)).build();
                }
            }
        } catch (Exception unused2) {
            return null;
        }
    }

    @Override // defpackage.e21
    public final Typeface c(Context context, InputStream inputStream) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    @Override // defpackage.e21
    public final Typeface d(Context context, Resources resources, int i, String str, int i2) {
        try {
            Font build = new Font.Builder(resources, i).build();
            return new Typeface$CustomFallbackBuilder(new FontFamily$Builder(build).build()).setStyle(build.getStyle()).build();
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // defpackage.e21
    public final zq f(int i, zq[] zqVarArr) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }
}