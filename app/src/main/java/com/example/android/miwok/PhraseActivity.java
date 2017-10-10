package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;


import java.util.ArrayList;

public class PhraseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        // Create a list of words
        ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("Where are you going?", "آپ کہاں جا رہے ہیں؟"));
        words.add(new Word("What is your name?", "تمہارا نام کیا ہے؟" ));
        words.add(new Word("My name is...",  "میرا نام ہے..." ));
        words.add(new Word("How are you feeling?", "آپ کیسا محسوس کر رہے ہیں؟" ));
        words.add(new Word("I’m feeling good.", "میں اچھا محسوس کر رہا ہوں." ));
        words.add(new Word("Are you coming?", "کیا آپ آ رہے ہو؟" ));
        words.add(new Word("I’m coming.", "جی ہاں، میں آ رہا ہوں." ));
        words.add(new Word("I’m coming.", "میں آرہا ہوں." ));
        words.add(new Word("Let’s go.", "چلو." ));
        words.add(new Word("Come here.", "ادھر آو."));

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter adapter = new WordAdapter(this, words,R.color.category_phrases);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_listyout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);

    }
}
