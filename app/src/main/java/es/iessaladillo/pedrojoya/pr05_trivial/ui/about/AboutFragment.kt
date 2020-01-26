package es.iessaladillo.pedrojoya.pr05_trivial.ui.about


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity

import es.iessaladillo.pedrojoya.pr05_trivial.R

/**
 * A simple [Fragment] subclass.
 */
class AboutFragment : Fragment(R.layout.fragment_about) {

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        (requireActivity() as AppCompatActivity).supportActionBar?.run {
            setDisplayHomeAsUpEnabled(false)
            setTitle(R.string.about_title)
        }
    }

    companion object {
        fun newInstance() = AboutFragment()
    }


}
