package com.lewokapps.firebaseonhomepage;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class KonoAdapter extends RecyclerView.Adapter<KonoAdapter.ViewHolder> {

    private List<KonoModel> konoModelList;

    public KonoAdapter(List<KonoModel> konoModelList) {
        this.konoModelList = konoModelList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_layout, viewGroup, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int position) {

        String itemTextBind = konoModelList.get(position).getItemText();
        viewHolder.setData(itemTextBind);

    }

    @Override
    public int getItemCount() {
        return konoModelList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView itemTextView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            itemTextView = itemView.findViewById(R.id.item_text);
        }

        private void setData(String text){

            itemTextView.setText(text);
        }
    }
}
