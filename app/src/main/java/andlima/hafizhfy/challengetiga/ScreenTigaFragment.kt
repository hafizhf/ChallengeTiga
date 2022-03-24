  /*-----------------------------------------------------------.
 /                    CHALLENGE CHAPTER 3                     /
'------------------------------------------------------------/

>>> Program : Aplikasi Navigation Component + Data Class
>>> Nama    : Hafizh Firdaus Yuspriana
>>> Kelas   : AND - 5

>>> Android Engineering - Binar Academy - MBKM Batch 2
------------------------------------------------------------ */

package andlima.hafizhfy.challengetiga

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_screen_tiga.*

class ScreenTigaFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_screen_tiga, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Dari ScreenDuaFragment ------------------------------------------------------------------
        val getNama = arguments?.getString("NAMA")
        tv_show_nama.text = getNama

        // Dari ScreenEmpatFragment ----------------------------------------------------------------
        val getData = arguments?.getParcelable("USER_DATA") as UserData?

        // Cek data dari ScreenEmpatFragment -------------------------------------------------------
        if (getData != null) {
            // Cek keganjilan usia -----------------------------------------------------------------
            val isUsiaGanjilGenap = if (getData.usia % 2 == 0) {
                "Genap"
            } else {
                "Ganjil"
            }

            // Show visibility show_more_data ------------------------------------------------------
            show_more_data.visibility = View.VISIBLE

            // Show more data dari ScreenEmpatFragment ---------------------------------------------
            tv_show_nama.text = getData.nama
            tv_show_usia.text = getData.usia.toString()
            tv_show_usia.append(", bernilai $isUsiaGanjilGenap")
            tv_show_alamat.text = getData.alamat
            tv_show_pekerjaan.text = getData.pekerjaan
        }

        // Action Button ---------------------------------------------------------------------------
        btn_gotoscreen4.setOnClickListener {
            val dataNama = bundleOf("NAMA" to getNama)
            Navigation.findNavController(view).navigate(
                R.id.action_screenTigaFragment_to_screenEmpatFragment2,
                dataNama
            )
        }
    }
}