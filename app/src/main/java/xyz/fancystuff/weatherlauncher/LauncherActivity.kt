package xyz.fancystuff.weatherlauncher

import android.app.Activity
import android.content.ComponentName
import android.net.Uri
import android.os.Bundle
import android.widget.Toast

class LauncherActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        try {
            intent.component = ComponentName(
                    "com.google.android.googlequicksearchbox",
                    "com.google.android.apps.gsa.velour.DynamicActivityTrampoline")
            intent.data = Uri.parse("dynact://velour/weather/ProxyActivity")
            startActivity(intent)
        }
        catch (e: Exception) {
            Toast.makeText(this, getString(R.string.no_google_weather), Toast.LENGTH_LONG).show()
        }
        finish()
    }
}
