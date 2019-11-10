public class main {
    public static void main(String[] args){
        Human human1 = new Teacher("Виктор", 25, "java");
        Human human2 = new Teacher("Василий", 27, "java1");
        Human human3 = new Teacher("Анна", 28, "java2");
        Human human4 = new Teacher("Жанна", 27, "java3");

        Human human5 = new Student("Оля", 21, "java4");
        Human human6 = new Student("Паша", 20, "java5");
        Human human7 = new Student("Женя", 19, "java6");
        Human human8 = new Student("Петя", 20, "java8");

        School school = new School();
        school.addList(human1);
        school.addList(human2);
        school.addList(human3);
        school.addList(human4);
        school.addList(human5);
        school.addList(human6);
        school.addList(human7);
        school.addList(human8);

        System.out.println(school.avelange());
        System.out.println(school.listOfHuman());
        System.out.println(school.avelangePoint());

    }
}
