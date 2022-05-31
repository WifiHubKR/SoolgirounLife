package c.myapplication.soolgirounlife

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import c.myapplication.soolgirounlife.databinding.ActivitySettingsBinding

class SettingsActivity : AppCompatActivity() {

    lateinit var binding: ActivitySettingsBinding
    lateinit var adapter: SettingsAdapter

    var data = ArrayList<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySettingsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initData()
        initRecyclerView()
    }

    fun initData() {
        data.add("테마 토글버튼")
        data.add("앱 초기화")
        data.add("목표 수정")
        data.add("도움말")
    }

    fun initRecyclerView() {
        binding.settingRecyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)

        adapter = SettingsAdapter(data)
//        adapter.itemClickListener = object : SettingsAdapter.ItemClickListener {
//            override fun onClickItem(data: String) {
//                TODO("Not yet implemented")
//            }
//        }

        binding.settingRecyclerView.adapter = adapter
    }
}