package com.example.musicapp;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class SongAdapter extends ArrayAdapter<Song> {

    public SongAdapter(@NonNull Context context, @NonNull List<Song> songs) {
        super(context, 0, songs); // Gọi constructor của ArrayAdapter
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_song, parent, false);
        }

        // Lấy bài hát hiện tại
        Song song = getItem(position);

        // Liên kết giao diện với dữ liệu
        ImageView songImage = convertView.findViewById(R.id.song_image);
        TextView songTitle = convertView.findViewById(R.id.song_title);
        TextView songArtist = convertView.findViewById(R.id.song_artist);
        ImageView favoriteIcon = convertView.findViewById(R.id.favorite_icon);

        // Gắn dữ liệu
        songImage.setImageResource(song.getImageResId());
        songTitle.setText(song.getTitle());
        songArtist.setText(song.getArtist());

        // Gắn sự kiện cho hình trái tim
        favoriteIcon.setOnClickListener(v -> {
            // Thực hiện logic yêu thích (ví dụ thay đổi màu sắc hoặc trạng thái)
            favoriteIcon.setImageResource(R.drawable.ic_heart_full); // Thay bằng hình ảnh "đã yêu thích"
        });

        return convertView;
    }
}
