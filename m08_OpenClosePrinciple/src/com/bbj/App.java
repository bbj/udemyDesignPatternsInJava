package com.bbj;

public class App {

    public static void main(String[] args) {

        /*
         - we have several interview question types: A (Algo), AI (Artificial Intelligence), QF (Quantitative Finance)
         - we are going to create separate classes for them (AlgorithmsInterviewQuestion, AIInterviewQuestion, FinanceInterviewQuestion)
         - then we will have an interview question processor which is generic (InterviewQuestionProcessor)
         - we have to apply the open/close principle
         - so we need a common interface to handle these classes (InterviewQuestion)
         - then in every interview questions class: (e.g. Finance...)
            - public class FinanceInterviewQuestion implements InterviewQuestion
            - public void executeFinance() { ...}
         - then let's write InterviewQuestionProcessor class
            - if (question instanceof AlgorithmsInterviewQuestion) {
                AlgorithmsInterviewQuestion algoq = (AlgorithmsInterviewQuestion) question;
                algoq.executeAlgorithms();
              }
            - the "if instanceof" is a good sign of violating the OCP
            - the casting is another good sign
         */

        InterviewQuestionsProcessor.process(new AlgorithmsInterviewQuestion());
        // Algorithms related questions...

        /* Problem:
            - if we have to create another topic, e.g. CS (Computer Science)
            - we have to create another CSInterviewQuestion class
            - BUT!!!! we have to MODIFY EXISTING CLASS!!!!! InterviewQuestionProcessor which VIOLATE Open/Close Principle
         */

        InterviewQuestionsProcessor.process(new CSInterviewQuesion());
        //CS Questions without the need to update processor class

    }
}
