package com.polysfactory.lib.guitarparty;

import retrofit.http.GET;
import retrofit.http.Query;

import com.polysfactory.lib.guitarparty.entity.Artist;
import com.polysfactory.lib.guitarparty.entity.Objects;
import com.polysfactory.lib.guitarparty.entity.Song;

public interface GuitarpartyService {

    @GET("/v2/songs/")
    Objects<Song> getSongs(@Query("query") String query);

    @GET("/v2/artists/")
    Objects<Artist> getArtists(@Query("query") String query);
}
