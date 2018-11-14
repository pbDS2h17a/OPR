package basti.app1;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pbs2h17awb on 14.11.2018.
 */

public class AnimeList {
    private static AnimeList animeList = null;
    private static List<String> animeStringList = new ArrayList<>();

    protected AnimeList() {
    }

    public List<String> getAnimeStringList() {
        return animeStringList;
    }

    public void add(String s) {
        animeStringList.add(s);
    }

}
