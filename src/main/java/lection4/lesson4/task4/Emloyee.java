package lection4.lesson4.task4;

import java.time.LocalDateTime;

public class Emloyee {
    private int id;
    private String phone;
    private String name;
    private LocalDateTime hireDate;
    private static int count = 0;

    {
        id = ++count;
    }


    public Emloyee(String phone, String name, LocalDateTime hireDate) {
        this.phone = phone;
        this.name = name;
        this.hireDate = hireDate;
    }

    public int getWorkingYears() {
        int start = hireDate.getYear();
        int now = LocalDateTime.now().getYear();
        return now - start;
    }

    public int getId() {
        return id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getHireDate() {
        return hireDate;
    }

    public void setHireDate(LocalDateTime hireDate) {
        this.hireDate = hireDate;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Emloyee.count = count;
    }

    @Override
    public String toString() {
        return "Emloyee{" +
                "id=" + id +
                ", phone='" + phone + '\'' +
                ", name='" + name + '\'' +
                ", hireDate=" + hireDate +
                '}';
    }
}
