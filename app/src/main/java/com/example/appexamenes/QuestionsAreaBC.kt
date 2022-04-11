package com.example.appexamenes

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.*
import androidx.core.content.ContextCompat

class QuestionsAreaBC : AppCompatActivity(), View.OnClickListener {
    private var mCurrentPosition:Int=1
    private var mQuestionsList:ArrayList<QuestionsRiemann>?=null
    private var mSelectedOptionPosition: Int =0
    private var mCorrectAnswers:Int=0
    private var mUsername:String? = null
    private val key="MY_KEY"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_questions_area_bc)


        //DECLARACION DE VARIABLES DE RECURSOS
        val tvoption1=findViewById<TextView>(R.id.tvoptionone)
        val tvoption2=findViewById<TextView>(R.id.tvoptiontwo)
        val tvoption3=findViewById<TextView>(R.id.tvoptionthree)
        val tvoption4=findViewById<TextView>(R.id.tvoptionfour)
        val btnomitir=findViewById<Button>(R.id.btnomitir)
        mUsername=intent.getStringExtra(Constantes.USER_NAME)
        mQuestionsList = Constantes.getQuestions()
        setQuestion()
        tvoption1.setOnClickListener(this)
        tvoption2.setOnClickListener(this)
        tvoption3.setOnClickListener(this)
        tvoption4.setOnClickListener(this)
        btnomitir.setOnClickListener(this)
    }

         private fun setQuestion(){
             //DECLARACION DE VARIABLES DE RECURSOS
             val progressbar=findViewById<ProgressBar>(R.id.progressbar)
             val tvprogress=findViewById<TextView>(R.id.tvprogress)
             val tvquestion=findViewById<TextView>(R.id.tvquestion)
             val img1=findViewById<ImageView>(R.id.q1imag)
             val tvoption1=findViewById<TextView>(R.id.tvoptionone)
             val tvoption2=findViewById<TextView>(R.id.tvoptiontwo)
             val tvoption3=findViewById<TextView>(R.id.tvoptionthree)
             val tvoption4=findViewById<TextView>(R.id.tvoptionfour)
             val btnomitir=findViewById<Button>(R.id.btnomitir)

             val question= mQuestionsList!![mCurrentPosition-1]
             defaultOptionsView()
             if (mCurrentPosition==mQuestionsList!!.size){
                 btnomitir.text="FINALIZAR"
             }else{
                 btnomitir.text="OMITIR"
             }
             progressbar.progress=mCurrentPosition
             tvprogress.text="$mCurrentPosition" + "/" + progressbar.max

             tvquestion.text=question!!.question
             img1.setImageResource(question.image)
             tvoption1.text= question.optionOne
             tvoption2.text=question.optionTwo
             tvoption3.text=question.optionThree
             tvoption4.text=question.optionFour
         }


        private fun defaultOptionsView(){
            //DECLARACION DE VARIABLES DE RECURSOS
            val tvoption1=findViewById<TextView>(R.id.tvoptionone)
            val tvoption2=findViewById<TextView>(R.id.tvoptiontwo)
            val tvoption3=findViewById<TextView>(R.id.tvoptionthree)
            val tvoption4=findViewById<TextView>(R.id.tvoptionfour)

            val options=ArrayList<TextView>()
            options.add(0,tvoption1)
            options.add(1,tvoption2)
            options.add(2,tvoption3)
            options.add(3,tvoption4)
            for (option in options){
                option.setTextColor(Color.parseColor("#748089"))
                option.typeface= Typeface.DEFAULT
                option.background=ContextCompat.getDrawable(this,
                    R.drawable.defult_option_border
                )
            }
        }


    private fun selectedOptionView(tv: TextView,selectedOptionNum:Int){
        defaultOptionsView()
        mSelectedOptionPosition=selectedOptionNum
        tv.setTextColor(Color.parseColor("#363A43"))
        tv.setTypeface(tv.typeface,Typeface.BOLD)
        tv.background=ContextCompat.getDrawable(this,
            R.drawable.selected_option_border
        )
    }

    override fun onClick(v: View?) {
        //DECLARACION DE VARIABLES DE RECURSOS
        val tvoption1=findViewById<TextView>(R.id.tvoptionone)
        val tvoption2=findViewById<TextView>(R.id.tvoptiontwo)
        val tvoption3=findViewById<TextView>(R.id.tvoptionthree)
        val tvoption4=findViewById<TextView>(R.id.tvoptionfour)
        val btnomitir=findViewById<Button>(R.id.btnomitir)
        when(v?.id) {
            R.id.tvoptionone -> {
                selectedOptionView(tvoption1, 1)
                btnomitir.text="RESPONDER"
            }
            R.id.tvoptiontwo -> {
                selectedOptionView(tvoption2, 2)
                btnomitir.text="RESPONDER"
            }
            R.id.tvoptionthree -> {
                selectedOptionView(tvoption3, 3)
                btnomitir.text="RESPONDER"
            }
            R.id.tvoptionfour -> {
                selectedOptionView(tvoption4, 4)
                btnomitir.text="RESPONDER"
            }
            R.id.btnomitir->{
                tvoption1.isEnabled=false
                tvoption2.isEnabled=false
                tvoption3.isEnabled=false
                tvoption4.isEnabled=false
                if(mSelectedOptionPosition==0){
                    mCurrentPosition++
                    tvoption1.isEnabled=true
                    tvoption2.isEnabled=true
                    tvoption3.isEnabled=true
                    tvoption4.isEnabled=true
                    when{
                        mCurrentPosition<=mQuestionsList!!.size->{
                            setQuestion()
                            tvoption1.isEnabled=true
                            tvoption2.isEnabled=true
                            tvoption3.isEnabled=true
                            tvoption4.isEnabled=true
                        }else->{
                        val intent=Intent(this,ActivityResult::class.java)
                        intent.putExtra(Constantes.USER_NAME,mUsername)
                        intent.putExtra(Constantes.CORRECT_ANSWERS,mCorrectAnswers)
                        intent.putExtra(Constantes.TOTAL_QUESTIONS,mQuestionsList!!.size)
                        startActivity(intent)
                        }
                    }
                }else{
                    val question=mQuestionsList?.get(mCurrentPosition-1)
                    if (question!!.correctAnswer!=mSelectedOptionPosition){
                        answerView(mSelectedOptionPosition,R.drawable.wrong_option_border)
                    }else{
                        mCorrectAnswers++
                    }
                    answerView(question.correctAnswer, R.drawable.correct_option_border)
                    if (mSelectedOptionPosition==mQuestionsList!!.size){
                        btnomitir.text="FINALIZAR"
                    }else{
                        btnomitir.text="SIGUIENTE PREGUNTA"
                    }
                    mSelectedOptionPosition=0
                }
            }
        }
    }
    private fun answerView(answer:Int,drawableView:Int){
        //DECLARACION DE VARIABLES DE RECURSOS
        val tvoption1=findViewById<TextView>(R.id.tvoptionone)
        val tvoption2=findViewById<TextView>(R.id.tvoptiontwo)
        val tvoption3=findViewById<TextView>(R.id.tvoptionthree)
        val tvoption4=findViewById<TextView>(R.id.tvoptionfour)

        when(answer){
            1->{
                    tvoption1.background=ContextCompat.getDrawable(
                        this,drawableView
                    )
            }
            2->{
                tvoption2.background=ContextCompat.getDrawable(
                    this,drawableView
                )
            }
            3->{
                tvoption3.background=ContextCompat.getDrawable(
                    this,drawableView
                )
            }
            4->{
                tvoption4.background=ContextCompat.getDrawable(
                    this,drawableView
                )
            }
        }

    }

}