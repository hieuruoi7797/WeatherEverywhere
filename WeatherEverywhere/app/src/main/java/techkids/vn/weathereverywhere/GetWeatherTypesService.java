package techkids.vn.weathereverywhere;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by ctrls on 14/10/2017.
 */

public interface GetWeatherTypesService {

    @GET("data/2.5/weather?")
    Call<MainObjectJSON> getWeather(@Query("q") String CITY, @Query("appid") String APPID);
}
