package com.example.notification

import android.app.Notification
import android.app.NotificationChannel
import android.app.NotificationManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    private lateinit var notifManager: NotificationManager
    private lateinit var notifChanel: NotificationChannel
    private lateinit var notifBuilder: Notification.Builder

    private val channelId = "i.apps.notifications"
    private val channelDesc = "Test Notifikasi"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}