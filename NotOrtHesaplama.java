package ilk;

import java.util.Scanner;
public class NotOrtHesaplama {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int quiz,vize,ffinal ;
		double ort;
		
		System.out.println("Quiz Notunuzu Giriniz: ");
		quiz =input.nextInt();
		System.out.println("Vize Notunuzu Giriniz: ");
		vize=input.nextInt();
		System.out.println("Final Notunuzu Giriniz: ");
		ffinal=input.nextInt();
		
		ort = (quiz*0.2) +(vize*0.35)+(ffinal*0.45) ;
		System.out.println("Not Ortalamanız: "+ ort);
		String sonuc = (ort >= 50) ? "Geçtiniz" : "Kaldınız";
		System.out.println(sonuc);
		
		
		

	}

}
