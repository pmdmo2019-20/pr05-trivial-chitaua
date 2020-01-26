package es.iessaladillo.pedrojoya.pr05_trivial.ui.title


import android.os.Bundle
import android.text.TextUtils.replace
import android.view.*
import androidx.fragment.app.Fragment
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.commit

import es.iessaladillo.pedrojoya.pr05_trivial.R
import es.iessaladillo.pedrojoya.pr05_trivial.ui.about.AboutFragment
import es.iessaladillo.pedrojoya.pr05_trivial.ui.rules.RulesFragment
import es.iessaladillo.pedrojoya.pr05_trivial.ui.settings.SettingsFragment


class TitleFragment : Fragment(R.layout.fragment_title) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(true)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        (requireActivity() as AppCompatActivity).supportActionBar?.run {
            setDisplayHomeAsUpEnabled(false)
            setTitle(R.string.app_name)
        }
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.menu_main, menu)
        super.onCreateOptionsMenu(menu, inflater)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean =
        when (item.itemId) {
            R.id.mnuRules -> {
                requireActivity().supportFragmentManager.commit {
                    replace(R.id.fcContent, RulesFragment.newInstance())
                    addToBackStack(null)
                }
                true
            }
            R.id.mnuAbout -> {
                requireActivity().supportFragmentManager.commit {
                    replace(R.id.fcContent, AboutFragment.newInstance())
                    addToBackStack(null)
                }
                true
            }
            R.id.mnuSettings -> {
                requireActivity().supportFragmentManager.commit {
                    replace(R.id.fcContent, SettingsFragment)
                    addToBackStack(null)
                }
                true
            }
            else -> super.onOptionsItemSelected(item)
        }


    companion object {
        fun newInstance() = TitleFragment()
    }


}
