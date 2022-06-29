package com.pride.testmisu

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.Navigation
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
            "Прізвище Ім'я",
            "Терапевт",
            "Херсон",
            skills,
            "very large text for information about doctors"
        ),
        Doctor(
            R.drawable.img_doc2,
            "Some Text",
            "Уролог",
            "Donetsk",
            skills,
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit," +
                    " sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. " +
                    "Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi " +
                    "ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit " +
                    "in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur " +
                    "sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt " +
                    "mollit anim id est laborum"
        ), Doctor(
            R.drawable.img_doc1,
            "Some Text",
            "Педіатр",
            "Київ",
            skills,
            "very large text for information about doctors, very large text for information about doctors"
        ),Doctor(
            R.drawable.img_doc2,
            "Some Text",
            "Хірург",
            "Львів",
            skills,
            "very large text for information about doctors"
        )
    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        setHasOptionsMenu(true)
        (activity as? AppCompatActivity)?.supportActionBar?.hide()
        binding = FragmentQuest1Binding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val rcDocAdapter = DoctorAdapter(requireContext())
        binding.rcDocs.adapter = rcDocAdapter
        binding.rcDocs.layoutManager = LinearLayoutManager(requireContext())
        rcDocAdapter.setData(docs)
        binding.radioGroup.setOnCheckedChangeListener { _, checkedId ->
            chekedListener(checkedId)
        }
        binding.imageView2.setOnClickListener {
            Navigation.findNavController(binding.root).popBackStack()
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        (activity as? AppCompatActivity)?.supportActionBar?.show()
    }
    private fun chekedListener(id : Int) {
        when (id) {
            binding.radioButton.id -> {
                binding.radioButton.text = resources.getString(R.string.special_family) + "✓"
                binding.radioButton2.text = resources.getString(R.string.special_children)
                binding.radioButton3.text = resources.getString(R.string.special_butcher)
                binding.radioButton4.text = resources.getString(R.string.special_pills)
                binding.radioButton5.text = resources.getString(R.string.special_eyes)
                binding.radioButton6.text = resources.getString(R.string.special_penis)
            }
            binding.radioButton2.id -> {
                binding.radioButton.text = resources.getString(R.string.special_family)
                binding.radioButton2.text = resources.getString(R.string.special_children) + "✓"
                binding.radioButton3.text = resources.getString(R.string.special_butcher)
                binding.radioButton4.text = resources.getString(R.string.special_pills)
                binding.radioButton5.text = resources.getString(R.string.special_eyes)
                binding.radioButton6.text = resources.getString(R.string.special_penis)
            }
            binding.radioButton3.id -> {
                binding.radioButton.text = resources.getString(R.string.special_family)
                binding.radioButton2.text = resources.getString(R.string.special_children)
                binding.radioButton3.text = resources.getString(R.string.special_butcher) + "✓"
                binding.radioButton4.text = resources.getString(R.string.special_pills)
                binding.radioButton5.text = resources.getString(R.string.special_eyes)
                binding.radioButton6.text = resources.getString(R.string.special_penis)
            }
            binding.radioButton4.id -> {
                binding.radioButton.text = resources.getString(R.string.special_family)
                binding.radioButton2.text = resources.getString(R.string.special_children)
                binding.radioButton3.text = resources.getString(R.string.special_butcher)
                binding.radioButton4.text = resources.getString(R.string.special_pills) + "✓"
                binding.radioButton5.text = resources.getString(R.string.special_eyes)
                binding.radioButton6.text = resources.getString(R.string.special_penis)
            }
            binding.radioButton5.id -> {
                binding.radioButton.text = resources.getString(R.string.special_family)
                binding.radioButton2.text = resources.getString(R.string.special_children)
                binding.radioButton3.text = resources.getString(R.string.special_butcher)
                binding.radioButton4.text = resources.getString(R.string.special_pills)
                binding.radioButton5.text = resources.getString(R.string.special_eyes) + "✓"
                binding.radioButton6.text = resources.getString(R.string.special_penis)
            }
            binding.radioButton6.id -> {
                binding.radioButton.text = resources.getString(R.string.special_family)
                binding.radioButton2.text = resources.getString(R.string.special_children)
                binding.radioButton3.text = resources.getString(R.string.special_butcher)
                binding.radioButton4.text = resources.getString(R.string.special_pills)
                binding.radioButton5.text = resources.getString(R.string.special_eyes)
                binding.radioButton6.text = resources.getString(R.string.special_penis) + "✓"
            }
        }
    }
}