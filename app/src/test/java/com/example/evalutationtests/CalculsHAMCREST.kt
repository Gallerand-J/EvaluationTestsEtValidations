package com.example.evalutationtests

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.Assert
import org.junit.Test

class CalculsHAMCREST {

    var calc = Calculs()

    @Test
    fun add(){
        MatcherAssert.assertThat(calc.add(2, 3), CoreMatchers.equalTo(5))

    }

    @Test
    fun sub(){
        MatcherAssert.assertThat(calc.sub(10, 5), CoreMatchers.equalTo(5))

    }

    @Test
    fun div(){
        MatcherAssert.assertThat(calc.div(25, 5), CoreMatchers.equalTo(5))

    }

    @Test
    fun mul() {
        MatcherAssert.assertThat(calc.mul(5, 5), CoreMatchers.equalTo(25))

    }

}