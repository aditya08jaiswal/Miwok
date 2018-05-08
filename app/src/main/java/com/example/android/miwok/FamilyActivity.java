package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        // Create a list of words
        ArrayList<Word> words = new ArrayList<com.example.android.miwok.Word>();

        words.add(new com.example.android.miwok.Word("father", "әpә"));
        words.add(new com.example.android.miwok.Word("mother", "әṭa"));
        words.add(new com.example.android.miwok.Word("son", "angsi"));
        words.add(new com.example.android.miwok.Word("daughter", "tune"));
        words.add(new com.example.android.miwok.Word("older brother", "taachi"));
        words.add(new com.example.android.miwok.Word("younger brother", "chalitti"));
        words.add(new com.example.android.miwok.Word("older sister", "teṭe"));
        words.add(new com.example.android.miwok.Word("younger sister", "kolliti"));
        words.add(new com.example.android.miwok.Word("grandmother", "ama"));
        words.add(new com.example.android.miwok.Word("grandfather", "paapa"));

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter adapter = new WordAdapter(this,words);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);
    }
}
