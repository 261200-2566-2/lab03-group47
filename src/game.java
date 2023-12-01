public class game {
    String playername;
    double damage;
    double mana;
    double hp;
    double shield;
    double speed;
    int level;
    double basedamage;
    double shieldbase;
    double speedbase;
    double swordweight;
    double shieldweight;


    public game(){
        basedamage = 2.0;
        shieldbase = 10.0;
        speedbase = 100;
    }


    public void display() {
        System.out.println("------------------------");
        System.out.println("Player name : " + playername);
        System.out.println("Level : " + level);
        System.out.println("HP : " + hp);
        System.out.println("Mana : " + mana);
        System.out.println("Speed : " + speed);
        System.out.println("Damage : " + damage);
        System.out.println("Shield : " + shield);
        System.out.println("------------------------");
    }
    //โค้ดตรงส่วนนี้มีไว้แสดงสเตตัสของตัวละคร
    public void generatePlayer(String playername) {

        this.level = 0;
        this.playername = playername;
        base();

    }
    //สร้างตัวละครและชื่อและตั้งค่าสเตตัสเริ่มต้น


    public void base(){
        damage = 2.0;
        shield = 10.0;
        speed = 100;
        setHp();
        setMana();
        setSpeed();

    }
    //สเตตัสเริ่มต้นของตัวละคร
    public void levelup(){
        level++;
        setHp();
        setMana();
        setSpeed();

    }
    //เวลาเลเวลอัพจะมีการอัพเดทสเตตัสต่างๆที่กำหนดไว้ให้มค่าเพิ่มขึ้น

    public boolean checkSword(boolean x){
        if(x == true){
            setDamage();
            swordweight=basedamage*(0.1+0.04*level);
            setSpeed();

        }
        else if (x == false){
            damage = basedamage;
            this.speed = speedbase*(0.1+(0.04*level));
        }
        return  x;
    }
    //เอาไว้เช็คว่าตัวละครนี้ใช้อาวุธหรือไม่ ถ้าใช้อาวุธก็จะอัพเดทดาเมจตามเลเวล และน้ำหนักของวัตถุ
    //ถ้าไม่ใช้ก็จะใช้ดาเมจตาม basedamage

    public boolean checkShield(boolean x){
        if(x == true){
            setShield();
            shieldweight=shieldbase*(0.1+0.08*level);
            setSpeed();
        }
        else if (x == false){
            shield = shieldbase;
            this.speed = (speedbase*(0.1+(0.04*level)));
        }
        return  x;
    }
    //เอาไว้เช็คว่าตัวละครนี้ใช้โล่หรือไม่ ถ้าใช้็จะอัพเดทค่าโล่ตามเลเวล และน้ำหนักของวัตถุ
    //ถ้าไม่ใช้ก็จะใช้ดาเมจตาม basedamage
    public void setHp() {
        this.hp = 100+(10*level);
    }
    public void setMana(){
        this.mana = 50+(2*level);
    }
    public void setSpeed(){
        this.speed = (speedbase*(0.1+(0.04*level)))-(shieldweight+swordweight);
    }
    public void setDamage(){
        this.damage = basedamage*(1+(0.1*level));
//        this.damage = 3;
    }
    public void setShield(){
        this.shield = shieldbase*(1+(0.05*level));
    }

}
