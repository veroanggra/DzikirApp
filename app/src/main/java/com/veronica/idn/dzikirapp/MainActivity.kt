package com.veronica.idn.dzikirapp

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.core.content.ContextCompat
import androidx.viewpager2.widget.ViewPager2
import com.veronica.idn.dzikirapp.adapter.ArtikelAdapter
import com.veronica.idn.dzikirapp.adapter.OnItemClickCallback
import com.veronica.idn.dzikirapp.databinding.ActivityMainBinding
import com.veronica.idn.dzikirapp.model.Artikel

class MainActivity : AppCompatActivity() {
    private lateinit var mainBinding: ActivityMainBinding
    private var artikelArray: ArrayList<Artikel> = arrayListOf()
    private var dotsCount = 0
    private lateinit var dotsSlider: Array<ImageView?>

    private val slidingCallback = object : ViewPager2.OnPageChangeCallback() {
        override fun onPageSelected(position: Int) {
            for (dot in 0 until dotsCount) {
                dotsSlider[dot]?.setImageDrawable(
                    ContextCompat.getDrawable(
                        applicationContext, R.drawable.non_active_dot
                    )
                )
            }
            dotsSlider[position]?.setImageDrawable(
                ContextCompat.getDrawable(
                    applicationContext, R.drawable.active_dot
                )
            )
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mainBinding.root)
        supportActionBar?.hide()
        initData()
        initView()
        setUpViewPager()
    }

    private fun setUpViewPager() {
        val artikelAdapter = ArtikelAdapter(artikelArray)
        artikelAdapter.setOnItemClickCallback(object : OnItemClickCallback {
            override fun onItemClicked(data: Artikel) {
            }
        })

        mainBinding.vpArtikel.apply {
            adapter = artikelAdapter
            registerOnPageChangeCallback(slidingCallback)
        }
        dotsCount = artikelArray.size
        dotsSlider = arrayOfNulls(dotsCount)
        for (i in 0 until dotsCount) {
            dotsSlider[i] = ImageView(this)
            dotsSlider[i]?.setImageDrawable(
                ContextCompat.getDrawable(
                    applicationContext,
                    R.drawable.non_active_dot
                )
            )
            val params = LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
            )
            params.setMargins(8, 0, 8, 0)
            mainBinding.llSlider.addView(dotsSlider[i], params)
        }
        dotsSlider[0]?.setImageDrawable(
            ContextCompat.getDrawable(
                applicationContext,
                R.drawable.active_dot
            )
        )
    }

    override fun onDestroy() {
        super.onDestroy()
        mainBinding.vpArtikel.unregisterOnPageChangeCallback(slidingCallback)
    }

    private fun initView() {
        mainBinding.llDzikirDoaShalat.setOnClickListener { }
        mainBinding.llDzikirDoaHarian.setOnClickListener { }
        mainBinding.llDzikirSetiapSaat.setOnClickListener { }
        mainBinding.llDzikirPagiPetang.setOnClickListener { }
    }

    private fun initData() {
        val image = resources.obtainTypedArray(R.array.img_artikel)
        val title = resources.getStringArray(R.array.title_artikel)
        val desc = resources.getStringArray(R.array.desc_artikel)
        artikelArray.clear()
        for (data in title.indices) {
            artikelArray.add(
                Artikel(
                    image.getResourceId(data, 0),
                    title[data],
                    desc[data]
                )
            )
        }
        image.recycle()
    }

    companion object {
        fun getLaunchService(from: Context) =
            Intent(from, MainActivity::class.java).apply {
                addFlags(
                    Intent.FLAG_ACTIVITY_NEW_TASK
                            or Intent.FLAG_ACTIVITY_CLEAR_TASK
                )
            }
    }
}