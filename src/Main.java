public class Main {
    public static void main(String[] args) {


        University university1 = new University();
        University university2 = new University();
        University university3 = new University();
        System.out.println("--------------------Universitys------------------------------");
        System.out.print(1+")");
        university1.setNameUniversity(" Med academy");
        System.out.println(university1.getNameUniversity());
        university1.setAddressUniversity("Bishkek Ahunbaeva 145");
        System.out.println(university1.getAddressUniversity());
        university1.setYearOfCreationUniversity(1947);
        System.out.println(university1.getYearOfCreationUniversity());
        System.out.println();
        System.out.print(2+")");
        university2.setNameUniversity("BGU");
        System.out.println(university2.getNameUniversity());
        university2.setAddressUniversity("Bishkek prospect Mira 17");
        System.out.println(university2.getAddressUniversity());
        university2.setYearOfCreationUniversity(1965);
        System.out.println(university2.getYearOfCreationUniversity());
        System.out.println();
        System.out.print(3+")");
        university3.setNameUniversity("KNU");
        System.out.println(university3.getNameUniversity());
        university3.setAddressUniversity("Bishkek Frunze street 35");
        System.out.println(university3.getAddressUniversity());
        university3.setYearOfCreationUniversity(1986);
        System.out.println(university3.getYearOfCreationUniversity());

        Car car1 = new Car();
        Car car2 = new Car();
        Car car3 = new Car();
        System.out.println("------------------------Cars---------------------------------------");
        System.out.print(1 + ")");
        car1.setModel("Mercedes-benz");
        car1.setColor("Black");
        car1.setYearOfIssue(1995);
        System.out.println(car1.getModel());
        System.out.println(car1.getColor());
        System.out.println(car1.getYearOfIssue());
        System.out.println();
        System.out.print(2 + ")");
        car2.setModel("TOYOTA");
        car2.setColor("White");
        car2.setYearOfIssue(1992);
        System.out.println(car2.getModel());
        System.out.println(car2.getColor());
        System.out.println(car2.getYearOfIssue());
        System.out.println();
        System.out.print(3 + ")");
        car3.setModel("BMW");
        car3.setColor("Red");
        car3.setYearOfIssue(1925);
        System.out.println(car3.getModel());
        System.out.println(car3.getColor());
        System.out.println(car3.getYearOfIssue());


        School school1 = new School();
        School school2 = new School();
        School school3 = new School();
        System.out.println("--------------------------Schools--------------------------------");
        System.out.print(1 + ")");
        school1.setNameSchool("Secondary school #135");
        school1.setYearOfCreationSchool(1975);
        school1.setAddressSchool("Bishkek");
        System.out.println(school1.getNameSchool());
        System.out.println(school1.getYearOfCreationSchool());
        System.out.println(school1.getAddressSchool());
        System.out.println();
        System.out.print(2 + ")");
        school2.setNameSchool("Secondary school #139");
        school2.setYearOfCreationSchool(1999);
        school2.setAddressSchool("Bishkek");
        System.out.println(school2.getNameSchool());
        System.out.println(school2.getYearOfCreationSchool());
        System.out.println(school2.getAddressSchool());
        System.out.println();
        System.out.print(3 + ")");
        school3.setNameSchool("Secondary school #123");
        school3.setYearOfCreationSchool(1985);
        school3.setAddressSchool("Bishkek");
        System.out.println(school3.getNameSchool());
        System.out.println(school3.getYearOfCreationSchool());
        System.out.println(school3.getAddressSchool());


        Person person1 = new Person();
        Person person2 = new Person();
        Person person3 = new Person();
        System.out.println("----------------------Persons-----------------------------------");
        System.out.println();
        System.out.print(1 + ")");
        person1.setName("Uluk");
        person1.setAge((byte) 18);
        person1.setEmail("uluk@gmail.com");
        System.out.println(person1.getName());
        System.out.println(person1.getAge());
        System.out.println(person1.getEmail());
        System.out.print(2 + ")");
        person2.setName("Azim");
        person2.setAge((byte) 12);
        person2.setEmail("azim@gmail.com");
        System.out.println(person2.getName());
        System.out.println(person2.getAge());
        System.out.println(person2.getEmail());
        System.out.print(3 + ")");
        person3.setName("Samia");
        person3.setAge((byte) 15);
        person3.setEmail("samia@gmail.com");
        System.out.println(person3.getName());
        System.out.println(person3.getAge());
        System.out.println(person3.getEmail());




    }
}