package com.rifdahalf.momcareapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class MomsbotFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_momsbot, container, false)
    }

    companion object {
        @JvmStatic
        fun newInstance() =
            MomsbotFragment().apply {
                arguments = Bundle().apply {}
            }
    }
}