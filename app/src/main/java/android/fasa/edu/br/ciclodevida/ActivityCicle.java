package android.fasa.edu.br.ciclodevida;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class ActivityCicle extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Log.i("Método onCreate", "Inicando activity");
        setContentView(R.layout.activity_cicle);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("Método onStart", "Inicando Método onStart");
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.i("Método onResume", "Activity no Topo da Pilha");
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.i("Método onPause", "Activity Pausada");
    }

    @Override
    protected void onRestart(){
        super.onRestart();
        Log.i("Método onRestart", "Reiniciando Activity");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("Método onStop", "Activity Parada");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("Método onDestroy", "Encerrando Activity");
    }

}
