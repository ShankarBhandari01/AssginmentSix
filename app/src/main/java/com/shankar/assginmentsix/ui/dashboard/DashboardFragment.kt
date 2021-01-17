package com.shankar.assginmentsix.ui.dashboard

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.shankar.assginmentsix.R
import com.shankar.assginmentsix.model.student

class DashboardFragment : Fragment() {
private lateinit var dashboardViewModel: DashboardViewModel
private lateinit var FulName:EditText
private lateinit var etAge:EditText
private lateinit var rdoMale:RadioButton
private lateinit var rdoFemale:RadioButton
private lateinit var rdoOther:RadioButton
private lateinit var etAdress:EditText
private lateinit var BtnAdd:Button
private lateinit var rdoGroup:RadioGroup
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        dashboardViewModel =
            ViewModelProvider(this).get(DashboardViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_dashboard, container, false)
        var gender:String?=null
        FulName= root.findViewById(R.id.FulName)
        etAge=root.findViewById(R.id.etAge)
        rdoMale=root.findViewById(R.id.rdoMale)
        rdoFemale=root.findViewById(R.id.rdoFemale)
        rdoOther= root.findViewById(R.id.rdoOther)
        etAdress=root.findViewById(R.id.etAdress)
        BtnAdd=root.findViewById(R.id.BtnAdd)
        rdoGroup=root.findViewById(R.id.rdoGroup)

       rdoGroup.setOnCheckedChangeListener { _, checkedId ->
           gender = when (checkedId) {
               R.id.rdoMale -> {
                   rdoMale.toString()

               }
               R.id.rdoFemale -> {
                   rdoFemale.toString()
               }
               else -> {
                   rdoOther.toString()
               }
           }
       }
        BtnAdd.setOnClickListener {
           student(FulName.toString(),etAge.toString().toInt(),etAdress.toString(),gender.toString())
            rdoGroup.clearCheck()
        }
        return root
    }
}