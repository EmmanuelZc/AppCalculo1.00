package com.example.appexamenes

object Constantes {
    const val USER_NAME: String="user_name"
    const val TOTAL_QUESTIONS: String="total_question"
    const val CORRECT_ANSWERS: String="correct_answers"
    fun getQuestions(): ArrayList<QuestionsRiemann>{
        val questionsList = ArrayList<QuestionsRiemann>()
        val q1=QuestionsRiemann(
            1,
            "Calule el área de la función f(x)=2x+1 en el intervalo [2,4]",
        R.drawable.ejercicio1t1,
        "14.2 unidades cuadradas",
        "13 unidades cuadradas",
        "14 unidades cuadradas",
        "10 unidades cuadradas",
        3
            )
        questionsList.add(q1)

        val q2=QuestionsRiemann(
            2,
            "Calule el área de la función f(x)=x^2-x en el intervalo [1,2]",
            R.drawable.ejercicio2t1,
            "5/6 unidades cuadradas",
            "6/5 unidades cuadradas",
            "10/3 unidades cuadradas",
            "7/5 unidades cuadradas",
            1
        )
        questionsList.add(q2)

        val q3=QuestionsRiemann(
            3,
            "Calule el área de la función f(x)=x^3 en el intervalo [-2,2]",
            R.drawable.ejercicio3t1,
            "8 unidades cuadradas",
            "0 unidades cuadradas",
            "1/2 unidades cuadradas",
            "7.5 unidades cuadradas",
            1
        )
        questionsList.add(q3)

        val q4=QuestionsRiemann(
            4,
            "Calule el área de la función f(x)=x^2+2x+1 en el intervalo [-1,2]",
            R.drawable.ejercicio4t1,
            "8.5 unidades cuadradas",
            "5.4 unidades cuadradas",
            "9 unidades cuadradas",
            "10 unidades cuadradas",
            3
        )
        questionsList.add(q4)

        val q5=QuestionsRiemann(
            5,
            "Calule el área de la función f(x)=x^2+6x+8 en el intervalo [-4,-2]",
            R.drawable.ejercicio5t1,
            "1.3 unidades cuadradas",
            "1.5 unidades cuadradas",
            "2 unidades cuadradas",
            "1 unidad cuadrada",
            1
        )
        questionsList.add(q5)

        val q6=QuestionsRiemann(
            6,
            "Calule el área de la función f(x)=cos(x) en el intervalo [-π,2π]",
            R.drawable.ejercicio6t1,
            "5 unidades cuadradas",
            "3 unidades cuadradas",
            "6 unidades cuadradas",
            "4 unidades cuadradas",
            4
        )
        questionsList.add(q6)

        val q7=QuestionsRiemann(
            7,
            "Calule el área de la función f(x)=x^2-1 en el intervalo [0,1]",
            R.drawable.ejercicio7t1,
            "0.66 unidades cuadradas",
            "0.3 unidades cuadradas",
            "1 unidad cuadrada",
            "2 unidades cuadradas",
            1
        )
        questionsList.add(q7)

        val q8=QuestionsRiemann(
            8,
            "Calule el área de la función f(x)=x-x^3 en el intervalo [0,2]",
            R.drawable.ejercicio8t1,
            "4.5 unidades cuadradas",
            "3.0 unidades cuadradas",
            "2.5 unidades cuadradas",
            "3.45 unidades cuadradas",
            3
        )
        questionsList.add(q8)

        val q9=QuestionsRiemann(
            9,
            "Calule el área de la función f(x)=9-x^2 en el intervalo [-1,1]",
            R.drawable.ejercicio9t1,
            "50/3 unidades cuadradas",
            "52/3 unidades cuadradas",
            "3/25 unidades cuadradas",
            "55/3 unidades cuadradas",
            2
        )
        questionsList.add(q9)

        val q10=QuestionsRiemann(
            10,
            "Calule el área de la función f(x)=8-6x+x^2 en el intervalo [-3,1]",
            R.drawable.ejercicio10t1,
            "15/3 unidades cuadradas",
            "196/3 unidades cuadradas",
            "184/3 unidades cuadradas",
            "70 unidades cuadradas",
            3
        )
        questionsList.add(q10)
        return questionsList


    }


}