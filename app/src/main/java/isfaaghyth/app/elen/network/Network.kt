package isfaaghyth.app.elen.network

import com.google.gson.GsonBuilder
import isfaaghyth.app.elen.BuildConfig
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

/**
 * Created by isfaaghyth on 6/10/18.
 * github: @isfaaghyth
 */
class Network {
    companion object {
        private val interceptor = HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY)
        private val client = OkHttpClient.Builder().addInterceptor(interceptor).build()
        val builder: Retrofit = Retrofit.Builder()
                .baseUrl(BuildConfig.MAIN_URL)
                .client(client)
                .addConverterFactory(GsonConverterFactory.create(GsonBuilder().setLenient().create()))
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build()
    }
}