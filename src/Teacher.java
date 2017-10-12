public class Teacher {
    private String ID;

    public Teacher(String ID){
        this.setID(ID);
    }
    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "ID='" + ID + '\'' +
                '}';
    }
}
