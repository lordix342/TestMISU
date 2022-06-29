package com.pride.testmisu

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.pride.testmisu.adapters.DoctorAdapter
import com.pride.testmisu.clases.Doctor
import com.pride.testmisu.databinding.FragmentQuest1Binding

class QuestOne : Fragment() {
    private lateinit var binding: FragmentQuest1Binding
    private val skills = arrayListOf("skill1", "skill2", "skill3")
    private val docs = arrayListOf(
        Doctor(
            R.drawable.img_doc1,
            "hEAR CAN BE UR ADS",
            "Damager",
            "Herson",
            skills,
            "very large text for information about doctors"
        ),
        Doctor(
            R.drawable.img_doc2,
            "Some Text",
            "Healler",
            "Donetsk",
            skills,
            "very large text for information about doctors"
        )
    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentQuest1Binding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d("asf","ASdgsr")
        val rcDocAdapter = DoctorAdapter(requireContext())
        binding.rcDocs.adapter = rcDocAdapter
        binding.rcDocs.layoutManager = LinearLayoutManager(requireContext())
        rcDocAdapter.setData(docs)
    }
}