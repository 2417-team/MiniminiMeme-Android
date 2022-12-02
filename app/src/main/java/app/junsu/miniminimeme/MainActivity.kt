package app.junsu.miniminimeme

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import app.junsu.miniminimeme.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding: ActivityMainBinding by lazy {
        DataBindingUtil.setContentView(
            this,
            R.layout.activity_main,
        )
    }

    private val homeFragment by lazy {
        HomeFragment()
    }

    private val testFragment by lazy {
        TestFragment()
    }

    private val userFragment by lazy {
        UserFragment()
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        with(binding.bottomNavigationViewMain) {
            setOnItemSelectedListener {
                when (it.itemId) {
                    R.id.bottom_navigation_view_main_home -> {
                        changeFragment(homeFragment)
                        return@setOnItemSelectedListener true
                    }
                    R.id.bottom_navigation_view_main_test -> {
                        changeFragment(testFragment)
                        return@setOnItemSelectedListener true
                    }
                    R.id.bottom_navigation_view_main_user -> {
                        changeFragment(userFragment)
                        return@setOnItemSelectedListener true
                    }
                    else -> {
                        return@setOnItemSelectedListener false
                    }
                }
            }
            selectedItemId = R.id.bottom_navigation_view_main_home
        }
    }

    private fun changeFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction().replace(
            R.id.layout_main_container, fragment,
        ).commitAllowingStateLoss()
    }
}
