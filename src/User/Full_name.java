package User;

public class Full_name {
        private String patronymic;
        private  String name;
        private  String surname;

    public Full_name (String patronymic, String name,String surname) {
        this.patronymic = patronymic;
        this.name = name;
        this.surname = surname;
    }

        public String getPatronymic() {
        return patronymic;
    }
        public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

        public String getName() {
        return name;
    }

        public void setName(String name) {
        this.name = name;
    }

        public String getSurname() {
        return surname;
    }

        public void setSurname() {
        this.surname = surname;
    }

        @Override
        public String toString () {
        return "Full name: " + patronymic + " " + name + " " + surname + "\n";
    }
}
