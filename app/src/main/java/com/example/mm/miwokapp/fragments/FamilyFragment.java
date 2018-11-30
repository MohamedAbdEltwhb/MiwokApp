package com.example.mm.miwokapp.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.mm.miwokapp.R;
import com.example.mm.miwokapp.data.Data;
import com.example.mm.miwokapp.data.WordAdapter;



/**
 * A simple {@link Fragment} subclass.
 */
public class FamilyFragment extends Fragment {

    private RecyclerView mRecyclerView;
    private WordAdapter mWordAdapter;
    private LinearLayoutManager mLinearLayoutManager;

    public FamilyFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_family, container, false);

        mRecyclerView = view.findViewById(R.id.familyFragment);
        mLinearLayoutManager = new LinearLayoutManager(getContext());
        mRecyclerView.setLayoutManager(mLinearLayoutManager);
        mRecyclerView.setHasFixedSize(true);
        mRecyclerView.setItemAnimator(new DefaultItemAnimator());

        mWordAdapter = new WordAdapter(getContext(), Data.getmFamilyFragmentData());
        mRecyclerView.setAdapter(mWordAdapter);

        return view;
    }

}
