package com.google.android.gms.internal;

import android.app.AlertDialog.Builder;
import android.app.DownloadManager;
import android.app.DownloadManager.Request;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.net.Uri;
import android.os.Environment;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.google.android.gms.R;
import com.google.android.gms.ads.internal.zzr;
import java.util.Map;
import org.springframework.http.HttpHeaders;

@zzhb
public class zzfp extends zzfs {
    /* access modifiers changed from: private|final */
    public final Context mContext;
    private final Map<String, String> zzxA;

    public zzfp(zzjp zzjp, Map<String, String> map) {
        super(zzjp, "storePicture");
        this.zzxA = map;
        this.mContext = zzjp.zzhP();
    }

    public void execute() {
        if (this.mContext == null) {
            zzam("Activity context is not available");
        } else if (zzr.zzbC().zzM(this.mContext).zzdl()) {
            final String str = (String) this.zzxA.get("iurl");
            if (TextUtils.isEmpty(str)) {
                zzam("Image url cannot be empty.");
            } else if (URLUtil.isValidUrl(str)) {
                final String zzal = zzal(str);
                if (zzr.zzbC().zzaE(zzal)) {
                    Builder zzL = zzr.zzbC().zzL(this.mContext);
                    zzL.setTitle(zzr.zzbF().zzd(R.string.store_picture_title, "Save image"));
                    zzL.setMessage(zzr.zzbF().zzd(R.string.store_picture_message, "Allow Ad to store image in Picture gallery?"));
                    zzL.setPositiveButton(zzr.zzbF().zzd(R.string.accept, HttpHeaders.ACCEPT), new OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            try {
                                ((DownloadManager) zzfp.this.mContext.getSystemService("download")).enqueue(zzfp.this.zzf(str, zzal));
                            } catch (IllegalStateException e) {
                                zzfp.this.zzam("Could not store picture.");
                            }
                        }
                    });
                    zzL.setNegativeButton(zzr.zzbF().zzd(R.string.decline, "Decline"), new OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            zzfp.this.zzam("User canceled the download.");
                        }
                    });
                    zzL.create().show();
                    return;
                }
                zzam("Image type not recognized: " + zzal);
            } else {
                zzam("Invalid image url: " + str);
            }
        } else {
            zzam("Feature is not supported by the device.");
        }
    }

    /* access modifiers changed from: 0000 */
    public String zzal(String str) {
        return Uri.parse(str).getLastPathSegment();
    }

    /* access modifiers changed from: 0000 */
    public Request zzf(String str, String str2) {
        Request request = new Request(Uri.parse(str));
        request.setDestinationInExternalPublicDir(Environment.DIRECTORY_PICTURES, str2);
        zzr.zzbE().zza(request);
        return request;
    }
}
