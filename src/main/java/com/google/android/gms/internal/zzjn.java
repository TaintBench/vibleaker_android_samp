package com.google.android.gms.internal;

import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;

abstract class zzjn {
    private final WeakReference<View> zzNw;

    public zzjn(View view) {
        this.zzNw = new WeakReference(view);
    }

    public final void detach() {
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver != null) {
            zzb(viewTreeObserver);
        }
    }

    /* access modifiers changed from: protected */
    public ViewTreeObserver getViewTreeObserver() {
        View view = (View) this.zzNw.get();
        if (view == null) {
            return null;
        }
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        return (viewTreeObserver == null || !viewTreeObserver.isAlive()) ? null : viewTreeObserver;
    }

    public abstract void zza(ViewTreeObserver viewTreeObserver);

    public abstract void zzb(ViewTreeObserver viewTreeObserver);

    public final void zzhL() {
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver != null) {
            zza(viewTreeObserver);
        }
    }
}
