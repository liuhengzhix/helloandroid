package com.lhz.xmllayout;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.MediaController;
import android.widget.Toast;
import android.widget.VideoView;

import java.io.File;

public class VideoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);

        VideoView videoView = findViewById(R.id.video1);
        File file = new File(Environment.getExternalStorageDirectory() + "D:\\Program\\androidStudio\\Application\\HelloAndroid\\xmllayout\\src\\main\\res");
        if (file.exists()) {
            videoView.setVideoPath(file.getAbsolutePath());//指定要播放的视频
        } else {
            Toast.makeText(this, "视频不存在", Toast.LENGTH_SHORT).show();
        }
        //控制视频的播放
        MediaController mediaController = new MediaController(VideoActivity.this);
        videoView.setMediaController(mediaController);//让videoView和mediaController关联
        videoView.requestFocus();//获得焦点
        videoView.start();//开始播放视频
        videoView.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                Toast.makeText(VideoActivity.this, "视频播放完毕", Toast.LENGTH_SHORT).show();
            }
        });
    }
}