package com.google.android.gms.internal;

import com.google.android.gms.ads.formats.NativeCustomTemplateAd.OnCustomClickListener;
import com.google.android.gms.internal.zzct.zza;

@zzhb
public class zzcy extends zza {
    private final OnCustomClickListener zzyU;

    public zzcy(OnCustomClickListener onCustomClickListener) {
        this.zzyU = onCustomClickListener;
    }

    public void zza(zzcp zzcp, String str) {
        this.zzyU.onCustomClick(new zzcq(zzcp), str);
    }
}
