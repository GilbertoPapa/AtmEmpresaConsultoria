package com.gilbertopapa.atmempresaconsultoria;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends Activity implements View.OnClickListener {


    private ImageButton btnCompany, btnService, btnClient, btnContact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCompany = (ImageButton) findViewById(R.id.CompanyId);
        btnService = (ImageButton) findViewById(R.id.SevicesId);
        btnClient = (ImageButton) findViewById(R.id.ClientId);
        btnContact = (ImageButton) findViewById(R.id.ContactId);

        btnCompany.setOnClickListener(this);
        btnService.setOnClickListener(this);
        btnClient.setOnClickListener(this);
        btnContact.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.CompanyId:
                startActivity(new Intent(MainActivity.this, CompanyActivity.class));
                break;
            case R.id.SevicesId:
                startActivity(new Intent(MainActivity.this, ServiceActivity.class));
                break;
            case R.id.ClientId:
                startActivity(new Intent(MainActivity.this, ClientActivity.class));
                break;
            case R.id.ContactId:
                startActivity(new Intent(MainActivity.this, ContactActivity.class));
                break;
        }

    }
}
