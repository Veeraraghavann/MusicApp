package com.example.musicapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class ClassicActivity extends AppCompatActivity implements ListView.OnItemClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.playlist);

        // Create an array of musics.
        ArrayList<Music> musics = new ArrayList<Music>();

        // Adding musics to an array.
        musics.add(new Music("ARR", "Kaadhal Rojave"));
        musics.add(new Music("ARR", "Netru Illatha Matram"));
        musics.add(new Music("ARR", "En Veetu Thotathil"));
        musics.add(new Music("YUVAN", "Dheena- Sollaamal Thottu"));
        musics.add(new Music("YUVAN", "Thulluvadho Ilamai- Idhu Kadhala"));
        musics.add(new Music("ARR", "Aathangara Marame"));
        musics.add(new Music("YUVAN", "Nandha- Mun Paniya"));
        musics.add(new Music("ARR", "Thee Thee Thithikkum Thee"));
        musics.add(new Music("YUVAN", "Mounam Pesiyathe- En Anbae"));
        musics.add(new Music("YUVAN", "Kadhal Konden- Devathaiyai Kanden"));

        // Create an {@link ArrayAdapter}, whose data source is a list of Strings. The
        // adapter knows how to create layouts for each item in the list, using the
        // simple_list_item_1.xml layout resource defined in the Android framework.
        // This list item layout contains a single {@link TextView}, which the adapter will set to
        // display a single word.
        MusicAdapter adapter = new MusicAdapter(this, musics);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // play_list file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link ArrayAdapter} we created above, so that the
        // {@link ListView} will display list items for each word in the list of words.
        // Do this by calling the setAdapter method on the {@link ListView} object and pass in
        // 1 argument, which is the {@link ArrayAdapter} with the variable name itemsAdapter.
        listView.setAdapter(adapter);

        // Set OnClickListener on ListView to identify the item on ListView clicked by user
        // Text on the ListView item clicked is passed on to PlayerActivity
        listView.setOnItemClickListener(this);
    }

    /**
     * Method to identify ListView item clicked and launch PlayerActivity
     */
    public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
        // Get the selected music.
        Music currentMusic = (Music) adapterView.getItemAtPosition(position);

        // Extract strings from Opus object.
        String musicForPlaying = currentMusic.getMusic();
        String composerForPlaying = currentMusic.getNameOfComposer();

        // Sending the name of composer and his music to PlayerActivity.
        Intent opusIntent = new Intent(this, PlayActivity.class);
        opusIntent.putExtra("music", musicForPlaying);
        opusIntent.putExtra("composer", composerForPlaying);
        startActivity(opusIntent);
    }
}
