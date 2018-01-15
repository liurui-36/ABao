package com.erge.abao.activity

import android.os.Bundle
import com.erge.abao.R
import com.erge.abao.base.BaseActivity
import com.erge.mylibrary.utils.RxActivityTool

class WelcomeActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)
    }

    override fun onResume() {
        super.onResume()
        RxActivityTool.skipActivityAndFinish(this, LoginActivity::class.java)
    }
}
