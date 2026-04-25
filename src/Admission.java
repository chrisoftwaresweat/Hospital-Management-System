public class Admission {

    private Patient[] rooms = new Patient[10];

    public int assignRoom(Patient patient) {

        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i] == null) {

                rooms[i] = patient;
                int roomNumber = i + 1;

                System.out.printf("%s assigned to room %02d\n",
                        patient.getName(), roomNumber);

                return roomNumber;
            }
        }

        System.out.println("No available rooms");
        return -1;
    }

    public void dischargePatient(int roomNumber) {
        if (roomNumber >= 1 && roomNumber <= 10) {
            rooms[roomNumber - 1] = null;
            System.out.printf("Room %02d is now available\n", roomNumber);
        }
    }

    public void displayRooms() {
        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i] != null) {
                System.out.printf("Room %02d - %s\n",
                        i + 1, rooms[i].getName());
            }
        }
    }
}