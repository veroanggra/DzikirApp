package com.veronica.idn.dzikirapp.model

object DataDzikirDoa {
    private val descQauliyah = arrayOf(
        "Membaca do'a istiftah:",
        "Membaca isti'adzah setelah membaca do'a istiftah:",
        "Mengucapkan aamiin begitu selesai membaca Surat Al-Fatihah:",
        "Membaca surat Al-Qur'an setelah selesai membaca Al-Fatihah:",
        "Membaca tasbih saat ruku' dan sujud:",
        "Membaca do'a iktidal (bangkit dari ruku):",
        "Membaca do'a di antara 2 sujud:",
        "Mengucapkan shalawat atas Nabi Shallallahu 'alaihi wa sallam setelah tasyahhud awal:",
        "Membaca do'a baik setelah tasyahud awal maupun kedua:",
        "Mengucapkan salam yang kedua:"
    )

    private val lafazQauliyah = arrayOf(
        "اَللَّهُمَّ بَاعِدْ بَيْنِى وَبَيْنَ خَطَايَاىَ كَمَا بَاعَدْتَ بَيْنَ الْمَشْرِقِ وَالْمَغْرِبِ . اللَّهُمَّ نَقِّنِى مِنَ الْخَطَايَا كَمَا يُنَقَّى الثَّوْبُالأَبْيَضُ مِنَ الدَّنَسِ . اللَّهُمَّ اغْسِلْ خَطَايَاىَ بِالْمَاءِ وَالثَّلْجِ وَالْبَرَدِِ",
        "أَعُوْذُ بِـاللهِ السَّمِيْعِ الْعَلِيْمِ مِنَ الشَّيْطَانِ الرَّجِيْمِ مِنْ هَمْزِهِ وَنَفْخِهِ وَنَفَثِهِ",
        "آمِيْن",
        "Dari Abu Qatadah Radhiyallahu anhu, dia berkata:\n\"Pada dua raka'at pertama shalat Zhuhur, Nabi Shallallahu 'alaihim membaca al-Faatihah dan dua surat. Beliau memanjangkan raka'at pertama dan memendekkan raka'at kedua. Terkadang beliau memperdengarkan (bacaan) ayatnya. Pada dua raka'at pertama shalat 'Ashar beliau juga membaca al-Faatihah dan dua surat. Beliau memanjangkan raka'at pertama shalat Shubuh dan memendekkan raka'at kedua.\"",
        "Tasbih saat ruku:\nسُبْحَانَ رَبِّيَ الْعَظِيْمِ\nTasbih saat sujud:\nسُبْحَانَ رَبِّيَ اْلأَعْلَى",
        "سَمِعَ اللَّهُ لِمَنْ حَمِدَ هُ. رَبَّنَا وَلَكَ الْحَمْدُ. مِلْءَ السَّمَاوَاتِ وَمِلْءَ اْلأَرْضِ وَمَا بَيْنَهُمَا، وَمِلْءَ مَا شِئْتَ مِنْ شَيْءٍ بَعْدُ",
        "اَللّهُمَّ اغْفِرْ لِيْ وَارْحَمْنِيْ وَاجْبُرْنِيْ وَاهْدِنِيْ وَارْزُقْنِيْ",
        "اللَّهُمَّ صَلِّ عَلَى مُحَمَّدٍ وَعَلَى آلِ مُحَمَّدٍ كَمَا صَلَّيْتَ عَلَى إِبْرَاهِيمَ وَعَلَى آلِ إِبْرَاهِيمَ إِنَّكَ حَمِيدٌ مَجِيدٌ اللَّهُمَّ بَارِكْ فِي رِوَايَةٍ: وَ بَارِكْ عَلَى مُحَمَّدٍ وَعَلَى آلِ مُحَمَّدٍ كَمَا بَارَكْتَ عَلَى إِبْرَاهِيمَ وَعَلَى آلِ إِبْرَاهِيمَ إِنَّكَ حَمِيدٌ مَجِيدٌ",
        "اَلتَّحِيَّاتُ للهِ، وَالصَّلَوَاتُ وَالطَّيِّبَـاتُ، اَلسَّلاَمُ عَلَيْكَ أَيُّهَا النَّبِيُّ وَرَحْمَةُ اللهِ وَبَرَكَاتُهُ، اَلسَّلاَمُ عَلَيْنَا وَعَلى عِبَادِ اللهِ الصَّالِحِيْنَ، أَشْهَدُ أَنْ لاَ إِلهَ إِلاَّ اللهُ وَأَشْـهَدُ أَنَّ مُحَمَّدًا عَبْدُهُ وَرَسُوْلُهُ. ثُمَّ لِيَتَّخِيْرَ أَحَدُكُمْ مِنَ الدُّعَاءِ أَعْجَبُهُ إِلَيْهِ، فَلْيَدْعُ رَبَّهُ عزوجل.",
        "Salam yang pertama:\n اَلسَّلاَمُ عَلَيْكُمْ وَرَحْمَةُ اللهِ وَبَرَكَاتُهُ\nSalam yang kedua:\nاَلسَّلاَمُ عَلَيْكُمْ وَرَحْمَ"
    )

