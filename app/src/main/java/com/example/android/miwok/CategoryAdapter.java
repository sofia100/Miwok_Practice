package com.example.android.miwok;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class CategoryAdapter extends FragmentPagerAdapter {
    private Context context;
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new NumberFragment();
        } else if (position == 1) {
            return new FamilyFragment();
        } else if (position == 2) {
            return new ColorFragment();
        } else {
            return new PhraseFragment();
        }
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return context.getString(R.string.category_numbers) ;
        } else if (position == 1) {
            return context.getString(R.string.category_family) ;
        } else if (position == 2) {
            return context.getString(R.string.category_colors) ;
        } else {
            return context.getString(R.string.category_phrases);
        }
    }

    public CategoryAdapter(Context c,FragmentManager fm)
    {

        super(fm);

        context=c;
    }

    @Override
    public int getCount() {
        return 4;
    }
}
