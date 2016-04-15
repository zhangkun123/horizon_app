package com.laioffer.horizon;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class NewsAdapter extends BaseAdapter {

    Context context;
    List<News> newsData;

    public NewsAdapter(Context context) {
        this.context = context;
        newsData = DataService.getRestaurantData();
    }

    @Override
    public int getCount() {
        return newsData.size();
    }

    @Override
    public News getItem(int position) {
        return newsData.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            LayoutInflater inflater =
                    (LayoutInflater) context.getSystemService(
                            Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.activity_news_item,
                    parent, false);
        }

        TextView newsTitle = (TextView) convertView.findViewById(
                R.id.news_title);
        TextView newsSnippet = (TextView) convertView.findViewById(
                R.id.news_snippet);
        TextView isVisited = (TextView) convertView.findViewById(
                R.id.is_visited);

        News n = newsData.get(position);
        newsTitle.setText(n.getTitle());
        newsSnippet.setText(n.getSnippet());
        isVisited.setText(n.getIsVisited()?"":"\u25CF");

        return convertView;
    }

}