package com.example.evalutationtests

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.Assert
import org.junit.Before
import org.junit.Test

class StudentHAMCREST {
    private var listStudents: MutableList<Student>? = null

    @Before
    fun setup() {
        listStudents = mutableListOf()

    }

    @Test
    fun addUser(){
        listStudents?.add(Student("Julien"))
        MatcherAssert.assertThat(listStudents!!.size, CoreMatchers.equalTo(1))
    }

    @Test
    fun deleteUser(){
        listStudents?.remove(Student("Julien"))
        MatcherAssert.assertThat(listStudents!!.size, CoreMatchers.equalTo(0)) //Hamcrest

    }

    @Test
    fun updateUser(){
        MatcherAssert.assertThat(listStudents!!.size, CoreMatchers.equalTo(1))
        val user = listStudents!![0]
        user.name = "Julien2"
        MatcherAssert.assertThat(listStudents!![0].name, CoreMatchers.equalTo("Julien2"))
    }
}