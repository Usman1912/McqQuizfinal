package com.example.mcqquiz;

public class Questions {
    public String mQuestions[]={


            "How many days do we have in a week?",
            "How many days are there in a year?",
            "How many colors are there in a rainbow",
            "Which animal is known as the ‘Ship of the Desert?’",
            "How many letters are there in the English alphabet?",
            "How many sides are there in a triangle?",
            "In which direction does the sun rise?",
            "Which month of the year has the least number of days?",
            "We smell with our",
            "What do you call the person who brings a letter to your home from post office?"


    };
    private String mChoices[][]= {

            {"five","six","seven","eight"},
            {"363","364","365","366"},
            {"five","six","seven","eight"},
            {"goat","sheep","lion","camel"},
            {"26","27","28","29"},
            {"five","six","three","two"},
            {"east","west","south","north"},
            {"feb","jan","mar","jun"},
            {"eyes","mouth","ears","nose"},
            {"policeman","postman","peon","officer"}

            };
    private String mCorrectAnswers[]={"seven","365","seven","camel","26","three","east","feb","nose","postman"};

    public String getQuestion(int a){
        String question=mQuestions[a];
        return question;

    }

    public String getChoice(int a){
        String choice=mChoices[a][0];
        return choice;

    }
    public String getChoice2(int a){
        String choice=mChoices[a][1];
        return choice;

    }
    public String getChoice3(int a){
        String choice=mChoices[a][2];
        return choice;

    }
    public String getChoice4(int a){
        String choice=mChoices[a][3];
        return choice;

    }
    public String getCorrectAnswer(int a){
      String answer=mCorrectAnswers[a];
      return answer;
    };

}
