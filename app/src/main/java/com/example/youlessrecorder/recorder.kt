package com.example.youlessrecorder

import android.app.Service
import android.content.Intent
import android.os.IBinder

import kotlinx.serialization.*
import kotlinx.serialization.json.*
import java.net.URL


class recorder : Service() {

    @Serializable
    data class Base(val cnt: String?, val pwr: Int, val lvl: Int, val dev: String?, val det: String?, val con: String?, val sts: String?, val cs0: String?, val ps0: Int?, val raw: Int?)
    override fun onBind(intent: Intent): IBinder? {
        return null
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        val result = URL("http://192.168.2.14/a?f=j")
        val obj = Json.parse(Base.serializer(),result.readText())
        return super.onStartCommand(intent, flags, startId)
    }

    override fun onDestroy() {
        super.onDestroy()
    }

}
