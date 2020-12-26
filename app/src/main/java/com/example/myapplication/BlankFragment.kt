package com.example.myapplication



import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView


class BlankFragment : Fragment() {

    val image = arrayOf(R.drawable.dice_1,R.drawable.dice_2,R.drawable.dice_3,R.drawable.dice_4,R.drawable.dice_5,R.drawable.dice_6)
    val image2 = arrayOf(0,1,2.3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19)
    val jiesuan = arrayOf(0,0,0,0,0,0)
    val jiesuan_ai = arrayOf(0,0,0,0,0,0)

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.d("BlankFragment1", "onCreateView")
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_blank, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val diceImage: ImageView = view.findViewById(R.id.imageView01)
        val diceImage2: ImageView = view.findViewById(R.id.imageView02)
        val diceImage3: ImageView = view.findViewById(R.id.imageView03)
        val diceImage4: ImageView = view.findViewById(R.id.imageView04)
        val diceImage5: ImageView = view.findViewById(R.id.imageView05)
        val diceImage6: ImageView = view.findViewById(R.id.imageView06)

        val imagebutton1 = view.findViewById<ImageButton>(R.id.imageButton1)
        val imagebutton2 = view.findViewById<ImageButton>(R.id.imageButton2)
        val imagebutton3 = view.findViewById<ImageButton>(R.id.imageButton3)
        val imagebutton4 = view.findViewById<ImageButton>(R.id.imageButton4)
        val imagebutton5 = view.findViewById<ImageButton>(R.id.imageButton5)
        val imagebutton6 = view.findViewById<ImageButton>(R.id.imageButton6)

        val imageview_1 = view.findViewById<ImageView>(R.id.imageView_1)
        val imageview_2 = view.findViewById<ImageView>(R.id.imageView_2)
        val imageview_3 = view.findViewById<ImageView>(R.id.imageView_3)
        val imageview_4 = view.findViewById<ImageView>(R.id.imageView_4)
        val imageview_5 = view.findViewById<ImageView>(R.id.imageView_5)
        val imageview_6 = view.findViewById<ImageView>(R.id.imageView_6)

        val imageview_ai_1 = view.findViewById<ImageView>(R.id.imageView_ai_1)
        val imageview_ai_2 = view.findViewById<ImageView>(R.id.imageView_ai_2)
        val imageview_ai_3 = view.findViewById<ImageView>(R.id.imageView_ai_3)
        val imageview_ai_4 = view.findViewById<ImageView>(R.id.imageView_ai_4)
        val imageview_ai_5 = view.findViewById<ImageView>(R.id.imageView_ai_5)
        val imageview_ai_6 = view.findViewById<ImageView>(R.id.imageView_ai_6)
        val rollButton = view.findViewById<Button>(R.id.button)
        val next = view.findViewById<Button>(R.id.next)

        var count = 0

        var HP_player = 20       //设置玩家血量
        var HP_ai = 20           //设置人机血量

        next.isEnabled=false

