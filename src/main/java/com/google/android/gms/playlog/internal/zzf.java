package com.google.android.gms.playlog.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.zzb;
import com.google.android.gms.common.internal.zzj;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.internal.zzsu;
import com.google.android.gms.playlog.internal.zzb.zza;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class zzf extends zzj<zza> {
    private final String zzTJ;
    private final zzd zzbdT;
    private final zzb zzbdU = new zzb();
    private boolean zzbdV = true;
    private final Object zzpV = new Object();

    public zzf(Context context, Looper looper, zzd zzd, com.google.android.gms.common.internal.zzf zzf) {
        super(context, looper, 24, zzf, zzd, zzd);
        this.zzTJ = context.getPackageName();
        this.zzbdT = (zzd) zzx.zzz(zzd);
        this.zzbdT.zza(this);
    }

    private void zzEW() {
        zzb.zzab(!this.zzbdV);
        if (!this.zzbdU.isEmpty()) {
            PlayLoggerContext playLoggerContext = null;
            try {
                List arrayList = new ArrayList();
                Iterator it = this.zzbdU.zzEU().iterator();
                while (it.hasNext()) {
                    zza zza = (zza) it.next();
                    if (zza.zzbdI != null) {
                        ((zza) zzqJ()).zza(this.zzTJ, zza.zzbdG, zzsu.toByteArray(zza.zzbdI));
                    } else {
                        PlayLoggerContext playLoggerContext2;
                        if (zza.zzbdG.equals(playLoggerContext)) {
                            arrayList.add(zza.zzbdH);
                            playLoggerContext2 = playLoggerContext;
                        } else {
                            if (!arrayList.isEmpty()) {
                                ((zza) zzqJ()).zza(this.zzTJ, playLoggerContext, arrayList);
                                arrayList.clear();
                            }
                            PlayLoggerContext playLoggerContext3 = zza.zzbdG;
                            arrayList.add(zza.zzbdH);
                            playLoggerContext2 = playLoggerContext3;
                        }
                        playLoggerContext = playLoggerContext2;
                    }
                }
                if (!arrayList.isEmpty()) {
                    ((zza) zzqJ()).zza(this.zzTJ, playLoggerContext, arrayList);
                }
                this.zzbdU.clear();
            } catch (RemoteException e) {
                Log.e("PlayLoggerImpl", "Couldn't send cached log events to AndroidLog service.  Retaining in memory cache.");
            }
        }
    }

    private void zzc(PlayLoggerContext playLoggerContext, LogEvent logEvent) {
        this.zzbdU.zza(playLoggerContext, logEvent);
    }

    private void zzd(PlayLoggerContext playLoggerContext, LogEvent logEvent) {
        try {
            zzEW();
            ((zza) zzqJ()).zza(this.zzTJ, playLoggerContext, logEvent);
        } catch (RemoteException e) {
            Log.e("PlayLoggerImpl", "Couldn't send log event.  Will try caching.");
            zzc(playLoggerContext, logEvent);
        } catch (IllegalStateException e2) {
            Log.e("PlayLoggerImpl", "Service was disconnected.  Will try caching.");
            zzc(playLoggerContext, logEvent);
        }
    }

    /* JADX WARNING: Missing block: B:14:?, code skipped:
            return;
     */
    public void start() {
        /*
        r3 = this;
        r1 = r3.zzpV;
        monitor-enter(r1);
        r0 = r3.isConnecting();	 Catch:{ all -> 0x001c }
        if (r0 != 0) goto L_0x000f;
    L_0x0009:
        r0 = r3.isConnected();	 Catch:{ all -> 0x001c }
        if (r0 == 0) goto L_0x0011;
    L_0x000f:
        monitor-exit(r1);	 Catch:{ all -> 0x001c }
    L_0x0010:
        return;
    L_0x0011:
        r0 = r3.zzbdT;	 Catch:{ all -> 0x001c }
        r2 = 1;
        r0.zzat(r2);	 Catch:{ all -> 0x001c }
        r3.zzqG();	 Catch:{ all -> 0x001c }
        monitor-exit(r1);	 Catch:{ all -> 0x001c }
        goto L_0x0010;
    L_0x001c:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x001c }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.playlog.internal.zzf.start():void");
    }

    public void stop() {
        synchronized (this.zzpV) {
            this.zzbdT.zzat(false);
            disconnect();
        }
    }

    /* access modifiers changed from: 0000 */
    public void zzau(boolean z) {
        synchronized (this.zzpV) {
            boolean z2 = this.zzbdV;
            this.zzbdV = z;
            if (z2 && !this.zzbdV) {
                zzEW();
            }
        }
    }

    public void zzb(PlayLoggerContext playLoggerContext, LogEvent logEvent) {
        synchronized (this.zzpV) {
            if (this.zzbdV) {
                zzc(playLoggerContext, logEvent);
            } else {
                zzd(playLoggerContext, logEvent);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: zzdO */
    public zza zzW(IBinder iBinder) {
        return zza.zza.zzdN(iBinder);
    }

    /* access modifiers changed from: protected */
    public String zzgu() {
        return "com.google.android.gms.playlog.service.START";
    }

    /* access modifiers changed from: protected */
    public String zzgv() {
        return "com.google.android.gms.playlog.internal.IPlayLogService";
    }
}
