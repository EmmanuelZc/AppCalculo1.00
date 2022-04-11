package com.example.appexamenes


object Constantes5{
    const val USER_NAME: String="user_name"
    const val TOTAL_QUESTIONS: String="total_question"
    const val CORRECT_ANSWERS: String="correct_answers"
    fun getQuestions(): ArrayList<dataclassvolsolid> {
        val questionsList = ArrayList<dataclassvolsolid>()
        val q1 = dataclassvolsolid(
            1,
            "Hallar el volumen del sólido generado al rotar la región por medio del método de discos acotada por las rectas y las curvas dadas alrededor del eje indicado.",
            R.drawable.ejercicio1t5,
            "124π unidades cubicas",
            "126π unidades cubicas ",
            "120 π unidades cubicas",
            "114π unidades cubicas",
            1
        )
        questionsList.add(q1)

        val q2 = dataclassvolsolid(
            2,
            "Hallar el volumen del sólido generado al rotar la región por medio del método de discos acotada por las rectas y las curvas dadas alrededor del eje indicado.",
            R.drawable.ejercicio2t5,
            "74/5 unidades cubicas",
            "80/5 unidades cubicas ",
            "77/5 unidades cubicas",
            "78/5 unidades cubicas",
            4
        )
        questionsList.add(q2)

        val q3 = dataclassvolsolid(
            3,
            "Hallar el volumen del sólido generado al rotar la región por medio del método de discos acotada por las rectas y las curvas dadas alrededor del eje indicado.",
            R.drawable.ejercicio3t5,
            "623π unidades cubicas",
            "627π unidades cubicas ",
            "625π unidades cubicas",
            "629π unidades cubicas",
            3
        )
        questionsList.add(q3)

        val q4 = dataclassvolsolid(
            4,
            "Hallar el volumen del sólido generado al rotar la región por medio del método de arandelas acotada por las rectas y las curvas dadas alrededor del eje indicado.",
            R.drawable.ejercicio4t5,
            "160π unidades cubicas",
            "162π unidades cubicas ",
            "162π unidades cubicas",
            "161π unidades cubicas",
            2
        )
        questionsList.add(q4)

        val q5 = dataclassvolsolid(
            5,
            "Hallar el volumen del sólido generado al rotar la región por medio del método de arandelas acotada por las rectas y las curvas dadas alrededor del eje indicado.",
            R.drawable.ejercicio5t5,
            "6/15π unidades cubicas",
            "3/16π unidades cubicas ",
            "4/15π unidades cubicas",
            "2/15π unidades cubicas",
            4
        )
        questionsList.add(q5)

        val q6 = dataclassvolsolid(
            6,
            "Hallar el volumen del sólido generado al rotar la región por medio del método de arandelas acotada por las rectas y las curvas dadas alrededor del eje indicado.",
            R.drawable.ejercicio6t5,
            "16/5π unidades cubicas",
            "17/5 π unidades cubicas ",
            "12/5 π unidades cubicas",
            "14/5π unidades cubicas",
            1
        )
        questionsList.add(q6)

        val q7 = dataclassvolsolid(
            7,
            "Hallar el volumen del sólido generado al rotar la región por medio del método de cascarones cilíndricos acotada por las rectas y las curvas dadas alrededor del eje indicado.",
            R.drawable.ejercicio7t5,
            "8/15π unidades cubicas",
            "4/15π unidades cubicas ",
            "2/15π unidades cubicas",
            "6/15π unidades cubicas",
            2
        )
        questionsList.add(q7)

        val q8 = dataclassvolsolid(
            8,
            "Hallar el volumen del sólido generado al rotar la región por medio del método de cascarones cilíndricos acotada por las rectas y las curvas dadas alrededor del eje indicado.",
            R.drawable.ejercicio8t5,
            "3/4π unidades cubicas",
            "1/2π unidades cubicas ",
            "π unidades cubicas",
            "3/2π unidades cubicas",
            4
        )
        questionsList.add(q8)

        val q9 = dataclassvolsolid(
            9,
            "Hallar el volumen del sólido generado al rotar la región por medio del método de cascarones cilíndricos acotada por las rectas y las curvas dadas alrededor del eje indicado.",
            R.drawable.ejercicio9t5,
            "67/3π unidades cubicas",
            "61/2π unidades cubicas ",
            "63/2π unidades cubicas",
            "65/2π unidades cubicas",
            3
        )
        questionsList.add(q9)

        val q10 = dataclassvolsolid(
            10,
            "Hallar el volumen del sólido generado al rotar la región por medio del método de cascarones cilíndricos acotada por las rectas y las curvas dadas alrededor del eje indicado.",
            R.drawable.ejercicio10t5,
            " 5.045 unidades cubicas",
            "5.225 unidades cubicas ",
            "5.050π unidades cubicas",
            "5.145unidades cubicas",
            1
        )
        questionsList.add(q10)
        return questionsList

    }
}


