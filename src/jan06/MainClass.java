/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jan06;

import java.util.Map;

public class MainClass {

    public static void main(String[] args) {

        TraineeService service = new TraineeService();
        Map<Integer, Trainee> trainees = service.getTrainees();

        for (Map.Entry<Integer, Trainee> entry : trainees.entrySet()) {
            Trainee t = entry.getValue();
            System.out.println(
                "ID: " + t.id +
                ", Address Code: " + t.address.code +
                ", Area: " + t.address.area
            );
        }
    }
}
