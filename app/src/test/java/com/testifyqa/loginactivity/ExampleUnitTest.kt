package com.testifyqa.loginactivity

import androidx.test.core.app.launchActivity
import androidx.test.espresso.Espresso
import androidx.test.espresso.action.ViewActions.typeText
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isCompletelyDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.testifyqa.loginactivity.ui.login.LoginActivity
import org.junit.Test

import org.junit.Assert.*
import org.junit.runner.RunWith
import org.robolectric.annotation.Config

@RunWith(AndroidJUnit4::class)
@Config(instrumentedPackages = ["androidx.loader.content"])
class ExampleUnitTest {
    @Test
    fun `can enter email address in username field`() {
        launchActivity<LoginActivity>()
        Espresso.onView(withId(R.id.username))
            .perform(typeText("tomknee1@gmail.com"))
    }
}