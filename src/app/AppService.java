package app;

import app.clasess.Adviser;
import app.enums.WeekDay;
import java.util.Arrays;
import java.util.Scanner;

public class AppService {

    private static Scanner scanner;

    public void mainAppService() {
        AppService.scanner = new Scanner(System.in);

        String incomingText;
        do {
            //ввід
            incomingText = readStringVar("Введіть день тижня (можна без врахування регістра)" + Arrays.toString(WeekDay.values()) + "\nабо натисніть Enter для виходу:");

            if ((incomingText != null) && (!incomingText.isEmpty())) {
                //перевірка чи введений текст входить до переліку
                if (WeekDay.isInEnum(incomingText)) {
                    WeekDay day = WeekDay.valueOf(incomingText);
                    outPuter(new Adviser().advice(day) + "\n");
                } else
                    //вивід якщо введений текст не входить переліку
                    outPuter("Невідомий день тижня. Спробуйте ще.\n");
            }

        } while (!incomingText.isEmpty());

        scanner.close();
    }

    private String readStringVar(String hint) {
        System.out.print(hint);
        return AppService.scanner.nextLine().trim().toUpperCase();
    }

    private void outPuter(String textToOutput) {
        System.out.println(textToOutput);
    }

}
