package com.shankar.assginmentsix.model

import android.os.Parcel
import android.os.Parcelable
import androidx.lifecycle.ViewModel

class student (
val StudentName:String?=null,
val age:Int?=null,
val address:String?=null,
val gender:String?=null,
): ViewModel(),Parcelable{
    constructor(parcel: Parcel) : this(
            parcel.readString(),
            parcel.readValue(Int::class.java.classLoader) as? Int,
            parcel.readString(),
            parcel.readString()) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(StudentName)
        parcel.writeValue(age)
        parcel.writeString(address)
        parcel.writeString(gender)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<student> {
        var lstStudentData = arrayListOf<student>();
        fun getStudent(): ArrayList<student> {
            return lstStudentData;
        }
        fun setStudent(lstStudentData: ArrayList<student>) {
            student.lstStudentData = lstStudentData;
        }
        override fun createFromParcel(parcel: Parcel): student {
            return student(parcel)
        }

        override fun newArray(size: Int): Array<student?> {
            return arrayOfNulls(size)
        }
    }

}
