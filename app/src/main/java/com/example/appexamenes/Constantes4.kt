package com.example.appexamenes


object Constantes4{
    const val USER_NAME: String="user_name"
    const val TOTAL_QUESTIONS: String="total_question"
    const val CORRECT_ANSWERS: String="correct_answers"
    fun getQuestions(): ArrayList<dataclassareacur> {
        val questionsList = ArrayList<dataclassareacur>()
        val q1 = dataclassareacur(
            1,
            "Calcular el área de la región acotada por las funciones dadas.",
            R.drawable.ejercicio1t4,
            "2/5 unidades cuadradas",
            "1/8 unidades cuadradas ",
            "3/6 unidades cuadradas",
            "1/6 unidades cuadradas",
            4
        )
        questionsList.add(q1)

        val q2 = dataclassareacur(
            2,
            "Calcular el área de la región acotada por las funciones dadas.",
            R.drawable.ejercicio2t4,
            "7.81202 unidades cuadradas",
            " 6.45782 unidades cuadradas",
            "8.92890 unidades cuadradas",
            "7.18202 unidades cuadradas",
            1
        )
        questionsList.add(q2)

        val q3 = dataclassareacur(
            3,
            "Calcular el área de la región acotada por las funciones dadas.",
            R.drawable.ejercicio3t4,
            "0.38738 unidades cuadradas",
            "√2 unidades cuadradas",
            "4√2 unidades cuadradas",
            "0.5830 unidades cuadradas",
            3
        )
        questionsList.add(q3)

        val q4 = dataclassareacur(
            4,
            "Calcular el área de la región acotada por las funciones dadas.",
            R.drawable.ejercicio4t4,
            "0  unidades cuadradas",
            "5 unidades cuadradas",
            "2 unidades cuadradas",
            "1 unidades cuadradas",
            4
        )
        questionsList.add(q4)

        val q5 = dataclassareacur(
            5,
            "Calcular el área de la región acotada por las funciones dadas.",
            R.drawable.ejercicio5t4,
            "13/12 unidades cuadradas",
            "2 unidades cuadradas",
            "14/6 unidades cuadradas",
            "7/12 unidades cuadradas",
            1
        )
        questionsList.add(q5)

        val q6 = dataclassareacur(
            6,
            "Calcular el área de la región acotada por las funciones dadas.",
            R.drawable.ejercicio6t4,
            "1.492 unidades cuadradas",
            "4.294 unidades cuadradas",
            "3.967 unidades cuadradas",
            " 4.924 unidades cuadradas",
            2
        )
        questionsList.add(q6)

        val q7 = dataclassareacur(
            7,
            "Calcular el área de la región acotada por las funciones dadas.",
            R.drawable.ejercicio7t4,
            "0.5433 unidades cuadradas",
            "3.86373 unidades cuadradas",
            "4,5575 unidades cuadradas",
            "3.68373 unidades cuadradas",
            4
        )
        questionsList.add(q7)

        val q8 = dataclassareacur(
            8,
            "Calcular el área de la región acotada por las funciones dadas.",
            R.drawable.ejercicio8t4,
            "12/2 unidades cuadradas",
            "45/2 unidades cuadradas",
            "50/2 unidades cuadradas",
            "25/2 unidades cuadradas",
            4
        )
        questionsList.add(q8)

        val q9 = dataclassareacur(
            9,
            "Calcular el área de la región acotada por las funciones dadas.",
            R.drawable.ejercicio9t4,
            "2.40370 unidades cuadradas",
            "1.8973 unidades cuadradas",
            "0.30170 unidades cuadradas",
            "2.30470 unidades cuadradas",
            1
        )
        questionsList.add(q9)

        val q10 = dataclassareacur(
            10,
            "Calcular el área de la región acotada por las funciones dadas.",
            R.drawable.ejercicio10t4,
            "50/2 unidades cuadradas",
            "20 unidades cuadradas",
            "21.333 unidades cuadradas",
            "30/3 unidades cuadradas",
            3
        )
        questionsList.add(q10)
        return questionsList

    }
}


