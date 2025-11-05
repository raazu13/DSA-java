package project;

class Contact {
        String name;
        String phone;
        String email;

        Contact(String name, String phone, String email) {
            this.name = name;
            this.phone = phone;
            this.email = email;
        }

        void displayContact() {
            System.out.println("Name  : " + name);
            System.out.println("Phone : " + phone);
            System.out.println("Email : " + email);
            System.out.println("------------------------");
        }
    }

