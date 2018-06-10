package isfaaghyth.app.elen.network

import io.reactivex.Single
import isfaaghyth.app.elen.data.Courses
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

/**
 * Created by isfaaghyth on 5/23/18.
 * github: @isfaaghyth
 */
interface Routes {

    @FormUrlEncoded @POST("cek")
    fun login(
            @Field("username") username: String,
            @Field("password") password: String
    ) : Single<Courses>

}