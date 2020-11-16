package com.example.menu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        // SE CREA EL MEMÚ
        //mando llamar el inflater que ya viviene definido
        // se dile que lo infle
        // en la segunda linea se le dice cuál voy a inflar
        // y en la tercera linea se lo mando al constructor del padre
        val inflate: MenuInflater = menuInflater
        inflate.inflate(R.menu.menu_principal, menu)
        return super.onCreateOptionsMenu(menu)
    }
    //aquí revisamos cuál es el click o cual fue la opción que yo escogí  en kotlin
    override fun onOptionsItemSelected(item: MenuItem): Boolean = when (item.itemId) {
      //AQUI SE CREA EL LISTENER O ESCUCHADOR PARA PODER VEFIRIAR EL CLICK
       //cuando las opciones me mande un boolean el when ya no me dará error
        R.id.menus_configuracion -> {
            Log.e("MENU", "Se presionó configuración")
            true
        }
        R.id.menus_acercade -> {
            Log.e("MENU", "Se presionó acerca de...")
            true
        }
        else ->  {
            Log.e("MENU", "Se presionó usuarios")
            true
          }
    }
}