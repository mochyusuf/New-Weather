package tex.com.newweather.service;

import android.os.AsyncTask;

/**
 * Created by Mocha on 23/03/2018.
 */

public class YahooWeatherService {
    private WeatherServiceCallback callback;
    private String Location;

    public YahooWeatherService(WeatherServiceCallback callback) {
        this.callback = callback;
    }

    public String getLocation(String location) {
        return location;
    }

    public void refreshWeather(String location) {
        new AsyncTask<String, Void, String>() {
            @Override
            protected String doInBackground(String... strings) {
                return null;
            }

            @Override
            protected void onPostExecute(String s) {
                super.onPostExecute(s);
            }
        };
    }
}
