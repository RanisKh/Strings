public class Main {
    public static void main(String[] args) {
        System.out.println("1 task");
    String firstName = "Ivan";
    String middleName =  "Ivanov";
    String lastName = "Ivanovich";
    String fullName = middleName + " " + firstName + " " + lastName;
        System.out.println("Ф. И. О. сотрудника —" + fullName);

        System.out.println("2 task");
        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета —" + fullName.toUpperCase());

        System.out.println("3 task");
        String fulName = "Иванов Семён Семёнович";
        String changed = fulName.replace("ё", "е");
        System.out.println("Данные Ф. И. О. сотрудника —" + changed);
    }
}