package ru.andrey.savchenko.testtoolkit.view.main

import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import ru.andrey.savchenko.testtoolkit.R
import ru.andrey.savchenko.testtoolkit.toolkit.BaseActivity

class MainActivity : BaseActivity<MainContract.View, MainContract.Presenter>(), MainContract.View {

    override val presenterClass: Class<*> = MainPresenter::class.java

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnTest.setOnClickListener {
            presenter.test()
        }
    }

    override fun test() {
        println("test from activity")
    }
}
