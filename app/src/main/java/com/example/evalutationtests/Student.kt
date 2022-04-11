package com.example.evalutationtests

class Student(name: String) : User(name) {

    fun listStudents(){

        val names = listOf("Antonin", "Alexis", "Yoan");

        for (name in names) {
            println("Etudiants : $name");
        }

    }
}
