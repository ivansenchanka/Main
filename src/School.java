

import java.util.ArrayList;
import java.util.List;

public class School {

    private List<Human> list = new ArrayList<>();


    public double avelange() {
        double averageAge = 1;
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i).getAge();
        }
        averageAge = sum / list.size();
        return averageAge;
    }

    public void addList(Human human) {
        list.add(human);
    }

    public String listOfHuman() {
        String tmp = "";
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) instanceof Teacher) {
                tmp += ((Teacher) list.get(i)).getSubject();
            }
        }
        return tmp;
    }

    public double avelangePoint() {
        double sum = 0;
        int counter = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) instanceof Student) {
                sum += ((Student) list.get(i)).getPoint();
                counter++;
            }
        }
        return sum / counter;
    }
}
