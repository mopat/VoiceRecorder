package com.mopat.patrick.voicerecorder;

/**
 * Created by Patrick on 10.01.2016.
 */
interface PlaybackListener {
    void playback(int bytesread);
}

interface CompletionListener {
    void playbackComplete();
}