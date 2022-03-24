  /*-----------------------------------------------------------.
 /                    CHALLENGE CHAPTER 3                     /
'------------------------------------------------------------/

>>> Program : Aplikasi Navigation Component + Data Class
>>> Nama    : Hafizh Firdaus Yuspriana
>>> Kelas   : AND - 5

>>> Android Engineering - Binar Academy - MBKM Batch 2
------------------------------------------------------------ */

package andlima.hafizhfy.challengetiga

import android.os.Parcel
import android.os.Parcelable

data class UserData(
    val nama : String?,
    val usia : Int,
    val alamat : String?,
    val pekerjaan : String?
) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readInt(),
        parcel.readString(),
        parcel.readString()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(nama)
        parcel.writeInt(usia)
        parcel.writeString(alamat)
        parcel.writeString(pekerjaan)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<UserData> {
        override fun createFromParcel(parcel: Parcel): UserData {
            return UserData(parcel)
        }

        override fun newArray(size: Int): Array<UserData?> {
            return arrayOfNulls(size)
        }
    }
}
