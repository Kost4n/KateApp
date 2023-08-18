package ru.kost4n.kateapp.calendar

import android.view.View
import android.widget.TextView
import com.kizitonwose.calendar.view.ViewContainer
import ru.kost4n.kateapp.R

class DayViewContainer(view: View) : ViewContainer(view) {
    val textView = view.findViewById<TextView>(R.id.calendarDayText)

}