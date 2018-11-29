package com.example.minne.callintentapp;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.net.URI;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonMail();
        buttonWeb();
        buttonMap();
        buttonCall();
    }
    private void buttonCall() {
        Button butoonCall = findViewById(R.id.button_call);
        butoonCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri number = Uri.parse("tel: ");
                Intent callIntent = new Intent(Intent.ACTION_DIAL, number);

                if(isIntentSafe(callIntent))
                  startActivity(callIntent);
                else
                    Toast.makeText(getApplicationContext(), "Your phone have no app can dial", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void buttonMap() {
        Button butoonMap = findViewById(R.id.button_map);
        butoonMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri location = Uri.parse("geo: 37.422219, -122.08364?z=14");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, location);

                if(isIntentSafe(mapIntent))
                    startActivity(mapIntent);
                else
                    Toast.makeText(getApplicationContext(), "Your phone have no app can dial", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void buttonWeb() {
        Button buttonWeb = findViewById(R.id.button_web);
        buttonWeb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri webPage = Uri.parse("http://vk.com");
                Intent webIntent = new Intent(Intent.ACTION_VIEW, webPage);

                if(isIntentSafe(webIntent))
                    startActivity(webIntent);
                else
                    Toast.makeText(getApplicationContext(), "Your phone have no app can dial", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void buttonMail() {
        Button buttonMail = findViewById(R.id.button_mail);
        buttonMail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent emailIntent = new Intent(Intent.ACTION_SENDTO, Uri.fromParts("mailto", "example@gmail.com", null));
                emailIntent.putExtra(Intent.EXTRA_EMAIL, new String[]{"hello@mail.ru, hi@mail.ru"});
                emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Send Intent Message");
                emailIntent.putExtra(Intent.EXTRA_TEXT, "I text my mail by Android App");

                if(isIntentSafe(emailIntent))
                    startActivity(emailIntent);
                else
                    Toast.makeText(getApplicationContext(), "Your phone have no app can dial", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private  boolean isIntentSafe(Intent intent) {
        PackageManager packageManager = getPackageManager();
        List<ResolveInfo> activities  = packageManager.queryIntentActivities(intent, 0);
        return activities.size()>0;
    }
}
