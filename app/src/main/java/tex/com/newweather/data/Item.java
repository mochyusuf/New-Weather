package tex.com.newweather.data;

import org.json.JSONObject;

/**
 * Created by Mocha on 23/03/2018.
 */

public class Item implements JSONPopulator {

    private Condition condition;

    public Condition getCondition() {
        return condition;
    }

    @Override
    public void populate(JSONObject data) {
        condition = new Condition();
        condition.populate(data.optJSONObject("condition"));
    }
}
