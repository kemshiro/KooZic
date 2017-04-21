package com.k3mshiro.finalproject.model.adapter;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.k3mshiro.finalproject.R;
import com.k3mshiro.finalproject.model.object.Song;

import java.util.List;

/**
 * Created by k3mshiro on 4/20/17.
 */

public class ListSongAdapter extends BaseAdapter {

    private static final String TAG = ListSongAdapter.class.getName();
    private List<Song> mListSong;
    private Context mContext;

    public ListSongAdapter(List<Song> mListSong, Context mContext) {
        this.mListSong = mListSong;
        this.mContext = mContext;
    }

    @Override
    public int getCount() {
        return mListSong.size();
    }

    @Override
    public Song getItem(int position) {
        return mListSong.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;

        if (convertView == null) {
            holder = new ViewHolder();
            convertView = View.inflate(mContext, R.layout.layout_item_song, null);

            holder.tvSongName = (TextView) convertView.findViewById(R.id.tv_song_name);
            holder.tvSongArtist = (TextView) convertView.findViewById(R.id.tv_song_artist);
            holder.ivSongArtWork = (ImageView) convertView.findViewById(R.id.iv_song_image);
            holder.ivListLine = (ImageView) convertView.findViewById(R.id.iv_item_viewline);

            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        Song itemSong = mListSong.get(position);
        holder.tvSongName.setText(itemSong.getName());
        holder.tvSongArtist.setText(itemSong.getArtist());
        holder.ivListLine.setBackgroundResource(R.drawable.custom_lv_line);
        try {
            if (itemSong.getArtWork() != null) {
                holder.ivSongArtWork.setImageBitmap(itemSong.getArtWork());
            } else {
                holder.ivSongArtWork.setBackgroundResource(R.mipmap.ic_launcher);
            }
        } catch (Exception e) {
            Log.e(TAG, "ERROR: " + e.getMessage());
        }

        return convertView;
    }

    private class ViewHolder {
        TextView tvSongName;
        TextView tvSongArtist;
        ImageView ivSongArtWork;
        ImageView ivListLine;
    }
}
