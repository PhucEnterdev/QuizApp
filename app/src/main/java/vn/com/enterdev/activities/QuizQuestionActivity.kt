package vn.com.enterdev.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_quiz_question.*
import vn.com.enterdev.R
import vn.com.enterdev.model.Question
import vn.com.enterdev.singleton.Constants

class QuizQuestionActivity : AppCompatActivity() {

    private var totalPoint : Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_question)

        // lay thong tin cau hoi thu nhat
        getQuestionOne()
        // set background color cho cac dap an selected
        onSelected()
        // logic xu ly
        getSolutionOne()

    }

    private fun getSolutionOne(){
        btn_submit.setOnClickListener {
            tv_answer1.setBackgroundResource(R.drawable.bg_answer_correct)
            if (tv_answer2.isChecked){
                tv_answer2.setBackgroundResource(R.drawable.bg_answer_incorrect)
                tv_answer2.isChecked = false
            }else if(tv_answer3.isChecked){
                tv_answer3.setBackgroundResource(R.drawable.bg_answer_incorrect)
                tv_answer3.isChecked = false
            }else if(tv_answer4.isChecked){
                tv_answer4.setBackgroundResource(R.drawable.bg_answer_incorrect)
                tv_answer4.isChecked = false
            }


            if (tv_answer1.isChecked){
                totalPoint += 1
                progress_bar.max = Constants.getQuestions().size
                progress_bar.progress = totalPoint
                tv_correct_total.text = "$totalPoint/${Constants.getQuestions().size}"
            }else{
                totalPoint = totalPoint
                progress_bar.max = Constants.getQuestions().size
                progress_bar.progress = totalPoint
                tv_correct_total.text = "$totalPoint/${Constants.getQuestions().size}"
            }



            btn_submit.text = "Next"
            btn_submit.setOnClickListener {
                tv_answer1.setBackgroundResource(R.drawable.bg_answer_default)
                tv_answer2.setBackgroundResource(R.drawable.bg_answer_default)
                tv_answer3.setBackgroundResource(R.drawable.bg_answer_default)
                tv_answer4.setBackgroundResource(R.drawable.bg_answer_default)
                // lay cau hoi va giai phap cau ke tiep
                getQuestionTwo()
                btn_submit.text = "Submit"
                getSolutionTwo()
            }
        }

    }
    private fun getSolutionTwo(){
        btn_submit.setOnClickListener {
            tv_answer3.setBackgroundResource(R.drawable.bg_answer_correct)
            if (tv_answer1.isChecked){
                tv_answer1.setBackgroundResource(R.drawable.bg_answer_incorrect)
                tv_answer1.isChecked = false
            }else if(tv_answer2.isChecked){
                tv_answer2.setBackgroundResource(R.drawable.bg_answer_incorrect)
                tv_answer2.isChecked = false
            }else if(tv_answer4.isChecked){
                tv_answer4.setBackgroundResource(R.drawable.bg_answer_incorrect)
                tv_answer4.isChecked = false
            }

            if (tv_answer3.isChecked){
                totalPoint += 1
                progress_bar.max = Constants.getQuestions().size
                progress_bar.progress = totalPoint
                tv_correct_total.text = "$totalPoint/${Constants.getQuestions().size}"
            }else{
                totalPoint = totalPoint
                progress_bar.max = Constants.getQuestions().size
                progress_bar.progress = totalPoint
                tv_correct_total.text = "$totalPoint/${Constants.getQuestions().size}"
            }



            btn_submit.text = "Next"
            btn_submit.setOnClickListener {
                tv_answer1.setBackgroundResource(R.drawable.bg_answer_default)
                tv_answer2.setBackgroundResource(R.drawable.bg_answer_default)
                tv_answer3.setBackgroundResource(R.drawable.bg_answer_default)
                tv_answer4.setBackgroundResource(R.drawable.bg_answer_default)
                getQuestionThree()
                btn_submit.text = "Submit"
                getSolutionThree()
            }
        }

    }
    private fun getSolutionThree(){
        btn_submit.setOnClickListener {
            tv_answer2.setBackgroundResource(R.drawable.bg_answer_correct)
            if (tv_answer1.isChecked){
                tv_answer1.setBackgroundResource(R.drawable.bg_answer_incorrect)
                tv_answer1.isChecked = false
            }else if(tv_answer3.isChecked){
                tv_answer3.setBackgroundResource(R.drawable.bg_answer_incorrect)
                tv_answer3.isChecked = false
            }else if(tv_answer4.isChecked){
                tv_answer4.setBackgroundResource(R.drawable.bg_answer_incorrect)
                tv_answer4.isChecked = false
            }

            if (tv_answer2.isChecked){
                totalPoint += 1
                progress_bar.max = Constants.getQuestions().size
                progress_bar.progress = totalPoint
                tv_correct_total.text = "$totalPoint/${Constants.getQuestions().size}"
            }else{
                totalPoint = totalPoint
                progress_bar.max = Constants.getQuestions().size
                progress_bar.progress = totalPoint
                tv_correct_total.text = "$totalPoint/${Constants.getQuestions().size}"
            }



            btn_submit.text = "Next"
            btn_submit.setOnClickListener {
                tv_answer1.setBackgroundResource(R.drawable.bg_answer_default)
                tv_answer2.setBackgroundResource(R.drawable.bg_answer_default)
                tv_answer3.setBackgroundResource(R.drawable.bg_answer_default)
                tv_answer4.setBackgroundResource(R.drawable.bg_answer_default)
                // lay cau hoi va giai phap cau ke tiep
                getQuestionFour()
                btn_submit.text = "Submit"
                getSolutionFour()
            }
        }

    }
    private fun getSolutionFour(){
        btn_submit.setOnClickListener {
            tv_answer4.setBackgroundResource(R.drawable.bg_answer_correct)
            if (tv_answer1.isChecked){
                tv_answer1.setBackgroundResource(R.drawable.bg_answer_incorrect)
                tv_answer1.isChecked = false
            }else if(tv_answer3.isChecked){
                tv_answer3.setBackgroundResource(R.drawable.bg_answer_incorrect)
                tv_answer3.isChecked = false
            }else if(tv_answer2.isChecked){
                tv_answer2.setBackgroundResource(R.drawable.bg_answer_incorrect)
                tv_answer2.isChecked = false
            }

            if (tv_answer4.isChecked){
                totalPoint += 1
                progress_bar.max = Constants.getQuestions().size
                progress_bar.progress = totalPoint
                tv_correct_total.text = "$totalPoint/${Constants.getQuestions().size}"
            }else{
                totalPoint = totalPoint
                progress_bar.max = Constants.getQuestions().size
                progress_bar.progress = totalPoint
                tv_correct_total.text = "$totalPoint/${Constants.getQuestions().size}"
            }



            btn_submit.text = "Next"
            btn_submit.setOnClickListener {
                tv_answer1.setBackgroundResource(R.drawable.bg_answer_default)
                tv_answer2.setBackgroundResource(R.drawable.bg_answer_default)
                tv_answer3.setBackgroundResource(R.drawable.bg_answer_default)
                tv_answer4.setBackgroundResource(R.drawable.bg_answer_default)
                // lay cau hoi va giai phap cau ke tiep
                getQuestionFive()
                btn_submit.text = "Submit"
                getSolutionFive()
            }
        }

    }
    private fun getSolutionFive(){
        btn_submit.setOnClickListener {
            tv_answer3.setBackgroundResource(R.drawable.bg_answer_correct)
            if (tv_answer1.isChecked){
                tv_answer1.setBackgroundResource(R.drawable.bg_answer_incorrect)
                tv_answer1.isChecked = false
            }else if(tv_answer2.isChecked){
                tv_answer2.setBackgroundResource(R.drawable.bg_answer_incorrect)
                tv_answer2.isChecked = false
            }else if(tv_answer4.isChecked){
                tv_answer4.setBackgroundResource(R.drawable.bg_answer_incorrect)
                tv_answer4.isChecked = false
            }

            if (tv_answer3.isChecked){
                totalPoint += 1
                progress_bar.max = Constants.getQuestions().size
                progress_bar.progress = totalPoint
                tv_correct_total.text = "$totalPoint/${Constants.getQuestions().size}"
            }else{
                totalPoint = totalPoint
                progress_bar.max = Constants.getQuestions().size
                progress_bar.progress = totalPoint
                tv_correct_total.text = "$totalPoint/${Constants.getQuestions().size}"
            }



            btn_submit.text = "Next"
            btn_submit.setOnClickListener {
                tv_answer1.setBackgroundResource(R.drawable.bg_answer_default)
                tv_answer2.setBackgroundResource(R.drawable.bg_answer_default)
                tv_answer3.setBackgroundResource(R.drawable.bg_answer_default)
                tv_answer4.setBackgroundResource(R.drawable.bg_answer_default)
                // lay cau hoi va giai phap cau ke tiep
                getQuestionSix()
                btn_submit.text = "Submit"
                getSolutionSix()
            }
        }

    }
    private fun getSolutionSix(){
        btn_submit.setOnClickListener {
            tv_answer1.setBackgroundResource(R.drawable.bg_answer_correct)
            if (tv_answer3.isChecked){
                tv_answer3.setBackgroundResource(R.drawable.bg_answer_incorrect)
                tv_answer3.isChecked = false
            }else if(tv_answer2.isChecked){
                tv_answer2.setBackgroundResource(R.drawable.bg_answer_incorrect)
                tv_answer2.isChecked = false
            }else if(tv_answer4.isChecked){
                tv_answer4.setBackgroundResource(R.drawable.bg_answer_incorrect)
                tv_answer4.isChecked = false
            }

            if (tv_answer1.isChecked){
                totalPoint += 1
                progress_bar.max = Constants.getQuestions().size
                progress_bar.progress = totalPoint
                tv_correct_total.text = "$totalPoint/${Constants.getQuestions().size}"
            }else{
                totalPoint = totalPoint
                progress_bar.max = Constants.getQuestions().size
                progress_bar.progress = totalPoint
                tv_correct_total.text = "$totalPoint/${Constants.getQuestions().size}"
            }



            btn_submit.text = "Next"
            btn_submit.setOnClickListener {
                tv_answer1.setBackgroundResource(R.drawable.bg_answer_default)
                tv_answer2.setBackgroundResource(R.drawable.bg_answer_default)
                tv_answer3.setBackgroundResource(R.drawable.bg_answer_default)
                tv_answer4.setBackgroundResource(R.drawable.bg_answer_default)
                // lay cau hoi va giai phap cau ke tiep
                getQuestionSeven()
                btn_submit.text = "Submit"
                getSolutionSeven()
            }
        }

    }
    private fun getSolutionSeven(){
        btn_submit.setOnClickListener {
            tv_answer2.setBackgroundResource(R.drawable.bg_answer_correct)
            if (tv_answer1.isChecked){
                tv_answer1.setBackgroundResource(R.drawable.bg_answer_incorrect)
                tv_answer1.isChecked = false
            }else if(tv_answer3.isChecked){
                tv_answer3.setBackgroundResource(R.drawable.bg_answer_incorrect)
                tv_answer3.isChecked = false
            }else if(tv_answer4.isChecked){
                tv_answer4.setBackgroundResource(R.drawable.bg_answer_incorrect)
                tv_answer4.isChecked = false
            }

            if (tv_answer2.isChecked){
                totalPoint += 1
                progress_bar.max = Constants.getQuestions().size
                progress_bar.progress = totalPoint
                tv_correct_total.text = "$totalPoint/${Constants.getQuestions().size}"
            }else{
                totalPoint = totalPoint
                progress_bar.max = Constants.getQuestions().size
                progress_bar.progress = totalPoint
                tv_correct_total.text = "$totalPoint/${Constants.getQuestions().size}"
            }



            btn_submit.text = "Next"
            btn_submit.setOnClickListener {
                tv_answer1.setBackgroundResource(R.drawable.bg_answer_default)
                tv_answer2.setBackgroundResource(R.drawable.bg_answer_default)
                tv_answer3.setBackgroundResource(R.drawable.bg_answer_default)
                tv_answer4.setBackgroundResource(R.drawable.bg_answer_default)
                // lay cau hoi va giai phap cau ke tiep
                getQuestionEight()
                btn_submit.text = "Submit"
                getSolutionEight()
            }
        }

    }
    private fun getSolutionEight(){
        btn_submit.setOnClickListener {
            tv_answer3.setBackgroundResource(R.drawable.bg_answer_correct)
            if (tv_answer1.isChecked){
                tv_answer1.setBackgroundResource(R.drawable.bg_answer_incorrect)
                tv_answer1.isChecked = false
            }else if(tv_answer2.isChecked){
                tv_answer2.setBackgroundResource(R.drawable.bg_answer_incorrect)
                tv_answer2.isChecked = false
            }else if(tv_answer4.isChecked){
                tv_answer4.setBackgroundResource(R.drawable.bg_answer_incorrect)
                tv_answer4.isChecked = false
            }

            if (tv_answer3.isChecked){
                totalPoint += 1
                progress_bar.max = Constants.getQuestions().size
                progress_bar.progress = totalPoint
                tv_correct_total.text = "$totalPoint/${Constants.getQuestions().size}"
            }else{
                totalPoint = totalPoint
                progress_bar.max = Constants.getQuestions().size
                progress_bar.progress = totalPoint
                tv_correct_total.text = "$totalPoint/${Constants.getQuestions().size}"
            }



            btn_submit.text = "Next"
            btn_submit.setOnClickListener {
                tv_answer1.setBackgroundResource(R.drawable.bg_answer_default)
                tv_answer2.setBackgroundResource(R.drawable.bg_answer_default)
                tv_answer3.setBackgroundResource(R.drawable.bg_answer_default)
                tv_answer4.setBackgroundResource(R.drawable.bg_answer_default)
                // lay cau hoi ke tiep
                getQuestionNine()
                btn_submit.text = "Submit"
                getSolutionNine()
            }
        }

    }
    private fun getSolutionNine(){
        btn_submit.setOnClickListener {
            tv_answer4.setBackgroundResource(R.drawable.bg_answer_correct)
            if (tv_answer1.isChecked){
                tv_answer1.setBackgroundResource(R.drawable.bg_answer_incorrect)
                tv_answer1.isChecked = false
            }else if(tv_answer2.isChecked){
                tv_answer2.setBackgroundResource(R.drawable.bg_answer_incorrect)
                tv_answer2.isChecked = false
            }else if(tv_answer3.isChecked){
                tv_answer3.setBackgroundResource(R.drawable.bg_answer_incorrect)
                tv_answer3.isChecked = false
            }

            if (tv_answer4.isChecked){
                totalPoint += 1
                progress_bar.max = Constants.getQuestions().size
                progress_bar.progress = totalPoint
                tv_correct_total.text = "$totalPoint/${Constants.getQuestions().size}"
            }else{
                totalPoint = totalPoint
                progress_bar.max = Constants.getQuestions().size
                progress_bar.progress = totalPoint
                tv_correct_total.text = "$totalPoint/${Constants.getQuestions().size}"
            }



            btn_submit.text = "Next"
            btn_submit.setOnClickListener {
                tv_answer1.setBackgroundResource(R.drawable.bg_answer_default)
                tv_answer2.setBackgroundResource(R.drawable.bg_answer_default)
                tv_answer3.setBackgroundResource(R.drawable.bg_answer_default)
                tv_answer4.setBackgroundResource(R.drawable.bg_answer_default)
                // lay cau hoi va giai phap cau ke tiep
                getQuestionTen()
                btn_submit.text = "Submit"
                getSolutionTen()
            }
        }

    }
    private fun getSolutionTen(){
        btn_submit.setOnClickListener {
            tv_answer2.setBackgroundResource(R.drawable.bg_answer_correct)
            if (tv_answer1.isChecked){
                tv_answer1.setBackgroundResource(R.drawable.bg_answer_incorrect)
                tv_answer1.isChecked = false
            }else if(tv_answer4.isChecked){
                tv_answer4.setBackgroundResource(R.drawable.bg_answer_incorrect)
                tv_answer4.isChecked = false
            }else if(tv_answer3.isChecked){
                tv_answer3.setBackgroundResource(R.drawable.bg_answer_incorrect)
                tv_answer3.isChecked = false
            }

            if (tv_answer2.isChecked){
                totalPoint += 1
                progress_bar.max = Constants.getQuestions().size
                progress_bar.progress = totalPoint
                tv_correct_total.text = "$totalPoint/${Constants.getQuestions().size}"
            }else{
                totalPoint = totalPoint
                progress_bar.max = Constants.getQuestions().size
                progress_bar.progress = totalPoint
                tv_correct_total.text = "$totalPoint/${Constants.getQuestions().size}"
            }



            btn_submit.text = "Finish"
            btn_submit.setOnClickListener {
                pushResult()
            }
        }

    }

    private fun pushResult(){
        val intent : Intent = Intent(this, ResultActivity::class.java)

        val name:String = this.intent.getStringExtra(Constants.USER_NAME).toString()
        intent.putExtra(Constants.USER_NAME, name)
        intent.putExtra(Constants.CORRECT_ANSWER, totalPoint)
        intent.putExtra(Constants.TOTAL_QUESTIONS, Constants.getQuestions().size)
        startActivity(intent)
        finish()
    }

    private fun onSelected(){
        tv_answer1.setOnClickListener {
            tv_answer1.isChecked = true
            tv_answer2.isChecked = false
            tv_answer3.isChecked = false
            tv_answer4.isChecked = false
            if (tv_answer1.isChecked){
                tv_answer1.setBackgroundResource(R.drawable.bg_answer_selected)
                tv_answer2.setBackgroundResource(R.drawable.bg_answer_default)
                tv_answer3.setBackgroundResource(R.drawable.bg_answer_default)
                tv_answer4.setBackgroundResource(R.drawable.bg_answer_default)
            }
        }

        tv_answer2.setOnClickListener{
            tv_answer1.isChecked = false
            tv_answer2.isChecked = true
            tv_answer3.isChecked = false
            tv_answer4.isChecked = false
            if (tv_answer2.isChecked){
                tv_answer1.setBackgroundResource(R.drawable.bg_answer_default)
                tv_answer2.setBackgroundResource(R.drawable.bg_answer_selected)
                tv_answer3.setBackgroundResource(R.drawable.bg_answer_default)
                tv_answer4.setBackgroundResource(R.drawable.bg_answer_default)
            }
        }

        tv_answer3.setOnClickListener{
            tv_answer1.isChecked = false
            tv_answer2.isChecked = false
            tv_answer3.isChecked = true
            tv_answer4.isChecked = false
            if (tv_answer3.isChecked){
                tv_answer1.setBackgroundResource(R.drawable.bg_answer_default)
                tv_answer2.setBackgroundResource(R.drawable.bg_answer_default)
                tv_answer3.setBackgroundResource(R.drawable.bg_answer_selected)
                tv_answer4.setBackgroundResource(R.drawable.bg_answer_default)
            }
        }

        tv_answer4.setOnClickListener{
            tv_answer1.isChecked = false
            tv_answer2.isChecked = false
            tv_answer3.isChecked = false
            tv_answer4.isChecked = true
            if (tv_answer4.isChecked){
                tv_answer1.setBackgroundResource(R.drawable.bg_answer_default)
                tv_answer2.setBackgroundResource(R.drawable.bg_answer_default)
                tv_answer3.setBackgroundResource(R.drawable.bg_answer_default)
                tv_answer4.setBackgroundResource(R.drawable.bg_answer_selected)
            }
        }
    }



    // Lay cau hoi

    private fun getQuestionOne(){
        var question1: Question = Constants.getQuestions()[0]
        tv_question.text = question1.question
        img_flag.setImageResource(question1.image)
        tv_answer1.text = question1.optionOne
        tv_answer2.text = question1.optionTwo
        tv_answer3.text = question1.optionThree
        tv_answer4.text = question1.optionFour
    }

    private fun getQuestionTwo(){
        var question2: Question = Constants.getQuestions()[1]
        tv_question.text = question2.question
        img_flag.setImageResource(question2.image)
        tv_answer1.text = question2.optionOne
        tv_answer2.text = question2.optionTwo
        tv_answer3.text = question2.optionThree
        tv_answer4.text = question2.optionFour
    }

    private fun getQuestionThree(){
        var question3: Question = Constants.getQuestions()[2]
        tv_question.text = question3.question
        img_flag.setImageResource(question3.image)
        tv_answer1.text = question3.optionOne
        tv_answer2.text = question3.optionTwo
        tv_answer3.text = question3.optionThree
        tv_answer4.text = question3.optionFour
    }

    private fun getQuestionFour(){
        var question4: Question = Constants.getQuestions()[3]
        tv_question.text = question4.question
        img_flag.setImageResource(question4.image)
        tv_answer1.text = question4.optionOne
        tv_answer2.text = question4.optionTwo
        tv_answer3.text = question4.optionThree
        tv_answer4.text = question4.optionFour
    }

    private fun getQuestionFive(){
        var question5: Question = Constants.getQuestions()[4]
        tv_question.text = question5.question
        img_flag.setImageResource(question5.image)
        tv_answer1.text = question5.optionOne
        tv_answer2.text = question5.optionTwo
        tv_answer3.text = question5.optionThree
        tv_answer4.text = question5.optionFour
    }

    private fun getQuestionSix(){
        var question6: Question = Constants.getQuestions()[5]
        tv_question.text = question6.question
        img_flag.setImageResource(question6.image)
        tv_answer1.text = question6.optionOne
        tv_answer2.text = question6.optionTwo
        tv_answer3.text = question6.optionThree
        tv_answer4.text = question6.optionFour
    }

    private fun getQuestionSeven(){
        var question7: Question = Constants.getQuestions()[6]
        tv_question.text = question7.question
        img_flag.setImageResource(question7.image)
        tv_answer1.text = question7.optionOne
        tv_answer2.text = question7.optionTwo
        tv_answer3.text = question7.optionThree
        tv_answer4.text = question7.optionFour
    }

    private fun getQuestionEight(){
        var question8: Question = Constants.getQuestions()[7]
        tv_question.text = question8.question
        img_flag.setImageResource(question8.image)
        tv_answer1.text = question8.optionOne
        tv_answer2.text = question8.optionTwo
        tv_answer3.text = question8.optionThree
        tv_answer4.text = question8.optionFour
    }

    private fun getQuestionNine(){
        var question9: Question = Constants.getQuestions()[8]
        tv_question.text = question9.question
        img_flag.setImageResource(question9.image)
        tv_answer1.text = question9.optionOne
        tv_answer2.text = question9.optionTwo
        tv_answer3.text = question9.optionThree
        tv_answer4.text = question9.optionFour
    }

    private fun getQuestionTen(){
        var question10: Question = Constants.getQuestions()[9]
        tv_question.text = question10.question
        img_flag.setImageResource(question10.image)
        tv_answer1.text = question10.optionOne
        tv_answer2.text = question10.optionTwo
        tv_answer3.text = question10.optionThree
        tv_answer4.text = question10.optionFour
    }
}