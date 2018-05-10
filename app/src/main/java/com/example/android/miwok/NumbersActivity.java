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

        words.add(new com.example.android.miwok.Word("one", "lutti", R.drawable.number_one));
        words.add(new com.example.android.miwok.Word("two", "otiiko", R.drawable.number_two));
        words.add(new com.example.android.miwok.Word("three", "tolookosu", R.drawable.number_three));
        words.add(new com.example.android.miwok.Word("four", "oyyisa", R.drawable.number_four));
        words.add(new com.example.android.miwok.Word("five", "massokka", R.drawable.number_five));
        words.add(new com.example.android.miwok.Word("six", "temmokka", R.drawable.number_six));
        words.add(new com.example.android.miwok.Word("seven", "kenekaku", R.drawable.number_seven));
        words.add(new com.example.android.miwok.Word("eight", "kawinta", R.drawable.number_eight));
        words.add(new com.example.android.miwok.Word("nine", "wo’e", R.drawable.number_nine));
        words.add(new com.example.android.miwok.Word("ten", "na’aacha", R.drawable.number_ten));

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter adapter = new WordAdapter(this, words, R.color.category_numbers);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);
    }
}
