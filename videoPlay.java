package com.example.proto.videoplay;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class videoPlay extends Activity {

    VideoView vid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_play);

        vid = (VideoView)findViewById(R.id.video1);

        String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.videoex;
        vid.setVideoURI(Uri.parse(videoPath));
        vid.start();

        MediaController mc = new MediaController(this);
        mc.setMediaPlayer(vid);
        vid.setMediaController(mc);
    }
}
