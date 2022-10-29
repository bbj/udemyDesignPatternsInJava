package com.bbj;

public class InterviewQuestionsProcessor {

    public static void process(InterviewQuestion question) {

//        // here the if instanceof is a good sign of violating the OCP
//        // the casting is another good sign
//        if (question instanceof AlgorithmsInterviewQuestion) {
//            AlgorithmsInterviewQuestion algorithmsInterviewQuestion = (AlgorithmsInterviewQuestion) question;
//            algorithmsInterviewQuestion.executeAlgorithms();
//        } else if (question instanceof AIInterviewQuestion) {
//            AIInterviewQuestion aiInterviewQuestion = (AIInterviewQuestion) question;
//            aiInterviewQuestion.executeAI();
//        } else if (question instanceof FinanceInterviewQuestion) {
//            FinanceInterviewQuestion financeInterviewQuestion = (FinanceInterviewQuestion) question;
//            financeInterviewQuestion.executeFinance();
//        }

        // this is a typical implementation of the loosely coupled software system (program to interfaces)
        // this class does not need to know about question types and classes
        // THIS IS PURE ABSTRACTION!!!!
        question.execute();
    }
}
