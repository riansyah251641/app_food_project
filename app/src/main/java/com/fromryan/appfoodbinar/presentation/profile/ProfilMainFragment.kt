package .presentation.profile

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.fromryan.appfoodbinar.databinding.FragmentProfilMainBinding


class ProfilMainFragment : Fragment() {
    private lateinit var binding: FragmentProfilMainBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentProfilMainBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

}