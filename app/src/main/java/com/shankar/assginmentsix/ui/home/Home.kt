package com.shankar.assginmentsix.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.shankar.assginmentsix.Dashboard
import com.shankar.assginmentsix.R
import com.shankar.assginmentsix.adapter.studentAdapter
import com.shankar.assginmentsix.model.student


class Home : Fragment() {
    private var lstStudent = ArrayList<student>()
    private lateinit var homeRE: RecyclerView
    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_home, container, false)
        homeRE = view.findViewById(R.id.homeRE)
        LoadAcotors()
        val adapter = studentAdapter(lstStudent, inflater.context)
        homeRE.layoutManager = LinearLayoutManager(inflater.context)
        homeRE.adapter = adapter
        return view


    }

    private fun LoadAcotors() {
        lstStudent.add(student("Shankar Bhandari", 21, "Kalopool", "Male"))
        lstStudent.add(student("Hari Bhandari", 23, "Sukedhara", "Male"))
        lstStudent.add(student("Ram Bhandari", 20, "Chabahill", "Male"))
    }

    companion object {
        var lstStudent = ArrayList<student>();
    }
}