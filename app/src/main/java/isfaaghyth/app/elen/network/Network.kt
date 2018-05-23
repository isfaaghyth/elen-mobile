package isfaaghyth.app.elen.network

import retrofit2.Retrofit

/**
 * Created by isfaaghyth on 5/23/18.
 * github: @isfaaghyth
 */
class Network {

    companion object {
        val builder by lazy {
            Retrofit.Builder()
                    .baseUrl("")
                    .build()
        }
    }

}