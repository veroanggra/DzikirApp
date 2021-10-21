package com.veronica.idn.dzikirapp.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.veronica.idn.dzikirapp.R
import com.veronica.idn.dzikirapp.databinding.ActivityDzikirPagiPetangBinding
import com.veronica.idn.dzikirapp.model.DzikirDoa

class DzikirPagiPetangActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var pagiPetangBinding: ActivityDzikirPagiPetangBinding
    private var listDzikirDoa: ArrayList<DzikirDoa> = arrayListOf()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        pagiPetangBinding = ActivityDzikirPagiPetangBinding.inflate(layoutInflater)
        setContentView(pagiPetangBinding.root)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        pagiPetangBinding.cvDzikirPagi.setOnClickListener(this)
        pagiPetangBinding.cvDzikirPetang.setOnClickListener(this)
        pagiPetangBinding.btnDzikirPagi.setOnClickListener(this)
        pagiPetangBinding.btnDzikirPetang.setOnClickListener(this)
    }

    override fun onClick(p0: View?) {
        when (p0?.id) {
            R.id.cvDzikirPagi -> startActivity(PagiActivity.getLaunchService(this))
            R.id.cvDzikirPetang -> startActivity(PetangActivity.getLaunchService(this))
            R.id.btnDzikirPagi -> startActivity(PagiActivity.getLaunchService(this))
            R.id.btnDzikirPetang -> startActivity(PetangActivity.getLaunchService(this))
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return super.onSupportNavigateUp()
    }
}