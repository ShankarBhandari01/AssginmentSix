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



class HomeFragment : Fragment() {

    private lateinit var homeViewModel: HomeViewModel
    private var lstStudent=ArrayList<student>()
    private lateinit var homeRE:RecyclerView
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        homeViewModel =
            ViewModelProvider(this).get(HomeViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_home, container, false)
        homeRE= root.findViewById(R.id.homeRE)
        LoadAcotors()
        val adapter = studentAdapter(lstStudent,inflater.context)
       homeRE.layoutManager= LinearLayoutManager(inflater.context)
       homeRE.adapter=adapter
        return root



    }

    private fun LoadAcotors(){
        lstStudent.add(student("Shankar Bhandari",21,"Kalopool","Male"))
        lstStudent.add(student("Hari Bhandari",21,"Kalopool","Male"))
    }
}