package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Looper;
import android.util.Log;
import android.util.Pair;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* renamed from: l02  reason: default package */
public final class l02 {
    public final Context a;
    public ExecutorService b;
    public DexClassLoader c;
    public xz1 d;
    public byte[] e;
    public final boolean i;
    public mz1 l;
    public final HashMap o;
    public f02 q;
    public volatile o3 f = null;
    public volatile boolean g = false;
    public Future h = null;
    public volatile ey1 j = null;
    public Future k = null;
    public boolean m = false;
    public boolean n = false;
    public boolean p = false;

    public l02(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.i = applicationContext != null;
        context = applicationContext != null ? applicationContext : context;
        this.a = context;
        this.o = new HashMap();
        if (this.q != null) {
            return;
        }
        this.q = new f02(context);
    }

    public static l02 a(Context context, boolean z) {
        boolean z2;
        byte[] a;
        boolean z3;
        boolean z4;
        l02 l02Var = new l02(context);
        try {
            l02Var.b = Executors.newCachedThreadPool(new i02());
            l02Var.g = z;
            if (z) {
                l02Var.h = l02Var.b.submit(new j02(0, l02Var));
            }
            l02Var.b.execute(new b02(1, l02Var));
            try {
                jt jtVar = jt.b;
                Context context2 = l02Var.a;
                jtVar.getClass();
                if (jt.a(context2) > 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                l02Var.m = z3;
                if (jtVar.c(l02Var.a, jt.a) == 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                l02Var.n = z4;
            } catch (Throwable unused) {
            }
            if (l02Var.n) {
                l02Var.k = l02Var.b.submit(new k02(l02Var, 0));
            }
            char[] cArr = o02.a;
            if (Looper.myLooper() == Looper.getMainLooper()) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2 && ((Boolean) w82.d.c.a(x92.E2)).booleanValue()) {
                throw new IllegalStateException("Task Context initialization must not be called from the UI thread.");
            }
            l02Var.d = new xz1();
            try {
                try {
                    a = ty1.a("kSZGl2wIzAC9o1umQ7rlAOj3/PdgBP/Y/cWyDef6yws=", false);
                } catch (wz1 e) {
                    throw new d02(e);
                }
            } catch (IllegalArgumentException e2) {
                throw new wz1(e2);
            }
        } catch (d02 unused2) {
        }
        if (a.length == 32) {
            byte[] bArr = new byte[16];
            ByteBuffer.wrap(a, 4, 16).get(bArr);
            for (int i = 0; i < 16; i++) {
                bArr[i] = (byte) (bArr[i] ^ 68);
            }
            l02Var.e = bArr;
            try {
                try {
                    File cacheDir = l02Var.a.getCacheDir();
                    if (cacheDir == null && (cacheDir = l02Var.a.getDir("dex", 0)) == null) {
                        throw new d02();
                    }
                    File file = new File(String.format("%s/%s.jar", cacheDir, "1675452915457"));
                    if (!file.exists()) {
                        xz1 xz1Var = l02Var.d;
                        byte[] bArr2 = l02Var.e;
                        xz1Var.getClass();
                        byte[] b = xz1.b("trVxDo4xR3s3qSHnqiKoHxetraVfaoPibHlEJYLVF4205g7eT/hgnkS40709j6ZQQs00BlbaD6x8j855bfbpSysB1aRuG6q3OF3Cuur4WbEudVVZ6ZQFenFcslsUewXhNWt39fsQz9gnZTL7B4gSsek0TVbQdxs76SFpRtyCbz9cpxAy8cIFA1IAdwv7liCStQtL8GEyreKOdIj6OfdPov7zAmc0jtERcO9gl0LSoVG3seAwLfrpJxAjCEm58czDsIb+d7KOAKHuHxPyYVbukRb7SvV+J2fx+rUADeQBuzEXTap8ZgzSdK1VVyK6bNrmjdwdCPNf1OwmWrNC47hpwLU3BeqKCEg/QfGabKwhzMgwGHh65ZKiNXw5O9ZeFl1UGncHLKahwaQkeuf94i7rKd0ZGzG9Gjt5PmcVN//iJpr03Bf1KYBtJUNO3Hmiz6s/xgabrwC1lslXmE3VhSBlYwpKGQA9jMTr9fkUDoJfDOzKR81WrRKX4tNK8BHoyBWT7xg8U3tlBspJVbDWsXxsknU6a5sw/DmN0lY8FCoV7GJQD3ApCXrVLKhFs82j9jlnlw0PuliiLBUtnHA/Xvh/tGVo49aHceeMKTc3uL/pP7Em+4Dw0osVeLSyENgGU8XK1Q78ow/sE9SpzUkzrR0ul1qXXKN7xfnJq1S95XVJuCx9wg3nfKRaEjzZQBlB8fIcFEQrYR6VSosRVb8aJ6G09PMqE96Flm7H25rshatMNYm0w1l3py0lL5h5QJWUE/oNRLzGJ7uuibwHiH6K37ZzboKTTUjyZU56NqtR8izkSuaHiY9QyULWiP+eqLQ4/j+DSOtkIJbPKbXLk4O69T4VZvO9m1UJ33d5k3tDYP9EfFWMl5UndVGHBticcPClBbliY2VY3v4nIJ3A14bialqlkuS1EF717iWb/1a9WGaSAU6PGK7rOY+8I0wxVf9WbzZBkGnfPpkbfIdDw/SDaiArzJP9KzQE2lajLpBMPSaeWgnOWcymyRwDrNm6B/xASwIeBtH3pLDFrafztcvorteEZ3erhLcrDGttUYOC0alcKUraOyFYzbZ3fUVy6EYMbExZG9qjVAkqTnaeFmHq/2wih/8Mm3zxrPZfCRuHkiw8QTA7z4NhbRON0yReqUg3/zLJ9yM60kVTpfqSlUAhm+LmmalorxNELUMun62CJEHrFrpVhNIQbmlzBet8F+cjyqjTu9N0i8TUDSDVblCcnXVExyf+93NteJ1fz/3vK1y/H9885v6j4+blxUImiKLXzy295QOBtvYPUelv3NQsSJn9TQxrGXLlocQqylnttrnCbXCsjntkJ7hmg0BVemCzkdY/B3nGr2yL58KH/8wL5NkGBSMvHeMctEolOzvhWpJJXwxzmn1SaW2YIoupxNj2jVhWObrRq+YFMLbHvxzJ2Lya2EXv6AqflxKLQC27EXHInRXjTb6sMy0yYAAo7/u0A+tbtgu+KTDUBdLTDK1yYiaxBeRYRNZL5VjTtCFgDOOBZdOBYsqFWwrmXq6UAul/90e/iAmr4EYD4xETs7WxWRhEEsXxj8wqTtZ+bqu/aAYohGawBe4JdwcL09muwHqsl+86hiD6aVOP0XmDq78c+27LjTykzquDZQkN8E605qg3H6N3gcZbSnYy5Y1AO1Dbsx2oSh3PurPJkp3m/U51TFoo3Ay4Qy/vS0qKlK5/pUkeT5nkmfhzBOaz0K4i7e4v1TV/mNSevfN52VkqYZG+ARO3wYrMBvnwp4tq5RWiRfRXtf8YbEf4uz7QeOtPwDoETlIz9xrur6rvpJORr0cOkOmDhzsMIkFERUvBUgvTcaui2/NqprehAAN56wOq11mTCEA1rs75ZFYZTAsScocd3mR9CNo7W66tIoUzz+nqfEl+2c3uGbn2GdILoWJd9LKFD2oTQm7cVrbyEZp6MBvgUy6Ez6xvHyICLtDnu8MICHo5aUJ93eT/Q71OQVPSzYj0nLIaRA++X4RPsmF4N0I0yplCt8D1bzR3vvVBQMXsHLmcbvz4y5RmkBMFAyYPG5bMA9VJGkwE9+/dwOoBjIiblHO7vIml8bqNLamyfXqR33ax7T79iUNe2usDhjIRxiR1DIE6r6d5wEQehGkK9nITy1WYKZE4nCQKPpBcaEie58VrlgbOVL7NEaul759fr6zcr1deLCDbR3Dqrn5jl8r18/XHrDcj0xs6RC1amy+TooXvOEQH0E88ipe1dSnHOmFUuC8g9Z1KfOK/+72a+17t7nKEYHjfI/snIA9bJff+7Woum8RmmcywbTRqsGl3rVmqmi6GotQw6eWyEQ3orBjoOKDD7bKbqK1LOSdrRbBX9cWnscJn2ogLtb3ACMvpQwo1bJ0MUZc2FNHcNLZEogdf1CrTgfdhEV+tmmxj29ThhUfH5Fe8XCoUDMa6XrFENOJ57tMoxKsDk5S37it3dBAjMw5O7drGXADp6ACqOED25Ldbh0dvOOp1bS5DjDsHMC2bGDKlzGXmZ9WFk1qKnGOgf5O8+/Mzkk3Jyp4De21UXrHqguStuUqcr7T/DI1Y8oq2Rs6cE9TyhB2mo8s76VtOSZqFaz2e4KVT0862Ty3ZBCECvnYX70jPrRd1hCKd4i0jYWdMbeFudI/Mla1dwNZ3Bw8DWKIXNBbVayuCXu7pZy/9Bwgqlm0cwdcvV3IMR4EcFUiTbYGm3iJSle5JQ1KqHM69EOGusmvS95geKDilxMPssKVoK7x0cEPbuo2suGbDKIPyvBB5ujornVXZtAKrkmJpO7q8q0/aAT1qBNegA5LhvtiSaXDocykZxDirJGVFOnil9WYwCd22/f0Ob9WC5uXSUcV3BPeBclkRG/kp+4XdPhfWFP3YKodb+T2WqjGNA65QTK3qDWOj1uVjB6PB4LwLEm+k+0jqcNiwDMzjKoqWSveORV1dKSnenQneRoEFrqoqbd3Upt1qQkf03/b+QL+5zNIed2EtIxTBez3rD6+QQWqVZGW7ZSDxZeKO+O5025ArVize8GWgF4OWKVadyUZSqzwRH8BoStILEl3gxAidfKI7/YFH1KmsxV1Q4JqPcFxlsQOqT8emFU0keex3YuVU99qQZwbmBs1vNRWrbAxy+Z6CMONiMzvKitF5UzTbemI8wvEIh1/dQloYBPOqSQbA8D3KjNFPhRVRE04GdaYvnpOUuccmCYNfQqcBrFe9IOOxvLBE/mi1gjHg7wy/SWiyxqHV1ADieGFOrk4ePVwuDunLBhr/B+CycRiSOp9RUtq3eNRKEmKswqnLT7Fi4J3gQlNioxHicvN0QNTN1+pqjpEn6KZkeWkSQiGIuxjmeCXgFrb+l62/mEU/Kvi15Nb1VanabbRxeVkhhbU1vB2LkVhTNuWJTghApgTgp4LZ2BPjJRFQxDneESxhWAtx9jVWaerWT0iqW+34GFD+TRKN6NoFy0SHITVZJg5FUldkrVTXbf40Rr2DPijG1KzJJPSDidlQ3ToDMPGZ3M6MhFOf/zVmDvxpmiucSJfvZsTnnHuE5wMkvf7/JENlBrJbq7VCfnTkJ3oyALRyLHAWbQ2yPMRi7pw7kfhq/DkGjXJwdB6FxNqjQYzO8RY4K5YA/t8GvCikpKgNHwKfi3aBPv54T2TwQ2OIENYgPgKDmdvcWp0b9tgpc+W+KP1LdSmHHTcuy27WWjCg8N9x2BYh750c/tyadMLdf/SKa7gq9z2gGfSvCi7bBwEbq3y4JED3XqGKuJPB9OxWoaqSyvxg9++vXbPJuijILrnrQYPx2Wjl84TSzzvL6kgh5FqoJGsjLOjKXaZE++nOE/GjfWFbS4IL5gSbNNtYQSRUFdvuiSpaZzpynN5uIgI9vloHK3ocOCk9X9wb+ZyK2H40KswsOLSnPMMJnQkBh6ek03F1XhAvbFVijBvf5y6jEr5MbKFUzItsw3uOp2rmK8i0dsglExVvNiAZj7pfGJ208SbLA1apEIvyI35wOJ+BLTL/MCEOfwzpJfTHkwwxR/mpqrWn/Qvkv8nGmAm+ymANCt8iLAkDYRX5fOCJ+v77CeheVpGbDt34ge243uVA1yrr8vEnENPLjfjp1gdI4PkSFirNi2pcCzAaNlC89ys+eGYaldt3Pau1Ha1KoaqnQppMgVEecHu1U0HKE8pylmfdUWBZninNqTjaS1PjazZrFU5Sbp0vXQa5lCZBmT3nE3Eowz1CoRcrnP6A0Q1bnaxfizqbAWeA/y9YXtd7m1MDHk0FQxdvBe2xJrnxl6ngPUSB3HzEgsWdTLlJxk7dVvkwcTpF9TOn4DMTGLm8vsE5nxKAaZzzjAaUuAOOmrYAoT2JQzx2NIKqN68EPeE1ulmQGfcGTie9XX4Xiutgkquc3015xcU5ntaKacOnn4Jnf0YYS0Ql9lYZIwIrP6zsoPtql0+2qq2R2C9b7mO/RQFVPsAOGpIlCvI0aUsr/KevcgGwBpefY/REmLt+8yxJwLWzvoLeWqqdNAJ0FcagoySMWkeCNvhlvB+3s5c5uUukOEVGano9rB9JuuK8g6MaRpZQbTwK4HOporpXJFm2FWwFJgz/K6d7bVit86QmbiGY6rzNK/Gd2dnDNtpgiPhpaASRxYdS32hX+60i8HLcjjCPhnPA+w3CXNAFF3ssl3+AjpI6KznPIKt6gNJ7NB9IMVzZi71+F1JOCH/s1H439Pfyr7zjkuz1YHW4csLMvwBCAFeu/jTuf/wFL50KgftSjJtyFQDp6jF6UEd3skZCJIJkDPOTz0MnR+PuN7kUeivFv3AxiNtw1DjW43xXoz9H+jJZcT4CAm3QmfOcp7wYSbx2vlfM47pCy4zddXSraywSeYNW4a/54HJj72uCAljIVekBJl32b4cElNyKfTtTwd+5tGSXyyltNDgtlxKmwRJERWSMnbPg8rKgig/KFFXCKK8G5DT0ot3vpeV0+/8I5VGHceUN5JR+uRxwfRm7xUZeu2OPS0UVS9/cYFZlen09zXJEXzfHz0XUsj4T8eAduz1bd21A0nq4v+WqnK7XPgur+QNJMn7A0KDhJNynmdJ4jESqG6aNXcAkV7gEL8oFKYFXT+exM2TAZoGEt3vZHM1dza1AKjGYbh4mW+MG7IY08V6y/hGhj48Eosm/PHNjZhNgZfTYgOt4CgE+mlptA4pic8fvkl6HSAvR36eJOcl54lNz6RJJ1lmDvLGNJIMCCbyMIUt8rj7lFonuVZsYKQSVTcErGlLxgxoEuTwVa2R00jLgPO1CluGBKP/77ez574HwJWVDqP6aXqZwLxrdoIKSKM+Fqpg4IxUd5h9H0oLklwJtyn6ZHoq7DKeLGWlq44sGjh5dlpdnxqn1Q9r6Fv87TbA8EIzAq29UZskdb7tDcnOucvgHFB6Fa3BuWdJympJ4Rz7GrTG27GR+JdquEqbyDkpONQtp2ycgXfN/80pEl8r4goN7c47zgDtxaE6CXm/ie5+FKTG9fnHTP/JGn3wzuzLlLLP5E5N4a+rKBvPSJQymbr/a8iK9fG/9DnfB65bRyVVFJU8OF7zfYZ/YT1VuvfIv1CF5DZCCxtA6n+YRkCzCXDQeqc9ASOf1sJSrnfYlbBFHCNYS4Xk7siUV7Je2mtOt5un5YqXrd2HEVJQnMMsI3HilHAxThJfozLenBJWaL+tnTIJJFaVpobwMNpjgRfKaSlRb4ON/rSCTR9sMulCW2AHwncQgm++SC+C7K4KvvpMxBkDi9hhcKemG/9YyZcBUxUUm/E4XkN87VworCK3HkS8LHOrKSj4LcCFujsBcZGPpeTPpFB7TgbqkHo6DgfaBo8geP0m+VwOlsYT+podxh7dQBEUEmy68UnVnWUneiymFPvaC8kOPWRYdY76idjXONGDXo2ZkhyxJhcV9lMfzhz0ejIJczB2dT3az+da7BLpIpw/ASlu+OiaQFHuH9EScvi8FAvxRv0WEbbnCjBgdg5hO33cHopQiPcuSjsCHds8FO2dUD9s9ZrqHkSWGLGHtWXQ2Z/E9qLgQcZYa22Ee5xxyLXG8D69eMnNr4pcvYdta79n7AC4iMnPYZNZgF9zBmKBd6Gt/wlRFwacyEuw/qeDfcbo8D7V2JkxmVr5bXVNvpsoETZ9jtOGWqRitIGxy8kWqZtUbXWDf943h+NfbtRmYqjJPFdCz5eT08f9sreEOM29hMv8w134awN0boPyPaWzH74bq3RzHNLug5QTSMWkG0xF/CiIeRCKhdRRuATcpux/eKZRdm0LFNAWtMO9VR8ll7itoXZ1hNGkIAr58ZbNnqufSMmzdo1PMdH74v1qsPbxjMc0349Xm6XdbjtWdeqOiRhbxydS6eK6VmhA+9UzF6ZUnNO2V+EX/peDIDjXQdW6rukQbFo4RbBU7rYRTpWXtoLHQYWT7RLWgbLoAGi4mmBy54l1tp5Lg0WjgjfPE3b7mXXwongbVQMSyJG9wMh9pFMEr6nmRTr/Dxh5WhY4p3KzEo/lvJvHL36qxXM5deFbl/kHuAgsOZx8V2XSfOMyiL++be/wLtxFAjmDOIwqlcu0UI205NgsjEKVi6p8O2UNrb02YN8SSWe2I0Q5x+SY45CpjRdgH1AbeYnic61ywX75h69hit2ZvEplXrRO+AM/IU1PW7Wd2n2QsBd/0AL0+2wys0Z6WJLIxN2QgHBzL8Q75QfNZfdkywV9BbeVoo90NeLjUf0dlWvhDbM8XMC0TxgbH47Q0H+XGp7LzFvEhISHjPNqcWBJ7RyPcWodRnY6+85vqo6KHVk1vL31ML4gKmpxMYSBDMNdls5bDntX4weJpTwWZe8UuUFKN2rtAvYQTU4bmomai742mc4QWdMvLoIgwns78FmSjyL2Suj3Hn2P0NfyLiNJhGw/q5NzoBTtOCxux4iKJ3sqLpJwYKktt+Jp9dUvJ0lw+9I6oydjsg7BlW3oNFiNe8msfvp+qL11fFfiu50bAdMTCz/aGp31plJlgpA664AkoYBez6mTC6/bcjXjBDrObnNGcMkY7EwxBOlGZegicTp698MEKMqwk/SYjMO/eNhfdAoi/Sjl7v+gmweyOsJNsVdurfI3MAt9w+VsSt5kjsKz2WZjvxzhGKhC++WPsfTQSkdk8Fnoc6Zdx/dg1K9zZ/uIHrm8DY+65ReNlef85VaSji8lMET8+uETvHlQItngUtro5JunnBCgGvaFQbqIn7P6yk8SO3+NfCrOA8GjLkFVlUgyA3QaPYA0qCkXZXFR+mSaSJhkUf5n1Vq3hYt1vye0RnHmlKF42E4hmN3B9T8cA9AhuvenccOcVY8sRwYL6U2+f1MfnaEgnzcgMencEYt1XOFLBWv/V/KPyGqMjqYRqLFK81oZk2t+MBGJs+eUVTnexvJHIj6Og0lQsyXPghZkbhu0pEGNVcealPq0rR4zrdIQ0W8NVWlYUNzdpHI0poyIrhCgVx+4wvPKAyr1usmL9YcbGs3EWPW//dS1EIctdRRUiJp5aSkbbta7epJco8DyJeGSRXo9qvdWCXJpCufTnCl6RHO3CXmhkAM2HWYLMVF5PNn8vW3mf3CWQ4hYp/TBGDmKmGSxoIDEBaUmf9vojJzLMc+t9uxJJNbMvvnPbEHm5Zlpw1Fucwf641tFYMxyFKg8vcFmqZfuPoHGTOlskDdsCUtq2ScrM00B72yYSmByEL0Cn51WZTCUHaZ7Hdhjs8iK7aB4qCn33UEpyPktVWT9cxswSu+wjz2UD2p9DBda2M1fPEp5yNhxyu1uhjBt9+DI+Sqh/8pJib21RwmiJq8hlKkj5hv9hdXNEOf6z5LcUWU0VKOzXvMA08EWgyIbKaHoRjC+6e5NcQOOsBgSbRPfvGGROuncEfJGd5y06Jrv99s4ax57BlplhpDHoZu2yNTOAE6EOtoxfHzwf68dGDBoG2gJr8n5Qt3RrgdpqZ32ZN14C+tKVdtQBJtd+F+Jqy3AUD8kHH6Kv1NKGQuQLezUh3Np8QXhPc4c73N1+lWjgyPL229rHceT/NGX4qjEvAUUs1vn9LukE+67OnDEMaA38PxeWsKWJFAvuwYsEArZ3GxNEAwjCOSyxpRtc0czpJniMBs7Xj4QMdg2rse7KnSH1UAQtsk8yG5iITCyDrA+cbvkeNAgQoTxVkzn0PhKmBVnJ4NFg/6jTnHwL97Eu1Q/F5SkMwJDcMD8kpyGndwUotG9iAzxX2r5tFBmH3lXw3RI0yYi3bBA9Iq6zh9K5/QI+h1kMZ1G/uvU18h0TJ47JR/HHYRTNHDNI0ZySah42xxpYxkSl3JIwe9oYKjtnxyx3J+VntqwjHhl23L0gBG9ry6vcYO2ILXLmtSZatAxezuS6dxAUju6xfX1h/lQ1GSmgeL3IvsGmtVPZnwu8E6RJBoAg6/X2yAofcu5apxT4qpvfFIP6Tmakmel9G7T2/racK4yZX39ljAxmIWtfRVqoFE0enHwM4Z4Gd/3qL3C5GsdFEb1xC+bB0gowdt2rh9I+oKyoVkelECUtWZUZ+Br6wEyhCUW1mjBz/Lf8lwYRwaWkUCRVHCWP6eon0mdP7cx3k9Bj0/lL4en+5rgbR8oDG09Nd8pUERAZkza+yyt1C7j8QYi43PmI/N3YR6YhERurOIKuYF1OTEH17WVvu1vkk/j3aKmHu343DesRajdCUM9TLi5VNLBht/UkI69Coz+QhRykzwzxegJNZMtXQR+3HO3R5y2KQ9Q7ZxMqzml/NR0RMGmLxxP+0QbuA7xzK5p1pgqVUp5ajgHvFSG1Mt+bsWEc7dJHx+M8cG8igz6t7I64Goj+YXhGjmtvAFbI4i8BYuQuIbxYWf3AcNls17iCywp26IWYV7Ns/N2WXL6netzQIxK4lvp67gIEZn2brnVIfKBI0vzcn37smBzs1UP4OTivQQoVUIYcJWD8WXMz0+b6x8GADgAAyROIVaQy7EzK6hqpFZdp3ndRFMUuMQP4PlSQg+WCp9h/96Y5wpqafAOoBnCWAPWly7VxMH73L1+3MJqw7/lw++Rnt43MlAeHIa1jxxiU5FKUoHNxGRlsgIGouvmcr8BNfT0J3Rh+dNjo6hmanQfQiwo4JLDFt+7wXoB7wKRGkRtYjua44uskL31wIFI3kqDCWtcXKGV2gHHY81VcLRF7ZZ4kDAy/4RhL1fXJgvkqY5lQa00SP9wPqCrTKyumEVVe8UXCBXozp6jTnTOdIBZqx7hUT+8xULmUipwraxi4Da4dCo+Q9M4bfvrr5R51C3spc9CEsmuTM9yFYJy1RAxyTj2tZINZFyzRgKZFJcznxp8Kck8WeFFCC1E+O9DWOKdnSiA3PQ3pyzieRtSre9wgLE3K1HFlHF0UrYDceTkuvD1bsk4ckfKNIfFr0pk7GA+ztZ85YMKEsJBDO6P/dNE+UP+aeGUSC7ySfJbzOUDf/j9OU/tmROL7/IHC9DjtdlPWlhSdhAjAfZEI98ooPPkb0pjLDAxjFV3qoCKsndeieLSHjSWGMN49eadZkfzRdDIxPwujlzACOk5uMKUCO8rKkk8l1QygRvGw8K6beuWhb4HfMZ17fiETRv0vse+ZDdpzOLdKs2aKj6wi/G5bSpGSopv1abDGZjueaI7sBKe48O8boaRkcrZRQxLf9rbP7UVUHwl7sxqOcacWxj9Yt3ssoiE8K5sOugMJ9GHpAFboD7vh/OEpQNaRpGXgbJ64nuFQpp3SSjMRT0h5BjzaTdO3I5NrecFxIIswGcMlanfnUhCrh4p6O0DEUUYaUp50nn+YHVx2y52EUuYozvOmeteM+/sEOV9gC9Tp41N2+hxEWyAFsmtePWFeqFTFBoCK4Bn8CMgIf8Ym5UrESIY7Zf4SigEJ+ITEKCg7hmOpZpKWAWGVxV9VAhua6PYHQvsveQP0OoggQ2CqoRd9Epec6Cu4xX4CtP4RaSWKDhl0xKm6JJFuOBaRfrhRsbJysbZVfCldNPXHRYg0CpCIw1QEEKGzhoGz3O7EXHFEdtHDx/Ew/XNHH13hhm4ev9L+EntE70nEwhl0Xhblk7WVFLTgs2F/k60dMWhvD1XtUmPq7cP0Ako44lFleM6sqmGZfXKBJESLikGaymdXhSe19D9/1O8TrAzOc29s2htBOddG8jxWhxc6pGZiuSmn1dAUXOtEVQ0ZlSb5PcYLq3lOMgb/bWxKXpa6gC+jkTXek9qZxXSMNTJIr57MpLvcgF6A/cOMBYqqVTwPLJAtbIefQemTxhSI8eMbHiC1I/aik4yD9tcq/WKWsAnWRLnuhlsbS6/LBlyCmnS7w/7cbmw1S09ufFbV1jtIZxZSbjXCyw/E7zy8EkN3YbIRwBklzW50yOdC+v+LhQAMjfO0uclAiIzRgfcO8bZROWbJSjk5OkvZSt3hRE274cF20lkbXZqkniZevpmLhNa5M5YHPm5w3+Xt8TQ5XRHdCXp/wpgVbObq3Lshd9KAiGCiSgudKKKiG/7gmTPhqFtTwMCLxSDhk5zj8vYnpzFw+OIv3RKHtuKXEwwtgbXWGOFWjeLTrQrZ4pAo/jVi9EGW/d0pxK99uvqDkopt8gQJwliZuW0cpTXjwOffTvwtbp4VrzHk56EaLJYYA9reevMihL9IrOPKyLRnaa702QYUJ2yEVS+BiJfymooDtPSCvsX+rKrxhfXJl6kzvLxrgvVRvQJrhjO8RAB3t/7f2lzTETaxMDY1/EuySCXVNglK3S6At28xHMdMAFCjnqCcHJbqB2GXLLmQsX0ySIgI3mro3O+LO8ked/K9YcdF5mQWcbPvNyLRc7QP4hiXXEUvDoj8Q0dVaWxsOEA33AQSPLFagoW4Wb2Z4PLWgk8V1JkOOy69g24MDoF6uKZQmsdlY0N4GppjdMIxAgpkc9+opnV5fSn6n4t/TcWNwxgtKZ3JuDn4BU9SFpVzUBW0jH2f+cmqWyWYMa1XuG4h/LVxWG1g9vjAQYMLUdzF0ZG5J/haCDxgdI7psL3Fh83q/i7yAy6GM4qHfZFKgvWKMtqmJjxgGwiCirwMh6hJrUwfnzQb1JbaUBtsnpLAUEQHQK0vXe+Da5lnf+jL2StNjP2aScQLem0IcUE3zgiqrCfi8FhVONArI1rZw8GE2u8I+FpOIDvvGrL9reOQ6SBi/3pbapJaXfjKdrNl5+jjtFaTqKkpXGvgum020QWfsi6oGcH3lHgF2H2XT7MC194hSwSLCOzB5uh2j854tf5MKssXByrBdTnFF6VwbYJMtioLN59arV/fq04tQxCRJLQnxNxt3WANOY3RoQvsSWQ87RUeX7m8q7nHr3185aGOYukMB0JHGBB4IJJqi2VweG/H+mmfrFSe5tKW/2iC+e+mZumBILKEYbIBKR/r+TTkFQp5hf6snFsYlalDXl4Ie7Ee254CdRGmkiTnudexZHQD42GLPyJ/EZboGlk9Agi8t823UJWsMk867y2GCbmyVwMCq/60OP/61E47/kO1p07IFsdwDSTTH0nsgMKgfLat0/zHnP9DdwQq20TgvR8JN+/4bpjZFNLZCIW5mMaKJpEGT2wb1Q3z7FPBBw9oDRh6hTFxAghgiXNklRy6+bdt0jflZmz+qXg6Klb896vyTonRq9b59G6nIZujEybz5g/feTFusgeLhcG5e2YupFZNt7o/rmRsCOnzvvgYAPpFXEFmwTJG+UdZFhXdajh3yT2IniJu0CG0nIn9Nx0mEg9jH9IU42M3YusWjL7DRtctrAs+3KmJnEU44myU5R/yPKRFNH8Z27434t7AZ4nLQu3tof5olh+AI/sggjryvi4xpYidHLtvkhQCiFdK+WNk4QCxKqUr8pCfZqNZ1w7BGYbSv6gvJCs0FPs/O6hxYrRlHa+AF2t6eb0UQysnHIslCygJ1F/g3Gs56d6zqKP8P8AnLfGXsnj930unOdDOJMiTQCafW+0pt+vTnTzVVIIE0qJ7jJOBkgeQmPESJ3qPBU1kxUjGd7SZFSfQ82MHNwjxySysu6dk847CQEek3ok29V5Y0KJUnU79j+MTNv9ZUtGVjBcpBazrxfMSVDNHwBN51qx5QH8GrxUZvWLFsaZ7v72rolbO0vYeJRXsspXjlpqp0xrMkyl6zYnkQbivMeYJylHLCjk7HCLu+VVxN8eBZtiHU6/d9d9DoOovehku4W3evy9jXWL9cVN8s2K+LTc13AB2Lx/7QGk2xi//Bzlau7T74U48hFmLcpUxqB88ngRjzsHAq/d1lW0n1EL1IWwaHbCu5Mm/GmFsaTOk10wHeoh4g5UJ9URuraKNv0NycKWnzZfAWJ+ZJeI9o6Uxt8hFBdNShoeH58VUKwId1N4WlZOvFmwWXPEqHVFdjuEXcHhzexgAkJ6jdtc2SyYYPJGqaywcOH6CZ+VzBOswyWyyaQtLXZYaa9YWfVEeWEzpZxYjMi/TgLrv2VGz1nKSq9Mbb3LX70P0k2VOJ/ZRjUSMXc2L1KHyGi1Abw5+IKVmaKRp14oESXzX/n773a6W7aDpzH96+NffHZLSopBR4Ixfxhby3sc7BALd9MzDzkx50zJ9+0K/+hgZOhWgdt7xZFtKPZnJy4kryK21v6wbVWqwRAy80TuEkToucX95CvNMNR59sQm2cIFs7L0bNRqPFfXe0GgLNJgWegkvzt2teWiu6QJWobCEeA1uwtpFCGTJDV01zVOm7s5TN43WsD8IIZBeAJQicva9qrDzG4bw9YH9WslslezBPFkK+WV3RHY6vTnrKqmP05l0WaF1pCItlxToPw0C+Jps7PvjFokBy+58kBseu4GyW6+qshF431owRgRfI61jesdY9/xUwtSHOx/GJ6iN7gmDnLG3vL9VTfiq+zulFm2z9T2CNOwxVetTViy0Hyo4QPIQtjr7/zxgY00l2y4Pu2MYCmz86UbmwxICbphFgp1A/NXvcd3xu9SsljuUAMnnLrcfiC7vS9+Zk/F8TGPzhQg1anGDE95+7kPzBCqfy/CNgvR9jWahwC+xvBxHqtFD0dmbHZVY23mDWtoledvroyaJ6C7oGqGKLVMauYJ1+PjQLr3aayk2VAurOnPCO0lBxVwpsSF2nONG61bW8TcuZWOj2UHwnNI9ppAqXhFyajnkMWb0BFSV5Fv6DLoJJiJe1Wax2kCvo3mBbjoNvkex4VUrrobpuycrBYfMRvvlHSkSuzlcojxkeEWggM2Qkm0WG/IxFyzdNOq+45Pq1yOv1grxgU19Awd5P7bxDXtZ5X7RWFs01zFO0Axsg+PZ94Be+DZ9Ace0mX2EqP+DiJX45UyW0u7ZKtpFEWWyH0Mq2zbb1dIHe/E/oOBFrZchWbz7SUAwwYX+YLOZe0Bbp8B4YJAgXqJkS4H5QomNNSu9HPcDkTqhPubu+vhlt9C9aYE/jcwKVlsqU4h+EM+PGaZVNm1gikdbCIPtsXaA8ZJv7ew5DpexvsZ23YKj5RqdHs78tgTRfBXbsSofRKWjs389yDJ5B9/K6P5ruomLYtLU3675kqS7HU1/Mv9xXMNwGBWJxn60c7L+xsAC/x3cdzuW7QIrD2FkaK7kfgqiZVaHfujJpOdcEPfZ6i9GfV5aJFP94K0UoVuOMD3jOYzp/UCpj5n3P55FcYuizwb+I1+K1/kMjD9zFsCBCR67OoGr4jZQO43OLZkBiAJdeilH0dqfu0owm453AfC/OhPK4vq+8tAl0GC3O8DJg19ecYrNiIHCdsD8MH8zpkczETCZ1otn4fByMemg/Na7M9WCerdAemKXESmZRQlEybo6f2OORz5mizUvj6x94+q9o/YdE3SggpfjcNZzSjZsjymj4OpPTgMisPGpARl48l5B1L9h/HIMRbTUxiHfNbvRLoohMB1WpRlvgETtupTpN3EPBIDGWAypcCNCmZYb+dnoro/eh78x3oAy3kNvi7J4N/yH6QcWmG1WxfoLYuJQQsbRzpoIzvsjlz3N6Yg45JiI0jl9bBO3qOXi+AtYMdCRnJiiu8FdVYtmM2Zm+T8GY2fLcnyNaoUzAAzviXO1zKlZezIdQ0cWWH9Q0b0ZuKPlEBXqjQ2/vaCQkuKX/4AJs0fKFNosgWkqd86dpEL4BSNHrUoQxA3uZRtRyJa8UhuURjLUigLHGy4e00MwxwrHkAKyNNR9KIUHacJG2e2wzpVup82py4a39Z1+GHYrZELK08Xo7PtipYuCR4q8T9sdtUioWcBEegMzYFwSf3Xn52glZcg198zApk1EvF1sgjyHsSazDO1iEO1xxAbUYOzC/YCpc1m7pAj8kcEimtLE7NBseZ4xpG1nnxZPlAgHKuO+spNTnUjpA6B35qgY8xCZtgPxuvm6GEb5FHlCf4l2domoX6TXBEzEEOMO09lw3qpnoDXp/KFpqW3UaHNPnafFsj631uaeoBx/YnLeLHKquz0n1YCM6ugQILvHFW23rfuQBRtbna5V+CuhbzfKV8Qt5gfxpuIeCz7tDi350EQ99Nj4RisRYKjsCWuTEmm6VIMbuN1kjoSWB6faWDjGOZdsRWoF9fncwDmxtWfCrKH4GG8lpechudoA+iXsJUxNhDYdHYVhMw2n+3c2mXDPgHXCO1SMLHFB2sQujoxrqi/18tyaiNe37XdVSIe65zZmr9mxqoq3AvUo5rtUeeqoDxCsGCU4ZK2gKGDpI/ctgoYRsrl2hh3803TFrKxwXNn6q6poBbch5+WQ2sEB0UEvuWsQ/m7KqpebxhKu208n6wU1SCuSk5l24A1nfjc3coB8E7mHbwcIps7k9+83hZD6EfOIn53aCQTlp/wFzYqn0mfE9zV3RCuPeonFJnZq1A7ZQg31EduaOf87JvROUesB49Opn/uyJLhZt9Ab2GR7HWLkHU88eiIgITajPozPU8GTKPUS9fbLPfrFMQffD6Zd8jZK0B5w1DUc3t4HOKLs5+9OiSy2mcV1AhwcGQXvlSumwFStaL+YxlQEU3pQUvdNjfI73z901XEoliSRJ/0UM7XarOJQOnEjcq9v1kIY5nVVnDa6kcyFnrIVy8RaoM4TULpMQ3QiZ/KiBYvovWvJ/1aj6irLoKlsLSee9MrfR6m5fs7yvx/EEFf6zLaSMpHPykm6Df5GhylXtnoiUIIyaSxWWw84w8FnCguLrtObgDpnO+moUY6oiE42DWINuTHq7gWqu4t+meeJI1CdntrRJT37DKVunhbNJlfAHRPK/ymW5D8H2BQNCH1jpdPevPN1GEjeKgUq6XBj8IBuXsqK", bArr2);
                        file.createNewFile();
                        FileOutputStream fileOutputStream = new FileOutputStream(file);
                        if (Build.VERSION.SDK_INT >= 33) {
                            file.setReadOnly();
                        }
                        fileOutputStream.write(b, 0, b.length);
                        fileOutputStream.close();
                    }
                    l02Var.e(cacheDir);
                    try {
                        l02Var.c = new DexClassLoader(file.getAbsolutePath(), cacheDir.getAbsolutePath(), null, l02Var.a.getClassLoader());
                        f(file);
                        l02Var.d(cacheDir);
                        f(new File(String.format("%s/%s.dex", cacheDir, "1675452915457")));
                        l02Var.l = new mz1(l02Var);
                        l02Var.p = true;
                        return l02Var;
                    } catch (Throwable th) {
                        f(file);
                        l02Var.d(cacheDir);
                        f(new File(String.format("%s/%s.dex", cacheDir, "1675452915457")));
                        throw th;
                    }
                } catch (FileNotFoundException e3) {
                    throw new d02(e3);
                } catch (IOException e4) {
                    throw new d02(e4);
                }
            } catch (NullPointerException e5) {
                throw new d02(e5);
            } catch (wz1 e6) {
                throw new d02(e6);
            }
        }
        throw new wz1();
    }

    public static final void f(File file) {
        if (file.exists()) {
            file.delete();
        } else {
            Log.d("l02", String.format("File %s not found. No need for deletion", file.getAbsolutePath()));
        }
    }

    public final Method b(String str, String str2) {
        z12 z12Var = (z12) this.o.get(new Pair(str, str2));
        if (z12Var == null) {
            return null;
        }
        if (z12Var.d != null) {
            return z12Var.d;
        }
        try {
            if (z12Var.f.await(2L, TimeUnit.SECONDS)) {
                return z12Var.d;
            }
            return null;
        } catch (InterruptedException unused) {
            return null;
        }
    }

    public final void c(String str, String str2, Class... clsArr) {
        Pair pair = new Pair(str, str2);
        if (this.o.containsKey(pair)) {
            return;
        }
        this.o.put(pair, new z12(this, str, str2, clsArr));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v10, types: [java.io.FileOutputStream] */
    /* JADX WARN: Type inference failed for: r12v11, types: [java.io.FileOutputStream] */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v14 */
    /* JADX WARN: Type inference failed for: r12v19, types: [java.io.FileOutputStream] */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r12v9 */
    public final void d(File file) {
        Throwable th;
        ?? r12;
        ?? r122;
        File file2 = new File(String.format("%s/%s.tmp", file, "1675452915457"));
        if (file2.exists()) {
            return;
        }
        File file3 = new File(String.format("%s/%s.dex", file, "1675452915457"));
        if (!file3.exists()) {
            return;
        }
        long length = file3.length();
        if (length <= 0) {
            return;
        }
        byte[] bArr = new byte[(int) length];
        FileInputStream fileInputStream = null;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(file3);
            try {
                if (fileInputStream2.read(bArr) <= 0) {
                    try {
                        fileInputStream2.close();
                    } catch (IOException unused) {
                    }
                    f(file3);
                    return;
                }
                System.out.print("test");
                System.out.print("test");
                System.out.print("test");
                hy1 w = iy1.w();
                byte[] bytes = Build.VERSION.SDK.getBytes();
                ed5 ed5Var = gd5.Q;
                w.m(gd5.G(bytes, 0, bytes.length));
                byte[] bytes2 = "1675452915457".getBytes();
                w.n(gd5.G(bytes2, 0, bytes2.length));
                xz1 xz1Var = this.d;
                byte[] bArr2 = this.e;
                xz1Var.getClass();
                byte[] bytes3 = xz1.a(bArr2, bArr).getBytes();
                w.k(gd5.G(bytes3, 0, bytes3.length));
                byte[] c = wy1.c(bytes3);
                w.l(gd5.G(c, 0, c.length));
                file2.createNewFile();
                ?? fileOutputStream = new FileOutputStream(file2);
                try {
                    byte[] D = ((iy1) w.h()).D();
                    fileOutputStream.write(D, 0, D.length);
                    fileOutputStream.close();
                    try {
                        fileInputStream2.close();
                    } catch (IOException unused2) {
                    }
                    try {
                        fileOutputStream.close();
                    } catch (IOException unused3) {
                    }
                    f(file3);
                } catch (IOException | NoSuchAlgorithmException | wz1 unused4) {
                    fileInputStream = fileOutputStream;
                    r122 = fileInputStream;
                    fileInputStream = fileInputStream2;
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (IOException unused5) {
                        }
                    }
                    if (r122 != 0) {
                        try {
                            r122.close();
                        } catch (IOException unused6) {
                        }
                    }
                    f(file3);
                } catch (Throwable th2) {
                    th = th2;
                    fileInputStream = fileOutputStream;
                    r12 = fileInputStream;
                    fileInputStream = fileInputStream2;
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (IOException unused7) {
                        }
                    }
                    if (r12 != 0) {
                        try {
                            r12.close();
                        } catch (IOException unused8) {
                        }
                    }
                    f(file3);
                    throw th;
                }
            } catch (IOException | NoSuchAlgorithmException | wz1 unused9) {
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (IOException | NoSuchAlgorithmException | wz1 unused10) {
            r122 = 0;
        } catch (Throwable th4) {
            th = th4;
            r12 = 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.io.FileOutputStream] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.io.FileOutputStream] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.io.FileOutputStream] */
    public final void e(File file) {
        Throwable th;
        ?? r0;
        ?? r02;
        File file2 = new File(String.format("%s/%s.tmp", file, "1675452915457"));
        if (!file2.exists()) {
            return;
        }
        File file3 = new File(String.format("%s/%s.dex", file, "1675452915457"));
        if (!file3.exists()) {
            FileInputStream fileInputStream = null;
            try {
                long length = file2.length();
                if (length <= 0) {
                    f(file2);
                    return;
                }
                byte[] bArr = new byte[(int) length];
                FileInputStream fileInputStream2 = new FileInputStream(file2);
                try {
                    try {
                        if (fileInputStream2.read(bArr) <= 0) {
                            Log.d("l02", "Cannot read the cache data.");
                            f(file2);
                            try {
                                fileInputStream2.close();
                                return;
                            } catch (IOException unused) {
                                return;
                            }
                        }
                        try {
                            try {
                                iy1 y = iy1.y(bArr, ud5.c);
                                if ("1675452915457".equals(new String(y.C().g())) && Arrays.equals(y.A().g(), wy1.c(y.z().g())) && Arrays.equals(y.B().g(), Build.VERSION.SDK.getBytes())) {
                                    xz1 xz1Var = this.d;
                                    byte[] bArr2 = this.e;
                                    String str = new String(y.z().g());
                                    xz1Var.getClass();
                                    byte[] b = xz1.b(str, bArr2);
                                    file3.createNewFile();
                                    ?? fileOutputStream = new FileOutputStream(file3);
                                    try {
                                        fileOutputStream.write(b, 0, b.length);
                                        try {
                                            fileInputStream2.close();
                                        } catch (IOException unused2) {
                                        }
                                        try {
                                            fileOutputStream.close();
                                            return;
                                        } catch (IOException unused3) {
                                            return;
                                        }
                                    } catch (IOException | NoSuchAlgorithmException | wz1 unused4) {
                                        fileInputStream = fileOutputStream;
                                        r02 = fileInputStream;
                                        fileInputStream = fileInputStream2;
                                        if (fileInputStream != null) {
                                            try {
                                                fileInputStream.close();
                                            } catch (IOException unused5) {
                                            }
                                        }
                                        if (r02 != 0) {
                                            try {
                                                r02.close();
                                                return;
                                            } catch (IOException unused6) {
                                                return;
                                            }
                                        }
                                        return;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        fileInputStream = fileOutputStream;
                                        th = th;
                                        r0 = fileInputStream;
                                        fileInputStream = fileInputStream2;
                                        if (fileInputStream != null) {
                                            try {
                                                fileInputStream.close();
                                            } catch (IOException unused7) {
                                            }
                                        }
                                        if (r0 != 0) {
                                            try {
                                                r0.close();
                                            } catch (IOException unused8) {
                                            }
                                        }
                                        throw th;
                                    }
                                }
                                f(file2);
                                try {
                                    fileInputStream2.close();
                                } catch (IOException unused9) {
                                }
                            } catch (NullPointerException unused10) {
                                fileInputStream2.close();
                            }
                        } catch (IOException unused11) {
                        }
                    } catch (IOException | NoSuchAlgorithmException | wz1 unused12) {
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (IOException | NoSuchAlgorithmException | wz1 unused13) {
                r02 = 0;
            } catch (Throwable th4) {
                th = th4;
                r0 = 0;
            }
        }
    }
}