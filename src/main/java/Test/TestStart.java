package Test;

import Questions.QuestionGenerate;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TestStart {

    QuestionGenerate questionGenerate = new QuestionGenerate();


    File file = new File("C:\\Users\\Пользователь\\OneDrive\\Рабочий стол\\SoloLearn2.1-master\\src\\test1.txt");
    FileWriter writer = new FileWriter(file);
    Scanner scanner = new Scanner(System.in);
    int countCorrectAnswer = 0;
    public TestStart() throws IOException {
    }

    public void chooseQuestion() throws IOException {
        for (int i = 0; i < 10; i++) {

            questionGenerate.showQuestion(i);
            System.out.println("Введите ответ цифрами от 1 до 4");
            String inputAnswer = scanner.nextLine();
            questionGenerate.writer.write(inputAnswer + "\n");


            if (inputAnswer.equals(questionGenerate.correctAnswer)) {
                countCorrectAnswer++;

            }
            writer.write(inputAnswer);
        }

        System.out.println("Вы ответили на " + countCorrectAnswer * 10 + " % вопросов.");
        questionGenerate.writer.close();
    }
}
