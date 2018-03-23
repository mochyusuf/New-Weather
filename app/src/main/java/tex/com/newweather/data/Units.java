package tex.com.newweather.data;

import org.json.JSONObject;

/**
 * Created by Mocha on 23/03/2018.
 */

public class Units implements JSONPopulator {

    private String temperature;

    public String getTemperature() {
        return temperature;
    }

    @Override
    public void populate(JSONObject data) {
        temperature = data.optString("temperature");
    }
}
