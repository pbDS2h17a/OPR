package basti.app1;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class AddAnimeActivity extends Activity {

        public AnimeList al = new AnimeList();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_anime);

        Button buttonAdd = findViewById(R.id.addButton);

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                EditText text = findViewById(R.id.input);
                RadioButton radioFilm = findViewById(R.id.radioButtonFilm);
                String checked = "";

                if(radioFilm.isChecked()) {
                    checked = "Film";
                } else {
                    checked = "Serie";
                }

                Anime anime = new Anime(text.getText().toString(),checked);
                al.add(anime.toString());
                text.setText("");
            }
        });
    }




}