    private val terjemahQauliyah = arrayOf(
        "\"Ya Allah, jauhkanlah antara aku dan dosaku sebagaimana Kau jauhkan antara timur dan barat. Ya Allah, sucikanlah aku dari dosa-dosaku sebagaimana kain putih tersuci dari noda. Ya Allah, basuhlah aku dari dari dosa-dosaku dengan salju, air, dan es (embun).\"",
        "\"Aku berlindung kepada Allah Yang Maha Mendengar lagi Maha Melihat dari syaitan yang terkutuk, dari bisikan, tiupan, dan godaannya.\"",
        "\"Ya Allah, kabulkanlah do'a kami.\"",
        "\"Shahih: [Shahiih Sunan an-Nasa-i (no. 932)] dan Shahiih al-Bukhari (Fat-hul Baari) (II/243 no. 759).\"",
        "Tasbih saat ruku:\n\"Mahasuci Rabb-ku Yang Mahaagung.\"\n\nTasbih saat sujud:\n\"Mahasuci Rabb-ku Yang Mahatinggi.\"",
        "\"Allah Maha Mendengar orang yang memuji-Nya. bagi-Mu-lah segenap pujian yang baik dan penuh berkah. Sebagaimana yang disukai Rabb kami dan di-ridhai-Nya.\"",
        "\"Ya Allah, ampunilah aku, sayangilah aku, cukupilah kekuranganku, tunjukilah aku dan karuniakanlah rizki kepadaku.\"",
        "\"Ya, Allah. Berilah (yakni, tambahkanlah) shalawat (sanjungan) kepada Muhammad dan kepada keluarga Muhammad, sebagaimana Engkau telah memberi shalawat kepada Ibrahim dan kepada keluarga Ibrahim, sesungguhnya Engkau Maha Terpuji (lagi) Maha Mulia. Ya, Allah. Berilah berkah (tambahan kebaikan) kepada Muhammad dan kepada keluarga Muhammad, sebagaimana Engkau telah memberi berkah kepada Ibrahim dan kepada keluarga Ibrahim, sesungguhnya Engkau Maha Terpuji (lagi) Maha Mulia.\"",
        "\"Segala penghormatan hanya bagi Allah. Begitupula seluruh pengagungan dan kebaikan. Semoga kesejahteraan terlimpahkan atas engkau, wahai Nabi. Begitupula kasih sayang Allah dan berkah-Nya. Mudah-mudahan kesejahteraan tercurahkan atas kita semua dan para hamba Allah yang shalih. Aku bersaksi tidak ada ilah yang layak diibadahi selain Allah. Dan aku bersaksi bahwa Muhammad adalah hamba dan Rasul-Nya. Setelah itu, hendaklah salah seorang di antara kalian memilih do'a yang paling ia sukai lalu hendaklah ia berdo'a kepada Rabb-nya Azza wa Jalla.\n",
        "Salam yang pertama:\n\"Semoga kesejahteraan terlimpahkan atas kamu sekalian, begitu pula rahmat Allah dan berkah-Nya.\n\nSalam yang kedua:\n\"Semoga kesejahteraan dan rahmat Allah tercurahkan kepada kamu sekalian\""
    )

    val listQauliyah: ArrayList<DzikirDoa>
        get() {
            val list = arrayListOf<DzikirDoa>()
            for (position in descQauliyah.indices) {
                val qauliyah = DzikirDoa()
                qauliyah.desc = descQauliyah[position]
                qauliyah.lafaz = lafazQauliyah[position]
                qauliyah.terjemah = terjemahQauliyah[position]
                list.add(qauliyah)
            }
            return list
        }

    private val descDzikir = arrayOf(
        "Tahlil",
        "Takbir",
        "Tahmid",
        "Tasbih",
        "Hauqolah",
        "Istighfar",
        "Shalawat"
    )

    private val lafazDzikir = arrayOf(
        "Pertama:\n لا إله إلا الله\nKedua:\nلَا إِلَـهَ إِلَّا اللهُ وَحْدَهُ لَا شَرِيْكَ لَهُلَهُ الْمُلْكُ وَلَهُ الْحَمْدُ وَهُوَ عَلَى كُلِّ شَيْءٍ قَدِيْرُ",
        "Umum:\nالله ُأَكبَرُ\nTakbir Hari Raya yang Diriwayatkan oleh\nJabir bin Abdillah:\nالله أكبر، الله أكبر، الله أكبر، لا إله إلا الله، والله أكبر، الله أكبر، ولله الحمد\nAbdullah bin Mas'ud:\nالله أكبر، الله أكبر، لا إله إلا الله، والله أكبر، الله أكبر، ولله الحمد\nIbnu Abbas:\nالله ُأَكبَرُ ، الله ُأَكبَرُ ، الله ُأَكبَرُ ، و للهِ الحَمدُ ، الله ُأَكبَرُ و أَجَلُّ ، الله ُأَكبَرُ عَلَى مَا هَدَانَا\nSalman:\nالله ُأَكبَرُ ، الله ُأَكبَرُ ، الله ُأَكبَرُ  كَبِيراً",
        "Pertama:\nالحمد لله\nKedua:\nالحمد لله رب العالمين\nKetiga:\nالحمد لله حمدا كثيرا طيبا مباركا فيه\nKeempat:\nربنا لك الحد\nKelima:\nاللهم ربنا لك الحمد",
        "Pertama:\nسُبْحَانَ اللهِ\nKedua:\nسُبْحَانَ رَبِّىَ الْعَظِيمِ\nKetiga:\nسُبُّوحٌ قُدُّوسٌ رَبُّ الْمَلاَئِكَةِ وَالرُّوحِ\nKeempat:\nسُبْحَانَ ذِي الجَبَرُوْتِ وَالملَكُوْتِ وَالكِبْرِيَاء ِوَالعَظَمَةِ\nKelima:\nسُبْحَانَ رَبِّىَ الأَعْلَ",
        "لاحول ولا قوة الا بالله",
        "Pertama:\nأَسْتَغْفِرُ اللهَ\nKedua:\nأَسْتَغْفِرُ اللهَ وَأَتُوبُ إِلَيْهِ\nKetiga:\nأَسْتَغْفِرُ اللَّهَ الْعَظِيمَ الَّذِي لَا إِلَهَ إِلَّا هُوَ الْحَيَّ الْقَيُّومَ وَأَتُوبُ إِلَيْه\nKeempat:\nرَبِّ اغْفِرْ لِى وَتُبْ عَلَىَّ إِنَّكَ أَنْتَ التَّوَّابُ الرَّحِيمُ",
        "اللَّهُّم صلِّ على محمدٍ وعلى آل محمد كما صلَّيْتَ على إبراهيم وعلى آل إبراهيم إنك حميد مجيد، اللَّهُّم بارِكْ على محمدٍ وعلى آل محمد كما باركتَ على إبراهيم وعلى آل إبراهيم إنك حميدٌ مجيد"
    )

