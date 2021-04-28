package com.decagon.android.sq007

import android.os.Bundle
import androidx.annotation.StyleRes
import androidx.core.os.bundleOf
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.setFragmentResult
import androidx.fragment.app.setFragmentResultListener
import androidx.fragment.app.testing.launchFragmentInContainer
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import org.junit.Assert.*
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4ClassRunner::class)
class ProfileFragmentTest {

    @Test
    fun test_Is_Profile_Fragment_InView() {
        //Launch profile fragment
        launchFragmentInContainer<ProfileFragment>(themeResId = R.style.Theme_DecagonAndroid007)
        //Verify that profile fragment is displayed
        onView(withId(R.id.profileFragment)).check(matches(isDisplayed()))
    }

    @Test
    fun test_Is_Profile_Title_InView_And_Displayed_Correctly() {
        //Launch profile fragment
        launchFragmentInContainer<ProfileFragment>(themeResId = R.style.Theme_DecagonAndroid007)
        //Verify that profile fragment is displayed
        onView(withId(R.id.profileFragment)).check(matches(isDisplayed()))
        //Verify that profile title matches expected text
        onView(withId(R.id.profileTitle)).check(matches(withText(R.string.profile_fragment_title)))
    }

    @Test
    fun test_Are_All_TextViews_Visible() {
        //Launch profile fragment
        launchFragmentInContainer<ProfileFragment>(themeResId = R.style.Theme_DecagonAndroid007)
        //verify that all text views in profile fragment are displayed
        onView(withId(R.id.nameTitle)).check(matches(isDisplayed()))
        onView(withId(R.id.profileName)).check(matches(isDisplayed()))
        onView(withId(R.id.emailTitle)).check(matches(isDisplayed()))
        onView(withId(R.id.profileEmail)).check(matches(isDisplayed()))
        onView(withId(R.id.phoneTitle)).check(matches(isDisplayed()))
        onView(withId(R.id.profilePhone)).check(matches(isDisplayed()))
        onView(withId(R.id.genderTitle)).check(matches(isDisplayed()))
        onView(withId(R.id.profileGender)).check(matches(isDisplayed()))
    }

}