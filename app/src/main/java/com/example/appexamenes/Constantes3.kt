package com.example.appexamenes


object Constantes3{
    const val USER_NAME: String="user_name"
    const val TOTAL_QUESTIONS: String="total_question"
    const val CORRECT_ANSWERS: String="correct_answers"
    fun getQuestions(): ArrayList<dataclassintnum> {
        val questionsList = ArrayList<dataclassintnum>()
        val q1 = dataclassintnum(
            1,
            "Determine el valor de la integral por la regla del trapecio.",
            R.drawable.ejercicio1t3,
            "1.770",
            "2.61250 ",
            "1.61250",
            "2.16250",
            2
        )
        questionsList.add(q1)

        val q2 = dataclassintnum(
            2,
            "Determine el valor de la integral por la regla del trapecio.",
            R.drawable.ejercicio2t3,
            "9.56921",
            "0.59702",
            "1.34557",
            "0.69702",
            4
        )
        questionsList.add(q2)

        val q3 = dataclassintnum(
            3,
            "Determine el valor de la integral por la regla del trapecio.",
            R.drawable.ejercicio3t3,
            "0.38738",
            "0.57248",
            "1.42134",
            "1.57248",
            2
        )
        questionsList.add(q3)

        val q4 = dataclassintnum(
            4,
            "Determine el valor de la integral por la regla del trapecio.",
            R.drawable.ejercicio4t3,
            "1.51147",
            "0",
            "1.15147",
            "1.56989",
            3
        )
        questionsList.add(q4)

        val q5 = dataclassintnum(
            5,
            "Determine el valor de la integral por la regla del trapecio.",
            R.drawable.ejercicio5t3,
            "9.045332",
            "0.17823",
            "0.14270",
            "1.45643",
            3
        )
        questionsList.add(q5)

        val q6 = dataclassintnum(
            6,
            "Determine el valor de la integral por la regla de Simpson.",
            R.drawable.ejercicio6t3,
            "2.5876",
            "7.6372",
            "5.1738",
            " 5.7537",
            4
        )
        questionsList.add(q6)

        val q7 = dataclassintnum(
            7,
            "Determine el valor de la integral por la regla de Simpson.",
            R.drawable.ejercicio7t3,
            "11.4",
            "10.5",
            "11.1",
            "9.4",
            1
        )
        questionsList.add(q7)

        val q8 = dataclassintnum(
            8,
            "Determine el valor de la integral por la regla de Simpson.",
            R.drawable.ejercicio8t3,
            "23.7889",
            "32,7077",
            "29.78",
            "30,7077",
            2
        )
        questionsList.add(q8)

        val q9 = dataclassintnum(
            9,
            "Determine el valor de la integral por la regla de Simpson.",
            R.drawable.ejercicio9t3,
            "12.87732",
            "12.778181",
            "14.77811",
            "59.4749",
            3
        )
        questionsList.add(q9)

        val q10 = dataclassintnum(
            10,
            "Determine el valor de la integral por la regla de Simpson.",
            R.drawable.ejercicio10t3,
            "0.4635",
            "0.4786",
            "1.5379",
            "0.76354",
            4
        )
        questionsList.add(q10)
        return questionsList

    }
}


