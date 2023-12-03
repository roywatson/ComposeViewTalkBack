package com.roywatson.garage.composeviewtalkback

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment

class XMLContentFragment : Fragment(R.layout.fragment_xml_content) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val bbb = view.findViewById<Button>(R.id.buttonbuttonbutton)
        bbb.setOnClickListener {
             (activity as MainActivity).onBBB()
        }
    }

}