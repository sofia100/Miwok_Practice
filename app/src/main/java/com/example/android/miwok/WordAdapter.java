package com.example.android.miwok;


import android.graphics.Typeface;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.content.Context;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {

    private int cid;
     WordAdapter(Context context, ArrayList<Word> w,int colorId)
    {
        super(context,0,w);
        cid =colorId;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {


    View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        // Get the {@link AndroidFlavor} object located at this position in the list
       Word currentWord = getItem(position);
        //androidflavor=words


        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView nameTextView = (TextView) listItemView.findViewById(R.id.miwok);
        // Get the version name from the current AndroidFlavor object and
        // set this text on the name TextView
        nameTextView.setText(currentWord.getMiwok());
        nameTextView.setTextSize(18);
        nameTextView.setTypeface(Typeface.DEFAULT_BOLD);
        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView numberTextView = (TextView) listItemView.findViewById(R.id.eng);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        numberTextView.setText(currentWord.getEnglish());

        ImageView icon =(ImageView)listItemView.findViewById(R.id.img);



        if (currentWord.hasImg()) {

            icon.setImageResource(currentWord.getId());
            icon.setVisibility(View.VISIBLE);
        }
            else
            icon.setVisibility(View.GONE);


        View textContainer =listItemView.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(),cid);
        textContainer.setBackgroundColor(color);
        return listItemView;
    }
}
