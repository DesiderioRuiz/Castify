/*
 * Copyright (C) 2016 Google Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.sample.cast.refplayer.browser;

import com.google.gson.Gson;
import com.google.sample.cast.refplayer.model.Group;
import com.google.sample.cast.refplayer.model.Parent;
import com.google.sample.cast.refplayer.model.Station;
import com.google.sample.cast.refplayer.utils.M3UItem;
import com.google.sample.cast.refplayer.utils.M3UPlaylist;
import com.google.sample.cast.refplayer.utils.MediaItem;
import com.google.sample.cast.refplayer.utils.Utils;

import android.content.Context;
import android.support.v4.content.AsyncTaskLoader;
import android.util.Log;
import android.widget.Toast;

import org.json.JSONObject;

import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class VideoItemLoader extends AsyncTaskLoader<List<MediaItem>> {

    private static final String TAG = "VideoItemLoader";
    private final String mUrl;
    //Variables parse m3u
    private static final String EXT_M3U = "#EXTM3U";
    private static final String EXT_INF = "#EXTINF:";
    private static final String EXT_PLAYLIST_NAME = "#PLAYLIST";
    private static final String EXT_LOGO = "tvg-logo";
    private static final String EXT_URL = "http://";

    public String convertStreamToString(InputStream is) {
        try {
            return new Scanner(is).useDelimiter("\\A").next();
        } catch (NoSuchElementException e) {
            return "";
        }
    }

    public M3UPlaylist parseFile(InputStream inputStream) throws FileNotFoundException {
        M3UPlaylist m3UPlaylist = new M3UPlaylist();
        List<M3UItem> playlistItems = new ArrayList<>();
        String stream = convertStreamToString(inputStream);
        String linesArray[] = stream.split(EXT_INF);
        for (int i = 0; i < linesArray.length; i++) {
            String currLine = linesArray[i];
            if (currLine.contains(EXT_M3U)) {
                //header of file
                if (currLine.contains(EXT_PLAYLIST_NAME)) {
                    String fileParams = currLine.substring(EXT_M3U.length(), currLine.indexOf(EXT_PLAYLIST_NAME));
                    String playListName = currLine.substring(currLine.indexOf(EXT_PLAYLIST_NAME) + EXT_PLAYLIST_NAME.length()).replace(":", "");
                    m3UPlaylist.setPlaylistName(playListName);
                    m3UPlaylist.setPlaylistParams(fileParams);
                } else {
                    m3UPlaylist.setPlaylistName("Noname Playlist");
                    m3UPlaylist.setPlaylistParams("No Params");
                }
            } else {
                M3UItem playlistItem = new M3UItem();
                String[] dataArray = currLine.split(",");
                if (dataArray[0].contains(EXT_LOGO)) {
                    String duration = dataArray[0].substring(0, dataArray[0].indexOf(EXT_LOGO)).replace(":", "").replace("\n", "");
                    String icon = dataArray[0].substring(dataArray[0].indexOf(EXT_LOGO) + EXT_LOGO.length()).replace("=", "").replace("\"", "").replace("\n", "");
                    playlistItem.setItemDuration(duration);
                    playlistItem.setItemIcon(icon);
                } else {
                    String duration = dataArray[0].replace(":", "").replace("\n", "");
                    playlistItem.setItemDuration(duration);
                    playlistItem.setItemIcon("");
                }
                try {
                    String url = dataArray[1].substring(dataArray[1].indexOf(EXT_URL)).replace("\n", "").replace("\r", "");
                    String name = dataArray[1].substring(0, dataArray[1].indexOf(EXT_URL)).replace("\n", "");
                    playlistItem.setItemName(name);
                    playlistItem.setItemUrl(url);
                } catch (Exception fdfd) {
                    Log.e("Google", "Error: " + fdfd.fillInStackTrace());
                }
                playlistItems.add(playlistItem);
            }
        }
        m3UPlaylist.setPlaylistItems(playlistItems);
        return m3UPlaylist;
    }

    public VideoItemLoader(Context context, String url) {
        super(context);
        this.mUrl = url;
    }

    @Override
    public List<MediaItem> loadInBackground() {
        try {
            //return VideoProvider.buildMedia(mUrl);

            Parent mParent = new Gson().fromJson(Utils.json, Parent.class);
            List<MediaItem> mediaList = new ArrayList<>();
            List<Group> results = mParent.getGroups();

            for(Group group : results){
                if (group.getStations()!=null) {
                    for (Station station : group.getStations()) {
                        MediaItem mi = new MediaItem();

                        mi.setTitle(station.getName());
                        mi.setUrl(station.getUrl());
                        mi.addImage(station.getImage());

                        mediaList.add(mi);
                    }
               }

          }

            //return VideoProvider.buildMedia(mUrl);
            return mediaList;
        } catch (Exception e) {
            Log.e(TAG, "Failed to fetch media data", e);
            return null;
        }

    }
    @Override
    protected void onStartLoading() {
        super.onStartLoading();
        forceLoad();
    }

    /**
     * Handles a request to stop the Loader.
     */
    @Override
    protected void onStopLoading() {
        // Attempt to cancel the current load task if possible.
        cancelLoad();
    }

}
