public class Main {
    public static void main(String[] args) {
        System.out.println("Практическое занятие по Java Core.Экзаменационная часть.");
        System.out.println("Курсовое задание. Книга сотрудников.");

        System.out.println("================================================================================");
        Employee[] employee = new Employee[10];

        Employee ivanovIvanIvanovich = new Employee("Ivanov Ivan Ivanovich", 65799, 1);

        ivanovIvanIvanovich.setEmployee( "Ivanchenko Fedor Pavlovich" );

        ivanovIvanIvanovich.setSalary(72000);

        ivanovIvanIvanovich.setDepartment(2);

        System.out.println(ivanovIvanIvanovich);

        Employee sidorovMikhailAlexandrovich = new Employee("Sidorov Mikhail Alexandrovich",55768,1);

        System.out.println(sidorovMikhailAlexandrovich);

        Employee vasilievMatveiGrigorievich = new Employee("Vasiliev Matvei Grigorievich",60000,1);

        System.out.println(vasilievMatveiGrigorievich);

        Employee fedorovPavelAlekseevich = new Employee("Fedorov Pavel Alekseevich",57800,2);

        System.out.println(fedorovPavelAlekseevich);

        Employee pavlovSergeySergeyevich = new Employee("Pavlov Sergey Sergeyevich",75567,3);

        System.out.println(pavlovSergeySergeyevich);

        Employee konkinValeriyPavlovich = new Employee("Konkin Valeriy Pavlovich",89000,3);

        System.out.println(konkinValeriyPavlovich);

        Employee starovDmitryAlexandrovich = new Employee("Starov Dmitry Alexandrovich",95999, 4);

        System.out.println(starovDmitryAlexandrovich);

        Employee malkinViktorFyodorovich = new Employee("Malkin Viktor Fyodorovich", 98500, 4);

        System.out.println(malkinViktorFyodorovich);

        Employee nikolaevMikhailNikolaevich = new Employee("Nikolaev Mikhail Nikolaevich", 45569,5);

        System.out.println(nikolaevMikhailNikolaevich);

        Employee alekseevAlexeyAlekseevich = new Employee("Alekseev Alexey Alekseevich",50534,5);

        System.out.println(alekseevAlexeyAlekseevich);




    }
}

