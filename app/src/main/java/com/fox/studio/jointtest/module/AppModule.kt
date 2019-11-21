package com.fox.studio.jointtest.module

import com.fox.studio.jointtest.presenter.MyPresenter
import com.fox.studio.jointtest.repository.HelloRepository
import com.fox.studio.jointtest.repository.HelloRepositoryImpl
import org.koin.dsl.module

val appModule = module {

    /*экзмпляр HelloRepository*/
    single<HelloRepository> {HelloRepositoryImpl()}

    /*мы объявляем наш класс MyPresenter как factory для создания нового экземпляра каждый раз, когда он понадобится нашей деятельности. */
    factory { MyPresenter(get()) }
}