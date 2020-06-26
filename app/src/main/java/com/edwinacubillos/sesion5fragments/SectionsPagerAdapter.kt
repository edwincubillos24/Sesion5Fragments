package com.edwinacubillos.sesion5fragments

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.edwinacubillos.sesion5fragments.fragments.BatmanFragment
import com.edwinacubillos.sesion5fragments.fragments.FlashFragment
import com.edwinacubillos.sesion5fragments.fragments.MujerMaravillaFragment
import com.edwinacubillos.sesion5fragments.fragments.SupermanFragment

private val TAB_TITLES = arrayOf(
    R.string.superman_fragment_label,
    R.string.batman_fragment_label,
    R.string.flash_fragment_label,
    R.string.wonder_woman_label
)

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
class SectionsPagerAdapter(private val context: Context, fm: FragmentManager) :
    FragmentPagerAdapter(fm) {

    override fun getItem(position: Int): Fragment {
        // getItem is called to instantiate the fragment for the given page.
        // Return a PlaceholderFragment (defined as a static inner class below).
        when (position) {
            0 -> return SupermanFragment()
            1 -> return BatmanFragment()
            2 -> return FlashFragment()
            else -> return MujerMaravillaFragment()
        }
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return context.resources.getString(TAB_TITLES[position])
    }

    override fun getCount(): Int {
        return 4
    }
}