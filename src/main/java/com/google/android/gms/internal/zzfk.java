package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.ads.AdRequest.ErrorCode;
import com.google.ads.mediation.MediationBannerAdapter;
import com.google.ads.mediation.MediationBannerListener;
import com.google.ads.mediation.MediationInterstitialAdapter;
import com.google.ads.mediation.MediationInterstitialListener;
import com.google.ads.mediation.MediationServerParameters;
import com.google.ads.mediation.NetworkExtras;
import com.google.android.gms.ads.internal.client.zzn;
import com.google.android.gms.ads.internal.util.client.zza;
import com.google.android.gms.ads.internal.util.client.zzb;

@zzhb
public final class zzfk<NETWORK_EXTRAS extends NetworkExtras, SERVER_PARAMETERS extends MediationServerParameters> implements MediationBannerListener, MediationInterstitialListener {
    /* access modifiers changed from: private|final */
    public final zzez zzCK;

    public zzfk(zzez zzez) {
        this.zzCK = zzez;
    }

    public void onClick(MediationBannerAdapter<?, ?> mediationBannerAdapter) {
        zzb.zzaI("Adapter called onClick.");
        if (zzn.zzcS().zzhJ()) {
            try {
                this.zzCK.onAdClicked();
                return;
            } catch (RemoteException e) {
                zzb.zzd("Could not call onAdClicked.", e);
                return;
            }
        }
        zzb.zzaK("onClick must be called on the main UI thread.");
        zza.zzMS.post(new Runnable() {
            public void run() {
                try {
                    zzfk.this.zzCK.onAdClicked();
                } catch (RemoteException e) {
                    zzb.zzd("Could not call onAdClicked.", e);
                }
            }
        });
    }

    public void onDismissScreen(MediationBannerAdapter<?, ?> mediationBannerAdapter) {
        zzb.zzaI("Adapter called onDismissScreen.");
        if (zzn.zzcS().zzhJ()) {
            try {
                this.zzCK.onAdClosed();
                return;
            } catch (RemoteException e) {
                zzb.zzd("Could not call onAdClosed.", e);
                return;
            }
        }
        zzb.zzaK("onDismissScreen must be called on the main UI thread.");
        zza.zzMS.post(new Runnable() {
            public void run() {
                try {
                    zzfk.this.zzCK.onAdClosed();
                } catch (RemoteException e) {
                    zzb.zzd("Could not call onAdClosed.", e);
                }
            }
        });
    }

    public void onDismissScreen(MediationInterstitialAdapter<?, ?> mediationInterstitialAdapter) {
        zzb.zzaI("Adapter called onDismissScreen.");
        if (zzn.zzcS().zzhJ()) {
            try {
                this.zzCK.onAdClosed();
                return;
            } catch (RemoteException e) {
                zzb.zzd("Could not call onAdClosed.", e);
                return;
            }
        }
        zzb.zzaK("onDismissScreen must be called on the main UI thread.");
        zza.zzMS.post(new Runnable() {
            public void run() {
                try {
                    zzfk.this.zzCK.onAdClosed();
                } catch (RemoteException e) {
                    zzb.zzd("Could not call onAdClosed.", e);
                }
            }
        });
    }

    public void onFailedToReceiveAd(MediationBannerAdapter<?, ?> mediationBannerAdapter, final ErrorCode errorCode) {
        zzb.zzaI("Adapter called onFailedToReceiveAd with error. " + errorCode);
        if (zzn.zzcS().zzhJ()) {
            try {
                this.zzCK.onAdFailedToLoad(zzfl.zza(errorCode));
                return;
            } catch (RemoteException e) {
                zzb.zzd("Could not call onAdFailedToLoad.", e);
                return;
            }
        }
        zzb.zzaK("onFailedToReceiveAd must be called on the main UI thread.");
        zza.zzMS.post(new Runnable() {
            public void run() {
                try {
                    zzfk.this.zzCK.onAdFailedToLoad(zzfl.zza(errorCode));
                } catch (RemoteException e) {
                    zzb.zzd("Could not call onAdFailedToLoad.", e);
                }
            }
        });
    }

    public void onFailedToReceiveAd(MediationInterstitialAdapter<?, ?> mediationInterstitialAdapter, final ErrorCode errorCode) {
        zzb.zzaI("Adapter called onFailedToReceiveAd with error " + errorCode + ".");
        if (zzn.zzcS().zzhJ()) {
            try {
                this.zzCK.onAdFailedToLoad(zzfl.zza(errorCode));
                return;
            } catch (RemoteException e) {
                zzb.zzd("Could not call onAdFailedToLoad.", e);
                return;
            }
        }
        zzb.zzaK("onFailedToReceiveAd must be called on the main UI thread.");
        zza.zzMS.post(new Runnable() {
            public void run() {
                try {
                    zzfk.this.zzCK.onAdFailedToLoad(zzfl.zza(errorCode));
                } catch (RemoteException e) {
                    zzb.zzd("Could not call onAdFailedToLoad.", e);
                }
            }
        });
    }