    private val terjemahDzikir = arrayOf(
        "Pertama:\n\"Tidak ada ilah yang berhak disembah selain Allah semata.\"\n\nKedua:\n\"Tidak ada ilah yang berhak disembah selain Allah semata, tidak ada sekutu bagi-Nya. Milik Allah segala kerajaan dan pujian. Dia lah yang berkuasa atas segala sesuatu.\"",
        "Umum: \n\"Allah Maha Besar\"\n\nTakbir Hari Raya yang Diriwayatkan oleh\nJabir bin Abdillah:\n\"Allah Maha Besar, Allah Maha Besar, Allah Maha Besar, tidak ada ilah yang berhak disembah selain Allah, dan Allah Maha Besar, Allah Maha Besar dan segala puji bagi hanya Allah.\"\n\nAbdullah bin Mas'ud:\n\"Allah Maha Besar, Allah Maha Besar, tidak ada ilah yang berhak disembah selain Allah, dan Allah Maha Besar, Allah Maha Besar dan segala puji bagi hanya Allah.\"\n\nIbnu Abbas:\n\"Allah Maha Besar, Allah Maha Besar, Allah Maha Besar, dan Allah lah segala pujian, Allah Maha Besar dan Maha Mulia, Allah Maha Besar atas petunjuk yang diberikannya pada kita.\"\n\nSalman:\n\"Allah Maha Besar, Allah Maha Besar, Allah Maha Besar\"",
        "Pertama:\n\"Segala puji bagi Allah\"\n\nKedua:\n\"Segala puji bagi Allah, Tuhan seluruh alam.\"\n\nKetiga:\n\"Segala puji bagi Allah, pujian yang berlimpah, baik dan berkah.\"\n\nKeempat:\n\"Wahai Rabb kami, segala puji bagi-Mu.\"\n\nKelima:\n\"Ya Allah, Rabb kami, segala puji bagi-Mu.\"",
        "Pertama:\n\"Maha Suci Allah\"\n\nKedua:\n\"Maha Suci Allah Yang Maha Agung\"\n\nKetiga:\n\"Maha Suci Allah Rabb para Malaikat dan Ar Ruuh (Jibril)\"\n\nKeempat:\n\"Maha Suci Allah Yang mempunyai keperkasaan dan kerajaan (penuh) serta kesombongan dan keagungan\"\n\nKelima:\n\"Maha Suci Rabbku Yang Maha Tinggi\"",
        "\"Tidak ada daya dan upaya kecuali dengan pertolongan Allah\"",
        "Pertama:\n\"Aku memohon ampun kepada Allah\"\n\nKedua:\n\"Aku memohon maghiroh Allah dan aku bertaubat kepada-Nya\"\n\nKetiga:\n\"Aku memohon ampunan kepada Allah yang tidak ada sesembahan yang berhak disembah kecuali Dia, Yang Maha Hidup dan Maha Tegak dan aku bertaubat kepada-Nya\"\n\nKeempat:\n\"Ya Rabbku ampunilah aku dan bimbinglah aku untuk bertaubat (atau terimalah tabatku) sesungguhnya Engkau adalah Maha Penerima Taubat dan Maha Rahmat\"",
        "\"Ya Allah, semoga shalawat tercurah kepada Muhammad dan keluarga Muhammad sebagaimana tercurah pada Ibrahim dan keluarga Ibrahim, sesungguhnya Engkau Maha Terpuji lagi Maha Mulia. Ya Allah, semoga berkah tercurah kepada Muhammad dan keluarga Muhammad sebagaimana tercurah pada Ibrahim dan keluarga Ibrahim, sesungguhnya Engkau Maha Terpuji lagi Maha Mulia.\""
    )

    val listDzikir: ArrayList<DzikirDoa>
        get() {
            val list = arrayListOf<DzikirDoa>()
            for (data in descDzikir.indices) {
                val dzikir = DzikirDoa()
                dzikir.desc = descDzikir[data]
                dzikir.lafaz = lafazDzikir[data]
                dzikir.terjemah = terjemahDzikir[data]
                list.add(dzikir)
            }
            return list
        }

    private val descDzikirPagi = arrayOf(
        "Ayat Kursi Dibaca 1 kali",
        "Al-Ikhlas Dibaca 3 kali",
        "Al-Falaq Dibaca 3 kali",
        "An-Naas Dibaca 3 kali",
        "Dzikir Pagi 1 Dibaca 1x",
        "Dzikir Pagi 2 Dibaca 1x",
        "Dzikir Pagi 3 Dibaca 1x",
        "Dzikir Pagi 4 Dibaca 3x",
        "Dzikir Pagi 5 Dibaca 1x",
        "Dzikir Pagi 6 Dibaca 1x",
        "Dzikir Pagi 8 Dibaca 3x",
        "Dzikir Pagi 7 Dibaca 3x",
        "Dzikir Pagi 9 Dibaca 1x",
        "Dzikir Pagi 10 Dibaca 1x",
        "Dzikir Pagi 11 Dibaca 1x atau 10x sekali duduk atau 100x kali dalam sehari",
        "Dzikir Pagi 12 Dibaca 3x",
        "Dzikir Pagi 13 Dibaca 1x",
        "Dzikir Pagi 14 Dibaca 100x",
        "Dzikir Pagi 15 Dibaca 100x"
    )

