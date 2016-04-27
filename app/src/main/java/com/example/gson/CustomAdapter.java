package com.example.gson;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.List;

/**
 * Created by v on 4/27/16.
 */

// implements methods that belongs to base adapter.
public class CustomAdapter extends BaseAdapter {

    // in the video. https://www.youtube.com/watch?v=oZpv6W3Lflo
    // its  List<Response.MovieItem>, but the Api has been changed since. so now its List<Response.MoviesBean>
    // it can be found inside the Response class. therefore (Response.MoviesBean)
    private List<Response.MoviesBean> mMoovieitem;
    private Context mContext;
    private LayoutInflater inflater;



    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return null;
    }
}
