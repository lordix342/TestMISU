package com.pride.testmisu.clases

data class Doctor(
    val img: Int,
    val name: String,
    val special: String,
    val location: String,
    val skill: ArrayList<String>,
    val description: String
)
