package com.example.mm.miwokapp.data;

import android.content.Context;
import android.media.MediaPlayer;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.mm.miwokapp.R;

import java.util.List;

public class WordAdapter extends RecyclerView.Adapter<WordAdapter.ViewHolder>{

    private Context mContext;
    private List<Word> mWordList;

    public WordAdapter(Context mContext, List<Word> mWordList) {
        this.mContext = mContext;
        this.mWordList = mWordList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Word currentWord = mWordList.get(position);

        holder.miwokTextView.setText(currentWord.getmMiwokTranslation());
        holder.defaultTextView.setText(currentWord.getmDefaultTranslation());

        if (currentWord.hasImage()){
            holder.imageView.setImageResource(currentWord.getImageResource());
            holder.imageView.setVisibility(View.VISIBLE);
        }
        else {
            holder.imageView.setVisibility(View.GONE);
        }
    }

    @Override
    public int getItemCount() {
        return mWordList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{


        private MediaPlayer mediaPlayer;
        private TextView miwokTextView, defaultTextView;
        private ImageView imageView;

        private MediaPlayer.OnCompletionListener mCompletionListener = new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {

            }
        };

        ViewHolder(View itemView) {
            super(itemView);
            miwokTextView = itemView.findViewById(R.id.miwok_text_view);
            defaultTextView = itemView.findViewById(R.id.default_text_view);
            imageView = itemView.findViewById(R.id.numper_image);

            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            int position = getAdapterPosition();

            releaseMediaPlayer();

            Word word = mWordList.get(position);
            mediaPlayer = MediaPlayer.create(mContext, word.getAudioResourceId());
            mediaPlayer.start();

            mediaPlayer.setOnCompletionListener(mCompletionListener);
        }

        private void releaseMediaPlayer() {
            if (mediaPlayer != null) {
                mediaPlayer.release();

                mediaPlayer = null;
            }
        }
    }

}
