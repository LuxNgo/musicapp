package com.example.musicapp;
import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Dữ liệu mẫu
        ArrayList<Song> songs = new ArrayList<>();
        songs.add(new Song("Bài hát 1", "Nghệ sĩ 1", R.drawable.ic_music_note));
        songs.add(new Song("Bài hát 2", "Nghệ sĩ 2", R.drawable.ic_music_note));
        songs.add(new Song("Bài hát 3", "Nghệ sĩ 3", R.drawable.ic_music_note));

        // Áp dụng adapter cho ListView
        ListView listView = findViewById(R.id.songListView); // Áp dụng với ListView1
        SongAdapter adapter = new SongAdapter(this, songs);
        listView.setAdapter(adapter);

    }
}
