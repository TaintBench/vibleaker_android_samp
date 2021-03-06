package com.google.android.gms.common;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;

public class zzb implements Creator<ConnectionResult> {
    static void zza(ConnectionResult connectionResult, Parcel parcel, int i) {
        int zzav = com.google.android.gms.common.internal.safeparcel.zzb.zzav(parcel);
        com.google.android.gms.common.internal.safeparcel.zzb.zzc(parcel, 1, connectionResult.mVersionCode);
        com.google.android.gms.common.internal.safeparcel.zzb.zzc(parcel, 2, connectionResult.getErrorCode());
        com.google.android.gms.common.internal.safeparcel.zzb.zza(parcel, 3, connectionResult.getResolution(), i, false);
        com.google.android.gms.common.internal.safeparcel.zzb.zza(parcel, 4, connectionResult.getErrorMessage(), false);
        com.google.android.gms.common.internal.safeparcel.zzb.zzI(parcel, zzav);
    }

    /* renamed from: zzag */
    public ConnectionResult createFromParcel(Parcel parcel) {
        String str = null;
        int i = 0;
        int zzau = zza.zzau(parcel);
        PendingIntent pendingIntent = null;
        int i2 = 0;
        while (parcel.dataPosition() < zzau) {
            PendingIntent pendingIntent2;
            int i3;
            String str2;
            int zzat = zza.zzat(parcel);
            String str3;
            switch (zza.zzca(zzat)) {
                case 1:
                    str3 = str;
                    pendingIntent2 = pendingIntent;
                    i3 = i;
                    i = zza.zzg(parcel, zzat);
                    str2 = str3;
                    break;
                case 2:
                    i = i2;
                    PendingIntent pendingIntent3 = pendingIntent;
                    i3 = zza.zzg(parcel, zzat);
                    str2 = str;
                    pendingIntent2 = pendingIntent3;
                    break;
                case 3:
                    i3 = i;
                    i = i2;
                    str3 = str;
                    pendingIntent2 = (PendingIntent) zza.zza(parcel, zzat, PendingIntent.CREATOR);
                    str2 = str3;
                    break;
                case 4:
                    str2 = zza.zzp(parcel, zzat);
                    pendingIntent2 = pendingIntent;
                    i3 = i;
                    i = i2;
                    break;
                default:
                    zza.zzb(parcel, zzat);
                    str2 = str;
                    pendingIntent2 = pendingIntent;
                    i3 = i;
                    i = i2;
                    break;
            }
            i2 = i;
            i = i3;
            pendingIntent = pendingIntent2;
            str = str2;
        }
        if (parcel.dataPosition() == zzau) {
            return new ConnectionResult(i2, i, pendingIntent, str);
        }
        throw new zza.zza("Overread allowed size end=" + zzau, parcel);
    }

    /* renamed from: zzbt */
    public ConnectionResult[] newArray(int i) {
        return new ConnectionResult[i];
    }
}
