package com.example.slyusarevflowers;

import android.os.Build;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class FlowerAdapter extends RecyclerView.Adapter<FlowerAdapter.ViewHolder> {
    private List<Flowers> posts;

    FlowerAdapter(List<Flowers> posts) {
        this.posts = posts;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.flowers_sp, parent,
                false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Flowers post = posts.get(position);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            holder.postTextView.setText(Html.fromHtml(post.getName(), Html
                    .FROM_HTML_MODE_LEGACY));
        } else {
            holder.postTextView.setText(Html.fromHtml(post.getName()));
        }
    }

    @Override
    public int getItemCount() {
        if (posts == null)
            return 0;
        return posts.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        TextView postTextView;

        ViewHolder(View itemView) {
            super(itemView);
            postTextView =  itemView.findViewById(R.id.textView_flower_post);
        }
    }
}