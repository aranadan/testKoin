package com.fox.studio.kointest.module

import com.fox.studio.kointest.presenter.MyPresenter
import com.fox.studio.kointest.repository.HelloRepository
import com.fox.studio.kointest.repository.HelloRepositoryImpl
import org.koin.dsl.module

val appModule = module {

    /*экзмпляр HelloRepository*/
    single<HelloRepository> {HelloRepositoryImpl()}

    /*мы объявляем наш класс MyPresenter как factory для создания нового экземпляра каждый раз, когда он понадобится нашей деятельности. */
    factory { MyPresenter(get()) }
}