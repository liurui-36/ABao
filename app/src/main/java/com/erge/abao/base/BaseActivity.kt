package com.erge.abao.base

import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.app.AppCompatActivity
import com.erge.mylibrary.utils.RxActivityTool

/**
 * Created by Administrator on 2018/1/15.
 */
open class BaseActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        try {
            RxActivityTool.addActivity(this)
        } catch (e: Exception) {
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        try {
            RxActivityTool.removeActivity(this)
        } catch (e: Exception) {
        }
    }
}