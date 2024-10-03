package com.example.exoitalia

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.exoitalia.databinding.ActivityMainBinding
import com.example.exoitalia.databinding.TapeLapinBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: TapeLapinBinding

    private lateinit var listeBoutons: List<Button>

    var scoreTops = 0;
    var scoreFlops = 0;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = TapeLapinBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.tvTops.setOnClickListener(View.OnClickListener {

            binding.tvTops.setText("Lapin")
        })

        listeBoutons = listOf(
            binding.btn1,
            binding.btn2,
            binding.btn3,
            binding.btn4,
            binding.btn5,
            binding.btn6,
            binding.btn7,
            binding.btn8,
            binding.btn9,

            )
        initialiser()
        for (btn in listeBoutons) {
            btn.setOnClickListener(View.OnClickListener {
                reagirAuClic(it)
            })
        }
    }

    fun initialiser() {
        //mettre tous les autres à taupe

        for (btn in listeBoutons) {
            btn.setText("Taupe")
        }
        // CHoisir un bouton au hasard dans la listee
        val boutonLapin: Button = listeBoutons.random()
        boutonLapin.setText("Lapin")


    }

    fun reagirAuClic(it: View) {
        //détecter si le bouton appuyé est le lapin
        val boutonClique: Button = it as Button
        if (boutonClique.text == "Lapin") {
            boutonClique.setText("Taupe")
            initialiser()
            scoreTops++
        } else {
            //sinon perdre un point
            scoreFlops++


        }
        //mettre à jour l'affichage des scores
        binding.tvTops.setText("Tops : " + scoreTops)
        binding.tvFlops.setText("Flops : " + scoreFlops)
    }

}
