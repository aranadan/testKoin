package com.fox.studio.jointtest

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.fox.studio.jointtest.presenter.MyPresenter
import kotlinx.android.synthetic.main.activity_main.*
import org.koin.android.ext.android.inject

class MainActivity : AppCompatActivity() {
    private val myFirstPresenter: MyPresenter by inject()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView1.text = myFirstPresenter.sayHello()
    }
}
