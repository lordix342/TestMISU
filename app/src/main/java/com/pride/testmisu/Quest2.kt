package com.pride.testmisu

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import com.pride.testmisu.databinding.FragmentQuest2Binding

class Quest2 : Fragment() {
    private lateinit var binding : FragmentQuest2Binding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        (activity as? AppCompatActivity)?.supportActionBar?.hide()
        binding = FragmentQuest2Binding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.bnavigation.setOnItemSelectedListener {item ->
            when (item.itemId) {
                R.id.page_1 -> binding.textView.text = "View 1"
                R.id.page_2 -> activity?.finish()
                R.id.page_3 -> binding.textView.text = "View 3"
                R.id.page_4 -> binding.textView.text = "View 4"
            }
            true
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        (activity as? AppCompatActivity)?.supportActionBar?.show()
    }
}


