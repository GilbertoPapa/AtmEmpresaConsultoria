package com.gilbertopapa.atmempresaconsultoria;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ContactActivity extends Activity {

    private Button btnSend;
    private EditText name,email,phone,text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);

        btnSend = (Button)findViewById(R.id.btn_contact);
        name = (EditText)findViewById(R.id.edt_name);
        email = (EditText)findViewById(R.id.edt_email);
        phone = (EditText)findViewById(R.id.edt_phone);
        text = (EditText)findViewById(R.id.edt_text);

        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String addresses = "contato@atm.com.br";
                String subject = "Olá meu nome é "+name+ "gostaria de saber mais";
                String textmail = "Meus dados:\n"+name+"\n"+email+"\n"+phone+"\n"+"Gostaria de saber o seguinte:"+"\n"+text;

                Intent intent = new Intent(Intent.ACTION_SENDTO);
                intent.setData(Uri.parse("mailto:")); // only email apps should handle this
                intent.putExtra(Intent.EXTRA_EMAIL, addresses);
                intent.putExtra(Intent.EXTRA_SUBJECT, subject);
                intent.putExtra(Intent.EXTRA_TEXT, textmail);
                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);
                    Toast.makeText(getApplicationContext(),"Enviado com sucesso",Toast.LENGTH_LONG).show();
                }

            }
        });
    }



}
