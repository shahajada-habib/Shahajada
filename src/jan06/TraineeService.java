package jan06;

import java.util.HashMap;
import java.util.Map;

class Address {
    int code;
    String area;

    Address(int code, String area) {
        this.code = code;
        this.area = area;
    }
}

class Trainee {
    int id;
    Address address;

    Trainee(int id, Address address) {
        this.id = id;
        this.address = address;
    }
}

public class TraineeService {

    public Map<Integer, Trainee> getTrainees() {

        Map<Integer, Trainee> trainees = new HashMap<>();

        trainees.put(1, new Trainee(1, new Address(4000, "Chittagong")));
        trainees.put(2, new Trainee(2, new Address(1207, "Dhaka")));
        trainees.put(3, new Trainee(3, new Address(3100, "Sylhet")));

        return trainees;
    }
}
