package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.util.client.zzb;
import java.io.File;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

@zzhb
public class zzdu extends zzdr {
    private static final Set<String> zzzX = Collections.synchronizedSet(new HashSet());
    private static final DecimalFormat zzzY = new DecimalFormat("#,###");
    private boolean zzAa;
    private File zzzZ;

    public zzdu(zzjp zzjp) {
        super(zzjp);
        File cacheDir = this.mContext.getCacheDir();
        if (cacheDir == null) {
            zzb.zzaK("Context.getCacheDir() returned null");
            return;
        }
        this.zzzZ = new File(cacheDir, "admobVideoStreams");
        if (!this.zzzZ.isDirectory() && !this.zzzZ.mkdirs()) {
            zzb.zzaK("Could not create preload cache directory at " + this.zzzZ.getAbsolutePath());
            this.zzzZ = null;
        } else if (!this.zzzZ.setReadable(true, false) || !this.zzzZ.setExecutable(true, false)) {
            zzb.zzaK("Could not set cache file permissions at " + this.zzzZ.getAbsolutePath());
            this.zzzZ = null;
        }
    }

    private File zza(File file) {
        return new File(this.zzzZ, file.getName() + ".done");
    }

    private static void zzb(File file) {
        if (file.isFile()) {
            file.setLastModified(System.currentTimeMillis());
            return;
        }
        try {
            file.createNewFile();
        } catch (IOException e) {
        }
    }

