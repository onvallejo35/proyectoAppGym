import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /* =================================================
        Se declara una variable tipo button para utilizar
        el objeto del diseño
         ========================================================= */

        val button: Button =findViewById(R.id.MiBoton)
        /* ==================================
        En el evento OnClick mostramos un mensaje
        =====================================================  */
        button.setOnClickListener{
            Toast.makeText(this,"has presionado el boton",Toast.LENGTH_SHORT).show()
        }


    }


}