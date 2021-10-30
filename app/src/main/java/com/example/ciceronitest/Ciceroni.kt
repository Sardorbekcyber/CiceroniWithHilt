package com.example.ciceronitest

import com.github.terrakok.cicerone.NavigatorHolder
import com.github.terrakok.cicerone.Router
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
object Ciceroni {

    @Singleton
    @Provides
    fun provideApplication(): TestApplication = TestApplication.INSTANCE

    @Singleton
    @Provides
    fun provideNavigatorHolder(application: TestApplication): NavigatorHolder =
        application.navigatorHolder

    @Singleton
    @Provides
    fun provideRouter(application: TestApplication): Router = application.router

}