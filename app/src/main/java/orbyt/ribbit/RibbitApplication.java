package orbyt.ribbit;

import android.app.Application;

import com.parse.Parse;

/**
 * Created by orbyt on 7/20/2015.
 */
public class RibbitApplication extends Application {

    @Override
    public void onCreate() {
        Parse.enableLocalDatastore(this);

        Parse.initialize(this, "J5Z8DdWopDZoaWp8ENRXlxSpHtbAEtQDNox9W2vu", "RUdDu92UQzGbSky8rFghGd4J6BuxLAiatjv6namk");
    }

}
