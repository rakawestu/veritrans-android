package com.midtrans.sdk.corekit.core;

/**
 * Created by ziahaqi on 11/4/16.
 */

public class UIKitCustomSetting {

    private boolean showPaymentStatus = true;
    private boolean saveCardChecked = false;

    public boolean isShowPaymentStatus() {
        return showPaymentStatus;
    }

    public void setShowPaymentStatus(boolean showPaymentStatus) {
        this.showPaymentStatus = showPaymentStatus;
    }

    public boolean isSaveCardChecked() {
        return saveCardChecked;
    }

    public void setSaveCardChecked(boolean saveCardChecked) {
        this.saveCardChecked = saveCardChecked;
    }
}