    private val lafazDzikirPagi = arrayOf(
        "أَعُوذُ بِاللَّهِ مِنَ الشَّيْطَانِ الرَّجِيمِاللَّهُ لاَ إِلَهَ إِلاَّ هُوَ الْحَيُّ الْقَيُّومُ، لاَ تَأْخُذُهُ سِنَةٌ وَلاَ نَوْمٌ، لَهُ مَا فِي السَّمَاوَاتِ وَمَا فِي الْأَرْضِ، مَنْ ذَا الَّذِي يَشْفَعُ عِنْدَهُ إِلاَّ بِإِذْنِهِ، يَعْلَمُ مَا بَيْنَ أَيْدِيهِمْ وَمَا خَلْفَهُمْ، وَلَا يُحِيطُونَ بِشَيْءٍ مِنْ عِلْمِهِ إِلاَّ بِمَا شَاءَ، وَسِعَ كُرْسِيُّهُ السَّمَاوَاتِ وَالْأَرْضَ، وَلَا يَئُودُهُ حِفْظُهُمَا، وَهُوَ الْعَلِيُّ الْعَظِيمُ",
        "\nبِسْمِ اللَّهِ الرَّحْمَٰنِ الرَّحِيمِ \nقُلْ هُوَ اللَّهُ أَحَدٌ ﴿١﴾ اللَّهُ الصَّمَدُ ﴿٢﴾ لَمْ يَلِدْ وَلَمْ يُولَدْ ﴿٣﴾ وَلَمْ يَكُنْ لَهُ كُفُوًا أَحَدٌ ﴿٤﴾",
        "\nبِسْمِ اللَّهِ الرَّحْمَٰنِ الرَّحِيمِ \nقُلْ اَعُوْذُ بِرَبِّ الْفَلَقِۙ ﴿١﴾ مِنْ شَرِّ مَا خَلَقَۙ ﴿٢﴾ وَمِنْ شَرِّ غَاسِقٍ اِذَا وَقَبَۙ ﴿٣﴾ وَمِنْ شَرِّ النَّفّٰثٰتِ فِى الْعُقَدِۙ ﴿٤﴾ وَمِنْ شَرِّ حَاسِدٍ اِذَا حَسَدَ ﴿٥﴾",
        "\nبِسْمِ اللَّهِ الرَّحْمَٰنِ الرَّحِيمِ \nقُلْ اَعُوْذُ بِرَبِّ النَّاسِۙ ﴿١﴾ مَلِكِ النَّاسِۙ ﴿٢﴾ اِلٰهِ النَّاسِۙ ﴿٣﴾ مِنْ شَرِّ الْوَسْوَاسِ ەۙ الْخَنَّاسِۖ ﴿٤﴾ الَّذِيْ يُوَسْوِسُ فِيْ صُدُوْرِ النَّاسِۙ ﴿٥﴾ مِنَ الْجِنَّةِ وَالنَّاسِ ﴿٦﴾",
        "أَصْبَحْنَا وَأَصْبَحَ الْمُلْكُ لِلَّهِ، وَالْحَمْدُ لِلَّهِ، لاَ إِلَـهَ إِلاَّ اللهُ وَحْدَهُ لاَ شَرِيْكَ لَهُ، لَهُ الْمُلْكُ وَلَهُ الْحَمْدُ وَهُوَ عَلَى كُلِّ شَيْءٍ قَدِيْرُ. رَبِّ أَسْأَلُكَ خَيْرَ مَا فِيْ هَذَا الْيَوْمِ وَخَيْرَ مَا بَعْدَهُ، وَأَعُوْذُ بِكَ مِنْ شَرِّ مَا فِيْ هَذَا الْيَوْمِ وَشَرِّ مَا بَعْدَهُ، رَبِّ أَعُوْذُ بِكَ مِنَ الْكَسَلِ وَسُوْءِ الْكِبَرِ، رَبِّ أَعُوْذُ بِكَ مِنْ عَذَابٍ فِي النَّارِ وَعَذَابٍ فِي الْقَبْرِ",
        "اَللَّهُمَّ بِكَ أَصْبَحْنَا، وَبِكَ أَمْسَيْنَا، وَبِكَ نَحْيَا، وَبِكَ نَمُوْتُ وَإِلَيْكَ النُّشُوْرُ",
        "اَللَّهُمَّ أَنْتَ رَبِّيْ لاَ إِلَـهَ إِلاَّ أَنْتَ، خَلَقْتَنِيْ وَأَنَا عَبْدُكَ، وَأَنَا عَلَى عَهْدِكَ وَوَعْدِكَ مَا اسْتَطَعْتُ، أَعُوْذُ بِكَ مِنْ شَرِّ مَا صَنَعْتُ، أَبُوْءُ لَكَ بِنِعْمَتِكَ عَلَيَّ، وَأَبُوْءُ بِذَنْبِيْ فَاغْفِرْ لِيْ فَإِنَّهُ لاَ يَغْفِرُ الذُّنُوْبَ إِلاَّ أَنْتَ",
        "اَللَّهُمَّ عَافِنِيْ فِيْ بَدَنِيْ، اَللَّهُمَّ عَافِنِيْ فِيْ سَمْعِيْ، اَللَّهُمَّ عَافِنِيْ فِيْ بَصَرِيْ، لاَ إِلَـهَ إِلاَّ أَنْتَ. اَللَّهُمَّ إِنِّي أَعُوْذُ بِكَ مِنَ الْكُفْرِ وَالْفَقْرِ، وَأَعُوْذُ بِكَ مِنْ عَذَابِ الْقَبْرِ، لاَ إِلَـهَ إِلاَّ أَنْتَ",
        "اَللَّهُمَّ إِنِّيْ أَسْأَلُكَ الْعَفْوَ وَالْعَافِيَةَ فِي الدُّنْيَا وَاْلآخِرَةِ، اَللَّهُمَّ إِنِّيْ أَسْأَلُكَ الْعَفْوَ وَالْعَافِيَةَ فِي دِيْنِيْ وَدُنْيَايَ وَأَهْلِيْ وَمَالِيْ اللَّهُمَّ اسْتُرْ عَوْرَاتِى وَآمِنْ رَوْعَاتِى. اَللَّهُمَّ احْفَظْنِيْ مِنْ بَيْنِ يَدَيَّ، وَمِنْ خَلْفِيْ، وَعَنْ يَمِيْنِيْ وَعَنْ شِمَالِيْ، وَمِنْ فَوْقِيْ، وَأَعُوْذُ بِعَظَمَتِكَ أَنْ أُغْتَالَ مِنْ تَحْتِيْ",
        "اَللَّهُمَّ عَالِمَ الْغَيْبِ وَالشَّهَادَةِ فَاطِرَ السَّمَاوَاتِ وَاْلأَرْضِ، رَبَّ كُلِّ شَيْءٍ وَمَلِيْكَهُ، أَشْهَدُ أَنْ لاَ إِلَـهَ إِلاَّ أَنْتَ، أَعُوْذُ بِكَ مِنْ شَرِّ نَفْسِيْ، وَمِنْ شَرِّ الشَّيْطَانِ وَشِرْكِهِ، وَأَنْ أَقْتَرِفَ عَلَى نَفْسِيْ سُوْءًا أَوْ أَجُرَّهُ إِلَى مُسْلِمٍ",
        "بِسْمِ اللَّهِ الَّذِى لاَ يَضُرُّ مَعَ اسْمِهِ شَىْءٌ فِى الأَرْضِ وَلاَ فِى السَّمَاءِ وَهُوَ السَّمِيعُ الْعَلِيمُ",
        "رَضِيْتُ بِاللهِ رَبًّا، وَبِاْلإِسْلاَمِ دِيْنًا، وَبِمُحَمَّدٍ صَلَّى اللهُ عَلَيْهِ وَسَلَّمَ نَبِيًّا",
        "يَا حَيُّ يَا قَيُّوْمُ بِرَحْمَتِكَ أَسْتَغِيْثُ، أَصْلِحْ لِيْ شَأْنِيْ كُلَّهُ وَلاَ تَكِلْنِيْ إِلَى نَفْسِيْ طَرْفَةَ عَيْ",
        "أَصْبَحْنَا عَلَى فِطْرَةِ اْلإِسْلاَمِ وَعَلَى كَلِمَةِ اْلإِخْلاَصِ، وَعَلَى دِيْنِ نَبِيِّنَا مُحَمَّدٍ صَلَّى اللهُ عَلَيْهِ وَسَلَّمَ، وَعَلَى مِلَّةِ أَبِيْنَا إِبْرَاهِيْمَ، حَنِيْفًا مُسْلِمًا وَمَا كَانَ مِنَ الْمُشْرِكِيْ",
        "لاَ إِلَـهَ إِلاَّ اللهُ وَحْدَهُ لاَ شَرِيْكَ لَهُ، لَهُ الْمُلْكُ وَلَهُ الْحَمْدُ وَهُوَ عَلَى كُلِّ شَيْءٍ قَدِيْرُ",
        "سُبْحَانَ اللهِ وَبِحَمْدِهِ: عَدَدَ خَلْقِهِ، وَرِضَا نَفْسِهِ، وَزِنَةَ عَرْشِهِ وَمِدَادَ كَلِمَاتِهِ",
        "اَللَّهُمَّ إِنِّيْ أَسْأَلُكَ عِلْمًا نَافِعًا، وَرِزْقًا طَيِّبًا، وَعَمَلاً مُتَقَبَّلاً",
        "سُبْحَانَ اللهِ وَبِحَمْدِهِ",
        "أَسْتَغْفِرُ اللهَ وَأَتُوْبُ إِلَيْهِ"
    )

