package androidx.webkit.internal;

import java.net.URLConnection;

/* loaded from: classes.dex */
class MimeUtil {
    MimeUtil() {
    }

    public static String getMimeFromFileName(String fileName) {
        if (fileName == null) {
            return null;
        }
        String mimeType = URLConnection.guessContentTypeFromName(fileName);
        if (mimeType != null) {
            return mimeType;
        }
        return guessHardcodedMime(fileName);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x012e, code lost:
    
        if (r4.equals("zip") != false) goto L159;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String guessHardcodedMime(java.lang.String r6) {
        /*
            Method dump skipped, instructions count: 1076
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.webkit.internal.MimeUtil.guessHardcodedMime(java.lang.String):java.lang.String");
    }
}
