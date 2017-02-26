package org.bubenheimer.dagger.childfragment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.bubenheimer.dagger.R;

import dagger.android.DaggerFragment;


public final class ChildFragment extends DaggerFragment {
    @Override
    public void onAttach(final Context context) {
        super.onAttach(context);
    }

    @Override
    public View onCreateView(final LayoutInflater inflater, final ViewGroup container,
                             final Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_child, container, false);
    }
}
