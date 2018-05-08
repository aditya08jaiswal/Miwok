package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        // Create a list of words
        ArrayList<com.example.android.miwok.Word> words = new ArrayList<com.example.android.miwok.Word>();

        words.add(new com.example.android.miwok.Word("red", "weṭeṭṭi"));
        words.add(new com.example.android.miwok.Word("green", "chokokki"));
        words.add(new com.example.android.miwok.Word("brown", "ṭakaakki"));
        words.add(new com.example.android.miwok.Word("gray", "ṭopoppi"));
        words.add(new com.example.android.miwok.Word("black", "kululli"));
        words.add(new com.example.android.miwok.Word("white", "kelelli"));
        words.add(new com.example.android.miwok.Word("dusty yellow", "ṭopiisә"));
        words.add(new com.example.android.miwok.Word("mustard yellow", "chiwiiṭә"));

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter adapter = new WordAdapter(this,words);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_listyout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);
    }
}
