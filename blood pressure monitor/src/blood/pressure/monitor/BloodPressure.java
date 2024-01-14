/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package blood.pressure.monitor;



public class BloodPressure {
    int id;
     String name;
   String yob;
    int systolic;
   int diastolic;

    public BloodPressure(int id, String name, String yob, int systolic, int diastolic) {
        this.id = id;
        this.name = name;
        this.yob = yob;
        this.systolic = systolic;
        this.diastolic = diastolic;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getYob() {
        return yob;
    }

    public void setYob(String yob) {
        this.yob = yob;
    }

    public int getSystolic() {
        return systolic;
    }

    public void setSystolic(int systolic) {
        this.systolic = systolic;
    }

    public int getDiastolic() {
        return diastolic;
    }

    public void setDiastolic(int diastolic) {
        this.diastolic = diastolic;
    }
   
   public void display(){}
   
   public void calculate(){}
    
}
