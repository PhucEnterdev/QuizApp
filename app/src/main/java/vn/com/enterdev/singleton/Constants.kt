package vn.com.enterdev.singleton

import vn.com.enterdev.R
import vn.com.enterdev.model.Question

object Constants {
    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS : String = "total_questions"
    const val CORRECT_ANSWER : String = "correct_answer"

    fun getQuestions() : ArrayList<Question>{
        var questionList = ArrayList<Question>()
        val question1 = Question(
            1,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_argentina,
            "Argentina",
            "Brazil",
            "Australia",
            "Russia",
            1
        )
        questionList.add(question1)


        val question2 = Question(
            2,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_australia,
            "Argentina",
            "Brazil",
            "Australia",
            "Russia",
            3
        )
        questionList.add(question2)

        val question3 = Question(
            3,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_brazil,
            "England",
            "Brazil",
            "Australia",
            "Vietnamese",
            2
        )
        questionList.add(question3)

        val question4 = Question(
            4,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_belgium,
            "Argentina",
            "Brazil",
            "Australia",
            "Belgium",
            4
        )
        questionList.add(question4)

        val question5 = Question(
            5,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_denmark,
            "Argentina",
            "Brazil",
            "Denmark",
            "Belgium",
            3
        )
        questionList.add(question5)

        val question6 = Question(
            6,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_fiji,
            "Fiji",
            "Brazil",
            "Australia",
            "Belgium",
            1
        )
        questionList.add(question6)

        val question7 = Question(
            7,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_germany,
            "Argentina",
            "Germany",
            "Australia",
            "Belgium",
            2
        )
        questionList.add(question7)

        val question8 = Question(
            8,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_india,
            "Vietnamese",
            "China",
            "India",
            "Korea",
            3
        )
        questionList.add(question8)

        val question9 = Question(
            9,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_kuwait,
            "Argentina",
            "Germany",
            "Australia",
            "Kuwait",
            4
        )
        questionList.add(question9)

        val question10 = Question(
            10,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_new_zealand,
            "Argentina",
            "New Zealand",
            "Australia",
            "Belgium",
            2
        )
        questionList.add(question10)

        return questionList
    }
}