package com.mvp.mvp_login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.mvp.mvp_login.presenter.IPresenter
import com.mvp.mvp_login.presenter.Presenter
import com.mvp.mvp_login.view.IView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var presenter: IPresenter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        login.setOnClickListener {
            presenter.onLogin(email.text.toString(), password.text.toString())
        }

        presenter = Presenter(object : IView {
            override fun onLoginSuccess(msg: String) {
                Toast.makeText(this@MainActivity, msg, Toast.LENGTH_LONG).show()
            }
        })


    }
}