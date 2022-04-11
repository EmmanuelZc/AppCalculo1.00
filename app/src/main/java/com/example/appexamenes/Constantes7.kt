package com.example.appexamenes


object Constantes7{
    const val USER_NAME: String="user_name"
    const val TOTAL_QUESTIONS: String="total_question"
    const val CORRECT_ANSWERS: String="correct_answers"
    fun getQuestions(): ArrayList<dataclasslongarc> {
        val questionsList = ArrayList<dataclasslongarc>()
        val q1 = dataclasslongarc(
            1,
            "Calcula la longitud de arco de la función dado en el intervalo señalado.",
            R.drawable.ejercicio1t7,
            "In(√3+1)u",
            "In(√2)u ",
            "In(√2+2)u",
            "In(√2+1)u",
            4
        )
        questionsList.add(q1)

        val q2 = dataclasslongarc(
            2,
            "Calcula la longitud de arco de la función dado en el intervalo señalado.",
            R.drawable.ejercicio2t7,
            "2.32439u",
            "2.32119u",
            "2.32339u",
            "2.33339u",
            3
        )
        questionsList.add(q2)

        val q3 = dataclasslongarc(
            3,
            "Calcula la longitud de arco de la función dado en el intervalo señalado.",
            R.drawable.ejercicio3t7,
            "πu",
            "2πu",
            "√πu",
            "π/2u",
            1
        )
        questionsList.add(q3)

        val q4 = dataclasslongarc(
            4,
            "Calcula la longitud de arco de la función dado en el intervalo señalado.",
            R.drawable.ejercicio4t7,
            "24.41384u",
            "24.42284u",
            "24.41284u",
            "24.42384u",
            3
        )
        questionsList.add(q4)

        val q5 = dataclasslongarc(
            5,
            "Calcula la longitud de arco de la función dado en el intervalo señalado.",
            R.drawable.ejercicio5t7,
            "1.43960u",
            "1.43970u ",
            "1.43970u",
            "1.45070u",
            2
        )
        questionsList.add(q5)

        val q6 = dataclasslongarc(
            6,
            "Calcula la longitud de arco de la función dado en el intervalo señalado.",
            R.drawable.ejercicio6t7,
            "2.06350u",
            "2.16250u ",
            "2.15250u",
            "2.06250u",
            1
        )
        questionsList.add(q6)

        val q7 = dataclasslongarc(
            7,
            "Calcula la longitud de arco de la función dado en el intervalo señalado.",
            R.drawable.ejercicio7t7,
            "3.62686u",
            "3.62586u",
            "3.63686u",
            "3.62675u",
            1
        )
        questionsList.add(q7)

        val q8 = dataclasslongarc(
            8,
            "Calcula la longitud de arco de la función dado en el intervalo señalado.",
            R.drawable.ejercicio8t7,
            "1.11172u",
            "1.11072u",
            "1.10072u",
            "1.12172u",
            2
        )
        questionsList.add(q8)

        val q9 = dataclasslongarc(
            9,
            "Calcula la longitud de arco de la función dado en el intervalo señalado.",
            R.drawable.ejercicio9t7,
            "6.11322u",
            "6.10312u",
            "6.11332u",
            "6.10322u",
            4
        )
        questionsList.add(q9)

        val q10 = dataclasslongarc(
            10,
            "Calcula la longitud de arco de la función dado en el intervalo señalado.",
            R.drawable.ejercicio10t7,
            "1.47894u",
            "1.48894u",
            "1.47892u",
            "1.47784u",
            1
        )
        questionsList.add(q10)
        return questionsList

    }
}


