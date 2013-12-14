package lrstudios.games.ego.lib;

import android.app.Application;
import org.acra.ACRA;
import org.acra.annotation.ReportsCrashes;


@ReportsCrashes(
        formKey = "",
        formUri = "https://lr-studios.cloudant.com/acra-tsumego-workshop/_design/acra-storage/_update/report",
        reportType = org.acra.sender.HttpSender.Type.JSON,
        httpMethod = org.acra.sender.HttpSender.Method.PUT,
        formUriBasicAuthLogin="coatedenturnorthesseesse",
        formUriBasicAuthPassword="fYQxGmhuYyK58qmR8yMAAHBO")

public class ACRA_Application extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        ACRA.init(this);
    }
}