        if (HP_player > 0 || HP_ai > 0){
            var index = arrayOf(0,0,0,0,0,0)
            rollButton.setOnClickListener {

                count ++

                if(count == 1){
                    val ai = Dice(19)
                    if (ai.roll() < 5){                //有5/20的概率取到斧头
                        imageview_ai_1.setImageResource(R.drawable.dice_1)
                        jiesuan_ai[0]++                //统计人机抽到斧头的数量
                    }else if(ai.roll() < 9){           //有4/20的概率取到箭
                        imageview_ai_1.setImageResource(R.drawable.dice_2)
                        jiesuan_ai[1]++
                    }else if(ai.roll() < 13){          //有4/20的概率取到头盔
                        imageview_ai_1.setImageResource(R.drawable.dice_3)
                        jiesuan_ai[2]++
                    }else {                            //有7/20的概率取到盾牌
                        imageview_ai_1.setImageResource(R.drawable.dice_4)
                        jiesuan_ai[3]++
                    }
                }

                if(count == 2){
                    val ai = Dice(19)
                    if (ai.roll() < 4){                //有4/20的概率取到斧头
                        imageview_ai_2.setImageResource(R.drawable.dice_1)
                        jiesuan_ai[0]++
                    }else if(ai.roll() < 8){           //有4/20的概率取到箭
                        imageview_ai_2.setImageResource(R.drawable.dice_2)
                        jiesuan_ai[1]++
                    }else if(ai.roll() < 12){          //有4/20的概率取到头盔
                        imageview_ai_2.setImageResource(R.drawable.dice_3)
                        jiesuan_ai[2]++
                    }else if(ai.roll() < 16){          //有4/20的概率取到盾牌
                        imageview_ai_2.setImageResource(R.drawable.dice_4)
                        jiesuan_ai[3]++
                    }else {                            //有4/20的概率取到 “手”
                        imageview_ai_2.setImageResource(R.drawable.dice_5)
                        jiesuan_ai[4]++
                    }
                }
                if(count == 3){
                    val ai = Dice(19)
                    if (ai.roll() < 4){                //有4/20的概率取到斧头
                        imageview_ai_3.setImageResource(R.drawable.dice_1)
                        jiesuan_ai[0]++
                    }else if(ai.roll() < 8){           //有4/20的概率取到箭
                        imageview_ai_3.setImageResource(R.drawable.dice_2)
                        jiesuan_ai[1]++
                    }else if(ai.roll() < 11){          //有4/20的概率取到头盔
                        imageview_ai_3.setImageResource(R.drawable.dice_3)
                        jiesuan_ai[2]++
                    }else if(ai.roll() < 14){          //有3/20的概率取到盾牌
                        imageview_ai_3.setImageResource(R.drawable.dice_4)
                        jiesuan_ai[3]++
                    }else if(ai.roll() < 17){          //有3/20的概率取到 “手”
                        imageview_ai_3.setImageResource(R.drawable.dice_5)
                        jiesuan_ai[4]++
                    }else {                            //有2/20的概率取到 “空”
                        imageview_ai_3.setImageResource(R.drawable.dice_6)
                        jiesuan_ai[5]++
                    }

                }

                if(count == 4){
                    val ai = Dice(19)
                    if (ai.roll() < 3){                //有3/20的概率取到斧头
                        imageview_ai_4.setImageResource(R.drawable.dice_1)
                        jiesuan_ai[0]++
                    }else if(ai.roll() < 6){           //有3/20的概率取到箭
                        imageview_ai_4.setImageResource(R.drawable.dice_2)
                        jiesuan_ai[1]++
                    }else if(ai.roll() < 10){          //有4/20的概率取到头盔
                        imageview_ai_4.setImageResource(R.drawable.dice_3)
                        jiesuan_ai[2]++
                    }else if(ai.roll() < 14){          //有4/20的概率取到盾牌
                        imageview_ai_4.setImageResource(R.drawable.dice_4)
                        jiesuan_ai[3]++
                    }else if(ai.roll() < 17){          //有3/20的概率取到 “手”
                        imageview_ai_4.setImageResource(R.drawable.dice_5)
                        jiesuan_ai[4]++
                    }else {                            //有3/20的概率取到 “空”
                        imageview_ai_4.setImageResource(R.drawable.dice_6)
                        jiesuan_ai[5]++
                    }
                }
                if(count == 5){
                    val ai = Dice(19)
                    if (ai.roll() < 3){                //有3/20的概率取到斧头
                        imageview_ai_5.setImageResource(R.drawable.dice_1)
                        jiesuan_ai[0]++
                    }else if(ai.roll() < 6){           //有3/20的概率取到箭
                        imageview_ai_5.setImageResource(R.drawable.dice_2)
                        jiesuan_ai[1]++
                    }else if(ai.roll() < 10){          //有4/20的概率取到头盔
                        imageview_ai_5.setImageResource(R.drawable.dice_3)
                        jiesuan_ai[2]++
                    }else if(ai.roll() < 14){          //有4/20的概率取到盾牌
                        imageview_ai_5.setImageResource(R.drawable.dice_4)
                        jiesuan_ai[3]++
                    }else if(ai.roll() < 17){          //有3/20的概率取到 “手”
                        imageview_ai_5.setImageResource(R.drawable.dice_5)
                        jiesuan_ai[4]++
                    }else {                            //有3/20的概率取到 “空”
                        imageview_ai_5.setImageResource(R.drawable.dice_6)
                        jiesuan_ai[5]++
                    }

                }
                if(count == 6){
                    val ai = Dice(19)
                    if (ai.roll() < 3){                //有3/20的概率取到斧头
                        imageview_ai_6.setImageResource(R.drawable.dice_1)
                        jiesuan_ai[0]++
                    }else if(ai.roll() < 6){           //有3/20的概率取到箭
                        imageview_ai_6.setImageResource(R.drawable.dice_2)
                        jiesuan_ai[1]++
                    }else if(ai.roll() < 10){          //有4/20的概率取到头盔
                        imageview_ai_6.setImageResource(R.drawable.dice_3)
                        jiesuan_ai[2]++
                    }else if(ai.roll() < 14){          //有4/20的概率取到盾牌
                        imageview_ai_6.setImageResource(R.drawable.dice_4)
                        jiesuan_ai[3]++
                    }else if(ai.roll() < 17){          //有3/20的概率取到 “手”
                        imageview_ai_6.setImageResource(R.drawable.dice_5)
                        jiesuan_ai[4]++
                    }else {                            //有3/20的概率取到 “空”
                        imageview_ai_6.setImageResource(R.drawable.dice_6)
                        jiesuan_ai[5]++
                    }

                    Log.d("ai_0","${jiesuan_ai[0]}")
                    Log.d("ai_1","${jiesuan_ai[1]}")
                    Log.d("ai_2","${jiesuan_ai[2]}")
                    Log.d("ai_3","${jiesuan_ai[3]}")
                    Log.d("ai_4","${jiesuan_ai[4]}")
                    Log.d("ai_5","${jiesuan_ai[5]}")

                }
                if (count >=7){
                    rollButton.isEnabled = false

                }


                Log.d("111","${count}")


                val dice = Dice(5)
                for (i in 0..5){
                    index[i] = dice.roll()
                }
                if(imagebutton1.isEnabled) {
                    diceImage.setImageResource(image[index[0]])

                }
                if (imagebutton2.isEnabled) {
                    diceImage2.setImageResource(image[index[1]])

                }
                if (imagebutton3.isEnabled){
                    diceImage3.setImageResource(image[index[2]])

                }
                if (imagebutton4.isEnabled) {
                    diceImage4.setImageResource(image[index[3]])

                }
                if (imagebutton5.isEnabled) {
                    diceImage5.setImageResource(image[index[4]])

                }
                if (imagebutton6.isEnabled) {
                    diceImage6.setImageResource(image[index[5]])

                }





                imagebutton1.setOnClickListener{
                    imageview_1.setImageResource(image[index[0]])
                    imagebutton1.isEnabled=false
                    imagebutton1.setImageResource(R.drawable.yiqueding)
                    jiesuan[index[0]]++
                }
                imagebutton2.setOnClickListener{
                    imageview_2.setImageResource(image[index[1]])
                    imagebutton2.isEnabled=false
                    imagebutton2.setImageResource(R.drawable.yiqueding)
                    jiesuan[index[1]]++
                }
                imagebutton3.setOnClickListener{
                    imageview_3.setImageResource(image[index[2]])
                    imagebutton3.isEnabled=false
                    imagebutton3.setImageResource(R.drawable.yiqueding)
                    jiesuan[index[2]]++
                }
                imagebutton4.setOnClickListener{
                    imageview_4.setImageResource(image[index[3]])
                    imagebutton4.isEnabled=false
                    imagebutton4.setImageResource(R.drawable.yiqueding)
                    jiesuan[index[3]]++
                }
                imagebutton5.setOnClickListener{
                    imageview_5.setImageResource(image[index[4]])
                    imagebutton5.isEnabled=false
                    imagebutton5.setImageResource(R.drawable.yiqueding)
                    jiesuan[index[4]]++
                }
                imagebutton6.setOnClickListener{
                    imageview_6.setImageResource(image[index[5]])
                    imagebutton6.isEnabled=false
                    imagebutton6.setImageResource(R.drawable.yiqueding)
                    jiesuan[index[5]]++
                }
                Log.d("0_0","${jiesuan[0]}")
                Log.d("0_1","${jiesuan[1]}")
                Log.d("0_2","${jiesuan[2]}")
                Log.d("0_3","${jiesuan[3]}")
                Log.d("0_4","${jiesuan[4]}")
                Log.d("0_5","${jiesuan[5]}")

                if (count >=7) {
                    rollButton.isEnabled = false

                    var damage_p_futou = jiesuan[0]
                    var damage_p_jian = jiesuan[1]
                    var damage_ai_futou = jiesuan_ai[0]
                    var damage_ai_jian = jiesuan_ai[1]
                    var fangyu_p_toukui = jiesuan[2]
                    var fangyu_p_dunpai = jiesuan[3]
                    var fangyu_ai_toukui = jiesuan_ai[2]
                    var fangyu_ai_dunpai = jiesuan_ai[3]
                    var _HP_player_1 = jiesuan_ai[0] - jiesuan[2]
                    var _HP_ai_1 = jiesuan[0] - jiesuan_ai[2]
                    var _HP_player_2 = jiesuan_ai[1] - jiesuan[3]
                    var _HP_ai_2 = jiesuan[1] - jiesuan_ai[3]
                    if (_HP_player_1 > 0) {
                        HP_player = HP_player - _HP_player_1
                    }
                    if (_HP_player_2 > 0) {
                        HP_player = HP_player - _HP_player_2
                    }
                    if (_HP_ai_1 > 0) {
                        HP_ai = HP_ai - _HP_ai_1
                    }
                    if (_HP_ai_2 > 0) {
                        HP_ai = HP_ai - _HP_ai_2
                    }
                    Log.d("hp_player", "${HP_player}")
                    Log.d("hp_ai", "${HP_ai}")
                    next.setBackgroundColor(R.drawable.heisebeijing)   //round1
                    //round2
                    next.text = "下一回合"
                    next.isEnabled = true
                    next.setOnClickListener{

                    }


                }


            }

        }else if(HP_ai <= 0 && HP_player > 0){ //赢了

        }else{                             //输了

        }









    }




}



