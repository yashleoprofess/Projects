package org.java.project.qiuz;

import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class QuestionService {
    private List<Question> questions;
    public QuestionService(){
        this.questions=QuestionUtil.getQuestion();
    }

    public void startQuiz(String userName)throws  InterruptedException{
        System.out.println("Welcome to the Quiz :"+userName);
        System.out.println("-".repeat(50));
        System.out.println("Please wait for to start Quiz......");
        TimeUnit.SECONDS.sleep(5);
        System.out.println("Total Questions : "+questions.size());
        Scanner sc =new Scanner(System.in);
        int qno=1;
        int score =0;
        for (Question question:questions){
            System.out.println("Q "+qno+")"+question.getQuestion());
            List<String> options=question.getOptions();
            for (int i=0;i<options.size();i++){
                System.out.println("\t"+(i+1)+"."+options.get(i));
            }
            System.out.println("Enter the option :");
            int answer =sc.nextInt();
            if (answer ==question.getAnswer()){
                score++;
            }
            qno++;
        }
        System.out.println("please wait for the Result .......");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Total Questions :"+questions.size());
        System.out.println("Correct Answer :"+score);
        System.out.println("Wrong Answer :"+(questions.size()-score));
    }
}
