package com.shankar.assginmentsix.ui.dashboard

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.fragment.app.Fragment
import com.shankar.assginmentsix.R
import com.shankar.assginmentsix.model.student
import com.shankar.assginmentsix.ui.home.Home

class AddStudent : Fragment() {
    private lateinit var FulName: EditText
    private lateinit var etAge: EditText
    private lateinit var rdoMale: RadioButton
    private lateinit var rdoFemale: RadioButton
    private lateinit var rdoOther: RadioButton
    private lateinit var etAdress: EditText
    private lateinit var BtnAdd: Button
    private lateinit var rdoGroup: RadioGroup
    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_dashboard, container, false)
        BindView(view)

        var gender = ""

        BtnAdd.setOnClickListener {
            rdoGroup.setOnCheckedChangeListener { _, _ ->
                gender = when {
                    rdoMale.isChecked -> {
                        "male"
                    }
                    rdoFemale.isChecked -> {
                        "female"
                    }
                    else -> {
                        "Other"
                    }
                }
            }

            Home.lstStudent.add(student(FulName.toString(), etAge.toString().toInt(), etAdress.toString(), gender))

        }
        return view
    }

    private fun BindView(view: View) {
        FulName = view.findViewById(R.id.FulName)
        etAge = view.findViewById(R.id.etAge)
        rdoMale = view.findViewById(R.id.rdoMale)
        rdoFemale = view.findViewById(R.id.rdoFemale)
        rdoOther = view.findViewById(R.id.rdoOther)
        etAdress = view.findViewById(R.id.etAdress)
        BtnAdd = view.findViewById(R.id.BtnAdd)
        rdoGroup = view.findViewById(R.id.rdoGroup)
    }
}