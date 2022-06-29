package com.pride.testmisu.adapters

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.pride.testmisu.R
import com.pride.testmisu.databinding.SkillElementBinding

class SkillAdapter : RecyclerView.Adapter<SkillAdapter.SkillHolder>() {

    private var skills = ArrayList<String>()

    class SkillHolder(item: View) : RecyclerView.ViewHolder(item) {

        private val binding = SkillElementBinding.bind(itemView)
        fun bind(skill: String) = with(binding) {
            textSkill.text = skill
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SkillHolder {
        return SkillHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.skill_element, parent, false)
        )
    }

    override fun getItemCount(): Int {
        return skills.size
    }

    override fun onBindViewHolder(holder: SkillHolder, position: Int) {
        holder.bind(skills[position])
    }

    @SuppressLint("NotifyDataSetChanged")
    fun setData(newSkills: ArrayList<String>) {
        skills.clear()
        skills.addAll(newSkills)
        notifyDataSetChanged()
    }
}