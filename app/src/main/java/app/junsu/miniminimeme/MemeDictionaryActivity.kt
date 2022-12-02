package app.junsu.miniminimeme

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import app.junsu.miniminimeme.databinding.ActivityMemeDictionaryBinding

class MemeDictionaryActivity : AppCompatActivity() {

    private val binding: ActivityMemeDictionaryBinding by lazy {
        DataBindingUtil.setContentView(
            this,
            R.layout.activity_meme_dictionary,
        )
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding.lifecycleOwner = this

        binding.cardActivityMemeDictionaryJeulgupdda.setOnClickListener {
            startActivity(
                Intent(
                    this,
                    JeulgupddaActivity::class.java,
                )
            )
        }
    }
}