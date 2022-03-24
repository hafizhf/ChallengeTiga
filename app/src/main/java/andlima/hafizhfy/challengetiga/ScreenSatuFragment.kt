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
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_screen_satu.*

class ScreenSatuFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_screen_satu, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Action Button ---------------------------------------------------------------------------
        btn_gotoscreen2.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_screenSatuFragment_to_screenDuaFragment)
        }
    }
}