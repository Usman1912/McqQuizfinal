package com.example.mcqquiz;

public class Questions {
    public String mQuestions[]={


            "which is the 1st planet in our solar system",
            "which is the 2nd planet in our solar system",
            "which is the 3rd planet in our solar system",
            "which is the 4th planet in our solar system",
            "which is the 5th planet in our solar system",
            "which is the 6th planet in our solar system",
            "which is the 7th planet in our solar system",
            "which is the 8th planet in our solar system",
            "which is the 9th planet in our solar system",
            "which planet in our solar system is biggest"


    };
    private String mChoices[][]= {

            {"Mercury","Venus","Earth","Mars"},
            {"Mercury","Venus","Earth","Mars"},
            {"Mercury","Venus","Earth","Mars"},
            {"Mercury","Venus","Earth","Mars"},
            {"jupiter","saturn","uranus","neptune"},
            {"jupiter","saturn","uranus","neptune"},
            {"jupiter","saturn","uranus","neptune"},
            {"jupiter","saturn","uranus","neptune"},
            {"pluto","saturn","uranus","neptune"},
            {"jupiter","saturn","uranus","neptune"}

            };
    private String mCorrectAnswers[]={"Mercury","Venus","Earth","Mars","jupiter","saturn","uranus","neptune","pluto","jupiter"};

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
