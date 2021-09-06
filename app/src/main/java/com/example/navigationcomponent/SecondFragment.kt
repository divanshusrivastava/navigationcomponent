package com.example.navigationcomponent

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation.findNavController
import androidx.navigation.findNavController
import kotlinx.android.synthetic.main.navigation_second_fragment.*

class SecondFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? = inflater.inflate(R.layout.navigation_second_fragment, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initView()
        initClickListener()
        initClickListener()
    }

    private fun initView() {
        tv_second_fragment_argument.text = arguments?.getString("argumentToSecondFragment")
    }

    private fun initClickListener() {
        button_frag2.setOnClickListener {
            // To Navigate to a particular destination
            findNavController(it).navigate(
                R.id.action_secondFragment_to_FirstFragment,
                null
            )
        }
    }
}
