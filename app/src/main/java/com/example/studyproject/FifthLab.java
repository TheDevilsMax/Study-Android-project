package com.example.studyproject;

import static com.example.studyproject.R.layout.*;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;

public class FifthLab extends AppCompatActivity {

    VideoView VideoPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(activity_fifth_lab);
        VideoPlayer = (VideoView)findViewById(R.id.videoView);
        Uri videoUri= Uri.parse( "android.resource://" +
                getPackageName() + "/" + R.raw.reddead);
        VideoPlayer.setVideoURI(videoUri);
        MediaController mediaController = new MediaController(this);
        VideoPlayer.setMediaController(mediaController);
        mediaController.setMediaPlayer(VideoPlayer);
    }
    public void onStartClick(View view)
    {
        VideoPlayer.start();
    }
    public void onPauseClick(View view)
    {
        VideoPlayer.pause();
    }
    public void onStopClick(View view)
    {
        VideoPlayer.stopPlayback();
        VideoPlayer.resume();
    }
}