package enums;

class contact {
    private String name;
    private String address;
    private String type;
    private String email;
    private String phone;

    public contact(String name, String address, String type, String email, String phone) {
        this.name = name;
        this.address = address;
        this.type = type;
        this.email = email;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "contact{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", type='" + type + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
