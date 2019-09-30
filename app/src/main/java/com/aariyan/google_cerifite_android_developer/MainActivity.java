package com.aariyan.google_cerifite_android_developer;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    //Constant Variable :

    //Notification Channel ID :
    private String CHANNEL_ID = "";
    //Notification Title :
    private String contentTitle = "Basic Notification";
    //Notification Description :
    private String contentText = "Simple Description of Notification";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Basic Notification  :
        createBasicNotification();
    }

    //Basic Notification :
    private void createBasicNotification() {

        //Constructor :
        NotificationCompat.Builder notificationBuilder = new NotificationCompat.Builder(this, CHANNEL_ID)
                .setSmallIcon(R.drawable.notification)
                .setContentTitle(contentTitle)
                .setContentText(contentText)
                .setPriority(NotificationCompat.PRIORITY_DEFAULT);

    }
}
