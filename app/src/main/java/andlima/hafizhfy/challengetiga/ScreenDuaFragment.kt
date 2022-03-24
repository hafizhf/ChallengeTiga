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
import kotlinx.android.synthetic.main.fragment_screen_dua.*

class ScreenDuaFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_screen_dua, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btn_gotoscreen3.setOnClickListener {
            // Get nama dari EditText --------------------------------------------------------------
            val inputNama = et_nama.text.toString()

            // Input nama untuk dikirim ke fragment selanjutnya ------------------------------------
            val dataNama = bundleOf("NAMA" to inputNama)

            // Start perpindahan fragment ----------------------------------------------------------
            Navigation.findNavController(view).navigate(
                R.id.action_screenDuaFragment_to_screenTigaFragment,
                dataNama
            )
        }
    }
}