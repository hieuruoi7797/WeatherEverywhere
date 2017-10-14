package techkids.vn.weathereverywhere;

/**
 * Created by ctrls on 14/10/2017.
 */

public class WeatherJSON {
    private int id;
    private String main;
    private String description;
    private String icon;

    public WeatherJSON(int id, String main, String description, String icon) {
        this.id = id;
        this.main = main;
        this.description = description;
        this.icon = icon;
    }

    public int getId() {
        return id;
    }

    public String getMain() {
        return main;
    }

    public String getDescription() {
        return description;
    }

    public String getIcon() {
        return icon;
    }
}
