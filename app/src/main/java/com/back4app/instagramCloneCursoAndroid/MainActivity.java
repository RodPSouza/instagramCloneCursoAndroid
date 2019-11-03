package com.back4app.instagramCloneCursoAndroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button botao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botao = (Button) findViewById(R.id.btId);

        // Save the current Installation to Back4App
        // ParseInstallation.getCurrentInstallation().saveInBackground();

        /*
        ParseObject pontuacao = new ParseObject("Pontuacao");
        pontuacao.put("nome","Mario");
        pontuacao.put("pontos",800);

        pontuacao.saveInBackground(new SaveCallback() {
            @Override
            public void done(ParseException e) {
                if (e == null) {
                    Log.i("Salvo","Salvo");
                }else{
                    Log.i("Não Salvo","Não Salvo");
                }
            }
        });*/

        /*
        ParseQuery<ParseObject> consulta = ParseQuery.getQuery("Pontuacao");
        consulta.getInBackground("uDCygxQ4bY", new GetCallback<ParseObject>() {
            @Override
            public void done(ParseObject object, ParseException e) {
                if (e==null){
                    object.put("pontos",500);
                    object.saveInBackground();
                }else{
                    Log.i("Erro na consula","Erro na consulta");
                }
            }
        });*/

       /* botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ParseQuery<ParseObject> filtro = ParseQuery.getQuery("Pontuacao");

                //filtro.whereGreaterThan("pontos",200);
                filtro.whereGreaterThanOrEqualTo("pontos",200);
                filtro.addDescendingOrder("pontos");
                filtro.setLimit(1);

                //Listar os dados
                filtro.findInBackground(new FindCallback<ParseObject>() {
                    @Override
                    public void done(List<ParseObject> objects, ParseException e) {
                        if (e == null){
                            //Toast.makeText(getApplicationContext(),"Sucesso" + objects.size(),Toast.LENGTH_LONG).show();
                            Log.i("Listar Dados","Sucesso" + objects.size());
                            for(ParseObject object : objects){
                                Log.i("Listar Dados","Objetos" + object.get("nome") + object.get("pontos")  );
                            }

                        }else{
                            //Toast.makeText(getApplicationContext(),"Erro" + objects.size(),Toast.LENGTH_LONG).show();
                            Log.i("Listar Dados", "Erro" + e.getMessage());
                        }
                    }
                });

            }
        });*/

    }

}
