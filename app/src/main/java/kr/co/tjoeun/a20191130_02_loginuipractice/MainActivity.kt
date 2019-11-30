package kr.co.tjoeun.a20191130_02_loginuipractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 자바와는 다르게 set/get 간소화
        loginBtn.text = "Log in"

        //나중에 변경 가능
        var num1=10

        //변경불가
        val pi =3.14
    }
}
