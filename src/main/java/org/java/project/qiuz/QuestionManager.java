package org.java.project.qiuz;

public class QuestionManager {
    public static void main(String[] args) throws InterruptedException {
        QuestionService service = new QuestionService();
        service.startQuiz("Yashwanth");
    }
}
