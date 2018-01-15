package com.erge.abao

import android.app.Application
import com.erge.mylibrary.MyLibrary

/**
 * Created by Administrator on 2018/1/15.
 */
class MyApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        MyLibrary.init(this, true)
    }
}