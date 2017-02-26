package org.bubenheimer.dagger.fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.bubenheimer.dagger.R;
import org.bubenheimer.dagger.childfragment.ChildFragment;

import dagger.android.DaggerFragment;


public final class MainFragment extends DaggerFragment {
    @Override
    public void onAttach(final Context context) {
        super.onAttach(context);
    }

    @Override
    public View onCreateView(final LayoutInflater inflater, final ViewGroup container,
                             final Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fragment_main, container, false);

        if (savedInstanceState == null) {
            getChildFragmentManager().beginTransaction().add(R.id.child_fragment_container, new ChildFragment()).commitNow();
        }

        return view;
    }
}
