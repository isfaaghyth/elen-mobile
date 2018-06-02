package isfaaghyth.app.elen.di.module

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import dagger.Module
import dagger.Provides
import isfaaghyth.app.elen.BuildConfig
import isfaaghyth.app.elen.network.Routes
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

/**
 * Created by isfaaghyth on 5/24/18.
 * github: @isfaaghyth
 */

@Module
class NetworkModule {

    @Provides
    fun provideRetrofit(gson: Gson): Retrofit = Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create(gson))
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .baseUrl(BuildConfig.MAIN_URL).build()

    @Provides
    fun provideGson(): Gson = GsonBuilder().create()

    @Provides
    fun provideRoutes(retrofit: Retrofit): Routes = retrofit.create(Routes::class.java)


}