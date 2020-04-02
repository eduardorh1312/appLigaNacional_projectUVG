package com.example.appliganacional

import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AppCompatActivity
import com.github.sundeepk.compactcalendarview.CompactCalendarView
import com.github.sundeepk.compactcalendarview.CompactCalendarView.CompactCalendarViewListener
import com.github.sundeepk.compactcalendarview.domain.Event
import java.text.SimpleDateFormat
import java.util.*


class Jornada : AppCompatActivity() {
    var compactCalendar: CompactCalendarView? = null
    private val dateFormatMonth =
        SimpleDateFormat("MMMM- yyyy", Locale.getDefault())

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val actionBar: ActionBar? = supportActionBar
        actionBar?.setDisplayHomeAsUpEnabled(false)
        actionBar?.setTitle("9")
        compactCalendar =
            findViewById<View>(R.id.compactcalendar_view) as CompactCalendarView
        compactCalendar!!.setUseThreeLetterAbbreviation(true)

        //Set an event for Teachers' Professional Day 2016 which is 21st of October
        val ev1 =
            Event(
                Color.RED,
                1477040400000L,
                "Teachers' Professional Day"
            )
        compactCalendar!!.addEvent(ev1)
        compactCalendar!!.setListener(object : CompactCalendarViewListener {
            override fun onDayClick(dateClicked: Date) {
                val context = applicationContext
                if (dateClicked.toString().compareTo("Fri Oct 21 00:00:00 AST 2016") == 0) {
                    Toast.makeText(context, "Teachers' Professional Day", Toast.LENGTH_SHORT).show()
                } else {
                    Toast.makeText(context, "No Events Planned for that day", Toast.LENGTH_SHORT)
                        .show()
                }
            }

            override fun onMonthScroll(firstDayOfNewMonth: Date) {
                actionBar?.setTitle(dateFormatMonth.format(firstDayOfNewMonth))
            }
        })
    }
}