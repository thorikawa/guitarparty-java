package com.polysfactory.lib.guitarparty;

import java.util.List;

import org.fest.assertions.api.Assertions;
import org.junit.Before;
import org.junit.Test;

import retrofit.RestAdapter;

import com.google.mockwebserver.Dispatcher;
import com.google.mockwebserver.MockResponse;
import com.google.mockwebserver.MockWebServer;
import com.google.mockwebserver.RecordedRequest;
import com.polysfactory.lib.guitarparty.entity.Artist;
import com.polysfactory.lib.guitarparty.entity.Objects;
import com.polysfactory.lib.guitarparty.entity.Song;

public class GuitarpartyServiceTestCase {

    private GuitarpartyService service;

    @Before
    public void setup() throws Exception {
        MockWebServer server = new MockWebServer();
        server.setDispatcher(new Dispatcher() {
            @Override
            public MockResponse dispatch(RecordedRequest req) throws InterruptedException {
                String path = req.getPath();
                if (path.startsWith("/v2/songs/")) {
                    String s = "{\"objects\": [{\"authors\": [{\"name\": \"Billy Joel\", \"types\": [\"cover\", \"melody\", \"lyrics\"], \"uri\": \"/v2/artists/574/\"}], \"body\": \"body\", \"body_chords_html\": \"<html>test</html>\", \"body_stripped\": \"body\", \"chords\": [{\"code\": \"x13331\", \"image_url\": \"http://chords.guitarparty.com/chord-images/guitar_Bb_x13331.png\", \"instrument\": {\"name\": \"Guitar\", \"safe_name\": \"guitar\", \"tuning\": \"EADGBE\"}, \"name\": \"Bb\", \"uri\": \"/v2/chords/25877/\"}, {\"code\": \"xxx321\", \"image_url\": \"http://chords.guitarparty.com/chord-images/guitar_Bbm_xxx321.png\", \"instrument\": {\"name\": \"Guitar\", \"safe_name\": \"guitar\", \"tuning\": \"EADGBE\"}, \"name\": \"Bbm\", \"uri\": \"/v2/chords/6915/\"}, {\"code\": \"213x2x\", \"image_url\": \"http://chords.guitarparty.com/chord-images/guitar_Gbmaj7_213x2x.png\", \"instrument\": {\"name\": \"Guitar\", \"safe_name\": \"guitar\", \"tuning\": \"EADGBE\"}, \"name\": \"Gbmaj7\", \"uri\": \"/v2/chords/9050/\"}, {\"code\": \"131211\", \"image_url\": \"http://chords.guitarparty.com/chord-images/guitar_F7_131211.png\", \"instrument\": {\"name\": \"Guitar\", \"safe_name\": \"guitar\", \"tuning\": \"EADGBE\"}, \"name\": \"F7\", \"uri\": \"/v2/chords/28981/\"}, {\"code\": \"x43121_3\", \"image_url\": \"http://chords.guitarparty.com/chord-images/guitar_Eb_x43121_3.png\", \"instrument\": {\"name\": \"Guitar\", \"safe_name\": \"guitar\", \"tuning\": \"EADGBE\"}, \"name\": \"Eb\", \"uri\": \"/v2/chords/10190/\"}, {\"code\": \"133211\", \"image_url\": \"http://chords.guitarparty.com/chord-images/guitar_F_133211.png\", \"instrument\": {\"name\": \"Guitar\", \"safe_name\": \"guitar\", \"tuning\": \"EADGBE\"}, \"name\": \"F\", \"uri\": \"/v2/chords/5212/\"}, {\"code\": \"xxo211\", \"image_url\": \"http://chords.guitarparty.com/chord-images/guitar_Dm7_xxo211.png\", \"instrument\": {\"name\": \"Guitar\", \"safe_name\": \"guitar\", \"tuning\": \"EADGBE\"}, \"name\": \"Dm7\", \"uri\": \"/v2/chords/28625/\"}, {\"code\": \"355333\", \"image_url\": \"http://chords.guitarparty.com/chord-images/guitar_Gm_355333.png\", \"instrument\": {\"name\": \"Guitar\", \"safe_name\": \"guitar\", \"tuning\": \"EADGBE\"}, \"name\": \"Gm\", \"uri\": \"/v2/chords/18575/\"}, {\"code\": \"xo221o\", \"image_url\": \"http://chords.guitarparty.com/chord-images/guitar_Am_xo221o.png\", \"instrument\": {\"name\": \"Guitar\", \"safe_name\": \"guitar\", \"tuning\": \"EADGBE\"}, \"name\": \"Am\", \"uri\": \"/v2/chords/46345/\"}, {\"code\": \"x35343\", \"image_url\": \"http://chords.guitarparty.com/chord-images/guitar_Cm7_x35343.png\", \"instrument\": {\"name\": \"Guitar\", \"safe_name\": \"guitar\", \"tuning\": \"EADGBE\"}, \"name\": \"Cm7\", \"uri\": \"/v2/chords/46910/\"}, {\"code\": \"x32o1o\", \"image_url\": \"http://chords.guitarparty.com/chord-images/guitar_C_x32o1o.png\", \"instrument\": {\"name\": \"Guitar\", \"safe_name\": \"guitar\", \"tuning\": \"EADGBE\"}, \"name\": \"C\", \"uri\": \"/v2/chords/44351/\"}, {\"code\": \"xxo232\", \"image_url\": \"http://chords.guitarparty.com/chord-images/guitar_D_xxo232.png\", \"instrument\": {\"name\": \"Guitar\", \"safe_name\": \"guitar\", \"tuning\": \"EADGBE\"}, \"name\": \"D\", \"uri\": \"/v2/chords/37627/\"}, {\"code\": \"xo222o\", \"image_url\": \"http://chords.guitarparty.com/chord-images/guitar_A_xo222o.png\", \"instrument\": {\"name\": \"Guitar\", \"safe_name\": \"guitar\", \"tuning\": \"EADGBE\"}, \"name\": \"A\", \"uri\": \"/v2/chords/14373/\"}, {\"code\": \"xx1o3x\", \"image_url\": \"http://chords.guitarparty.com/chord-images/guitar_Ebmaj7_xx1o3x.png\", \"instrument\": {\"name\": \"Guitar\", \"safe_name\": \"guitar\", \"tuning\": \"EADGBE\"}, \"name\": \"Ebmaj7\", \"uri\": \"/v2/chords/13118/\"}, {\"code\": \"353333\", \"image_url\": \"http://chords.guitarparty.com/chord-images/guitar_Gm7_353333.png\", \"instrument\": {\"name\": \"Guitar\", \"safe_name\": \"guitar\", \"tuning\": \"EADGBE\"}, \"name\": \"Gm7\", \"uri\": \"/v2/chords/56774/\"}, {\"code\": \"none\", \"image_url\": \"http://chords.guitarparty.com/chord-images/guitar_Nochord_none.png\", \"instrument\": {\"name\": \"Guitar\", \"safe_name\": \"guitar\", \"tuning\": \"EADGBE\"}, \"name\": \"F9sus: not exist\", \"uri\": \"/v2/chords/65025/\"}, {\"code\": \"x323x3\", \"image_url\": \"http://chords.guitarparty.com/chord-images/guitar_C7_x323x3.png\", \"instrument\": {\"name\": \"Guitar\", \"safe_name\": \"guitar\", \"tuning\": \"EADGBE\"}, \"name\": \"C7\", \"uri\": \"/v2/chords/1914/\"}, {\"code\": \"xxo231\", \"image_url\": \"http://chords.guitarparty.com/chord-images/guitar_Dm_xxo231.png\", \"instrument\": {\"name\": \"Guitar\", \"safe_name\": \"guitar\", \"tuning\": \"EADGBE\"}, \"name\": \"Dm\", \"uri\": \"/v2/chords/10429/\"}, {\"code\": \"xo2o2o\", \"image_url\": \"http://chords.guitarparty.com/chord-images/guitar_A7_xo2o2o.png\", \"instrument\": {\"name\": \"Guitar\", \"safe_name\": \"guitar\", \"tuning\": \"EADGBE\"}, \"name\": \"A7\", \"uri\": \"/v2/chords/52601/\"}, {\"code\": \"xxo212\", \"image_url\": \"http://chords.guitarparty.com/chord-images/guitar_D7_xxo212.png\", \"instrument\": {\"name\": \"Guitar\", \"safe_name\": \"guitar\", \"tuning\": \"EADGBE\"}, \"name\": \"D7\", \"uri\": \"/v2/chords/20247/\"}, {\"code\": \"xx1322\", \"image_url\": \"http://chords.guitarparty.com/chord-images/guitar_Ebm7_xx1322.png\", \"instrument\": {\"name\": \"Guitar\", \"safe_name\": \"guitar\", \"tuning\": \"EADGBE\"}, \"name\": \"Ebm7\", \"uri\": \"/v2/chords/20221/\"}, {\"code\": \"1ox235\", \"image_url\": \"http://chords.guitarparty.com/chord-images/guitar_F6_1ox235.png\", \"instrument\": {\"name\": \"Guitar\", \"safe_name\": \"guitar\", \"tuning\": \"EADGBE\"}, \"name\": \"F6\", \"uri\": \"/v2/chords/5797/\"}], \"id\": 1198, \"permalink\": \"http://www.guitarparty.com/song/honesty/\", \"tags\": [], \"title\": \"Honesty\", \"uri\": \"/v2/songs/1198/\"}], \"objects_count\": 1}";
                    return new MockResponse().setBody(s);
                } else if (path.startsWith("/v2/artists/")) {
                    String s = "{\"objects\": [{\"bio\": \"William Martin <a href=\\\"http://www.billyjoel.com/\\\" rel=\\\"nofollow\\\">&quot;Billy&quot; Joel</a> was born on May 9, 1949, in Bronx, New York. He is a singer, pianist, and songwriter.  Joel recorded many popular hit songs and albums from 1971 to his retirement from recording pop music in 1993. He is one of the very few rock or even pop artists to have Top 10 hits in the '70s, '80s, and '90s. A six-time Grammy Award winner, he has sold in excess of 100 million records worldwide and is the sixth best selling artist in the United States, according to the RIAA.\", \"name\": \"Billy Joel\", \"slug\": \"billy-joel\", \"uri\": \"/v2/artists/574/\"}], \"objects_count\": 1}";
                    return new MockResponse().setBody(s);
                }
                return null;
            }
        });
        server.play();
        RestAdapter restAdapter = new RestAdapter.Builder().setServer(server.getUrl("/").toString()).build();
        service = restAdapter.create(GuitarpartyService.class);
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
