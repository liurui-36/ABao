package com.erge.abao.activity

import android.os.Bundle
import com.erge.abao.R
import com.erge.abao.base.BaseActivity
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        float_btn.bringToFront()
    }
}
