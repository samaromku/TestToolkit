package ru.andrey.savchenko.testtoolkit.view.main

import ru.andrey.savchenko.testtoolkit.toolkit.BasePresenter
import ru.andrey.savchenko.testtoolkit.toolkit.Presenter

/**
 * Created by savchenko on 01.03.18.
 */
class MainPresenter() : BasePresenter<MainContract.View, MainContract.InterActor>(), MainContract.Presenter {

    override val interactorClass: Class<*> = MainInterActor::class.java

    override fun onViewAttached() {
        interactor.attach()
    }

    override fun test(){
        interactor.test()
        Thread(Runnable {
            Thread.sleep(5000)
            view?.test()
        }).start()
    }
}