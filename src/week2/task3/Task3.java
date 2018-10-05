package week2.task3;

public class Task3 {
    //class
}
class Brother{
    // các thuộc tính
    private String name;    //tên
    private int age;    //tuổi
    private int weight;     // cân nặng
    private float hight;    // Chiều cao
    private String emotion;// Cảm xúc
    private String school; // trường học
    public String getName() {
        return name;
    }
    public void setName(String name) { this.name = name; }
    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }
    public int getWeight() { return weight; }
    public void setWeight(int weight) { this.weight = weight; }
    public float getHight() { return hight; }
    public void setHight(float hight) { this.hight = hight; }
    public String getEmotion(){ return emotion; }
    public  void setEmotion(){ this.emotion = emotion; }
    public String getSchool(){ return school; }
    public  void setSchool(){ this.school = school; }

    public Brother(){ // constructor
        name = "Cường";
        age = 16;
        hight = 1.75f;
        weight = 49;
    }
    // phương thức
    public void playGame(){ // chơi game
        name = "PUBG mobile";
        emotion = "excited";
    }
    public void goToSchool(){ // Đến trường
        school = "Treung học phổ thông";
        name = "Liên Hà";
    }
    public void girlFrend(){ // Bạn gái
        name = " Mai";
        age = 16;
        hight = 1.55f;
        weight = 40;
    }
class  MyDog { // con chó
    private int age; // tuổi
    private String name;// tên
    private int weight;// nặng
    private String skill;//Kỹ năng

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public int getWeight() { return weight; }
    public void setWeight(int weight) { this.weight = weight; }
    public String getSkill() { return skill; }
    public void setSkill(String skill) { this.skill = skill; }

    public MyDog() { // constructor
        name = "Becgie";
        age = 2;
        weight = 30;
    }
    public void TrongNha() { // trông nhà
        name = "Gâu Gâu, Gâu ...";
        skill = "Dọa, Nhẩy, vồ, cắn";
    }
    public void GapChu() {// Khi gặp chủ
        name = "Ngoan Ngoan";
        skill = " vẫy đuôi, liếm chân, đi theo";
    }
    public void BiOm() {// Khi bị ốm
        name = "rên cả ngày";
        skill = "Ăn , ngủ, rên";
    }
}
class BangBang{//game Bang Bang trên Zing me

    private String TenNhanVat;   // tên nhân vật
    private String Tank; //xe vừa chơi
    private int SoTank; // số tank
    private int kill, death, sp;// giết , chết , trợ
    private String rank; // hạng

    public String getTenNhanVat() { return TenNhanVat; }
    public void setTenNhanVat(String tenNhanVat) { TenNhanVat = tenNhanVat; }
    public String getTank() { return Tank; }
    public void setTank(String tank) { Tank = tank; }
    public int getSoTank() { return SoTank; }
    public void setSoTank(int soTank) { SoTank = soTank; }
    public int getKill() { return kill; }
    public void setKill(int kill) { this.kill = kill; }
    public int getDeath() { return death; }
    public void setDeath(int death) { this.death = death; }
    public int getSp() { return sp; }
    public void setSp(int sp) { this.sp = sp; }
    public String getRank() { return rank; }
    public void setRank(String rank) { this.rank = rank; }

    public void DiPhuBan(int kill, int death){
        if(kill >= 250 && death < 3)
            System.out.println("Win");
        else
            System.out.println("Lost");
}
    public void TranDauTien(){
            TenNhanVat = "Homie Homie";
            SoTank = 1;
            Tank = "pegasus";
            death = 7;
            kill = 13;
            sp = 6;
            rank = "Đồng 3";
        }

        public void SauMotThang(){
        TenNhanVat ="Tanker Bang";
        SoTank = 10;
        rank = "Kim Cuong";
    }
}





}

//TODO: khai báo 3 class tương ứng với 3 đối tượng thực tế ở dưới
