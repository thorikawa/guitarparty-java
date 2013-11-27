package com.polysfactory.lib.guitarparty;

import java.util.List;

import org.fest.assertions.api.Assertions;
import org.junit.Before;
import org.junit.Test;

import com.polysfactory.lib.guitarparty.entity.Artist;
import com.polysfactory.lib.guitarparty.entity.Objects;
import com.polysfactory.lib.guitarparty.entity.Song;

public class GuitarpartyServiceTestCase {

    private GuitarpartyService service;

    @Before
    public void setup() {
        String apiKey = System.getProperty("guitarparty.api.key");
        if (apiKey == null) {
            throw new UnsupportedOperationException(
                    "Please set your Guitarparty API key in guitarparty.api.key property.");
        }
        GuitarpartyClient client = new GuitarpartyClient();
        service = client.getService(apiKey);
    }

    @Test
    public void testGetSong() {
        Objects<Song> songs = service.getSongs("billy joel honesty");
        List<Song> objects = songs.getObjects();
        Assertions.assertThat(objects).hasSize(1);
    }

    @Test
    public void testGetArtists() {
        Objects<Artist> artists = service.getArtists("billy joel");
        List<Artist> objects = artists.getObjects();
        Assertions.assertThat(objects).hasSize(1);
    }
}
