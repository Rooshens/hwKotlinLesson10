package qr.a.rooshen.hwkotlinlesson10


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import qr.a.rooshen.hwkotlinlesson10.SharePrefHelper.Companion.SP_WELCOME_BUTTON_ClIKED
import qr.a.rooshen.hwkotlinlesson10.databinding.FragmentAuthorizationBinding


class AuthorizationFragment : Fragment() {

    private lateinit var binding: FragmentAuthorizationBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAuthorizationBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.swNotHide.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                SharePrefHelper.instance.edit().remove(SP_WELCOME_BUTTON_ClIKED).apply()
            }
        }
        binding.buttonBegin.setOnClickListener {
            (activity as? MainNavigation)?.openMenu()
        }
    }
}