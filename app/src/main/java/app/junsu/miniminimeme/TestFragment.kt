package app.junsu.miniminimeme

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import app.junsu.miniminimeme.databinding.FragmentTestBinding

class TestFragment : Fragment() {

    private lateinit var binding: FragmentTestBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(
            inflater,
            R.layout.fragment_test,
            container,
            false,
        )
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.webviewFragmentTest.apply {
            loadUrl(
                        "https://front-kjlt1fexn-2817.vercel.app/"
            )
            settings.javaScriptEnabled = true
        }
    }
}