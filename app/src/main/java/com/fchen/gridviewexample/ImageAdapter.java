package com.fchen.gridviewexample;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

public class ImageAdapter extends BaseAdapter {
    private Context mContext;
    private LayoutInflater mLayoutInflater;

    private Integer[] mImageID = {
            R.drawable.archive,
            R.drawable.delete,
            R.drawable.menu,
            R.drawable.message,
            R.drawable.people
    };

    public ImageAdapter(Context context) {
        mContext = context;
        mLayoutInflater = LayoutInflater.from(mContext);
    }

    @Override
    public int getCount() {
        return mImageID.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        return mLayoutInflater.inflate(R.layout.view_card, viewGroup, false);
    }
}
