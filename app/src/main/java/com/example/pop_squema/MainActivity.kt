package com.example.pop_squema

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.pop_squema.databinding.ActivityMainBinding
import com.example.pop_squema.ui.fragment.HomeFragment
import com.example.pop_squema.ui.fragment.CriarFragment
import com.example.pop_squema.ui.fragment.LixeiraFragment
import com.example.pop_squema.ui.fragment.PastasFragment

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        replaceFragment(HomeFragment())

        //binding.title.setOnClickListener{
           // homeFragment()
       // }

        binding.bottomNavigationView4.setOnItemReselectedListener {
            when (it.itemId) {

                R.id.criar -> {
                    replaceFragment(CriarFragment())
                }

                R.id.pastas -> {
                    replaceFragment(PastasFragment())
                }

                R.id.lixeira ->{
                    LixeiraFragment()
                }
            }
        }



    }

    private fun replaceFragment(fragment : Fragment){

        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.frameLayout2,fragment)
        fragmentTransaction.commit()


    }
}