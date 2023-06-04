package com.example.easy_finder.TestUtil

import com.google.common.truth.Truth.assertThat
import org.junit.Test

class JobScheduleUtilTest{
    @Test
    fun empty_description_return_false(){
        val result=JobScheduleUtil.validateScheduleInput(
            ""
        )
        assertThat(result).isFalse()
        
    }

}