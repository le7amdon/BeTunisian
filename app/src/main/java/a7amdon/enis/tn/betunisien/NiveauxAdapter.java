package a7amdon.enis.tn.betunisien;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;

import java.util.List;

import a7amdon.enis.tn.betunisien.util.Niveau;

/**
 * Created by 7amdon on 20/10/2016.
 */

public class NiveauxAdapter extends RecyclerView.Adapter<NiveauxAdapter.MyViewHolder>{
    public static final int DETAIL_REQUEST = 1;
    private Context mContext;
    private List<Niveau> NiveauxList;


    public NiveauxAdapter(Context mContext, List<Niveau> NiveauxList) {
        this.mContext = mContext;
        this.NiveauxList = NiveauxList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // create a new view

        final View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.level_row, parent, false);



        // set the view's size, margins, paddings and layout parameters
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

// - get element from your dataset at this position
        // - replace the contents of the view with that element

        Niveau niveau = NiveauxList.get(position);
        holder.level_number.setImageResource(niveau.getImage());
        holder.level_number.setTag(holder.level_number.getId(),niveau.getValeur());
        HomeActivity.StatusLevel status = niveau.getStatus();
        switch (status){
            case blocked:
                holder.level_rating.setVisibility(View.INVISIBLE);
                holder.level_locked.setVisibility(View.VISIBLE);
                break;
            case zero:
                holder.level_locked.setVisibility(View.INVISIBLE);
                holder.level_rating.setVisibility(View.VISIBLE);
                holder.level_rating.setRating(0);
                break;
            case one:
                holder.level_locked.setVisibility(View.INVISIBLE);
                holder.level_rating.setVisibility(View.VISIBLE);
                holder.level_rating.setRating(1);
                break;
            case two:
                holder.level_locked.setVisibility(View.INVISIBLE);
                holder.level_rating.setVisibility(View.VISIBLE);
                holder.level_rating.setRating(2);
                break;
        }
        // loading album cover using Glide library
        /////////Glide.with(mContext).load(niveau.getImage()).into(holder.level_number);
    }

    @Override
    public int getItemCount() {
        return NiveauxList.size();
    }


    public class MyViewHolder extends RecyclerView.ViewHolder {
        public RatingBar level_rating;
        public ImageView level_number, level_locked;
        private final Context context;
        public MyViewHolder(View view) {

            super(view);
            context = view.getContext();


            level_rating = (RatingBar) view.findViewById(R.id.level_rating);
            level_rating.setEnabled(false);
            level_number = (ImageView) view.findViewById(R.id.level_number);
            level_locked = (ImageView) view.findViewById(R.id.level_lock);

            view.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(v.getContext(),NiveauxActivity.class);
                    intent.putExtra("level_selected",""+level_number.getTag(level_number.getId()) );
                    v.getContext().startActivity(intent);
                    //mContext.startActivityForResult(intent,DETAIL_REQUEST);
                }
            });
        }
    }
}
