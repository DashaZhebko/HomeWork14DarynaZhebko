public class Person {

    public static void staticPersonInfo(String nameSurname, String town, long phoneNumber) {
        System.out.println("Зателефонувати громадянину " + nameSurname + " з міста " +
                town + " можна за номером телефону " + phoneNumber+ ".");
    }

    public void personInfo(String nameSurname, String town, long phoneNumber) {
        System.out.println("Зателефонувати громадянину " + nameSurname + " з міста " +
                town + " можна за номером телефону " + phoneNumber+ ".");
    }

    public String returnPersonInfo(String nameSurname, String town, long phoneNumber){
        return "Зателефонувати громадянину " + nameSurname + " з міста " +
                town + " можна за номером телефону " + phoneNumber + ".";
    }

}