    private val terjemahDzikirPagi = arrayOf(
        "\"Aku berlindung kepada Allah dari godaan syaitan yang terkutuk. Allah, tidak ada ilah (yang berhak disembah) melainkan Dia, yang hidup kekal lagi terus menerus mengurus (makhluk-Nya). Dia tidak mengantuk dan tidak tidur. Kepunyaan-Nya apa yang di langit dan di bumi. Tiada yang dapat memberi syafa’at di sisi-Nya tanpa seizin-Nya. Dia mengetahui apa-apa yang di hadapan mereka dan di belakang mereka. Mereka tidak mengetahui apa-apa dari ilmu Allah melainkan apa yang dikehendaki-Nya. Kursi Allah meliputi langit dan bumi. Dia tidak merasa berat memelihara keduanya. Dan Dia Maha Tinggi lagi Maha Besar.\"",
        "\"Katakanlah: Dialah Allah Yang Maha Esa. Allah adalah ilah yang bergantung kepada-Nya segala urusan. Dia tidak beranak dan tiada pula diperanakkan. Dan tidak ada seorang pun yang setara dengan Dia.\"",
        "\"Katakanlah: Aku berlindung kepada Rabb yang menguasai Subuh. Dari kejahatan makhluk-Nya. Dan dari kejahatan malam apabila telah gelap gulita. Dan dari kejahatan wanita-wanita tukang sihir yang menghembus pada buhul-buhul. Dan dari kejahatan orang yang dengki apabila ia dengki.\"",
        "\"Katakanlah: Aku berlindung kepada Rabb manusia. Raja manusia. Sembahan manusia. Dari kejahatan (bisikan) syaitan yang biasa bersembunyi. Yang membisikkan (kejahatan) ke dalam dada manusia. Dari jin dan manusia.\"",
        "\"Kami telah memasuki waktu pagi dan kerajaan hanya milik Allah, segala puji bagi Allah. Tidak ada ilah (yang berhak disembah) kecuali Allah semata, tiada sekutu bagi-Nya. Milik Allah kerajaan dan bagi-Nya pujian. Dia-lah Yang Mahakuasa atas segala sesuatu. Wahai Rabbku, aku mohon kepada-Mu kebaikan di hari ini dan kebaikan sesudahnya. Aku berlindung kepada-Mu dari kejahatan hari ini dan kejahatan sesudahnya. Wahai Rabbku, aku berlindung kepada-Mu dari kemalasan dan kejelekan di hari tua. Wahai Rabbku, aku berlindung kepada-Mu dari siksaan di neraka dan siksaan di alam kubur.\".",
        "\"Ya Allah, dengan rahmat dan pertolongan-Mu kami memasuki waktu pagi, dan dengan rahmat dan pertolongan-Mu kami memasuki waktu petang. Dengan rahmat dan pertolongan-Mu kami hidup dan dengan kehendak-Mu kami mati. Dan kepada-Mu kebangkitan (bagi semua makhluk).\"",
        "\"Ya Allah, Engkau adalah Rabbku, tidak ada ilah yang berhak disembah kecuali Engkau, Engkaulah yang menciptakanku. Aku adalah hamba-Mu. Aku akan setia pada perjanjianku pada-Mu (yaitu aku akan mentauhidkan-Mu) semampuku dan aku yakin akan janji-Mu (berupa surga untukku). Aku berlindung kepada-Mu dari kejelekan yang kuperbuat. Aku mengakui nikmat-Mu kepadaku dan aku mengakui dosaku. Oleh karena itu, ampunilah aku. Sesungguhnya tiada yang mengampuni dosa kecuali Engkau.\"",
        "\"Ya Allah, selamatkanlah tubuhku (dari penyakit dan dari apa yang tidak aku inginkan). Ya Allah, selamatkanlah pendengaranku (dari penyakit dan maksiat atau dari apa yang tidak aku inginkan). Ya Allah, selamatkanlah penglihatanku, tidak ada Ilah yang berhak diibadahi dengan benar kecuali Engkau. Ya Allah, sesungguhnya aku berlindung kepada-Mu dari kekufuran dan kefakiran. Aku berlindung kepada-Mu dari siksa kubur, tidak ada Ilah yang berhak diibadahi dengan benar kecuali Engkau.\"",
        "\"Ya Allah, sesungguhnya aku memohon kebajikan dan keselamatan di dunia dan akhirat. Ya Allah, sesungguhnya aku memohon kebajikan dan keselamatan dalam agama, dunia, keluarga dan hartaku. Ya Allah, tutupilah auratku (aib dan sesuatu yang tidak layak dilihat orang) dan tenteramkanlah aku dari rasa takut. Ya Allah, peliharalah aku dari muka, belakang, kanan, kiri dan atasku. Aku berlindung dengan kebesaran-Mu, agar aku tidak disambar dari bawahku (oleh ular atau tenggelam dalam bumi dan lain-lain yang membuat aku jatuh).\"",
        "\"Ya Allah, Yang Maha Mengetahui yang ghaib dan yang nyata, wahai Rabb pencipta langit dan bumi, Rabb segala sesuatu dan yang merajainya. Aku bersaksi bahwa tidak ada ilah yang berhak disembah kecuali Engkau. Aku berlindung kepadaMu dari kejahatan diriku, setan dan balatentaranya (godaan untuk berbuat syirik pada Allah), dan aku (berlindung kepada-Mu) dari berbuat kejelekan terhadap diriku atau menyeretnya kepada seorang muslim.\"",
        "\"Dengan nama Allah yang bila disebut, segala sesuatu di bumi dan langit tidak akan berbahaya, Dia-lah Yang Maha Mendengar lagi Maha Mengetahui.\"",
        "\"Aku ridha Allah sebagai Rabb, Islam sebagai agama dan Muhammad shallallahu ‘alaihi wa sallam sebagai nabi.\"",
        "\"Wahai Rabb Yang Maha Hidup, wahai Rabb Yang Berdiri Sendiri (tidak butuh segala sesuatu), dengan rahmat-Mu aku minta pertolongan, perbaikilah segala urusanku dan jangan diserahkan kepadaku sekali pun sekejap mata (tanpa mendapat pertolongan dariMu).\"",
        "\"Di waktu pagi kami memegang agama Islam, kalimat ikhlas (kalimat syahadat), agama Nabi kami Muhammad shallallahu ‘alaihi wa sallam, dan agama bapak kami Ibrahim, yang berdiri di atas jalan yang lurus, muslim dan tidak tergolong orang-orang musyrik.\"",
        "\"Tidak ada ilah yang berhak disembah selain Allah semata, tidak ada sekutu bagiNya. Bagi-Nya kerajaan dan segala pujian. Dia-lah yang berkuasa atas segala sesuatu.\"",
        "\"Maha Suci Allah, aku memujiNya sebanyak makhluk-Nya, sejauh kerelaan-Nya, seberat timbangan ‘Arsy-Nya dan sebanyak tinta tulisan kalimat-Nya.\"",
        "\"Ya Allah, sungguh aku memohon kepada-Mu ilmu yang bermanfaat (bagi diriku dan orang lain), rizki yang halal dan amal yang diterima (di sisi-Mu dan mendapatkan ganjaran yang baik).\"",
        "\"Maha suci Allah, aku memuji-Nya.\"",
        "\"Aku memohon ampun kepada Allah dan bertobat kepada-Nya.\""
    )

