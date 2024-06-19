package com.fieb.aula.primeiraaplicacao;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    /*As variáveis são globais, isso indica que as variáveis serão visíveis para toda class
    Está sendo criado Objetos das classes EditText, Button, etc*/

    EditText edtPrimeiroNome; //Objeto tipo EditText
    Button btnApresentar; //Objeto tipo Button
    TextView tvResult; //Objeto TextView

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*Os objetos criados recebem o resource(recursos) R através do método FindViewById() a
        qual estão na tela de desenho em xml
        Dessa forma, podemos alterar todos os atributos e ações dos objetos na tela do celular*/

        edtPrimeiroNome.findViewById(R.id.edtPrimeiroNome);
        btnApresentar.findViewById(R.id.btnApresentar);
        tvResult.findViewById(R.id.tvResult);

        /*Ative o clique do botão comece digitando btnApresenta.setOn... e selecione o restante
        indicado e de o Enter
        Para inserir a segunda parte digite: new OnClick... e selecione o restante indicado e de
        o Enter*/

        btnApresentar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                /*o tvResult através do método setText() apresentará o texto;
                O edtPrimeiroNome através do método getText(), obterá o texto digitado*/

                tvResult.setText(edtPrimeiroNome.getText());
            }
        });

    }
}