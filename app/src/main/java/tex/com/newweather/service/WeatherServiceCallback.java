package tex.com.newweather.service;

import tex.com.newweather.data.Channel;

/**
 * Created by Mocha on 23/03/2018.
 */

public interface WeatherServiceCallback {

    void serviceSuccess(Channel channel);

    void serviceFailure(Exception exception);
}
