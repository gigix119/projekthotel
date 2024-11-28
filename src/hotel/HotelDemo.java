package hotel;

public class HotelDemo {
    public static void main(String[] args) {
        //Hotel hotel = new Hotel();
        Menu menu = new Menu();
        //System.out.println(hotel);
        /*UserService userService= new UserService();
        //System.out.println(userService);
        System.out.println(userService.getRooms());
        System.out.println(userService.getAvaiableRooms());
        userService.book(2);
        System.out.println(userService.getAvaiableRooms());
        userService.release(2);
        System.out.println(userService.getAvaiableRooms());*/
        menu.runMenu();
    }
}
