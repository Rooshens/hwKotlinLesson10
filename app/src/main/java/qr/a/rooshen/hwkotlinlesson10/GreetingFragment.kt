package qr.a.rooshen.hwkotlinlesson10

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import qr.a.rooshen.hwkotlinlesson10.SharePrefHelper.Companion.SP_WELCOME_BUTTON_ClIKED
import qr.a.rooshen.hwkotlinlesson10.databinding.FragmentGreetingBinding


class GreetingFragment : Fragment() {

    private lateinit var binding: FragmentGreetingBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentGreetingBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.tvBeginGreeting.setOnClickListener {
            SharePrefHelper.instance.edit().putBoolean(SP_WELCOME_BUTTON_ClIKED, true).apply()
            (activity as? MainNavigation)?.openAuthorizationFragment()
        }

        binding.cbBeginGreeting.setOnClickListener {
            (activity as? MainNavigation)?.openAuthorizationFragment()
        }
    }
}