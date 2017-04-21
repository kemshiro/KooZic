package com.k3mshiro.finalproject.model.object;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.MediaMetadataRetriever;

/**
 * Created by k3mshiro on 4/20/17.
 */

public class Song {
    private String name, path, album, artist;
    private int duration;
    private Bitmap artWork;

    public Song(String name, String path, String album, String artist, int duration) {
        this.name = name;
        this.path = path;
        this.album = album;
        this.artist = artist;
        this.duration = duration;
    }

    public Bitmap getArtWork() {
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        mediaMetadataRetriever.setDataSource(path);
        byte[] data = mediaMetadataRetriever.getEmbeddedPicture();
        if (data != null) {
            artWork = BitmapFactory.decodeByteArray(data, 0, data.length);
        } else {
            artWork = null;
        }
        return artWork;
    }

    public String getName() {
        return name;
    }

    public String getPath() {
        return path;
    }

    public String getAlbum() {
        return album;
    }

    public String getArtist() {
        return artist;
    }

    public int getDuration() {
        return duration;
    }

    @Override
    public String toString() {
        return "Name: " + name +
                "\nPath: " + path +
                "\nAlbum: " + album +
                "\nArtist: " + artist +
                "\nDuration: " + duration;
    }


}
