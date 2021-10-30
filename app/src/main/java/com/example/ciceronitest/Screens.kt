package com.example.ciceronitest

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentFactory
import com.github.terrakok.cicerone.androidx.FragmentScreen

sealed interface Screens {

    object TestScreen : FragmentScreen {
        override fun createFragment(factory: FragmentFactory): Fragment {
            return TestFragment()
        }
    }

    object SecondScreen : FragmentScreen {
        override fun createFragment(factory: FragmentFactory): Fragment {
            return SecondFragment()
        }
    }

}