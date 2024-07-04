package defpackage;

/* renamed from: sq1  reason: default package */
public final class sq1 {
    public static final String[] a = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", "Trailer", "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Afro-Punk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop", "Abstract", "Art Rock", "Baroque", "Bhangra", "Big beat", "Breakbeat", "Chillout", "Downtempo", "Dub", "EBM", "Eclectic", "Electro", "Electroclash", "Emo", "Experimental", "Garage", "Global", "IDM", "Illbient", "Industro-Goth", "Jam Band", "Krautrock", "Leftfield", "Lounge", "Math Rock", "New Romantic", "Nu-Breakz", "Post-Punk", "Post-Rock", "Psytrance", "Shoegaze", "Space Rock", "Trop Rock", "World Music", "Neoclassical", "Audiobook", "Audio theatre", "Neue Deutsche Welle", "Podcast", "Indie-Rock", "G-Funk", "Dubstep", "Garage Rock", "Psybient"};

    public static int a(kh4 kh4Var) {
        kh4Var.f(4);
        if (kh4Var.i() == 1684108385) {
            kh4Var.f(8);
            return kh4Var.n();
        }
        lb4.c("MetadataUtil", "Failed to parse uint8 attribute value");
        return -1;
    }

    public static lo1 b(int i, String str, kh4 kh4Var, boolean z, boolean z2) {
        int a2 = a(kh4Var);
        if (z2) {
            a2 = Math.min(1, a2);
        }
        if (a2 >= 0) {
            return z ? new to1(str, null, nv4.v(Integer.toString(a2))) : new bo1("und", str, Integer.toString(a2));
        }
        lb4.c("MetadataUtil", "Failed to parse uint8 attribute: ".concat(bq1.b(i)));
        return null;
    }

    public static to1 c(int i, String str, kh4 kh4Var) {
        int i2 = kh4Var.i();
        if (kh4Var.i() == 1684108385 && i2 >= 22) {
            kh4Var.f(10);
            int q = kh4Var.q();
            if (q > 0) {
                StringBuilder sb = new StringBuilder();
                sb.append(q);
                String sb2 = sb.toString();
                int q2 = kh4Var.q();
                if (q2 > 0) {
                    sb2 = sb2 + "/" + q2;
                }
                return new to1(str, null, nv4.v(sb2));
            }
        }
        lb4.c("MetadataUtil", "Failed to parse index/count attribute: ".concat(bq1.b(i)));
        return null;
    }

    public static to1 d(int i, String str, kh4 kh4Var) {
        int i2 = kh4Var.i();
        if (kh4Var.i() == 1684108385) {
            kh4Var.f(8);
            return new to1(str, null, nv4.v(kh4Var.y(i2 - 16)));
        }
        lb4.c("MetadataUtil", "Failed to parse text attribute: ".concat(bq1.b(i)));
        return null;
    }
}