    public void abort() {
        this.zzAa = true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x0153  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x03a1  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0164  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0153  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0164  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x03a1  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0153  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x03a1  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0164  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0153  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0164  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x03a1  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0153  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x03a1  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0164  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0153  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0164  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x03a1  */
    /* JADX WARNING: Missing block: B:27:0x00df, code skipped:
            r5 = null;
            r9 = "error";
     */
    /* JADX WARNING: Missing block: B:29:?, code skipped:
            r3 = new java.net.URL(r27).openConnection();
            r2 = ((java.lang.Integer) com.google.android.gms.internal.zzbt.zzvT.get()).intValue();
            r3.setConnectTimeout(r2);
            r3.setReadTimeout(r2);
     */
    /* JADX WARNING: Missing block: B:30:0x0102, code skipped:
            if ((r3 instanceof java.net.HttpURLConnection) == false) goto L_0x01bb;
     */
    /* JADX WARNING: Missing block: B:31:0x0104, code skipped:
            r2 = ((java.net.HttpURLConnection) r3).getResponseCode();
     */
    /* JADX WARNING: Missing block: B:32:0x010e, code skipped:
            if (r2 < 400) goto L_0x01bb;
     */
    /* JADX WARNING: Missing block: B:33:0x0110, code skipped:
            r4 = "badUrl";
     */
    /* JADX WARNING: Missing block: B:35:?, code skipped:
            r3 = "HTTP request failed. Code: " + java.lang.Integer.toString(r2);
     */
    /* JADX WARNING: Missing block: B:38:0x014d, code skipped:
            throw new java.io.IOException("HTTP status code " + r2 + " at " + r27);
     */
    /* JADX WARNING: Missing block: B:39:0x014e, code skipped:
            r2 = e;
     */
    /* JADX WARNING: Missing block: B:41:0x0151, code skipped:
            if ((r2 instanceof java.lang.RuntimeException) != false) goto L_0x0153;
     */
    /* JADX WARNING: Missing block: B:42:0x0153, code skipped:
            com.google.android.gms.ads.internal.zzr.zzbF().zzb(r2, true);
     */
    /* JADX WARNING: Missing block: B:44:?, code skipped:
            r5.close();
     */
    /* JADX WARNING: Missing block: B:46:0x0162, code skipped:
            if (r26.zzAa != false) goto L_0x0164;
     */
    /* JADX WARNING: Missing block: B:47:0x0164, code skipped:
            com.google.android.gms.ads.internal.util.client.zzb.zzaJ("Preload aborted for URL \"" + r27 + "\"");
     */
    /* JADX WARNING: Missing block: B:52:0x018e, code skipped:
            com.google.android.gms.ads.internal.util.client.zzb.zzaK("Could not delete partial cache file at " + r11.getAbsolutePath());
     */
    /* JADX WARNING: Missing block: B:53:0x01a8, code skipped:
            zza(r27, r11.getAbsolutePath(), r4, r3);
            zzzX.remove(r13);
     */
    /* JADX WARNING: Missing block: B:55:?, code skipped:
            r6 = r3.getContentLength();
     */
    /* JADX WARNING: Missing block: B:56:0x01bf, code skipped:
            if (r6 >= 0) goto L_0x01ef;
     */
    /* JADX WARNING: Missing block: B:57:0x01c1, code skipped:
            com.google.android.gms.ads.internal.util.client.zzb.zzaK("Stream cache aborted, missing content-length header at " + r27);
            zza(r27, r11.getAbsolutePath(), "contentLengthMissing", null);
            zzzX.remove(r13);
     */
    /* JADX WARNING: Missing block: B:58:0x01ef, code skipped:
            r4 = zzzY.format((long) r6);
            r14 = ((java.lang.Integer) com.google.android.gms.internal.zzbt.zzvP.get()).intValue();
     */
    /* JADX WARNING: Missing block: B:59:0x0202, code skipped:
            if (r6 <= r14) goto L_0x024e;
     */
    /* JADX WARNING: Missing block: B:60:0x0204, code skipped:
            com.google.android.gms.ads.internal.util.client.zzb.zzaK("Content length " + r4 + " exceeds limit at " + r27);
            r0 = r26;
            r1 = r27;
            zza(r1, r11.getAbsolutePath(), "sizeExceeded", "File too big for full file cache. Size: " + r4);
            zzzX.remove(r13);
     */
    /* JADX WARNING: Missing block: B:61:0x024e, code skipped:
            com.google.android.gms.ads.internal.util.client.zzb.zzaI("Caching " + r4 + " bytes from " + r27);
            r15 = java.nio.channels.Channels.newChannel(r3.getInputStream());
            r10 = new java.io.FileOutputStream(r11);
     */
    /* JADX WARNING: Missing block: B:63:?, code skipped:
            r16 = r10.getChannel();
            r17 = java.nio.ByteBuffer.allocate(1048576);
            r18 = com.google.android.gms.ads.internal.zzr.zzbG();
            r5 = 0;
            r20 = r18.currentTimeMillis();
            r0 = new com.google.android.gms.internal.zziz(((java.lang.Long) com.google.android.gms.internal.zzbt.zzvS.get()).longValue());
            r22 = ((java.lang.Long) com.google.android.gms.internal.zzbt.zzvR.get()).longValue();
     */
    /* JADX WARNING: Missing block: B:64:0x02af, code skipped:
            r2 = r15.read(r17);
     */
    /* JADX WARNING: Missing block: B:65:0x02b5, code skipped:
            if (r2 < 0) goto L_0x0353;
     */
    /* JADX WARNING: Missing block: B:66:0x02b7, code skipped:
            r5 = r5 + r2;
     */
    /* JADX WARNING: Missing block: B:67:0x02b8, code skipped:
            if (r5 <= r14) goto L_0x02df;
     */
    /* JADX WARNING: Missing block: B:68:0x02ba, code skipped:
            r4 = "sizeExceeded";
     */
    /* JADX WARNING: Missing block: B:70:?, code skipped:
            r3 = "File too big for full file cache. Size: " + java.lang.Integer.toString(r5);
     */
    /* JADX WARNING: Missing block: B:73:0x02da, code skipped:
            throw new java.io.IOException("stream cache file size limit exceeded");
     */
    /* JADX WARNING: Missing block: B:74:0x02db, code skipped:
            r2 = e;
     */
    /* JADX WARNING: Missing block: B:75:0x02dc, code skipped:
            r5 = r10;
     */
    /* JADX WARNING: Missing block: B:77:?, code skipped:
            r17.flip();
     */
    /* JADX WARNING: Missing block: B:79:0x02e6, code skipped:
            if (r16.write(r17) > 0) goto L_0x02e2;
     */
    /* JADX WARNING: Missing block: B:80:0x02e8, code skipped:
            r17.clear();
     */
    /* JADX WARNING: Missing block: B:81:0x02f7, code skipped:
            if ((r18.currentTimeMillis() - r20) <= (1000 * r22)) goto L_0x0324;
     */
    /* JADX WARNING: Missing block: B:82:0x02f9, code skipped:
            r4 = "downloadTimeout";
     */
    /* JADX WARNING: Missing block: B:84:?, code skipped:
            r3 = "Timeout exceeded. Limit: " + java.lang.Long.toString(r22) + " sec";
     */
    /* JADX WARNING: Missing block: B:87:0x031f, code skipped:
            throw new java.io.IOException("stream cache time limit exceeded");
     */
    /* JADX WARNING: Missing block: B:88:0x0320, code skipped:
            r2 = e;
     */
    /* JADX WARNING: Missing block: B:89:0x0321, code skipped:
            r5 = r10;
     */
    /* JADX WARNING: Missing block: B:92:0x0328, code skipped:
            if (r26.zzAa == false) goto L_0x0339;
     */
    /* JADX WARNING: Missing block: B:93:0x032a, code skipped:
            r4 = "externalAbort";
     */
    /* JADX WARNING: Missing block: B:96:0x0333, code skipped:
            throw new java.io.IOException("abort requested");
     */
    /* JADX WARNING: Missing block: B:97:0x0334, code skipped:
            r2 = e;
     */
    /* JADX WARNING: Missing block: B:98:0x0335, code skipped:
            r3 = null;
            r5 = r10;
     */
    /* JADX WARNING: Missing block: B:101:0x033d, code skipped:
            if (r0.tryAcquire() == false) goto L_0x02af;
     */
    /* JADX WARNING: Missing block: B:102:0x033f, code skipped:
            zza(r27, r11.getAbsolutePath(), r5, r6, false);
     */
    /* JADX WARNING: Missing block: B:103:0x034d, code skipped:
            r2 = e;
     */
    /* JADX WARNING: Missing block: B:104:0x034e, code skipped:
            r3 = null;
            r4 = r9;
            r5 = r10;
     */
    /* JADX WARNING: Missing block: B:105:0x0353, code skipped:
            r10.close();
     */
    /* JADX WARNING: Missing block: B:106:0x035b, code skipped:
            if (com.google.android.gms.ads.internal.util.client.zzb.zzQ(3) == false) goto L_0x0386;
     */
    /* JADX WARNING: Missing block: B:107:0x035d, code skipped:
            com.google.android.gms.ads.internal.util.client.zzb.zzaI("Preloaded " + zzzY.format((long) r5) + " bytes from " + r27);
     */
    /* JADX WARNING: Missing block: B:108:0x0386, code skipped:
            r11.setReadable(true, false);
            zzb(r12);
            zza(r27, r11.getAbsolutePath(), r5);
            zzzX.remove(r13);
     */
    /* JADX WARNING: Missing block: B:110:0x03a1, code skipped:
            com.google.android.gms.ads.internal.util.client.zzb.zzd("Preload failed for URL \"" + r27 + "\"", r2);
     */
    /* JADX WARNING: Missing block: B:112:0x03c7, code skipped:
            r2 = e;
     */
    /* JADX WARNING: Missing block: B:113:0x03c8, code skipped:
            r3 = null;
            r4 = r9;
     */
    /* JADX WARNING: Missing block: B:114:0x03cc, code skipped:
            r2 = e;
     */
    /* JADX WARNING: Missing block: B:115:0x03cd, code skipped:
            r3 = null;
     */
    /* JADX WARNING: Missing block: B:116:0x03d3, code skipped:
            r2 = e;
     */
    /* JADX WARNING: Missing block: B:117:0x03d4, code skipped:
            r3 = null;
            r4 = r9;
            r5 = r10;
     */
    /* JADX WARNING: Missing block: B:118:0x03d9, code skipped:
            r2 = e;
     */
    /* JADX WARNING: Missing block: B:119:0x03da, code skipped:
            r3 = null;
            r5 = r10;
     */
    /* JADX WARNING: Missing block: B:120:0x03de, code skipped:
            r2 = e;
     */
    /* JADX WARNING: Missing block: B:121:0x03df, code skipped:
            r3 = null;
            r4 = r9;
     */
    /* JADX WARNING: Missing block: B:122:0x03e3, code skipped:
            r2 = e;
     */
    /* JADX WARNING: Missing block: B:123:0x03e4, code skipped:
            r3 = null;
     */
    /* JADX WARNING: Missing block: B:138:?, code skipped:
            return false;
     */
    /* JADX WARNING: Missing block: B:139:?, code skipped:
            return false;
     */
    /* JADX WARNING: Missing block: B:140:?, code skipped:
            return false;
     */
    /* JADX WARNING: Missing block: B:141:?, code skipped:
            return true;
     */
    public boolean zzU(java.lang.String r27) {
        /*
        r26 = this;
        r0 = r26;
        r2 = r0.zzzZ;
        if (r2 != 0) goto L_0x0013;
    L_0x0006:
        r2 = 0;
        r3 = "noCacheDir";
        r4 = 0;
        r0 = r26;
        r1 = r27;
        r0.zza(r1, r2, r3, r4);
        r2 = 0;
    L_0x0012:
        return r2;
    L_0x0013:
        r3 = r26.zzea();
        r2 = com.google.android.gms.internal.zzbt.zzvO;
        r2 = r2.get();
        r2 = (java.lang.Integer) r2;
        r2 = r2.intValue();
        if (r3 <= r2) goto L_0x003d;
    L_0x0025:
        r2 = r26.zzeb();
        if (r2 != 0) goto L_0x0013;
    L_0x002b:
        r2 = "Unable to expire stream cache";
        com.google.android.gms.ads.internal.util.client.zzb.zzaK(r2);
        r2 = 0;
        r3 = "expireFailed";
        r4 = 0;
        r0 = r26;
        r1 = r27;
        r0.zza(r1, r2, r3, r4);
        r2 = 0;
        goto L_0x0012;
    L_0x003d:
        r2 = r26.zzV(r27);
        r11 = new java.io.File;
        r0 = r26;
        r3 = r0.zzzZ;
        r11.<init>(r3, r2);
        r0 = r26;
        r12 = r0.zza(r11);
        r2 = r11.isFile();
        if (r2 == 0) goto L_0x0086;
    L_0x0056:
        r2 = r12.isFile();
        if (r2 == 0) goto L_0x0086;
    L_0x005c:
        r2 = r11.length();
        r2 = (int) r2;
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r4 = "Stream cache hit at ";
        r3 = r3.append(r4);
        r0 = r27;
        r3 = r3.append(r0);
        r3 = r3.toString();
        com.google.android.gms.ads.internal.util.client.zzb.zzaI(r3);
        r3 = r11.getAbsolutePath();
        r0 = r26;
        r1 = r27;
        r0.zza(r1, r3, r2);
        r2 = 1;
        goto L_0x0012;
    L_0x0086:
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r0 = r26;
        r3 = r0.zzzZ;
        r3 = r3.getAbsolutePath();
        r2 = r2.append(r3);
        r0 = r27;
        r2 = r2.append(r0);
        r13 = r2.toString();
        r3 = zzzX;
        monitor-enter(r3);
        r2 = zzzX;	 Catch:{ all -> 0x00d6 }
        r2 = r2.contains(r13);	 Catch:{ all -> 0x00d6 }
        if (r2 == 0) goto L_0x00d9;
    L_0x00ac:
        r2 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00d6 }
        r2.<init>();	 Catch:{ all -> 0x00d6 }
        r4 = "Stream cache already in progress at ";
        r2 = r2.append(r4);	 Catch:{ all -> 0x00d6 }
        r0 = r27;
        r2 = r2.append(r0);	 Catch:{ all -> 0x00d6 }
        r2 = r2.toString();	 Catch:{ all -> 0x00d6 }
        com.google.android.gms.ads.internal.util.client.zzb.zzaK(r2);	 Catch:{ all -> 0x00d6 }
        r2 = r11.getAbsolutePath();	 Catch:{ all -> 0x00d6 }
        r4 = "inProgress";
        r5 = 0;
        r0 = r26;
        r1 = r27;
        r0.zza(r1, r2, r4, r5);	 Catch:{ all -> 0x00d6 }
        r2 = 0;
        monitor-exit(r3);	 Catch:{ all -> 0x00d6 }
        goto L_0x0012;
    L_0x00d6:
        r2 = move-exception;
        monitor-exit(r3);	 Catch:{ all -> 0x00d6 }
        throw r2;
    L_0x00d9:
        r2 = zzzX;	 Catch:{ all -> 0x00d6 }
        r2.add(r13);	 Catch:{ all -> 0x00d6 }
        monitor-exit(r3);	 Catch:{ all -> 0x00d6 }
        r5 = 0;
        r9 = "error";
        r8 = 0;
        r2 = new java.net.URL;	 Catch:{ IOException -> 0x03de, RuntimeException -> 0x03c7 }
        r0 = r27;
        r2.<init>(r0);	 Catch:{ IOException -> 0x03de, RuntimeException -> 0x03c7 }
        r3 = r2.openConnection();	 Catch:{ IOException -> 0x03de, RuntimeException -> 0x03c7 }
        r2 = com.google.android.gms.internal.zzbt.zzvT;	 Catch:{ IOException -> 0x03de, RuntimeException -> 0x03c7 }
        r2 = r2.get();	 Catch:{ IOException -> 0x03de, RuntimeException -> 0x03c7 }
        r2 = (java.lang.Integer) r2;	 Catch:{ IOException -> 0x03de, RuntimeException -> 0x03c7 }
        r2 = r2.intValue();	 Catch:{ IOException -> 0x03de, RuntimeException -> 0x03c7 }
        r3.setConnectTimeout(r2);	 Catch:{ IOException -> 0x03de, RuntimeException -> 0x03c7 }
        r3.setReadTimeout(r2);	 Catch:{ IOException -> 0x03de, RuntimeException -> 0x03c7 }
        r2 = r3 instanceof java.net.HttpURLConnection;	 Catch:{ IOException -> 0x03de, RuntimeException -> 0x03c7 }
        if (r2 == 0) goto L_0x01bb;
    L_0x0104:
        r0 = r3;
        r0 = (java.net.HttpURLConnection) r0;	 Catch:{ IOException -> 0x03de, RuntimeException -> 0x03c7 }
        r2 = r0;
        r2 = r2.getResponseCode();	 Catch:{ IOException -> 0x03de, RuntimeException -> 0x03c7 }
        r4 = 400; // 0x190 float:5.6E-43 double:1.976E-321;
        if (r2 < r4) goto L_0x01bb;
    L_0x0110:
        r4 = "badUrl";
        r3 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x03e3, RuntimeException -> 0x03cc }
        r3.<init>();	 Catch:{ IOException -> 0x03e3, RuntimeException -> 0x03cc }
        r6 = "HTTP request failed. Code: ";
        r3 = r3.append(r6);	 Catch:{ IOException -> 0x03e3, RuntimeException -> 0x03cc }
        r6 = java.lang.Integer.toString(r2);	 Catch:{ IOException -> 0x03e3, RuntimeException -> 0x03cc }
        r3 = r3.append(r6);	 Catch:{ IOException -> 0x03e3, RuntimeException -> 0x03cc }
        r3 = r3.toString();	 Catch:{ IOException -> 0x03e3, RuntimeException -> 0x03cc }
        r6 = new java.io.IOException;	 Catch:{ IOException | RuntimeException -> 0x014e, RuntimeException -> 0x03d0 }
        r7 = new java.lang.StringBuilder;	 Catch:{ IOException | RuntimeException -> 0x014e, RuntimeException -> 0x03d0 }
        r7.<init>();	 Catch:{ IOException | RuntimeException -> 0x014e, RuntimeException -> 0x03d0 }
        r8 = "HTTP status code ";
        r7 = r7.append(r8);	 Catch:{ IOException | RuntimeException -> 0x014e, RuntimeException -> 0x03d0 }
        r2 = r7.append(r2);	 Catch:{ IOException | RuntimeException -> 0x014e, RuntimeException -> 0x03d0 }
        r7 = " at ";
        r2 = r2.append(r7);	 Catch:{ IOException | RuntimeException -> 0x014e, RuntimeException -> 0x03d0 }
        r0 = r27;
        r2 = r2.append(r0);	 Catch:{ IOException | RuntimeException -> 0x014e, RuntimeException -> 0x03d0 }
        r2 = r2.toString();	 Catch:{ IOException | RuntimeException -> 0x014e, RuntimeException -> 0x03d0 }
        r6.<init>(r2);	 Catch:{ IOException | RuntimeException -> 0x014e, RuntimeException -> 0x03d0 }
        throw r6;	 Catch:{ IOException | RuntimeException -> 0x014e, RuntimeException -> 0x03d0 }
    L_0x014e:
        r2 = move-exception;
    L_0x014f:
        r6 = r2 instanceof java.lang.RuntimeException;
        if (r6 == 0) goto L_0x015b;
    L_0x0153:
        r6 = com.google.android.gms.ads.internal.zzr.zzbF();
        r7 = 1;
        r6.zzb(r2, r7);
    L_0x015b:
        r5.close();	 Catch:{ IOException | NullPointerException -> 0x03c1, NullPointerException -> 0x03c4 }
    L_0x015e:
        r0 = r26;
        r5 = r0.zzAa;
        if (r5 == 0) goto L_0x03a1;
    L_0x0164:
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r5 = "Preload aborted for URL \"";
        r2 = r2.append(r5);
        r0 = r27;
        r2 = r2.append(r0);
        r5 = "\"";
        r2 = r2.append(r5);
        r2 = r2.toString();
        com.google.android.gms.ads.internal.util.client.zzb.zzaJ(r2);
    L_0x0182:
        r2 = r11.exists();
        if (r2 == 0) goto L_0x01a8;
    L_0x0188:
        r2 = r11.delete();
        if (r2 != 0) goto L_0x01a8;
    L_0x018e:
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r5 = "Could not delete partial cache file at ";
        r2 = r2.append(r5);
        r5 = r11.getAbsolutePath();
        r2 = r2.append(r5);
        r2 = r2.toString();
        com.google.android.gms.ads.internal.util.client.zzb.zzaK(r2);
    L_0x01a8:
        r2 = r11.getAbsolutePath();
        r0 = r26;
        r1 = r27;
        r0.zza(r1, r2, r4, r3);
        r2 = zzzX;
        r2.remove(r13);
        r2 = 0;
        goto L_0x0012;
    L_0x01bb:
        r6 = r3.getContentLength();	 Catch:{ IOException -> 0x03de, RuntimeException -> 0x03c7 }
        if (r6 >= 0) goto L_0x01ef;
    L_0x01c1:
        r2 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x03de, RuntimeException -> 0x03c7 }
        r2.<init>();	 Catch:{ IOException -> 0x03de, RuntimeException -> 0x03c7 }
        r3 = "Stream cache aborted, missing content-length header at ";
        r2 = r2.append(r3);	 Catch:{ IOException -> 0x03de, RuntimeException -> 0x03c7 }
        r0 = r27;
        r2 = r2.append(r0);	 Catch:{ IOException -> 0x03de, RuntimeException -> 0x03c7 }
        r2 = r2.toString();	 Catch:{ IOException -> 0x03de, RuntimeException -> 0x03c7 }
        com.google.android.gms.ads.internal.util.client.zzb.zzaK(r2);	 Catch:{ IOException -> 0x03de, RuntimeException -> 0x03c7 }
        r2 = r11.getAbsolutePath();	 Catch:{ IOException -> 0x03de, RuntimeException -> 0x03c7 }
        r3 = "contentLengthMissing";
        r4 = 0;
        r0 = r26;
        r1 = r27;
        r0.zza(r1, r2, r3, r4);	 Catch:{ IOException -> 0x03de, RuntimeException -> 0x03c7 }
        r2 = zzzX;	 Catch:{ IOException -> 0x03de, RuntimeException -> 0x03c7 }
        r2.remove(r13);	 Catch:{ IOException -> 0x03de, RuntimeException -> 0x03c7 }
        r2 = 0;
        goto L_0x0012;
    L_0x01ef:
        r2 = zzzY;	 Catch:{ IOException -> 0x03de, RuntimeException -> 0x03c7 }
        r14 = (long) r6;	 Catch:{ IOException -> 0x03de, RuntimeException -> 0x03c7 }
        r4 = r2.format(r14);	 Catch:{ IOException -> 0x03de, RuntimeException -> 0x03c7 }
        r2 = com.google.android.gms.internal.zzbt.zzvP;	 Catch:{ IOException -> 0x03de, RuntimeException -> 0x03c7 }
        r2 = r2.get();	 Catch:{ IOException -> 0x03de, RuntimeException -> 0x03c7 }
        r2 = (java.lang.Integer) r2;	 Catch:{ IOException -> 0x03de, RuntimeException -> 0x03c7 }
        r14 = r2.intValue();	 Catch:{ IOException -> 0x03de, RuntimeException -> 0x03c7 }
        if (r6 <= r14) goto L_0x024e;
    L_0x0204:
        r2 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x03de, RuntimeException -> 0x03c7 }
        r2.<init>();	 Catch:{ IOException -> 0x03de, RuntimeException -> 0x03c7 }
        r3 = "Content length ";
        r2 = r2.append(r3);	 Catch:{ IOException -> 0x03de, RuntimeException -> 0x03c7 }
        r2 = r2.append(r4);	 Catch:{ IOException -> 0x03de, RuntimeException -> 0x03c7 }
        r3 = " exceeds limit at ";
        r2 = r2.append(r3);	 Catch:{ IOException -> 0x03de, RuntimeException -> 0x03c7 }
        r0 = r27;
        r2 = r2.append(r0);	 Catch:{ IOException -> 0x03de, RuntimeException -> 0x03c7 }
        r2 = r2.toString();	 Catch:{ IOException -> 0x03de, RuntimeException -> 0x03c7 }
        com.google.android.gms.ads.internal.util.client.zzb.zzaK(r2);	 Catch:{ IOException -> 0x03de, RuntimeException -> 0x03c7 }
        r2 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x03de, RuntimeException -> 0x03c7 }
        r2.<init>();	 Catch:{ IOException -> 0x03de, RuntimeException -> 0x03c7 }
        r3 = "File too big for full file cache. Size: ";
        r2 = r2.append(r3);	 Catch:{ IOException -> 0x03de, RuntimeException -> 0x03c7 }
        r2 = r2.append(r4);	 Catch:{ IOException -> 0x03de, RuntimeException -> 0x03c7 }
        r2 = r2.toString();	 Catch:{ IOException -> 0x03de, RuntimeException -> 0x03c7 }
        r3 = r11.getAbsolutePath();	 Catch:{ IOException -> 0x03de, RuntimeException -> 0x03c7 }
        r4 = "sizeExceeded";
        r0 = r26;
        r1 = r27;
        r0.zza(r1, r3, r4, r2);	 Catch:{ IOException -> 0x03de, RuntimeException -> 0x03c7 }
        r2 = zzzX;	 Catch:{ IOException -> 0x03de, RuntimeException -> 0x03c7 }
        r2.remove(r13);	 Catch:{ IOException -> 0x03de, RuntimeException -> 0x03c7 }
        r2 = 0;
        goto L_0x0012;
    L_0x024e:
        r2 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x03de, RuntimeException -> 0x03c7 }
        r2.<init>();	 Catch:{ IOException -> 0x03de, RuntimeException -> 0x03c7 }
        r7 = "Caching ";
        r2 = r2.append(r7);	 Catch:{ IOException -> 0x03de, RuntimeException -> 0x03c7 }
        r2 = r2.append(r4);	 Catch:{ IOException -> 0x03de, RuntimeException -> 0x03c7 }
        r4 = " bytes from ";
        r2 = r2.append(r4);	 Catch:{ IOException -> 0x03de, RuntimeException -> 0x03c7 }
        r0 = r27;
        r2 = r2.append(r0);	 Catch:{ IOException -> 0x03de, RuntimeException -> 0x03c7 }
        r2 = r2.toString();	 Catch:{ IOException -> 0x03de, RuntimeException -> 0x03c7 }
        com.google.android.gms.ads.internal.util.client.zzb.zzaI(r2);	 Catch:{ IOException -> 0x03de, RuntimeException -> 0x03c7 }
        r2 = r3.getInputStream();	 Catch:{ IOException -> 0x03de, RuntimeException -> 0x03c7 }
        r15 = java.nio.channels.Channels.newChannel(r2);	 Catch:{ IOException -> 0x03de, RuntimeException -> 0x03c7 }
        r10 = new java.io.FileOutputStream;	 Catch:{ IOException -> 0x03de, RuntimeException -> 0x03c7 }
        r10.<init>(r11);	 Catch:{ IOException -> 0x03de, RuntimeException -> 0x03c7 }
        r16 = r10.getChannel();	 Catch:{ IOException -> 0x034d, RuntimeException -> 0x03d3 }
        r2 = 1048576; // 0x100000 float:1.469368E-39 double:5.180654E-318;
        r17 = java.nio.ByteBuffer.allocate(r2);	 Catch:{ IOException -> 0x034d, RuntimeException -> 0x03d3 }
        r18 = com.google.android.gms.ads.internal.zzr.zzbG();	 Catch:{ IOException -> 0x034d, RuntimeException -> 0x03d3 }
        r5 = 0;
        r20 = r18.currentTimeMillis();	 Catch:{ IOException -> 0x034d, RuntimeException -> 0x03d3 }
        r2 = com.google.android.gms.internal.zzbt.zzvS;	 Catch:{ IOException -> 0x034d, RuntimeException -> 0x03d3 }
        r2 = r2.get();	 Catch:{ IOException -> 0x034d, RuntimeException -> 0x03d3 }
        r2 = (java.lang.Long) r2;	 Catch:{ IOException -> 0x034d, RuntimeException -> 0x03d3 }
        r2 = r2.longValue();	 Catch:{ IOException -> 0x034d, RuntimeException -> 0x03d3 }
        r19 = new com.google.android.gms.internal.zziz;	 Catch:{ IOException -> 0x034d, RuntimeException -> 0x03d3 }
        r0 = r19;
        r0.m3386init(r2);	 Catch:{ IOException -> 0x034d, RuntimeException -> 0x03d3 }
        r2 = com.google.android.gms.internal.zzbt.zzvR;	 Catch:{ IOException -> 0x034d, RuntimeException -> 0x03d3 }
        r2 = r2.get();	 Catch:{ IOException -> 0x034d, RuntimeException -> 0x03d3 }
        r2 = (java.lang.Long) r2;	 Catch:{ IOException -> 0x034d, RuntimeException -> 0x03d3 }
        r22 = r2.longValue();	 Catch:{ IOException -> 0x034d, RuntimeException -> 0x03d3 }
    L_0x02af:
        r0 = r17;
        r2 = r15.read(r0);	 Catch:{ IOException -> 0x034d, RuntimeException -> 0x03d3 }
        if (r2 < 0) goto L_0x0353;
    L_0x02b7:
        r5 = r5 + r2;
        if (r5 <= r14) goto L_0x02df;
    L_0x02ba:
        r4 = "sizeExceeded";
        r2 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x0334, RuntimeException -> 0x03d9 }
        r2.<init>();	 Catch:{ IOException -> 0x0334, RuntimeException -> 0x03d9 }
        r3 = "File too big for full file cache. Size: ";
        r2 = r2.append(r3);	 Catch:{ IOException -> 0x0334, RuntimeException -> 0x03d9 }
        r3 = java.lang.Integer.toString(r5);	 Catch:{ IOException -> 0x0334, RuntimeException -> 0x03d9 }
        r2 = r2.append(r3);	 Catch:{ IOException -> 0x0334, RuntimeException -> 0x03d9 }
        r3 = r2.toString();	 Catch:{ IOException -> 0x0334, RuntimeException -> 0x03d9 }
        r2 = new java.io.IOException;	 Catch:{ IOException -> 0x02db, RuntimeException -> 0x0320 }
        r5 = "stream cache file size limit exceeded";
        r2.<init>(r5);	 Catch:{ IOException -> 0x02db, RuntimeException -> 0x0320 }
        throw r2;	 Catch:{ IOException -> 0x02db, RuntimeException -> 0x0320 }
    L_0x02db:
        r2 = move-exception;
        r5 = r10;
        goto L_0x014f;
    L_0x02df:
        r17.flip();	 Catch:{ IOException -> 0x034d, RuntimeException -> 0x03d3 }
    L_0x02e2:
        r2 = r16.write(r17);	 Catch:{ IOException -> 0x034d, RuntimeException -> 0x03d3 }
        if (r2 > 0) goto L_0x02e2;
    L_0x02e8:
        r17.clear();	 Catch:{ IOException -> 0x034d, RuntimeException -> 0x03d3 }
        r2 = r18.currentTimeMillis();	 Catch:{ IOException -> 0x034d, RuntimeException -> 0x03d3 }
        r2 = r2 - r20;
        r24 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r24 = r24 * r22;
        r2 = (r2 > r24 ? 1 : (r2 == r24 ? 0 : -1));
        if (r2 <= 0) goto L_0x0324;
    L_0x02f9:
        r4 = "downloadTimeout";
        r2 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x0334, RuntimeException -> 0x03d9 }
        r2.<init>();	 Catch:{ IOException -> 0x0334, RuntimeException -> 0x03d9 }
        r3 = "Timeout exceeded. Limit: ";
        r2 = r2.append(r3);	 Catch:{ IOException -> 0x0334, RuntimeException -> 0x03d9 }
        r3 = java.lang.Long.toString(r22);	 Catch:{ IOException -> 0x0334, RuntimeException -> 0x03d9 }
        r2 = r2.append(r3);	 Catch:{ IOException -> 0x0334, RuntimeException -> 0x03d9 }
        r3 = " sec";
        r2 = r2.append(r3);	 Catch:{ IOException -> 0x0334, RuntimeException -> 0x03d9 }
        r3 = r2.toString();	 Catch:{ IOException -> 0x0334, RuntimeException -> 0x03d9 }
        r2 = new java.io.IOException;	 Catch:{ IOException -> 0x02db, RuntimeException -> 0x0320 }
        r5 = "stream cache time limit exceeded";
        r2.<init>(r5);	 Catch:{ IOException -> 0x02db, RuntimeException -> 0x0320 }
        throw r2;	 Catch:{ IOException -> 0x02db, RuntimeException -> 0x0320 }
    L_0x0320:
        r2 = move-exception;
        r5 = r10;
        goto L_0x014f;
    L_0x0324:
        r0 = r26;
        r2 = r0.zzAa;	 Catch:{ IOException -> 0x034d, RuntimeException -> 0x03d3 }
        if (r2 == 0) goto L_0x0339;
    L_0x032a:
        r4 = "externalAbort";
        r2 = new java.io.IOException;	 Catch:{ IOException -> 0x0334, RuntimeException -> 0x03d9 }
        r3 = "abort requested";
        r2.<init>(r3);	 Catch:{ IOException -> 0x0334, RuntimeException -> 0x03d9 }
        throw r2;	 Catch:{ IOException -> 0x0334, RuntimeException -> 0x03d9 }
    L_0x0334:
        r2 = move-exception;
        r3 = r8;
        r5 = r10;
        goto L_0x014f;
    L_0x0339:
        r2 = r19.tryAcquire();	 Catch:{ IOException -> 0x034d, RuntimeException -> 0x03d3 }
        if (r2 == 0) goto L_0x02af;
    L_0x033f:
        r4 = r11.getAbsolutePath();	 Catch:{ IOException -> 0x034d, RuntimeException -> 0x03d3 }
        r7 = 0;
        r2 = r26;
        r3 = r27;
        r2.zza(r3, r4, r5, r6, r7);	 Catch:{ IOException -> 0x034d, RuntimeException -> 0x03d3 }
        goto L_0x02af;
    L_0x034d:
        r2 = move-exception;
        r3 = r8;
        r4 = r9;
        r5 = r10;
        goto L_0x014f;
    L_0x0353:
        r10.close();	 Catch:{ IOException -> 0x034d, RuntimeException -> 0x03d3 }
        r2 = 3;
        r2 = com.google.android.gms.ads.internal.util.client.zzb.zzQ(r2);	 Catch:{ IOException -> 0x034d, RuntimeException -> 0x03d3 }
        if (r2 == 0) goto L_0x0386;
    L_0x035d:
        r2 = zzzY;	 Catch:{ IOException -> 0x034d, RuntimeException -> 0x03d3 }
        r6 = (long) r5;	 Catch:{ IOException -> 0x034d, RuntimeException -> 0x03d3 }
        r2 = r2.format(r6);	 Catch:{ IOException -> 0x034d, RuntimeException -> 0x03d3 }
        r3 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x034d, RuntimeException -> 0x03d3 }
        r3.<init>();	 Catch:{ IOException -> 0x034d, RuntimeException -> 0x03d3 }
        r4 = "Preloaded ";
        r3 = r3.append(r4);	 Catch:{ IOException -> 0x034d, RuntimeException -> 0x03d3 }
        r2 = r3.append(r2);	 Catch:{ IOException -> 0x034d, RuntimeException -> 0x03d3 }
        r3 = " bytes from ";
        r2 = r2.append(r3);	 Catch:{ IOException -> 0x034d, RuntimeException -> 0x03d3 }
        r0 = r27;
        r2 = r2.append(r0);	 Catch:{ IOException -> 0x034d, RuntimeException -> 0x03d3 }
        r2 = r2.toString();	 Catch:{ IOException -> 0x034d, RuntimeException -> 0x03d3 }
        com.google.android.gms.ads.internal.util.client.zzb.zzaI(r2);	 Catch:{ IOException -> 0x034d, RuntimeException -> 0x03d3 }
    L_0x0386:
        r2 = 1;
        r3 = 0;
        r11.setReadable(r2, r3);	 Catch:{ IOException -> 0x034d, RuntimeException -> 0x03d3 }
        zzb(r12);	 Catch:{ IOException -> 0x034d, RuntimeException -> 0x03d3 }
        r2 = r11.getAbsolutePath();	 Catch:{ IOException -> 0x034d, RuntimeException -> 0x03d3 }
        r0 = r26;
        r1 = r27;
        r0.zza(r1, r2, r5);	 Catch:{ IOException -> 0x034d, RuntimeException -> 0x03d3 }
        r2 = zzzX;	 Catch:{ IOException -> 0x034d, RuntimeException -> 0x03d3 }
        r2.remove(r13);	 Catch:{ IOException -> 0x034d, RuntimeException -> 0x03d3 }
        r2 = 1;
        goto L_0x0012;
    L_0x03a1:
        r5 = new java.lang.StringBuilder;
        r5.<init>();
        r6 = "Preload failed for URL \"";
        r5 = r5.append(r6);
        r0 = r27;
        r5 = r5.append(r0);
        r6 = "\"";
        r5 = r5.append(r6);
        r5 = r5.toString();
        com.google.android.gms.ads.internal.util.client.zzb.zzd(r5, r2);
        goto L_0x0182;
    L_0x03c1:
        r5 = move-exception;
        goto L_0x015e;
    L_0x03c4:
        r5 = move-exception;
        goto L_0x015e;
    L_0x03c7:
        r2 = move-exception;
        r3 = r8;
        r4 = r9;
        goto L_0x014f;
    L_0x03cc:
        r2 = move-exception;
        r3 = r8;
        goto L_0x014f;
    L_0x03d0:
        r2 = move-exception;
        goto L_0x014f;
    L_0x03d3:
        r2 = move-exception;
        r3 = r8;
        r4 = r9;
        r5 = r10;
        goto L_0x014f;
    L_0x03d9:
        r2 = move-exception;
        r3 = r8;
        r5 = r10;
        goto L_0x014f;
    L_0x03de:
        r2 = move-exception;
        r3 = r8;
        r4 = r9;
        goto L_0x014f;
    L_0x03e3:
        r2 = move-exception;
        r3 = r8;
        goto L_0x014f;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzdu.zzU(java.lang.String):boolean");
    }

    public int zzea() {
        int i = 0;
        if (this.zzzZ != null) {
            for (File name : this.zzzZ.listFiles()) {
                if (!name.getName().endsWith(".done")) {
                    i++;
                }
            }
        }
        return i;
    }

    public boolean zzeb() {
        if (this.zzzZ == null) {
            return false;
        }
        boolean delete;
        File file = null;
        long j = Long.MAX_VALUE;
        File[] listFiles = this.zzzZ.listFiles();
        int length = listFiles.length;
        int i = 0;
        while (i < length) {
            long lastModified;
            File file2;
            File file3 = listFiles[i];
            if (!file3.getName().endsWith(".done")) {
                lastModified = file3.lastModified();
                if (lastModified < j) {
                    file2 = file3;
                    i++;
                    file = file2;
                    j = lastModified;
                }
            }
            lastModified = j;
            file2 = file;
            i++;
            file = file2;
            j = lastModified;
        }
        if (file != null) {
            delete = file.delete();
            File zza = zza(file);
            if (zza.isFile()) {
                delete &= zza.delete();
            }
        } else {
            delete = false;
        }
        return delete;
    }
}
