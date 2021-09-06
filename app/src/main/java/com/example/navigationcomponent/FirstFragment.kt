package com.example.navigationcomponent

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.NavOptions
import androidx.navigation.Navigation.findNavController
import kotlinx.android.synthetic.main.navigation_first_fragment.*

class FirstFragment : Fragment() {

    private lateinit var options: NavOptions //Added for Custom Animation

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? = inflater.inflate(R.layout.navigation_first_fragment, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initTransitionAnimation()
        initClickListener()
    }

    private fun initTransitionAnimation() {
        /*To Add Custom Navigation Animation
        options = navOptions {
            anim {
                enter = R.anim.fragment_fade_enter
                exit = R.anim.fragment_close_exit
                popEnter = R.anim.fragment_fast_out_extra_slow_in
                popExit = R.anim.fragment_open_enter
            }
        }*/
    }

    private fun initClickListener() {
        button_frag1.setOnClickListener {
            /*To Navigate to a particular destination
            findNavController(it).navigate(
                R.id.action_firstFragment_to_secondFragment,
                null
            )
            To Navigate to a particular destination with custom navigation animation
            findNavController(it).navigate(
                R.id.action_firstFragment_to_secondFragment,
                null, options
            )*/

            //To Navigate to a particular destination with argument using DirectionClasses
            val stringArgument = "This is SecondFragmentArgument"
            findNavController(it).navigate(
                FirstFragmentDirections.actionFirstFragmentToSecondFragment(stringArgument),
                null
            )
        }

        /* To Navigate to a particular destination using createNavigateOnClickListener()
        button_frag1.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.action_firstFragment_to_secondFragment))*/
    }
}