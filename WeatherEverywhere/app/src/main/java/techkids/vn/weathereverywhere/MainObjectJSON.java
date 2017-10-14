package techkids.vn.weathereverywhere;

import java.util.List;

/**
 * Created by ctrls on 14/10/2017.
 */

public class MainObjectJSON {
    List<WeatherJSON> weather;
    DetailJSON main;
    Float temp;
    Float pressure;
    public List<WeatherJSON> getWeather (){
        return weather;
    }
    public Float getTemp(){
        return temp = main.getTemp();
    }
    public Float getPressure(){
        return pressure = main.getPressure();
    }


}
