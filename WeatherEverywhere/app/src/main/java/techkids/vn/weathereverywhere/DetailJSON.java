package techkids.vn.weathereverywhere;

/**
 * Created by ctrls on 14/10/2017.
 */

public class DetailJSON {
    private float temp;
    private float pressure;
    private float humidity;

    public DetailJSON(float temp, float pressure, float humidity) {
        this.temp = temp;
        this.pressure = pressure;
        this.humidity = humidity;
    }

    public float getTemp() {
        return temp;
    }

    public float getPressure() {
        return pressure;
    }

    public float getHumidity() {
        return humidity;
    }
}