    public void onLeaveApplication(MediationBannerAdapter<?, ?> mediationBannerAdapter) {
        zzb.zzaI("Adapter called onLeaveApplication.");
        if (zzn.zzcS().zzhJ()) {
            try {
                this.zzCK.onAdLeftApplication();
                return;
            } catch (RemoteException e) {
                zzb.zzd("Could not call onAdLeftApplication.", e);
                return;
            }
        }
        zzb.zzaK("onLeaveApplication must be called on the main UI thread.");
        zza.zzMS.post(new Runnable() {
            public void run() {
                try {
                    zzfk.this.zzCK.onAdLeftApplication();
                } catch (RemoteException e) {
                    zzb.zzd("Could not call onAdLeftApplication.", e);
                }
            }
        });
    }

    public void onLeaveApplication(MediationInterstitialAdapter<?, ?> mediationInterstitialAdapter) {
        zzb.zzaI("Adapter called onLeaveApplication.");
        if (zzn.zzcS().zzhJ()) {
            try {
                this.zzCK.onAdLeftApplication();
                return;
            } catch (RemoteException e) {
                zzb.zzd("Could not call onAdLeftApplication.", e);
                return;
            }
        }
        zzb.zzaK("onLeaveApplication must be called on the main UI thread.");
        zza.zzMS.post(new Runnable() {
            public void run() {
                try {
                    zzfk.this.zzCK.onAdLeftApplication();
                } catch (RemoteException e) {
                    zzb.zzd("Could not call onAdLeftApplication.", e);
                }
            }
        });
    }

    public void onPresentScreen(MediationBannerAdapter<?, ?> mediationBannerAdapter) {
        zzb.zzaI("Adapter called onPresentScreen.");
        if (zzn.zzcS().zzhJ()) {
            try {
                this.zzCK.onAdOpened();
                return;
            } catch (RemoteException e) {
                zzb.zzd("Could not call onAdOpened.", e);
                return;
            }
        }
        zzb.zzaK("onPresentScreen must be called on the main UI thread.");
        zza.zzMS.post(new Runnable() {
            public void run() {
                try {
                    zzfk.this.zzCK.onAdOpened();
                } catch (RemoteException e) {
                    zzb.zzd("Could not call onAdOpened.", e);
                }
            }
        });
    }

    public void onPresentScreen(MediationInterstitialAdapter<?, ?> mediationInterstitialAdapter) {
        zzb.zzaI("Adapter called onPresentScreen.");
        if (zzn.zzcS().zzhJ()) {
            try {
                this.zzCK.onAdOpened();
                return;
            } catch (RemoteException e) {
                zzb.zzd("Could not call onAdOpened.", e);
                return;
            }
        }
        zzb.zzaK("onPresentScreen must be called on the main UI thread.");
        zza.zzMS.post(new Runnable() {
            public void run() {
                try {
                    zzfk.this.zzCK.onAdOpened();
                } catch (RemoteException e) {
                    zzb.zzd("Could not call onAdOpened.", e);
                }
            }
        });
    }

    public void onReceivedAd(MediationBannerAdapter<?, ?> mediationBannerAdapter) {
        zzb.zzaI("Adapter called onReceivedAd.");
        if (zzn.zzcS().zzhJ()) {
            try {
                this.zzCK.onAdLoaded();
                return;
            } catch (RemoteException e) {
                zzb.zzd("Could not call onAdLoaded.", e);
                return;
            }
        }
        zzb.zzaK("onReceivedAd must be called on the main UI thread.");
        zza.zzMS.post(new Runnable() {
            public void run() {
                try {
                    zzfk.this.zzCK.onAdLoaded();
                } catch (RemoteException e) {
                    zzb.zzd("Could not call onAdLoaded.", e);
                }
            }
        });
    }

    public void onReceivedAd(MediationInterstitialAdapter<?, ?> mediationInterstitialAdapter) {
        zzb.zzaI("Adapter called onReceivedAd.");
        if (zzn.zzcS().zzhJ()) {
            try {
                this.zzCK.onAdLoaded();
                return;
            } catch (RemoteException e) {
                zzb.zzd("Could not call onAdLoaded.", e);
                return;
            }
        }
        zzb.zzaK("onReceivedAd must be called on the main UI thread.");
        zza.zzMS.post(new Runnable() {
            public void run() {
                try {
                    zzfk.this.zzCK.onAdLoaded();
                } catch (RemoteException e) {
                    zzb.zzd("Could not call onAdLoaded.", e);
                }
            }
        });
    }
}
