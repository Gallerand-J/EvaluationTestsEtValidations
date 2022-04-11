package com.example.evalutationtests

import junit.framework.Assert.assertEquals
import junit.framework.TestCase.assertEquals
import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.Assert
import org.junit.Test
import org.junit.Assert.*
import org.junit.Before


class UserJUnit {

    private var users: MutableList<Users>? = null

    @Before
    fun setup() {
        users = mutableListOf()
        //addUser()
    }

    @Test
    fun addUser() {
        users?.add(Users(1, "Julien", 28))
        Assert.assertEquals(1, users!!.size)
    }

    @Test
    fun deleteUser() {
        users?.remove(Users(1, "Julien", 28))
        Assert.assertEquals(0, users!!.size)  // JUnit
    }

    @Test
    fun updateUser() {
        Assert.assertEquals(1, users!!.size)
        val user = users!![0]
        user.name = "Julien2"
        val age = users!![0]
        user.age = 30
        Assert.assertEquals("Julien", users!![0].name)
        Assert.assertEquals(28, users!![0].age)
    }
}
