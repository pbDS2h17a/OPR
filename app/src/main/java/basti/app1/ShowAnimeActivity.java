package basti.app1;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.List;

public class ShowAnimeActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_anime);


        AnimeList al = new AnimeList();
        List<String> animeStringList = al.getAnimeStringList();

        ListView listView = findViewById(R.id.list);

        ArrayAdapter<String> itemsAdapter =
                new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,animeStringList);

        listView.setAdapter(itemsAdapter);
    }

}
