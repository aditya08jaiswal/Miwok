package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        // Create a list of words
        ArrayList<com.example.android.miwok.Word> words = new ArrayList<com.example.android.miwok.Word>();

        words.add(new com.example.android.miwok.Word("one", "lutti"));
        words.add(new com.example.android.miwok.Word("two", "otiiko"));
        words.add(new com.example.android.miwok.Word("three", "tolookosu"));
        words.add(new com.example.android.miwok.Word("four", "oyyisa"));
        words.add(new com.example.android.miwok.Word("five", "massokka"));
        words.add(new com.example.android.miwok.Word("six", "temmokka"));
        words.add(new com.example.android.miwok.Word("seven", "kenekaku"));
        words.add(new com.example.android.miwok.Word("eight", "kawinta"));
        words.add(new com.example.android.miwok.Word("nine", "wo’e"));
        words.add(new com.example.android.miwok.Word("ten", "na’aacha"));

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
