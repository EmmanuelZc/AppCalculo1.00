package com.example.appexamenes


object Constantes2{
    const val USER_NAME: String="user_name"
    const val TOTAL_QUESTIONS: String="total_question"
    const val CORRECT_ANSWERS: String="correct_answers"
    fun getQuestions(): ArrayList<QuestionsIntDef> {
        val questionsList = ArrayList<QuestionsIntDef>()
        val q1 = QuestionsIntDef(
            1,
            "Calcule la siguiente integral definida",
            R.drawable.ejercicio1t2,
            "17707",
            "1453 ",
            "17700",
            "17770",
            3
        )
        questionsList.add(q1)

        val q2 = QuestionsIntDef(
            2,
            "Calcule la siguiente integral definida",
            R.drawable.ejercicio2t2,
            "7986/5",
            "7896/5",
            "7896/10",
            "789/5",
            2
        )
        questionsList.add(q2)

        val q3 = QuestionsIntDef(
            3,
            "Calcule la siguiente integral definida",
            R.drawable.ejercicio3t2,
            "1412/3",
            "1412/5",
            "1421/3",
            "1230/6",
            1
        )
        questionsList.add(q3)

        val q4 = QuestionsIntDef(
            4,
            "Calcule la siguiente integral definida",
            R.drawable.ejercicio4t2,
            "470/4",
            "235/2",
            "221",
            "117",
            2
        )
        questionsList.add(q4)

        val q5 = QuestionsIntDef(
            5,
            "Calcule la siguiente integral definida",
            R.drawable.ejercicio5t2,
            "789/6",
            "10",
            "1854/10",
            "928/5",
            4
        )
        questionsList.add(q5)

        val q6 = QuestionsIntDef(
            6,
            "Evalué las siguiente función",
            R.drawable.ejercicio6t2,
            "2/5x^5 + 6x + 35/2",
            "x^5 + 6x",
            "2/5x^5 + 6x - 35/2",
            "2/5x^4 + 6x - 35/2",
            3
        )
        questionsList.add(q6)

        val q7 = QuestionsIntDef(
            7,
            "Evalué las siguiente función",
            R.drawable.ejercicio7t2,
            "6x^4",
            "6x^5",
            "6x^4+5",
            "x^4",
            1
        )
        questionsList.add(q7)

        val q8 = QuestionsIntDef(
            8,
            "Evalué las siguiente función",
            R.drawable.ejercicio8t2,
            "3/2x +4x -14",
            "3/2x^2 +4x -14",
            "1/2x^2 +2x -7",
            "3/2x^3 +4x^3 -14",
            2
        )
        questionsList.add(q8)

        val q9 = QuestionsIntDef(
            9,
            "Evalué las siguiente función",
            R.drawable.ejercicio9t2,
            "128t^6",
            "128t^7",
            "64t^7",
            "120t^7",
            2
        )
        questionsList.add(q9)

        val q10 = QuestionsIntDef(
            10,
            "Evalué las siguiente función",
            R.drawable.ejercicio10t2,
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


