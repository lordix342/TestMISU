package com.pride.testmisu

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.pride.testmisu.databinding.FragmentMainMenuBinding

class MainMenu : Fragment() {
    private lateinit var binding: FragmentMainMenuBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentMainMenuBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        with(binding) {
            bQuest1.setOnClickListener {
                Navigation.findNavController(binding.root).navigate(R.id.action_mainMenu_to_quest1)
            }
            bQuest2.setOnClickListener {
                Navigation.findNavController(binding.root).navigate(R.id.action_mainMenu_to_quest2)
            }
            bExit.setOnClickListener {
                activity?.finish()
            }
        }
    }
}