    val listDzikirPagi: ArrayList<DzikirDoa>
        get() {
            val list = arrayListOf<DzikirDoa>()
            for (data in descDzikirPagi.indices) {
                val dzikirDoa = DzikirDoa()
                dzikirDoa.desc = descDzikirPagi[data]
                dzikirDoa.lafaz = lafazDzikirPagi[data]
                dzikirDoa.terjemah = terjemahDzikirPagi[data]
                list.add(dzikirDoa)
            }
            return list
        }

    private val descDzikirPetang = arrayOf(
        "Ayat Kursi Dibaca 1 kali",
        "Al-Ikhlas Dibaca 3 kali",
        "Al-Falaq Dibaca 3 kali",
        "An-Naas Dibaca 3 kali",
        "Dzikir Petang 1 dibaca 1x",
        "Dzikir Petang 2 dibaca 1x",
        "Dzikir Petang 3 dibaca 1x",
        "Dzikir Petang 4 dibaca 3x",
        "Dzikir Petang 5 dibaca 1x",
        "Dzikir Petang 6 dibaca 1x",
        "Dzikir Petang 7 dibaca 3x",
        "Dzikir Petang 8 dibaca 3x",
        "Dzikir Petang 9 dibaca 1x",
        "Dzikir Petang 10 dibaca 1x",
        "Dzikir Petang 11 dibaca 1x atau 10x sekali duduk atau 100x dalam sehari",
        "Dzikir Petang 12 dibaca 3x",
        "Dzikir Petang 13 dibaca 100x",
        "Dzikir Petang 14 dibaca 100x",
    )

