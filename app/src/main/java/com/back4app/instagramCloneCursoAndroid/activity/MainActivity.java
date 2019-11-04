package com.back4app.instagramCloneCursoAndroid.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.back4app.instagramCloneCursoAndroid.R;
import com.parse.LogInCallback;
import com.parse.ParseException;
import com.parse.ParseUser;
import com.parse.SignUpCallback;

public class MainActivity extends AppCompatActivity {

    private Button botao;
    private ParseUser usuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botao = (Button) findViewById(R.id.btId);

        //Cadastro de usuários
        usuario = new ParseUser();
        usuario.setUsername("jamiltonDamasceno");
        usuario.setPassword("123456");
        usuario.setEmail("jamiltoncursos@gmail.com");

        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                /*usuario.signUpInBackground(new SignUpCallback() {
                    @Override
                    public void done(ParseException e) {
                        if (e==null){
                            Log.i("cadastroUsuario","Sucesso ao cadastrar Usuario");
                        } else {
                            Log.i("cadastroUsuario", "Erro ao cadastrar Usuario" + e.getMessage());
                        }
                    }
                });*/
                /*Verificar usuário logado*/
                //deslogar
                /*ParseUser.logOut();

                if (ParseUser.getCurrentUser() != null){
                    Log.i("Login Usuario","Usuario está Logado");
                } else {
                    Log.i("Login Usuario", "Usuario não está logado");
                }*/

                /*Fazer login do usuário*/
                ParseUser.logInInBackground("jamiltonDamasceno", "123456", new LogInCallback() {
                    @Override
                    public void done(ParseUser user, ParseException e) {
                        if (ParseUser.getCurrentUser() != null){
                            Log.i("Login Usuario","Login realizado");
                        } else {
                            Log.i("Login Usuario", "Erro ao fazer login");
                        }

                    }
                });
            }
        });





    }

}
