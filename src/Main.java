public class Main {
    public static void main(String[] args) {
        game A = new game();
        game B = new game();
        A.generatePlayer("A");
        B.generatePlayer("B");
        A.checkSword(true);
        A.checkShield(true);
        A.display();
        A.levelup();
        A.display();
        A.levelup();
        A.display();
        B.display();
//อันนี้ลองเทสว่าเวลาเลเวลอัพค่าสเตตัสจะอัพขึ้นตามเลเวลหรือไม่


    }
}