    private val lafazDzikirPetang = arrayOf(
        "أَعُوذُ بِاللَّهِ مِنَ الشَّيْطَانِ الرَّجِيمِاللَّهُ لاَ إِلَهَ إِلاَّ هُوَ الْحَيُّ الْقَيُّومُ، لاَ تَأْخُذُهُ سِنَةٌ وَلاَ نَوْمٌ، لَهُ مَا فِي السَّمَاوَاتِ وَمَا فِي الْأَرْضِ، مَنْ ذَا الَّذِي يَشْفَعُ عِنْدَهُ إِلاَّ بِإِذْنِهِ، يَعْلَمُ مَا بَيْنَ أَيْدِيهِمْ وَمَا خَلْفَهُمْ، وَلَا يُحِيطُونَ بِشَيْءٍ مِنْ عِلْمِهِ إِلاَّ بِمَا شَاءَ، وَسِعَ كُرْسِيُّهُ السَّمَاوَاتِ وَالْأَرْضَ، وَلَا يَئُودُهُ حِفْظُهُمَا، وَهُوَ الْعَلِيُّ الْعَظِيمُ",
        "\nبِسْمِ اللَّهِ الرَّحْمَٰنِ الرَّحِيمِ \nقُلْ هُوَ اللَّهُ أَحَدٌ ﴿١﴾ اللَّهُ الصَّمَدُ ﴿٢﴾ لَمْ يَلِدْ وَلَمْ يُولَدْ ﴿٣﴾ وَلَمْ يَكُنْ لَهُ كُفُوًا أَحَدٌ ﴿٤﴾",
        "\nبِسْمِ اللَّهِ الرَّحْمَٰنِ الرَّحِيمِ \nقُلْ اَعُوْذُ بِرَبِّ الْفَلَقِۙ ﴿١﴾ مِنْ شَرِّ مَا خَلَقَۙ ﴿٢﴾ وَمِنْ شَرِّ غَاسِقٍ اِذَا وَقَبَۙ ﴿٣﴾ وَمِنْ شَرِّ النَّفّٰثٰتِ فِى الْعُقَدِۙ ﴿٤﴾ وَمِنْ شَرِّ حَاسِدٍ اِذَا حَسَدَ ﴿٥﴾",
        "\nبِسْمِ اللَّهِ الرَّحْمَٰنِ الرَّحِيمِ \nقُلْ اَعُوْذُ بِرَبِّ النَّاسِۙ ﴿١﴾ مَلِكِ النَّاسِۙ ﴿٢﴾ اِلٰهِ النَّاسِۙ ﴿٣﴾ مِنْ شَرِّ الْوَسْوَاسِ ەۙ الْخَنَّاسِۖ ﴿٤﴾ الَّذِيْ يُوَسْوِسُ فِيْ صُدُوْرِ النَّاسِۙ ﴿٥﴾ مِنَ الْجِنَّةِ وَالنَّاسِ ﴿٦﴾",
        "أَمْسَيْنَا وَأَمْسَى الْمُلْكُ للهِ، وَالْحَمْدُ للهِ، لَا إِلَهَ إِلاَّ اللهُ وَحْدَهُ لاَ شَرِيكَ لَهُ، لَهُ الْمُلْكُ وَلَهُ الْحَمْدُ، وَهُوَ عَلَى كُلِّ شَيْءٍ قَدِيرٌ، رَبِّ أَسْأَلُكَ خَيْرَ مَا فِي هَذِهِ اللَّيْلَةِ وَخَيْرَ مَا بَعْدَهَا، وَأَعُوذُبِكَ مِنْ شَرِّ مَا فِي هَذِهِ اللَّيْلَةِ وَشَرِّ مَا بَعْدَهَا، رَبِّ أَعُوذُبِكَ مِنَ الْكَسَلِ وَسُوءِ الْكِبَرِ، رَبِّ أَعُوذُبِكَ مِنْ عَذَابٍ فِي النَّارِ وَعَذَابٍ فِي الْقَبْرِ",
        "اللَّهُمَّ بِكَ أَمْسَيْنَا، وَبِكَ أَصْبَحْنَا،وَبِكَ نَحْيَا، وَبِكَ نَمُوتُ، وَإِلَيْكَ الْمَصِيْرُ",
        "اَللَّهُمَّ أَنْتَ رَبِّيْ لاَ إِلَـهَ إِلاَّ أَنْتَ، خَلَقْتَنِيْ وَأَنَا عَبْدُكَ، وَأَنَا عَلَى عَهْدِكَ وَوَعْدِكَ مَا اسْتَطَعْتُ، أَعُوْذُ بِكَ مِنْ شَرِّ مَا صَنَعْتُ، أَبُوْءُ لَكَ بِنِعْمَتِكَ عَلَيَّ، وَأَبُوْءُ بِذَنْبِيْ فَاغْفِرْ لِيْ فَإِنَّهُ لاَ يَغْفِرُ الذُّنُوْبَ إِلاَّ أَنْتَ",
        "اَللَّهُمَّ عَافِنِيْ فِيْ بَدَنِيْ، اَللَّهُمَّ عَافِنِيْ فِيْ سَمْعِيْ، اَللَّهُمَّ عَافِنِيْ فِيْ بَصَرِيْ، لاَ إِلَـهَ إِلاَّ أَنْتَ. اَللَّهُمَّ إِنِّي أَعُوْذُ بِكَ مِنَ الْكُفْرِ وَالْفَقْرِ، وَأَعُوْذُ بِكَ مِنْ عَذَابِ الْقَبْرِ، لاَ إِلَـهَ إِلاَّ أَنْتَ",
        "اَللَّهُمَّ إِنِّيْ أَسْأَلُكَ الْعَفْوَ وَالْعَافِيَةَ فِي الدُّنْيَا وَاْلآخِرَةِ، اَللَّهُمَّ إِنِّيْ أَسْأَلُكَ الْعَفْوَ وَالْعَافِيَةَ فِي دِيْنِيْ وَدُنْيَايَ وَأَهْلِيْ وَمَالِيْ اللَّهُمَّ اسْتُرْ عَوْرَاتِى وَآمِنْ رَوْعَاتِى. اَللَّهُمَّ احْفَظْنِيْ مِنْ بَيْنِ يَدَيَّ، وَمِنْ خَلْفِيْ، وَعَنْ يَمِيْنِيْ وَعَنْ شِمَالِيْ، وَمِنْ فَوْقِيْ، وَأَعُوْذُ بِعَظَمَتِكَ أَنْ أُغْتَالَ مِنْ تَحْتِ",
        "اَللَّهُمَّ عَالِمَ الْغَيْبِ وَالشَّهَادَةِ فَاطِرَ السَّمَاوَاتِ وَاْلأَرْضِ، رَبَّ كُلِّ شَيْءٍ وَمَلِيْكَهُ، أَشْهَدُ أَنْ لاَ إِلَـهَ إِلاَّ أَنْتَ، أَعُوْذُ بِكَ مِنْ شَرِّ نَفْسِيْ، وَمِنْ شَرِّ الشَّيْطَانِ وَشِرْكِهِ، وَأَنْ أَقْتَرِفَ عَلَى نَفْسِيْ سُوْءًا أَوْ أَجُرَّهُ إِلَى مُسْلِمٍ",
        "بِسْمِ اللَّهِ الَّذِى لاَ يَضُرُّ مَعَ اسْمِهِ شَىْءٌ فِى الأَرْضِ وَلاَ فِى السَّمَاءِ وَهُوَ السَّمِيعُ الْعَلِيمُ",
        "رَضِيْتُ بِاللهِ رَبًّا، وَبِاْلإِسْلاَمِ دِيْنًا، وَبِمُحَمَّدٍ صَلَّى اللهُ عَلَيْهِ وَسَلَّمَ نَبِيًّا",
        "يَا حَيُّ يَا قَيُّوْمُ بِرَحْمَتِكَ أَسْتَغِيْثُ، وَأَصْلِحْ لِيْ شَأْنِيْ كُلَّهُ وَلاَ تَكِلْنِيْ إِلَى نَفْسِيْ طَرْفَةَ عَيْنٍ أَبَدًا",
        "أَمْسَيْنَا عَلَى فِطْرَةِ اْلإِسْلاَمِ وَعَلَى كَلِمَةِ اْلإِخْلاَصِ، وَعَلَى دِيْنِ نَبِيِّنَا مُحَمَّدٍ صَلَّى اللهُ عَلَيْهِ وَسَلَّمَ، وَعَلَى مِلَّةِ أَبِيْنَا إِبْرَاهِيْمَ، حَنِيْفًا مُسْلِمًا وَمَا كَانَ مِنَ الْمُشْرِكِيْنَ",
        "لاَ إِلَـهَ إِلاَّ اللهُ وَحْدَهُ لاَ شَرِيْكَ لَهُ، لَهُ الْمُلْكُ وَلَهُ الْحَمْدُ وَهُوَ عَلَى كُلِّ شَيْءٍ قَدِيْرُ",
        "أَعُوْذُ بِكَلِمَاتِ اللهِ التَّامَّاتِ مِنْ شَرِّ مَا خَلَقَ",
        "سُبْحَانَ اللهِ وَبِحَمْدِهِ",
        "أَسْتَغْفِرُ اللهَ وَأَتُوْبُ إِلَيْهِ"
    )

