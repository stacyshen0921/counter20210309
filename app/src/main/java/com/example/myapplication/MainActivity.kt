package tw.edu.pu.csim.s1081947.counter20210319

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity(), View.OnClickListener {

    var counter:Int=0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        txv.text=counter.toString()

        txv.setOnClickListener(this)
        btn3.setOnClickListener(this)
    }

    fun AddOne(v: View){
        counter++
        txv.text=counter.toString()
    }
    fun AddTwo(v: View){
        counter++
        counter++
        txv.text=counter.toString()
    }

    override fun onClick(v: View?) {
        if(v==txv){
            counter++
        }
        else{
            counter=0
        }
        txv.text=counter.toString()
    }
}
