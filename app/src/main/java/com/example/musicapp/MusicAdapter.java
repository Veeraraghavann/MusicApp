package com.example.musicapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class MusicAdapter extends ArrayAdapter<Music> {

    // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
    // the second argument is used when the ArrayAdapter is populating a single TextView.
    // Because this is a custom adapter for two TextViews, the adapter is not
    // going to use this second argument, so it can be any value. Here, we used 0.
    public MusicAdapter (Context context, ArrayList<Music> musics) {
        super(context, 0, musics);
    }

    /**
     * Provides a view for an AdapterView (ListView, GridView, etc.)
     *
     * @param position The position in the list of data that should be displayed in the
     *                 list item view.
     * @param convertView The recycled view to populate.
     * @param parent The parent ViewGroup that is used for inflation.
     * @return The View for the position in the AdapterView.
     */
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }


        Music currentWord = (Music) getItem(position);

        // Find the TextView in the list_item.xml layout with the ID music_text_view
        TextView MusicTextView = (TextView) listItemView.findViewById(R.id.music_text_view);
        // set this text on the name TextView
        MusicTextView.setText(currentWord.getMusic());

        // Find the TextView in the list_item.xml layout with the ID composer_text_view
        TextView composerTextView = (TextView) listItemView.findViewById(R.id.composer_text_view);

        // set this text on the name TextView
        composerTextView.setText(currentWord.getNameOfComposer());

        // Return the whole list item layout (containing 2 TextViews)
        // so that it can be shown in the ListView
        return listItemView;
    }
}


