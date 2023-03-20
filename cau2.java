import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

abstract class Hinh{
    public abstract double dienTich();
}
class HinhChuNhat extends Hinh{
    private float cd;
    private float cr;
    public HinhChuNhat(){
        super();
    }
    public HinhChuNhat(float cd, float cr){
        super();
        this.cd=cd;
        this.cr=cr;
    }
    @Override    
    public String toString(){
        return "Hinh Chu Nhat" + "\n Chieu dai: " + this.cd + "\n Chieu rong: " + this.cr +"\n Dien tich: "+dienTich();
    }
    @Override
    public double dienTich(){
       return cd*cr;
    }      
}
class HinhTron extends Hinh {
    private float r;
    public HinhTron(){
        super();
    }
    public HinhTron(float r){
        super();
        this.r=r;
    }
    @Override
    public String toString(){
        return "Hinh Tron" + "\n Ban kinh " + this.r +"\n Dien tich: "+ dienTich();
    }
    @Override
    public double dienTich(){
        return 3.14*r*r;
    }    
}  
class DanhsachHinh{
    private ArrayList<Hinh> danhsach;
    public DanhsachHinh(){
        super();
    danhsach= new ArrayList<Hinh>();
    danhsach.add(new HinhChuNhat(24, 12));
    danhsach.add(new HinhTron(27));
}
    public void themHinh(Hinh hinh){
        danhsach.add(hinh);
    }
    public void indanhsach(){
        for (int i=0; i< danhsach.size();i++){
            System.out.println(danhsach.get(i).toString());
    }
}
}
public class Bai2{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        DanhsachHinh dsh= new DanhsachHinh();
        int luachon=0;
        do{
            System.out.println("____MENU____");
            System.out.println("Chon chuc nang:");
            System.out.println(
            "1.Them Hinh\n" +
            "2.In danh sach\n" +
            "0.Thoat chuong trinh");
            luachon=sc.nextInt();
            sc.nextLine();
            if(luachon==1){
                System.out.println("Nhap ten hinh: "); 
                String tenHinh= sc.nextLine();
                System.out.println("Them hinh thanh cong");
                dsh.themHinh(null);
            }else if (luachon==2){
                dsh.indanhsach();
            }
        } while(luachon!=0);
    }
}
