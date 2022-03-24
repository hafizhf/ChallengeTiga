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
import kotlinx.android.synthetic.main.fragment_screen_empat.*

class ScreenEmpatFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_screen_empat, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Dari ScreenTigaFragment -----------------------------------------------------------------
        val nama = arguments?.getString("NAMA")

        // Action Button ---------------------------------------------------------------------------
        btn_backtoscreen3.setOnClickListener {
            // Get dari EditText -------------------------------------------------------------------
            val usia = et_usia.text.toString().toInt()
            val alamat = et_alamat.text.toString()
            val pekerjaan = et_pekerjaan.text.toString()

            // Input data ke data class ------------------------------------------------------------
            val userData = UserData(nama, usia, alamat, pekerjaan)

            // Input data untuk dikirim kembali ke ScreenTigaFragment ------------------------------
            val data = bundleOf("USER_DATA" to userData)

            // Start perpindahan fragment ----------------------------------------------------------
            Navigation.findNavController(view).navigate(
                R.id.action_screenEmpatFragment_to_screenTigaFragment,
                data
            )
        }
    }
}