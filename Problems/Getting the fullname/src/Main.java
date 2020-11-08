class User {
    private String firstName;
    private String lastName;

    public User() {
        this.firstName = "";
        this.lastName = "";
    }

    public void setFirstName(String firstName) {
        // write your code here
        if (firstName == null) {
            firstName = "";
        } else {
            this.firstName = firstName;
        }
    }

    public void setLastName(String lastName) {
        // write your code here
        if (lastName == null) {
            lastName = "";
        } else {
            this.lastName = lastName;
        }
    }

    public String getFullName() {

        if (firstName.isEmpty() && lastName.isEmpty()) {
            return "Unknown";
        }

        if (firstName.isEmpty()) {
            return lastName;
        }

        if (lastName.isEmpty()) {
            return firstName;
        }

        return firstName + " " + lastName;
    }
}