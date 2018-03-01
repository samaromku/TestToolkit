package ru.andrey.savchenko.testtoolkit.view.main

import ru.andrey.savchenko.testtoolkit.toolkit.Interactor

/**
 * Created by savchenko on 01.03.18.
 */
interface MainContract {
    interface View:ru.andrey.savchenko.testtoolkit.toolkit.View{
        fun test()
    }

    interface InterActor:ru.andrey.savchenko.testtoolkit.toolkit.Interactor<Presenter>{
        fun attach()
        fun test()
    }

    interface Presenter:ru.andrey.savchenko.testtoolkit.toolkit.Presenter<View>{
        fun test()
    }
}