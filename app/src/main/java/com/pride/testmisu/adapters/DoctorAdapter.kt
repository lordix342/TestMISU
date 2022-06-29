package com.pride.testmisu.adapters

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.pride.testmisu.R
import com.pride.testmisu.clases.Doctor
import com.pride.testmisu.databinding.DocElementBinding

class DoctorAdapter(val context : Context) : RecyclerView.Adapter<DoctorAdapter.DoctorHolder>() {

    private var doctors = ArrayList<Doctor>()

    class DoctorHolder(item: View) : RecyclerView.ViewHolder(item) {
        private val binding = DocElementBinding.bind(itemView)

        fun bind(doc: Doctor, context : Context) = with(binding) {
            textName.text = doc.name
            textSpecialization.text = doc.special
            textLocation.text = doc.location
            textDescription.text = doc.description
            imageFoto.setImageResource(doc.img)
            val rcAdapter = SkillAdapter()
            binding.rcSkills.adapter = rcAdapter
            binding.rcSkills.layoutManager =
                LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
            rcAdapter.setData(doc.skill)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DoctorHolder {
        return DoctorHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.doc_element, parent, false)
        )
    }

    override fun getItemCount(): Int {
        return doctors.size
    }

    override fun onBindViewHolder(holder: DoctorHolder, position: Int) {
        holder.bind(doctors[position],context)
    }

    @SuppressLint("NotifyDataSetChanged")
    fun setData(newDoctors: ArrayList<Doctor>) {
        doctors.clear()
        doctors.addAll(newDoctors)
        notifyDataSetChanged()
    }
}