    private val terjemahDzikirPetang = arrayOf(
        "\"Aku berlindung kepada Allah dari godaan syaitan yang terkutuk. Allah, tidak ada ilah (yang berhak disembah) melainkan Dia, yang hidup kekal lagi terus menerus mengurus (makhluk-Nya). Dia tidak mengantuk dan tidak tidur. Kepunyaan-Nya apa yang di langit dan di bumi. Tiada yang dapat memberi syafa’at di sisi-Nya tanpa seizin-Nya. Dia mengetahui apa-apa yang di hadapan mereka dan di belakang mereka. Mereka tidak mengetahui apa-apa dari ilmu Allah melainkan apa yang dikehendaki-Nya. Kursi Allah meliputi langit dan bumi. Dia tidak merasa berat memelihara keduanya. Dan Dia Maha Tinggi lagi Maha Besar.\"",
        "\"Katakanlah: Dialah Allah Yang Maha Esa. Allah adalah ilah yang bergantung kepada-Nya segala urusan. Dia tidak beranak dan tiada pula diperanakkan. Dan tidak ada seorang pun yang setara dengan Dia.\"",
        "\"Katakanlah: Aku berlindung kepada Rabb yang menguasai Subuh. Dari kejahatan makhluk-Nya. Dan dari kejahatan malam apabila telah gelap gulita. Dan dari kejahatan wanita-wanita tukang sihir yang menghembus pada buhul-buhul. Dan dari kejahatan orang yang dengki apabila ia dengki.\"",
        "\"Katakanlah: Aku berlindung kepada Rabb manusia. Raja manusia. Sembahan manusia. Dari kejahatan (bisikan) syaitan yang biasa bersembunyi. Yang membisikkan (kejahatan) ke dalam dada manusia. Dari jin dan manusia.\"",
        "\"Kami telah memasuki waktu petang dan kerajaan hanya milik Allah, segala puji bagi Allah. Tidak ada ilah (yang berhak disembah) kecuali Allah semata, tiada sekutu bagi-Nya. Milik Allah kerajaan dan bagi-Nya pujian. Dia-lah Yang Mahakuasa atas segala sesuatu.Wahai Rabbku, aku mohon kepada-Mu kebaikan di malam ini dan kebaikan sesudahnya. Aku berlindung kepadaMu dari kejahatan malam ini dan kejahatan sesudahnya. Wahai Rabbku, aku berlindung kepadaMu dari kemalasan dan kejelekan di hari tua. Wahai Rabbku, aku berlindung kepada-Mu dari siksaan di neraka dan siksaan di kubur.\"",
        "\"Ya Allah, dengan rahmat dan pertolongan-Mu kami memasuki waktu petang, dan dengan rahmat dan pertolongan-Mu kami memasuki waktu pagi. Dengan rahmat dan pertolonganMu kami hidup dan dengan kehendakMu kami mati. Dan kepada-Mu tempat kembali (bagi semua makhluk).\"",
        "\"Ya Allah, Engkau adalah Rabbku, tidak ada ilah yang berhak disembah kecuali Engkau, Engkaulah yang menciptakanku. Aku adalah hamba-Mu. Aku akan setia pada perjanjianku pada-Mu (yaitu aku akan mentauhidkan-Mu) semampuku dan aku yakin akan janji-Mu (berupa surga untukku). Aku berlindung kepada-Mu dari kejelekan yang kuperbuat. Aku mengakui nikmat-Mu kepadaku dan aku mengakui dosaku. Oleh karena itu, ampunilah aku. Sesungguhnya tiada yang mengampuni dosa kecuali Engkau.\"",
        "\"Ya Allah, selamatkanlah tubuhku (dari penyakit dan dari apa yang tidak aku inginkan). Ya Allah, selamatkanlah pendengaranku (dari penyakit dan maksiat atau dari apa yang tidak aku inginkan). Ya Allah, selamatkanlah penglihatanku, tidak ada Ilah yang berhak diibadahi dengan benar kecuali Engkau. Ya Allah, sesungguhnya aku berlindung kepada-Mu dari kekufuran dan kefakiran. Aku berlindung kepada-Mu dari siksa kubur, tidak ada Ilah yang berhak diibadahi dengan benar kecuali Engkau.\"",
        "\"Ya Allah, sesungguhnya aku memohon kebajikan dan keselamatan di dunia dan akhirat. Ya Allah, sesungguhnya aku memohon kebajikan dan keselamatan dalam agama, dunia, keluarga dan hartaku. Ya Allah, tutupilah auratku (aib dan sesuatu yang tidak layak dilihat orang) dan tenteramkanlah aku dari rasa takut. Ya Allah, peliharalah aku dari muka, belakang, kanan, kiri dan atasku. Aku berlindung dengan kebesaran-Mu, agar aku tidak disambar dari bawahku (oleh ular atau tenggelam dalam bumi dan lain-lain yang membuat aku jatuh).\"",
        "\"Ya Allah, Yang Maha Mengetahui yang ghaib dan yang nyata, wahai Rabb pencipta langit dan bumi, Rabb segala sesuatu dan yang merajainya. Aku bersaksi bahwa tidak ada ilah yang berhak disembah kecuali Engkau. Aku berlindung kepadaMu dari kejahatan diriku, setan dan balatentaranya (godaan untuk berbuat syirik pada Allah), dan aku (berlindung kepada-Mu) dari berbuat kejelekan terhadap diriku atau menyeretnya kepada seorang muslim.\"",
        "\"Dengan nama Allah yang bila disebut, segala sesuatu di bumi dan langit tidak akan berbahaya, Dia-lah Yang Maha Mendengar lagi Maha Mengetahui.\"",
        "\"Aku ridha Allah sebagai Rabb, Islam sebagai agama dan Muhammad shallallahu ‘alaihi wa sallam sebagai nabi.\"",
        "\"Wahai Rabb Yang Maha Hidup, wahai Rabb Yang Berdiri Sendiri (tidak butuh segala sesuatu), dengan rahmat-Mu aku minta pertolongan, perbaikilah segala urusanku dan jangan diserahkan kepadaku sekali pun sekejap mata (tanpa mendapat pertolongan dariMu).\"",
        "\"Di waktu sore kami berada diatas fitrah agama Islam, kalimat ikhlas, agama Nabi kita Muhammad صلي الله عليه وسلم dan agama ayah kami, Ibrahim, yang berdiri di atas jalan yang lurus, muslim dan tidak tergolong orang-orang yang musyrik.\"",
        "\"Tidak ada ilah yang berhak disembah selain Allah semata, tidak ada sekutu bagiNya. Bagi-Nya kerajaan dan segala pujian. Dia-lah yang berkuasa atas segala sesuatu.\"",
        "\"Aku berlindung dengan kalimat-kalimat Allah yang sempurna dari kejahatan makhluk yang diciptakanNya.\"",
        "\"Maha suci Allah, aku memuji-Nya.\"",
        "\"Aku memohon ampun kepada Allah dan bertobat kepada-Nya.\""
    )

    val listDzikirPetang: ArrayList<DzikirDoa>
        get() {
            val list = arrayListOf<DzikirDoa>()
            for (data in descDzikirPetang.indices) {
                val dzikir = DzikirDoa()
                dzikir.desc = descDzikirPetang[data]
                dzikir.lafaz = lafazDzikirPetang[data]
                dzikir.terjemah = terjemahDzikirPetang[data]
                list.add(dzikir)
            }
            return list
        }
}