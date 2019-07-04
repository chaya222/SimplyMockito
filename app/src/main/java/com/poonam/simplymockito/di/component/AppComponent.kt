package com.poonam.simplymockito.di.componentimport android.app.Applicationimport com.poonam.simplymockito.SimplyMockitoApplicationimport com.poonam.simplymockito.di.module.ActivityModuleimport com.poonam.simplymockito.di.module.ContextModuleimport com.poonam.simplymockito.di.module.ViewModelModuleimport dagger.BindsInstanceimport dagger.Componentimport dagger.android.AndroidInjectorimport dagger.android.support.AndroidSupportInjectionModuleimport javax.inject.Singleton@Singleton@Component(    modules =    [        ActivityModule::class,        ViewModelModule::class,        ContextModule::class,        AndroidSupportInjectionModule::class    ])interface AppComponent : AndroidInjector<SimplyMockitoApplication> {    @Component.Builder    interface Builder {        @BindsInstance        fun application(application: Application): Builder        fun build(): AppComponent    }}