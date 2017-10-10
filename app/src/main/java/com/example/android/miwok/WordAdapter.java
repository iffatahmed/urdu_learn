package com.example.android.miwok;


import android.content.Context;
import android.media.Image;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by iffat on 10/6/17.
 */

public class WordAdapter extends ArrayAdapter<Word> {

    private int mColorResourceId;
    public WordAdapter(Context context, ArrayList<Word> pWords, int colorResourceId) {
        super(context,0, pWords);
        mColorResourceId=colorResourceId;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;

        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        Word local_word = getItem(position);
        ImageView imgView = (ImageView) listItemView.findViewById(R.id.imgView);

        if(local_word.hasImage()){
            imgView.setImageResource(local_word.getImgResourceId());
            imgView.setVisibility(View.VISIBLE);
        }
        else{
            imgView.setVisibility(View.GONE);
        }


        TextView urduTextView = (TextView) listItemView.findViewById(R.id.urduView);
        urduTextView.setText(local_word.getUrduTranslation());
        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.defaultView);
        defaultTextView.setText(local_word.getDefaultTranslation());


        // Set the background color of the layout container

        View textContainer = listItemView.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(),mColorResourceId);
        textContainer.setBackgroundColor(color);


        return listItemView;
    }
}
