package com.midtrans.sdk.uikit.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.midtrans.sdk.uikit.R;

/**
 * Created by Ankit on 12/01/15.
 * Deprecated, please refer to {@link com.midtrans.sdk.uikit.views.indomaret.payment.IndomaretPaymentActivity}
 */
@Deprecated
public class InstructionIndomaretFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle
            savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_instruction_indomaret, container, false);
        return view;
    }
}
