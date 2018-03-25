package com.example.leonardgomez.uwavefinal.uwavechat;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.support.v4.app.NotificationCompat;
import android.util.Log;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;


public class MyFirebaseMessagingService extends FirebaseMessagingService {
    private static final String TAG = "UWaveChatService";

    @Override
    public void onMessageReceived(RemoteMessage remoteMessage) {
        // Handle data payload of FCM messages.
        Log.d(TAG, "UCS Message Id: " + remoteMessage.getMessageId());
        Log.d(TAG, "UCS Notification Message: " + remoteMessage.getNotification());
        Log.d(TAG, "UCS Data Message: " + remoteMessage.getData());
    }
}
