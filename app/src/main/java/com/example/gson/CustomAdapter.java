package com.example.gson;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by v on 4/27/16.
 */

// implements methods that belongs to base adapter, to get the pre made methods.
public class CustomAdapter extends BaseAdapter {

    // in the video. https://www.youtube.com/watch?v=oZpv6W3Lflo
    // its  List<Response.MovieItem>, but the Api has been changed since. so now its List<Response.MoviesBean>
    // it can be found inside the Response class. therefore (Response.MoviesBean)
    private List<Response.MoviesBean> mMovieitem;
    private Context mContext;
    private LayoutInflater inflater;

    public CustomAdapter( Context mContext, List<Response.MoviesBean> mMovieitem) {
        this.mContext = mContext;
        this.mMovieitem = mMovieitem;
    }

    @Override
    public int getCount() {
        // we changed the return value to the one below.
        return mMovieitem.size();
    }

    @Override
    public Object getItem(int position) {
        return mMovieitem.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // what does this mean?
        LayoutInflater inflater = (LayoutInflater) mContext
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        // why parent?, and why false?
        View rowView = inflater.inflate(R.layout.each_list_item, parent, false);

        // item is a type Response.MoviesBean, wich means we can what exactly??? read more on Gson..

        // Response.MoviesBean -- MoviesBean er inner class i Response.
        Response.MoviesBean item = (Response.MoviesBean) getItem(position);

        ImageView thumbnail = (ImageView) rowView.findViewById(R.id.thumbnail);
        TextView title = (TextView) rowView.findViewById(R.id.title);
        TextView rating = (TextView) rowView.findViewById(R.id.rating);

        // here the magic happens..Here it gets set to the response.
        // her getPosters() er en metode i Response.MoviesBean, og getOriginal er så en methode der der ikke kan sees i classen . men er indbygget som en valgmulighed.
        // eller en methode fra bilioteket..
        String imageUrl = item.getPosters().getOriginal();
        Picasso.with(mContext).load(imageUrl).into(thumbnail);
        title.setText(item.getTitle());
        rating.setText(item.getRatings().getAudience_rating());
        return rowView;
    }
}
