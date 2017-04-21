package com.k3mshiro.finalproject.controller.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.k3mshiro.finalproject.R;
import com.k3mshiro.finalproject.model.adapter.ListSongAdapter;
import com.k3mshiro.finalproject.model.manager.MediaManager;

/**
 * Created by k3mshiro on 4/17/17.
 */

public class SongByNameFrg extends Fragment {

    private View rootView;
    private ListView mListView;
    private ListSongAdapter mSongAdapter;
    private MediaManager mediaMgr;

    public SongByNameFrg() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragment_song_by_name, container, false);
        initView();
        initSongs();
        return rootView;
    }

    private void initSongs() {
    }

    private void initView() {
        mediaMgr = new MediaManager(getActivity().getApplicationContext());
        mListView = (ListView) rootView.findViewById(R.id.lv_name);
        mSongAdapter = new ListSongAdapter(mediaMgr.getmListSong(), getActivity());
        mListView.setAdapter(mSongAdapter);
    }
}
