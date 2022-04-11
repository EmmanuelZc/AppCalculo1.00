package com.example.appexamenes


object Constantes6{
    const val USER_NAME: String="user_name"
    const val TOTAL_QUESTIONS: String="total_question"
    const val CORRECT_ANSWERS: String="correct_answers"
    fun getQuestions(): ArrayList<dataclassvolsect> {
        val questionsList = ArrayList<dataclassvolsect>()
        val q1 = dataclassvolsect(
            1,
            "Resolver",
            R.drawable.ejercicio1t6,
            "2/3 r^3 tan∝ unidades cubicas",
            "2/7 r^4  unidades cubicas ",
            " r^2 tan∝ unidades cubicas",
            "2/3 r^2 tan∝ unidades cubicas",
            1
        )
        questionsList.add(q1)

        val q2 = dataclassvolsect(
            2,
            "Resolver",
            R.drawable.ejercicio2t6,
            "1/3 a^3 unidades cubicas",
            "a^2 h unidades cubicas",
            "1/3 a^2 h unidades cubicas",
            "2/3 a^3 h unidades cubicas",
            3
        )
        questionsList.add(q2)

        val q3 = dataclassvolsect(
            3,
            "Resolver",
            R.drawable.ejercicio3t6,
            "π unidades cubicas",
            "8 unidades cubicas",
            "√π unidades cubicas",
            "8√π unidades cubicas",
            2
        )
        questionsList.add(q3)

        val q4 = dataclassvolsect(
            4,
            "Resolver",
            R.drawable.ejercicio4t6,
            "400π/5 unidades cubicas",
            "2000π/3 unidades cubicas",
            "2000/3 unidades cubicas",
            "200π/3 unidades cubicas",
            2
        )
        questionsList.add(q4)

        val q5 = dataclassvolsect(
            5,
            "Resolver",
            R.drawable.ejercicio5t6,
            "32 unidades cubicas",
            "π/3 unidades cubicas",
            "24 unidades cubicas",
            "20/3 unidades cubicas",
            1
        )
        questionsList.add(q5)

        val q6 = dataclassvolsect(
            6,
            "Resolver",
            R.drawable.ejercicio6t6,
            "128/(3√3) unidades cubicas ",
            "128/3 unidades cubicas ",
            "124 unidades cubicas ",
            "12/(3√3) unidades cubicas ",
            1
        )
        questionsList.add(q6)

        val q7 = dataclassvolsect(
            7,
            "Resolver",
            R.drawable.ejercicio7t6,
            "236 unidades cubicas",
            "3 unidades cubicas",
            "16 unidades cubicas",
            "36 unidades cubicas",
            4
        )
        questionsList.add(q7)

        val q8 = dataclassvolsect(
            8,
            "Resolver",
            R.drawable.ejercicio8t6,
            "22 unidades cubicas",
            "36 unidades cubicas",
            "16π unidades cubicas",
            "16 unidades cubicas",
            4
        )
        questionsList.add(q8)

        val q9 = dataclassvolsect(
            9,
            "Resolver",
            R.drawable.ejercicio9t6,
            "2π/3 unidades cubicas",
            "π/3  unidades cubicas",
            "16π unidades cubicas",
            "π  unidades cubicas",
            2
        )
        questionsList.add(q9)

        val q10 = dataclassvolsect(
            10,
            "Resolver",
            R.drawable.ejercicio10t6,
            "(√3/2)(a^2)(h) unidades cubicas",
            "(√3/12)(a^2)(h) unidades cubicas",
            "(√3/12)(h) unidades cubicas",
            "(√3/12)(a^2) unidades cubicas",
            2
        )
        questionsList.add(q10)
        return questionsList

    }
}


