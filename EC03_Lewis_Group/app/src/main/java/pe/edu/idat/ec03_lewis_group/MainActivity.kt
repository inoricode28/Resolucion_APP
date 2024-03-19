package pe.edu.idat.ec03_lewis_group

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import pe.edu.idat.ec03_lewis_group.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btnacceder.setOnClickListener{
            val usuario = binding.txtemail.text.toString()
            val contrasena = binding.txtcontraseA.text.toString()

            if (usuario == "altared" && contrasena == "SYS123"){
                val intent = Intent(this, Formulario_List::class.java)
                startActivity(intent)
            } else {
                Toast.makeText(this, "Usuario o contraseña incorrectos", Toast.LENGTH_SHORT).show()
            }
        }
    }
}