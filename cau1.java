class ChuyenXe{
public void Masochuyen(){

		System.out.println("So Chuyen xe la : ");
	}

	public void HoTenTaiXe(){

		System.out.println("Ho Ten Tai Xe cua moi chuyen xe :");

	}

	public void SoXe(){
		System.out.println("So cua moi loai xe la : ");

	}

	public void doanhthu(){

		System.out.println("Doanh thu cua moi chuyen xe la :");
	}
}

class ChuyenXeNoiThanh extends ChuyenXe{
   
	public void soTuyen(){

		System.out.println("71 ,Ben tre");
	}

	public void Sokm(){

		System.out.println("So km can di la 30km !");

	}
 @Override
	public void doanhthu(){

		System.out.println(" Doanh thu cua chuyen xe noi thanh la 300000");
	}
	
}

class ChuyenXeNgoaiThanh extends ChuyenXe{
	


	public void NoiDen(){

		System.out.println("ben tre-ba tri ");

	}

	public void SoNgay(){

		System.out.println("tam 2 tieng");
	}
	 @Override 
	public void doanhthu(){

		System.out.println(" Doanh thu cua chuyen xe ngoai thanh la : 10.000.000 !");
	}
}

public class cau1{
	public static void main(String[] args) {
		
		ChuyenXe cx = new ChuyenXe();
	
	System.out.println("===thong tin chuyen xe Noi Thanh=== ");

		ChuyenXeNoiThanh cxt = new ChuyenXeNoiThanh();
		cxt.soTuyen();
		cxt.Sokm();
		cx = new ChuyenXeNoiThanh();
		cx.doanhthu();

System.out.println("=== Thong tin chuyen xe Ngoai Thanh ===");
		ChuyenXeNgoaiThanh cxn = new ChuyenXeNgoaiThanh();
		cxn.NoiDen();
		cxn.SoNgay();
		cx = new ChuyenXeNgoaiThanh();
		cx.doanhthu(); 

	}
}