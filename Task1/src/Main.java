public class Main {
    //todo Напишите код который распечатает букву и ее код для всех букв русского алфавита формат вывода:
    // А-123
    // Б-321...
    // Коды даны для примера и не соответствуют действительности. Учитывайте, что нужно распечатать коды букв в двух регистрах!
    public static void main(String[] args) {
        //todo код писать тут
        String letters = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";

        for (int i =0; i < letters.length(); i++) {
            System.out.println(letters.charAt(i) + "-" + (int)letters.charAt(i));
            System.out.println(letters.toUpperCase().charAt(i) + "-" + (int)letters.toUpperCase().charAt(i));
            System.out.println("======");
        }



    }
}