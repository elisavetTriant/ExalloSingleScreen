package co.elisavet.exallosinglescreen;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void buttonPress(View v) {
        switch (v.getId()) {
            case R.id.mens_wooden_bow_ties_button:
                openWebPage("https://exallo.co/collections/men-bow-ties");
                break;
            case R.id.kids_wooden_bow_ties_button:
                openWebPage("https://exallo.co/collections/kids-wooden-bow-ties");
                break;
            case R.id.wooden_cuff_links_button:
                openWebPage("https://exallo.co/collections/cuff-links");
                break;
            case R.id.wooden_phone_cases_button:
                openWebPage("https://exallo.co/collections/phone-cases");
                break;
            case R.id.wooden_wedding_packages_button:
                openWebPage("https://exallo.co/pages/wedding-page");
                break;
        }
    }

    public void openWebPage(String url) {
        Uri webpage = Uri.parse(url);
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }
}
