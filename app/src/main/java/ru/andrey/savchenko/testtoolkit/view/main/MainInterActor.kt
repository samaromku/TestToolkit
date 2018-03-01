package ru.andrey.savchenko.testtoolkit.view.main

import ru.andrey.savchenko.testtoolkit.toolkit.BaseInteractor

/**
 * Created by savchenko on 01.03.18.
 */
class MainInterActor : BaseInteractor<MainPresenter>(), MainContract.InterActor{

    override val presenterClass: Class<*> = MainPresenter::class.java

    override fun attach() {
        println("attached")
    }

    override fun test(){
        println("test from interactor")
    }

}