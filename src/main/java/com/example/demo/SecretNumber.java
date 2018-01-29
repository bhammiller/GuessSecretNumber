package com.example.demo;
import java.util.Random;
public class SecretNumber {
    public String numberer(){
        Integer guess_number;
        Random r = new Random();
        Character secret_answer;
        Integer secret_number = 1 + r.nextInt(10);
        do{
            if (guess_number == secret_number){
                secret_answer = 'Y';
            }else{
                secret_answer = 'N';
            }


        }while (secret_answer != 'Y')

    }
}
