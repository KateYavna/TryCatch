package com.example.trycatch;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Comment commentRonaldo = new Comment("Cristiano", "Ronaldo", "Coca cola is evil", "20th of June");
        Comment commentDavid = new Comment("David", "Beckham", "Coca cola has a lot of sugar", "21th of June");
        ArrayList<Comment> comments = new ArrayList<>();
        comments.add(commentRonaldo);
        comments.add(commentDavid);


        Reaction reactionRonaldo = new Reaction(150, 45, 15);
        Reaction reactionDavid = new Reaction(100, 50, 12);
        ArrayList<Reaction> reactions = new ArrayList<>();
        reactions.add(reactionRonaldo);
        reactions.add(reactionDavid);





        for (int i = 0; i <= reactions.size() - 1; i++) {
            try {

                String authorName = ((Comment) comments.get(i)).getAuthorName();
                Log.d("MyLog", authorName);

            } catch (NullPointerException exception) {
                Log.d("MyLog", "we don't now the name ");
            }
            try {

                String authorLastName = ((Comment) comments.get(i)).getAuthorLastName();
                Log.d("MyLog", authorLastName);

            } catch (NullPointerException exception) {
                Log.d("MyLog", "we don't now the lastname ");
            }
            try {

                String text = ((Comment) comments.get(i)).getText();
                Log.d("MyLog", text);

            } catch (NullPointerException exception) {
                Log.d("MyLog", " we haven't a text ");
            }
            try {

                String date = ((Comment) comments.get(i)).getDate();
                Log.d("MyLog", date);

            } catch (NullPointerException exception) {
                Log.d("MyLog", "we haven't a date ");
            }

            int thumbsUp = ((Reaction) reactions.get(i)).getThumbsUp();
            int oks = ((Reaction) reactions.get(i)).getOks();
            int hearts = ((Reaction) reactions.get(i)).getHearts();
            int sumOfReactions = thumbsUp + oks + hearts;
            Log.d("MyLog",  " got " + sumOfReactions + " positive reactions");
        }
    }
}