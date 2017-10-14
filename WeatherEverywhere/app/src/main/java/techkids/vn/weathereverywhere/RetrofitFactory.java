package techkids.vn.weathereverywhere;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by ctrls on 14/10/2017.
 */

public class RetrofitFactory {
    private static Retrofit retrofit;
    public static Retrofit getInstance(){
        if(retrofit == null){
            retrofit = new Retrofit.Builder()
                    .baseUrl("http://api.openweathermap.org/")
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}
