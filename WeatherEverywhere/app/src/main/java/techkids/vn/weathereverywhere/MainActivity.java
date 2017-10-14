package techkids.vn.weathereverywhere;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    public static final String APPID = "3cd3bd6f31cd8c3d05328f95ed3fad47";
    public static String CITY ;
    EditText etCity;
    Button btSubmit;
    TextView tvWeather, tvTemp, tvPressure;
    private static String UNIT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etCity = (EditText) findViewById(R.id.et_city);
        btSubmit = (Button) findViewById(R.id.bt_submit);
        tvWeather = (TextView) findViewById(R.id.textView);
        tvTemp = (TextView) findViewById(R.id.textView2);
        tvPressure = (TextView) findViewById(R.id.textView3);

        btSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(etCity.getText().toString().equals("")){
                    Toast.makeText(MainActivity.this, "City name please", Toast.LENGTH_SHORT).show();
                }else{
                    GetWeatherTypesService getWeatherTypesService = RetrofitFactory.getInstance()
                            .create(GetWeatherTypesService.class);
                    getWeatherTypesService.getWeather(etCity.getText().toString(), APPID ).enqueue(new Callback<MainObjectJSON>() {
                        @Override
                        public void onResponse(Call<MainObjectJSON> call, Response<MainObjectJSON> response) {
                            List<WeatherJSON> weathers = response.body().getWeather();
                            for (WeatherJSON weather : weathers){
                                tvWeather.setText(weather.getDescription());
                            }
                            Float temp = response.body().getTemp();
                            Float pressure = response.body().getPressure();
                        }

                        @Override
                        public void onFailure(Call<MainObjectJSON> call, Throwable t) {
                            Toast.makeText(MainActivity.this,"kết nói mạng đi", Toast.LENGTH_SHORT).show();
                        }
                    });
                }
            }
        });

    }
}
