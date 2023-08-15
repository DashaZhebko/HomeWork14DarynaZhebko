public class HomeWork14 {
    public static void main(String[] args) {

        Person.staticPersonInfo("Will Smith", "New York", 2936729462846L);

        Person person2 = new Person();
        person2.personInfo("Jackie Chan", " Shanghai", 12312412412L);

        Person person3 = new Person();
        String stringInfo = person3.returnPersonInfo("Sherlock Holmes", "London", 37742123513L);
        System.out.println(stringInfo);

    }
}
