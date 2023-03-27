package Questions;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class QuestionGenerate {


    public QuestionGenerate() throws IOException {
    }

   public File file = new File("C:\\Users\\Пользователь\\OneDrive\\Рабочий стол\\SoloLearn2.1-master\\src\\test1.txt");

   public FileWriter writer = new FileWriter(file);

    public ArrayList<Question> getListQuestion() {
        return listQuestion;
    }

    private final ArrayList<Question> listQuestion = new ArrayList<>();

    Question questionFirst = new Question("Как называется группа файлов, которая хранится отдельной группой и имеет собственное имя",
            new String[]{"Байт", "Каталог", "Дискета", "Журнал"}, 2);

    Question questionSecond = new Question("Как называются данные или программа на магнитном диске",
            new String[]{"Папка", "Файл", "Дискета", "Библиотека"}, 2);

    Question questionThird = new Question("Какие символы разрешается использовать в имени файла или имени директории в Windows",
            new String[]{"Цифры и только латинские буквы", "Латинские, русские букву и цифры", "Русские и латинские буквы", "Любые символы"}, 2);

    Question questionFourth = new Question("Выберите имя файла Anketa с расширением txt.",
            new String[]{" Anketa.txt.", "Anketa.txt", "Anketa/txt.", "txt.Anketa"}, 1);

    Question questionFifth = new Question("Укажите неправильное имя каталога.",
            new String[]{"CD2MAN", "CD-MAN", "CD/MAN"}, 3);

    Question questionSixth = new Question(" Какое наибольшее количество символов имеет имя файла или каталога в Windows?",
            new String[]{"255", "10", "8", "24"}, 1);

    Question questionSeventh = new Question("Какое наибольшее количество символов имеет расширение имени файла?",
            new String[]{"3", "8", "2", "4"}, 1);

    Question questionEight = new Question("Какое расширение у исполняемых файлов?",
            new String[]{"exe, doс", "bak, bat", "exe, com, bat", "txt"}, 3);

    Question questionNinth = new Question("Что необходимо компьютеру для нормальной работы?",
            new String[]{"Различные прикладные программы", "Операционная система", "Дискета в дисководе", "Кислород"}, 2);

    Question questionTenth = new Question("Сколько окон может быть одновременно открыто?",
            new String[]{"Много", "Одно", "Два", "Десять"}, 1);

    public void addQuestions() {
        listQuestion.add(questionFirst);
        listQuestion.add(questionSecond);
        listQuestion.add(questionThird);
        listQuestion.add(questionFourth);
        listQuestion.add(questionFifth);
        listQuestion.add(questionSixth);
        listQuestion.add(questionSeventh);
        listQuestion.add(questionEight);
        listQuestion.add(questionNinth);
        listQuestion.add(questionTenth);
    }

    public int correctAnswer;


    public void showQuestion(int numberOfQuestion) throws IOException {
        addQuestions();
        Integer[] arr = new Integer[((int) (Math.random() * (10 - 1) + 1))];
        int i;
        for ( i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        Collections.shuffle(Arrays.asList(arr));

        writer.write(listQuestion.get(i).question + "\n"
                + Arrays.toString(listQuestion.get(i).answer) + "\n");

        System.out.println(listQuestion.get(i).question + "\n"
                + Arrays.toString(listQuestion.get(i).answer));

        correctAnswer = listQuestion.get(i).correctAnswer;
    }
}
