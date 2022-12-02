package app.junsu.miniminimeme

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import app.junsu.miniminimeme.databinding.ActivityJeulgupddaBinding

class JeulgupddaActivity : AppCompatActivity() {

    private val binding: ActivityJeulgupddaBinding by lazy {
        DataBindingUtil.setContentView(
            this,
            R.layout.activity_jeulgupdda,
        )
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding.lifecycleOwner = this
    }
}